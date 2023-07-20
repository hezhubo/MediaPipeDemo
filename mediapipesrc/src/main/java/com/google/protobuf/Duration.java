// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/duration.proto

package com.google.protobuf;

/**
 * <pre>
 * A Duration represents a signed, fixed-length span of time represented
 * as a count of seconds and fractions of seconds at nanosecond
 * resolution. It is independent of any calendar and concepts like "day"
 * or "month". It is related to Timestamp in that the difference between
 * two Timestamp values is a Duration and it can be added or subtracted
 * from a Timestamp. Range is approximately +-10,000 years.
 * # Examples
 * Example 1: Compute Duration from two Timestamps in pseudo code.
 *     Timestamp start = ...;
 *     Timestamp end = ...;
 *     Duration duration = ...;
 *     duration.seconds = end.seconds - start.seconds;
 *     duration.nanos = end.nanos - start.nanos;
 *     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {
 *       duration.seconds += 1;
 *       duration.nanos -= 1000000000;
 *     } else if (duration.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {
 *       duration.seconds -= 1;
 *       duration.nanos += 1000000000;
 *     }
 * Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.
 *     Timestamp start = ...;
 *     Duration duration = ...;
 *     Timestamp end = ...;
 *     end.seconds = start.seconds + duration.seconds;
 *     end.nanos = start.nanos + duration.nanos;
 *     if (end.nanos &lt; 0) {
 *       end.seconds -= 1;
 *       end.nanos += 1000000000;
 *     } else if (end.nanos &gt;= 1000000000) {
 *       end.seconds += 1;
 *       end.nanos -= 1000000000;
 *     }
 * Example 3: Compute Duration from datetime.timedelta in Python.
 *     td = datetime.timedelta(days=3, minutes=10)
 *     duration = Duration()
 *     duration.FromTimedelta(td)
 * # JSON Mapping
 * In JSON format, the Duration type is encoded as a string rather than an
 * object, where the string ends in the suffix "s" (indicating seconds) and
 * is preceded by the number of seconds, with nanoseconds expressed as
 * fractional seconds. For example, 3 seconds with 0 nanoseconds should be
 * encoded in JSON format as "3s", while 3 seconds and 1 nanosecond should
 * be expressed in JSON format as "3.000000001s", and 3 seconds and 1
 * microsecond should be expressed in JSON format as "3.000001s".
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Duration}
 */
public  final class Duration extends
        GeneratedMessageLite<
                Duration, Duration.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.Duration)
        DurationOrBuilder {
    private Duration() {
    }
    public static final int SECONDS_FIELD_NUMBER = 1;
    private long seconds_;
    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive. Note: these bounds are computed from:
     * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>int64 seconds = 1;</code>
     * @return The seconds.
     */
    @Override
    public long getSeconds() {
        return seconds_;
    }
    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive. Note: these bounds are computed from:
     * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>int64 seconds = 1;</code>
     * @param value The seconds to set.
     */
    private void setSeconds(long value) {

        seconds_ = value;
    }
    /**
     * <pre>
     * Signed seconds of the span of time. Must be from -315,576,000,000
     * to +315,576,000,000 inclusive. Note: these bounds are computed from:
     * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>int64 seconds = 1;</code>
     */
    private void clearSeconds() {

        seconds_ = 0L;
    }

    public static final int NANOS_FIELD_NUMBER = 2;
    private int nanos_;
    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>int32 nanos = 2;</code>
     * @return The nanos.
     */
    @Override
    public int getNanos() {
        return nanos_;
    }
    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>int32 nanos = 2;</code>
     * @param value The nanos to set.
     */
    private void setNanos(int value) {

        nanos_ = value;
    }
    /**
     * <pre>
     * Signed fractions of a second at nanosecond resolution of the span
     * of time. Durations less than one second are represented with a 0
     * `seconds` field and a positive or negative `nanos` field. For durations
     * of one second or more, a non-zero value for the `nanos` field must be
     * of the same sign as the `seconds` field. Must be from -999,999,999
     * to +999,999,999 inclusive.
     * </pre>
     *
     * <code>int32 nanos = 2;</code>
     */
    private void clearNanos() {

        nanos_ = 0;
    }

    public static Duration parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Duration parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Duration parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Duration parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Duration parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Duration parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Duration parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Duration parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Duration parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static Duration parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Duration parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Duration parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(Duration prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A Duration represents a signed, fixed-length span of time represented
     * as a count of seconds and fractions of seconds at nanosecond
     * resolution. It is independent of any calendar and concepts like "day"
     * or "month". It is related to Timestamp in that the difference between
     * two Timestamp values is a Duration and it can be added or subtracted
     * from a Timestamp. Range is approximately +-10,000 years.
     * # Examples
     * Example 1: Compute Duration from two Timestamps in pseudo code.
     *     Timestamp start = ...;
     *     Timestamp end = ...;
     *     Duration duration = ...;
     *     duration.seconds = end.seconds - start.seconds;
     *     duration.nanos = end.nanos - start.nanos;
     *     if (duration.seconds &lt; 0 &amp;&amp; duration.nanos &gt; 0) {
     *       duration.seconds += 1;
     *       duration.nanos -= 1000000000;
     *     } else if (duration.seconds &gt; 0 &amp;&amp; duration.nanos &lt; 0) {
     *       duration.seconds -= 1;
     *       duration.nanos += 1000000000;
     *     }
     * Example 2: Compute Timestamp from Timestamp + Duration in pseudo code.
     *     Timestamp start = ...;
     *     Duration duration = ...;
     *     Timestamp end = ...;
     *     end.seconds = start.seconds + duration.seconds;
     *     end.nanos = start.nanos + duration.nanos;
     *     if (end.nanos &lt; 0) {
     *       end.seconds -= 1;
     *       end.nanos += 1000000000;
     *     } else if (end.nanos &gt;= 1000000000) {
     *       end.seconds += 1;
     *       end.nanos -= 1000000000;
     *     }
     * Example 3: Compute Duration from datetime.timedelta in Python.
     *     td = datetime.timedelta(days=3, minutes=10)
     *     duration = Duration()
     *     duration.FromTimedelta(td)
     * # JSON Mapping
     * In JSON format, the Duration type is encoded as a string rather than an
     * object, where the string ends in the suffix "s" (indicating seconds) and
     * is preceded by the number of seconds, with nanoseconds expressed as
     * fractional seconds. For example, 3 seconds with 0 nanoseconds should be
     * encoded in JSON format as "3s", while 3 seconds and 1 nanosecond should
     * be expressed in JSON format as "3.000000001s", and 3 seconds and 1
     * microsecond should be expressed in JSON format as "3.000001s".
     * </pre>
     *
     * Protobuf type {@code google.protobuf.Duration}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    Duration, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.Duration)
            DurationOrBuilder {
        // Construct using com.google.protobuf.Duration.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * Signed seconds of the span of time. Must be from -315,576,000,000
         * to +315,576,000,000 inclusive. Note: these bounds are computed from:
         * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
         * </pre>
         *
         * <code>int64 seconds = 1;</code>
         * @return The seconds.
         */
        @Override
        public long getSeconds() {
            return instance.getSeconds();
        }
        /**
         * <pre>
         * Signed seconds of the span of time. Must be from -315,576,000,000
         * to +315,576,000,000 inclusive. Note: these bounds are computed from:
         * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
         * </pre>
         *
         * <code>int64 seconds = 1;</code>
         * @param value The seconds to set.
         * @return This builder for chaining.
         */
        public Builder setSeconds(long value) {
            copyOnWrite();
            instance.setSeconds(value);
            return this;
        }
        /**
         * <pre>
         * Signed seconds of the span of time. Must be from -315,576,000,000
         * to +315,576,000,000 inclusive. Note: these bounds are computed from:
         * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
         * </pre>
         *
         * <code>int64 seconds = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearSeconds() {
            copyOnWrite();
            instance.clearSeconds();
            return this;
        }

        /**
         * <pre>
         * Signed fractions of a second at nanosecond resolution of the span
         * of time. Durations less than one second are represented with a 0
         * `seconds` field and a positive or negative `nanos` field. For durations
         * of one second or more, a non-zero value for the `nanos` field must be
         * of the same sign as the `seconds` field. Must be from -999,999,999
         * to +999,999,999 inclusive.
         * </pre>
         *
         * <code>int32 nanos = 2;</code>
         * @return The nanos.
         */
        @Override
        public int getNanos() {
            return instance.getNanos();
        }
        /**
         * <pre>
         * Signed fractions of a second at nanosecond resolution of the span
         * of time. Durations less than one second are represented with a 0
         * `seconds` field and a positive or negative `nanos` field. For durations
         * of one second or more, a non-zero value for the `nanos` field must be
         * of the same sign as the `seconds` field. Must be from -999,999,999
         * to +999,999,999 inclusive.
         * </pre>
         *
         * <code>int32 nanos = 2;</code>
         * @param value The nanos to set.
         * @return This builder for chaining.
         */
        public Builder setNanos(int value) {
            copyOnWrite();
            instance.setNanos(value);
            return this;
        }
        /**
         * <pre>
         * Signed fractions of a second at nanosecond resolution of the span
         * of time. Durations less than one second are represented with a 0
         * `seconds` field and a positive or negative `nanos` field. For durations
         * of one second or more, a non-zero value for the `nanos` field must be
         * of the same sign as the `seconds` field. Must be from -999,999,999
         * to +999,999,999 inclusive.
         * </pre>
         *
         * <code>int32 nanos = 2;</code>
         * @return This builder for chaining.
         */
        public Builder clearNanos() {
            copyOnWrite();
            instance.clearNanos();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.Duration)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Duration();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[] {
                        "seconds_",
                        "nanos_",
                };
                String info =
                        "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004" +
                                "";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Duration> parser = PARSER;
                if (parser == null) {
                    synchronized (Duration.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<Duration>(
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


    // @@protoc_insertion_point(class_scope:google.protobuf.Duration)
    private static final Duration DEFAULT_INSTANCE;
    static {
        Duration defaultInstance = new Duration();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                Duration.class, defaultInstance);
    }

    public static Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile Parser<Duration> PARSER;

    public static Parser<Duration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
