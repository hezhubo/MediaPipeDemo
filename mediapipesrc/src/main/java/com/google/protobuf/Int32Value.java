// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/wrappers.proto

package com.google.protobuf;

/**
 * <pre>
 * Wrapper message for `int32`.
 * The JSON representation for `Int32Value` is JSON number.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Int32Value}
 */
public  final class Int32Value extends
        GeneratedMessageLite<
                Int32Value, Int32Value.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.Int32Value)
        Int32ValueOrBuilder {
    private Int32Value() {
    }
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;
    /**
     * <pre>
     * The int32 value.
     * </pre>
     *
     * <code>int32 value = 1;</code>
     * @return The value.
     */
    @Override
    public int getValue() {
        return value_;
    }
    /**
     * <pre>
     * The int32 value.
     * </pre>
     *
     * <code>int32 value = 1;</code>
     * @param value The value to set.
     */
    private void setValue(int value) {

        value_ = value;
    }
    /**
     * <pre>
     * The int32 value.
     * </pre>
     *
     * <code>int32 value = 1;</code>
     */
    private void clearValue() {

        value_ = 0;
    }

    public static Int32Value parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Int32Value parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Int32Value parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Int32Value parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Int32Value parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Int32Value parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Int32Value parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Int32Value parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Int32Value parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static Int32Value parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Int32Value parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Int32Value parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(Int32Value prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Wrapper message for `int32`.
     * The JSON representation for `Int32Value` is JSON number.
     * </pre>
     *
     * Protobuf type {@code google.protobuf.Int32Value}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    Int32Value, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.Int32Value)
            Int32ValueOrBuilder {
        // Construct using com.google.protobuf.Int32Value.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * The int32 value.
         * </pre>
         *
         * <code>int32 value = 1;</code>
         * @return The value.
         */
        @Override
        public int getValue() {
            return instance.getValue();
        }
        /**
         * <pre>
         * The int32 value.
         * </pre>
         *
         * <code>int32 value = 1;</code>
         * @param value The value to set.
         * @return This builder for chaining.
         */
        public Builder setValue(int value) {
            copyOnWrite();
            instance.setValue(value);
            return this;
        }
        /**
         * <pre>
         * The int32 value.
         * </pre>
         *
         * <code>int32 value = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearValue() {
            copyOnWrite();
            instance.clearValue();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.Int32Value)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Int32Value();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[] {
                        "value_",
                };
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Int32Value> parser = PARSER;
                if (parser == null) {
                    synchronized (Int32Value.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<Int32Value>(
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


    // @@protoc_insertion_point(class_scope:google.protobuf.Int32Value)
    private static final Int32Value DEFAULT_INSTANCE;
    static {
        Int32Value defaultInstance = new Int32Value();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                Int32Value.class, defaultInstance);
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Int32Value of(int value) {
        return newBuilder().setValue(value).build();
    }

    private static volatile Parser<Int32Value> PARSER;

    public static Parser<Int32Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

