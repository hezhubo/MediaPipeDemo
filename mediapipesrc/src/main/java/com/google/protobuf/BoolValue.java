// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/wrappers.proto

package com.google.protobuf;

/**
 * <pre>
 * Wrapper message for `bool`.
 * The JSON representation for `BoolValue` is JSON `true` and `false`.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.BoolValue}
 */
public  final class BoolValue extends
        GeneratedMessageLite<
                BoolValue, BoolValue.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.BoolValue)
        BoolValueOrBuilder {
    private BoolValue() {
    }
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;
    /**
     * <pre>
     * The bool value.
     * </pre>
     *
     * <code>bool value = 1;</code>
     * @return The value.
     */
    @Override
    public boolean getValue() {
        return value_;
    }
    /**
     * <pre>
     * The bool value.
     * </pre>
     *
     * <code>bool value = 1;</code>
     * @param value The value to set.
     */
    private void setValue(boolean value) {

        value_ = value;
    }
    /**
     * <pre>
     * The bool value.
     * </pre>
     *
     * <code>bool value = 1;</code>
     */
    private void clearValue() {

        value_ = false;
    }

    public static BoolValue parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static BoolValue parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static BoolValue parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static BoolValue parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static BoolValue parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static BoolValue parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static BoolValue parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static BoolValue parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static BoolValue parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static BoolValue parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static BoolValue parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static BoolValue parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(BoolValue prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Wrapper message for `bool`.
     * The JSON representation for `BoolValue` is JSON `true` and `false`.
     * </pre>
     *
     * Protobuf type {@code google.protobuf.BoolValue}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    BoolValue, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.BoolValue)
            BoolValueOrBuilder {
        // Construct using com.google.protobuf.BoolValue.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * The bool value.
         * </pre>
         *
         * <code>bool value = 1;</code>
         * @return The value.
         */
        @Override
        public boolean getValue() {
            return instance.getValue();
        }
        /**
         * <pre>
         * The bool value.
         * </pre>
         *
         * <code>bool value = 1;</code>
         * @param value The value to set.
         * @return This builder for chaining.
         */
        public Builder setValue(boolean value) {
            copyOnWrite();
            instance.setValue(value);
            return this;
        }
        /**
         * <pre>
         * The bool value.
         * </pre>
         *
         * <code>bool value = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearValue() {
            copyOnWrite();
            instance.clearValue();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.BoolValue)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new BoolValue();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[] {
                        "value_",
                };
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<BoolValue> parser = PARSER;
                if (parser == null) {
                    synchronized (BoolValue.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<BoolValue>(
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


    // @@protoc_insertion_point(class_scope:google.protobuf.BoolValue)
    private static final BoolValue DEFAULT_INSTANCE;
    static {
        BoolValue defaultInstance = new BoolValue();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                BoolValue.class, defaultInstance);
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static BoolValue of(boolean value) {
        return newBuilder().setValue(value).build();
    }

    private static volatile Parser<BoolValue> PARSER;

    public static Parser<BoolValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

