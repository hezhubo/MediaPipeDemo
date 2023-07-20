// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/wrappers.proto

package com.google.protobuf;

/**
 * <pre>
 * Wrapper message for `float`.
 * The JSON representation for `FloatValue` is JSON number.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.FloatValue}
 */
public  final class FloatValue extends
        GeneratedMessageLite<
                FloatValue, FloatValue.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.FloatValue)
        FloatValueOrBuilder {
    private FloatValue() {
    }
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;
    /**
     * <pre>
     * The float value.
     * </pre>
     *
     * <code>float value = 1;</code>
     * @return The value.
     */
    @Override
    public float getValue() {
        return value_;
    }
    /**
     * <pre>
     * The float value.
     * </pre>
     *
     * <code>float value = 1;</code>
     * @param value The value to set.
     */
    private void setValue(float value) {

        value_ = value;
    }
    /**
     * <pre>
     * The float value.
     * </pre>
     *
     * <code>float value = 1;</code>
     */
    private void clearValue() {

        value_ = 0F;
    }

    public static FloatValue parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static FloatValue parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static FloatValue parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static FloatValue parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static FloatValue parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static FloatValue parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static FloatValue parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static FloatValue parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static FloatValue parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static FloatValue parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static FloatValue parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static FloatValue parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(FloatValue prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Wrapper message for `float`.
     * The JSON representation for `FloatValue` is JSON number.
     * </pre>
     *
     * Protobuf type {@code google.protobuf.FloatValue}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    FloatValue, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.FloatValue)
            FloatValueOrBuilder {
        // Construct using com.google.protobuf.FloatValue.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * The float value.
         * </pre>
         *
         * <code>float value = 1;</code>
         * @return The value.
         */
        @Override
        public float getValue() {
            return instance.getValue();
        }
        /**
         * <pre>
         * The float value.
         * </pre>
         *
         * <code>float value = 1;</code>
         * @param value The value to set.
         * @return This builder for chaining.
         */
        public Builder setValue(float value) {
            copyOnWrite();
            instance.setValue(value);
            return this;
        }
        /**
         * <pre>
         * The float value.
         * </pre>
         *
         * <code>float value = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearValue() {
            copyOnWrite();
            instance.clearValue();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.FloatValue)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new FloatValue();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[] {
                        "value_",
                };
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<FloatValue> parser = PARSER;
                if (parser == null) {
                    synchronized (FloatValue.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<FloatValue>(
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


    // @@protoc_insertion_point(class_scope:google.protobuf.FloatValue)
    private static final FloatValue DEFAULT_INSTANCE;
    static {
        FloatValue defaultInstance = new FloatValue();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                FloatValue.class, defaultInstance);
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static FloatValue of(float value) {
        return newBuilder().setValue(value).build();
    }

    private static volatile Parser<FloatValue> PARSER;

    public static Parser<FloatValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

