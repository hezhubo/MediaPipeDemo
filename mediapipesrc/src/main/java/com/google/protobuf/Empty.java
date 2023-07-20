// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/empty.proto

package com.google.protobuf;

/**
 * <pre>
 * A generic empty message that you can re-use to avoid defining duplicated
 * empty messages in your APIs. A typical example is to use it as the request
 * or the response type of an API method. For instance:
 *     service Foo {
 *       rpc Bar(google.protobuf.Empty) returns (google.protobuf.Empty);
 *     }
 * The JSON representation for `Empty` is empty JSON object `{}`.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Empty}
 */
public  final class Empty extends
        GeneratedMessageLite<
                Empty, Empty.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.Empty)
        EmptyOrBuilder {
    private Empty() {
    }
    public static Empty parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Empty parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Empty parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Empty parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Empty parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Empty parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Empty parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Empty parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Empty parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static Empty parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Empty parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Empty parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(Empty prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A generic empty message that you can re-use to avoid defining duplicated
     * empty messages in your APIs. A typical example is to use it as the request
     * or the response type of an API method. For instance:
     *     service Foo {
     *       rpc Bar(google.protobuf.Empty) returns (google.protobuf.Empty);
     *     }
     * The JSON representation for `Empty` is empty JSON object `{}`.
     * </pre>
     *
     * Protobuf type {@code google.protobuf.Empty}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    Empty, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.Empty)
            EmptyOrBuilder {
        // Construct using com.google.protobuf.Empty.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        // @@protoc_insertion_point(builder_scope:google.protobuf.Empty)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Empty();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = null;
                String info =
                        "\u0000\u0000";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Empty> parser = PARSER;
                if (parser == null) {
                    synchronized (Empty.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<Empty>(
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


    // @@protoc_insertion_point(class_scope:google.protobuf.Empty)
    private static final Empty DEFAULT_INSTANCE;
    static {
        Empty defaultInstance = new Empty();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                Empty.class, defaultInstance);
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile Parser<Empty> PARSER;

    public static Parser<Empty> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

