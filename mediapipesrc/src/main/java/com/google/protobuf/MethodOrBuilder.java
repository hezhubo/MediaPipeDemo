// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/api.proto

package com.google.protobuf;

public interface MethodOrBuilder extends
        // @@protoc_insertion_point(interface_extends:google.protobuf.Method)
        MessageLiteOrBuilder {

    /**
     * <pre>
     * The simple name of this method.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    String getName();
    /**
     * <pre>
     * The simple name of this method.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    ByteString
    getNameBytes();

    /**
     * <pre>
     * A URL of the input message type.
     * </pre>
     *
     * <code>string request_type_url = 2;</code>
     * @return The requestTypeUrl.
     */
    String getRequestTypeUrl();
    /**
     * <pre>
     * A URL of the input message type.
     * </pre>
     *
     * <code>string request_type_url = 2;</code>
     * @return The bytes for requestTypeUrl.
     */
    ByteString
    getRequestTypeUrlBytes();

    /**
     * <pre>
     * If true, the request is streamed.
     * </pre>
     *
     * <code>bool request_streaming = 3;</code>
     * @return The requestStreaming.
     */
    boolean getRequestStreaming();

    /**
     * <pre>
     * The URL of the output message type.
     * </pre>
     *
     * <code>string response_type_url = 4;</code>
     * @return The responseTypeUrl.
     */
    String getResponseTypeUrl();
    /**
     * <pre>
     * The URL of the output message type.
     * </pre>
     *
     * <code>string response_type_url = 4;</code>
     * @return The bytes for responseTypeUrl.
     */
    ByteString
    getResponseTypeUrlBytes();

    /**
     * <pre>
     * If true, the response is streamed.
     * </pre>
     *
     * <code>bool response_streaming = 5;</code>
     * @return The responseStreaming.
     */
    boolean getResponseStreaming();

    /**
     * <pre>
     * Any metadata attached to the method.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 6;</code>
     */
    java.util.List<Option>
    getOptionsList();
    /**
     * <pre>
     * Any metadata attached to the method.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 6;</code>
     */
    Option getOptions(int index);
    /**
     * <pre>
     * Any metadata attached to the method.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 6;</code>
     */
    int getOptionsCount();

    /**
     * <pre>
     * The source syntax of this method.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 7;</code>
     * @return The enum numeric value on the wire for syntax.
     */
    int getSyntaxValue();
    /**
     * <pre>
     * The source syntax of this method.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 7;</code>
     * @return The syntax.
     */
    Syntax getSyntax();
}
