// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/source_context.proto

package com.google.protobuf;

/**
 * <pre>
 * `SourceContext` represents information about the source of a
 * protobuf element, like the file in which it is defined.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.SourceContext}
 */
public  final class SourceContext extends
        GeneratedMessageLite<
                SourceContext, SourceContext.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.SourceContext)
        SourceContextOrBuilder {
    private SourceContext() {
        fileName_ = "";
    }
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private String fileName_;
    /**
     * <pre>
     * The path-qualified name of the .proto file that contained the associated
     * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
     * </pre>
     *
     * <code>string file_name = 1;</code>
     * @return The fileName.
     */
    @Override
    public String getFileName() {
        return fileName_;
    }
    /**
     * <pre>
     * The path-qualified name of the .proto file that contained the associated
     * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
     * </pre>
     *
     * <code>string file_name = 1;</code>
     * @return The bytes for fileName.
     */
    @Override
    public ByteString
    getFileNameBytes() {
        return ByteString.copyFromUtf8(fileName_);
    }
    /**
     * <pre>
     * The path-qualified name of the .proto file that contained the associated
     * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
     * </pre>
     *
     * <code>string file_name = 1;</code>
     * @param value The fileName to set.
     */
    private void setFileName(
            String value) {
        Class<?> valueClass = value.getClass();

        fileName_ = value;
    }
    /**
     * <pre>
     * The path-qualified name of the .proto file that contained the associated
     * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
     * </pre>
     *
     * <code>string file_name = 1;</code>
     */
    private void clearFileName() {

        fileName_ = getDefaultInstance().getFileName();
    }
    /**
     * <pre>
     * The path-qualified name of the .proto file that contained the associated
     * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
     * </pre>
     *
     * <code>string file_name = 1;</code>
     * @param value The bytes for fileName to set.
     */
    private void setFileNameBytes(
            ByteString value) {
        checkByteStringIsUtf8(value);
        fileName_ = value.toStringUtf8();

    }

    public static SourceContext parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static SourceContext parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static SourceContext parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static SourceContext parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static SourceContext parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static SourceContext parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static SourceContext parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static SourceContext parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static SourceContext parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static SourceContext parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static SourceContext parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static SourceContext parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(SourceContext prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * `SourceContext` represents information about the source of a
     * protobuf element, like the file in which it is defined.
     * </pre>
     *
     * Protobuf type {@code google.protobuf.SourceContext}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    SourceContext, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.SourceContext)
            SourceContextOrBuilder {
        // Construct using com.google.protobuf.SourceContext.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * The path-qualified name of the .proto file that contained the associated
         * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
         * </pre>
         *
         * <code>string file_name = 1;</code>
         * @return The fileName.
         */
        @Override
        public String getFileName() {
            return instance.getFileName();
        }
        /**
         * <pre>
         * The path-qualified name of the .proto file that contained the associated
         * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
         * </pre>
         *
         * <code>string file_name = 1;</code>
         * @return The bytes for fileName.
         */
        @Override
        public ByteString
        getFileNameBytes() {
            return instance.getFileNameBytes();
        }
        /**
         * <pre>
         * The path-qualified name of the .proto file that contained the associated
         * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
         * </pre>
         *
         * <code>string file_name = 1;</code>
         * @param value The fileName to set.
         * @return This builder for chaining.
         */
        public Builder setFileName(
                String value) {
            copyOnWrite();
            instance.setFileName(value);
            return this;
        }
        /**
         * <pre>
         * The path-qualified name of the .proto file that contained the associated
         * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
         * </pre>
         *
         * <code>string file_name = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearFileName() {
            copyOnWrite();
            instance.clearFileName();
            return this;
        }
        /**
         * <pre>
         * The path-qualified name of the .proto file that contained the associated
         * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
         * </pre>
         *
         * <code>string file_name = 1;</code>
         * @param value The bytes for fileName to set.
         * @return This builder for chaining.
         */
        public Builder setFileNameBytes(
                ByteString value) {
            copyOnWrite();
            instance.setFileNameBytes(value);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.SourceContext)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new SourceContext();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[] {
                        "fileName_",
                };
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<SourceContext> parser = PARSER;
                if (parser == null) {
                    synchronized (SourceContext.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<SourceContext>(
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


    // @@protoc_insertion_point(class_scope:google.protobuf.SourceContext)
    private static final SourceContext DEFAULT_INSTANCE;
    static {
        SourceContext defaultInstance = new SourceContext();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                SourceContext.class, defaultInstance);
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile Parser<SourceContext> PARSER;

    public static Parser<SourceContext> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

