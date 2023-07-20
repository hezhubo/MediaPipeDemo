//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.formats.proto;

import com.google.mediapipe.formats.annotation.proto.RasterizationProto.Rasterization;
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
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.Internal.ProtobufList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class LocationDataProto {
    private LocationDataProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class LocationData extends GeneratedMessageLite<LocationData, LocationData.Builder> implements LocationDataOrBuilder {
        private int bitField0_;
        public static final int FORMAT_FIELD_NUMBER = 1;
        private int format_;
        public static final int BOUNDING_BOX_FIELD_NUMBER = 2;
        private BoundingBox boundingBox_;
        public static final int RELATIVE_BOUNDING_BOX_FIELD_NUMBER = 3;
        private RelativeBoundingBox relativeBoundingBox_;
        public static final int MASK_FIELD_NUMBER = 4;
        private BinaryMask mask_;
        public static final int RELATIVE_KEYPOINTS_FIELD_NUMBER = 5;
        private ProtobufList<RelativeKeypoint> relativeKeypoints_ = emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private static final LocationData DEFAULT_INSTANCE;
        private static volatile Parser<LocationData> PARSER;

        private LocationData() {
        }

        public boolean hasFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        public Format getFormat() {
            Format result = Format.forNumber(this.format_);
            return result == null ? Format.GLOBAL : result;
        }

        private void setFormat(Format value) {
            this.format_ = value.getNumber();
            this.bitField0_ |= 1;
        }

        private void clearFormat() {
            this.bitField0_ &= -2;
            this.format_ = 0;
        }

        public boolean hasBoundingBox() {
            return (this.bitField0_ & 2) != 0;
        }

        public BoundingBox getBoundingBox() {
            return this.boundingBox_ == null ? BoundingBox.getDefaultInstance() : this.boundingBox_;
        }

        private void setBoundingBox(BoundingBox value) {
            value.getClass();
            this.boundingBox_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeBoundingBox(BoundingBox value) {
            value.getClass();
            if (this.boundingBox_ != null && this.boundingBox_ != BoundingBox.getDefaultInstance()) {
                this.boundingBox_ = (BoundingBox)((BoundingBox.Builder) BoundingBox.newBuilder(this.boundingBox_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.boundingBox_ = value;
            }

            this.bitField0_ |= 2;
        }

        private void clearBoundingBox() {
            this.boundingBox_ = null;
            this.bitField0_ &= -3;
        }

        public boolean hasRelativeBoundingBox() {
            return (this.bitField0_ & 4) != 0;
        }

        public RelativeBoundingBox getRelativeBoundingBox() {
            return this.relativeBoundingBox_ == null ? RelativeBoundingBox.getDefaultInstance() : this.relativeBoundingBox_;
        }

        private void setRelativeBoundingBox(RelativeBoundingBox value) {
            value.getClass();
            this.relativeBoundingBox_ = value;
            this.bitField0_ |= 4;
        }

        private void mergeRelativeBoundingBox(RelativeBoundingBox value) {
            value.getClass();
            if (this.relativeBoundingBox_ != null && this.relativeBoundingBox_ != RelativeBoundingBox.getDefaultInstance()) {
                this.relativeBoundingBox_ = (RelativeBoundingBox)((RelativeBoundingBox.Builder) RelativeBoundingBox.newBuilder(this.relativeBoundingBox_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.relativeBoundingBox_ = value;
            }

            this.bitField0_ |= 4;
        }

        private void clearRelativeBoundingBox() {
            this.relativeBoundingBox_ = null;
            this.bitField0_ &= -5;
        }

        public boolean hasMask() {
            return (this.bitField0_ & 8) != 0;
        }

        public BinaryMask getMask() {
            return this.mask_ == null ? BinaryMask.getDefaultInstance() : this.mask_;
        }

        private void setMask(BinaryMask value) {
            value.getClass();
            this.mask_ = value;
            this.bitField0_ |= 8;
        }

        private void mergeMask(BinaryMask value) {
            value.getClass();
            if (this.mask_ != null && this.mask_ != BinaryMask.getDefaultInstance()) {
                this.mask_ = (BinaryMask)((BinaryMask.Builder) BinaryMask.newBuilder(this.mask_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.mask_ = value;
            }

            this.bitField0_ |= 8;
        }

        private void clearMask() {
            this.mask_ = null;
            this.bitField0_ &= -9;
        }

        public List<RelativeKeypoint> getRelativeKeypointsList() {
            return this.relativeKeypoints_;
        }

        public List<? extends RelativeKeypointOrBuilder> getRelativeKeypointsOrBuilderList() {
            return this.relativeKeypoints_;
        }

        public int getRelativeKeypointsCount() {
            return this.relativeKeypoints_.size();
        }

        public RelativeKeypoint getRelativeKeypoints(int index) {
            return (RelativeKeypoint)this.relativeKeypoints_.get(index);
        }

        public RelativeKeypointOrBuilder getRelativeKeypointsOrBuilder(int index) {
            return (RelativeKeypointOrBuilder)this.relativeKeypoints_.get(index);
        }

        private void ensureRelativeKeypointsIsMutable() {
            ProtobufList<RelativeKeypoint> tmp = this.relativeKeypoints_;
            if (!tmp.isModifiable()) {
                this.relativeKeypoints_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setRelativeKeypoints(int index, RelativeKeypoint value) {
            value.getClass();
            this.ensureRelativeKeypointsIsMutable();
            this.relativeKeypoints_.set(index, value);
        }

        private void addRelativeKeypoints(RelativeKeypoint value) {
            value.getClass();
            this.ensureRelativeKeypointsIsMutable();
            this.relativeKeypoints_.add(value);
        }

        private void addRelativeKeypoints(int index, RelativeKeypoint value) {
            value.getClass();
            this.ensureRelativeKeypointsIsMutable();
            this.relativeKeypoints_.add(index, value);
        }

        private void addAllRelativeKeypoints(Iterable<? extends RelativeKeypoint> values) {
            this.ensureRelativeKeypointsIsMutable();
            AbstractMessageLite.addAll(values, this.relativeKeypoints_);
        }

        private void clearRelativeKeypoints() {
            this.relativeKeypoints_ = emptyProtobufList();
        }

        private void removeRelativeKeypoints(int index) {
            this.ensureRelativeKeypointsIsMutable();
            this.relativeKeypoints_.remove(index);
        }

        public static LocationData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LocationData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LocationData parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LocationData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LocationData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LocationData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LocationData parseFrom(InputStream input) throws IOException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LocationData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LocationData parseDelimitedFrom(InputStream input) throws IOException {
            return (LocationData)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static LocationData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LocationData)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LocationData parseFrom(CodedInputStream input) throws IOException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LocationData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LocationData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LocationData prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new LocationData();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "format_", Format.internalGetVerifier(), "boundingBox_", "relativeBoundingBox_", "mask_", "relativeKeypoints_", RelativeKeypoint.class};
                    String info = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<LocationData> parser = PARSER;
                    if (parser == null) {
                        Class var5 = LocationData.class;
                        synchronized(LocationData.class) {
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

        public static LocationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LocationData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            LocationData defaultInstance = new LocationData();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(LocationData.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<LocationData, Builder> implements LocationDataOrBuilder {
            private Builder() {
                super(LocationData.DEFAULT_INSTANCE);
            }

            public boolean hasFormat() {
                return ((LocationData)this.instance).hasFormat();
            }

            public Format getFormat() {
                return ((LocationData)this.instance).getFormat();
            }

            public Builder setFormat(Format value) {
                this.copyOnWrite();
                ((LocationData)this.instance).setFormat(value);
                return this;
            }

            public Builder clearFormat() {
                this.copyOnWrite();
                ((LocationData)this.instance).clearFormat();
                return this;
            }

            public boolean hasBoundingBox() {
                return ((LocationData)this.instance).hasBoundingBox();
            }

            public BoundingBox getBoundingBox() {
                return ((LocationData)this.instance).getBoundingBox();
            }

            public Builder setBoundingBox(BoundingBox value) {
                this.copyOnWrite();
                ((LocationData)this.instance).setBoundingBox(value);
                return this;
            }

            public Builder setBoundingBox(BoundingBox.Builder builderForValue) {
                this.copyOnWrite();
                ((LocationData)this.instance).setBoundingBox((BoundingBox)builderForValue.build());
                return this;
            }

            public Builder mergeBoundingBox(BoundingBox value) {
                this.copyOnWrite();
                ((LocationData)this.instance).mergeBoundingBox(value);
                return this;
            }

            public Builder clearBoundingBox() {
                this.copyOnWrite();
                ((LocationData)this.instance).clearBoundingBox();
                return this;
            }

            public boolean hasRelativeBoundingBox() {
                return ((LocationData)this.instance).hasRelativeBoundingBox();
            }

            public RelativeBoundingBox getRelativeBoundingBox() {
                return ((LocationData)this.instance).getRelativeBoundingBox();
            }

            public Builder setRelativeBoundingBox(RelativeBoundingBox value) {
                this.copyOnWrite();
                ((LocationData)this.instance).setRelativeBoundingBox(value);
                return this;
            }

            public Builder setRelativeBoundingBox(RelativeBoundingBox.Builder builderForValue) {
                this.copyOnWrite();
                ((LocationData)this.instance).setRelativeBoundingBox((RelativeBoundingBox)builderForValue.build());
                return this;
            }

            public Builder mergeRelativeBoundingBox(RelativeBoundingBox value) {
                this.copyOnWrite();
                ((LocationData)this.instance).mergeRelativeBoundingBox(value);
                return this;
            }

            public Builder clearRelativeBoundingBox() {
                this.copyOnWrite();
                ((LocationData)this.instance).clearRelativeBoundingBox();
                return this;
            }

            public boolean hasMask() {
                return ((LocationData)this.instance).hasMask();
            }

            public BinaryMask getMask() {
                return ((LocationData)this.instance).getMask();
            }

            public Builder setMask(BinaryMask value) {
                this.copyOnWrite();
                ((LocationData)this.instance).setMask(value);
                return this;
            }

            public Builder setMask(BinaryMask.Builder builderForValue) {
                this.copyOnWrite();
                ((LocationData)this.instance).setMask((BinaryMask)builderForValue.build());
                return this;
            }

            public Builder mergeMask(BinaryMask value) {
                this.copyOnWrite();
                ((LocationData)this.instance).mergeMask(value);
                return this;
            }

            public Builder clearMask() {
                this.copyOnWrite();
                ((LocationData)this.instance).clearMask();
                return this;
            }

            public List<RelativeKeypoint> getRelativeKeypointsList() {
                return Collections.unmodifiableList(((LocationData)this.instance).getRelativeKeypointsList());
            }

            public int getRelativeKeypointsCount() {
                return ((LocationData)this.instance).getRelativeKeypointsCount();
            }

            public RelativeKeypoint getRelativeKeypoints(int index) {
                return ((LocationData)this.instance).getRelativeKeypoints(index);
            }

            public Builder setRelativeKeypoints(int index, RelativeKeypoint value) {
                this.copyOnWrite();
                ((LocationData)this.instance).setRelativeKeypoints(index, value);
                return this;
            }

            public Builder setRelativeKeypoints(int index, RelativeKeypoint.Builder builderForValue) {
                this.copyOnWrite();
                ((LocationData)this.instance).setRelativeKeypoints(index, (RelativeKeypoint)builderForValue.build());
                return this;
            }

            public Builder addRelativeKeypoints(RelativeKeypoint value) {
                this.copyOnWrite();
                ((LocationData)this.instance).addRelativeKeypoints(value);
                return this;
            }

            public Builder addRelativeKeypoints(int index, RelativeKeypoint value) {
                this.copyOnWrite();
                ((LocationData)this.instance).addRelativeKeypoints(index, value);
                return this;
            }

            public Builder addRelativeKeypoints(RelativeKeypoint.Builder builderForValue) {
                this.copyOnWrite();
                ((LocationData)this.instance).addRelativeKeypoints((RelativeKeypoint)builderForValue.build());
                return this;
            }

            public Builder addRelativeKeypoints(int index, RelativeKeypoint.Builder builderForValue) {
                this.copyOnWrite();
                ((LocationData)this.instance).addRelativeKeypoints(index, (RelativeKeypoint)builderForValue.build());
                return this;
            }

            public Builder addAllRelativeKeypoints(Iterable<? extends RelativeKeypoint> values) {
                this.copyOnWrite();
                ((LocationData)this.instance).addAllRelativeKeypoints(values);
                return this;
            }

            public Builder clearRelativeKeypoints() {
                this.copyOnWrite();
                ((LocationData)this.instance).clearRelativeKeypoints();
                return this;
            }

            public Builder removeRelativeKeypoints(int index) {
                this.copyOnWrite();
                ((LocationData)this.instance).removeRelativeKeypoints(index);
                return this;
            }
        }

        public static final class RelativeKeypoint extends GeneratedMessageLite<RelativeKeypoint, RelativeKeypoint.Builder> implements RelativeKeypointOrBuilder {
            private int bitField0_;
            public static final int X_FIELD_NUMBER = 1;
            private float x_;
            public static final int Y_FIELD_NUMBER = 2;
            private float y_;
            public static final int KEYPOINT_LABEL_FIELD_NUMBER = 3;
            private String keypointLabel_ = "";
            public static final int SCORE_FIELD_NUMBER = 4;
            private float score_;
            private static final RelativeKeypoint DEFAULT_INSTANCE;
            private static volatile Parser<RelativeKeypoint> PARSER;

            private RelativeKeypoint() {
            }

            public boolean hasX() {
                return (this.bitField0_ & 1) != 0;
            }

            public float getX() {
                return this.x_;
            }

            private void setX(float value) {
                this.bitField0_ |= 1;
                this.x_ = value;
            }

            private void clearX() {
                this.bitField0_ &= -2;
                this.x_ = 0.0F;
            }

            public boolean hasY() {
                return (this.bitField0_ & 2) != 0;
            }

            public float getY() {
                return this.y_;
            }

            private void setY(float value) {
                this.bitField0_ |= 2;
                this.y_ = value;
            }

            private void clearY() {
                this.bitField0_ &= -3;
                this.y_ = 0.0F;
            }

            public boolean hasKeypointLabel() {
                return (this.bitField0_ & 4) != 0;
            }

            public String getKeypointLabel() {
                return this.keypointLabel_;
            }

            public ByteString getKeypointLabelBytes() {
                return ByteString.copyFromUtf8(this.keypointLabel_);
            }

            private void setKeypointLabel(String value) {
                Class<?> valueClass = value.getClass();
                this.bitField0_ |= 4;
                this.keypointLabel_ = value;
            }

            private void clearKeypointLabel() {
                this.bitField0_ &= -5;
                this.keypointLabel_ = getDefaultInstance().getKeypointLabel();
            }

            private void setKeypointLabelBytes(ByteString value) {
                this.keypointLabel_ = value.toStringUtf8();
                this.bitField0_ |= 4;
            }

            public boolean hasScore() {
                return (this.bitField0_ & 8) != 0;
            }

            public float getScore() {
                return this.score_;
            }

            private void setScore(float value) {
                this.bitField0_ |= 8;
                this.score_ = value;
            }

            private void clearScore() {
                this.bitField0_ &= -9;
                this.score_ = 0.0F;
            }

            public static RelativeKeypoint parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RelativeKeypoint parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RelativeKeypoint parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RelativeKeypoint parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RelativeKeypoint parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RelativeKeypoint parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RelativeKeypoint parseFrom(InputStream input) throws IOException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static RelativeKeypoint parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static RelativeKeypoint parseDelimitedFrom(InputStream input) throws IOException {
                return (RelativeKeypoint)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static RelativeKeypoint parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RelativeKeypoint)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static RelativeKeypoint parseFrom(CodedInputStream input) throws IOException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static RelativeKeypoint parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RelativeKeypoint)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(RelativeKeypoint prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new RelativeKeypoint();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "x_", "y_", "keypointLabel_", "score_"};
                        String info = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ခ\u0003";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<RelativeKeypoint> parser = PARSER;
                        if (parser == null) {
                            Class var5 = RelativeKeypoint.class;
                            synchronized(RelativeKeypoint.class) {
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

            public static RelativeKeypoint getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<RelativeKeypoint> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                RelativeKeypoint defaultInstance = new RelativeKeypoint();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(RelativeKeypoint.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<RelativeKeypoint, Builder> implements RelativeKeypointOrBuilder {
                private Builder() {
                    super(RelativeKeypoint.DEFAULT_INSTANCE);
                }

                public boolean hasX() {
                    return ((RelativeKeypoint)this.instance).hasX();
                }

                public float getX() {
                    return ((RelativeKeypoint)this.instance).getX();
                }

                public Builder setX(float value) {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).setX(value);
                    return this;
                }

                public Builder clearX() {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).clearX();
                    return this;
                }

                public boolean hasY() {
                    return ((RelativeKeypoint)this.instance).hasY();
                }

                public float getY() {
                    return ((RelativeKeypoint)this.instance).getY();
                }

                public Builder setY(float value) {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).setY(value);
                    return this;
                }

                public Builder clearY() {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).clearY();
                    return this;
                }

                public boolean hasKeypointLabel() {
                    return ((RelativeKeypoint)this.instance).hasKeypointLabel();
                }

                public String getKeypointLabel() {
                    return ((RelativeKeypoint)this.instance).getKeypointLabel();
                }

                public ByteString getKeypointLabelBytes() {
                    return ((RelativeKeypoint)this.instance).getKeypointLabelBytes();
                }

                public Builder setKeypointLabel(String value) {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).setKeypointLabel(value);
                    return this;
                }

                public Builder clearKeypointLabel() {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).clearKeypointLabel();
                    return this;
                }

                public Builder setKeypointLabelBytes(ByteString value) {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).setKeypointLabelBytes(value);
                    return this;
                }

                public boolean hasScore() {
                    return ((RelativeKeypoint)this.instance).hasScore();
                }

                public float getScore() {
                    return ((RelativeKeypoint)this.instance).getScore();
                }

                public Builder setScore(float value) {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).setScore(value);
                    return this;
                }

                public Builder clearScore() {
                    this.copyOnWrite();
                    ((RelativeKeypoint)this.instance).clearScore();
                    return this;
                }
            }
        }

        public interface RelativeKeypointOrBuilder extends MessageLiteOrBuilder {
            boolean hasX();

            float getX();

            boolean hasY();

            float getY();

            boolean hasKeypointLabel();

            String getKeypointLabel();

            ByteString getKeypointLabelBytes();

            boolean hasScore();

            float getScore();
        }

        public static final class BinaryMask extends GeneratedMessageLite<BinaryMask, BinaryMask.Builder> implements BinaryMaskOrBuilder {
            private int bitField0_;
            public static final int WIDTH_FIELD_NUMBER = 1;
            private int width_;
            public static final int HEIGHT_FIELD_NUMBER = 2;
            private int height_;
            public static final int RASTERIZATION_FIELD_NUMBER = 3;
            private Rasterization rasterization_;
            private byte memoizedIsInitialized = 2;
            private static final BinaryMask DEFAULT_INSTANCE;
            private static volatile Parser<BinaryMask> PARSER;

            private BinaryMask() {
            }

            public boolean hasWidth() {
                return (this.bitField0_ & 1) != 0;
            }

            public int getWidth() {
                return this.width_;
            }

            private void setWidth(int value) {
                this.bitField0_ |= 1;
                this.width_ = value;
            }

            private void clearWidth() {
                this.bitField0_ &= -2;
                this.width_ = 0;
            }

            public boolean hasHeight() {
                return (this.bitField0_ & 2) != 0;
            }

            public int getHeight() {
                return this.height_;
            }

            private void setHeight(int value) {
                this.bitField0_ |= 2;
                this.height_ = value;
            }

            private void clearHeight() {
                this.bitField0_ &= -3;
                this.height_ = 0;
            }

            public boolean hasRasterization() {
                return (this.bitField0_ & 4) != 0;
            }

            public Rasterization getRasterization() {
                return this.rasterization_ == null ? Rasterization.getDefaultInstance() : this.rasterization_;
            }

            private void setRasterization(Rasterization value) {
                value.getClass();
                this.rasterization_ = value;
                this.bitField0_ |= 4;
            }

            private void mergeRasterization(Rasterization value) {
                value.getClass();
                if (this.rasterization_ != null && this.rasterization_ != Rasterization.getDefaultInstance()) {
                    this.rasterization_ = (Rasterization)((Rasterization.Builder)Rasterization.newBuilder(this.rasterization_).mergeFrom(value)).buildPartial();
                } else {
                    this.rasterization_ = value;
                }

                this.bitField0_ |= 4;
            }

            private void clearRasterization() {
                this.rasterization_ = null;
                this.bitField0_ &= -5;
            }

            public static BinaryMask parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BinaryMask parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BinaryMask parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BinaryMask parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BinaryMask parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BinaryMask parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BinaryMask parseFrom(InputStream input) throws IOException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static BinaryMask parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static BinaryMask parseDelimitedFrom(InputStream input) throws IOException {
                return (BinaryMask)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static BinaryMask parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BinaryMask)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static BinaryMask parseFrom(CodedInputStream input) throws IOException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static BinaryMask parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BinaryMask)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(BinaryMask prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new BinaryMask();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "width_", "height_", "rasterization_"};
                        String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<BinaryMask> parser = PARSER;
                        if (parser == null) {
                            Class var5 = BinaryMask.class;
                            synchronized(BinaryMask.class) {
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

            public static BinaryMask getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<BinaryMask> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                BinaryMask defaultInstance = new BinaryMask();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(BinaryMask.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<BinaryMask, Builder> implements BinaryMaskOrBuilder {
                private Builder() {
                    super(BinaryMask.DEFAULT_INSTANCE);
                }

                public boolean hasWidth() {
                    return ((BinaryMask)this.instance).hasWidth();
                }

                public int getWidth() {
                    return ((BinaryMask)this.instance).getWidth();
                }

                public Builder setWidth(int value) {
                    this.copyOnWrite();
                    ((BinaryMask)this.instance).setWidth(value);
                    return this;
                }

                public Builder clearWidth() {
                    this.copyOnWrite();
                    ((BinaryMask)this.instance).clearWidth();
                    return this;
                }

                public boolean hasHeight() {
                    return ((BinaryMask)this.instance).hasHeight();
                }

                public int getHeight() {
                    return ((BinaryMask)this.instance).getHeight();
                }

                public Builder setHeight(int value) {
                    this.copyOnWrite();
                    ((BinaryMask)this.instance).setHeight(value);
                    return this;
                }

                public Builder clearHeight() {
                    this.copyOnWrite();
                    ((BinaryMask)this.instance).clearHeight();
                    return this;
                }

                public boolean hasRasterization() {
                    return ((BinaryMask)this.instance).hasRasterization();
                }

                public Rasterization getRasterization() {
                    return ((BinaryMask)this.instance).getRasterization();
                }

                public Builder setRasterization(Rasterization value) {
                    this.copyOnWrite();
                    ((BinaryMask)this.instance).setRasterization(value);
                    return this;
                }

                public Builder setRasterization(Rasterization.Builder builderForValue) {
                    this.copyOnWrite();
                    ((BinaryMask)this.instance).setRasterization((Rasterization)builderForValue.build());
                    return this;
                }

                public Builder mergeRasterization(Rasterization value) {
                    this.copyOnWrite();
                    ((BinaryMask)this.instance).mergeRasterization(value);
                    return this;
                }

                public Builder clearRasterization() {
                    this.copyOnWrite();
                    ((BinaryMask)this.instance).clearRasterization();
                    return this;
                }
            }
        }

        public interface BinaryMaskOrBuilder extends MessageLiteOrBuilder {
            boolean hasWidth();

            int getWidth();

            boolean hasHeight();

            int getHeight();

            boolean hasRasterization();

            Rasterization getRasterization();
        }

        public static final class RelativeBoundingBox extends GeneratedMessageLite<RelativeBoundingBox, RelativeBoundingBox.Builder> implements RelativeBoundingBoxOrBuilder {
            private int bitField0_;
            public static final int XMIN_FIELD_NUMBER = 1;
            private float xmin_;
            public static final int YMIN_FIELD_NUMBER = 2;
            private float ymin_;
            public static final int WIDTH_FIELD_NUMBER = 3;
            private float width_;
            public static final int HEIGHT_FIELD_NUMBER = 4;
            private float height_;
            private static final RelativeBoundingBox DEFAULT_INSTANCE;
            private static volatile Parser<RelativeBoundingBox> PARSER;

            private RelativeBoundingBox() {
            }

            public boolean hasXmin() {
                return (this.bitField0_ & 1) != 0;
            }

            public float getXmin() {
                return this.xmin_;
            }

            private void setXmin(float value) {
                this.bitField0_ |= 1;
                this.xmin_ = value;
            }

            private void clearXmin() {
                this.bitField0_ &= -2;
                this.xmin_ = 0.0F;
            }

            public boolean hasYmin() {
                return (this.bitField0_ & 2) != 0;
            }

            public float getYmin() {
                return this.ymin_;
            }

            private void setYmin(float value) {
                this.bitField0_ |= 2;
                this.ymin_ = value;
            }

            private void clearYmin() {
                this.bitField0_ &= -3;
                this.ymin_ = 0.0F;
            }

            public boolean hasWidth() {
                return (this.bitField0_ & 4) != 0;
            }

            public float getWidth() {
                return this.width_;
            }

            private void setWidth(float value) {
                this.bitField0_ |= 4;
                this.width_ = value;
            }

            private void clearWidth() {
                this.bitField0_ &= -5;
                this.width_ = 0.0F;
            }

            public boolean hasHeight() {
                return (this.bitField0_ & 8) != 0;
            }

            public float getHeight() {
                return this.height_;
            }

            private void setHeight(float value) {
                this.bitField0_ |= 8;
                this.height_ = value;
            }

            private void clearHeight() {
                this.bitField0_ &= -9;
                this.height_ = 0.0F;
            }

            public static RelativeBoundingBox parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RelativeBoundingBox parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RelativeBoundingBox parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RelativeBoundingBox parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RelativeBoundingBox parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RelativeBoundingBox parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RelativeBoundingBox parseFrom(InputStream input) throws IOException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static RelativeBoundingBox parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static RelativeBoundingBox parseDelimitedFrom(InputStream input) throws IOException {
                return (RelativeBoundingBox)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static RelativeBoundingBox parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RelativeBoundingBox)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static RelativeBoundingBox parseFrom(CodedInputStream input) throws IOException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static RelativeBoundingBox parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RelativeBoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(RelativeBoundingBox prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new RelativeBoundingBox();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "xmin_", "ymin_", "width_", "height_"};
                        String info = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<RelativeBoundingBox> parser = PARSER;
                        if (parser == null) {
                            Class var5 = RelativeBoundingBox.class;
                            synchronized(RelativeBoundingBox.class) {
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

            public static RelativeBoundingBox getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<RelativeBoundingBox> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                RelativeBoundingBox defaultInstance = new RelativeBoundingBox();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(RelativeBoundingBox.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<RelativeBoundingBox, Builder> implements RelativeBoundingBoxOrBuilder {
                private Builder() {
                    super(RelativeBoundingBox.DEFAULT_INSTANCE);
                }

                public boolean hasXmin() {
                    return ((RelativeBoundingBox)this.instance).hasXmin();
                }

                public float getXmin() {
                    return ((RelativeBoundingBox)this.instance).getXmin();
                }

                public Builder setXmin(float value) {
                    this.copyOnWrite();
                    ((RelativeBoundingBox)this.instance).setXmin(value);
                    return this;
                }

                public Builder clearXmin() {
                    this.copyOnWrite();
                    ((RelativeBoundingBox)this.instance).clearXmin();
                    return this;
                }

                public boolean hasYmin() {
                    return ((RelativeBoundingBox)this.instance).hasYmin();
                }

                public float getYmin() {
                    return ((RelativeBoundingBox)this.instance).getYmin();
                }

                public Builder setYmin(float value) {
                    this.copyOnWrite();
                    ((RelativeBoundingBox)this.instance).setYmin(value);
                    return this;
                }

                public Builder clearYmin() {
                    this.copyOnWrite();
                    ((RelativeBoundingBox)this.instance).clearYmin();
                    return this;
                }

                public boolean hasWidth() {
                    return ((RelativeBoundingBox)this.instance).hasWidth();
                }

                public float getWidth() {
                    return ((RelativeBoundingBox)this.instance).getWidth();
                }

                public Builder setWidth(float value) {
                    this.copyOnWrite();
                    ((RelativeBoundingBox)this.instance).setWidth(value);
                    return this;
                }

                public Builder clearWidth() {
                    this.copyOnWrite();
                    ((RelativeBoundingBox)this.instance).clearWidth();
                    return this;
                }

                public boolean hasHeight() {
                    return ((RelativeBoundingBox)this.instance).hasHeight();
                }

                public float getHeight() {
                    return ((RelativeBoundingBox)this.instance).getHeight();
                }

                public Builder setHeight(float value) {
                    this.copyOnWrite();
                    ((RelativeBoundingBox)this.instance).setHeight(value);
                    return this;
                }

                public Builder clearHeight() {
                    this.copyOnWrite();
                    ((RelativeBoundingBox)this.instance).clearHeight();
                    return this;
                }
            }
        }

        public interface RelativeBoundingBoxOrBuilder extends MessageLiteOrBuilder {
            boolean hasXmin();

            float getXmin();

            boolean hasYmin();

            float getYmin();

            boolean hasWidth();

            float getWidth();

            boolean hasHeight();

            float getHeight();
        }

        public static final class BoundingBox extends GeneratedMessageLite<BoundingBox, BoundingBox.Builder> implements BoundingBoxOrBuilder {
            private int bitField0_;
            public static final int XMIN_FIELD_NUMBER = 1;
            private int xmin_;
            public static final int YMIN_FIELD_NUMBER = 2;
            private int ymin_;
            public static final int WIDTH_FIELD_NUMBER = 3;
            private int width_;
            public static final int HEIGHT_FIELD_NUMBER = 4;
            private int height_;
            private static final BoundingBox DEFAULT_INSTANCE;
            private static volatile Parser<BoundingBox> PARSER;

            private BoundingBox() {
            }

            public boolean hasXmin() {
                return (this.bitField0_ & 1) != 0;
            }

            public int getXmin() {
                return this.xmin_;
            }

            private void setXmin(int value) {
                this.bitField0_ |= 1;
                this.xmin_ = value;
            }

            private void clearXmin() {
                this.bitField0_ &= -2;
                this.xmin_ = 0;
            }

            public boolean hasYmin() {
                return (this.bitField0_ & 2) != 0;
            }

            public int getYmin() {
                return this.ymin_;
            }

            private void setYmin(int value) {
                this.bitField0_ |= 2;
                this.ymin_ = value;
            }

            private void clearYmin() {
                this.bitField0_ &= -3;
                this.ymin_ = 0;
            }

            public boolean hasWidth() {
                return (this.bitField0_ & 4) != 0;
            }

            public int getWidth() {
                return this.width_;
            }

            private void setWidth(int value) {
                this.bitField0_ |= 4;
                this.width_ = value;
            }

            private void clearWidth() {
                this.bitField0_ &= -5;
                this.width_ = 0;
            }

            public boolean hasHeight() {
                return (this.bitField0_ & 8) != 0;
            }

            public int getHeight() {
                return this.height_;
            }

            private void setHeight(int value) {
                this.bitField0_ |= 8;
                this.height_ = value;
            }

            private void clearHeight() {
                this.bitField0_ &= -9;
                this.height_ = 0;
            }

            public static BoundingBox parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BoundingBox parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BoundingBox parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BoundingBox parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BoundingBox parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BoundingBox parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BoundingBox parseFrom(InputStream input) throws IOException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static BoundingBox parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static BoundingBox parseDelimitedFrom(InputStream input) throws IOException {
                return (BoundingBox)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static BoundingBox parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BoundingBox)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static BoundingBox parseFrom(CodedInputStream input) throws IOException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static BoundingBox parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BoundingBox)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(BoundingBox prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new BoundingBox();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "xmin_", "ymin_", "width_", "height_"};
                        String info = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<BoundingBox> parser = PARSER;
                        if (parser == null) {
                            Class var5 = BoundingBox.class;
                            synchronized(BoundingBox.class) {
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

            public static BoundingBox getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<BoundingBox> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                BoundingBox defaultInstance = new BoundingBox();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(BoundingBox.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<BoundingBox, Builder> implements BoundingBoxOrBuilder {
                private Builder() {
                    super(BoundingBox.DEFAULT_INSTANCE);
                }

                public boolean hasXmin() {
                    return ((BoundingBox)this.instance).hasXmin();
                }

                public int getXmin() {
                    return ((BoundingBox)this.instance).getXmin();
                }

                public Builder setXmin(int value) {
                    this.copyOnWrite();
                    ((BoundingBox)this.instance).setXmin(value);
                    return this;
                }

                public Builder clearXmin() {
                    this.copyOnWrite();
                    ((BoundingBox)this.instance).clearXmin();
                    return this;
                }

                public boolean hasYmin() {
                    return ((BoundingBox)this.instance).hasYmin();
                }

                public int getYmin() {
                    return ((BoundingBox)this.instance).getYmin();
                }

                public Builder setYmin(int value) {
                    this.copyOnWrite();
                    ((BoundingBox)this.instance).setYmin(value);
                    return this;
                }

                public Builder clearYmin() {
                    this.copyOnWrite();
                    ((BoundingBox)this.instance).clearYmin();
                    return this;
                }

                public boolean hasWidth() {
                    return ((BoundingBox)this.instance).hasWidth();
                }

                public int getWidth() {
                    return ((BoundingBox)this.instance).getWidth();
                }

                public Builder setWidth(int value) {
                    this.copyOnWrite();
                    ((BoundingBox)this.instance).setWidth(value);
                    return this;
                }

                public Builder clearWidth() {
                    this.copyOnWrite();
                    ((BoundingBox)this.instance).clearWidth();
                    return this;
                }

                public boolean hasHeight() {
                    return ((BoundingBox)this.instance).hasHeight();
                }

                public int getHeight() {
                    return ((BoundingBox)this.instance).getHeight();
                }

                public Builder setHeight(int value) {
                    this.copyOnWrite();
                    ((BoundingBox)this.instance).setHeight(value);
                    return this;
                }

                public Builder clearHeight() {
                    this.copyOnWrite();
                    ((BoundingBox)this.instance).clearHeight();
                    return this;
                }
            }
        }

        public interface BoundingBoxOrBuilder extends MessageLiteOrBuilder {
            boolean hasXmin();

            int getXmin();

            boolean hasYmin();

            int getYmin();

            boolean hasWidth();

            int getWidth();

            boolean hasHeight();

            int getHeight();
        }

        public static enum Format implements EnumLite {
            GLOBAL(0),
            BOUNDING_BOX(1),
            RELATIVE_BOUNDING_BOX(2),
            MASK(3);

            public static final int GLOBAL_VALUE = 0;
            public static final int BOUNDING_BOX_VALUE = 1;
            public static final int RELATIVE_BOUNDING_BOX_VALUE = 2;
            public static final int MASK_VALUE = 3;
            private static final EnumLiteMap<Format> internalValueMap = new EnumLiteMap<Format>() {
                public Format findValueByNumber(int number) {
                    return Format.forNumber(number);
                }
            };
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            /** @deprecated */
            @Deprecated
            public static Format valueOf(int value) {
                return forNumber(value);
            }

            public static Format forNumber(int value) {
                switch(value) {
                    case 0:
                        return GLOBAL;
                    case 1:
                        return BOUNDING_BOX;
                    case 2:
                        return RELATIVE_BOUNDING_BOX;
                    case 3:
                        return MASK;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<Format> internalGetValueMap() {
                return internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return FormatVerifier.INSTANCE;
            }

            private Format(int value) {
                this.value = value;
            }

            private static final class FormatVerifier implements EnumVerifier {
                static final EnumVerifier INSTANCE = new FormatVerifier();

                private FormatVerifier() {
                }

                public boolean isInRange(int number) {
                    return Format.forNumber(number) != null;
                }
            }
        }
    }

    public interface LocationDataOrBuilder extends MessageLiteOrBuilder {
        boolean hasFormat();

        LocationData.Format getFormat();

        boolean hasBoundingBox();

        LocationData.BoundingBox getBoundingBox();

        boolean hasRelativeBoundingBox();

        LocationData.RelativeBoundingBox getRelativeBoundingBox();

        boolean hasMask();

        LocationData.BinaryMask getMask();

        List<LocationData.RelativeKeypoint> getRelativeKeypointsList();

        LocationData.RelativeKeypoint getRelativeKeypoints(int index);

        int getRelativeKeypointsCount();
    }
}
