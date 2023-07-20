//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.formats.proto;

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

public final class LandmarkProto {
    private LandmarkProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class NormalizedLandmarkListCollection extends GeneratedMessageLite<NormalizedLandmarkListCollection, NormalizedLandmarkListCollection.Builder> implements NormalizedLandmarkListCollectionOrBuilder {
        public static final int LANDMARK_LIST_FIELD_NUMBER = 1;
        private ProtobufList<NormalizedLandmarkList> landmarkList_ = emptyProtobufList();
        private static final NormalizedLandmarkListCollection DEFAULT_INSTANCE;
        private static volatile Parser<NormalizedLandmarkListCollection> PARSER;

        private NormalizedLandmarkListCollection() {
        }

        public List<NormalizedLandmarkList> getLandmarkListList() {
            return this.landmarkList_;
        }

        public List<? extends NormalizedLandmarkListOrBuilder> getLandmarkListOrBuilderList() {
            return this.landmarkList_;
        }

        public int getLandmarkListCount() {
            return this.landmarkList_.size();
        }

        public NormalizedLandmarkList getLandmarkList(int index) {
            return (NormalizedLandmarkList)this.landmarkList_.get(index);
        }

        public NormalizedLandmarkListOrBuilder getLandmarkListOrBuilder(int index) {
            return (NormalizedLandmarkListOrBuilder)this.landmarkList_.get(index);
        }

        private void ensureLandmarkListIsMutable() {
            ProtobufList<NormalizedLandmarkList> tmp = this.landmarkList_;
            if (!tmp.isModifiable()) {
                this.landmarkList_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setLandmarkList(int index, NormalizedLandmarkList value) {
            value.getClass();
            this.ensureLandmarkListIsMutable();
            this.landmarkList_.set(index, value);
        }

        private void addLandmarkList(NormalizedLandmarkList value) {
            value.getClass();
            this.ensureLandmarkListIsMutable();
            this.landmarkList_.add(value);
        }

        private void addLandmarkList(int index, NormalizedLandmarkList value) {
            value.getClass();
            this.ensureLandmarkListIsMutable();
            this.landmarkList_.add(index, value);
        }

        private void addAllLandmarkList(Iterable<? extends NormalizedLandmarkList> values) {
            this.ensureLandmarkListIsMutable();
            AbstractMessageLite.addAll(values, this.landmarkList_);
        }

        private void clearLandmarkList() {
            this.landmarkList_ = emptyProtobufList();
        }

        private void removeLandmarkList(int index) {
            this.ensureLandmarkListIsMutable();
            this.landmarkList_.remove(index);
        }

        public static NormalizedLandmarkListCollection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmarkListCollection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmarkListCollection parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmarkListCollection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmarkListCollection parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmarkListCollection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmarkListCollection parseFrom(InputStream input) throws IOException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmarkListCollection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NormalizedLandmarkListCollection parseDelimitedFrom(InputStream input) throws IOException {
            return (NormalizedLandmarkListCollection)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmarkListCollection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmarkListCollection)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NormalizedLandmarkListCollection parseFrom(CodedInputStream input) throws IOException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmarkListCollection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(NormalizedLandmarkListCollection prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new NormalizedLandmarkListCollection();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"landmarkList_", NormalizedLandmarkList.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NormalizedLandmarkListCollection> parser = PARSER;
                    if (parser == null) {
                        Class var5 = NormalizedLandmarkListCollection.class;
                        synchronized(NormalizedLandmarkListCollection.class) {
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

        public static NormalizedLandmarkListCollection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NormalizedLandmarkListCollection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            NormalizedLandmarkListCollection defaultInstance = new NormalizedLandmarkListCollection();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(NormalizedLandmarkListCollection.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<NormalizedLandmarkListCollection, Builder> implements NormalizedLandmarkListCollectionOrBuilder {
            private Builder() {
                super(NormalizedLandmarkListCollection.DEFAULT_INSTANCE);
            }

            public List<NormalizedLandmarkList> getLandmarkListList() {
                return Collections.unmodifiableList(((NormalizedLandmarkListCollection)this.instance).getLandmarkListList());
            }

            public int getLandmarkListCount() {
                return ((NormalizedLandmarkListCollection)this.instance).getLandmarkListCount();
            }

            public NormalizedLandmarkList getLandmarkList(int index) {
                return ((NormalizedLandmarkListCollection)this.instance).getLandmarkList(index);
            }

            public Builder setLandmarkList(int index, NormalizedLandmarkList value) {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).setLandmarkList(index, value);
                return this;
            }

            public Builder setLandmarkList(int index, NormalizedLandmarkList.Builder builderForValue) {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).setLandmarkList(index, (NormalizedLandmarkList)builderForValue.build());
                return this;
            }

            public Builder addLandmarkList(NormalizedLandmarkList value) {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).addLandmarkList(value);
                return this;
            }

            public Builder addLandmarkList(int index, NormalizedLandmarkList value) {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).addLandmarkList(index, value);
                return this;
            }

            public Builder addLandmarkList(NormalizedLandmarkList.Builder builderForValue) {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).addLandmarkList((NormalizedLandmarkList)builderForValue.build());
                return this;
            }

            public Builder addLandmarkList(int index, NormalizedLandmarkList.Builder builderForValue) {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).addLandmarkList(index, (NormalizedLandmarkList)builderForValue.build());
                return this;
            }

            public Builder addAllLandmarkList(Iterable<? extends NormalizedLandmarkList> values) {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).addAllLandmarkList(values);
                return this;
            }

            public Builder clearLandmarkList() {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).clearLandmarkList();
                return this;
            }

            public Builder removeLandmarkList(int index) {
                this.copyOnWrite();
                ((NormalizedLandmarkListCollection)this.instance).removeLandmarkList(index);
                return this;
            }
        }
    }

    public interface NormalizedLandmarkListCollectionOrBuilder extends MessageLiteOrBuilder {
        List<NormalizedLandmarkList> getLandmarkListList();

        NormalizedLandmarkList getLandmarkList(int index);

        int getLandmarkListCount();
    }

    public static final class NormalizedLandmarkList extends GeneratedMessageLite<NormalizedLandmarkList, NormalizedLandmarkList.Builder> implements NormalizedLandmarkListOrBuilder {
        public static final int LANDMARK_FIELD_NUMBER = 1;
        private ProtobufList<NormalizedLandmark> landmark_ = emptyProtobufList();
        private static final NormalizedLandmarkList DEFAULT_INSTANCE;
        private static volatile Parser<NormalizedLandmarkList> PARSER;

        private NormalizedLandmarkList() {
        }

        public List<NormalizedLandmark> getLandmarkList() {
            return this.landmark_;
        }

        public List<? extends NormalizedLandmarkOrBuilder> getLandmarkOrBuilderList() {
            return this.landmark_;
        }

        public int getLandmarkCount() {
            return this.landmark_.size();
        }

        public NormalizedLandmark getLandmark(int index) {
            return (NormalizedLandmark)this.landmark_.get(index);
        }

        public NormalizedLandmarkOrBuilder getLandmarkOrBuilder(int index) {
            return (NormalizedLandmarkOrBuilder)this.landmark_.get(index);
        }

        private void ensureLandmarkIsMutable() {
            ProtobufList<NormalizedLandmark> tmp = this.landmark_;
            if (!tmp.isModifiable()) {
                this.landmark_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setLandmark(int index, NormalizedLandmark value) {
            value.getClass();
            this.ensureLandmarkIsMutable();
            this.landmark_.set(index, value);
        }

        private void addLandmark(NormalizedLandmark value) {
            value.getClass();
            this.ensureLandmarkIsMutable();
            this.landmark_.add(value);
        }

        private void addLandmark(int index, NormalizedLandmark value) {
            value.getClass();
            this.ensureLandmarkIsMutable();
            this.landmark_.add(index, value);
        }

        private void addAllLandmark(Iterable<? extends NormalizedLandmark> values) {
            this.ensureLandmarkIsMutable();
            AbstractMessageLite.addAll(values, this.landmark_);
        }

        private void clearLandmark() {
            this.landmark_ = emptyProtobufList();
        }

        private void removeLandmark(int index) {
            this.ensureLandmarkIsMutable();
            this.landmark_.remove(index);
        }

        public static NormalizedLandmarkList parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmarkList parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmarkList parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmarkList parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmarkList parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmarkList parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmarkList parseFrom(InputStream input) throws IOException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmarkList parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NormalizedLandmarkList parseDelimitedFrom(InputStream input) throws IOException {
            return (NormalizedLandmarkList)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmarkList parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmarkList)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NormalizedLandmarkList parseFrom(CodedInputStream input) throws IOException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmarkList parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(NormalizedLandmarkList prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new NormalizedLandmarkList();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"landmark_", NormalizedLandmark.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NormalizedLandmarkList> parser = PARSER;
                    if (parser == null) {
                        Class var5 = NormalizedLandmarkList.class;
                        synchronized(NormalizedLandmarkList.class) {
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

        public static NormalizedLandmarkList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NormalizedLandmarkList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            NormalizedLandmarkList defaultInstance = new NormalizedLandmarkList();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(NormalizedLandmarkList.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<NormalizedLandmarkList, Builder> implements NormalizedLandmarkListOrBuilder {
            private Builder() {
                super(NormalizedLandmarkList.DEFAULT_INSTANCE);
            }

            public List<NormalizedLandmark> getLandmarkList() {
                return Collections.unmodifiableList(((NormalizedLandmarkList)this.instance).getLandmarkList());
            }

            public int getLandmarkCount() {
                return ((NormalizedLandmarkList)this.instance).getLandmarkCount();
            }

            public NormalizedLandmark getLandmark(int index) {
                return ((NormalizedLandmarkList)this.instance).getLandmark(index);
            }

            public Builder setLandmark(int index, NormalizedLandmark value) {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).setLandmark(index, value);
                return this;
            }

            public Builder setLandmark(int index, NormalizedLandmark.Builder builderForValue) {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).setLandmark(index, (NormalizedLandmark)builderForValue.build());
                return this;
            }

            public Builder addLandmark(NormalizedLandmark value) {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).addLandmark(value);
                return this;
            }

            public Builder addLandmark(int index, NormalizedLandmark value) {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).addLandmark(index, value);
                return this;
            }

            public Builder addLandmark(NormalizedLandmark.Builder builderForValue) {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).addLandmark((NormalizedLandmark)builderForValue.build());
                return this;
            }

            public Builder addLandmark(int index, NormalizedLandmark.Builder builderForValue) {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).addLandmark(index, (NormalizedLandmark)builderForValue.build());
                return this;
            }

            public Builder addAllLandmark(Iterable<? extends NormalizedLandmark> values) {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).addAllLandmark(values);
                return this;
            }

            public Builder clearLandmark() {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).clearLandmark();
                return this;
            }

            public Builder removeLandmark(int index) {
                this.copyOnWrite();
                ((NormalizedLandmarkList)this.instance).removeLandmark(index);
                return this;
            }
        }
    }

    public interface NormalizedLandmarkListOrBuilder extends MessageLiteOrBuilder {
        List<NormalizedLandmark> getLandmarkList();

        NormalizedLandmark getLandmark(int index);

        int getLandmarkCount();
    }

    public static final class NormalizedLandmark extends GeneratedMessageLite<NormalizedLandmark, NormalizedLandmark.Builder> implements NormalizedLandmarkOrBuilder {
        private int bitField0_;
        public static final int X_FIELD_NUMBER = 1;
        private float x_;
        public static final int Y_FIELD_NUMBER = 2;
        private float y_;
        public static final int Z_FIELD_NUMBER = 3;
        private float z_;
        public static final int VISIBILITY_FIELD_NUMBER = 4;
        private float visibility_;
        public static final int PRESENCE_FIELD_NUMBER = 5;
        private float presence_;
        private static final NormalizedLandmark DEFAULT_INSTANCE;
        private static volatile Parser<NormalizedLandmark> PARSER;

        private NormalizedLandmark() {
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

        public boolean hasZ() {
            return (this.bitField0_ & 4) != 0;
        }

        public float getZ() {
            return this.z_;
        }

        private void setZ(float value) {
            this.bitField0_ |= 4;
            this.z_ = value;
        }

        private void clearZ() {
            this.bitField0_ &= -5;
            this.z_ = 0.0F;
        }

        public boolean hasVisibility() {
            return (this.bitField0_ & 8) != 0;
        }

        public float getVisibility() {
            return this.visibility_;
        }

        private void setVisibility(float value) {
            this.bitField0_ |= 8;
            this.visibility_ = value;
        }

        private void clearVisibility() {
            this.bitField0_ &= -9;
            this.visibility_ = 0.0F;
        }

        public boolean hasPresence() {
            return (this.bitField0_ & 16) != 0;
        }

        public float getPresence() {
            return this.presence_;
        }

        private void setPresence(float value) {
            this.bitField0_ |= 16;
            this.presence_ = value;
        }

        private void clearPresence() {
            this.bitField0_ &= -17;
            this.presence_ = 0.0F;
        }

        public static NormalizedLandmark parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmark parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmark parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmark parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmark parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NormalizedLandmark parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NormalizedLandmark parseFrom(InputStream input) throws IOException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmark parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NormalizedLandmark parseDelimitedFrom(InputStream input) throws IOException {
            return (NormalizedLandmark)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmark parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmark)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NormalizedLandmark parseFrom(CodedInputStream input) throws IOException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NormalizedLandmark parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NormalizedLandmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(NormalizedLandmark prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new NormalizedLandmark();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "x_", "y_", "z_", "visibility_", "presence_"};
                    String info = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<NormalizedLandmark> parser = PARSER;
                    if (parser == null) {
                        Class var5 = NormalizedLandmark.class;
                        synchronized(NormalizedLandmark.class) {
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

        public static NormalizedLandmark getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<NormalizedLandmark> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            NormalizedLandmark defaultInstance = new NormalizedLandmark();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(NormalizedLandmark.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<NormalizedLandmark, Builder> implements NormalizedLandmarkOrBuilder {
            private Builder() {
                super(NormalizedLandmark.DEFAULT_INSTANCE);
            }

            public boolean hasX() {
                return ((NormalizedLandmark)this.instance).hasX();
            }

            public float getX() {
                return ((NormalizedLandmark)this.instance).getX();
            }

            public Builder setX(float value) {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).setX(value);
                return this;
            }

            public Builder clearX() {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).clearX();
                return this;
            }

            public boolean hasY() {
                return ((NormalizedLandmark)this.instance).hasY();
            }

            public float getY() {
                return ((NormalizedLandmark)this.instance).getY();
            }

            public Builder setY(float value) {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).setY(value);
                return this;
            }

            public Builder clearY() {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).clearY();
                return this;
            }

            public boolean hasZ() {
                return ((NormalizedLandmark)this.instance).hasZ();
            }

            public float getZ() {
                return ((NormalizedLandmark)this.instance).getZ();
            }

            public Builder setZ(float value) {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).setZ(value);
                return this;
            }

            public Builder clearZ() {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).clearZ();
                return this;
            }

            public boolean hasVisibility() {
                return ((NormalizedLandmark)this.instance).hasVisibility();
            }

            public float getVisibility() {
                return ((NormalizedLandmark)this.instance).getVisibility();
            }

            public Builder setVisibility(float value) {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).setVisibility(value);
                return this;
            }

            public Builder clearVisibility() {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).clearVisibility();
                return this;
            }

            public boolean hasPresence() {
                return ((NormalizedLandmark)this.instance).hasPresence();
            }

            public float getPresence() {
                return ((NormalizedLandmark)this.instance).getPresence();
            }

            public Builder setPresence(float value) {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).setPresence(value);
                return this;
            }

            public Builder clearPresence() {
                this.copyOnWrite();
                ((NormalizedLandmark)this.instance).clearPresence();
                return this;
            }
        }
    }

    public interface NormalizedLandmarkOrBuilder extends MessageLiteOrBuilder {
        boolean hasX();

        float getX();

        boolean hasY();

        float getY();

        boolean hasZ();

        float getZ();

        boolean hasVisibility();

        float getVisibility();

        boolean hasPresence();

        float getPresence();
    }

    public static final class LandmarkListCollection extends GeneratedMessageLite<LandmarkListCollection, LandmarkListCollection.Builder> implements LandmarkListCollectionOrBuilder {
        public static final int LANDMARK_LIST_FIELD_NUMBER = 1;
        private ProtobufList<LandmarkList> landmarkList_ = emptyProtobufList();
        private static final LandmarkListCollection DEFAULT_INSTANCE;
        private static volatile Parser<LandmarkListCollection> PARSER;

        private LandmarkListCollection() {
        }

        public List<LandmarkList> getLandmarkListList() {
            return this.landmarkList_;
        }

        public List<? extends LandmarkListOrBuilder> getLandmarkListOrBuilderList() {
            return this.landmarkList_;
        }

        public int getLandmarkListCount() {
            return this.landmarkList_.size();
        }

        public LandmarkList getLandmarkList(int index) {
            return (LandmarkList)this.landmarkList_.get(index);
        }

        public LandmarkListOrBuilder getLandmarkListOrBuilder(int index) {
            return (LandmarkListOrBuilder)this.landmarkList_.get(index);
        }

        private void ensureLandmarkListIsMutable() {
            ProtobufList<LandmarkList> tmp = this.landmarkList_;
            if (!tmp.isModifiable()) {
                this.landmarkList_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setLandmarkList(int index, LandmarkList value) {
            value.getClass();
            this.ensureLandmarkListIsMutable();
            this.landmarkList_.set(index, value);
        }

        private void addLandmarkList(LandmarkList value) {
            value.getClass();
            this.ensureLandmarkListIsMutable();
            this.landmarkList_.add(value);
        }

        private void addLandmarkList(int index, LandmarkList value) {
            value.getClass();
            this.ensureLandmarkListIsMutable();
            this.landmarkList_.add(index, value);
        }

        private void addAllLandmarkList(Iterable<? extends LandmarkList> values) {
            this.ensureLandmarkListIsMutable();
            AbstractMessageLite.addAll(values, this.landmarkList_);
        }

        private void clearLandmarkList() {
            this.landmarkList_ = emptyProtobufList();
        }

        private void removeLandmarkList(int index) {
            this.ensureLandmarkListIsMutable();
            this.landmarkList_.remove(index);
        }

        public static LandmarkListCollection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LandmarkListCollection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LandmarkListCollection parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LandmarkListCollection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LandmarkListCollection parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LandmarkListCollection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LandmarkListCollection parseFrom(InputStream input) throws IOException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LandmarkListCollection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LandmarkListCollection parseDelimitedFrom(InputStream input) throws IOException {
            return (LandmarkListCollection)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static LandmarkListCollection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LandmarkListCollection)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LandmarkListCollection parseFrom(CodedInputStream input) throws IOException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LandmarkListCollection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LandmarkListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LandmarkListCollection prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new LandmarkListCollection();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"landmarkList_", LandmarkList.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<LandmarkListCollection> parser = PARSER;
                    if (parser == null) {
                        Class var5 = LandmarkListCollection.class;
                        synchronized(LandmarkListCollection.class) {
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

        public static LandmarkListCollection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LandmarkListCollection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            LandmarkListCollection defaultInstance = new LandmarkListCollection();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(LandmarkListCollection.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<LandmarkListCollection, Builder> implements LandmarkListCollectionOrBuilder {
            private Builder() {
                super(LandmarkListCollection.DEFAULT_INSTANCE);
            }

            public List<LandmarkList> getLandmarkListList() {
                return Collections.unmodifiableList(((LandmarkListCollection)this.instance).getLandmarkListList());
            }

            public int getLandmarkListCount() {
                return ((LandmarkListCollection)this.instance).getLandmarkListCount();
            }

            public LandmarkList getLandmarkList(int index) {
                return ((LandmarkListCollection)this.instance).getLandmarkList(index);
            }

            public Builder setLandmarkList(int index, LandmarkList value) {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).setLandmarkList(index, value);
                return this;
            }

            public Builder setLandmarkList(int index, LandmarkList.Builder builderForValue) {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).setLandmarkList(index, (LandmarkList)builderForValue.build());
                return this;
            }

            public Builder addLandmarkList(LandmarkList value) {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).addLandmarkList(value);
                return this;
            }

            public Builder addLandmarkList(int index, LandmarkList value) {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).addLandmarkList(index, value);
                return this;
            }

            public Builder addLandmarkList(LandmarkList.Builder builderForValue) {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).addLandmarkList((LandmarkList)builderForValue.build());
                return this;
            }

            public Builder addLandmarkList(int index, LandmarkList.Builder builderForValue) {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).addLandmarkList(index, (LandmarkList)builderForValue.build());
                return this;
            }

            public Builder addAllLandmarkList(Iterable<? extends LandmarkList> values) {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).addAllLandmarkList(values);
                return this;
            }

            public Builder clearLandmarkList() {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).clearLandmarkList();
                return this;
            }

            public Builder removeLandmarkList(int index) {
                this.copyOnWrite();
                ((LandmarkListCollection)this.instance).removeLandmarkList(index);
                return this;
            }
        }
    }

    public interface LandmarkListCollectionOrBuilder extends MessageLiteOrBuilder {
        List<LandmarkList> getLandmarkListList();

        LandmarkList getLandmarkList(int index);

        int getLandmarkListCount();
    }

    public static final class LandmarkList extends GeneratedMessageLite<LandmarkList, LandmarkList.Builder> implements LandmarkListOrBuilder {
        public static final int LANDMARK_FIELD_NUMBER = 1;
        private ProtobufList<Landmark> landmark_ = emptyProtobufList();
        private static final LandmarkList DEFAULT_INSTANCE;
        private static volatile Parser<LandmarkList> PARSER;

        private LandmarkList() {
        }

        public List<Landmark> getLandmarkList() {
            return this.landmark_;
        }

        public List<? extends LandmarkOrBuilder> getLandmarkOrBuilderList() {
            return this.landmark_;
        }

        public int getLandmarkCount() {
            return this.landmark_.size();
        }

        public Landmark getLandmark(int index) {
            return (Landmark)this.landmark_.get(index);
        }

        public LandmarkOrBuilder getLandmarkOrBuilder(int index) {
            return (LandmarkOrBuilder)this.landmark_.get(index);
        }

        private void ensureLandmarkIsMutable() {
            ProtobufList<Landmark> tmp = this.landmark_;
            if (!tmp.isModifiable()) {
                this.landmark_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setLandmark(int index, Landmark value) {
            value.getClass();
            this.ensureLandmarkIsMutable();
            this.landmark_.set(index, value);
        }

        private void addLandmark(Landmark value) {
            value.getClass();
            this.ensureLandmarkIsMutable();
            this.landmark_.add(value);
        }

        private void addLandmark(int index, Landmark value) {
            value.getClass();
            this.ensureLandmarkIsMutable();
            this.landmark_.add(index, value);
        }

        private void addAllLandmark(Iterable<? extends Landmark> values) {
            this.ensureLandmarkIsMutable();
            AbstractMessageLite.addAll(values, this.landmark_);
        }

        private void clearLandmark() {
            this.landmark_ = emptyProtobufList();
        }

        private void removeLandmark(int index) {
            this.ensureLandmarkIsMutable();
            this.landmark_.remove(index);
        }

        public static LandmarkList parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LandmarkList parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LandmarkList parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LandmarkList parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LandmarkList parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LandmarkList parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LandmarkList parseFrom(InputStream input) throws IOException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LandmarkList parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LandmarkList parseDelimitedFrom(InputStream input) throws IOException {
            return (LandmarkList)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static LandmarkList parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LandmarkList)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LandmarkList parseFrom(CodedInputStream input) throws IOException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LandmarkList parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LandmarkList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LandmarkList prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new LandmarkList();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"landmark_", Landmark.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<LandmarkList> parser = PARSER;
                    if (parser == null) {
                        Class var5 = LandmarkList.class;
                        synchronized(LandmarkList.class) {
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

        public static LandmarkList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LandmarkList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            LandmarkList defaultInstance = new LandmarkList();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(LandmarkList.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<LandmarkList, Builder> implements LandmarkListOrBuilder {
            private Builder() {
                super(LandmarkList.DEFAULT_INSTANCE);
            }

            public List<Landmark> getLandmarkList() {
                return Collections.unmodifiableList(((LandmarkList)this.instance).getLandmarkList());
            }

            public int getLandmarkCount() {
                return ((LandmarkList)this.instance).getLandmarkCount();
            }

            public Landmark getLandmark(int index) {
                return ((LandmarkList)this.instance).getLandmark(index);
            }

            public Builder setLandmark(int index, Landmark value) {
                this.copyOnWrite();
                ((LandmarkList)this.instance).setLandmark(index, value);
                return this;
            }

            public Builder setLandmark(int index, Landmark.Builder builderForValue) {
                this.copyOnWrite();
                ((LandmarkList)this.instance).setLandmark(index, (Landmark)builderForValue.build());
                return this;
            }

            public Builder addLandmark(Landmark value) {
                this.copyOnWrite();
                ((LandmarkList)this.instance).addLandmark(value);
                return this;
            }

            public Builder addLandmark(int index, Landmark value) {
                this.copyOnWrite();
                ((LandmarkList)this.instance).addLandmark(index, value);
                return this;
            }

            public Builder addLandmark(Landmark.Builder builderForValue) {
                this.copyOnWrite();
                ((LandmarkList)this.instance).addLandmark((Landmark)builderForValue.build());
                return this;
            }

            public Builder addLandmark(int index, Landmark.Builder builderForValue) {
                this.copyOnWrite();
                ((LandmarkList)this.instance).addLandmark(index, (Landmark)builderForValue.build());
                return this;
            }

            public Builder addAllLandmark(Iterable<? extends Landmark> values) {
                this.copyOnWrite();
                ((LandmarkList)this.instance).addAllLandmark(values);
                return this;
            }

            public Builder clearLandmark() {
                this.copyOnWrite();
                ((LandmarkList)this.instance).clearLandmark();
                return this;
            }

            public Builder removeLandmark(int index) {
                this.copyOnWrite();
                ((LandmarkList)this.instance).removeLandmark(index);
                return this;
            }
        }
    }

    public interface LandmarkListOrBuilder extends MessageLiteOrBuilder {
        List<Landmark> getLandmarkList();

        Landmark getLandmark(int index);

        int getLandmarkCount();
    }

    public static final class Landmark extends GeneratedMessageLite<Landmark, Landmark.Builder> implements LandmarkOrBuilder {
        private int bitField0_;
        public static final int X_FIELD_NUMBER = 1;
        private float x_;
        public static final int Y_FIELD_NUMBER = 2;
        private float y_;
        public static final int Z_FIELD_NUMBER = 3;
        private float z_;
        public static final int VISIBILITY_FIELD_NUMBER = 4;
        private float visibility_;
        public static final int PRESENCE_FIELD_NUMBER = 5;
        private float presence_;
        private static final Landmark DEFAULT_INSTANCE;
        private static volatile Parser<Landmark> PARSER;

        private Landmark() {
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

        public boolean hasZ() {
            return (this.bitField0_ & 4) != 0;
        }

        public float getZ() {
            return this.z_;
        }

        private void setZ(float value) {
            this.bitField0_ |= 4;
            this.z_ = value;
        }

        private void clearZ() {
            this.bitField0_ &= -5;
            this.z_ = 0.0F;
        }

        public boolean hasVisibility() {
            return (this.bitField0_ & 8) != 0;
        }

        public float getVisibility() {
            return this.visibility_;
        }

        private void setVisibility(float value) {
            this.bitField0_ |= 8;
            this.visibility_ = value;
        }

        private void clearVisibility() {
            this.bitField0_ &= -9;
            this.visibility_ = 0.0F;
        }

        public boolean hasPresence() {
            return (this.bitField0_ & 16) != 0;
        }

        public float getPresence() {
            return this.presence_;
        }

        private void setPresence(float value) {
            this.bitField0_ |= 16;
            this.presence_ = value;
        }

        private void clearPresence() {
            this.bitField0_ &= -17;
            this.presence_ = 0.0F;
        }

        public static Landmark parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Landmark parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Landmark parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Landmark parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Landmark parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Landmark parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Landmark parseFrom(InputStream input) throws IOException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Landmark parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Landmark parseDelimitedFrom(InputStream input) throws IOException {
            return (Landmark)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Landmark parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Landmark)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Landmark parseFrom(CodedInputStream input) throws IOException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Landmark parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Landmark)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Landmark prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Landmark();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "x_", "y_", "z_", "visibility_", "presence_"};
                    String info = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Landmark> parser = PARSER;
                    if (parser == null) {
                        Class var5 = Landmark.class;
                        synchronized(Landmark.class) {
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

        public static Landmark getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Landmark> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            Landmark defaultInstance = new Landmark();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Landmark.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Landmark, Builder> implements LandmarkOrBuilder {
            private Builder() {
                super(Landmark.DEFAULT_INSTANCE);
            }

            public boolean hasX() {
                return ((Landmark)this.instance).hasX();
            }

            public float getX() {
                return ((Landmark)this.instance).getX();
            }

            public Builder setX(float value) {
                this.copyOnWrite();
                ((Landmark)this.instance).setX(value);
                return this;
            }

            public Builder clearX() {
                this.copyOnWrite();
                ((Landmark)this.instance).clearX();
                return this;
            }

            public boolean hasY() {
                return ((Landmark)this.instance).hasY();
            }

            public float getY() {
                return ((Landmark)this.instance).getY();
            }

            public Builder setY(float value) {
                this.copyOnWrite();
                ((Landmark)this.instance).setY(value);
                return this;
            }

            public Builder clearY() {
                this.copyOnWrite();
                ((Landmark)this.instance).clearY();
                return this;
            }

            public boolean hasZ() {
                return ((Landmark)this.instance).hasZ();
            }

            public float getZ() {
                return ((Landmark)this.instance).getZ();
            }

            public Builder setZ(float value) {
                this.copyOnWrite();
                ((Landmark)this.instance).setZ(value);
                return this;
            }

            public Builder clearZ() {
                this.copyOnWrite();
                ((Landmark)this.instance).clearZ();
                return this;
            }

            public boolean hasVisibility() {
                return ((Landmark)this.instance).hasVisibility();
            }

            public float getVisibility() {
                return ((Landmark)this.instance).getVisibility();
            }

            public Builder setVisibility(float value) {
                this.copyOnWrite();
                ((Landmark)this.instance).setVisibility(value);
                return this;
            }

            public Builder clearVisibility() {
                this.copyOnWrite();
                ((Landmark)this.instance).clearVisibility();
                return this;
            }

            public boolean hasPresence() {
                return ((Landmark)this.instance).hasPresence();
            }

            public float getPresence() {
                return ((Landmark)this.instance).getPresence();
            }

            public Builder setPresence(float value) {
                this.copyOnWrite();
                ((Landmark)this.instance).setPresence(value);
                return this;
            }

            public Builder clearPresence() {
                this.copyOnWrite();
                ((Landmark)this.instance).clearPresence();
                return this;
            }
        }
    }

    public interface LandmarkOrBuilder extends MessageLiteOrBuilder {
        boolean hasX();

        float getX();

        boolean hasY();

        float getY();

        boolean hasZ();

        float getZ();

        boolean hasVisibility();

        float getVisibility();

        boolean hasPresence();

        float getPresence();
    }
}
