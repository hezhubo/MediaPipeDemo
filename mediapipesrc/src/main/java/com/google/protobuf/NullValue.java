// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/struct.proto

package com.google.protobuf;

/**
 * <pre>
 * `NullValue` is a singleton enumeration to represent the null value for the
 * `Value` type union.
 *  The JSON representation for `NullValue` is JSON `null`.
 * </pre>
 *
 * Protobuf enum {@code google.protobuf.NullValue}
 */
public enum NullValue
        implements Internal.EnumLite {
    /**
     * <pre>
     * Null value.
     * </pre>
     *
     * <code>NULL_VALUE = 0;</code>
     */
    NULL_VALUE(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Null value.
     * </pre>
     *
     * <code>NULL_VALUE = 0;</code>
     */
    public static final int NULL_VALUE_VALUE = 0;


    @Override
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException(
                    "Can't get the number of an unknown enum value.");
        }
        return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static NullValue valueOf(int value) {
        return forNumber(value);
    }

    public static NullValue forNumber(int value) {
        switch (value) {
            case 0: return NULL_VALUE;
            default: return null;
        }
    }

    public static Internal.EnumLiteMap<NullValue>
    internalGetValueMap() {
        return internalValueMap;
    }
    private static final Internal.EnumLiteMap<
            NullValue> internalValueMap =
            new Internal.EnumLiteMap<NullValue>() {
                @Override
                public NullValue findValueByNumber(int number) {
                    return NullValue.forNumber(number);
                }
            };

    public static Internal.EnumVerifier
    internalGetVerifier() {
        return NullValueVerifier.INSTANCE;
    }

    private static final class NullValueVerifier implements
            Internal.EnumVerifier {
        static final Internal.EnumVerifier           INSTANCE = new NullValueVerifier();
        @Override
        public boolean isInRange(int number) {
            return NullValue.forNumber(number) != null;
        }
    };

    private final int value;

    private NullValue(int value) {
        this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.protobuf.NullValue)
}
