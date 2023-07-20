//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.proto;

import com.google.mediapipe.proto.MediaPipeOptionsProto.MediaPipeOptions;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.Internal.ProtobufList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class StreamHandlerProto {
    private StreamHandlerProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class OutputStreamHandlerConfig extends GeneratedMessageLite<OutputStreamHandlerConfig, OutputStreamHandlerConfig.Builder> implements OutputStreamHandlerConfigOrBuilder {
        private int bitField0_;
        public static final int OUTPUT_STREAM_HANDLER_FIELD_NUMBER = 1;
        private String outputStreamHandler_ = "InOrderOutputStreamHandler";
        public static final int INPUT_SIDE_PACKET_FIELD_NUMBER = 2;
        private ProtobufList<String> inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private MediaPipeOptions options_;
        private byte memoizedIsInitialized = 2;
        private static final OutputStreamHandlerConfig DEFAULT_INSTANCE;
        private static volatile Parser<OutputStreamHandlerConfig> PARSER;

        private OutputStreamHandlerConfig() {
        }

        public boolean hasOutputStreamHandler() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getOutputStreamHandler() {
            return this.outputStreamHandler_;
        }

        public ByteString getOutputStreamHandlerBytes() {
            return ByteString.copyFromUtf8(this.outputStreamHandler_);
        }

        private void setOutputStreamHandler(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 1;
            this.outputStreamHandler_ = value;
        }

        private void clearOutputStreamHandler() {
            this.bitField0_ &= -2;
            this.outputStreamHandler_ = getDefaultInstance().getOutputStreamHandler();
        }

        private void setOutputStreamHandlerBytes(ByteString value) {
            this.outputStreamHandler_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public List<String> getInputSidePacketList() {
            return this.inputSidePacket_;
        }

        public int getInputSidePacketCount() {
            return this.inputSidePacket_.size();
        }

        public String getInputSidePacket(int index) {
            return (String)this.inputSidePacket_.get(index);
        }

        public ByteString getInputSidePacketBytes(int index) {
            return ByteString.copyFromUtf8((String)this.inputSidePacket_.get(index));
        }

        private void ensureInputSidePacketIsMutable() {
            ProtobufList<String> tmp = this.inputSidePacket_;
            if (!tmp.isModifiable()) {
                this.inputSidePacket_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setInputSidePacket(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureInputSidePacketIsMutable();
            this.inputSidePacket_.set(index, value);
        }

        private void addInputSidePacket(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureInputSidePacketIsMutable();
            this.inputSidePacket_.add(value);
        }

        private void addAllInputSidePacket(Iterable<String> values) {
            this.ensureInputSidePacketIsMutable();
            AbstractMessageLite.addAll(values, this.inputSidePacket_);
        }

        private void clearInputSidePacket() {
            this.inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addInputSidePacketBytes(ByteString value) {
            this.ensureInputSidePacketIsMutable();
            this.inputSidePacket_.add(value.toStringUtf8());
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public MediaPipeOptions getOptions() {
            return this.options_ == null ? MediaPipeOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(MediaPipeOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeOptions(MediaPipeOptions value) {
            value.getClass();
            if (this.options_ != null && this.options_ != MediaPipeOptions.getDefaultInstance()) {
                this.options_ = (MediaPipeOptions)((MediaPipeOptions.Builder)MediaPipeOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            } else {
                this.options_ = value;
            }

            this.bitField0_ |= 2;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static OutputStreamHandlerConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OutputStreamHandlerConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OutputStreamHandlerConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OutputStreamHandlerConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseFrom(InputStream input) throws IOException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OutputStreamHandlerConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (OutputStreamHandlerConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static OutputStreamHandlerConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutputStreamHandlerConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseFrom(CodedInputStream input) throws IOException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OutputStreamHandlerConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(OutputStreamHandlerConfig prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new OutputStreamHandlerConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "outputStreamHandler_", "inputSidePacket_", "options_"};
                    String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<OutputStreamHandlerConfig> parser = PARSER;
                    if (parser == null) {
                        Class var5 = OutputStreamHandlerConfig.class;
                        synchronized(OutputStreamHandlerConfig.class) {
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

        public static OutputStreamHandlerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<OutputStreamHandlerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            OutputStreamHandlerConfig defaultInstance = new OutputStreamHandlerConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(OutputStreamHandlerConfig.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<OutputStreamHandlerConfig, Builder> implements OutputStreamHandlerConfigOrBuilder {
            private Builder() {
                super(OutputStreamHandlerConfig.DEFAULT_INSTANCE);
            }

            public boolean hasOutputStreamHandler() {
                return ((OutputStreamHandlerConfig)this.instance).hasOutputStreamHandler();
            }

            public String getOutputStreamHandler() {
                return ((OutputStreamHandlerConfig)this.instance).getOutputStreamHandler();
            }

            public ByteString getOutputStreamHandlerBytes() {
                return ((OutputStreamHandlerConfig)this.instance).getOutputStreamHandlerBytes();
            }

            public Builder setOutputStreamHandler(String value) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).setOutputStreamHandler(value);
                return this;
            }

            public Builder clearOutputStreamHandler() {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).clearOutputStreamHandler();
                return this;
            }

            public Builder setOutputStreamHandlerBytes(ByteString value) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).setOutputStreamHandlerBytes(value);
                return this;
            }

            public List<String> getInputSidePacketList() {
                return Collections.unmodifiableList(((OutputStreamHandlerConfig)this.instance).getInputSidePacketList());
            }

            public int getInputSidePacketCount() {
                return ((OutputStreamHandlerConfig)this.instance).getInputSidePacketCount();
            }

            public String getInputSidePacket(int index) {
                return ((OutputStreamHandlerConfig)this.instance).getInputSidePacket(index);
            }

            public ByteString getInputSidePacketBytes(int index) {
                return ((OutputStreamHandlerConfig)this.instance).getInputSidePacketBytes(index);
            }

            public Builder setInputSidePacket(int index, String value) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).setInputSidePacket(index, value);
                return this;
            }

            public Builder addInputSidePacket(String value) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).addInputSidePacket(value);
                return this;
            }

            public Builder addAllInputSidePacket(Iterable<String> values) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).addAllInputSidePacket(values);
                return this;
            }

            public Builder clearInputSidePacket() {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).clearInputSidePacket();
                return this;
            }

            public Builder addInputSidePacketBytes(ByteString value) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).addInputSidePacketBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((OutputStreamHandlerConfig)this.instance).hasOptions();
            }

            public MediaPipeOptions getOptions() {
                return ((OutputStreamHandlerConfig)this.instance).getOptions();
            }

            public Builder setOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MediaPipeOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).setOptions((MediaPipeOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((OutputStreamHandlerConfig)this.instance).clearOptions();
                return this;
            }
        }
    }

    public interface OutputStreamHandlerConfigOrBuilder extends MessageLiteOrBuilder {
        boolean hasOutputStreamHandler();

        String getOutputStreamHandler();

        ByteString getOutputStreamHandlerBytes();

        List<String> getInputSidePacketList();

        int getInputSidePacketCount();

        String getInputSidePacket(int index);

        ByteString getInputSidePacketBytes(int index);

        boolean hasOptions();

        MediaPipeOptions getOptions();
    }

    public static final class InputStreamHandlerConfig extends GeneratedMessageLite<InputStreamHandlerConfig, InputStreamHandlerConfig.Builder> implements InputStreamHandlerConfigOrBuilder {
        private int bitField0_;
        public static final int INPUT_STREAM_HANDLER_FIELD_NUMBER = 1;
        private String inputStreamHandler_ = "DefaultInputStreamHandler";
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private MediaPipeOptions options_;
        private byte memoizedIsInitialized = 2;
        private static final InputStreamHandlerConfig DEFAULT_INSTANCE;
        private static volatile Parser<InputStreamHandlerConfig> PARSER;

        private InputStreamHandlerConfig() {
        }

        public boolean hasInputStreamHandler() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getInputStreamHandler() {
            return this.inputStreamHandler_;
        }

        public ByteString getInputStreamHandlerBytes() {
            return ByteString.copyFromUtf8(this.inputStreamHandler_);
        }

        private void setInputStreamHandler(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 1;
            this.inputStreamHandler_ = value;
        }

        private void clearInputStreamHandler() {
            this.bitField0_ &= -2;
            this.inputStreamHandler_ = getDefaultInstance().getInputStreamHandler();
        }

        private void setInputStreamHandlerBytes(ByteString value) {
            this.inputStreamHandler_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public MediaPipeOptions getOptions() {
            return this.options_ == null ? MediaPipeOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(MediaPipeOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeOptions(MediaPipeOptions value) {
            value.getClass();
            if (this.options_ != null && this.options_ != MediaPipeOptions.getDefaultInstance()) {
                this.options_ = (MediaPipeOptions)((MediaPipeOptions.Builder)MediaPipeOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            } else {
                this.options_ = value;
            }

            this.bitField0_ |= 2;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static InputStreamHandlerConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamHandlerConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamHandlerConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamHandlerConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseFrom(InputStream input) throws IOException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamHandlerConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (InputStreamHandlerConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamHandlerConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamHandlerConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseFrom(CodedInputStream input) throws IOException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamHandlerConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InputStreamHandlerConfig prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new InputStreamHandlerConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "inputStreamHandler_", "options_"};
                    String info = "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<InputStreamHandlerConfig> parser = PARSER;
                    if (parser == null) {
                        Class var5 = InputStreamHandlerConfig.class;
                        synchronized(InputStreamHandlerConfig.class) {
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

        public static InputStreamHandlerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<InputStreamHandlerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            InputStreamHandlerConfig defaultInstance = new InputStreamHandlerConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(InputStreamHandlerConfig.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<InputStreamHandlerConfig, Builder> implements InputStreamHandlerConfigOrBuilder {
            private Builder() {
                super(InputStreamHandlerConfig.DEFAULT_INSTANCE);
            }

            public boolean hasInputStreamHandler() {
                return ((InputStreamHandlerConfig)this.instance).hasInputStreamHandler();
            }

            public String getInputStreamHandler() {
                return ((InputStreamHandlerConfig)this.instance).getInputStreamHandler();
            }

            public ByteString getInputStreamHandlerBytes() {
                return ((InputStreamHandlerConfig)this.instance).getInputStreamHandlerBytes();
            }

            public Builder setInputStreamHandler(String value) {
                this.copyOnWrite();
                ((InputStreamHandlerConfig)this.instance).setInputStreamHandler(value);
                return this;
            }

            public Builder clearInputStreamHandler() {
                this.copyOnWrite();
                ((InputStreamHandlerConfig)this.instance).clearInputStreamHandler();
                return this;
            }

            public Builder setInputStreamHandlerBytes(ByteString value) {
                this.copyOnWrite();
                ((InputStreamHandlerConfig)this.instance).setInputStreamHandlerBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((InputStreamHandlerConfig)this.instance).hasOptions();
            }

            public MediaPipeOptions getOptions() {
                return ((InputStreamHandlerConfig)this.instance).getOptions();
            }

            public Builder setOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((InputStreamHandlerConfig)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MediaPipeOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((InputStreamHandlerConfig)this.instance).setOptions((MediaPipeOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((InputStreamHandlerConfig)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((InputStreamHandlerConfig)this.instance).clearOptions();
                return this;
            }
        }
    }

    public interface InputStreamHandlerConfigOrBuilder extends MessageLiteOrBuilder {
        boolean hasInputStreamHandler();

        String getInputStreamHandler();

        ByteString getInputStreamHandlerBytes();

        boolean hasOptions();

        MediaPipeOptions getOptions();
    }
}
