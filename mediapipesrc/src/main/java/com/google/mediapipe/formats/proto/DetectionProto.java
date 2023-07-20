//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.formats.proto;

import com.google.mediapipe.formats.proto.LocationDataProto.LocationData;
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
import com.google.protobuf.Internal.FloatList;
import com.google.protobuf.Internal.IntList;
import com.google.protobuf.Internal.ProtobufList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class DetectionProto {
    private DetectionProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class DetectionList extends GeneratedMessageLite<DetectionList, DetectionList.Builder> implements DetectionListOrBuilder {
        public static final int DETECTION_FIELD_NUMBER = 1;
        private ProtobufList<Detection> detection_ = emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private static final DetectionList DEFAULT_INSTANCE;
        private static volatile Parser<DetectionList> PARSER;

        private DetectionList() {
        }

        public List<Detection> getDetectionList() {
            return this.detection_;
        }

        public List<? extends DetectionOrBuilder> getDetectionOrBuilderList() {
            return this.detection_;
        }

        public int getDetectionCount() {
            return this.detection_.size();
        }

        public Detection getDetection(int index) {
            return (Detection)this.detection_.get(index);
        }

        public DetectionOrBuilder getDetectionOrBuilder(int index) {
            return (DetectionOrBuilder)this.detection_.get(index);
        }

        private void ensureDetectionIsMutable() {
            ProtobufList<Detection> tmp = this.detection_;
            if (!tmp.isModifiable()) {
                this.detection_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setDetection(int index, Detection value) {
            value.getClass();
            this.ensureDetectionIsMutable();
            this.detection_.set(index, value);
        }

        private void addDetection(Detection value) {
            value.getClass();
            this.ensureDetectionIsMutable();
            this.detection_.add(value);
        }

        private void addDetection(int index, Detection value) {
            value.getClass();
            this.ensureDetectionIsMutable();
            this.detection_.add(index, value);
        }

        private void addAllDetection(Iterable<? extends Detection> values) {
            this.ensureDetectionIsMutable();
            AbstractMessageLite.addAll(values, this.detection_);
        }

        private void clearDetection() {
            this.detection_ = emptyProtobufList();
        }

        private void removeDetection(int index) {
            this.ensureDetectionIsMutable();
            this.detection_.remove(index);
        }

        public static DetectionList parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DetectionList parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DetectionList parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DetectionList parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DetectionList parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DetectionList parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DetectionList parseFrom(InputStream input) throws IOException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DetectionList parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DetectionList parseDelimitedFrom(InputStream input) throws IOException {
            return (DetectionList)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DetectionList parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DetectionList)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DetectionList parseFrom(CodedInputStream input) throws IOException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DetectionList parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DetectionList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DetectionList prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new DetectionList();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"detection_", Detection.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<DetectionList> parser = PARSER;
                    if (parser == null) {
                        Class var5 = DetectionList.class;
                        synchronized(DetectionList.class) {
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

        public static DetectionList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DetectionList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            DetectionList defaultInstance = new DetectionList();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(DetectionList.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DetectionList, Builder> implements DetectionListOrBuilder {
            private Builder() {
                super(DetectionList.DEFAULT_INSTANCE);
            }

            public List<Detection> getDetectionList() {
                return Collections.unmodifiableList(((DetectionList)this.instance).getDetectionList());
            }

            public int getDetectionCount() {
                return ((DetectionList)this.instance).getDetectionCount();
            }

            public Detection getDetection(int index) {
                return ((DetectionList)this.instance).getDetection(index);
            }

            public Builder setDetection(int index, Detection value) {
                this.copyOnWrite();
                ((DetectionList)this.instance).setDetection(index, value);
                return this;
            }

            public Builder setDetection(int index, Detection.Builder builderForValue) {
                this.copyOnWrite();
                ((DetectionList)this.instance).setDetection(index, (Detection)builderForValue.build());
                return this;
            }

            public Builder addDetection(Detection value) {
                this.copyOnWrite();
                ((DetectionList)this.instance).addDetection(value);
                return this;
            }

            public Builder addDetection(int index, Detection value) {
                this.copyOnWrite();
                ((DetectionList)this.instance).addDetection(index, value);
                return this;
            }

            public Builder addDetection(Detection.Builder builderForValue) {
                this.copyOnWrite();
                ((DetectionList)this.instance).addDetection((Detection)builderForValue.build());
                return this;
            }

            public Builder addDetection(int index, Detection.Builder builderForValue) {
                this.copyOnWrite();
                ((DetectionList)this.instance).addDetection(index, (Detection)builderForValue.build());
                return this;
            }

            public Builder addAllDetection(Iterable<? extends Detection> values) {
                this.copyOnWrite();
                ((DetectionList)this.instance).addAllDetection(values);
                return this;
            }

            public Builder clearDetection() {
                this.copyOnWrite();
                ((DetectionList)this.instance).clearDetection();
                return this;
            }

            public Builder removeDetection(int index) {
                this.copyOnWrite();
                ((DetectionList)this.instance).removeDetection(index);
                return this;
            }
        }
    }

    public interface DetectionListOrBuilder extends MessageLiteOrBuilder {
        List<Detection> getDetectionList();

        Detection getDetection(int index);

        int getDetectionCount();
    }

    public static final class Detection extends GeneratedMessageLite<Detection, Detection.Builder> implements DetectionOrBuilder {
        private int bitField0_;
        public static final int LABEL_FIELD_NUMBER = 1;
        private ProtobufList<String> label_ = GeneratedMessageLite.emptyProtobufList();
        public static final int LABEL_ID_FIELD_NUMBER = 2;
        private IntList labelId_ = emptyIntList();
        private int labelIdMemoizedSerializedSize = -1;
        public static final int SCORE_FIELD_NUMBER = 3;
        private FloatList score_ = emptyFloatList();
        private int scoreMemoizedSerializedSize = -1;
        public static final int LOCATION_DATA_FIELD_NUMBER = 4;
        private LocationData locationData_;
        public static final int FEATURE_TAG_FIELD_NUMBER = 5;
        private String featureTag_ = "";
        public static final int TRACK_ID_FIELD_NUMBER = 6;
        private String trackId_ = "";
        public static final int DETECTION_ID_FIELD_NUMBER = 7;
        private long detectionId_;
        public static final int ASSOCIATED_DETECTIONS_FIELD_NUMBER = 8;
        private ProtobufList<AssociatedDetection> associatedDetections_ = emptyProtobufList();
        public static final int DISPLAY_NAME_FIELD_NUMBER = 9;
        private ProtobufList<String> displayName_ = GeneratedMessageLite.emptyProtobufList();
        public static final int TIMESTAMP_USEC_FIELD_NUMBER = 10;
        private long timestampUsec_;
        private byte memoizedIsInitialized = 2;
        private static final Detection DEFAULT_INSTANCE;
        private static volatile Parser<Detection> PARSER;

        private Detection() {
        }

        public List<String> getLabelList() {
            return this.label_;
        }

        public int getLabelCount() {
            return this.label_.size();
        }

        public String getLabel(int index) {
            return (String)this.label_.get(index);
        }

        public ByteString getLabelBytes(int index) {
            return ByteString.copyFromUtf8((String)this.label_.get(index));
        }

        private void ensureLabelIsMutable() {
            ProtobufList<String> tmp = this.label_;
            if (!tmp.isModifiable()) {
                this.label_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setLabel(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureLabelIsMutable();
            this.label_.set(index, value);
        }

        private void addLabel(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureLabelIsMutable();
            this.label_.add(value);
        }

        private void addAllLabel(Iterable<String> values) {
            this.ensureLabelIsMutable();
            AbstractMessageLite.addAll(values, this.label_);
        }

        private void clearLabel() {
            this.label_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addLabelBytes(ByteString value) {
            this.ensureLabelIsMutable();
            this.label_.add(value.toStringUtf8());
        }

        public List<Integer> getLabelIdList() {
            return this.labelId_;
        }

        public int getLabelIdCount() {
            return this.labelId_.size();
        }

        public int getLabelId(int index) {
            return this.labelId_.getInt(index);
        }

        private void ensureLabelIdIsMutable() {
            IntList tmp = this.labelId_;
            if (!tmp.isModifiable()) {
                this.labelId_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setLabelId(int index, int value) {
            this.ensureLabelIdIsMutable();
            this.labelId_.setInt(index, value);
        }

        private void addLabelId(int value) {
            this.ensureLabelIdIsMutable();
            this.labelId_.addInt(value);
        }

        private void addAllLabelId(Iterable<? extends Integer> values) {
            this.ensureLabelIdIsMutable();
            AbstractMessageLite.addAll(values, this.labelId_);
        }

        private void clearLabelId() {
            this.labelId_ = emptyIntList();
        }

        public List<Float> getScoreList() {
            return this.score_;
        }

        public int getScoreCount() {
            return this.score_.size();
        }

        public float getScore(int index) {
            return this.score_.getFloat(index);
        }

        private void ensureScoreIsMutable() {
            FloatList tmp = this.score_;
            if (!tmp.isModifiable()) {
                this.score_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setScore(int index, float value) {
            this.ensureScoreIsMutable();
            this.score_.setFloat(index, value);
        }

        private void addScore(float value) {
            this.ensureScoreIsMutable();
            this.score_.addFloat(value);
        }

        private void addAllScore(Iterable<? extends Float> values) {
            this.ensureScoreIsMutable();
            AbstractMessageLite.addAll(values, this.score_);
        }

        private void clearScore() {
            this.score_ = emptyFloatList();
        }

        public boolean hasLocationData() {
            return (this.bitField0_ & 1) != 0;
        }

        public LocationData getLocationData() {
            return this.locationData_ == null ? LocationData.getDefaultInstance() : this.locationData_;
        }

        private void setLocationData(LocationData value) {
            value.getClass();
            this.locationData_ = value;
            this.bitField0_ |= 1;
        }

        private void mergeLocationData(LocationData value) {
            value.getClass();
            if (this.locationData_ != null && this.locationData_ != LocationData.getDefaultInstance()) {
                this.locationData_ = (LocationData)((LocationData.Builder)LocationData.newBuilder(this.locationData_).mergeFrom(value)).buildPartial();
            } else {
                this.locationData_ = value;
            }

            this.bitField0_ |= 1;
        }

        private void clearLocationData() {
            this.locationData_ = null;
            this.bitField0_ &= -2;
        }

        public boolean hasFeatureTag() {
            return (this.bitField0_ & 2) != 0;
        }

        public String getFeatureTag() {
            return this.featureTag_;
        }

        public ByteString getFeatureTagBytes() {
            return ByteString.copyFromUtf8(this.featureTag_);
        }

        private void setFeatureTag(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 2;
            this.featureTag_ = value;
        }

        private void clearFeatureTag() {
            this.bitField0_ &= -3;
            this.featureTag_ = getDefaultInstance().getFeatureTag();
        }

        private void setFeatureTagBytes(ByteString value) {
            this.featureTag_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        public boolean hasTrackId() {
            return (this.bitField0_ & 4) != 0;
        }

        public String getTrackId() {
            return this.trackId_;
        }

        public ByteString getTrackIdBytes() {
            return ByteString.copyFromUtf8(this.trackId_);
        }

        private void setTrackId(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 4;
            this.trackId_ = value;
        }

        private void clearTrackId() {
            this.bitField0_ &= -5;
            this.trackId_ = getDefaultInstance().getTrackId();
        }

        private void setTrackIdBytes(ByteString value) {
            this.trackId_ = value.toStringUtf8();
            this.bitField0_ |= 4;
        }

        public boolean hasDetectionId() {
            return (this.bitField0_ & 8) != 0;
        }

        public long getDetectionId() {
            return this.detectionId_;
        }

        private void setDetectionId(long value) {
            this.bitField0_ |= 8;
            this.detectionId_ = value;
        }

        private void clearDetectionId() {
            this.bitField0_ &= -9;
            this.detectionId_ = 0L;
        }

        public List<AssociatedDetection> getAssociatedDetectionsList() {
            return this.associatedDetections_;
        }

        public List<? extends AssociatedDetectionOrBuilder> getAssociatedDetectionsOrBuilderList() {
            return this.associatedDetections_;
        }

        public int getAssociatedDetectionsCount() {
            return this.associatedDetections_.size();
        }

        public AssociatedDetection getAssociatedDetections(int index) {
            return (AssociatedDetection)this.associatedDetections_.get(index);
        }

        public AssociatedDetectionOrBuilder getAssociatedDetectionsOrBuilder(int index) {
            return (AssociatedDetectionOrBuilder)this.associatedDetections_.get(index);
        }

        private void ensureAssociatedDetectionsIsMutable() {
            ProtobufList<AssociatedDetection> tmp = this.associatedDetections_;
            if (!tmp.isModifiable()) {
                this.associatedDetections_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setAssociatedDetections(int index, AssociatedDetection value) {
            value.getClass();
            this.ensureAssociatedDetectionsIsMutable();
            this.associatedDetections_.set(index, value);
        }

        private void addAssociatedDetections(AssociatedDetection value) {
            value.getClass();
            this.ensureAssociatedDetectionsIsMutable();
            this.associatedDetections_.add(value);
        }

        private void addAssociatedDetections(int index, AssociatedDetection value) {
            value.getClass();
            this.ensureAssociatedDetectionsIsMutable();
            this.associatedDetections_.add(index, value);
        }

        private void addAllAssociatedDetections(Iterable<? extends AssociatedDetection> values) {
            this.ensureAssociatedDetectionsIsMutable();
            AbstractMessageLite.addAll(values, this.associatedDetections_);
        }

        private void clearAssociatedDetections() {
            this.associatedDetections_ = emptyProtobufList();
        }

        private void removeAssociatedDetections(int index) {
            this.ensureAssociatedDetectionsIsMutable();
            this.associatedDetections_.remove(index);
        }

        public List<String> getDisplayNameList() {
            return this.displayName_;
        }

        public int getDisplayNameCount() {
            return this.displayName_.size();
        }

        public String getDisplayName(int index) {
            return (String)this.displayName_.get(index);
        }

        public ByteString getDisplayNameBytes(int index) {
            return ByteString.copyFromUtf8((String)this.displayName_.get(index));
        }

        private void ensureDisplayNameIsMutable() {
            ProtobufList<String> tmp = this.displayName_;
            if (!tmp.isModifiable()) {
                this.displayName_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setDisplayName(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureDisplayNameIsMutable();
            this.displayName_.set(index, value);
        }

        private void addDisplayName(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureDisplayNameIsMutable();
            this.displayName_.add(value);
        }

        private void addAllDisplayName(Iterable<String> values) {
            this.ensureDisplayNameIsMutable();
            AbstractMessageLite.addAll(values, this.displayName_);
        }

        private void clearDisplayName() {
            this.displayName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addDisplayNameBytes(ByteString value) {
            this.ensureDisplayNameIsMutable();
            this.displayName_.add(value.toStringUtf8());
        }

        public boolean hasTimestampUsec() {
            return (this.bitField0_ & 16) != 0;
        }

        public long getTimestampUsec() {
            return this.timestampUsec_;
        }

        private void setTimestampUsec(long value) {
            this.bitField0_ |= 16;
            this.timestampUsec_ = value;
        }

        private void clearTimestampUsec() {
            this.bitField0_ &= -17;
            this.timestampUsec_ = 0L;
        }

        public static Detection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Detection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Detection parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Detection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Detection parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Detection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Detection parseFrom(InputStream input) throws IOException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Detection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Detection parseDelimitedFrom(InputStream input) throws IOException {
            return (Detection)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Detection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Detection)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Detection parseFrom(CodedInputStream input) throws IOException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Detection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Detection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Detection prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Detection();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "label_", "labelId_", "score_", "locationData_", "featureTag_", "trackId_", "detectionId_", "associatedDetections_", AssociatedDetection.class, "displayName_", "timestampUsec_"};
                    String info = "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0005\u0001\u0001\u001a\u0002'\u0003$\u0004ᐉ\u0000\u0005ဈ\u0001\u0006ဈ\u0002\u0007ဂ\u0003\b\u001b\t\u001a\nဂ\u0004";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Detection> parser = PARSER;
                    if (parser == null) {
                        Class var5 = Detection.class;
                        synchronized(Detection.class) {
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

        public static Detection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Detection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            Detection defaultInstance = new Detection();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Detection.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Detection, Builder> implements DetectionOrBuilder {
            private Builder() {
                super(Detection.DEFAULT_INSTANCE);
            }

            public List<String> getLabelList() {
                return Collections.unmodifiableList(((Detection)this.instance).getLabelList());
            }

            public int getLabelCount() {
                return ((Detection)this.instance).getLabelCount();
            }

            public String getLabel(int index) {
                return ((Detection)this.instance).getLabel(index);
            }

            public ByteString getLabelBytes(int index) {
                return ((Detection)this.instance).getLabelBytes(index);
            }

            public Builder setLabel(int index, String value) {
                this.copyOnWrite();
                ((Detection)this.instance).setLabel(index, value);
                return this;
            }

            public Builder addLabel(String value) {
                this.copyOnWrite();
                ((Detection)this.instance).addLabel(value);
                return this;
            }

            public Builder addAllLabel(Iterable<String> values) {
                this.copyOnWrite();
                ((Detection)this.instance).addAllLabel(values);
                return this;
            }

            public Builder clearLabel() {
                this.copyOnWrite();
                ((Detection)this.instance).clearLabel();
                return this;
            }

            public Builder addLabelBytes(ByteString value) {
                this.copyOnWrite();
                ((Detection)this.instance).addLabelBytes(value);
                return this;
            }

            public List<Integer> getLabelIdList() {
                return Collections.unmodifiableList(((Detection)this.instance).getLabelIdList());
            }

            public int getLabelIdCount() {
                return ((Detection)this.instance).getLabelIdCount();
            }

            public int getLabelId(int index) {
                return ((Detection)this.instance).getLabelId(index);
            }

            public Builder setLabelId(int index, int value) {
                this.copyOnWrite();
                ((Detection)this.instance).setLabelId(index, value);
                return this;
            }

            public Builder addLabelId(int value) {
                this.copyOnWrite();
                ((Detection)this.instance).addLabelId(value);
                return this;
            }

            public Builder addAllLabelId(Iterable<? extends Integer> values) {
                this.copyOnWrite();
                ((Detection)this.instance).addAllLabelId(values);
                return this;
            }

            public Builder clearLabelId() {
                this.copyOnWrite();
                ((Detection)this.instance).clearLabelId();
                return this;
            }

            public List<Float> getScoreList() {
                return Collections.unmodifiableList(((Detection)this.instance).getScoreList());
            }

            public int getScoreCount() {
                return ((Detection)this.instance).getScoreCount();
            }

            public float getScore(int index) {
                return ((Detection)this.instance).getScore(index);
            }

            public Builder setScore(int index, float value) {
                this.copyOnWrite();
                ((Detection)this.instance).setScore(index, value);
                return this;
            }

            public Builder addScore(float value) {
                this.copyOnWrite();
                ((Detection)this.instance).addScore(value);
                return this;
            }

            public Builder addAllScore(Iterable<? extends Float> values) {
                this.copyOnWrite();
                ((Detection)this.instance).addAllScore(values);
                return this;
            }

            public Builder clearScore() {
                this.copyOnWrite();
                ((Detection)this.instance).clearScore();
                return this;
            }

            public boolean hasLocationData() {
                return ((Detection)this.instance).hasLocationData();
            }

            public LocationData getLocationData() {
                return ((Detection)this.instance).getLocationData();
            }

            public Builder setLocationData(LocationData value) {
                this.copyOnWrite();
                ((Detection)this.instance).setLocationData(value);
                return this;
            }

            public Builder setLocationData(LocationData.Builder builderForValue) {
                this.copyOnWrite();
                ((Detection)this.instance).setLocationData((LocationData)builderForValue.build());
                return this;
            }

            public Builder mergeLocationData(LocationData value) {
                this.copyOnWrite();
                ((Detection)this.instance).mergeLocationData(value);
                return this;
            }

            public Builder clearLocationData() {
                this.copyOnWrite();
                ((Detection)this.instance).clearLocationData();
                return this;
            }

            public boolean hasFeatureTag() {
                return ((Detection)this.instance).hasFeatureTag();
            }

            public String getFeatureTag() {
                return ((Detection)this.instance).getFeatureTag();
            }

            public ByteString getFeatureTagBytes() {
                return ((Detection)this.instance).getFeatureTagBytes();
            }

            public Builder setFeatureTag(String value) {
                this.copyOnWrite();
                ((Detection)this.instance).setFeatureTag(value);
                return this;
            }

            public Builder clearFeatureTag() {
                this.copyOnWrite();
                ((Detection)this.instance).clearFeatureTag();
                return this;
            }

            public Builder setFeatureTagBytes(ByteString value) {
                this.copyOnWrite();
                ((Detection)this.instance).setFeatureTagBytes(value);
                return this;
            }

            public boolean hasTrackId() {
                return ((Detection)this.instance).hasTrackId();
            }

            public String getTrackId() {
                return ((Detection)this.instance).getTrackId();
            }

            public ByteString getTrackIdBytes() {
                return ((Detection)this.instance).getTrackIdBytes();
            }

            public Builder setTrackId(String value) {
                this.copyOnWrite();
                ((Detection)this.instance).setTrackId(value);
                return this;
            }

            public Builder clearTrackId() {
                this.copyOnWrite();
                ((Detection)this.instance).clearTrackId();
                return this;
            }

            public Builder setTrackIdBytes(ByteString value) {
                this.copyOnWrite();
                ((Detection)this.instance).setTrackIdBytes(value);
                return this;
            }

            public boolean hasDetectionId() {
                return ((Detection)this.instance).hasDetectionId();
            }

            public long getDetectionId() {
                return ((Detection)this.instance).getDetectionId();
            }

            public Builder setDetectionId(long value) {
                this.copyOnWrite();
                ((Detection)this.instance).setDetectionId(value);
                return this;
            }

            public Builder clearDetectionId() {
                this.copyOnWrite();
                ((Detection)this.instance).clearDetectionId();
                return this;
            }

            public List<AssociatedDetection> getAssociatedDetectionsList() {
                return Collections.unmodifiableList(((Detection)this.instance).getAssociatedDetectionsList());
            }

            public int getAssociatedDetectionsCount() {
                return ((Detection)this.instance).getAssociatedDetectionsCount();
            }

            public AssociatedDetection getAssociatedDetections(int index) {
                return ((Detection)this.instance).getAssociatedDetections(index);
            }

            public Builder setAssociatedDetections(int index, AssociatedDetection value) {
                this.copyOnWrite();
                ((Detection)this.instance).setAssociatedDetections(index, value);
                return this;
            }

            public Builder setAssociatedDetections(int index, AssociatedDetection.Builder builderForValue) {
                this.copyOnWrite();
                ((Detection)this.instance).setAssociatedDetections(index, (AssociatedDetection)builderForValue.build());
                return this;
            }

            public Builder addAssociatedDetections(AssociatedDetection value) {
                this.copyOnWrite();
                ((Detection)this.instance).addAssociatedDetections(value);
                return this;
            }

            public Builder addAssociatedDetections(int index, AssociatedDetection value) {
                this.copyOnWrite();
                ((Detection)this.instance).addAssociatedDetections(index, value);
                return this;
            }

            public Builder addAssociatedDetections(AssociatedDetection.Builder builderForValue) {
                this.copyOnWrite();
                ((Detection)this.instance).addAssociatedDetections((AssociatedDetection)builderForValue.build());
                return this;
            }

            public Builder addAssociatedDetections(int index, AssociatedDetection.Builder builderForValue) {
                this.copyOnWrite();
                ((Detection)this.instance).addAssociatedDetections(index, (AssociatedDetection)builderForValue.build());
                return this;
            }

            public Builder addAllAssociatedDetections(Iterable<? extends AssociatedDetection> values) {
                this.copyOnWrite();
                ((Detection)this.instance).addAllAssociatedDetections(values);
                return this;
            }

            public Builder clearAssociatedDetections() {
                this.copyOnWrite();
                ((Detection)this.instance).clearAssociatedDetections();
                return this;
            }

            public Builder removeAssociatedDetections(int index) {
                this.copyOnWrite();
                ((Detection)this.instance).removeAssociatedDetections(index);
                return this;
            }

            public List<String> getDisplayNameList() {
                return Collections.unmodifiableList(((Detection)this.instance).getDisplayNameList());
            }

            public int getDisplayNameCount() {
                return ((Detection)this.instance).getDisplayNameCount();
            }

            public String getDisplayName(int index) {
                return ((Detection)this.instance).getDisplayName(index);
            }

            public ByteString getDisplayNameBytes(int index) {
                return ((Detection)this.instance).getDisplayNameBytes(index);
            }

            public Builder setDisplayName(int index, String value) {
                this.copyOnWrite();
                ((Detection)this.instance).setDisplayName(index, value);
                return this;
            }

            public Builder addDisplayName(String value) {
                this.copyOnWrite();
                ((Detection)this.instance).addDisplayName(value);
                return this;
            }

            public Builder addAllDisplayName(Iterable<String> values) {
                this.copyOnWrite();
                ((Detection)this.instance).addAllDisplayName(values);
                return this;
            }

            public Builder clearDisplayName() {
                this.copyOnWrite();
                ((Detection)this.instance).clearDisplayName();
                return this;
            }

            public Builder addDisplayNameBytes(ByteString value) {
                this.copyOnWrite();
                ((Detection)this.instance).addDisplayNameBytes(value);
                return this;
            }

            public boolean hasTimestampUsec() {
                return ((Detection)this.instance).hasTimestampUsec();
            }

            public long getTimestampUsec() {
                return ((Detection)this.instance).getTimestampUsec();
            }

            public Builder setTimestampUsec(long value) {
                this.copyOnWrite();
                ((Detection)this.instance).setTimestampUsec(value);
                return this;
            }

            public Builder clearTimestampUsec() {
                this.copyOnWrite();
                ((Detection)this.instance).clearTimestampUsec();
                return this;
            }
        }

        public static final class AssociatedDetection extends GeneratedMessageLite<AssociatedDetection, AssociatedDetection.Builder> implements AssociatedDetectionOrBuilder {
            private int bitField0_;
            public static final int ID_FIELD_NUMBER = 1;
            private int id_;
            public static final int CONFIDENCE_FIELD_NUMBER = 2;
            private float confidence_;
            private static final AssociatedDetection DEFAULT_INSTANCE;
            private static volatile Parser<AssociatedDetection> PARSER;

            private AssociatedDetection() {
            }

            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            public int getId() {
                return this.id_;
            }

            private void setId(int value) {
                this.bitField0_ |= 1;
                this.id_ = value;
            }

            private void clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
            }

            public boolean hasConfidence() {
                return (this.bitField0_ & 2) != 0;
            }

            public float getConfidence() {
                return this.confidence_;
            }

            private void setConfidence(float value) {
                this.bitField0_ |= 2;
                this.confidence_ = value;
            }

            private void clearConfidence() {
                this.bitField0_ &= -3;
                this.confidence_ = 0.0F;
            }

            public static AssociatedDetection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static AssociatedDetection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static AssociatedDetection parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static AssociatedDetection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static AssociatedDetection parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static AssociatedDetection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static AssociatedDetection parseFrom(InputStream input) throws IOException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static AssociatedDetection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static AssociatedDetection parseDelimitedFrom(InputStream input) throws IOException {
                return (AssociatedDetection)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static AssociatedDetection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (AssociatedDetection)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static AssociatedDetection parseFrom(CodedInputStream input) throws IOException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static AssociatedDetection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (AssociatedDetection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(AssociatedDetection prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new AssociatedDetection();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "id_", "confidence_"};
                        String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<AssociatedDetection> parser = PARSER;
                        if (parser == null) {
                            Class var5 = AssociatedDetection.class;
                            synchronized(AssociatedDetection.class) {
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

            public static AssociatedDetection getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<AssociatedDetection> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                AssociatedDetection defaultInstance = new AssociatedDetection();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(AssociatedDetection.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<AssociatedDetection, Builder> implements AssociatedDetectionOrBuilder {
                private Builder() {
                    super(AssociatedDetection.DEFAULT_INSTANCE);
                }

                public boolean hasId() {
                    return ((AssociatedDetection)this.instance).hasId();
                }

                public int getId() {
                    return ((AssociatedDetection)this.instance).getId();
                }

                public Builder setId(int value) {
                    this.copyOnWrite();
                    ((AssociatedDetection)this.instance).setId(value);
                    return this;
                }

                public Builder clearId() {
                    this.copyOnWrite();
                    ((AssociatedDetection)this.instance).clearId();
                    return this;
                }

                public boolean hasConfidence() {
                    return ((AssociatedDetection)this.instance).hasConfidence();
                }

                public float getConfidence() {
                    return ((AssociatedDetection)this.instance).getConfidence();
                }

                public Builder setConfidence(float value) {
                    this.copyOnWrite();
                    ((AssociatedDetection)this.instance).setConfidence(value);
                    return this;
                }

                public Builder clearConfidence() {
                    this.copyOnWrite();
                    ((AssociatedDetection)this.instance).clearConfidence();
                    return this;
                }
            }
        }

        public interface AssociatedDetectionOrBuilder extends MessageLiteOrBuilder {
            boolean hasId();

            int getId();

            boolean hasConfidence();

            float getConfidence();
        }
    }

    public interface DetectionOrBuilder extends MessageLiteOrBuilder {
        List<String> getLabelList();

        int getLabelCount();

        String getLabel(int index);

        ByteString getLabelBytes(int index);

        List<Integer> getLabelIdList();

        int getLabelIdCount();

        int getLabelId(int index);

        List<Float> getScoreList();

        int getScoreCount();

        float getScore(int index);

        boolean hasLocationData();

        LocationData getLocationData();

        boolean hasFeatureTag();

        String getFeatureTag();

        ByteString getFeatureTagBytes();

        boolean hasTrackId();

        String getTrackId();

        ByteString getTrackIdBytes();

        boolean hasDetectionId();

        long getDetectionId();

        List<Detection.AssociatedDetection> getAssociatedDetectionsList();

        Detection.AssociatedDetection getAssociatedDetections(int index);

        int getAssociatedDetectionsCount();

        List<String> getDisplayNameList();

        int getDisplayNameCount();

        String getDisplayName(int index);

        ByteString getDisplayNameBytes(int index);

        boolean hasTimestampUsec();

        long getTimestampUsec();
    }
}
