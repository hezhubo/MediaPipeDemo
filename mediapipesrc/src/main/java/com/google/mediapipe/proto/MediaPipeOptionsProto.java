//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.ExtendableBuilder;
import com.google.protobuf.GeneratedMessageLite.ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MediaPipeOptionsProto {
    private MediaPipeOptionsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class MediaPipeOptions extends ExtendableMessage<MediaPipeOptions, MediaPipeOptions.Builder> implements MediaPipeOptionsOrBuilder {
        private byte memoizedIsInitialized = 2;
        private static final MediaPipeOptions DEFAULT_INSTANCE;
        private static volatile Parser<MediaPipeOptions> PARSER;

        private MediaPipeOptions() {
        }

        public static MediaPipeOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MediaPipeOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MediaPipeOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MediaPipeOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MediaPipeOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MediaPipeOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MediaPipeOptions parseFrom(InputStream input) throws IOException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MediaPipeOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MediaPipeOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (MediaPipeOptions)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MediaPipeOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MediaPipeOptions)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MediaPipeOptions parseFrom(CodedInputStream input) throws IOException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MediaPipeOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MediaPipeOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MediaPipeOptions prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            Object parser;
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new MediaPipeOptions();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    parser = null;
                    String info = "\u0001\u0000";
                    return newMessageInfo(DEFAULT_INSTANCE, info, (Object[])parser);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    parser = PARSER;
                    if (parser == null) {
                        Class var5 = MediaPipeOptions.class;
                        synchronized(MediaPipeOptions.class) {
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

        public static MediaPipeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MediaPipeOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            MediaPipeOptions defaultInstance = new MediaPipeOptions();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(MediaPipeOptions.class, defaultInstance);
        }

        public static final class Builder extends ExtendableBuilder<MediaPipeOptions, Builder> implements MediaPipeOptionsOrBuilder {
            private Builder() {
                super(MediaPipeOptions.DEFAULT_INSTANCE);
            }
        }
    }

    public interface MediaPipeOptionsOrBuilder extends ExtendableMessageOrBuilder<MediaPipeOptions, MediaPipeOptions.Builder> {
    }
}
