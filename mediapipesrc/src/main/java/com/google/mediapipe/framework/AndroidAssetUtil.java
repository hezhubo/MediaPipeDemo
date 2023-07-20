// Copyright 2019 The MediaPipe Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.mediapipe.framework;

import android.content.Context;
import android.content.res.AssetManager;
//import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Helper methods for handling Android assets.
 */
public final class AndroidAssetUtil {
  /**
   * Returns an asset's contents as a byte array. This is meant to be used in combination with
   * {@link Graph#loadBinaryGraph}.
   *
   * @param assetName The name of an asset, same as in {@link AssetManager#open(String)}.
   */
  public static byte[] getAssetBytes(AssetManager assets, String assetName) {
    byte[] assetData;
    try {
      InputStream stream = assets.open(assetName);
      assetData = ByteStreams.toByteArray(stream);
      stream.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return assetData;
  }

  /**
   * Initializes the native asset manager, which is used by native code to access assets directly.
   *
   * <p>Note: When possible, using {@link AssetCache} is preferred for portability, since it does
   * not require any special handling for Android assets on the native code side.
   */
  public static synchronized boolean initializeNativeAssetManager(Context androidContext) {
    return nativeInitializeAssetManager(
        androidContext, androidContext.getCacheDir().getAbsolutePath());
  }

  private static native boolean nativeInitializeAssetManager(
      Context androidContext, String cacheDirPath);

  private AndroidAssetUtil() {}

  private static class ByteStreams {

    private static final int BUFFER_SIZE = 8192;

    /** Max array length on JVM. */
    private static final int MAX_ARRAY_LEN = Integer.MAX_VALUE - 8;

    /** Large enough to never need to expand, given the geometric progression of buffer sizes. */
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

    /**
     * Reads all bytes from an input stream into a byte array. Does not close the stream.
     *
     * @param in the input stream to read from
     * @return a byte array containing all the bytes from the stream
     * @throws IOException if an I/O error occurs
     */
    public static byte[] toByteArray(InputStream in) throws IOException {
      checkNotNull(in);
      return toByteArrayInternal(in, new ArrayDeque<byte[]>(TO_BYTE_ARRAY_DEQUE_SIZE), 0);
    }

    /**
     * Returns a byte array containing the bytes from the buffers already in {@code bufs} (which have
     * a total combined length of {@code totalLen} bytes) followed by all bytes remaining in the given
     * input stream.
     */
    private static byte[] toByteArrayInternal(InputStream in, Deque<byte[]> bufs, int totalLen)
            throws IOException {
      // Starting with an 8k buffer, double the size of each sucessive buffer. Buffers are retained
      // in a deque so that there's no copying between buffers while reading and so all of the bytes
      // in each new allocated buffer are available for reading from the stream.
      for (int bufSize = BUFFER_SIZE;
           totalLen < MAX_ARRAY_LEN;
           bufSize = saturatedCast(bufSize * 2)) {
        byte[] buf = new byte[Math.min(bufSize, MAX_ARRAY_LEN - totalLen)];
        bufs.add(buf);
        int off = 0;
        while (off < buf.length) {
          // always OK to fill buf; its size plus the rest of bufs is never more than MAX_ARRAY_LEN
          int r = in.read(buf, off, buf.length - off);
          if (r == -1) {
            return combineBuffers(bufs, totalLen);
          }
          off += r;
          totalLen += r;
        }
      }

      // read MAX_ARRAY_LEN bytes without seeing end of stream
      if (in.read() == -1) {
        // oh, there's the end of the stream
        return combineBuffers(bufs, MAX_ARRAY_LEN);
      } else {
        throw new OutOfMemoryError("input is too large to fit in a byte array");
      }
    }

    private static byte[] combineBuffers(Deque<byte[]> bufs, int totalLen) {
      byte[] result = new byte[totalLen];
      int remaining = totalLen;
      while (remaining > 0) {
        byte[] buf = bufs.removeFirst();
        int bytesToCopy = Math.min(remaining, buf.length);
        int resultOffset = totalLen - remaining;
        System.arraycopy(buf, 0, result, resultOffset, bytesToCopy);
        remaining -= bytesToCopy;
      }
      return result;
    }

    public static <T> T checkNotNull(T reference) {
      if (reference == null) {
        throw new NullPointerException();
      }
      return reference;
    }

    /**
     * Returns the {@code int} nearest in value to {@code value}.
     *
     * @param value any {@code long} value
     * @return the same value cast to {@code int} if it is in the range of the {@code int} type,
     *     {@link Integer#MAX_VALUE} if it is too large, or {@link Integer#MIN_VALUE} if it is too
     *     small
     */
    public static int saturatedCast(long value) {
      if (value > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (value < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int) value;
    }

  }

}
