package com.hezb.mediapipe.selfiesegmentation;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

import com.google.mediapipe.components.ExternalTextureConverter;
import com.google.mediapipe.components.FrameProcessor;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.mediapipe.glutil.EglManager;

public class MediaPipeHelper {

    static {
        // Load all native libraries needed by the app.
        System.loadLibrary("mediapipe_jni");
        System.loadLibrary("opencv_java3");
    }

    // Creates and manages an {@link EGLContext}.
    private final EglManager eglManager;

    // Sends camera-preview frames into a MediaPipe graph for processing, and displays the processed
    // frames onto a {@link Surface}.
    private final FrameProcessor processor;

    // Converts the GL_TEXTURE_EXTERNAL_OES texture from Android camera into a regular texture to be
    // consumed by {@link FrameProcessor} and the underlying MediaPipe graph.
    private ExternalTextureConverter converter;

    public MediaPipeHelper(Context context, String binaryGraph, String input, String output) {
        // Initialize asset manager so that MediaPipe native libraries can access the app assets, e.g.,
        // binary graphs.
        AndroidAssetUtil.initializeNativeAssetManager(context);

        eglManager = new EglManager(null);

        processor = new FrameProcessor(
                context,
                eglManager.getNativeContext(),
                binaryGraph,
                input,
                output
        );

    }

    public EglManager getEglManager() {
        return eglManager;
    }

    public FrameProcessor getProcessor() {
        return processor;
    }

    public ExternalTextureConverter openConverter() {
        converter = new ExternalTextureConverter(eglManager.getContext());
        converter.setConsumer(processor);
        return converter;
    }

    public void setSurfaceTextureAndAttachToGLContext(SurfaceTexture texture, int width, int height) {
        // Connect the converter to the camera-preview frames as its input (via
        // previewFrameTexture), and configure the output width and height as the computed
        // display size.
        converter.setSurfaceTextureAndAttachToGLContext(texture, width, height);
    }

    public void closeConverter() {
        converter.close();
    }

    public void setProcessorOutput(Surface surface) {
        processor.getVideoSurfaceOutput().setSurface(surface);
    }

}
