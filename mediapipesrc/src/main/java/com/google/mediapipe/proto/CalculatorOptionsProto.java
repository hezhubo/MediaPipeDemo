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

public final class CalculatorOptionsProto {
    private CalculatorOptionsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class CalculatorOptions extends ExtendableMessage<CalculatorOptions, CalculatorOptions.Builder> implements CalculatorOptionsOrBuilder {
        private int bitField0_;
        public static final int MERGE_FIELDS_FIELD_NUMBER = 1;
        private boolean mergeFields_;
        private byte memoizedIsInitialized = 2;
        private static final CalculatorOptions DEFAULT_INSTANCE;
        private static volatile Parser<CalculatorOptions> PARSER;

        private CalculatorOptions() {
        }

        /** @deprecated */
        @Deprecated
        public boolean hasMergeFields() {
            return (this.bitField0_ & 1) != 0;
        }

        /** @deprecated */
        @Deprecated
        public boolean getMergeFields() {
            return this.mergeFields_;
        }

        /** @deprecated */
        private void setMergeFields(boolean value) {
            this.bitField0_ |= 1;
            this.mergeFields_ = value;
        }

        /** @deprecated */
        private void clearMergeFields() {
            this.bitField0_ &= -2;
            this.mergeFields_ = false;
        }

        public static CalculatorOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorOptions parseFrom(InputStream input) throws IOException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (CalculatorOptions)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorOptions)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorOptions parseFrom(CodedInputStream input) throws IOException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CalculatorOptions prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new CalculatorOptions();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "mergeFields_"};
                    String info = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CalculatorOptions> parser = PARSER;
                    if (parser == null) {
                        Class var5 = CalculatorOptions.class;
                        synchronized(CalculatorOptions.class) {
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

        public static CalculatorOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CalculatorOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            CalculatorOptions defaultInstance = new CalculatorOptions();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(CalculatorOptions.class, defaultInstance);
        }

        public static final class Builder extends ExtendableBuilder<CalculatorOptions, Builder> implements CalculatorOptionsOrBuilder {
            private Builder() {
                super(CalculatorOptions.DEFAULT_INSTANCE);
            }

            /** @deprecated */
            @Deprecated
            public boolean hasMergeFields() {
                return ((CalculatorOptions)this.instance).hasMergeFields();
            }

            /** @deprecated */
            @Deprecated
            public boolean getMergeFields() {
                return ((CalculatorOptions)this.instance).getMergeFields();
            }

            /** @deprecated */
            @Deprecated
            public Builder setMergeFields(boolean value) {
                this.copyOnWrite();
                ((CalculatorOptions)this.instance).setMergeFields(value);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder clearMergeFields() {
                this.copyOnWrite();
                ((CalculatorOptions)this.instance).clearMergeFields();
                return this;
            }
        }
    }

    public interface CalculatorOptionsOrBuilder extends ExtendableMessageOrBuilder<CalculatorOptions, CalculatorOptions.Builder> {
        /** @deprecated */
        @Deprecated
        boolean hasMergeFields();

        /** @deprecated */
        @Deprecated
        boolean getMergeFields();
    }
}
