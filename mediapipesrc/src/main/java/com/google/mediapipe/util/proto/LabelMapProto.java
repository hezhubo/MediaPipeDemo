//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.util.proto;

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

public final class LabelMapProto {
    private LabelMapProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class LabelMapItem extends GeneratedMessageLite<LabelMapItem, LabelMapItem.Builder> implements LabelMapItemOrBuilder {
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private String name_ = "";
        public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
        private String displayName_ = "";
        public static final int CHILD_NAME_FIELD_NUMBER = 3;
        private ProtobufList<String> childName_ = GeneratedMessageLite.emptyProtobufList();
        private static final LabelMapItem DEFAULT_INSTANCE;
        private static volatile Parser<LabelMapItem> PARSER;

        private LabelMapItem() {
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        private void setName(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        private void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public boolean hasDisplayName() {
            return (this.bitField0_ & 2) != 0;
        }

        public String getDisplayName() {
            return this.displayName_;
        }

        public ByteString getDisplayNameBytes() {
            return ByteString.copyFromUtf8(this.displayName_);
        }

        private void setDisplayName(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 2;
            this.displayName_ = value;
        }

        private void clearDisplayName() {
            this.bitField0_ &= -3;
            this.displayName_ = getDefaultInstance().getDisplayName();
        }

        private void setDisplayNameBytes(ByteString value) {
            this.displayName_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        public List<String> getChildNameList() {
            return this.childName_;
        }

        public int getChildNameCount() {
            return this.childName_.size();
        }

        public String getChildName(int index) {
            return (String)this.childName_.get(index);
        }

        public ByteString getChildNameBytes(int index) {
            return ByteString.copyFromUtf8((String)this.childName_.get(index));
        }

        private void ensureChildNameIsMutable() {
            ProtobufList<String> tmp = this.childName_;
            if (!tmp.isModifiable()) {
                this.childName_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setChildName(int index, String value) {
            Class<?> valueClass = value.getClass();
            this.ensureChildNameIsMutable();
            this.childName_.set(index, value);
        }

        private void addChildName(String value) {
            Class<?> valueClass = value.getClass();
            this.ensureChildNameIsMutable();
            this.childName_.add(value);
        }

        private void addAllChildName(Iterable<String> values) {
            this.ensureChildNameIsMutable();
            AbstractMessageLite.addAll(values, this.childName_);
        }

        private void clearChildName() {
            this.childName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addChildNameBytes(ByteString value) {
            this.ensureChildNameIsMutable();
            this.childName_.add(value.toStringUtf8());
        }

        public static LabelMapItem parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LabelMapItem parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LabelMapItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LabelMapItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LabelMapItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static LabelMapItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static LabelMapItem parseFrom(InputStream input) throws IOException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LabelMapItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LabelMapItem parseDelimitedFrom(InputStream input) throws IOException {
            return (LabelMapItem)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static LabelMapItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LabelMapItem)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static LabelMapItem parseFrom(CodedInputStream input) throws IOException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static LabelMapItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LabelMapItem)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LabelMapItem prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new LabelMapItem();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "name_", "displayName_", "childName_"};
                    String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<LabelMapItem> parser = PARSER;
                    if (parser == null) {
                        Class var5 = LabelMapItem.class;
                        synchronized(LabelMapItem.class) {
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

        public static LabelMapItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LabelMapItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            LabelMapItem defaultInstance = new LabelMapItem();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(LabelMapItem.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<LabelMapItem, Builder> implements LabelMapItemOrBuilder {
            private Builder() {
                super(LabelMapItem.DEFAULT_INSTANCE);
            }

            public boolean hasName() {
                return ((LabelMapItem)this.instance).hasName();
            }

            public String getName() {
                return ((LabelMapItem)this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((LabelMapItem)this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).setNameBytes(value);
                return this;
            }

            public boolean hasDisplayName() {
                return ((LabelMapItem)this.instance).hasDisplayName();
            }

            public String getDisplayName() {
                return ((LabelMapItem)this.instance).getDisplayName();
            }

            public ByteString getDisplayNameBytes() {
                return ((LabelMapItem)this.instance).getDisplayNameBytes();
            }

            public Builder setDisplayName(String value) {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).setDisplayName(value);
                return this;
            }

            public Builder clearDisplayName() {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).clearDisplayName();
                return this;
            }

            public Builder setDisplayNameBytes(ByteString value) {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).setDisplayNameBytes(value);
                return this;
            }

            public List<String> getChildNameList() {
                return Collections.unmodifiableList(((LabelMapItem)this.instance).getChildNameList());
            }

            public int getChildNameCount() {
                return ((LabelMapItem)this.instance).getChildNameCount();
            }

            public String getChildName(int index) {
                return ((LabelMapItem)this.instance).getChildName(index);
            }

            public ByteString getChildNameBytes(int index) {
                return ((LabelMapItem)this.instance).getChildNameBytes(index);
            }

            public Builder setChildName(int index, String value) {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).setChildName(index, value);
                return this;
            }

            public Builder addChildName(String value) {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).addChildName(value);
                return this;
            }

            public Builder addAllChildName(Iterable<String> values) {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).addAllChildName(values);
                return this;
            }

            public Builder clearChildName() {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).clearChildName();
                return this;
            }

            public Builder addChildNameBytes(ByteString value) {
                this.copyOnWrite();
                ((LabelMapItem)this.instance).addChildNameBytes(value);
                return this;
            }
        }
    }

    public interface LabelMapItemOrBuilder extends MessageLiteOrBuilder {
        boolean hasName();

        String getName();

        ByteString getNameBytes();

        boolean hasDisplayName();

        String getDisplayName();

        ByteString getDisplayNameBytes();

        List<String> getChildNameList();

        int getChildNameCount();

        String getChildName(int index);

        ByteString getChildNameBytes(int index);
    }
}
