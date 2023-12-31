// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/struct.proto

package com.google.protobuf;

/**
 * <pre>
 * `ListValue` is a wrapper around a repeated field of values.
 * The JSON representation for `ListValue` is JSON array.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.ListValue}
 */
public  final class ListValue extends
        GeneratedMessageLite<
                ListValue, ListValue.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.ListValue)
        ListValueOrBuilder {
    private ListValue() {
        values_ = emptyProtobufList();
    }
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_;
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    @Override
    public java.util.List<Value> getValuesList() {
        return values_;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    public java.util.List<? extends ValueOrBuilder>
    getValuesOrBuilderList() {
        return values_;
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    @Override
    public int getValuesCount() {
        return values_.size();
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    @Override
    public Value getValues(int index) {
        return values_.get(index);
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    public ValueOrBuilder getValuesOrBuilder(
            int index) {
        return values_.get(index);
    }
    private void ensureValuesIsMutable() {
        Internal.ProtobufList<Value> tmp = values_;
        if (!tmp.isModifiable()) {
            values_ =
                    GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void setValues(
            int index, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        values_.set(index, value);
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        values_.add(value);
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void addValues(
            int index, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        values_.add(index, value);
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void addAllValues(
            Iterable<? extends Value> values) {
        ensureValuesIsMutable();
        AbstractMessageLite.addAll(
                values, values_);
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void clearValues() {
        values_ = emptyProtobufList();
    }
    /**
     * <pre>
     * Repeated field of dynamically typed values.
     * </pre>
     *
     * <code>repeated .google.protobuf.Value values = 1;</code>
     */
    private void removeValues(int index) {
        ensureValuesIsMutable();
        values_.remove(index);
    }

    public static ListValue parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static ListValue parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ListValue parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static ListValue parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ListValue parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static ListValue parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ListValue parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static ListValue parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ListValue parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ListValue parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ListValue parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static ListValue parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(ListValue prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * `ListValue` is a wrapper around a repeated field of values.
     * The JSON representation for `ListValue` is JSON array.
     * </pre>
     *
     * Protobuf type {@code google.protobuf.ListValue}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    ListValue, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.ListValue)
            ListValueOrBuilder {
        // Construct using com.google.protobuf.ListValue.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        @Override
        public java.util.List<Value> getValuesList() {
            return java.util.Collections.unmodifiableList(
                    instance.getValuesList());
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        @Override
        public int getValuesCount() {
            return instance.getValuesCount();
        }/**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        @Override
        public Value getValues(int index) {
            return instance.getValues(index);
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder setValues(
                int index, Value value) {
            copyOnWrite();
            instance.setValues(index, value);
            return this;
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder setValues(
                int index, Value.Builder builderForValue) {
            copyOnWrite();
            instance.setValues(index,
                    builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addValues(Value value) {
            copyOnWrite();
            instance.addValues(value);
            return this;
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addValues(
                int index, Value value) {
            copyOnWrite();
            instance.addValues(index, value);
            return this;
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addValues(
                Value.Builder builderForValue) {
            copyOnWrite();
            instance.addValues(builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addValues(
                int index, Value.Builder builderForValue) {
            copyOnWrite();
            instance.addValues(index,
                    builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder addAllValues(
                Iterable<? extends Value> values) {
            copyOnWrite();
            instance.addAllValues(values);
            return this;
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder clearValues() {
            copyOnWrite();
            instance.clearValues();
            return this;
        }
        /**
         * <pre>
         * Repeated field of dynamically typed values.
         * </pre>
         *
         * <code>repeated .google.protobuf.Value values = 1;</code>
         */
        public Builder removeValues(int index) {
            copyOnWrite();
            instance.removeValues(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.ListValue)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new ListValue();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[] {
                        "values_",
                        Value.class,
                };
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<ListValue> parser = PARSER;
                if (parser == null) {
                    synchronized (ListValue.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<ListValue>(
                                            DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            }
            case GET_MEMOIZED_IS_INITIALIZED: {
                return (byte) 1;
            }
            case SET_MEMOIZED_IS_INITIALIZED: {
                return null;
            }
        }
        throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:google.protobuf.ListValue)
    private static final ListValue DEFAULT_INSTANCE;
    static {
        ListValue defaultInstance = new ListValue();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                ListValue.class, defaultInstance);
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile Parser<ListValue> PARSER;

    public static Parser<ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

