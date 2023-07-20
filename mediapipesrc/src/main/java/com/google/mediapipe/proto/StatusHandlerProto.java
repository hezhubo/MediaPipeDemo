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

public final class StatusHandlerProto {
    private StatusHandlerProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class StatusHandlerConfig extends GeneratedMessageLite<StatusHandlerConfig, StatusHandlerConfig.Builder> implements StatusHandlerConfigOrBuilder {
        private int bitField0_;
        public static final int STATUS_HANDLER_FIELD_NUMBER = 1;
        private String statusHandler_ = "";
        public static final int INPUT_SIDE_PACKET_FIELD_NUMBER = 2;
        private ProtobufList<String> inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        public static final int EXTERNAL_INPUT_FIELD_NUMBER = 1002;
        private ProtobufList<String> externalInput_ = GeneratedMessageLite.emptyProtobufList();
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private MediaPipeOptions options_;
        private byte memoizedIsInitialized = 2;
        private static final StatusHandlerConfig DEFAULT_INSTANCE;
        private static volatile Parser<StatusHandlerConfig> PARSER;

        private StatusHandlerConfig() {
        }

        public boolean hasStatusHandler() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getStatusHandler() {
            return this.statusHandler_;
        }

        public ByteString getStatusHandlerBytes() {
            return ByteString.copyFromUtf8(this.statusHandler_);
        }

        private void setStatusHandler(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 1;
            this.statusHandler_ = value;
        }

        private void clearStatusHandler() {
            this.bitField0_ &= -2;
            this.statusHandler_ = getDefaultInstance().getStatusHandler();
        }

        private void setStatusHandlerBytes(ByteString value) {
            this.statusHandler_ = value.toStringUtf8();
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

        public List<String> getExternalInputList() {
            return this.externalInput_;
        }

        public int getExternalInputCount() {
            return this.externalInput_.size();
        }

        public String getExternalInput(int index) {
            return (String)this.externalInput_.get(index);
        }

        public ByteString getExternalInputBytes(int index) {
            return ByteString.copyFromUtf8((String)this.externalInput_.get(index));
        }

        private void ensureExternalInputIsMutable() {
            ProtobufList<String> tmp = this.externalInput_;
            if (!tmp.isModifiable()) {
                this.externalInput_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setExternalInput(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureExternalInputIsMutable();
            this.externalInput_.set(index, value);
        }

        private void addExternalInput(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureExternalInputIsMutable();
            this.externalInput_.add(value);
        }

        private void addAllExternalInput(Iterable<String> values) {
            this.ensureExternalInputIsMutable();
            AbstractMessageLite.addAll(values, this.externalInput_);
        }

        private void clearExternalInput() {
            this.externalInput_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addExternalInputBytes(ByteString value) {
            this.ensureExternalInputIsMutable();
            this.externalInput_.add(value.toStringUtf8());
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

        public static StatusHandlerConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StatusHandlerConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatusHandlerConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StatusHandlerConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatusHandlerConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StatusHandlerConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatusHandlerConfig parseFrom(InputStream input) throws IOException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StatusHandlerConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StatusHandlerConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (StatusHandlerConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static StatusHandlerConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatusHandlerConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StatusHandlerConfig parseFrom(CodedInputStream input) throws IOException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StatusHandlerConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatusHandlerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(StatusHandlerConfig prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new StatusHandlerConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "statusHandler_", "inputSidePacket_", "options_", "externalInput_"};
                    String info = "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0001Ϫ\u001a";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<StatusHandlerConfig> parser = PARSER;
                    if (parser == null) {
                        Class var5 = StatusHandlerConfig.class;
                        synchronized(StatusHandlerConfig.class) {
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

        public static StatusHandlerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<StatusHandlerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            StatusHandlerConfig defaultInstance = new StatusHandlerConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(StatusHandlerConfig.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StatusHandlerConfig, Builder> implements StatusHandlerConfigOrBuilder {
            private Builder() {
                super(StatusHandlerConfig.DEFAULT_INSTANCE);
            }

            public boolean hasStatusHandler() {
                return ((StatusHandlerConfig)this.instance).hasStatusHandler();
            }

            public String getStatusHandler() {
                return ((StatusHandlerConfig)this.instance).getStatusHandler();
            }

            public ByteString getStatusHandlerBytes() {
                return ((StatusHandlerConfig)this.instance).getStatusHandlerBytes();
            }

            public Builder setStatusHandler(String value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).setStatusHandler(value);
                return this;
            }

            public Builder clearStatusHandler() {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).clearStatusHandler();
                return this;
            }

            public Builder setStatusHandlerBytes(ByteString value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).setStatusHandlerBytes(value);
                return this;
            }

            public List<String> getInputSidePacketList() {
                return Collections.unmodifiableList(((StatusHandlerConfig)this.instance).getInputSidePacketList());
            }

            public int getInputSidePacketCount() {
                return ((StatusHandlerConfig)this.instance).getInputSidePacketCount();
            }

            public String getInputSidePacket(int index) {
                return ((StatusHandlerConfig)this.instance).getInputSidePacket(index);
            }

            public ByteString getInputSidePacketBytes(int index) {
                return ((StatusHandlerConfig)this.instance).getInputSidePacketBytes(index);
            }

            public Builder setInputSidePacket(int index, String value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).setInputSidePacket(index, value);
                return this;
            }

            public Builder addInputSidePacket(String value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).addInputSidePacket(value);
                return this;
            }

            public Builder addAllInputSidePacket(Iterable<String> values) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).addAllInputSidePacket(values);
                return this;
            }

            public Builder clearInputSidePacket() {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).clearInputSidePacket();
                return this;
            }

            public Builder addInputSidePacketBytes(ByteString value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).addInputSidePacketBytes(value);
                return this;
            }

            public List<String> getExternalInputList() {
                return Collections.unmodifiableList(((StatusHandlerConfig)this.instance).getExternalInputList());
            }

            public int getExternalInputCount() {
                return ((StatusHandlerConfig)this.instance).getExternalInputCount();
            }

            public String getExternalInput(int index) {
                return ((StatusHandlerConfig)this.instance).getExternalInput(index);
            }

            public ByteString getExternalInputBytes(int index) {
                return ((StatusHandlerConfig)this.instance).getExternalInputBytes(index);
            }

            public Builder setExternalInput(int index, String value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).setExternalInput(index, value);
                return this;
            }

            public Builder addExternalInput(String value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).addExternalInput(value);
                return this;
            }

            public Builder addAllExternalInput(Iterable<String> values) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).addAllExternalInput(values);
                return this;
            }

            public Builder clearExternalInput() {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).clearExternalInput();
                return this;
            }

            public Builder addExternalInputBytes(ByteString value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).addExternalInputBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((StatusHandlerConfig)this.instance).hasOptions();
            }

            public MediaPipeOptions getOptions() {
                return ((StatusHandlerConfig)this.instance).getOptions();
            }

            public Builder setOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MediaPipeOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).setOptions((MediaPipeOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((StatusHandlerConfig)this.instance).clearOptions();
                return this;
            }
        }
    }

    public interface StatusHandlerConfigOrBuilder extends MessageLiteOrBuilder {
        boolean hasStatusHandler();

        String getStatusHandler();

        ByteString getStatusHandlerBytes();

        List<String> getInputSidePacketList();

        int getInputSidePacketCount();

        String getInputSidePacket(int index);

        ByteString getInputSidePacketBytes(int index);

        List<String> getExternalInputList();

        int getExternalInputCount();

        String getExternalInput(int index);

        ByteString getExternalInputBytes(int index);

        boolean hasOptions();

        MediaPipeOptions getOptions();
    }
}
