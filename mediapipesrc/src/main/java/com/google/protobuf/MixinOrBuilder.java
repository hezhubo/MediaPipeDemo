// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/api.proto

package com.google.protobuf;

public interface MixinOrBuilder extends
        // @@protoc_insertion_point(interface_extends:google.protobuf.Mixin)
        MessageLiteOrBuilder {

    /**
     * <pre>
     * The fully qualified name of the interface which is included.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    String getName();
    /**
     * <pre>
     * The fully qualified name of the interface which is included.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    ByteString
    getNameBytes();

    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>string root = 2;</code>
     * @return The root.
     */
    String getRoot();
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>string root = 2;</code>
     * @return The bytes for root.
     */
    ByteString
    getRootBytes();
}