//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.ExtendableBuilder;
import com.google.protobuf.GeneratedMessageLite.ExtendableMessage;
import com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.Internal.ProtobufList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class PacketGeneratorProto {
    private PacketGeneratorProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    /** @deprecated */
    @Deprecated
    public static final class PacketGeneratorConfig extends GeneratedMessageLite<PacketGeneratorConfig, PacketGeneratorConfig.Builder> implements PacketGeneratorConfigOrBuilder {
        private int bitField0_;
        public static final int PACKET_GENERATOR_FIELD_NUMBER = 1;
        private String packetGenerator_ = "";
        public static final int INPUT_SIDE_PACKET_FIELD_NUMBER = 2;
        private ProtobufList<String> inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        public static final int EXTERNAL_INPUT_FIELD_NUMBER = 1002;
        private ProtobufList<String> externalInput_ = GeneratedMessageLite.emptyProtobufList();
        public static final int OUTPUT_SIDE_PACKET_FIELD_NUMBER = 3;
        private ProtobufList<String> outputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        public static final int EXTERNAL_OUTPUT_FIELD_NUMBER = 1003;
        private ProtobufList<String> externalOutput_ = GeneratedMessageLite.emptyProtobufList();
        public static final int OPTIONS_FIELD_NUMBER = 4;
        private PacketGeneratorOptions options_;
        private byte memoizedIsInitialized = 2;
        private static final PacketGeneratorConfig DEFAULT_INSTANCE;
        private static volatile Parser<PacketGeneratorConfig> PARSER;

        private PacketGeneratorConfig() {
        }

        public boolean hasPacketGenerator() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getPacketGenerator() {
            return this.packetGenerator_;
        }

        public ByteString getPacketGeneratorBytes() {
            return ByteString.copyFromUtf8(this.packetGenerator_);
        }

        private void setPacketGenerator(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 1;
            this.packetGenerator_ = value;
        }

        private void clearPacketGenerator() {
            this.bitField0_ &= -2;
            this.packetGenerator_ = getDefaultInstance().getPacketGenerator();
        }

        private void setPacketGeneratorBytes(ByteString value) {
            this.packetGenerator_ = value.toStringUtf8();
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

        public List<String> getOutputSidePacketList() {
            return this.outputSidePacket_;
        }

        public int getOutputSidePacketCount() {
            return this.outputSidePacket_.size();
        }

        public String getOutputSidePacket(int index) {
            return (String)this.outputSidePacket_.get(index);
        }

        public ByteString getOutputSidePacketBytes(int index) {
            return ByteString.copyFromUtf8((String)this.outputSidePacket_.get(index));
        }

        private void ensureOutputSidePacketIsMutable() {
            ProtobufList<String> tmp = this.outputSidePacket_;
            if (!tmp.isModifiable()) {
                this.outputSidePacket_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setOutputSidePacket(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureOutputSidePacketIsMutable();
            this.outputSidePacket_.set(index, value);
        }

        private void addOutputSidePacket(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureOutputSidePacketIsMutable();
            this.outputSidePacket_.add(value);
        }

        private void addAllOutputSidePacket(Iterable<String> values) {
            this.ensureOutputSidePacketIsMutable();
            AbstractMessageLite.addAll(values, this.outputSidePacket_);
        }

        private void clearOutputSidePacket() {
            this.outputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addOutputSidePacketBytes(ByteString value) {
            this.ensureOutputSidePacketIsMutable();
            this.outputSidePacket_.add(value.toStringUtf8());
        }

        public List<String> getExternalOutputList() {
            return this.externalOutput_;
        }

        public int getExternalOutputCount() {
            return this.externalOutput_.size();
        }

        public String getExternalOutput(int index) {
            return (String)this.externalOutput_.get(index);
        }

        public ByteString getExternalOutputBytes(int index) {
            return ByteString.copyFromUtf8((String)this.externalOutput_.get(index));
        }

        private void ensureExternalOutputIsMutable() {
            ProtobufList<String> tmp = this.externalOutput_;
            if (!tmp.isModifiable()) {
                this.externalOutput_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setExternalOutput(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureExternalOutputIsMutable();
            this.externalOutput_.set(index, value);
        }

        private void addExternalOutput(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureExternalOutputIsMutable();
            this.externalOutput_.add(value);
        }

        private void addAllExternalOutput(Iterable<String> values) {
            this.ensureExternalOutputIsMutable();
            AbstractMessageLite.addAll(values, this.externalOutput_);
        }

        private void clearExternalOutput() {
            this.externalOutput_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addExternalOutputBytes(ByteString value) {
            this.ensureExternalOutputIsMutable();
            this.externalOutput_.add(value.toStringUtf8());
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public PacketGeneratorOptions getOptions() {
            return this.options_ == null ? PacketGeneratorOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(PacketGeneratorOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeOptions(PacketGeneratorOptions value) {
            value.getClass();
            if (this.options_ != null && this.options_ != PacketGeneratorOptions.getDefaultInstance()) {
                this.options_ = (PacketGeneratorOptions)((PacketGeneratorOptions.Builder) PacketGeneratorOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.options_ = value;
            }

            this.bitField0_ |= 2;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static PacketGeneratorConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorConfig parseFrom(InputStream input) throws IOException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketGeneratorConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (PacketGeneratorConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketGeneratorConfig parseFrom(CodedInputStream input) throws IOException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PacketGeneratorConfig prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new PacketGeneratorConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "packetGenerator_", "inputSidePacket_", "outputSidePacket_", "options_", "externalInput_", "externalOutput_"};
                    String info = "\u0001\u0006\u0000\u0001\u0001ϫ\u0006\u0000\u0004\u0001\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ᐉ\u0001Ϫ\u001aϫ\u001a";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PacketGeneratorConfig> parser = PARSER;
                    if (parser == null) {
                        Class var5 = PacketGeneratorConfig.class;
                        synchronized(PacketGeneratorConfig.class) {
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

        public static PacketGeneratorConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PacketGeneratorConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            PacketGeneratorConfig defaultInstance = new PacketGeneratorConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(PacketGeneratorConfig.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<PacketGeneratorConfig, Builder> implements PacketGeneratorConfigOrBuilder {
            private Builder() {
                super(PacketGeneratorConfig.DEFAULT_INSTANCE);
            }

            public boolean hasPacketGenerator() {
                return ((PacketGeneratorConfig)this.instance).hasPacketGenerator();
            }

            public String getPacketGenerator() {
                return ((PacketGeneratorConfig)this.instance).getPacketGenerator();
            }

            public ByteString getPacketGeneratorBytes() {
                return ((PacketGeneratorConfig)this.instance).getPacketGeneratorBytes();
            }

            public Builder setPacketGenerator(String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).setPacketGenerator(value);
                return this;
            }

            public Builder clearPacketGenerator() {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).clearPacketGenerator();
                return this;
            }

            public Builder setPacketGeneratorBytes(ByteString value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).setPacketGeneratorBytes(value);
                return this;
            }

            public List<String> getInputSidePacketList() {
                return Collections.unmodifiableList(((PacketGeneratorConfig)this.instance).getInputSidePacketList());
            }

            public int getInputSidePacketCount() {
                return ((PacketGeneratorConfig)this.instance).getInputSidePacketCount();
            }

            public String getInputSidePacket(int index) {
                return ((PacketGeneratorConfig)this.instance).getInputSidePacket(index);
            }

            public ByteString getInputSidePacketBytes(int index) {
                return ((PacketGeneratorConfig)this.instance).getInputSidePacketBytes(index);
            }

            public Builder setInputSidePacket(int index, String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).setInputSidePacket(index, value);
                return this;
            }

            public Builder addInputSidePacket(String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addInputSidePacket(value);
                return this;
            }

            public Builder addAllInputSidePacket(Iterable<String> values) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addAllInputSidePacket(values);
                return this;
            }

            public Builder clearInputSidePacket() {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).clearInputSidePacket();
                return this;
            }

            public Builder addInputSidePacketBytes(ByteString value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addInputSidePacketBytes(value);
                return this;
            }

            public List<String> getExternalInputList() {
                return Collections.unmodifiableList(((PacketGeneratorConfig)this.instance).getExternalInputList());
            }

            public int getExternalInputCount() {
                return ((PacketGeneratorConfig)this.instance).getExternalInputCount();
            }

            public String getExternalInput(int index) {
                return ((PacketGeneratorConfig)this.instance).getExternalInput(index);
            }

            public ByteString getExternalInputBytes(int index) {
                return ((PacketGeneratorConfig)this.instance).getExternalInputBytes(index);
            }

            public Builder setExternalInput(int index, String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).setExternalInput(index, value);
                return this;
            }

            public Builder addExternalInput(String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addExternalInput(value);
                return this;
            }

            public Builder addAllExternalInput(Iterable<String> values) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addAllExternalInput(values);
                return this;
            }

            public Builder clearExternalInput() {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).clearExternalInput();
                return this;
            }

            public Builder addExternalInputBytes(ByteString value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addExternalInputBytes(value);
                return this;
            }

            public List<String> getOutputSidePacketList() {
                return Collections.unmodifiableList(((PacketGeneratorConfig)this.instance).getOutputSidePacketList());
            }

            public int getOutputSidePacketCount() {
                return ((PacketGeneratorConfig)this.instance).getOutputSidePacketCount();
            }

            public String getOutputSidePacket(int index) {
                return ((PacketGeneratorConfig)this.instance).getOutputSidePacket(index);
            }

            public ByteString getOutputSidePacketBytes(int index) {
                return ((PacketGeneratorConfig)this.instance).getOutputSidePacketBytes(index);
            }

            public Builder setOutputSidePacket(int index, String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).setOutputSidePacket(index, value);
                return this;
            }

            public Builder addOutputSidePacket(String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addOutputSidePacket(value);
                return this;
            }

            public Builder addAllOutputSidePacket(Iterable<String> values) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addAllOutputSidePacket(values);
                return this;
            }

            public Builder clearOutputSidePacket() {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).clearOutputSidePacket();
                return this;
            }

            public Builder addOutputSidePacketBytes(ByteString value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addOutputSidePacketBytes(value);
                return this;
            }

            public List<String> getExternalOutputList() {
                return Collections.unmodifiableList(((PacketGeneratorConfig)this.instance).getExternalOutputList());
            }

            public int getExternalOutputCount() {
                return ((PacketGeneratorConfig)this.instance).getExternalOutputCount();
            }

            public String getExternalOutput(int index) {
                return ((PacketGeneratorConfig)this.instance).getExternalOutput(index);
            }

            public ByteString getExternalOutputBytes(int index) {
                return ((PacketGeneratorConfig)this.instance).getExternalOutputBytes(index);
            }

            public Builder setExternalOutput(int index, String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).setExternalOutput(index, value);
                return this;
            }

            public Builder addExternalOutput(String value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addExternalOutput(value);
                return this;
            }

            public Builder addAllExternalOutput(Iterable<String> values) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addAllExternalOutput(values);
                return this;
            }

            public Builder clearExternalOutput() {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).clearExternalOutput();
                return this;
            }

            public Builder addExternalOutputBytes(ByteString value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).addExternalOutputBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((PacketGeneratorConfig)this.instance).hasOptions();
            }

            public PacketGeneratorOptions getOptions() {
                return ((PacketGeneratorConfig)this.instance).getOptions();
            }

            public Builder setOptions(PacketGeneratorOptions value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(PacketGeneratorOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).setOptions((PacketGeneratorOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(PacketGeneratorOptions value) {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((PacketGeneratorConfig)this.instance).clearOptions();
                return this;
            }
        }
    }

    /** @deprecated */
    @Deprecated
    public interface PacketGeneratorConfigOrBuilder extends MessageLiteOrBuilder {
        boolean hasPacketGenerator();

        String getPacketGenerator();

        ByteString getPacketGeneratorBytes();

        List<String> getInputSidePacketList();

        int getInputSidePacketCount();

        String getInputSidePacket(int index);

        ByteString getInputSidePacketBytes(int index);

        List<String> getExternalInputList();

        int getExternalInputCount();

        String getExternalInput(int index);

        ByteString getExternalInputBytes(int index);

        List<String> getOutputSidePacketList();

        int getOutputSidePacketCount();

        String getOutputSidePacket(int index);

        ByteString getOutputSidePacketBytes(int index);

        List<String> getExternalOutputList();

        int getExternalOutputCount();

        String getExternalOutput(int index);

        ByteString getExternalOutputBytes(int index);

        boolean hasOptions();

        PacketGeneratorOptions getOptions();
    }

    /** @deprecated */
    @Deprecated
    public static final class PacketGeneratorOptions extends ExtendableMessage<PacketGeneratorOptions, PacketGeneratorOptions.Builder> implements PacketGeneratorOptionsOrBuilder {
        private int bitField0_;
        public static final int MERGE_FIELDS_FIELD_NUMBER = 1;
        private boolean mergeFields_ = true;
        private byte memoizedIsInitialized = 2;
        private static final PacketGeneratorOptions DEFAULT_INSTANCE;
        private static volatile Parser<PacketGeneratorOptions> PARSER;

        private PacketGeneratorOptions() {
        }

        public boolean hasMergeFields() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean getMergeFields() {
            return this.mergeFields_;
        }

        private void setMergeFields(boolean value) {
            this.bitField0_ |= 1;
            this.mergeFields_ = value;
        }

        private void clearMergeFields() {
            this.bitField0_ &= -2;
            this.mergeFields_ = true;
        }

        public static PacketGeneratorOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorOptions parseFrom(InputStream input) throws IOException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketGeneratorOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (PacketGeneratorOptions)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorOptions)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketGeneratorOptions parseFrom(CodedInputStream input) throws IOException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorOptions)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PacketGeneratorOptions prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new PacketGeneratorOptions();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "mergeFields_"};
                    String info = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PacketGeneratorOptions> parser = PARSER;
                    if (parser == null) {
                        Class var5 = PacketGeneratorOptions.class;
                        synchronized(PacketGeneratorOptions.class) {
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

        public static PacketGeneratorOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PacketGeneratorOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            PacketGeneratorOptions defaultInstance = new PacketGeneratorOptions();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(PacketGeneratorOptions.class, defaultInstance);
        }

        public static final class Builder extends ExtendableBuilder<PacketGeneratorOptions, Builder> implements PacketGeneratorOptionsOrBuilder {
            private Builder() {
                super(PacketGeneratorOptions.DEFAULT_INSTANCE);
            }

            public boolean hasMergeFields() {
                return ((PacketGeneratorOptions)this.instance).hasMergeFields();
            }

            public boolean getMergeFields() {
                return ((PacketGeneratorOptions)this.instance).getMergeFields();
            }

            public Builder setMergeFields(boolean value) {
                this.copyOnWrite();
                ((PacketGeneratorOptions)this.instance).setMergeFields(value);
                return this;
            }

            public Builder clearMergeFields() {
                this.copyOnWrite();
                ((PacketGeneratorOptions)this.instance).clearMergeFields();
                return this;
            }
        }
    }

    /** @deprecated */
    @Deprecated
    public interface PacketGeneratorOptionsOrBuilder extends ExtendableMessageOrBuilder<PacketGeneratorOptions, PacketGeneratorOptions.Builder> {
        boolean hasMergeFields();

        boolean getMergeFields();
    }
}
