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
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.Internal.FloatList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class MatrixDataProto {
    private MatrixDataProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class MatrixData extends GeneratedMessageLite<MatrixData, MatrixData.Builder> implements MatrixDataOrBuilder {
        private int bitField0_;
        public static final int ROWS_FIELD_NUMBER = 1;
        private int rows_;
        public static final int COLS_FIELD_NUMBER = 2;
        private int cols_;
        public static final int PACKED_DATA_FIELD_NUMBER = 3;
        private FloatList packedData_ = emptyFloatList();
        private int packedDataMemoizedSerializedSize = -1;
        public static final int LAYOUT_FIELD_NUMBER = 4;
        private int layout_;
        private static final MatrixData DEFAULT_INSTANCE;
        private static volatile Parser<MatrixData> PARSER;

        private MatrixData() {
        }

        public boolean hasRows() {
            return (this.bitField0_ & 1) != 0;
        }

        public int getRows() {
            return this.rows_;
        }

        private void setRows(int value) {
            this.bitField0_ |= 1;
            this.rows_ = value;
        }

        private void clearRows() {
            this.bitField0_ &= -2;
            this.rows_ = 0;
        }

        public boolean hasCols() {
            return (this.bitField0_ & 2) != 0;
        }

        public int getCols() {
            return this.cols_;
        }

        private void setCols(int value) {
            this.bitField0_ |= 2;
            this.cols_ = value;
        }

        private void clearCols() {
            this.bitField0_ &= -3;
            this.cols_ = 0;
        }

        public List<Float> getPackedDataList() {
            return this.packedData_;
        }

        public int getPackedDataCount() {
            return this.packedData_.size();
        }

        public float getPackedData(int index) {
            return this.packedData_.getFloat(index);
        }

        private void ensurePackedDataIsMutable() {
            FloatList tmp = this.packedData_;
            if (!tmp.isModifiable()) {
                this.packedData_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setPackedData(int index, float value) {
            this.ensurePackedDataIsMutable();
            this.packedData_.setFloat(index, value);
        }

        private void addPackedData(float value) {
            this.ensurePackedDataIsMutable();
            this.packedData_.addFloat(value);
        }

        private void addAllPackedData(Iterable<? extends Float> values) {
            this.ensurePackedDataIsMutable();
            AbstractMessageLite.addAll(values, this.packedData_);
        }

        private void clearPackedData() {
            this.packedData_ = emptyFloatList();
        }

        public boolean hasLayout() {
            return (this.bitField0_ & 4) != 0;
        }

        public Layout getLayout() {
            Layout result = Layout.forNumber(this.layout_);
            return result == null ? Layout.COLUMN_MAJOR : result;
        }

        private void setLayout(Layout value) {
            this.layout_ = value.getNumber();
            this.bitField0_ |= 4;
        }

        private void clearLayout() {
            this.bitField0_ &= -5;
            this.layout_ = 0;
        }

        public static MatrixData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MatrixData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MatrixData parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MatrixData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MatrixData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MatrixData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MatrixData parseFrom(InputStream input) throws IOException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MatrixData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MatrixData parseDelimitedFrom(InputStream input) throws IOException {
            return (MatrixData)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MatrixData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MatrixData)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MatrixData parseFrom(CodedInputStream input) throws IOException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MatrixData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MatrixData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MatrixData prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new MatrixData();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "rows_", "cols_", "packedData_", "layout_", Layout.internalGetVerifier()};
                    String info = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003$\u0004ဌ\u0002";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MatrixData> parser = PARSER;
                    if (parser == null) {
                        Class var5 = MatrixData.class;
                        synchronized(MatrixData.class) {
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

        public static MatrixData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MatrixData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            MatrixData defaultInstance = new MatrixData();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(MatrixData.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MatrixData, Builder> implements MatrixDataOrBuilder {
            private Builder() {
                super(MatrixData.DEFAULT_INSTANCE);
            }

            public boolean hasRows() {
                return ((MatrixData)this.instance).hasRows();
            }

            public int getRows() {
                return ((MatrixData)this.instance).getRows();
            }

            public Builder setRows(int value) {
                this.copyOnWrite();
                ((MatrixData)this.instance).setRows(value);
                return this;
            }

            public Builder clearRows() {
                this.copyOnWrite();
                ((MatrixData)this.instance).clearRows();
                return this;
            }

            public boolean hasCols() {
                return ((MatrixData)this.instance).hasCols();
            }

            public int getCols() {
                return ((MatrixData)this.instance).getCols();
            }

            public Builder setCols(int value) {
                this.copyOnWrite();
                ((MatrixData)this.instance).setCols(value);
                return this;
            }

            public Builder clearCols() {
                this.copyOnWrite();
                ((MatrixData)this.instance).clearCols();
                return this;
            }

            public List<Float> getPackedDataList() {
                return Collections.unmodifiableList(((MatrixData)this.instance).getPackedDataList());
            }

            public int getPackedDataCount() {
                return ((MatrixData)this.instance).getPackedDataCount();
            }

            public float getPackedData(int index) {
                return ((MatrixData)this.instance).getPackedData(index);
            }

            public Builder setPackedData(int index, float value) {
                this.copyOnWrite();
                ((MatrixData)this.instance).setPackedData(index, value);
                return this;
            }

            public Builder addPackedData(float value) {
                this.copyOnWrite();
                ((MatrixData)this.instance).addPackedData(value);
                return this;
            }

            public Builder addAllPackedData(Iterable<? extends Float> values) {
                this.copyOnWrite();
                ((MatrixData)this.instance).addAllPackedData(values);
                return this;
            }

            public Builder clearPackedData() {
                this.copyOnWrite();
                ((MatrixData)this.instance).clearPackedData();
                return this;
            }

            public boolean hasLayout() {
                return ((MatrixData)this.instance).hasLayout();
            }

            public Layout getLayout() {
                return ((MatrixData)this.instance).getLayout();
            }

            public Builder setLayout(Layout value) {
                this.copyOnWrite();
                ((MatrixData)this.instance).setLayout(value);
                return this;
            }

            public Builder clearLayout() {
                this.copyOnWrite();
                ((MatrixData)this.instance).clearLayout();
                return this;
            }
        }

        public static enum Layout implements EnumLite {
            COLUMN_MAJOR(0),
            ROW_MAJOR(1);

            public static final int COLUMN_MAJOR_VALUE = 0;
            public static final int ROW_MAJOR_VALUE = 1;
            private static final EnumLiteMap<Layout> internalValueMap = new EnumLiteMap<Layout>() {
                public Layout findValueByNumber(int number) {
                    return Layout.forNumber(number);
                }
            };
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            /** @deprecated */
            @Deprecated
            public static Layout valueOf(int value) {
                return forNumber(value);
            }

            public static Layout forNumber(int value) {
                switch(value) {
                    case 0:
                        return COLUMN_MAJOR;
                    case 1:
                        return ROW_MAJOR;
                    default:
                        return null;
                }
            }

            public static EnumLiteMap<Layout> internalGetValueMap() {
                return internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return LayoutVerifier.INSTANCE;
            }

            private Layout(int value) {
                this.value = value;
            }

            private static final class LayoutVerifier implements EnumVerifier {
                static final EnumVerifier INSTANCE = new LayoutVerifier();

                private LayoutVerifier() {
                }

                public boolean isInRange(int number) {
                    return Layout.forNumber(number) != null;
                }
            }
        }
    }

    public interface MatrixDataOrBuilder extends MessageLiteOrBuilder {
        boolean hasRows();

        int getRows();

        boolean hasCols();

        int getCols();

        List<Float> getPackedDataList();

        int getPackedDataCount();

        float getPackedData(int index);

        boolean hasLayout();

        MatrixData.Layout getLayout();
    }
}
