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

public final class ClassificationProto {
    private ClassificationProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class ClassificationListCollection extends GeneratedMessageLite<ClassificationListCollection, ClassificationListCollection.Builder> implements ClassificationListCollectionOrBuilder {
        public static final int CLASSIFICATION_LIST_FIELD_NUMBER = 1;
        private ProtobufList<ClassificationList> classificationList_ = emptyProtobufList();
        private static final ClassificationListCollection DEFAULT_INSTANCE;
        private static volatile Parser<ClassificationListCollection> PARSER;

        private ClassificationListCollection() {
        }

        public List<ClassificationList> getClassificationListList() {
            return this.classificationList_;
        }

        public List<? extends ClassificationListOrBuilder> getClassificationListOrBuilderList() {
            return this.classificationList_;
        }

        public int getClassificationListCount() {
            return this.classificationList_.size();
        }

        public ClassificationList getClassificationList(int index) {
            return (ClassificationList)this.classificationList_.get(index);
        }

        public ClassificationListOrBuilder getClassificationListOrBuilder(int index) {
            return (ClassificationListOrBuilder)this.classificationList_.get(index);
        }

        private void ensureClassificationListIsMutable() {
            ProtobufList<ClassificationList> tmp = this.classificationList_;
            if (!tmp.isModifiable()) {
                this.classificationList_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setClassificationList(int index, ClassificationList value) {
            value.getClass();
            this.ensureClassificationListIsMutable();
            this.classificationList_.set(index, value);
        }

        private void addClassificationList(ClassificationList value) {
            value.getClass();
            this.ensureClassificationListIsMutable();
            this.classificationList_.add(value);
        }

        private void addClassificationList(int index, ClassificationList value) {
            value.getClass();
            this.ensureClassificationListIsMutable();
            this.classificationList_.add(index, value);
        }

        private void addAllClassificationList(Iterable<? extends ClassificationList> values) {
            this.ensureClassificationListIsMutable();
            AbstractMessageLite.addAll(values, this.classificationList_);
        }

        private void clearClassificationList() {
            this.classificationList_ = emptyProtobufList();
        }

        private void removeClassificationList(int index) {
            this.ensureClassificationListIsMutable();
            this.classificationList_.remove(index);
        }

        public static ClassificationListCollection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ClassificationListCollection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ClassificationListCollection parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ClassificationListCollection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ClassificationListCollection parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ClassificationListCollection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ClassificationListCollection parseFrom(InputStream input) throws IOException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ClassificationListCollection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ClassificationListCollection parseDelimitedFrom(InputStream input) throws IOException {
            return (ClassificationListCollection)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ClassificationListCollection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ClassificationListCollection)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ClassificationListCollection parseFrom(CodedInputStream input) throws IOException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ClassificationListCollection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ClassificationListCollection)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ClassificationListCollection prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new ClassificationListCollection();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"classificationList_", ClassificationList.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ClassificationListCollection> parser = PARSER;
                    if (parser == null) {
                        Class var5 = ClassificationListCollection.class;
                        synchronized(ClassificationListCollection.class) {
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

        public static ClassificationListCollection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ClassificationListCollection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            ClassificationListCollection defaultInstance = new ClassificationListCollection();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(ClassificationListCollection.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ClassificationListCollection, Builder> implements ClassificationListCollectionOrBuilder {
            private Builder() {
                super(ClassificationListCollection.DEFAULT_INSTANCE);
            }

            public List<ClassificationList> getClassificationListList() {
                return Collections.unmodifiableList(((ClassificationListCollection)this.instance).getClassificationListList());
            }

            public int getClassificationListCount() {
                return ((ClassificationListCollection)this.instance).getClassificationListCount();
            }

            public ClassificationList getClassificationList(int index) {
                return ((ClassificationListCollection)this.instance).getClassificationList(index);
            }

            public Builder setClassificationList(int index, ClassificationList value) {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).setClassificationList(index, value);
                return this;
            }

            public Builder setClassificationList(int index, ClassificationList.Builder builderForValue) {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).setClassificationList(index, (ClassificationList)builderForValue.build());
                return this;
            }

            public Builder addClassificationList(ClassificationList value) {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).addClassificationList(value);
                return this;
            }

            public Builder addClassificationList(int index, ClassificationList value) {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).addClassificationList(index, value);
                return this;
            }

            public Builder addClassificationList(ClassificationList.Builder builderForValue) {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).addClassificationList((ClassificationList)builderForValue.build());
                return this;
            }

            public Builder addClassificationList(int index, ClassificationList.Builder builderForValue) {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).addClassificationList(index, (ClassificationList)builderForValue.build());
                return this;
            }

            public Builder addAllClassificationList(Iterable<? extends ClassificationList> values) {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).addAllClassificationList(values);
                return this;
            }

            public Builder clearClassificationList() {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).clearClassificationList();
                return this;
            }

            public Builder removeClassificationList(int index) {
                this.copyOnWrite();
                ((ClassificationListCollection)this.instance).removeClassificationList(index);
                return this;
            }
        }
    }

    public interface ClassificationListCollectionOrBuilder extends MessageLiteOrBuilder {
        List<ClassificationList> getClassificationListList();

        ClassificationList getClassificationList(int index);

        int getClassificationListCount();
    }

    public static final class ClassificationList extends GeneratedMessageLite<ClassificationList, ClassificationList.Builder> implements ClassificationListOrBuilder {
        public static final int CLASSIFICATION_FIELD_NUMBER = 1;
        private ProtobufList<Classification> classification_ = emptyProtobufList();
        private static final ClassificationList DEFAULT_INSTANCE;
        private static volatile Parser<ClassificationList> PARSER;

        private ClassificationList() {
        }

        public List<Classification> getClassificationList() {
            return this.classification_;
        }

        public List<? extends ClassificationOrBuilder> getClassificationOrBuilderList() {
            return this.classification_;
        }

        public int getClassificationCount() {
            return this.classification_.size();
        }

        public Classification getClassification(int index) {
            return (Classification)this.classification_.get(index);
        }

        public ClassificationOrBuilder getClassificationOrBuilder(int index) {
            return (ClassificationOrBuilder)this.classification_.get(index);
        }

        private void ensureClassificationIsMutable() {
            ProtobufList<Classification> tmp = this.classification_;
            if (!tmp.isModifiable()) {
                this.classification_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setClassification(int index, Classification value) {
            value.getClass();
            this.ensureClassificationIsMutable();
            this.classification_.set(index, value);
        }

        private void addClassification(Classification value) {
            value.getClass();
            this.ensureClassificationIsMutable();
            this.classification_.add(value);
        }

        private void addClassification(int index, Classification value) {
            value.getClass();
            this.ensureClassificationIsMutable();
            this.classification_.add(index, value);
        }

        private void addAllClassification(Iterable<? extends Classification> values) {
            this.ensureClassificationIsMutable();
            AbstractMessageLite.addAll(values, this.classification_);
        }

        private void clearClassification() {
            this.classification_ = emptyProtobufList();
        }

        private void removeClassification(int index) {
            this.ensureClassificationIsMutable();
            this.classification_.remove(index);
        }

        public static ClassificationList parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ClassificationList parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ClassificationList parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ClassificationList parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ClassificationList parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ClassificationList parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ClassificationList parseFrom(InputStream input) throws IOException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ClassificationList parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ClassificationList parseDelimitedFrom(InputStream input) throws IOException {
            return (ClassificationList)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ClassificationList parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ClassificationList)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ClassificationList parseFrom(CodedInputStream input) throws IOException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ClassificationList parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ClassificationList)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ClassificationList prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new ClassificationList();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"classification_", Classification.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ClassificationList> parser = PARSER;
                    if (parser == null) {
                        Class var5 = ClassificationList.class;
                        synchronized(ClassificationList.class) {
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

        public static ClassificationList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ClassificationList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            ClassificationList defaultInstance = new ClassificationList();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(ClassificationList.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ClassificationList, Builder> implements ClassificationListOrBuilder {
            private Builder() {
                super(ClassificationList.DEFAULT_INSTANCE);
            }

            public List<Classification> getClassificationList() {
                return Collections.unmodifiableList(((ClassificationList)this.instance).getClassificationList());
            }

            public int getClassificationCount() {
                return ((ClassificationList)this.instance).getClassificationCount();
            }

            public Classification getClassification(int index) {
                return ((ClassificationList)this.instance).getClassification(index);
            }

            public Builder setClassification(int index, Classification value) {
                this.copyOnWrite();
                ((ClassificationList)this.instance).setClassification(index, value);
                return this;
            }

            public Builder setClassification(int index, Classification.Builder builderForValue) {
                this.copyOnWrite();
                ((ClassificationList)this.instance).setClassification(index, (Classification)builderForValue.build());
                return this;
            }

            public Builder addClassification(Classification value) {
                this.copyOnWrite();
                ((ClassificationList)this.instance).addClassification(value);
                return this;
            }

            public Builder addClassification(int index, Classification value) {
                this.copyOnWrite();
                ((ClassificationList)this.instance).addClassification(index, value);
                return this;
            }

            public Builder addClassification(Classification.Builder builderForValue) {
                this.copyOnWrite();
                ((ClassificationList)this.instance).addClassification((Classification)builderForValue.build());
                return this;
            }

            public Builder addClassification(int index, Classification.Builder builderForValue) {
                this.copyOnWrite();
                ((ClassificationList)this.instance).addClassification(index, (Classification)builderForValue.build());
                return this;
            }

            public Builder addAllClassification(Iterable<? extends Classification> values) {
                this.copyOnWrite();
                ((ClassificationList)this.instance).addAllClassification(values);
                return this;
            }

            public Builder clearClassification() {
                this.copyOnWrite();
                ((ClassificationList)this.instance).clearClassification();
                return this;
            }

            public Builder removeClassification(int index) {
                this.copyOnWrite();
                ((ClassificationList)this.instance).removeClassification(index);
                return this;
            }
        }
    }

    public interface ClassificationListOrBuilder extends MessageLiteOrBuilder {
        List<Classification> getClassificationList();

        Classification getClassification(int index);

        int getClassificationCount();
    }

    public static final class Classification extends GeneratedMessageLite<Classification, Classification.Builder> implements ClassificationOrBuilder {
        private int bitField0_;
        public static final int INDEX_FIELD_NUMBER = 1;
        private int index_;
        public static final int SCORE_FIELD_NUMBER = 2;
        private float score_;
        public static final int LABEL_FIELD_NUMBER = 3;
        private String label_ = "";
        public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
        private String displayName_ = "";
        private static final Classification DEFAULT_INSTANCE;
        private static volatile Parser<Classification> PARSER;

        private Classification() {
        }

        public boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        public int getIndex() {
            return this.index_;
        }

        private void setIndex(int value) {
            this.bitField0_ |= 1;
            this.index_ = value;
        }

        private void clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
        }

        public boolean hasScore() {
            return (this.bitField0_ & 2) != 0;
        }

        public float getScore() {
            return this.score_;
        }

        private void setScore(float value) {
            this.bitField0_ |= 2;
            this.score_ = value;
        }

        private void clearScore() {
            this.bitField0_ &= -3;
            this.score_ = 0.0F;
        }

        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        public String getLabel() {
            return this.label_;
        }

        public ByteString getLabelBytes() {
            return ByteString.copyFromUtf8(this.label_);
        }

        private void setLabel(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 4;
            this.label_ = value;
        }

        private void clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = getDefaultInstance().getLabel();
        }

        private void setLabelBytes(ByteString value) {
            this.label_ = value.toStringUtf8();
            this.bitField0_ |= 4;
        }

        public boolean hasDisplayName() {
            return (this.bitField0_ & 8) != 0;
        }

        public String getDisplayName() {
            return this.displayName_;
        }

        public ByteString getDisplayNameBytes() {
            return ByteString.copyFromUtf8(this.displayName_);
        }

        private void setDisplayName(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 8;
            this.displayName_ = value;
        }

        private void clearDisplayName() {
            this.bitField0_ &= -9;
            this.displayName_ = getDefaultInstance().getDisplayName();
        }

        private void setDisplayNameBytes(ByteString value) {
            this.displayName_ = value.toStringUtf8();
            this.bitField0_ |= 8;
        }

        public static Classification parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Classification parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Classification parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Classification parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Classification parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Classification parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Classification parseFrom(InputStream input) throws IOException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Classification parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Classification parseDelimitedFrom(InputStream input) throws IOException {
            return (Classification)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Classification parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Classification)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Classification parseFrom(CodedInputStream input) throws IOException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Classification parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Classification)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Classification prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Classification();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "index_", "score_", "label_", "displayName_"};
                    String info = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Classification> parser = PARSER;
                    if (parser == null) {
                        Class var5 = Classification.class;
                        synchronized(Classification.class) {
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

        public static Classification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Classification> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            Classification defaultInstance = new Classification();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Classification.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Classification, Builder> implements ClassificationOrBuilder {
            private Builder() {
                super(Classification.DEFAULT_INSTANCE);
            }

            public boolean hasIndex() {
                return ((Classification)this.instance).hasIndex();
            }

            public int getIndex() {
                return ((Classification)this.instance).getIndex();
            }

            public Builder setIndex(int value) {
                this.copyOnWrite();
                ((Classification)this.instance).setIndex(value);
                return this;
            }

            public Builder clearIndex() {
                this.copyOnWrite();
                ((Classification)this.instance).clearIndex();
                return this;
            }

            public boolean hasScore() {
                return ((Classification)this.instance).hasScore();
            }

            public float getScore() {
                return ((Classification)this.instance).getScore();
            }

            public Builder setScore(float value) {
                this.copyOnWrite();
                ((Classification)this.instance).setScore(value);
                return this;
            }

            public Builder clearScore() {
                this.copyOnWrite();
                ((Classification)this.instance).clearScore();
                return this;
            }

            public boolean hasLabel() {
                return ((Classification)this.instance).hasLabel();
            }

            public String getLabel() {
                return ((Classification)this.instance).getLabel();
            }

            public ByteString getLabelBytes() {
                return ((Classification)this.instance).getLabelBytes();
            }

            public Builder setLabel(String value) {
                this.copyOnWrite();
                ((Classification)this.instance).setLabel(value);
                return this;
            }

            public Builder clearLabel() {
                this.copyOnWrite();
                ((Classification)this.instance).clearLabel();
                return this;
            }

            public Builder setLabelBytes(ByteString value) {
                this.copyOnWrite();
                ((Classification)this.instance).setLabelBytes(value);
                return this;
            }

            public boolean hasDisplayName() {
                return ((Classification)this.instance).hasDisplayName();
            }

            public String getDisplayName() {
                return ((Classification)this.instance).getDisplayName();
            }

            public ByteString getDisplayNameBytes() {
                return ((Classification)this.instance).getDisplayNameBytes();
            }

            public Builder setDisplayName(String value) {
                this.copyOnWrite();
                ((Classification)this.instance).setDisplayName(value);
                return this;
            }

            public Builder clearDisplayName() {
                this.copyOnWrite();
                ((Classification)this.instance).clearDisplayName();
                return this;
            }

            public Builder setDisplayNameBytes(ByteString value) {
                this.copyOnWrite();
                ((Classification)this.instance).setDisplayNameBytes(value);
                return this;
            }
        }
    }

    public interface ClassificationOrBuilder extends MessageLiteOrBuilder {
        boolean hasIndex();

        int getIndex();

        boolean hasScore();

        float getScore();

        boolean hasLabel();

        String getLabel();

        ByteString getLabelBytes();

        boolean hasDisplayName();

        String getDisplayName();

        ByteString getDisplayNameBytes();
    }
}
