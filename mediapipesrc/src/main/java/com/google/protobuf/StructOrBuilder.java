// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/struct.proto

package com.google.protobuf;

public interface StructOrBuilder extends
        // @@protoc_insertion_point(interface_extends:google.protobuf.Struct)
        MessageLiteOrBuilder {

    /**
     * <pre>
     * Unordered map of dynamically typed values.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
     */
    int getFieldsCount();
    /**
     * <pre>
     * Unordered map of dynamically typed values.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
     */
    boolean containsFields(
            String key);
    /**
     * Use {@link #getFieldsMap()} instead.
     */
    @Deprecated
    java.util.Map<String, Value>
    getFields();
    /**
     * <pre>
     * Unordered map of dynamically typed values.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
     */
    java.util.Map<String, Value>
    getFieldsMap();
    /**
     * <pre>
     * Unordered map of dynamically typed values.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
     */

    Value getFieldsOrDefault(
            String key,
            Value defaultValue);
    /**
     * <pre>
     * Unordered map of dynamically typed values.
     * </pre>
     *
     * <code>map&lt;string, .google.protobuf.Value&gt; fields = 1;</code>
     */

    Value getFieldsOrThrow(
            String key);
}
