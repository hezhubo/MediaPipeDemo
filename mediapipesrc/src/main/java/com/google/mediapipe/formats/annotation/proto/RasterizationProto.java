//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.formats.annotation.proto;

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

public final class RasterizationProto {
    private RasterizationProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class Rasterization extends GeneratedMessageLite<Rasterization, Rasterization.Builder> implements RasterizationOrBuilder {
        public static final int INTERVAL_FIELD_NUMBER = 1;
        private ProtobufList<Interval> interval_ = emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private static final Rasterization DEFAULT_INSTANCE;
        private static volatile Parser<Rasterization> PARSER;

        private Rasterization() {
        }

        public List<Interval> getIntervalList() {
            return this.interval_;
        }

        public List<? extends IntervalOrBuilder> getIntervalOrBuilderList() {
            return this.interval_;
        }

        public int getIntervalCount() {
            return this.interval_.size();
        }

        public Interval getInterval(int index) {
            return (Interval)this.interval_.get(index);
        }

        public IntervalOrBuilder getIntervalOrBuilder(int index) {
            return (IntervalOrBuilder)this.interval_.get(index);
        }

        private void ensureIntervalIsMutable() {
            ProtobufList<Interval> tmp = this.interval_;
            if (!tmp.isModifiable()) {
                this.interval_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setInterval(int index, Interval value) {
            value.getClass();
            this.ensureIntervalIsMutable();
            this.interval_.set(index, value);
        }

        private void addInterval(Interval value) {
            value.getClass();
            this.ensureIntervalIsMutable();
            this.interval_.add(value);
        }

        private void addInterval(int index, Interval value) {
            value.getClass();
            this.ensureIntervalIsMutable();
            this.interval_.add(index, value);
        }

        private void addAllInterval(Iterable<? extends Interval> values) {
            this.ensureIntervalIsMutable();
            AbstractMessageLite.addAll(values, this.interval_);
        }

        private void clearInterval() {
            this.interval_ = emptyProtobufList();
        }

        private void removeInterval(int index) {
            this.ensureIntervalIsMutable();
            this.interval_.remove(index);
        }

        public static Rasterization parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Rasterization parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Rasterization parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Rasterization parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Rasterization parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Rasterization parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Rasterization parseFrom(InputStream input) throws IOException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Rasterization parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Rasterization parseDelimitedFrom(InputStream input) throws IOException {
            return (Rasterization)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Rasterization parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Rasterization)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Rasterization parseFrom(CodedInputStream input) throws IOException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Rasterization parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Rasterization)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Rasterization prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Rasterization();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"interval_", Interval.class};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Rasterization> parser = PARSER;
                    if (parser == null) {
                        Class var5 = Rasterization.class;
                        synchronized(Rasterization.class) {
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

        public static Rasterization getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Rasterization> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            Rasterization defaultInstance = new Rasterization();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Rasterization.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Rasterization, Builder> implements RasterizationOrBuilder {
            private Builder() {
                super(Rasterization.DEFAULT_INSTANCE);
            }

            public List<Interval> getIntervalList() {
                return Collections.unmodifiableList(((Rasterization)this.instance).getIntervalList());
            }

            public int getIntervalCount() {
                return ((Rasterization)this.instance).getIntervalCount();
            }

            public Interval getInterval(int index) {
                return ((Rasterization)this.instance).getInterval(index);
            }

            public Builder setInterval(int index, Interval value) {
                this.copyOnWrite();
                ((Rasterization)this.instance).setInterval(index, value);
                return this;
            }

            public Builder setInterval(int index, Interval.Builder builderForValue) {
                this.copyOnWrite();
                ((Rasterization)this.instance).setInterval(index, (Interval)builderForValue.build());
                return this;
            }

            public Builder addInterval(Interval value) {
                this.copyOnWrite();
                ((Rasterization)this.instance).addInterval(value);
                return this;
            }

            public Builder addInterval(int index, Interval value) {
                this.copyOnWrite();
                ((Rasterization)this.instance).addInterval(index, value);
                return this;
            }

            public Builder addInterval(Interval.Builder builderForValue) {
                this.copyOnWrite();
                ((Rasterization)this.instance).addInterval((Interval)builderForValue.build());
                return this;
            }

            public Builder addInterval(int index, Interval.Builder builderForValue) {
                this.copyOnWrite();
                ((Rasterization)this.instance).addInterval(index, (Interval)builderForValue.build());
                return this;
            }

            public Builder addAllInterval(Iterable<? extends Interval> values) {
                this.copyOnWrite();
                ((Rasterization)this.instance).addAllInterval(values);
                return this;
            }

            public Builder clearInterval() {
                this.copyOnWrite();
                ((Rasterization)this.instance).clearInterval();
                return this;
            }

            public Builder removeInterval(int index) {
                this.copyOnWrite();
                ((Rasterization)this.instance).removeInterval(index);
                return this;
            }
        }

        public static final class Interval extends GeneratedMessageLite<Interval, Interval.Builder> implements IntervalOrBuilder {
            private int bitField0_;
            public static final int Y_FIELD_NUMBER = 1;
            private int y_;
            public static final int LEFT_X_FIELD_NUMBER = 2;
            private int leftX_;
            public static final int RIGHT_X_FIELD_NUMBER = 3;
            private int rightX_;
            private byte memoizedIsInitialized = 2;
            private static final Interval DEFAULT_INSTANCE;
            private static volatile Parser<Interval> PARSER;

            private Interval() {
            }

            public boolean hasY() {
                return (this.bitField0_ & 1) != 0;
            }

            public int getY() {
                return this.y_;
            }

            private void setY(int value) {
                this.bitField0_ |= 1;
                this.y_ = value;
            }

            private void clearY() {
                this.bitField0_ &= -2;
                this.y_ = 0;
            }

            public boolean hasLeftX() {
                return (this.bitField0_ & 2) != 0;
            }

            public int getLeftX() {
                return this.leftX_;
            }

            private void setLeftX(int value) {
                this.bitField0_ |= 2;
                this.leftX_ = value;
            }

            private void clearLeftX() {
                this.bitField0_ &= -3;
                this.leftX_ = 0;
            }

            public boolean hasRightX() {
                return (this.bitField0_ & 4) != 0;
            }

            public int getRightX() {
                return this.rightX_;
            }

            private void setRightX(int value) {
                this.bitField0_ |= 4;
                this.rightX_ = value;
            }

            private void clearRightX() {
                this.bitField0_ &= -5;
                this.rightX_ = 0;
            }

            public static Interval parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Interval parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Interval parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Interval parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Interval parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Interval parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Interval parseFrom(InputStream input) throws IOException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Interval parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Interval parseDelimitedFrom(InputStream input) throws IOException {
                return (Interval)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Interval parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Interval)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Interval parseFrom(CodedInputStream input) throws IOException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Interval parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Interval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Interval prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Interval();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "y_", "leftX_", "rightX_"};
                        String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Interval> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Interval.class;
                            synchronized(Interval.class) {
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

            public static Interval getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Interval> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Interval defaultInstance = new Interval();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Interval.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Interval, Builder> implements IntervalOrBuilder {
                private Builder() {
                    super(Interval.DEFAULT_INSTANCE);
                }

                public boolean hasY() {
                    return ((Interval)this.instance).hasY();
                }

                public int getY() {
                    return ((Interval)this.instance).getY();
                }

                public Builder setY(int value) {
                    this.copyOnWrite();
                    ((Interval)this.instance).setY(value);
                    return this;
                }

                public Builder clearY() {
                    this.copyOnWrite();
                    ((Interval)this.instance).clearY();
                    return this;
                }

                public boolean hasLeftX() {
                    return ((Interval)this.instance).hasLeftX();
                }

                public int getLeftX() {
                    return ((Interval)this.instance).getLeftX();
                }

                public Builder setLeftX(int value) {
                    this.copyOnWrite();
                    ((Interval)this.instance).setLeftX(value);
                    return this;
                }

                public Builder clearLeftX() {
                    this.copyOnWrite();
                    ((Interval)this.instance).clearLeftX();
                    return this;
                }

                public boolean hasRightX() {
                    return ((Interval)this.instance).hasRightX();
                }

                public int getRightX() {
                    return ((Interval)this.instance).getRightX();
                }

                public Builder setRightX(int value) {
                    this.copyOnWrite();
                    ((Interval)this.instance).setRightX(value);
                    return this;
                }

                public Builder clearRightX() {
                    this.copyOnWrite();
                    ((Interval)this.instance).clearRightX();
                    return this;
                }
            }
        }

        public interface IntervalOrBuilder extends MessageLiteOrBuilder {
            boolean hasY();

            int getY();

            boolean hasLeftX();

            int getLeftX();

            boolean hasRightX();

            int getRightX();
        }
    }

    public interface RasterizationOrBuilder extends MessageLiteOrBuilder {
        List<Rasterization.Interval> getIntervalList();

        Rasterization.Interval getInterval(int index);

        int getIntervalCount();
    }
}
