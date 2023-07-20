//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.proto;

import com.google.mediapipe.proto.CalculatorOptionsProto.CalculatorOptions;
import com.google.mediapipe.proto.MediaPipeOptionsProto.MediaPipeOptions;
import com.google.mediapipe.proto.PacketFactoryProto.PacketFactoryConfig;
import com.google.mediapipe.proto.PacketFactoryProto.PacketFactoryConfigOrBuilder;
import com.google.mediapipe.proto.PacketGeneratorProto.PacketGeneratorConfig;
import com.google.mediapipe.proto.PacketGeneratorProto.PacketGeneratorConfigOrBuilder;
import com.google.mediapipe.proto.StatusHandlerProto.StatusHandlerConfig;
import com.google.mediapipe.proto.StatusHandlerProto.StatusHandlerConfigOrBuilder;
import com.google.mediapipe.proto.StreamHandlerProto.InputStreamHandlerConfig;
import com.google.mediapipe.proto.StreamHandlerProto.OutputStreamHandlerConfig;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.Internal.IntList;
import com.google.protobuf.Internal.ProtobufList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class CalculatorProto {
    private CalculatorProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class CalculatorGraphConfig extends GeneratedMessageLite<CalculatorGraphConfig, CalculatorGraphConfig.Builder> implements CalculatorGraphConfigOrBuilder {
        public static final int NODE_FIELD_NUMBER = 1;
        private ProtobufList<Node> node_ = emptyProtobufList();
        public static final int PACKET_FACTORY_FIELD_NUMBER = 6;
        private ProtobufList<PacketFactoryConfig> packetFactory_ = emptyProtobufList();
        public static final int PACKET_GENERATOR_FIELD_NUMBER = 7;
        private ProtobufList<PacketGeneratorConfig> packetGenerator_ = emptyProtobufList();
        public static final int NUM_THREADS_FIELD_NUMBER = 8;
        private int numThreads_;
        public static final int STATUS_HANDLER_FIELD_NUMBER = 9;
        private ProtobufList<StatusHandlerConfig> statusHandler_ = emptyProtobufList();
        public static final int INPUT_STREAM_FIELD_NUMBER = 10;
        private ProtobufList<String> inputStream_ = GeneratedMessageLite.emptyProtobufList();
        public static final int OUTPUT_STREAM_FIELD_NUMBER = 15;
        private ProtobufList<String> outputStream_ = GeneratedMessageLite.emptyProtobufList();
        public static final int INPUT_SIDE_PACKET_FIELD_NUMBER = 16;
        private ProtobufList<String> inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        public static final int OUTPUT_SIDE_PACKET_FIELD_NUMBER = 17;
        private ProtobufList<String> outputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        public static final int MAX_QUEUE_SIZE_FIELD_NUMBER = 11;
        private int maxQueueSize_;
        public static final int REPORT_DEADLOCK_FIELD_NUMBER = 21;
        private boolean reportDeadlock_;
        public static final int INPUT_STREAM_HANDLER_FIELD_NUMBER = 12;
        private InputStreamHandlerConfig inputStreamHandler_;
        public static final int OUTPUT_STREAM_HANDLER_FIELD_NUMBER = 13;
        private OutputStreamHandlerConfig outputStreamHandler_;
        public static final int EXECUTOR_FIELD_NUMBER = 14;
        private ProtobufList<ExecutorConfig> executor_ = emptyProtobufList();
        public static final int PROFILER_CONFIG_FIELD_NUMBER = 18;
        private ProfilerConfig profilerConfig_;
        public static final int PACKAGE_FIELD_NUMBER = 19;
        private String package_ = "";
        public static final int TYPE_FIELD_NUMBER = 20;
        private String type_ = "";
        public static final int OPTIONS_FIELD_NUMBER = 1001;
        private MediaPipeOptions options_;
        public static final int GRAPH_OPTIONS_FIELD_NUMBER = 1002;
        private ProtobufList<Any> graphOptions_ = emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private static final CalculatorGraphConfig DEFAULT_INSTANCE;
        private static volatile Parser<CalculatorGraphConfig> PARSER;

        private CalculatorGraphConfig() {
        }

        public List<Node> getNodeList() {
            return this.node_;
        }

        public List<? extends NodeOrBuilder> getNodeOrBuilderList() {
            return this.node_;
        }

        public int getNodeCount() {
            return this.node_.size();
        }

        public Node getNode(int index) {
            return (Node)this.node_.get(index);
        }

        public NodeOrBuilder getNodeOrBuilder(int index) {
            return (NodeOrBuilder)this.node_.get(index);
        }

        private void ensureNodeIsMutable() {
            ProtobufList<Node> tmp = this.node_;
            if (!tmp.isModifiable()) {
                this.node_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setNode(int index, Node value) {
            value.getClass();
            this.ensureNodeIsMutable();
            this.node_.set(index, value);
        }

        private void addNode(Node value) {
            value.getClass();
            this.ensureNodeIsMutable();
            this.node_.add(value);
        }

        private void addNode(int index, Node value) {
            value.getClass();
            this.ensureNodeIsMutable();
            this.node_.add(index, value);
        }

        private void addAllNode(Iterable<? extends Node> values) {
            this.ensureNodeIsMutable();
            AbstractMessageLite.addAll(values, this.node_);
        }

        private void clearNode() {
            this.node_ = emptyProtobufList();
        }

        private void removeNode(int index) {
            this.ensureNodeIsMutable();
            this.node_.remove(index);
        }

        public List<PacketFactoryConfig> getPacketFactoryList() {
            return this.packetFactory_;
        }

        public List<? extends PacketFactoryConfigOrBuilder> getPacketFactoryOrBuilderList() {
            return this.packetFactory_;
        }

        public int getPacketFactoryCount() {
            return this.packetFactory_.size();
        }

        public PacketFactoryConfig getPacketFactory(int index) {
            return (PacketFactoryConfig)this.packetFactory_.get(index);
        }

        public PacketFactoryConfigOrBuilder getPacketFactoryOrBuilder(int index) {
            return (PacketFactoryConfigOrBuilder)this.packetFactory_.get(index);
        }

        private void ensurePacketFactoryIsMutable() {
            ProtobufList<PacketFactoryConfig> tmp = this.packetFactory_;
            if (!tmp.isModifiable()) {
                this.packetFactory_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setPacketFactory(int index, PacketFactoryConfig value) {
            value.getClass();
            this.ensurePacketFactoryIsMutable();
            this.packetFactory_.set(index, value);
        }

        private void addPacketFactory(PacketFactoryConfig value) {
            value.getClass();
            this.ensurePacketFactoryIsMutable();
            this.packetFactory_.add(value);
        }

        private void addPacketFactory(int index, PacketFactoryConfig value) {
            value.getClass();
            this.ensurePacketFactoryIsMutable();
            this.packetFactory_.add(index, value);
        }

        private void addAllPacketFactory(Iterable<? extends PacketFactoryConfig> values) {
            this.ensurePacketFactoryIsMutable();
            AbstractMessageLite.addAll(values, this.packetFactory_);
        }

        private void clearPacketFactory() {
            this.packetFactory_ = emptyProtobufList();
        }

        private void removePacketFactory(int index) {
            this.ensurePacketFactoryIsMutable();
            this.packetFactory_.remove(index);
        }

        /** @deprecated */
        @Deprecated
        public List<PacketGeneratorConfig> getPacketGeneratorList() {
            return this.packetGenerator_;
        }

        /** @deprecated */
        @Deprecated
        public List<? extends PacketGeneratorConfigOrBuilder> getPacketGeneratorOrBuilderList() {
            return this.packetGenerator_;
        }

        /** @deprecated */
        @Deprecated
        public int getPacketGeneratorCount() {
            return this.packetGenerator_.size();
        }

        /** @deprecated */
        @Deprecated
        public PacketGeneratorConfig getPacketGenerator(int index) {
            return (PacketGeneratorConfig)this.packetGenerator_.get(index);
        }

        /** @deprecated */
        @Deprecated
        public PacketGeneratorConfigOrBuilder getPacketGeneratorOrBuilder(int index) {
            return (PacketGeneratorConfigOrBuilder)this.packetGenerator_.get(index);
        }

        private void ensurePacketGeneratorIsMutable() {
            ProtobufList<PacketGeneratorConfig> tmp = this.packetGenerator_;
            if (!tmp.isModifiable()) {
                this.packetGenerator_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setPacketGenerator(int index, PacketGeneratorConfig value) {
            value.getClass();
            this.ensurePacketGeneratorIsMutable();
            this.packetGenerator_.set(index, value);
        }

        private void addPacketGenerator(PacketGeneratorConfig value) {
            value.getClass();
            this.ensurePacketGeneratorIsMutable();
            this.packetGenerator_.add(value);
        }

        private void addPacketGenerator(int index, PacketGeneratorConfig value) {
            value.getClass();
            this.ensurePacketGeneratorIsMutable();
            this.packetGenerator_.add(index, value);
        }

        private void addAllPacketGenerator(Iterable<? extends PacketGeneratorConfig> values) {
            this.ensurePacketGeneratorIsMutable();
            AbstractMessageLite.addAll(values, this.packetGenerator_);
        }

        private void clearPacketGenerator() {
            this.packetGenerator_ = emptyProtobufList();
        }

        private void removePacketGenerator(int index) {
            this.ensurePacketGeneratorIsMutable();
            this.packetGenerator_.remove(index);
        }

        public int getNumThreads() {
            return this.numThreads_;
        }

        private void setNumThreads(int value) {
            this.numThreads_ = value;
        }

        private void clearNumThreads() {
            this.numThreads_ = 0;
        }

        public List<StatusHandlerConfig> getStatusHandlerList() {
            return this.statusHandler_;
        }

        public List<? extends StatusHandlerConfigOrBuilder> getStatusHandlerOrBuilderList() {
            return this.statusHandler_;
        }

        public int getStatusHandlerCount() {
            return this.statusHandler_.size();
        }

        public StatusHandlerConfig getStatusHandler(int index) {
            return (StatusHandlerConfig)this.statusHandler_.get(index);
        }

        public StatusHandlerConfigOrBuilder getStatusHandlerOrBuilder(int index) {
            return (StatusHandlerConfigOrBuilder)this.statusHandler_.get(index);
        }

        private void ensureStatusHandlerIsMutable() {
            ProtobufList<StatusHandlerConfig> tmp = this.statusHandler_;
            if (!tmp.isModifiable()) {
                this.statusHandler_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setStatusHandler(int index, StatusHandlerConfig value) {
            value.getClass();
            this.ensureStatusHandlerIsMutable();
            this.statusHandler_.set(index, value);
        }

        private void addStatusHandler(StatusHandlerConfig value) {
            value.getClass();
            this.ensureStatusHandlerIsMutable();
            this.statusHandler_.add(value);
        }

        private void addStatusHandler(int index, StatusHandlerConfig value) {
            value.getClass();
            this.ensureStatusHandlerIsMutable();
            this.statusHandler_.add(index, value);
        }

        private void addAllStatusHandler(Iterable<? extends StatusHandlerConfig> values) {
            this.ensureStatusHandlerIsMutable();
            AbstractMessageLite.addAll(values, this.statusHandler_);
        }

        private void clearStatusHandler() {
            this.statusHandler_ = emptyProtobufList();
        }

        private void removeStatusHandler(int index) {
            this.ensureStatusHandlerIsMutable();
            this.statusHandler_.remove(index);
        }

        public List<String> getInputStreamList() {
            return this.inputStream_;
        }

        public int getInputStreamCount() {
            return this.inputStream_.size();
        }

        public String getInputStream(int index) {
            return (String)this.inputStream_.get(index);
        }

        public ByteString getInputStreamBytes(int index) {
            return ByteString.copyFromUtf8((String)this.inputStream_.get(index));
        }

        private void ensureInputStreamIsMutable() {
            ProtobufList<String> tmp = this.inputStream_;
            if (!tmp.isModifiable()) {
                this.inputStream_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setInputStream(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureInputStreamIsMutable();
            this.inputStream_.set(index, value);
        }

        private void addInputStream(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureInputStreamIsMutable();
            this.inputStream_.add(value);
        }

        private void addAllInputStream(Iterable<String> values) {
            this.ensureInputStreamIsMutable();
            AbstractMessageLite.addAll(values, this.inputStream_);
        }

        private void clearInputStream() {
            this.inputStream_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addInputStreamBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.ensureInputStreamIsMutable();
            this.inputStream_.add(value.toStringUtf8());
        }

        public List<String> getOutputStreamList() {
            return this.outputStream_;
        }

        public int getOutputStreamCount() {
            return this.outputStream_.size();
        }

        public String getOutputStream(int index) {
            return (String)this.outputStream_.get(index);
        }

        public ByteString getOutputStreamBytes(int index) {
            return ByteString.copyFromUtf8((String)this.outputStream_.get(index));
        }

        private void ensureOutputStreamIsMutable() {
            ProtobufList<String> tmp = this.outputStream_;
            if (!tmp.isModifiable()) {
                this.outputStream_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setOutputStream(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureOutputStreamIsMutable();
            this.outputStream_.set(index, value);
        }

        private void addOutputStream(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureOutputStreamIsMutable();
            this.outputStream_.add(value);
        }

        private void addAllOutputStream(Iterable<String> values) {
            this.ensureOutputStreamIsMutable();
            AbstractMessageLite.addAll(values, this.outputStream_);
        }

        private void clearOutputStream() {
            this.outputStream_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addOutputStreamBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.ensureOutputStreamIsMutable();
            this.outputStream_.add(value.toStringUtf8());
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
            checkByteStringIsUtf8(value);
            this.ensureInputSidePacketIsMutable();
            this.inputSidePacket_.add(value.toStringUtf8());
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
            checkByteStringIsUtf8(value);
            this.ensureOutputSidePacketIsMutable();
            this.outputSidePacket_.add(value.toStringUtf8());
        }

        public int getMaxQueueSize() {
            return this.maxQueueSize_;
        }

        private void setMaxQueueSize(int value) {
            this.maxQueueSize_ = value;
        }

        private void clearMaxQueueSize() {
            this.maxQueueSize_ = 0;
        }

        public boolean getReportDeadlock() {
            return this.reportDeadlock_;
        }

        private void setReportDeadlock(boolean value) {
            this.reportDeadlock_ = value;
        }

        private void clearReportDeadlock() {
            this.reportDeadlock_ = false;
        }

        public boolean hasInputStreamHandler() {
            return this.inputStreamHandler_ != null;
        }

        public InputStreamHandlerConfig getInputStreamHandler() {
            return this.inputStreamHandler_ == null ? InputStreamHandlerConfig.getDefaultInstance() : this.inputStreamHandler_;
        }

        private void setInputStreamHandler(InputStreamHandlerConfig value) {
            value.getClass();
            this.inputStreamHandler_ = value;
        }

        private void mergeInputStreamHandler(InputStreamHandlerConfig value) {
            value.getClass();
            if (this.inputStreamHandler_ != null && this.inputStreamHandler_ != InputStreamHandlerConfig.getDefaultInstance()) {
                this.inputStreamHandler_ = (InputStreamHandlerConfig)((InputStreamHandlerConfig.Builder)InputStreamHandlerConfig.newBuilder(this.inputStreamHandler_).mergeFrom(value)).buildPartial();
            } else {
                this.inputStreamHandler_ = value;
            }

        }

        private void clearInputStreamHandler() {
            this.inputStreamHandler_ = null;
        }

        public boolean hasOutputStreamHandler() {
            return this.outputStreamHandler_ != null;
        }

        public OutputStreamHandlerConfig getOutputStreamHandler() {
            return this.outputStreamHandler_ == null ? OutputStreamHandlerConfig.getDefaultInstance() : this.outputStreamHandler_;
        }

        private void setOutputStreamHandler(OutputStreamHandlerConfig value) {
            value.getClass();
            this.outputStreamHandler_ = value;
        }

        private void mergeOutputStreamHandler(OutputStreamHandlerConfig value) {
            value.getClass();
            if (this.outputStreamHandler_ != null && this.outputStreamHandler_ != OutputStreamHandlerConfig.getDefaultInstance()) {
                this.outputStreamHandler_ = (OutputStreamHandlerConfig)((OutputStreamHandlerConfig.Builder)OutputStreamHandlerConfig.newBuilder(this.outputStreamHandler_).mergeFrom(value)).buildPartial();
            } else {
                this.outputStreamHandler_ = value;
            }

        }

        private void clearOutputStreamHandler() {
            this.outputStreamHandler_ = null;
        }

        public List<ExecutorConfig> getExecutorList() {
            return this.executor_;
        }

        public List<? extends ExecutorConfigOrBuilder> getExecutorOrBuilderList() {
            return this.executor_;
        }

        public int getExecutorCount() {
            return this.executor_.size();
        }

        public ExecutorConfig getExecutor(int index) {
            return (ExecutorConfig)this.executor_.get(index);
        }

        public ExecutorConfigOrBuilder getExecutorOrBuilder(int index) {
            return (ExecutorConfigOrBuilder)this.executor_.get(index);
        }

        private void ensureExecutorIsMutable() {
            ProtobufList<ExecutorConfig> tmp = this.executor_;
            if (!tmp.isModifiable()) {
                this.executor_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setExecutor(int index, ExecutorConfig value) {
            value.getClass();
            this.ensureExecutorIsMutable();
            this.executor_.set(index, value);
        }

        private void addExecutor(ExecutorConfig value) {
            value.getClass();
            this.ensureExecutorIsMutable();
            this.executor_.add(value);
        }

        private void addExecutor(int index, ExecutorConfig value) {
            value.getClass();
            this.ensureExecutorIsMutable();
            this.executor_.add(index, value);
        }

        private void addAllExecutor(Iterable<? extends ExecutorConfig> values) {
            this.ensureExecutorIsMutable();
            AbstractMessageLite.addAll(values, this.executor_);
        }

        private void clearExecutor() {
            this.executor_ = emptyProtobufList();
        }

        private void removeExecutor(int index) {
            this.ensureExecutorIsMutable();
            this.executor_.remove(index);
        }

        public boolean hasProfilerConfig() {
            return this.profilerConfig_ != null;
        }

        public ProfilerConfig getProfilerConfig() {
            return this.profilerConfig_ == null ? ProfilerConfig.getDefaultInstance() : this.profilerConfig_;
        }

        private void setProfilerConfig(ProfilerConfig value) {
            value.getClass();
            this.profilerConfig_ = value;
        }

        private void mergeProfilerConfig(ProfilerConfig value) {
            value.getClass();
            if (this.profilerConfig_ != null && this.profilerConfig_ != ProfilerConfig.getDefaultInstance()) {
                this.profilerConfig_ = (ProfilerConfig)((ProfilerConfig.Builder) ProfilerConfig.newBuilder(this.profilerConfig_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.profilerConfig_ = value;
            }

        }

        private void clearProfilerConfig() {
            this.profilerConfig_ = null;
        }

        public String getPackage() {
            return this.package_;
        }

        public ByteString getPackageBytes() {
            return ByteString.copyFromUtf8(this.package_);
        }

        private void setPackage(String value) {
            Class<?> valueClass = value.getClass();
            this.package_ = value;
        }

        private void clearPackage() {
            this.package_ = getDefaultInstance().getPackage();
        }

        private void setPackageBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.package_ = value.toStringUtf8();
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        private void setType(String value) {
            Class<?> valueClass = value.getClass();
            this.type_ = value;
        }

        private void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        private void setTypeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.type_ = value.toStringUtf8();
        }

        public boolean hasOptions() {
            return this.options_ != null;
        }

        public MediaPipeOptions getOptions() {
            return this.options_ == null ? MediaPipeOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(MediaPipeOptions value) {
            value.getClass();
            this.options_ = value;
        }

        private void mergeOptions(MediaPipeOptions value) {
            value.getClass();
            if (this.options_ != null && this.options_ != MediaPipeOptions.getDefaultInstance()) {
                this.options_ = (MediaPipeOptions)((MediaPipeOptions.Builder)MediaPipeOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            } else {
                this.options_ = value;
            }

        }

        private void clearOptions() {
            this.options_ = null;
        }

        public List<Any> getGraphOptionsList() {
            return this.graphOptions_;
        }

        public List<? extends AnyOrBuilder> getGraphOptionsOrBuilderList() {
            return this.graphOptions_;
        }

        public int getGraphOptionsCount() {
            return this.graphOptions_.size();
        }

        public Any getGraphOptions(int index) {
            return (Any)this.graphOptions_.get(index);
        }

        public AnyOrBuilder getGraphOptionsOrBuilder(int index) {
            return (AnyOrBuilder)this.graphOptions_.get(index);
        }

        private void ensureGraphOptionsIsMutable() {
            ProtobufList<Any> tmp = this.graphOptions_;
            if (!tmp.isModifiable()) {
                this.graphOptions_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setGraphOptions(int index, Any value) {
            value.getClass();
            this.ensureGraphOptionsIsMutable();
            this.graphOptions_.set(index, value);
        }

        private void addGraphOptions(Any value) {
            value.getClass();
            this.ensureGraphOptionsIsMutable();
            this.graphOptions_.add(value);
        }

        private void addGraphOptions(int index, Any value) {
            value.getClass();
            this.ensureGraphOptionsIsMutable();
            this.graphOptions_.add(index, value);
        }

        private void addAllGraphOptions(Iterable<? extends Any> values) {
            this.ensureGraphOptionsIsMutable();
            AbstractMessageLite.addAll(values, this.graphOptions_);
        }

        private void clearGraphOptions() {
            this.graphOptions_ = emptyProtobufList();
        }

        private void removeGraphOptions(int index) {
            this.ensureGraphOptionsIsMutable();
            this.graphOptions_.remove(index);
        }

        public static CalculatorGraphConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorGraphConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorGraphConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorGraphConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorGraphConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorGraphConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorGraphConfig parseFrom(InputStream input) throws IOException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorGraphConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorGraphConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (CalculatorGraphConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorGraphConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorGraphConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorGraphConfig parseFrom(CodedInputStream input) throws IOException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorGraphConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorGraphConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CalculatorGraphConfig prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new CalculatorGraphConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"node_", Node.class, "packetFactory_", PacketFactoryConfig.class, "packetGenerator_", PacketGeneratorConfig.class, "numThreads_", "statusHandler_", StatusHandlerConfig.class, "inputStream_", "maxQueueSize_", "inputStreamHandler_", "outputStreamHandler_", "executor_", ExecutorConfig.class, "outputStream_", "inputSidePacket_", "outputSidePacket_", "profilerConfig_", "package_", "type_", "reportDeadlock_", "options_", "graphOptions_", Any.class};
                    String info = "\u0000\u0013\u0000\u0000\u0001Ϫ\u0013\u0000\n\b\u0001Л\u0006Л\u0007Л\b\u0004\tЛ\nȚ\u000b\u0004\fЉ\rЉ\u000eЛ\u000fȚ\u0010Ț\u0011Ț\u0012\t\u0013Ȉ\u0014Ȉ\u0015\u0007ϩЉϪ\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CalculatorGraphConfig> parser = PARSER;
                    if (parser == null) {
                        Class var5 = CalculatorGraphConfig.class;
                        synchronized(CalculatorGraphConfig.class) {
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

        public static CalculatorGraphConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CalculatorGraphConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            CalculatorGraphConfig defaultInstance = new CalculatorGraphConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(CalculatorGraphConfig.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<CalculatorGraphConfig, Builder> implements CalculatorGraphConfigOrBuilder {
            private Builder() {
                super(CalculatorGraphConfig.DEFAULT_INSTANCE);
            }

            public List<Node> getNodeList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getNodeList());
            }

            public int getNodeCount() {
                return ((CalculatorGraphConfig)this.instance).getNodeCount();
            }

            public Node getNode(int index) {
                return ((CalculatorGraphConfig)this.instance).getNode(index);
            }

            public Builder setNode(int index, Node value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setNode(index, value);
                return this;
            }

            public Builder setNode(int index, Node.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setNode(index, (Node)builderForValue.build());
                return this;
            }

            public Builder addNode(Node value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addNode(value);
                return this;
            }

            public Builder addNode(int index, Node value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addNode(index, value);
                return this;
            }

            public Builder addNode(Node.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addNode((Node)builderForValue.build());
                return this;
            }

            public Builder addNode(int index, Node.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addNode(index, (Node)builderForValue.build());
                return this;
            }

            public Builder addAllNode(Iterable<? extends Node> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllNode(values);
                return this;
            }

            public Builder clearNode() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearNode();
                return this;
            }

            public Builder removeNode(int index) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).removeNode(index);
                return this;
            }

            public List<PacketFactoryConfig> getPacketFactoryList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getPacketFactoryList());
            }

            public int getPacketFactoryCount() {
                return ((CalculatorGraphConfig)this.instance).getPacketFactoryCount();
            }

            public PacketFactoryConfig getPacketFactory(int index) {
                return ((CalculatorGraphConfig)this.instance).getPacketFactory(index);
            }

            public Builder setPacketFactory(int index, PacketFactoryConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setPacketFactory(index, value);
                return this;
            }

            public Builder setPacketFactory(int index, PacketFactoryConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setPacketFactory(index, (PacketFactoryConfig)builderForValue.build());
                return this;
            }

            public Builder addPacketFactory(PacketFactoryConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addPacketFactory(value);
                return this;
            }

            public Builder addPacketFactory(int index, PacketFactoryConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addPacketFactory(index, value);
                return this;
            }

            public Builder addPacketFactory(PacketFactoryConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addPacketFactory((PacketFactoryConfig)builderForValue.build());
                return this;
            }

            public Builder addPacketFactory(int index, PacketFactoryConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addPacketFactory(index, (PacketFactoryConfig)builderForValue.build());
                return this;
            }

            public Builder addAllPacketFactory(Iterable<? extends PacketFactoryConfig> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllPacketFactory(values);
                return this;
            }

            public Builder clearPacketFactory() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearPacketFactory();
                return this;
            }

            public Builder removePacketFactory(int index) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).removePacketFactory(index);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public List<PacketGeneratorConfig> getPacketGeneratorList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getPacketGeneratorList());
            }

            /** @deprecated */
            @Deprecated
            public int getPacketGeneratorCount() {
                return ((CalculatorGraphConfig)this.instance).getPacketGeneratorCount();
            }

            /** @deprecated */
            @Deprecated
            public PacketGeneratorConfig getPacketGenerator(int index) {
                return ((CalculatorGraphConfig)this.instance).getPacketGenerator(index);
            }

            /** @deprecated */
            @Deprecated
            public Builder setPacketGenerator(int index, PacketGeneratorConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setPacketGenerator(index, value);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder setPacketGenerator(int index, PacketGeneratorConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setPacketGenerator(index, (PacketGeneratorConfig)builderForValue.build());
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder addPacketGenerator(PacketGeneratorConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addPacketGenerator(value);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder addPacketGenerator(int index, PacketGeneratorConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addPacketGenerator(index, value);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder addPacketGenerator(PacketGeneratorConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addPacketGenerator((PacketGeneratorConfig)builderForValue.build());
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder addPacketGenerator(int index, PacketGeneratorConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addPacketGenerator(index, (PacketGeneratorConfig)builderForValue.build());
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder addAllPacketGenerator(Iterable<? extends PacketGeneratorConfig> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllPacketGenerator(values);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder clearPacketGenerator() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearPacketGenerator();
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder removePacketGenerator(int index) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).removePacketGenerator(index);
                return this;
            }

            public int getNumThreads() {
                return ((CalculatorGraphConfig)this.instance).getNumThreads();
            }

            public Builder setNumThreads(int value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setNumThreads(value);
                return this;
            }

            public Builder clearNumThreads() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearNumThreads();
                return this;
            }

            public List<StatusHandlerConfig> getStatusHandlerList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getStatusHandlerList());
            }

            public int getStatusHandlerCount() {
                return ((CalculatorGraphConfig)this.instance).getStatusHandlerCount();
            }

            public StatusHandlerConfig getStatusHandler(int index) {
                return ((CalculatorGraphConfig)this.instance).getStatusHandler(index);
            }

            public Builder setStatusHandler(int index, StatusHandlerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setStatusHandler(index, value);
                return this;
            }

            public Builder setStatusHandler(int index, StatusHandlerConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setStatusHandler(index, (StatusHandlerConfig)builderForValue.build());
                return this;
            }

            public Builder addStatusHandler(StatusHandlerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addStatusHandler(value);
                return this;
            }

            public Builder addStatusHandler(int index, StatusHandlerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addStatusHandler(index, value);
                return this;
            }

            public Builder addStatusHandler(StatusHandlerConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addStatusHandler((StatusHandlerConfig)builderForValue.build());
                return this;
            }

            public Builder addStatusHandler(int index, StatusHandlerConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addStatusHandler(index, (StatusHandlerConfig)builderForValue.build());
                return this;
            }

            public Builder addAllStatusHandler(Iterable<? extends StatusHandlerConfig> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllStatusHandler(values);
                return this;
            }

            public Builder clearStatusHandler() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearStatusHandler();
                return this;
            }

            public Builder removeStatusHandler(int index) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).removeStatusHandler(index);
                return this;
            }

            public List<String> getInputStreamList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getInputStreamList());
            }

            public int getInputStreamCount() {
                return ((CalculatorGraphConfig)this.instance).getInputStreamCount();
            }

            public String getInputStream(int index) {
                return ((CalculatorGraphConfig)this.instance).getInputStream(index);
            }

            public ByteString getInputStreamBytes(int index) {
                return ((CalculatorGraphConfig)this.instance).getInputStreamBytes(index);
            }

            public Builder setInputStream(int index, String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setInputStream(index, value);
                return this;
            }

            public Builder addInputStream(String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addInputStream(value);
                return this;
            }

            public Builder addAllInputStream(Iterable<String> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllInputStream(values);
                return this;
            }

            public Builder clearInputStream() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearInputStream();
                return this;
            }

            public Builder addInputStreamBytes(ByteString value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addInputStreamBytes(value);
                return this;
            }

            public List<String> getOutputStreamList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getOutputStreamList());
            }

            public int getOutputStreamCount() {
                return ((CalculatorGraphConfig)this.instance).getOutputStreamCount();
            }

            public String getOutputStream(int index) {
                return ((CalculatorGraphConfig)this.instance).getOutputStream(index);
            }

            public ByteString getOutputStreamBytes(int index) {
                return ((CalculatorGraphConfig)this.instance).getOutputStreamBytes(index);
            }

            public Builder setOutputStream(int index, String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setOutputStream(index, value);
                return this;
            }

            public Builder addOutputStream(String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addOutputStream(value);
                return this;
            }

            public Builder addAllOutputStream(Iterable<String> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllOutputStream(values);
                return this;
            }

            public Builder clearOutputStream() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearOutputStream();
                return this;
            }

            public Builder addOutputStreamBytes(ByteString value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addOutputStreamBytes(value);
                return this;
            }

            public List<String> getInputSidePacketList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getInputSidePacketList());
            }

            public int getInputSidePacketCount() {
                return ((CalculatorGraphConfig)this.instance).getInputSidePacketCount();
            }

            public String getInputSidePacket(int index) {
                return ((CalculatorGraphConfig)this.instance).getInputSidePacket(index);
            }

            public ByteString getInputSidePacketBytes(int index) {
                return ((CalculatorGraphConfig)this.instance).getInputSidePacketBytes(index);
            }

            public Builder setInputSidePacket(int index, String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setInputSidePacket(index, value);
                return this;
            }

            public Builder addInputSidePacket(String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addInputSidePacket(value);
                return this;
            }

            public Builder addAllInputSidePacket(Iterable<String> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllInputSidePacket(values);
                return this;
            }

            public Builder clearInputSidePacket() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearInputSidePacket();
                return this;
            }

            public Builder addInputSidePacketBytes(ByteString value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addInputSidePacketBytes(value);
                return this;
            }

            public List<String> getOutputSidePacketList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getOutputSidePacketList());
            }

            public int getOutputSidePacketCount() {
                return ((CalculatorGraphConfig)this.instance).getOutputSidePacketCount();
            }

            public String getOutputSidePacket(int index) {
                return ((CalculatorGraphConfig)this.instance).getOutputSidePacket(index);
            }

            public ByteString getOutputSidePacketBytes(int index) {
                return ((CalculatorGraphConfig)this.instance).getOutputSidePacketBytes(index);
            }

            public Builder setOutputSidePacket(int index, String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setOutputSidePacket(index, value);
                return this;
            }

            public Builder addOutputSidePacket(String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addOutputSidePacket(value);
                return this;
            }

            public Builder addAllOutputSidePacket(Iterable<String> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllOutputSidePacket(values);
                return this;
            }

            public Builder clearOutputSidePacket() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearOutputSidePacket();
                return this;
            }

            public Builder addOutputSidePacketBytes(ByteString value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addOutputSidePacketBytes(value);
                return this;
            }

            public int getMaxQueueSize() {
                return ((CalculatorGraphConfig)this.instance).getMaxQueueSize();
            }

            public Builder setMaxQueueSize(int value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setMaxQueueSize(value);
                return this;
            }

            public Builder clearMaxQueueSize() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearMaxQueueSize();
                return this;
            }

            public boolean getReportDeadlock() {
                return ((CalculatorGraphConfig)this.instance).getReportDeadlock();
            }

            public Builder setReportDeadlock(boolean value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setReportDeadlock(value);
                return this;
            }

            public Builder clearReportDeadlock() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearReportDeadlock();
                return this;
            }

            public boolean hasInputStreamHandler() {
                return ((CalculatorGraphConfig)this.instance).hasInputStreamHandler();
            }

            public InputStreamHandlerConfig getInputStreamHandler() {
                return ((CalculatorGraphConfig)this.instance).getInputStreamHandler();
            }

            public Builder setInputStreamHandler(InputStreamHandlerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setInputStreamHandler(value);
                return this;
            }

            public Builder setInputStreamHandler(InputStreamHandlerConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setInputStreamHandler((InputStreamHandlerConfig)builderForValue.build());
                return this;
            }

            public Builder mergeInputStreamHandler(InputStreamHandlerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).mergeInputStreamHandler(value);
                return this;
            }

            public Builder clearInputStreamHandler() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearInputStreamHandler();
                return this;
            }

            public boolean hasOutputStreamHandler() {
                return ((CalculatorGraphConfig)this.instance).hasOutputStreamHandler();
            }

            public OutputStreamHandlerConfig getOutputStreamHandler() {
                return ((CalculatorGraphConfig)this.instance).getOutputStreamHandler();
            }

            public Builder setOutputStreamHandler(OutputStreamHandlerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setOutputStreamHandler(value);
                return this;
            }

            public Builder setOutputStreamHandler(OutputStreamHandlerConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setOutputStreamHandler((OutputStreamHandlerConfig)builderForValue.build());
                return this;
            }

            public Builder mergeOutputStreamHandler(OutputStreamHandlerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).mergeOutputStreamHandler(value);
                return this;
            }

            public Builder clearOutputStreamHandler() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearOutputStreamHandler();
                return this;
            }

            public List<ExecutorConfig> getExecutorList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getExecutorList());
            }

            public int getExecutorCount() {
                return ((CalculatorGraphConfig)this.instance).getExecutorCount();
            }

            public ExecutorConfig getExecutor(int index) {
                return ((CalculatorGraphConfig)this.instance).getExecutor(index);
            }

            public Builder setExecutor(int index, ExecutorConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setExecutor(index, value);
                return this;
            }

            public Builder setExecutor(int index, ExecutorConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setExecutor(index, (ExecutorConfig)builderForValue.build());
                return this;
            }

            public Builder addExecutor(ExecutorConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addExecutor(value);
                return this;
            }

            public Builder addExecutor(int index, ExecutorConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addExecutor(index, value);
                return this;
            }

            public Builder addExecutor(ExecutorConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addExecutor((ExecutorConfig)builderForValue.build());
                return this;
            }

            public Builder addExecutor(int index, ExecutorConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addExecutor(index, (ExecutorConfig)builderForValue.build());
                return this;
            }

            public Builder addAllExecutor(Iterable<? extends ExecutorConfig> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllExecutor(values);
                return this;
            }

            public Builder clearExecutor() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearExecutor();
                return this;
            }

            public Builder removeExecutor(int index) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).removeExecutor(index);
                return this;
            }

            public boolean hasProfilerConfig() {
                return ((CalculatorGraphConfig)this.instance).hasProfilerConfig();
            }

            public ProfilerConfig getProfilerConfig() {
                return ((CalculatorGraphConfig)this.instance).getProfilerConfig();
            }

            public Builder setProfilerConfig(ProfilerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setProfilerConfig(value);
                return this;
            }

            public Builder setProfilerConfig(ProfilerConfig.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setProfilerConfig((ProfilerConfig)builderForValue.build());
                return this;
            }

            public Builder mergeProfilerConfig(ProfilerConfig value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).mergeProfilerConfig(value);
                return this;
            }

            public Builder clearProfilerConfig() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearProfilerConfig();
                return this;
            }

            public String getPackage() {
                return ((CalculatorGraphConfig)this.instance).getPackage();
            }

            public ByteString getPackageBytes() {
                return ((CalculatorGraphConfig)this.instance).getPackageBytes();
            }

            public Builder setPackage(String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setPackage(value);
                return this;
            }

            public Builder clearPackage() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearPackage();
                return this;
            }

            public Builder setPackageBytes(ByteString value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setPackageBytes(value);
                return this;
            }

            public String getType() {
                return ((CalculatorGraphConfig)this.instance).getType();
            }

            public ByteString getTypeBytes() {
                return ((CalculatorGraphConfig)this.instance).getTypeBytes();
            }

            public Builder setType(String value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setType(value);
                return this;
            }

            public Builder clearType() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearType();
                return this;
            }

            public Builder setTypeBytes(ByteString value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setTypeBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((CalculatorGraphConfig)this.instance).hasOptions();
            }

            public MediaPipeOptions getOptions() {
                return ((CalculatorGraphConfig)this.instance).getOptions();
            }

            public Builder setOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MediaPipeOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setOptions((MediaPipeOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearOptions();
                return this;
            }

            public List<Any> getGraphOptionsList() {
                return Collections.unmodifiableList(((CalculatorGraphConfig)this.instance).getGraphOptionsList());
            }

            public int getGraphOptionsCount() {
                return ((CalculatorGraphConfig)this.instance).getGraphOptionsCount();
            }

            public Any getGraphOptions(int index) {
                return ((CalculatorGraphConfig)this.instance).getGraphOptions(index);
            }

            public Builder setGraphOptions(int index, Any value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setGraphOptions(index, value);
                return this;
            }

            public Builder setGraphOptions(int index, Any.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).setGraphOptions(index, (Any)builderForValue.build());
                return this;
            }

            public Builder addGraphOptions(Any value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addGraphOptions(value);
                return this;
            }

            public Builder addGraphOptions(int index, Any value) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addGraphOptions(index, value);
                return this;
            }

            public Builder addGraphOptions(Any.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addGraphOptions((Any)builderForValue.build());
                return this;
            }

            public Builder addGraphOptions(int index, Any.Builder builderForValue) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addGraphOptions(index, (Any)builderForValue.build());
                return this;
            }

            public Builder addAllGraphOptions(Iterable<? extends Any> values) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).addAllGraphOptions(values);
                return this;
            }

            public Builder clearGraphOptions() {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).clearGraphOptions();
                return this;
            }

            public Builder removeGraphOptions(int index) {
                this.copyOnWrite();
                ((CalculatorGraphConfig)this.instance).removeGraphOptions(index);
                return this;
            }
        }

        public static final class Node extends GeneratedMessageLite<Node, Node.Builder> implements NodeOrBuilder {
            public static final int NAME_FIELD_NUMBER = 1;
            private String name_ = "";
            public static final int CALCULATOR_FIELD_NUMBER = 2;
            private String calculator_ = "";
            public static final int INPUT_STREAM_FIELD_NUMBER = 3;
            private ProtobufList<String> inputStream_ = GeneratedMessageLite.emptyProtobufList();
            public static final int OUTPUT_STREAM_FIELD_NUMBER = 4;
            private ProtobufList<String> outputStream_ = GeneratedMessageLite.emptyProtobufList();
            public static final int INPUT_SIDE_PACKET_FIELD_NUMBER = 5;
            private ProtobufList<String> inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
            public static final int OUTPUT_SIDE_PACKET_FIELD_NUMBER = 6;
            private ProtobufList<String> outputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
            public static final int OPTIONS_FIELD_NUMBER = 7;
            private CalculatorOptions options_;
            public static final int NODE_OPTIONS_FIELD_NUMBER = 8;
            private ProtobufList<Any> nodeOptions_ = emptyProtobufList();
            public static final int SOURCE_LAYER_FIELD_NUMBER = 9;
            private int sourceLayer_;
            public static final int BUFFER_SIZE_HINT_FIELD_NUMBER = 10;
            private int bufferSizeHint_;
            public static final int INPUT_STREAM_HANDLER_FIELD_NUMBER = 11;
            private InputStreamHandlerConfig inputStreamHandler_;
            public static final int OUTPUT_STREAM_HANDLER_FIELD_NUMBER = 12;
            private OutputStreamHandlerConfig outputStreamHandler_;
            public static final int INPUT_STREAM_INFO_FIELD_NUMBER = 13;
            private ProtobufList<InputStreamInfo> inputStreamInfo_ = emptyProtobufList();
            public static final int EXECUTOR_FIELD_NUMBER = 14;
            private String executor_ = "";
            public static final int PROFILER_CONFIG_FIELD_NUMBER = 15;
            private ProfilerConfig profilerConfig_;
            public static final int MAX_IN_FLIGHT_FIELD_NUMBER = 16;
            private int maxInFlight_;
            public static final int OPTION_VALUE_FIELD_NUMBER = 17;
            private ProtobufList<String> optionValue_ = GeneratedMessageLite.emptyProtobufList();
            public static final int EXTERNAL_INPUT_FIELD_NUMBER = 1005;
            private ProtobufList<String> externalInput_ = GeneratedMessageLite.emptyProtobufList();
            private byte memoizedIsInitialized = 2;
            private static final Node DEFAULT_INSTANCE;
            private static volatile Parser<Node> PARSER;

            private Node() {
            }

            public String getName() {
                return this.name_;
            }

            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            private void setName(String value) {
                Class<?> valueClass = value.getClass();
                this.name_ = value;
            }

            private void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            private void setNameBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.name_ = value.toStringUtf8();
            }

            public String getCalculator() {
                return this.calculator_;
            }

            public ByteString getCalculatorBytes() {
                return ByteString.copyFromUtf8(this.calculator_);
            }

            private void setCalculator(String value) {
                Class<?> valueClass = value.getClass();
                this.calculator_ = value;
            }

            private void clearCalculator() {
                this.calculator_ = getDefaultInstance().getCalculator();
            }

            private void setCalculatorBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.calculator_ = value.toStringUtf8();
            }

            public List<String> getInputStreamList() {
                return this.inputStream_;
            }

            public int getInputStreamCount() {
                return this.inputStream_.size();
            }

            public String getInputStream(int index) {
                return (String)this.inputStream_.get(index);
            }

            public ByteString getInputStreamBytes(int index) {
                return ByteString.copyFromUtf8((String)this.inputStream_.get(index));
            }

            private void ensureInputStreamIsMutable() {
                ProtobufList<String> tmp = this.inputStream_;
                if (!tmp.isModifiable()) {
                    this.inputStream_ = GeneratedMessageLite.mutableCopy(tmp);
                }

            }

            private void setInputStream(int index, String value) {
                Class<?> valueClass = value.getClass();
                this.ensureInputStreamIsMutable();
                this.inputStream_.set(index, value);
            }

            private void addInputStream(String value) {
                Class<?> valueClass = value.getClass();
                this.ensureInputStreamIsMutable();
                this.inputStream_.add(value);
            }

            private void addAllInputStream(Iterable<String> values) {
                this.ensureInputStreamIsMutable();
                AbstractMessageLite.addAll(values, this.inputStream_);
            }

            private void clearInputStream() {
                this.inputStream_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void addInputStreamBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.ensureInputStreamIsMutable();
                this.inputStream_.add(value.toStringUtf8());
            }

            public List<String> getOutputStreamList() {
                return this.outputStream_;
            }

            public int getOutputStreamCount() {
                return this.outputStream_.size();
            }

            public String getOutputStream(int index) {
                return (String)this.outputStream_.get(index);
            }

            public ByteString getOutputStreamBytes(int index) {
                return ByteString.copyFromUtf8((String)this.outputStream_.get(index));
            }

            private void ensureOutputStreamIsMutable() {
                ProtobufList<String> tmp = this.outputStream_;
                if (!tmp.isModifiable()) {
                    this.outputStream_ = GeneratedMessageLite.mutableCopy(tmp);
                }

            }

            private void setOutputStream(int index, String value) {
                Class<?> valueClass = value.getClass();
                this.ensureOutputStreamIsMutable();
                this.outputStream_.set(index, value);
            }

            private void addOutputStream(String value) {
                Class<?> valueClass = value.getClass();
                this.ensureOutputStreamIsMutable();
                this.outputStream_.add(value);
            }

            private void addAllOutputStream(Iterable<String> values) {
                this.ensureOutputStreamIsMutable();
                AbstractMessageLite.addAll(values, this.outputStream_);
            }

            private void clearOutputStream() {
                this.outputStream_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void addOutputStreamBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.ensureOutputStreamIsMutable();
                this.outputStream_.add(value.toStringUtf8());
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
                checkByteStringIsUtf8(value);
                this.ensureInputSidePacketIsMutable();
                this.inputSidePacket_.add(value.toStringUtf8());
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
                checkByteStringIsUtf8(value);
                this.ensureOutputSidePacketIsMutable();
                this.outputSidePacket_.add(value.toStringUtf8());
            }

            public boolean hasOptions() {
                return this.options_ != null;
            }

            public CalculatorOptions getOptions() {
                return this.options_ == null ? CalculatorOptions.getDefaultInstance() : this.options_;
            }

            private void setOptions(CalculatorOptions value) {
                value.getClass();
                this.options_ = value;
            }

            private void mergeOptions(CalculatorOptions value) {
                value.getClass();
                if (this.options_ != null && this.options_ != CalculatorOptions.getDefaultInstance()) {
                    this.options_ = (CalculatorOptions)((CalculatorOptions.Builder)CalculatorOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial();
                } else {
                    this.options_ = value;
                }

            }

            private void clearOptions() {
                this.options_ = null;
            }

            public List<Any> getNodeOptionsList() {
                return this.nodeOptions_;
            }

            public List<? extends AnyOrBuilder> getNodeOptionsOrBuilderList() {
                return this.nodeOptions_;
            }

            public int getNodeOptionsCount() {
                return this.nodeOptions_.size();
            }

            public Any getNodeOptions(int index) {
                return (Any)this.nodeOptions_.get(index);
            }

            public AnyOrBuilder getNodeOptionsOrBuilder(int index) {
                return (AnyOrBuilder)this.nodeOptions_.get(index);
            }

            private void ensureNodeOptionsIsMutable() {
                ProtobufList<Any> tmp = this.nodeOptions_;
                if (!tmp.isModifiable()) {
                    this.nodeOptions_ = GeneratedMessageLite.mutableCopy(tmp);
                }

            }

            private void setNodeOptions(int index, Any value) {
                value.getClass();
                this.ensureNodeOptionsIsMutable();
                this.nodeOptions_.set(index, value);
            }

            private void addNodeOptions(Any value) {
                value.getClass();
                this.ensureNodeOptionsIsMutable();
                this.nodeOptions_.add(value);
            }

            private void addNodeOptions(int index, Any value) {
                value.getClass();
                this.ensureNodeOptionsIsMutable();
                this.nodeOptions_.add(index, value);
            }

            private void addAllNodeOptions(Iterable<? extends Any> values) {
                this.ensureNodeOptionsIsMutable();
                AbstractMessageLite.addAll(values, this.nodeOptions_);
            }

            private void clearNodeOptions() {
                this.nodeOptions_ = emptyProtobufList();
            }

            private void removeNodeOptions(int index) {
                this.ensureNodeOptionsIsMutable();
                this.nodeOptions_.remove(index);
            }

            public int getSourceLayer() {
                return this.sourceLayer_;
            }

            private void setSourceLayer(int value) {
                this.sourceLayer_ = value;
            }

            private void clearSourceLayer() {
                this.sourceLayer_ = 0;
            }

            public int getBufferSizeHint() {
                return this.bufferSizeHint_;
            }

            private void setBufferSizeHint(int value) {
                this.bufferSizeHint_ = value;
            }

            private void clearBufferSizeHint() {
                this.bufferSizeHint_ = 0;
            }

            public boolean hasInputStreamHandler() {
                return this.inputStreamHandler_ != null;
            }

            public InputStreamHandlerConfig getInputStreamHandler() {
                return this.inputStreamHandler_ == null ? InputStreamHandlerConfig.getDefaultInstance() : this.inputStreamHandler_;
            }

            private void setInputStreamHandler(InputStreamHandlerConfig value) {
                value.getClass();
                this.inputStreamHandler_ = value;
            }

            private void mergeInputStreamHandler(InputStreamHandlerConfig value) {
                value.getClass();
                if (this.inputStreamHandler_ != null && this.inputStreamHandler_ != InputStreamHandlerConfig.getDefaultInstance()) {
                    this.inputStreamHandler_ = (InputStreamHandlerConfig)((InputStreamHandlerConfig.Builder)InputStreamHandlerConfig.newBuilder(this.inputStreamHandler_).mergeFrom(value)).buildPartial();
                } else {
                    this.inputStreamHandler_ = value;
                }

            }

            private void clearInputStreamHandler() {
                this.inputStreamHandler_ = null;
            }

            public boolean hasOutputStreamHandler() {
                return this.outputStreamHandler_ != null;
            }

            public OutputStreamHandlerConfig getOutputStreamHandler() {
                return this.outputStreamHandler_ == null ? OutputStreamHandlerConfig.getDefaultInstance() : this.outputStreamHandler_;
            }

            private void setOutputStreamHandler(OutputStreamHandlerConfig value) {
                value.getClass();
                this.outputStreamHandler_ = value;
            }

            private void mergeOutputStreamHandler(OutputStreamHandlerConfig value) {
                value.getClass();
                if (this.outputStreamHandler_ != null && this.outputStreamHandler_ != OutputStreamHandlerConfig.getDefaultInstance()) {
                    this.outputStreamHandler_ = (OutputStreamHandlerConfig)((OutputStreamHandlerConfig.Builder)OutputStreamHandlerConfig.newBuilder(this.outputStreamHandler_).mergeFrom(value)).buildPartial();
                } else {
                    this.outputStreamHandler_ = value;
                }

            }

            private void clearOutputStreamHandler() {
                this.outputStreamHandler_ = null;
            }

            public List<InputStreamInfo> getInputStreamInfoList() {
                return this.inputStreamInfo_;
            }

            public List<? extends InputStreamInfoOrBuilder> getInputStreamInfoOrBuilderList() {
                return this.inputStreamInfo_;
            }

            public int getInputStreamInfoCount() {
                return this.inputStreamInfo_.size();
            }

            public InputStreamInfo getInputStreamInfo(int index) {
                return (InputStreamInfo)this.inputStreamInfo_.get(index);
            }

            public InputStreamInfoOrBuilder getInputStreamInfoOrBuilder(int index) {
                return (InputStreamInfoOrBuilder)this.inputStreamInfo_.get(index);
            }

            private void ensureInputStreamInfoIsMutable() {
                ProtobufList<InputStreamInfo> tmp = this.inputStreamInfo_;
                if (!tmp.isModifiable()) {
                    this.inputStreamInfo_ = GeneratedMessageLite.mutableCopy(tmp);
                }

            }

            private void setInputStreamInfo(int index, InputStreamInfo value) {
                value.getClass();
                this.ensureInputStreamInfoIsMutable();
                this.inputStreamInfo_.set(index, value);
            }

            private void addInputStreamInfo(InputStreamInfo value) {
                value.getClass();
                this.ensureInputStreamInfoIsMutable();
                this.inputStreamInfo_.add(value);
            }

            private void addInputStreamInfo(int index, InputStreamInfo value) {
                value.getClass();
                this.ensureInputStreamInfoIsMutable();
                this.inputStreamInfo_.add(index, value);
            }

            private void addAllInputStreamInfo(Iterable<? extends InputStreamInfo> values) {
                this.ensureInputStreamInfoIsMutable();
                AbstractMessageLite.addAll(values, this.inputStreamInfo_);
            }

            private void clearInputStreamInfo() {
                this.inputStreamInfo_ = emptyProtobufList();
            }

            private void removeInputStreamInfo(int index) {
                this.ensureInputStreamInfoIsMutable();
                this.inputStreamInfo_.remove(index);
            }

            public String getExecutor() {
                return this.executor_;
            }

            public ByteString getExecutorBytes() {
                return ByteString.copyFromUtf8(this.executor_);
            }

            private void setExecutor(String value) {
                Class<?> valueClass = value.getClass();
                this.executor_ = value;
            }

            private void clearExecutor() {
                this.executor_ = getDefaultInstance().getExecutor();
            }

            private void setExecutorBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.executor_ = value.toStringUtf8();
            }

            /** @deprecated */
            @Deprecated
            public boolean hasProfilerConfig() {
                return this.profilerConfig_ != null;
            }

            /** @deprecated */
            @Deprecated
            public ProfilerConfig getProfilerConfig() {
                return this.profilerConfig_ == null ? ProfilerConfig.getDefaultInstance() : this.profilerConfig_;
            }

            private void setProfilerConfig(ProfilerConfig value) {
                value.getClass();
                this.profilerConfig_ = value;
            }

            private void mergeProfilerConfig(ProfilerConfig value) {
                value.getClass();
                if (this.profilerConfig_ != null && this.profilerConfig_ != ProfilerConfig.getDefaultInstance()) {
                    this.profilerConfig_ = (ProfilerConfig)((ProfilerConfig.Builder) ProfilerConfig.newBuilder(this.profilerConfig_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
                } else {
                    this.profilerConfig_ = value;
                }

            }

            private void clearProfilerConfig() {
                this.profilerConfig_ = null;
            }

            public int getMaxInFlight() {
                return this.maxInFlight_;
            }

            private void setMaxInFlight(int value) {
                this.maxInFlight_ = value;
            }

            private void clearMaxInFlight() {
                this.maxInFlight_ = 0;
            }

            public List<String> getOptionValueList() {
                return this.optionValue_;
            }

            public int getOptionValueCount() {
                return this.optionValue_.size();
            }

            public String getOptionValue(int index) {
                return (String)this.optionValue_.get(index);
            }

            public ByteString getOptionValueBytes(int index) {
                return ByteString.copyFromUtf8((String)this.optionValue_.get(index));
            }

            private void ensureOptionValueIsMutable() {
                ProtobufList<String> tmp = this.optionValue_;
                if (!tmp.isModifiable()) {
                    this.optionValue_ = GeneratedMessageLite.mutableCopy(tmp);
                }

            }

            private void setOptionValue(int index, String value) {
                Class<?> valueClass = value.getClass();
                this.ensureOptionValueIsMutable();
                this.optionValue_.set(index, value);
            }

            private void addOptionValue(String value) {
                Class<?> valueClass = value.getClass();
                this.ensureOptionValueIsMutable();
                this.optionValue_.add(value);
            }

            private void addAllOptionValue(Iterable<String> values) {
                this.ensureOptionValueIsMutable();
                AbstractMessageLite.addAll(values, this.optionValue_);
            }

            private void clearOptionValue() {
                this.optionValue_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void addOptionValueBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.ensureOptionValueIsMutable();
                this.optionValue_.add(value.toStringUtf8());
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
                checkByteStringIsUtf8(value);
                this.ensureExternalInputIsMutable();
                this.externalInput_.add(value.toStringUtf8());
            }

            public static Node parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Node parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Node parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Node parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Node parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Node parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Node parseFrom(InputStream input) throws IOException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Node parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Node parseDelimitedFrom(InputStream input) throws IOException {
                return (Node)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Node parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Node)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Node parseFrom(CodedInputStream input) throws IOException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Node parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Node)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Node prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Node();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"name_", "calculator_", "inputStream_", "outputStream_", "inputSidePacket_", "outputSidePacket_", "options_", "nodeOptions_", Any.class, "sourceLayer_", "bufferSizeHint_", "inputStreamHandler_", "outputStreamHandler_", "inputStreamInfo_", InputStreamInfo.class, "executor_", "profilerConfig_", "maxInFlight_", "optionValue_", "externalInput_"};
                        String info = "\u0000\u0012\u0000\u0000\u0001ϭ\u0012\u0000\b\u0003\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\u0007Љ\b\u001b\t\u0004\n\u0004\u000bЉ\fЉ\r\u001b\u000eȈ\u000f\t\u0010\u0004\u0011ȚϭȚ";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Node> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Node.class;
                            synchronized(Node.class) {
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

            public static Node getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Node> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Node defaultInstance = new Node();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Node.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Node, Builder> implements NodeOrBuilder {
                private Builder() {
                    super(Node.DEFAULT_INSTANCE);
                }

                public String getName() {
                    return ((Node)this.instance).getName();
                }

                public ByteString getNameBytes() {
                    return ((Node)this.instance).getNameBytes();
                }

                public Builder setName(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setName(value);
                    return this;
                }

                public Builder clearName() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearName();
                    return this;
                }

                public Builder setNameBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setNameBytes(value);
                    return this;
                }

                public String getCalculator() {
                    return ((Node)this.instance).getCalculator();
                }

                public ByteString getCalculatorBytes() {
                    return ((Node)this.instance).getCalculatorBytes();
                }

                public Builder setCalculator(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setCalculator(value);
                    return this;
                }

                public Builder clearCalculator() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearCalculator();
                    return this;
                }

                public Builder setCalculatorBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setCalculatorBytes(value);
                    return this;
                }

                public List<String> getInputStreamList() {
                    return Collections.unmodifiableList(((Node)this.instance).getInputStreamList());
                }

                public int getInputStreamCount() {
                    return ((Node)this.instance).getInputStreamCount();
                }

                public String getInputStream(int index) {
                    return ((Node)this.instance).getInputStream(index);
                }

                public ByteString getInputStreamBytes(int index) {
                    return ((Node)this.instance).getInputStreamBytes(index);
                }

                public Builder setInputStream(int index, String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setInputStream(index, value);
                    return this;
                }

                public Builder addInputStream(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addInputStream(value);
                    return this;
                }

                public Builder addAllInputStream(Iterable<String> values) {
                    this.copyOnWrite();
                    ((Node)this.instance).addAllInputStream(values);
                    return this;
                }

                public Builder clearInputStream() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearInputStream();
                    return this;
                }

                public Builder addInputStreamBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addInputStreamBytes(value);
                    return this;
                }

                public List<String> getOutputStreamList() {
                    return Collections.unmodifiableList(((Node)this.instance).getOutputStreamList());
                }

                public int getOutputStreamCount() {
                    return ((Node)this.instance).getOutputStreamCount();
                }

                public String getOutputStream(int index) {
                    return ((Node)this.instance).getOutputStream(index);
                }

                public ByteString getOutputStreamBytes(int index) {
                    return ((Node)this.instance).getOutputStreamBytes(index);
                }

                public Builder setOutputStream(int index, String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setOutputStream(index, value);
                    return this;
                }

                public Builder addOutputStream(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addOutputStream(value);
                    return this;
                }

                public Builder addAllOutputStream(Iterable<String> values) {
                    this.copyOnWrite();
                    ((Node)this.instance).addAllOutputStream(values);
                    return this;
                }

                public Builder clearOutputStream() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearOutputStream();
                    return this;
                }

                public Builder addOutputStreamBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addOutputStreamBytes(value);
                    return this;
                }

                public List<String> getInputSidePacketList() {
                    return Collections.unmodifiableList(((Node)this.instance).getInputSidePacketList());
                }

                public int getInputSidePacketCount() {
                    return ((Node)this.instance).getInputSidePacketCount();
                }

                public String getInputSidePacket(int index) {
                    return ((Node)this.instance).getInputSidePacket(index);
                }

                public ByteString getInputSidePacketBytes(int index) {
                    return ((Node)this.instance).getInputSidePacketBytes(index);
                }

                public Builder setInputSidePacket(int index, String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setInputSidePacket(index, value);
                    return this;
                }

                public Builder addInputSidePacket(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addInputSidePacket(value);
                    return this;
                }

                public Builder addAllInputSidePacket(Iterable<String> values) {
                    this.copyOnWrite();
                    ((Node)this.instance).addAllInputSidePacket(values);
                    return this;
                }

                public Builder clearInputSidePacket() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearInputSidePacket();
                    return this;
                }

                public Builder addInputSidePacketBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addInputSidePacketBytes(value);
                    return this;
                }

                public List<String> getOutputSidePacketList() {
                    return Collections.unmodifiableList(((Node)this.instance).getOutputSidePacketList());
                }

                public int getOutputSidePacketCount() {
                    return ((Node)this.instance).getOutputSidePacketCount();
                }

                public String getOutputSidePacket(int index) {
                    return ((Node)this.instance).getOutputSidePacket(index);
                }

                public ByteString getOutputSidePacketBytes(int index) {
                    return ((Node)this.instance).getOutputSidePacketBytes(index);
                }

                public Builder setOutputSidePacket(int index, String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setOutputSidePacket(index, value);
                    return this;
                }

                public Builder addOutputSidePacket(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addOutputSidePacket(value);
                    return this;
                }

                public Builder addAllOutputSidePacket(Iterable<String> values) {
                    this.copyOnWrite();
                    ((Node)this.instance).addAllOutputSidePacket(values);
                    return this;
                }

                public Builder clearOutputSidePacket() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearOutputSidePacket();
                    return this;
                }

                public Builder addOutputSidePacketBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addOutputSidePacketBytes(value);
                    return this;
                }

                public boolean hasOptions() {
                    return ((Node)this.instance).hasOptions();
                }

                public CalculatorOptions getOptions() {
                    return ((Node)this.instance).getOptions();
                }

                public Builder setOptions(CalculatorOptions value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setOptions(value);
                    return this;
                }

                public Builder setOptions(CalculatorOptions.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).setOptions((CalculatorOptions)builderForValue.build());
                    return this;
                }

                public Builder mergeOptions(CalculatorOptions value) {
                    this.copyOnWrite();
                    ((Node)this.instance).mergeOptions(value);
                    return this;
                }

                public Builder clearOptions() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearOptions();
                    return this;
                }

                public List<Any> getNodeOptionsList() {
                    return Collections.unmodifiableList(((Node)this.instance).getNodeOptionsList());
                }

                public int getNodeOptionsCount() {
                    return ((Node)this.instance).getNodeOptionsCount();
                }

                public Any getNodeOptions(int index) {
                    return ((Node)this.instance).getNodeOptions(index);
                }

                public Builder setNodeOptions(int index, Any value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setNodeOptions(index, value);
                    return this;
                }

                public Builder setNodeOptions(int index, Any.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).setNodeOptions(index, (Any)builderForValue.build());
                    return this;
                }

                public Builder addNodeOptions(Any value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addNodeOptions(value);
                    return this;
                }

                public Builder addNodeOptions(int index, Any value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addNodeOptions(index, value);
                    return this;
                }

                public Builder addNodeOptions(Any.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).addNodeOptions((Any)builderForValue.build());
                    return this;
                }

                public Builder addNodeOptions(int index, Any.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).addNodeOptions(index, (Any)builderForValue.build());
                    return this;
                }

                public Builder addAllNodeOptions(Iterable<? extends Any> values) {
                    this.copyOnWrite();
                    ((Node)this.instance).addAllNodeOptions(values);
                    return this;
                }

                public Builder clearNodeOptions() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearNodeOptions();
                    return this;
                }

                public Builder removeNodeOptions(int index) {
                    this.copyOnWrite();
                    ((Node)this.instance).removeNodeOptions(index);
                    return this;
                }

                public int getSourceLayer() {
                    return ((Node)this.instance).getSourceLayer();
                }

                public Builder setSourceLayer(int value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setSourceLayer(value);
                    return this;
                }

                public Builder clearSourceLayer() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearSourceLayer();
                    return this;
                }

                public int getBufferSizeHint() {
                    return ((Node)this.instance).getBufferSizeHint();
                }

                public Builder setBufferSizeHint(int value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setBufferSizeHint(value);
                    return this;
                }

                public Builder clearBufferSizeHint() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearBufferSizeHint();
                    return this;
                }

                public boolean hasInputStreamHandler() {
                    return ((Node)this.instance).hasInputStreamHandler();
                }

                public InputStreamHandlerConfig getInputStreamHandler() {
                    return ((Node)this.instance).getInputStreamHandler();
                }

                public Builder setInputStreamHandler(InputStreamHandlerConfig value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setInputStreamHandler(value);
                    return this;
                }

                public Builder setInputStreamHandler(InputStreamHandlerConfig.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).setInputStreamHandler((InputStreamHandlerConfig)builderForValue.build());
                    return this;
                }

                public Builder mergeInputStreamHandler(InputStreamHandlerConfig value) {
                    this.copyOnWrite();
                    ((Node)this.instance).mergeInputStreamHandler(value);
                    return this;
                }

                public Builder clearInputStreamHandler() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearInputStreamHandler();
                    return this;
                }

                public boolean hasOutputStreamHandler() {
                    return ((Node)this.instance).hasOutputStreamHandler();
                }

                public OutputStreamHandlerConfig getOutputStreamHandler() {
                    return ((Node)this.instance).getOutputStreamHandler();
                }

                public Builder setOutputStreamHandler(OutputStreamHandlerConfig value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setOutputStreamHandler(value);
                    return this;
                }

                public Builder setOutputStreamHandler(OutputStreamHandlerConfig.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).setOutputStreamHandler((OutputStreamHandlerConfig)builderForValue.build());
                    return this;
                }

                public Builder mergeOutputStreamHandler(OutputStreamHandlerConfig value) {
                    this.copyOnWrite();
                    ((Node)this.instance).mergeOutputStreamHandler(value);
                    return this;
                }

                public Builder clearOutputStreamHandler() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearOutputStreamHandler();
                    return this;
                }

                public List<InputStreamInfo> getInputStreamInfoList() {
                    return Collections.unmodifiableList(((Node)this.instance).getInputStreamInfoList());
                }

                public int getInputStreamInfoCount() {
                    return ((Node)this.instance).getInputStreamInfoCount();
                }

                public InputStreamInfo getInputStreamInfo(int index) {
                    return ((Node)this.instance).getInputStreamInfo(index);
                }

                public Builder setInputStreamInfo(int index, InputStreamInfo value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setInputStreamInfo(index, value);
                    return this;
                }

                public Builder setInputStreamInfo(int index, InputStreamInfo.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).setInputStreamInfo(index, (InputStreamInfo)builderForValue.build());
                    return this;
                }

                public Builder addInputStreamInfo(InputStreamInfo value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addInputStreamInfo(value);
                    return this;
                }

                public Builder addInputStreamInfo(int index, InputStreamInfo value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addInputStreamInfo(index, value);
                    return this;
                }

                public Builder addInputStreamInfo(InputStreamInfo.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).addInputStreamInfo((InputStreamInfo)builderForValue.build());
                    return this;
                }

                public Builder addInputStreamInfo(int index, InputStreamInfo.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).addInputStreamInfo(index, (InputStreamInfo)builderForValue.build());
                    return this;
                }

                public Builder addAllInputStreamInfo(Iterable<? extends InputStreamInfo> values) {
                    this.copyOnWrite();
                    ((Node)this.instance).addAllInputStreamInfo(values);
                    return this;
                }

                public Builder clearInputStreamInfo() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearInputStreamInfo();
                    return this;
                }

                public Builder removeInputStreamInfo(int index) {
                    this.copyOnWrite();
                    ((Node)this.instance).removeInputStreamInfo(index);
                    return this;
                }

                public String getExecutor() {
                    return ((Node)this.instance).getExecutor();
                }

                public ByteString getExecutorBytes() {
                    return ((Node)this.instance).getExecutorBytes();
                }

                public Builder setExecutor(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setExecutor(value);
                    return this;
                }

                public Builder clearExecutor() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearExecutor();
                    return this;
                }

                public Builder setExecutorBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setExecutorBytes(value);
                    return this;
                }

                /** @deprecated */
                @Deprecated
                public boolean hasProfilerConfig() {
                    return ((Node)this.instance).hasProfilerConfig();
                }

                /** @deprecated */
                @Deprecated
                public ProfilerConfig getProfilerConfig() {
                    return ((Node)this.instance).getProfilerConfig();
                }

                /** @deprecated */
                @Deprecated
                public Builder setProfilerConfig(ProfilerConfig value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setProfilerConfig(value);
                    return this;
                }

                /** @deprecated */
                @Deprecated
                public Builder setProfilerConfig(ProfilerConfig.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Node)this.instance).setProfilerConfig((ProfilerConfig)builderForValue.build());
                    return this;
                }

                /** @deprecated */
                @Deprecated
                public Builder mergeProfilerConfig(ProfilerConfig value) {
                    this.copyOnWrite();
                    ((Node)this.instance).mergeProfilerConfig(value);
                    return this;
                }

                /** @deprecated */
                @Deprecated
                public Builder clearProfilerConfig() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearProfilerConfig();
                    return this;
                }

                public int getMaxInFlight() {
                    return ((Node)this.instance).getMaxInFlight();
                }

                public Builder setMaxInFlight(int value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setMaxInFlight(value);
                    return this;
                }

                public Builder clearMaxInFlight() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearMaxInFlight();
                    return this;
                }

                public List<String> getOptionValueList() {
                    return Collections.unmodifiableList(((Node)this.instance).getOptionValueList());
                }

                public int getOptionValueCount() {
                    return ((Node)this.instance).getOptionValueCount();
                }

                public String getOptionValue(int index) {
                    return ((Node)this.instance).getOptionValue(index);
                }

                public ByteString getOptionValueBytes(int index) {
                    return ((Node)this.instance).getOptionValueBytes(index);
                }

                public Builder setOptionValue(int index, String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setOptionValue(index, value);
                    return this;
                }

                public Builder addOptionValue(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addOptionValue(value);
                    return this;
                }

                public Builder addAllOptionValue(Iterable<String> values) {
                    this.copyOnWrite();
                    ((Node)this.instance).addAllOptionValue(values);
                    return this;
                }

                public Builder clearOptionValue() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearOptionValue();
                    return this;
                }

                public Builder addOptionValueBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addOptionValueBytes(value);
                    return this;
                }

                public List<String> getExternalInputList() {
                    return Collections.unmodifiableList(((Node)this.instance).getExternalInputList());
                }

                public int getExternalInputCount() {
                    return ((Node)this.instance).getExternalInputCount();
                }

                public String getExternalInput(int index) {
                    return ((Node)this.instance).getExternalInput(index);
                }

                public ByteString getExternalInputBytes(int index) {
                    return ((Node)this.instance).getExternalInputBytes(index);
                }

                public Builder setExternalInput(int index, String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).setExternalInput(index, value);
                    return this;
                }

                public Builder addExternalInput(String value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addExternalInput(value);
                    return this;
                }

                public Builder addAllExternalInput(Iterable<String> values) {
                    this.copyOnWrite();
                    ((Node)this.instance).addAllExternalInput(values);
                    return this;
                }

                public Builder clearExternalInput() {
                    this.copyOnWrite();
                    ((Node)this.instance).clearExternalInput();
                    return this;
                }

                public Builder addExternalInputBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Node)this.instance).addExternalInputBytes(value);
                    return this;
                }
            }
        }

        public interface NodeOrBuilder extends MessageLiteOrBuilder {
            String getName();

            ByteString getNameBytes();

            String getCalculator();

            ByteString getCalculatorBytes();

            List<String> getInputStreamList();

            int getInputStreamCount();

            String getInputStream(int index);

            ByteString getInputStreamBytes(int index);

            List<String> getOutputStreamList();

            int getOutputStreamCount();

            String getOutputStream(int index);

            ByteString getOutputStreamBytes(int index);

            List<String> getInputSidePacketList();

            int getInputSidePacketCount();

            String getInputSidePacket(int index);

            ByteString getInputSidePacketBytes(int index);

            List<String> getOutputSidePacketList();

            int getOutputSidePacketCount();

            String getOutputSidePacket(int index);

            ByteString getOutputSidePacketBytes(int index);

            boolean hasOptions();

            CalculatorOptions getOptions();

            List<Any> getNodeOptionsList();

            Any getNodeOptions(int index);

            int getNodeOptionsCount();

            int getSourceLayer();

            int getBufferSizeHint();

            boolean hasInputStreamHandler();

            InputStreamHandlerConfig getInputStreamHandler();

            boolean hasOutputStreamHandler();

            OutputStreamHandlerConfig getOutputStreamHandler();

            List<InputStreamInfo> getInputStreamInfoList();

            InputStreamInfo getInputStreamInfo(int index);

            int getInputStreamInfoCount();

            String getExecutor();

            ByteString getExecutorBytes();

            /** @deprecated */
            @Deprecated
            boolean hasProfilerConfig();

            /** @deprecated */
            @Deprecated
            ProfilerConfig getProfilerConfig();

            int getMaxInFlight();

            List<String> getOptionValueList();

            int getOptionValueCount();

            String getOptionValue(int index);

            ByteString getOptionValueBytes(int index);

            List<String> getExternalInputList();

            int getExternalInputCount();

            String getExternalInput(int index);

            ByteString getExternalInputBytes(int index);
        }
    }

    public interface CalculatorGraphConfigOrBuilder extends MessageLiteOrBuilder {
        List<CalculatorGraphConfig.Node> getNodeList();

        CalculatorGraphConfig.Node getNode(int index);

        int getNodeCount();

        List<PacketFactoryConfig> getPacketFactoryList();

        PacketFactoryConfig getPacketFactory(int index);

        int getPacketFactoryCount();

        /** @deprecated */
        @Deprecated
        List<PacketGeneratorConfig> getPacketGeneratorList();

        /** @deprecated */
        @Deprecated
        PacketGeneratorConfig getPacketGenerator(int index);

        /** @deprecated */
        @Deprecated
        int getPacketGeneratorCount();

        int getNumThreads();

        List<StatusHandlerConfig> getStatusHandlerList();

        StatusHandlerConfig getStatusHandler(int index);

        int getStatusHandlerCount();

        List<String> getInputStreamList();

        int getInputStreamCount();

        String getInputStream(int index);

        ByteString getInputStreamBytes(int index);

        List<String> getOutputStreamList();

        int getOutputStreamCount();

        String getOutputStream(int index);

        ByteString getOutputStreamBytes(int index);

        List<String> getInputSidePacketList();

        int getInputSidePacketCount();

        String getInputSidePacket(int index);

        ByteString getInputSidePacketBytes(int index);

        List<String> getOutputSidePacketList();

        int getOutputSidePacketCount();

        String getOutputSidePacket(int index);

        ByteString getOutputSidePacketBytes(int index);

        int getMaxQueueSize();

        boolean getReportDeadlock();

        boolean hasInputStreamHandler();

        InputStreamHandlerConfig getInputStreamHandler();

        boolean hasOutputStreamHandler();

        OutputStreamHandlerConfig getOutputStreamHandler();

        List<ExecutorConfig> getExecutorList();

        ExecutorConfig getExecutor(int index);

        int getExecutorCount();

        boolean hasProfilerConfig();

        ProfilerConfig getProfilerConfig();

        String getPackage();

        ByteString getPackageBytes();

        String getType();

        ByteString getTypeBytes();

        boolean hasOptions();

        MediaPipeOptions getOptions();

        List<Any> getGraphOptionsList();

        Any getGraphOptions(int index);

        int getGraphOptionsCount();
    }

    public static final class ProfilerConfig extends GeneratedMessageLite<ProfilerConfig, ProfilerConfig.Builder> implements ProfilerConfigOrBuilder {
        public static final int HISTOGRAM_INTERVAL_SIZE_USEC_FIELD_NUMBER = 1;
        private long histogramIntervalSizeUsec_;
        public static final int NUM_HISTOGRAM_INTERVALS_FIELD_NUMBER = 2;
        private long numHistogramIntervals_;
        public static final int ENABLE_INPUT_OUTPUT_LATENCY_FIELD_NUMBER = 3;
        private boolean enableInputOutputLatency_;
        public static final int ENABLE_PROFILER_FIELD_NUMBER = 4;
        private boolean enableProfiler_;
        public static final int ENABLE_STREAM_LATENCY_FIELD_NUMBER = 5;
        private boolean enableStreamLatency_;
        public static final int USE_PACKET_TIMESTAMP_FOR_ADDED_PACKET_FIELD_NUMBER = 6;
        private boolean usePacketTimestampForAddedPacket_;
        public static final int TRACE_LOG_CAPACITY_FIELD_NUMBER = 7;
        private long traceLogCapacity_;
        public static final int TRACE_EVENT_TYPES_DISABLED_FIELD_NUMBER = 8;
        private IntList traceEventTypesDisabled_ = emptyIntList();
        private int traceEventTypesDisabledMemoizedSerializedSize = -1;
        public static final int TRACE_LOG_PATH_FIELD_NUMBER = 9;
        private String traceLogPath_ = "";
        public static final int TRACE_LOG_COUNT_FIELD_NUMBER = 10;
        private int traceLogCount_;
        public static final int TRACE_LOG_INTERVAL_USEC_FIELD_NUMBER = 11;
        private long traceLogIntervalUsec_;
        public static final int TRACE_LOG_MARGIN_USEC_FIELD_NUMBER = 12;
        private long traceLogMarginUsec_;
        public static final int TRACE_LOG_DURATION_EVENTS_FIELD_NUMBER = 13;
        private boolean traceLogDurationEvents_;
        public static final int TRACE_LOG_INTERVAL_COUNT_FIELD_NUMBER = 14;
        private int traceLogIntervalCount_;
        public static final int TRACE_LOG_DISABLED_FIELD_NUMBER = 15;
        private boolean traceLogDisabled_;
        public static final int TRACE_ENABLED_FIELD_NUMBER = 16;
        private boolean traceEnabled_;
        public static final int TRACE_LOG_INSTANT_EVENTS_FIELD_NUMBER = 17;
        private boolean traceLogInstantEvents_;
        public static final int CALCULATOR_FILTER_FIELD_NUMBER = 18;
        private String calculatorFilter_ = "";
        private static final ProfilerConfig DEFAULT_INSTANCE;
        private static volatile Parser<ProfilerConfig> PARSER;

        private ProfilerConfig() {
        }

        public long getHistogramIntervalSizeUsec() {
            return this.histogramIntervalSizeUsec_;
        }

        private void setHistogramIntervalSizeUsec(long value) {
            this.histogramIntervalSizeUsec_ = value;
        }

        private void clearHistogramIntervalSizeUsec() {
            this.histogramIntervalSizeUsec_ = 0L;
        }

        public long getNumHistogramIntervals() {
            return this.numHistogramIntervals_;
        }

        private void setNumHistogramIntervals(long value) {
            this.numHistogramIntervals_ = value;
        }

        private void clearNumHistogramIntervals() {
            this.numHistogramIntervals_ = 0L;
        }

        /** @deprecated */
        @Deprecated
        public boolean getEnableInputOutputLatency() {
            return this.enableInputOutputLatency_;
        }

        /** @deprecated */
        private void setEnableInputOutputLatency(boolean value) {
            this.enableInputOutputLatency_ = value;
        }

        /** @deprecated */
        private void clearEnableInputOutputLatency() {
            this.enableInputOutputLatency_ = false;
        }

        public boolean getEnableProfiler() {
            return this.enableProfiler_;
        }

        private void setEnableProfiler(boolean value) {
            this.enableProfiler_ = value;
        }

        private void clearEnableProfiler() {
            this.enableProfiler_ = false;
        }

        public boolean getEnableStreamLatency() {
            return this.enableStreamLatency_;
        }

        private void setEnableStreamLatency(boolean value) {
            this.enableStreamLatency_ = value;
        }

        private void clearEnableStreamLatency() {
            this.enableStreamLatency_ = false;
        }

        public boolean getUsePacketTimestampForAddedPacket() {
            return this.usePacketTimestampForAddedPacket_;
        }

        private void setUsePacketTimestampForAddedPacket(boolean value) {
            this.usePacketTimestampForAddedPacket_ = value;
        }

        private void clearUsePacketTimestampForAddedPacket() {
            this.usePacketTimestampForAddedPacket_ = false;
        }

        public long getTraceLogCapacity() {
            return this.traceLogCapacity_;
        }

        private void setTraceLogCapacity(long value) {
            this.traceLogCapacity_ = value;
        }

        private void clearTraceLogCapacity() {
            this.traceLogCapacity_ = 0L;
        }

        public List<Integer> getTraceEventTypesDisabledList() {
            return this.traceEventTypesDisabled_;
        }

        public int getTraceEventTypesDisabledCount() {
            return this.traceEventTypesDisabled_.size();
        }

        public int getTraceEventTypesDisabled(int index) {
            return this.traceEventTypesDisabled_.getInt(index);
        }

        private void ensureTraceEventTypesDisabledIsMutable() {
            IntList tmp = this.traceEventTypesDisabled_;
            if (!tmp.isModifiable()) {
                this.traceEventTypesDisabled_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setTraceEventTypesDisabled(int index, int value) {
            this.ensureTraceEventTypesDisabledIsMutable();
            this.traceEventTypesDisabled_.setInt(index, value);
        }

        private void addTraceEventTypesDisabled(int value) {
            this.ensureTraceEventTypesDisabledIsMutable();
            this.traceEventTypesDisabled_.addInt(value);
        }

        private void addAllTraceEventTypesDisabled(Iterable<? extends Integer> values) {
            this.ensureTraceEventTypesDisabledIsMutable();
            AbstractMessageLite.addAll(values, this.traceEventTypesDisabled_);
        }

        private void clearTraceEventTypesDisabled() {
            this.traceEventTypesDisabled_ = emptyIntList();
        }

        public String getTraceLogPath() {
            return this.traceLogPath_;
        }

        public ByteString getTraceLogPathBytes() {
            return ByteString.copyFromUtf8(this.traceLogPath_);
        }

        private void setTraceLogPath(String value) {
            Class<?> valueClass = value.getClass();
            this.traceLogPath_ = value;
        }

        private void clearTraceLogPath() {
            this.traceLogPath_ = getDefaultInstance().getTraceLogPath();
        }

        private void setTraceLogPathBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.traceLogPath_ = value.toStringUtf8();
        }

        public int getTraceLogCount() {
            return this.traceLogCount_;
        }

        private void setTraceLogCount(int value) {
            this.traceLogCount_ = value;
        }

        private void clearTraceLogCount() {
            this.traceLogCount_ = 0;
        }

        public long getTraceLogIntervalUsec() {
            return this.traceLogIntervalUsec_;
        }

        private void setTraceLogIntervalUsec(long value) {
            this.traceLogIntervalUsec_ = value;
        }

        private void clearTraceLogIntervalUsec() {
            this.traceLogIntervalUsec_ = 0L;
        }

        public long getTraceLogMarginUsec() {
            return this.traceLogMarginUsec_;
        }

        private void setTraceLogMarginUsec(long value) {
            this.traceLogMarginUsec_ = value;
        }

        private void clearTraceLogMarginUsec() {
            this.traceLogMarginUsec_ = 0L;
        }

        /** @deprecated */
        @Deprecated
        public boolean getTraceLogDurationEvents() {
            return this.traceLogDurationEvents_;
        }

        /** @deprecated */
        private void setTraceLogDurationEvents(boolean value) {
            this.traceLogDurationEvents_ = value;
        }

        /** @deprecated */
        private void clearTraceLogDurationEvents() {
            this.traceLogDurationEvents_ = false;
        }

        public int getTraceLogIntervalCount() {
            return this.traceLogIntervalCount_;
        }

        private void setTraceLogIntervalCount(int value) {
            this.traceLogIntervalCount_ = value;
        }

        private void clearTraceLogIntervalCount() {
            this.traceLogIntervalCount_ = 0;
        }

        public boolean getTraceLogDisabled() {
            return this.traceLogDisabled_;
        }

        private void setTraceLogDisabled(boolean value) {
            this.traceLogDisabled_ = value;
        }

        private void clearTraceLogDisabled() {
            this.traceLogDisabled_ = false;
        }

        public boolean getTraceEnabled() {
            return this.traceEnabled_;
        }

        private void setTraceEnabled(boolean value) {
            this.traceEnabled_ = value;
        }

        private void clearTraceEnabled() {
            this.traceEnabled_ = false;
        }

        public boolean getTraceLogInstantEvents() {
            return this.traceLogInstantEvents_;
        }

        private void setTraceLogInstantEvents(boolean value) {
            this.traceLogInstantEvents_ = value;
        }

        private void clearTraceLogInstantEvents() {
            this.traceLogInstantEvents_ = false;
        }

        public String getCalculatorFilter() {
            return this.calculatorFilter_;
        }

        public ByteString getCalculatorFilterBytes() {
            return ByteString.copyFromUtf8(this.calculatorFilter_);
        }

        private void setCalculatorFilter(String value) {
            Class<?> valueClass = value.getClass();
            this.calculatorFilter_ = value;
        }

        private void clearCalculatorFilter() {
            this.calculatorFilter_ = getDefaultInstance().getCalculatorFilter();
        }

        private void setCalculatorFilterBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.calculatorFilter_ = value.toStringUtf8();
        }

        public static ProfilerConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ProfilerConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ProfilerConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ProfilerConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ProfilerConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ProfilerConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ProfilerConfig parseFrom(InputStream input) throws IOException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ProfilerConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ProfilerConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (ProfilerConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ProfilerConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ProfilerConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ProfilerConfig parseFrom(CodedInputStream input) throws IOException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ProfilerConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ProfilerConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ProfilerConfig prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProfilerConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"histogramIntervalSizeUsec_", "numHistogramIntervals_", "enableInputOutputLatency_", "enableProfiler_", "enableStreamLatency_", "usePacketTimestampForAddedPacket_", "traceLogCapacity_", "traceEventTypesDisabled_", "traceLogPath_", "traceLogCount_", "traceLogIntervalUsec_", "traceLogMarginUsec_", "traceLogDurationEvents_", "traceLogIntervalCount_", "traceLogDisabled_", "traceEnabled_", "traceLogInstantEvents_", "calculatorFilter_"};
                    String info = "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0002\b'\tȈ\n\u0004\u000b\u0002\f\u0002\r\u0007\u000e\u0004\u000f\u0007\u0010\u0007\u0011\u0007\u0012Ȉ";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProfilerConfig> parser = PARSER;
                    if (parser == null) {
                        Class var5 = ProfilerConfig.class;
                        synchronized(ProfilerConfig.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = (Parser)parser;
                            }
                        }
                    }

                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static ProfilerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProfilerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            ProfilerConfig defaultInstance = new ProfilerConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(ProfilerConfig.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ProfilerConfig, Builder> implements ProfilerConfigOrBuilder {
            private Builder() {
                super(ProfilerConfig.DEFAULT_INSTANCE);
            }

            public long getHistogramIntervalSizeUsec() {
                return ((ProfilerConfig)this.instance).getHistogramIntervalSizeUsec();
            }

            public Builder setHistogramIntervalSizeUsec(long value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setHistogramIntervalSizeUsec(value);
                return this;
            }

            public Builder clearHistogramIntervalSizeUsec() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearHistogramIntervalSizeUsec();
                return this;
            }

            public long getNumHistogramIntervals() {
                return ((ProfilerConfig)this.instance).getNumHistogramIntervals();
            }

            public Builder setNumHistogramIntervals(long value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setNumHistogramIntervals(value);
                return this;
            }

            public Builder clearNumHistogramIntervals() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearNumHistogramIntervals();
                return this;
            }

            /** @deprecated */
            @Deprecated
            public boolean getEnableInputOutputLatency() {
                return ((ProfilerConfig)this.instance).getEnableInputOutputLatency();
            }

            /** @deprecated */
            @Deprecated
            public Builder setEnableInputOutputLatency(boolean value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setEnableInputOutputLatency(value);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder clearEnableInputOutputLatency() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearEnableInputOutputLatency();
                return this;
            }

            public boolean getEnableProfiler() {
                return ((ProfilerConfig)this.instance).getEnableProfiler();
            }

            public Builder setEnableProfiler(boolean value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setEnableProfiler(value);
                return this;
            }

            public Builder clearEnableProfiler() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearEnableProfiler();
                return this;
            }

            public boolean getEnableStreamLatency() {
                return ((ProfilerConfig)this.instance).getEnableStreamLatency();
            }

            public Builder setEnableStreamLatency(boolean value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setEnableStreamLatency(value);
                return this;
            }

            public Builder clearEnableStreamLatency() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearEnableStreamLatency();
                return this;
            }

            public boolean getUsePacketTimestampForAddedPacket() {
                return ((ProfilerConfig)this.instance).getUsePacketTimestampForAddedPacket();
            }

            public Builder setUsePacketTimestampForAddedPacket(boolean value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setUsePacketTimestampForAddedPacket(value);
                return this;
            }

            public Builder clearUsePacketTimestampForAddedPacket() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearUsePacketTimestampForAddedPacket();
                return this;
            }

            public long getTraceLogCapacity() {
                return ((ProfilerConfig)this.instance).getTraceLogCapacity();
            }

            public Builder setTraceLogCapacity(long value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogCapacity(value);
                return this;
            }

            public Builder clearTraceLogCapacity() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogCapacity();
                return this;
            }

            public List<Integer> getTraceEventTypesDisabledList() {
                return Collections.unmodifiableList(((ProfilerConfig)this.instance).getTraceEventTypesDisabledList());
            }

            public int getTraceEventTypesDisabledCount() {
                return ((ProfilerConfig)this.instance).getTraceEventTypesDisabledCount();
            }

            public int getTraceEventTypesDisabled(int index) {
                return ((ProfilerConfig)this.instance).getTraceEventTypesDisabled(index);
            }

            public Builder setTraceEventTypesDisabled(int index, int value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceEventTypesDisabled(index, value);
                return this;
            }

            public Builder addTraceEventTypesDisabled(int value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).addTraceEventTypesDisabled(value);
                return this;
            }

            public Builder addAllTraceEventTypesDisabled(Iterable<? extends Integer> values) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).addAllTraceEventTypesDisabled(values);
                return this;
            }

            public Builder clearTraceEventTypesDisabled() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceEventTypesDisabled();
                return this;
            }

            public String getTraceLogPath() {
                return ((ProfilerConfig)this.instance).getTraceLogPath();
            }

            public ByteString getTraceLogPathBytes() {
                return ((ProfilerConfig)this.instance).getTraceLogPathBytes();
            }

            public Builder setTraceLogPath(String value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogPath(value);
                return this;
            }

            public Builder clearTraceLogPath() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogPath();
                return this;
            }

            public Builder setTraceLogPathBytes(ByteString value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogPathBytes(value);
                return this;
            }

            public int getTraceLogCount() {
                return ((ProfilerConfig)this.instance).getTraceLogCount();
            }

            public Builder setTraceLogCount(int value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogCount(value);
                return this;
            }

            public Builder clearTraceLogCount() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogCount();
                return this;
            }

            public long getTraceLogIntervalUsec() {
                return ((ProfilerConfig)this.instance).getTraceLogIntervalUsec();
            }

            public Builder setTraceLogIntervalUsec(long value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogIntervalUsec(value);
                return this;
            }

            public Builder clearTraceLogIntervalUsec() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogIntervalUsec();
                return this;
            }

            public long getTraceLogMarginUsec() {
                return ((ProfilerConfig)this.instance).getTraceLogMarginUsec();
            }

            public Builder setTraceLogMarginUsec(long value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogMarginUsec(value);
                return this;
            }

            public Builder clearTraceLogMarginUsec() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogMarginUsec();
                return this;
            }

            /** @deprecated */
            @Deprecated
            public boolean getTraceLogDurationEvents() {
                return ((ProfilerConfig)this.instance).getTraceLogDurationEvents();
            }

            /** @deprecated */
            @Deprecated
            public Builder setTraceLogDurationEvents(boolean value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogDurationEvents(value);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Builder clearTraceLogDurationEvents() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogDurationEvents();
                return this;
            }

            public int getTraceLogIntervalCount() {
                return ((ProfilerConfig)this.instance).getTraceLogIntervalCount();
            }

            public Builder setTraceLogIntervalCount(int value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogIntervalCount(value);
                return this;
            }

            public Builder clearTraceLogIntervalCount() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogIntervalCount();
                return this;
            }

            public boolean getTraceLogDisabled() {
                return ((ProfilerConfig)this.instance).getTraceLogDisabled();
            }

            public Builder setTraceLogDisabled(boolean value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogDisabled(value);
                return this;
            }

            public Builder clearTraceLogDisabled() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogDisabled();
                return this;
            }

            public boolean getTraceEnabled() {
                return ((ProfilerConfig)this.instance).getTraceEnabled();
            }

            public Builder setTraceEnabled(boolean value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceEnabled(value);
                return this;
            }

            public Builder clearTraceEnabled() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceEnabled();
                return this;
            }

            public boolean getTraceLogInstantEvents() {
                return ((ProfilerConfig)this.instance).getTraceLogInstantEvents();
            }

            public Builder setTraceLogInstantEvents(boolean value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setTraceLogInstantEvents(value);
                return this;
            }

            public Builder clearTraceLogInstantEvents() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearTraceLogInstantEvents();
                return this;
            }

            public String getCalculatorFilter() {
                return ((ProfilerConfig)this.instance).getCalculatorFilter();
            }

            public ByteString getCalculatorFilterBytes() {
                return ((ProfilerConfig)this.instance).getCalculatorFilterBytes();
            }

            public Builder setCalculatorFilter(String value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setCalculatorFilter(value);
                return this;
            }

            public Builder clearCalculatorFilter() {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).clearCalculatorFilter();
                return this;
            }

            public Builder setCalculatorFilterBytes(ByteString value) {
                this.copyOnWrite();
                ((ProfilerConfig)this.instance).setCalculatorFilterBytes(value);
                return this;
            }
        }
    }

    public interface ProfilerConfigOrBuilder extends MessageLiteOrBuilder {
        long getHistogramIntervalSizeUsec();

        long getNumHistogramIntervals();

        /** @deprecated */
        @Deprecated
        boolean getEnableInputOutputLatency();

        boolean getEnableProfiler();

        boolean getEnableStreamLatency();

        boolean getUsePacketTimestampForAddedPacket();

        long getTraceLogCapacity();

        List<Integer> getTraceEventTypesDisabledList();

        int getTraceEventTypesDisabledCount();

        int getTraceEventTypesDisabled(int index);

        String getTraceLogPath();

        ByteString getTraceLogPathBytes();

        int getTraceLogCount();

        long getTraceLogIntervalUsec();

        long getTraceLogMarginUsec();

        /** @deprecated */
        @Deprecated
        boolean getTraceLogDurationEvents();

        int getTraceLogIntervalCount();

        boolean getTraceLogDisabled();

        boolean getTraceEnabled();

        boolean getTraceLogInstantEvents();

        String getCalculatorFilter();

        ByteString getCalculatorFilterBytes();
    }

    public static final class InputStreamInfo extends GeneratedMessageLite<InputStreamInfo, InputStreamInfo.Builder> implements InputStreamInfoOrBuilder {
        public static final int TAG_INDEX_FIELD_NUMBER = 1;
        private String tagIndex_ = "";
        public static final int BACK_EDGE_FIELD_NUMBER = 2;
        private boolean backEdge_;
        private static final InputStreamInfo DEFAULT_INSTANCE;
        private static volatile Parser<InputStreamInfo> PARSER;

        private InputStreamInfo() {
        }

        public String getTagIndex() {
            return this.tagIndex_;
        }

        public ByteString getTagIndexBytes() {
            return ByteString.copyFromUtf8(this.tagIndex_);
        }

        private void setTagIndex(String value) {
            Class<?> valueClass = value.getClass();
            this.tagIndex_ = value;
        }

        private void clearTagIndex() {
            this.tagIndex_ = getDefaultInstance().getTagIndex();
        }

        private void setTagIndexBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.tagIndex_ = value.toStringUtf8();
        }

        public boolean getBackEdge() {
            return this.backEdge_;
        }

        private void setBackEdge(boolean value) {
            this.backEdge_ = value;
        }

        private void clearBackEdge() {
            this.backEdge_ = false;
        }

        public static InputStreamInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamInfo parseFrom(InputStream input) throws IOException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputStreamInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (InputStreamInfo)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamInfo)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputStreamInfo parseFrom(CodedInputStream input) throws IOException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamInfo)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InputStreamInfo prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new InputStreamInfo();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"tagIndex_", "backEdge_"};
                    String info = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<InputStreamInfo> parser = PARSER;
                    if (parser == null) {
                        Class var5 = InputStreamInfo.class;
                        synchronized(InputStreamInfo.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = (Parser)parser;
                            }
                        }
                    }

                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static InputStreamInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<InputStreamInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            InputStreamInfo defaultInstance = new InputStreamInfo();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(InputStreamInfo.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<InputStreamInfo, Builder> implements InputStreamInfoOrBuilder {
            private Builder() {
                super(InputStreamInfo.DEFAULT_INSTANCE);
            }

            public String getTagIndex() {
                return ((InputStreamInfo)this.instance).getTagIndex();
            }

            public ByteString getTagIndexBytes() {
                return ((InputStreamInfo)this.instance).getTagIndexBytes();
            }

            public Builder setTagIndex(String value) {
                this.copyOnWrite();
                ((InputStreamInfo)this.instance).setTagIndex(value);
                return this;
            }

            public Builder clearTagIndex() {
                this.copyOnWrite();
                ((InputStreamInfo)this.instance).clearTagIndex();
                return this;
            }

            public Builder setTagIndexBytes(ByteString value) {
                this.copyOnWrite();
                ((InputStreamInfo)this.instance).setTagIndexBytes(value);
                return this;
            }

            public boolean getBackEdge() {
                return ((InputStreamInfo)this.instance).getBackEdge();
            }

            public Builder setBackEdge(boolean value) {
                this.copyOnWrite();
                ((InputStreamInfo)this.instance).setBackEdge(value);
                return this;
            }

            public Builder clearBackEdge() {
                this.copyOnWrite();
                ((InputStreamInfo)this.instance).clearBackEdge();
                return this;
            }
        }
    }

    public interface InputStreamInfoOrBuilder extends MessageLiteOrBuilder {
        String getTagIndex();

        ByteString getTagIndexBytes();

        boolean getBackEdge();
    }

    public static final class InputCollectionSet extends GeneratedMessageLite<InputCollectionSet, InputCollectionSet.Builder> implements InputCollectionSetOrBuilder {
        public static final int INPUT_COLLECTION_FIELD_NUMBER = 1;
        private ProtobufList<InputCollection> inputCollection_ = emptyProtobufList();
        private static final InputCollectionSet DEFAULT_INSTANCE;
        private static volatile Parser<InputCollectionSet> PARSER;

        private InputCollectionSet() {
        }

        public List<InputCollection> getInputCollectionList() {
            return this.inputCollection_;
        }

        public List<? extends InputCollectionOrBuilder> getInputCollectionOrBuilderList() {
            return this.inputCollection_;
        }

        public int getInputCollectionCount() {
            return this.inputCollection_.size();
        }

        public InputCollection getInputCollection(int index) {
            return (InputCollection)this.inputCollection_.get(index);
        }

        public InputCollectionOrBuilder getInputCollectionOrBuilder(int index) {
            return (InputCollectionOrBuilder)this.inputCollection_.get(index);
        }

        private void ensureInputCollectionIsMutable() {
            ProtobufList<InputCollection> tmp = this.inputCollection_;
            if (!tmp.isModifiable()) {
                this.inputCollection_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setInputCollection(int index, InputCollection value) {
            value.getClass();
            this.ensureInputCollectionIsMutable();
            this.inputCollection_.set(index, value);
        }

        private void addInputCollection(InputCollection value) {
            value.getClass();
            this.ensureInputCollectionIsMutable();
            this.inputCollection_.add(value);
        }

        private void addInputCollection(int index, InputCollection value) {
            value.getClass();
            this.ensureInputCollectionIsMutable();
            this.inputCollection_.add(index, value);
        }

        private void addAllInputCollection(Iterable<? extends InputCollection> values) {
            this.ensureInputCollectionIsMutable();
            AbstractMessageLite.addAll(values, this.inputCollection_);
        }

        private void clearInputCollection() {
            this.inputCollection_ = emptyProtobufList();
        }

        private void removeInputCollection(int index) {
            this.ensureInputCollectionIsMutable();
            this.inputCollection_.remove(index);
        }

        public static InputCollectionSet parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputCollectionSet parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputCollectionSet parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputCollectionSet parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputCollectionSet parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputCollectionSet parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputCollectionSet parseFrom(InputStream input) throws IOException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputCollectionSet parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputCollectionSet parseDelimitedFrom(InputStream input) throws IOException {
            return (InputCollectionSet)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static InputCollectionSet parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputCollectionSet)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputCollectionSet parseFrom(CodedInputStream input) throws IOException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputCollectionSet parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputCollectionSet)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InputCollectionSet prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new InputCollectionSet();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"inputCollection_", InputCollection.class};
                    String info = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<InputCollectionSet> parser = PARSER;
                    if (parser == null) {
                        Class var5 = InputCollectionSet.class;
                        synchronized(InputCollectionSet.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = (Parser)parser;
                            }
                        }
                    }

                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static InputCollectionSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<InputCollectionSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            InputCollectionSet defaultInstance = new InputCollectionSet();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(InputCollectionSet.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<InputCollectionSet, Builder> implements InputCollectionSetOrBuilder {
            private Builder() {
                super(InputCollectionSet.DEFAULT_INSTANCE);
            }

            public List<InputCollection> getInputCollectionList() {
                return Collections.unmodifiableList(((InputCollectionSet)this.instance).getInputCollectionList());
            }

            public int getInputCollectionCount() {
                return ((InputCollectionSet)this.instance).getInputCollectionCount();
            }

            public InputCollection getInputCollection(int index) {
                return ((InputCollectionSet)this.instance).getInputCollection(index);
            }

            public Builder setInputCollection(int index, InputCollection value) {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).setInputCollection(index, value);
                return this;
            }

            public Builder setInputCollection(int index, InputCollection.Builder builderForValue) {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).setInputCollection(index, (InputCollection)builderForValue.build());
                return this;
            }

            public Builder addInputCollection(InputCollection value) {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).addInputCollection(value);
                return this;
            }

            public Builder addInputCollection(int index, InputCollection value) {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).addInputCollection(index, value);
                return this;
            }

            public Builder addInputCollection(InputCollection.Builder builderForValue) {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).addInputCollection((InputCollection)builderForValue.build());
                return this;
            }

            public Builder addInputCollection(int index, InputCollection.Builder builderForValue) {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).addInputCollection(index, (InputCollection)builderForValue.build());
                return this;
            }

            public Builder addAllInputCollection(Iterable<? extends InputCollection> values) {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).addAllInputCollection(values);
                return this;
            }

            public Builder clearInputCollection() {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).clearInputCollection();
                return this;
            }

            public Builder removeInputCollection(int index) {
                this.copyOnWrite();
                ((InputCollectionSet)this.instance).removeInputCollection(index);
                return this;
            }
        }
    }

    public interface InputCollectionSetOrBuilder extends MessageLiteOrBuilder {
        List<InputCollection> getInputCollectionList();

        InputCollection getInputCollection(int index);

        int getInputCollectionCount();
    }

    public static final class InputCollection extends GeneratedMessageLite<InputCollection, InputCollection.Builder> implements InputCollectionOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int SIDE_PACKET_NAME_FIELD_NUMBER = 2;
        private ProtobufList<String> sidePacketName_ = GeneratedMessageLite.emptyProtobufList();
        public static final int EXTERNAL_INPUT_NAME_FIELD_NUMBER = 1002;
        private ProtobufList<String> externalInputName_ = GeneratedMessageLite.emptyProtobufList();
        public static final int INPUT_TYPE_FIELD_NUMBER = 3;
        private int inputType_;
        public static final int FILE_NAME_FIELD_NUMBER = 4;
        private String fileName_ = "";
        private static final InputCollection DEFAULT_INSTANCE;
        private static volatile Parser<InputCollection> PARSER;

        private InputCollection() {
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        private void setName(String value) {
            Class<?> valueClass = value.getClass();
            this.name_ = value;
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.name_ = value.toStringUtf8();
        }

        public List<String> getSidePacketNameList() {
            return this.sidePacketName_;
        }

        public int getSidePacketNameCount() {
            return this.sidePacketName_.size();
        }

        public String getSidePacketName(int index) {
            return (String)this.sidePacketName_.get(index);
        }

        public ByteString getSidePacketNameBytes(int index) {
            return ByteString.copyFromUtf8((String)this.sidePacketName_.get(index));
        }

        private void ensureSidePacketNameIsMutable() {
            ProtobufList<String> tmp = this.sidePacketName_;
            if (!tmp.isModifiable()) {
                this.sidePacketName_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setSidePacketName(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureSidePacketNameIsMutable();
            this.sidePacketName_.set(index, value);
        }

        private void addSidePacketName(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureSidePacketNameIsMutable();
            this.sidePacketName_.add(value);
        }

        private void addAllSidePacketName(Iterable<String> values) {
            this.ensureSidePacketNameIsMutable();
            AbstractMessageLite.addAll(values, this.sidePacketName_);
        }

        private void clearSidePacketName() {
            this.sidePacketName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addSidePacketNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.ensureSidePacketNameIsMutable();
            this.sidePacketName_.add(value.toStringUtf8());
        }

        public List<String> getExternalInputNameList() {
            return this.externalInputName_;
        }

        public int getExternalInputNameCount() {
            return this.externalInputName_.size();
        }

        public String getExternalInputName(int index) {
            return (String)this.externalInputName_.get(index);
        }

        public ByteString getExternalInputNameBytes(int index) {
            return ByteString.copyFromUtf8((String)this.externalInputName_.get(index));
        }

        private void ensureExternalInputNameIsMutable() {
            ProtobufList<String> tmp = this.externalInputName_;
            if (!tmp.isModifiable()) {
                this.externalInputName_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setExternalInputName(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureExternalInputNameIsMutable();
            this.externalInputName_.set(index, value);
        }

        private void addExternalInputName(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureExternalInputNameIsMutable();
            this.externalInputName_.add(value);
        }

        private void addAllExternalInputName(Iterable<String> values) {
            this.ensureExternalInputNameIsMutable();
            AbstractMessageLite.addAll(values, this.externalInputName_);
        }

        private void clearExternalInputName() {
            this.externalInputName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addExternalInputNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.ensureExternalInputNameIsMutable();
            this.externalInputName_.add(value.toStringUtf8());
        }

        public int getInputTypeValue() {
            return this.inputType_;
        }

        public InputType getInputType() {
            InputType result = InputType.forNumber(this.inputType_);
            return result == null ? InputType.UNRECOGNIZED : result;
        }

        private void setInputTypeValue(int value) {
            this.inputType_ = value;
        }

        private void setInputType(InputType value) {
            this.inputType_ = value.getNumber();
        }

        private void clearInputType() {
            this.inputType_ = 0;
        }

        public String getFileName() {
            return this.fileName_;
        }

        public ByteString getFileNameBytes() {
            return ByteString.copyFromUtf8(this.fileName_);
        }

        private void setFileName(String value) {
            Class<?> valueClass = value.getClass();
            this.fileName_ = value;
        }

        private void clearFileName() {
            this.fileName_ = getDefaultInstance().getFileName();
        }

        private void setFileNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileName_ = value.toStringUtf8();
        }

        public static InputCollection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputCollection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputCollection parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputCollection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputCollection parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputCollection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputCollection parseFrom(InputStream input) throws IOException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputCollection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputCollection parseDelimitedFrom(InputStream input) throws IOException {
            return (InputCollection)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static InputCollection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputCollection)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputCollection parseFrom(CodedInputStream input) throws IOException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputCollection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InputCollection prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new InputCollection();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"name_", "sidePacketName_", "inputType_", "fileName_", "externalInputName_"};
                    String info = "\u0000\u0005\u0000\u0000\u0001Ϫ\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003\f\u0004ȈϪȚ";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<InputCollection> parser = PARSER;
                    if (parser == null) {
                        Class var5 = InputCollection.class;
                        synchronized(InputCollection.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = (Parser)parser;
                            }
                        }
                    }

                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static InputCollection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<InputCollection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            InputCollection defaultInstance = new InputCollection();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(InputCollection.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<InputCollection, Builder> implements InputCollectionOrBuilder {
            private Builder() {
                super(InputCollection.DEFAULT_INSTANCE);
            }

            public String getName() {
                return ((InputCollection)this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((InputCollection)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((InputCollection)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).setNameBytes(value);
                return this;
            }

            public List<String> getSidePacketNameList() {
                return Collections.unmodifiableList(((InputCollection)this.instance).getSidePacketNameList());
            }

            public int getSidePacketNameCount() {
                return ((InputCollection)this.instance).getSidePacketNameCount();
            }

            public String getSidePacketName(int index) {
                return ((InputCollection)this.instance).getSidePacketName(index);
            }

            public ByteString getSidePacketNameBytes(int index) {
                return ((InputCollection)this.instance).getSidePacketNameBytes(index);
            }

            public Builder setSidePacketName(int index, String value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).setSidePacketName(index, value);
                return this;
            }

            public Builder addSidePacketName(String value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).addSidePacketName(value);
                return this;
            }

            public Builder addAllSidePacketName(Iterable<String> values) {
                this.copyOnWrite();
                ((InputCollection)this.instance).addAllSidePacketName(values);
                return this;
            }

            public Builder clearSidePacketName() {
                this.copyOnWrite();
                ((InputCollection)this.instance).clearSidePacketName();
                return this;
            }

            public Builder addSidePacketNameBytes(ByteString value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).addSidePacketNameBytes(value);
                return this;
            }

            public List<String> getExternalInputNameList() {
                return Collections.unmodifiableList(((InputCollection)this.instance).getExternalInputNameList());
            }

            public int getExternalInputNameCount() {
                return ((InputCollection)this.instance).getExternalInputNameCount();
            }

            public String getExternalInputName(int index) {
                return ((InputCollection)this.instance).getExternalInputName(index);
            }

            public ByteString getExternalInputNameBytes(int index) {
                return ((InputCollection)this.instance).getExternalInputNameBytes(index);
            }

            public Builder setExternalInputName(int index, String value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).setExternalInputName(index, value);
                return this;
            }

            public Builder addExternalInputName(String value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).addExternalInputName(value);
                return this;
            }

            public Builder addAllExternalInputName(Iterable<String> values) {
                this.copyOnWrite();
                ((InputCollection)this.instance).addAllExternalInputName(values);
                return this;
            }

            public Builder clearExternalInputName() {
                this.copyOnWrite();
                ((InputCollection)this.instance).clearExternalInputName();
                return this;
            }

            public Builder addExternalInputNameBytes(ByteString value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).addExternalInputNameBytes(value);
                return this;
            }

            public int getInputTypeValue() {
                return ((InputCollection)this.instance).getInputTypeValue();
            }

            public Builder setInputTypeValue(int value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).setInputTypeValue(value);
                return this;
            }

            public InputType getInputType() {
                return ((InputCollection)this.instance).getInputType();
            }

            public Builder setInputType(InputType value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).setInputType(value);
                return this;
            }

            public Builder clearInputType() {
                this.copyOnWrite();
                ((InputCollection)this.instance).clearInputType();
                return this;
            }

            public String getFileName() {
                return ((InputCollection)this.instance).getFileName();
            }

            public ByteString getFileNameBytes() {
                return ((InputCollection)this.instance).getFileNameBytes();
            }

            public Builder setFileName(String value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).setFileName(value);
                return this;
            }

            public Builder clearFileName() {
                this.copyOnWrite();
                ((InputCollection)this.instance).clearFileName();
                return this;
            }

            public Builder setFileNameBytes(ByteString value) {
                this.copyOnWrite();
                ((InputCollection)this.instance).setFileNameBytes(value);
                return this;
            }
        }

        public static enum InputType implements EnumLite {
            UNKNOWN(0),
            RECORDIO(1),
            FOREIGN_RECORDIO(2),
            FOREIGN_CSV_TEXT(3),
            INVALID_UPPER_BOUND(4),
            UNRECOGNIZED(-1);

            public static final int UNKNOWN_VALUE = 0;
            public static final int RECORDIO_VALUE = 1;
            public static final int FOREIGN_RECORDIO_VALUE = 2;
            public static final int FOREIGN_CSV_TEXT_VALUE = 3;
            public static final int INVALID_UPPER_BOUND_VALUE = 4;
            private static final EnumLiteMap<InputType> internalValueMap = new EnumLiteMap<InputType>() {
                public InputType findValueByNumber(int number) {
                    return InputType.forNumber(number);
                }
            };
            private final int value;

            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } else {
                    return this.value;
                }
            }

            /** @deprecated */
            @Deprecated
            public static InputType valueOf(int value) {
                return forNumber(value);
            }

            public static InputType forNumber(int value) {
                switch(value) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return RECORDIO;
                    case 2:
                        return FOREIGN_RECORDIO;
                    case 3:
                        return FOREIGN_CSV_TEXT;
                    case 4:
                        return INVALID_UPPER_BOUND;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<InputType> internalGetValueMap() {
                return internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return InputTypeVerifier.INSTANCE;
            }

            private InputType(int value) {
                this.value = value;
            }

            private static final class InputTypeVerifier implements EnumVerifier {
                static final EnumVerifier INSTANCE = new InputTypeVerifier();

                private InputTypeVerifier() {
                }

                public boolean isInRange(int number) {
                    return InputType.forNumber(number) != null;
                }
            }
        }
    }

    public interface InputCollectionOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        List<String> getSidePacketNameList();

        int getSidePacketNameCount();

        String getSidePacketName(int index);

        ByteString getSidePacketNameBytes(int index);

        List<String> getExternalInputNameList();

        int getExternalInputNameCount();

        String getExternalInputName(int index);

        ByteString getExternalInputNameBytes(int index);

        int getInputTypeValue();

        InputCollection.InputType getInputType();

        String getFileName();

        ByteString getFileNameBytes();
    }

    public static final class ExecutorConfig extends GeneratedMessageLite<ExecutorConfig, ExecutorConfig.Builder> implements ExecutorConfigOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int TYPE_FIELD_NUMBER = 2;
        private String type_ = "";
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private MediaPipeOptions options_;
        private byte memoizedIsInitialized = 2;
        private static final ExecutorConfig DEFAULT_INSTANCE;
        private static volatile Parser<ExecutorConfig> PARSER;

        private ExecutorConfig() {
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        private void setName(String value) {
            Class<?> valueClass = value.getClass();
            this.name_ = value;
        }

        private void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.name_ = value.toStringUtf8();
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        private void setType(String value) {
            Class<?> valueClass = value.getClass();
            this.type_ = value;
        }

        private void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        private void setTypeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.type_ = value.toStringUtf8();
        }

        public boolean hasOptions() {
            return this.options_ != null;
        }

        public MediaPipeOptions getOptions() {
            return this.options_ == null ? MediaPipeOptions.getDefaultInstance() : this.options_;
        }

        private void setOptions(MediaPipeOptions value) {
            value.getClass();
            this.options_ = value;
        }

        private void mergeOptions(MediaPipeOptions value) {
            value.getClass();
            if (this.options_ != null && this.options_ != MediaPipeOptions.getDefaultInstance()) {
                this.options_ = (MediaPipeOptions)((MediaPipeOptions.Builder)MediaPipeOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            } else {
                this.options_ = value;
            }

        }

        private void clearOptions() {
            this.options_ = null;
        }

        public static ExecutorConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ExecutorConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ExecutorConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ExecutorConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ExecutorConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ExecutorConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ExecutorConfig parseFrom(InputStream input) throws IOException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ExecutorConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ExecutorConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (ExecutorConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ExecutorConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ExecutorConfig)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ExecutorConfig parseFrom(CodedInputStream input) throws IOException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ExecutorConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ExecutorConfig)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ExecutorConfig prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new ExecutorConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"name_", "type_", "options_"};
                    String info = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003Љ";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ExecutorConfig> parser = PARSER;
                    if (parser == null) {
                        Class var5 = ExecutorConfig.class;
                        synchronized(ExecutorConfig.class) {
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

        public static ExecutorConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ExecutorConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            ExecutorConfig defaultInstance = new ExecutorConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(ExecutorConfig.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ExecutorConfig, Builder> implements ExecutorConfigOrBuilder {
            private Builder() {
                super(ExecutorConfig.DEFAULT_INSTANCE);
            }

            public String getName() {
                return ((ExecutorConfig)this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((ExecutorConfig)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).setNameBytes(value);
                return this;
            }

            public String getType() {
                return ((ExecutorConfig)this.instance).getType();
            }

            public ByteString getTypeBytes() {
                return ((ExecutorConfig)this.instance).getTypeBytes();
            }

            public Builder setType(String value) {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).setType(value);
                return this;
            }

            public Builder clearType() {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).clearType();
                return this;
            }

            public Builder setTypeBytes(ByteString value) {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).setTypeBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((ExecutorConfig)this.instance).hasOptions();
            }

            public MediaPipeOptions getOptions() {
                return ((ExecutorConfig)this.instance).getOptions();
            }

            public Builder setOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MediaPipeOptions.Builder builderForValue) {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).setOptions((MediaPipeOptions)builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MediaPipeOptions value) {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((ExecutorConfig)this.instance).clearOptions();
                return this;
            }
        }
    }

    public interface ExecutorConfigOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        String getType();

        ByteString getTypeBytes();

        boolean hasOptions();

        MediaPipeOptions getOptions();
    }
}
