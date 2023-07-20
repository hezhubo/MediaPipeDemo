//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.formats.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RectProto {
    private RectProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class NormalizedRect extends GeneratedMessageLite<NormalizedRect, NormalizedRect.Builder> implements NormalizedRectOrBuilder {
        private int bitField0_;
        public static final int X_CENTER_FIELD_NUMBER = 1;
        private float xCenter_;
        public static final int Y_CENTER_FIELD_NUMBER = 2;
        private float yCenter_;
        public static final int HEIGHT_FIELD_NUMBER = 3;
        private float height_;
        public static final int WIDTH_FIELD_NUMBER = 4;
        private float width_;
        public static final int ROTATION_FIELD_NUMBER = 5;
        private float rotation_;
        public static final int RECT_ID_FIELD_NUMBER = 6;
        private long rectId_;
        private byte memoizedIsInitialized = 2;
        private static final NormalizedRect DEFAULT_INSTANCE;
        private static volatile Parser<NormalizedRect> PARSER;

        private NormalizedRect() {
        }

        public boolean hasXCenter() {
            return (this.bitField0_ & 1) != 0;
        }

        public float getXCenter() {
            return this.xCenter_;
        }

        private void setXCenter(float value) {
            this.bitField0_ |= 1;
            this.xCenter_ = value;
        }

        private void clearXCenter() {
            this.bitField0_ &= -2;
            this.xCenter_ = 0.0F;
        }

        public boolean hasYCenter() {
            return (this.bitField0_ & 2) != 0;
        }

        public float getYCenter() {
            return this.yCenter_;
        }

        private void setYCenter(float value) {
            this.bitField0_ |= 2;
            this.yCenter_ = value;
        }

        private void clearYCenter() {
            this.bitField0_ &= -3;
            this.yCenter_ = 0.0F;
        }

        public boolean hasHeight() {
            return (this.bitField0_ & 4) != 0;
        }

        public float getHeight() {
            return this.height_;
        }

        private void setHeight(float value) {
            this.bitField0_ |= 4;
            this.height_ = value;
        }

        private void clearHeight() {
            this.bitField0_ &= -5;
            this.height_ = 0.0F;
        }

        public boolean hasWidth() {
            return (this.bitField0_ & 8) != 0;
        }

        public float getWidth() {
            return this.width_;
        }

        private void setWidth(float value) {
            this.bitField0_ |= 8;
            this.width_ = value;
        }

        private void clearWidth() {
            this.bitField0_ &= -9;
            this.width_ = 0.0F;
        }

        public boolean hasRotation() {
            return (this.bitField0_ & 16) != 0;
        }

        public float getRotation() {
            return this.rotation_;
        }

        private void setRotation(float value) {
            this.bitField0_ |= 16;
            this.rotation_ = value;
        }

        private void clearRotation() {
            this.bitField0_ &= -17;
            this.rotation_ = 0.0F;
        }

        public boolean hasRectId() {
            return (this.bitField0_ & 32) != 0;
        }

        public long getRectId() {
            return this.rectId_;
        }

        private void setRectId(long value) {
            this.bitField0_ |= 32;
            this.rectId_ = value;
        }

        private void clearRectId() {
            this.bitField0_ &= -33;
            this.rectId_ = 0L;
        }

        public static NormalizedRect parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedRect parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedRect parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedRect parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedRect parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedRect parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedRect parseFrom(InputStream input) throws IOException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedRect parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NormalizedRect parseDelimitedFrom(InputStream input) throws IOException {
            return (NormalizedRect)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedRect parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedRect)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NormalizedRect parseFrom(CodedInputStream input) throws IOException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedRect parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedRect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(NormalizedRect prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new NormalizedRect();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "xCenter_", "yCenter_", "height_", "width_", "rotation_", "rectId_"};
                    String info = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NormalizedRect> parser = PARSER;
                    if (parser == null) {
                        Class var5 = NormalizedRect.class;
                        synchronized(NormalizedRect.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = (Parser)parser;
                            }
                        }
                    }

                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return this.memoizedIsInitialized;
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte)(arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static NormalizedRect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NormalizedRect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            NormalizedRect defaultInstance = new NormalizedRect();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(NormalizedRect.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<NormalizedRect, Builder> implements NormalizedRectOrBuilder {
            private Builder() {
                super(NormalizedRect.DEFAULT_INSTANCE);
            }

            public boolean hasXCenter() {
                return ((NormalizedRect)this.instance).hasXCenter();
            }

            public float getXCenter() {
                return ((NormalizedRect)this.instance).getXCenter();
            }

            public Builder setXCenter(float value) {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).setXCenter(value);
                return this;
            }

            public Builder clearXCenter() {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).clearXCenter();
                return this;
            }

            public boolean hasYCenter() {
                return ((NormalizedRect)this.instance).hasYCenter();
            }

            public float getYCenter() {
                return ((NormalizedRect)this.instance).getYCenter();
            }

            public Builder setYCenter(float value) {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).setYCenter(value);
                return this;
            }

            public Builder clearYCenter() {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).clearYCenter();
                return this;
            }

            public boolean hasHeight() {
                return ((NormalizedRect)this.instance).hasHeight();
            }

            public float getHeight() {
                return ((NormalizedRect)this.instance).getHeight();
            }

            public Builder setHeight(float value) {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).setHeight(value);
                return this;
            }

            public Builder clearHeight() {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).clearHeight();
                return this;
            }

            public boolean hasWidth() {
                return ((NormalizedRect)this.instance).hasWidth();
            }

            public float getWidth() {
                return ((NormalizedRect)this.instance).getWidth();
            }

            public Builder setWidth(float value) {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).setWidth(value);
                return this;
            }

            public Builder clearWidth() {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).clearWidth();
                return this;
            }

            public boolean hasRotation() {
                return ((NormalizedRect)this.instance).hasRotation();
            }

            public float getRotation() {
                return ((NormalizedRect)this.instance).getRotation();
            }

            public Builder setRotation(float value) {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).setRotation(value);
                return this;
            }

            public Builder clearRotation() {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).clearRotation();
                return this;
            }

            public boolean hasRectId() {
                return ((NormalizedRect)this.instance).hasRectId();
            }

            public long getRectId() {
                return ((NormalizedRect)this.instance).getRectId();
            }

            public Builder setRectId(long value) {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).setRectId(value);
                return this;
            }

            public Builder clearRectId() {
                this.copyOnWrite();
                ((NormalizedRect)this.instance).clearRectId();
                return this;
            }
        }
    }

    public interface NormalizedRectOrBuilder extends MessageLiteOrBuilder {
        boolean hasXCenter();

        float getXCenter();

        boolean hasYCenter();

        float getYCenter();

        boolean hasHeight();

        float getHeight();

        boolean hasWidth();

        float getWidth();

        boolean hasRotation();

        float getRotation();

        boolean hasRectId();

        long getRectId();
    }

    public static final class Rect extends GeneratedMessageLite<Rect, Rect.Builder> implements RectOrBuilder {
        private int bitField0_;
        public static final int X_CENTER_FIELD_NUMBER = 1;
        private int xCenter_;
        public static final int Y_CENTER_FIELD_NUMBER = 2;
        private int yCenter_;
        public static final int HEIGHT_FIELD_NUMBER = 3;
        private int height_;
        public static final int WIDTH_FIELD_NUMBER = 4;
        private int width_;
        public static final int ROTATION_FIELD_NUMBER = 5;
        private float rotation_;
        public static final int RECT_ID_FIELD_NUMBER = 6;
        private long rectId_;
        private byte memoizedIsInitialized = 2;
        private static final Rect DEFAULT_INSTANCE;
        private static volatile Parser<Rect> PARSER;

        private Rect() {
        }

        public boolean hasXCenter() {
            return (this.bitField0_ & 1) != 0;
        }

        public int getXCenter() {
            return this.xCenter_;
        }

        private void setXCenter(int value) {
            this.bitField0_ |= 1;
            this.xCenter_ = value;
        }

        private void clearXCenter() {
            this.bitField0_ &= -2;
            this.xCenter_ = 0;
        }

        public boolean hasYCenter() {
            return (this.bitField0_ & 2) != 0;
        }

        public int getYCenter() {
            return this.yCenter_;
        }

        private void setYCenter(int value) {
            this.bitField0_ |= 2;
            this.yCenter_ = value;
        }

        private void clearYCenter() {
            this.bitField0_ &= -3;
            this.yCenter_ = 0;
        }

        public boolean hasHeight() {
            return (this.bitField0_ & 4) != 0;
        }

        public int getHeight() {
            return this.height_;
        }

        private void setHeight(int value) {
            this.bitField0_ |= 4;
            this.height_ = value;
        }

        private void clearHeight() {
            this.bitField0_ &= -5;
            this.height_ = 0;
        }

        public boolean hasWidth() {
            return (this.bitField0_ & 8) != 0;
        }

        public int getWidth() {
            return this.width_;
        }

        private void setWidth(int value) {
            this.bitField0_ |= 8;
            this.width_ = value;
        }

        private void clearWidth() {
            this.bitField0_ &= -9;
            this.width_ = 0;
        }

        public boolean hasRotation() {
            return (this.bitField0_ & 16) != 0;
        }

        public float getRotation() {
            return this.rotation_;
        }

        private void setRotation(float value) {
            this.bitField0_ |= 16;
            this.rotation_ = value;
        }

        private void clearRotation() {
            this.bitField0_ &= -17;
            this.rotation_ = 0.0F;
        }

        public boolean hasRectId() {
            return (this.bitField0_ & 32) != 0;
        }

        public long getRectId() {
            return this.rectId_;
        }

        private void setRectId(long value) {
            this.bitField0_ |= 32;
            this.rectId_ = value;
        }

        private void clearRectId() {
            this.bitField0_ &= -33;
            this.rectId_ = 0L;
        }

        public static Rect parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Rect parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Rect parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Rect parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Rect parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Rect parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Rect parseFrom(InputStream input) throws IOException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Rect parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Rect parseDelimitedFrom(InputStream input) throws IOException {
            return (Rect)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Rect parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Rect)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Rect parseFrom(CodedInputStream input) throws IOException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Rect parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Rect)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Rect prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Rect();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "xCenter_", "yCenter_", "height_", "width_", "rotation_", "rectId_"};
                    String info = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004\u0006ဂ\u0005";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Rect> parser = PARSER;
                    if (parser == null) {
                        Class var5 = Rect.class;
                        synchronized(Rect.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = (Parser)parser;
                            }
                        }
                    }

                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return this.memoizedIsInitialized;
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte)(arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static Rect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Rect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            Rect defaultInstance = new Rect();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Rect.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Rect, Builder> implements RectOrBuilder {
            private Builder() {
                super(Rect.DEFAULT_INSTANCE);
            }

            public boolean hasXCenter() {
                return ((Rect)this.instance).hasXCenter();
            }

            public int getXCenter() {
                return ((Rect)this.instance).getXCenter();
            }

            public Builder setXCenter(int value) {
                this.copyOnWrite();
                ((Rect)this.instance).setXCenter(value);
                return this;
            }

            public Builder clearXCenter() {
                this.copyOnWrite();
                ((Rect)this.instance).clearXCenter();
                return this;
            }

            public boolean hasYCenter() {
                return ((Rect)this.instance).hasYCenter();
            }

            public int getYCenter() {
                return ((Rect)this.instance).getYCenter();
            }

            public Builder setYCenter(int value) {
                this.copyOnWrite();
                ((Rect)this.instance).setYCenter(value);
                return this;
            }

            public Builder clearYCenter() {
                this.copyOnWrite();
                ((Rect)this.instance).clearYCenter();
                return this;
            }

            public boolean hasHeight() {
                return ((Rect)this.instance).hasHeight();
            }

            public int getHeight() {
                return ((Rect)this.instance).getHeight();
            }

            public Builder setHeight(int value) {
                this.copyOnWrite();
                ((Rect)this.instance).setHeight(value);
                return this;
            }

            public Builder clearHeight() {
                this.copyOnWrite();
                ((Rect)this.instance).clearHeight();
                return this;
            }

            public boolean hasWidth() {
                return ((Rect)this.instance).hasWidth();
            }

            public int getWidth() {
                return ((Rect)this.instance).getWidth();
            }

            public Builder setWidth(int value) {
                this.copyOnWrite();
                ((Rect)this.instance).setWidth(value);
                return this;
            }

            public Builder clearWidth() {
                this.copyOnWrite();
                ((Rect)this.instance).clearWidth();
                return this;
            }

            public boolean hasRotation() {
                return ((Rect)this.instance).hasRotation();
            }

            public float getRotation() {
                return ((Rect)this.instance).getRotation();
            }

            public Builder setRotation(float value) {
                this.copyOnWrite();
                ((Rect)this.instance).setRotation(value);
                return this;
            }

            public Builder clearRotation() {
                this.copyOnWrite();
                ((Rect)this.instance).clearRotation();
                return this;
            }

            public boolean hasRectId() {
                return ((Rect)this.instance).hasRectId();
            }

            public long getRectId() {
                return ((Rect)this.instance).getRectId();
            }

            public Builder setRectId(long value) {
                this.copyOnWrite();
                ((Rect)this.instance).setRectId(value);
                return this;
            }

            public Builder clearRectId() {
                this.copyOnWrite();
                ((Rect)this.instance).clearRectId();
                return this;
            }
        }
    }

    public interface RectOrBuilder extends MessageLiteOrBuilder {
        boolean hasXCenter();

        int getXCenter();

        boolean hasYCenter();

        int getYCenter();

        boolean hasHeight();

        int getHeight();

        boolean hasWidth();

        int getWidth();

        boolean hasRotation();

        float getRotation();

        boolean hasRectId();

        long getRectId();
    }
}
