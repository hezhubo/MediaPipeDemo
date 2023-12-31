// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

/**
 * <pre>
 * Enum type definition.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Enum}
 */
public  final class Enum extends
        GeneratedMessageLite<
                Enum, Enum.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.Enum)
        EnumOrBuilder {
    private Enum() {
        name_ = "";
        enumvalue_ = emptyProtobufList();
        options_ = emptyProtobufList();
    }
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_;
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @Override
    public String getName() {
        return name_;
    }
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @Override
    public ByteString
    getNameBytes() {
        return ByteString.copyFromUtf8(name_);
    }
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     */
    private void setName(
            String value) {
        Class<?> valueClass = value.getClass();

        name_ = value;
    }
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    private void clearName() {

        name_ = getDefaultInstance().getName();
    }
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     */
    private void setNameBytes(
            ByteString value) {
        checkByteStringIsUtf8(value);
        name_ = value.toStringUtf8();

    }

    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    private Internal.ProtobufList<EnumValue> enumvalue_;
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    @Override
    public java.util.List<EnumValue> getEnumvalueList() {
        return enumvalue_;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public java.util.List<? extends EnumValueOrBuilder>
    getEnumvalueOrBuilderList() {
        return enumvalue_;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    @Override
    public int getEnumvalueCount() {
        return enumvalue_.size();
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    @Override
    public EnumValue getEnumvalue(int index) {
        return enumvalue_.get(index);
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public EnumValueOrBuilder getEnumvalueOrBuilder(
            int index) {
        return enumvalue_.get(index);
    }
    private void ensureEnumvalueIsMutable() {
        Internal.ProtobufList<EnumValue> tmp = enumvalue_;
        if (!tmp.isModifiable()) {
            enumvalue_ =
                    GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    private void setEnumvalue(
            int index, EnumValue value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        enumvalue_.set(index, value);
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    private void addEnumvalue(EnumValue value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        enumvalue_.add(value);
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    private void addEnumvalue(
            int index, EnumValue value) {
        value.getClass();
        ensureEnumvalueIsMutable();
        enumvalue_.add(index, value);
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    private void addAllEnumvalue(
            Iterable<? extends EnumValue> values) {
        ensureEnumvalueIsMutable();
        AbstractMessageLite.addAll(
                values, enumvalue_);
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    private void clearEnumvalue() {
        enumvalue_ = emptyProtobufList();
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    private void removeEnumvalue(int index) {
        ensureEnumvalueIsMutable();
        enumvalue_.remove(index);
    }

    public static final int OPTIONS_FIELD_NUMBER = 3;
    private Internal.ProtobufList<Option> options_;
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    @Override
    public java.util.List<Option> getOptionsList() {
        return options_;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public java.util.List<? extends OptionOrBuilder>
    getOptionsOrBuilderList() {
        return options_;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    @Override
    public int getOptionsCount() {
        return options_.size();
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    @Override
    public Option getOptions(int index) {
        return options_.get(index);
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public OptionOrBuilder getOptionsOrBuilder(
            int index) {
        return options_.get(index);
    }
    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<Option> tmp = options_;
        if (!tmp.isModifiable()) {
            options_ =
                    GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    private void setOptions(
            int index, Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        options_.set(index, value);
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    private void addOptions(Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        options_.add(value);
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    private void addOptions(
            int index, Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        options_.add(index, value);
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    private void addAllOptions(
            Iterable<? extends Option> values) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(
                values, options_);
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    private void clearOptions() {
        options_ = emptyProtobufList();
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    private void removeOptions(int index) {
        ensureOptionsIsMutable();
        options_.remove(index);
    }

    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    private SourceContext sourceContext_;
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    @Override
    public boolean hasSourceContext() {
        return sourceContext_ != null;
    }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    @Override
    public SourceContext getSourceContext() {
        return sourceContext_ == null ? SourceContext.getDefaultInstance() : sourceContext_;
    }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    private void setSourceContext(SourceContext value) {
        value.getClass();
        sourceContext_ = value;

    }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    @SuppressWarnings({"ReferenceEquality"})
    private void mergeSourceContext(SourceContext value) {
        value.getClass();
        if (sourceContext_ != null &&
                sourceContext_ != SourceContext.getDefaultInstance()) {
            sourceContext_ =
                    SourceContext.newBuilder(sourceContext_).mergeFrom(value).buildPartial();
        } else {
            sourceContext_ = value;
        }

    }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    private void clearSourceContext() {  sourceContext_ = null;

    }

    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int syntax_;
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @return The enum numeric value on the wire for syntax.
     */
    @Override
    public int getSyntaxValue() {
        return syntax_;
    }
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @return The syntax.
     */
    @Override
    public Syntax getSyntax() {
        Syntax result = Syntax.forNumber(syntax_);
        return result == null ? Syntax.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @param value The enum numeric value on the wire for syntax to set.
     */
    private void setSyntaxValue(int value) {
        syntax_ = value;
    }
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @param value The syntax to set.
     */
    private void setSyntax(Syntax value) {
        syntax_ = value.getNumber();

    }
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     */
    private void clearSyntax() {

        syntax_ = 0;
    }

    public static Enum parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Enum parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Enum parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Enum parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Enum parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Enum parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Enum parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Enum parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Enum parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static Enum parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Enum parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Enum parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(Enum prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Enum type definition.
     * </pre>
     *
     * Protobuf type {@code google.protobuf.Enum}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    Enum, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.Enum)
            EnumOrBuilder {
        // Construct using com.google.protobuf.Enum.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * Enum type name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * @return The name.
         */
        @Override
        public String getName() {
            return instance.getName();
        }
        /**
         * <pre>
         * Enum type name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * @return The bytes for name.
         */
        @Override
        public ByteString
        getNameBytes() {
            return instance.getNameBytes();
        }
        /**
         * <pre>
         * Enum type name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(
                String value) {
            copyOnWrite();
            instance.setName(value);
            return this;
        }
        /**
         * <pre>
         * Enum type name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearName() {
            copyOnWrite();
            instance.clearName();
            return this;
        }
        /**
         * <pre>
         * Enum type name.
         * </pre>
         *
         * <code>string name = 1;</code>
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(
                ByteString value) {
            copyOnWrite();
            instance.setNameBytes(value);
            return this;
        }

        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        @Override
        public java.util.List<EnumValue> getEnumvalueList() {
            return java.util.Collections.unmodifiableList(
                    instance.getEnumvalueList());
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        @Override
        public int getEnumvalueCount() {
            return instance.getEnumvalueCount();
        }/**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        @Override
        public EnumValue getEnumvalue(int index) {
            return instance.getEnumvalue(index);
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder setEnumvalue(
                int index, EnumValue value) {
            copyOnWrite();
            instance.setEnumvalue(index, value);
            return this;
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder setEnumvalue(
                int index, EnumValue.Builder builderForValue) {
            copyOnWrite();
            instance.setEnumvalue(index,
                    builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder addEnumvalue(EnumValue value) {
            copyOnWrite();
            instance.addEnumvalue(value);
            return this;
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder addEnumvalue(
                int index, EnumValue value) {
            copyOnWrite();
            instance.addEnumvalue(index, value);
            return this;
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder addEnumvalue(
                EnumValue.Builder builderForValue) {
            copyOnWrite();
            instance.addEnumvalue(builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder addEnumvalue(
                int index, EnumValue.Builder builderForValue) {
            copyOnWrite();
            instance.addEnumvalue(index,
                    builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder addAllEnumvalue(
                Iterable<? extends EnumValue> values) {
            copyOnWrite();
            instance.addAllEnumvalue(values);
            return this;
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder clearEnumvalue() {
            copyOnWrite();
            instance.clearEnumvalue();
            return this;
        }
        /**
         * <pre>
         * Enum value definitions.
         * </pre>
         *
         * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
         */
        public Builder removeEnumvalue(int index) {
            copyOnWrite();
            instance.removeEnumvalue(index);
            return this;
        }

        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        @Override
        public java.util.List<Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(
                    instance.getOptionsList());
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        @Override
        public int getOptionsCount() {
            return instance.getOptionsCount();
        }/**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        @Override
        public Option getOptions(int index) {
            return instance.getOptions(index);
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder setOptions(
                int index, Option value) {
            copyOnWrite();
            instance.setOptions(index, value);
            return this;
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder setOptions(
                int index, Option.Builder builderForValue) {
            copyOnWrite();
            instance.setOptions(index,
                    builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder addOptions(Option value) {
            copyOnWrite();
            instance.addOptions(value);
            return this;
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder addOptions(
                int index, Option value) {
            copyOnWrite();
            instance.addOptions(index, value);
            return this;
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder addOptions(
                Option.Builder builderForValue) {
            copyOnWrite();
            instance.addOptions(builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder addOptions(
                int index, Option.Builder builderForValue) {
            copyOnWrite();
            instance.addOptions(index,
                    builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder addAllOptions(
                Iterable<? extends Option> values) {
            copyOnWrite();
            instance.addAllOptions(values);
            return this;
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder clearOptions() {
            copyOnWrite();
            instance.clearOptions();
            return this;
        }
        /**
         * <pre>
         * Protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 3;</code>
         */
        public Builder removeOptions(int index) {
            copyOnWrite();
            instance.removeOptions(index);
            return this;
        }

        /**
         * <pre>
         * The source context.
         * </pre>
         *
         * <code>.google.protobuf.SourceContext source_context = 4;</code>
         */
        @Override
        public boolean hasSourceContext() {
            return instance.hasSourceContext();
        }
        /**
         * <pre>
         * The source context.
         * </pre>
         *
         * <code>.google.protobuf.SourceContext source_context = 4;</code>
         */
        @Override
        public SourceContext getSourceContext() {
            return instance.getSourceContext();
        }
        /**
         * <pre>
         * The source context.
         * </pre>
         *
         * <code>.google.protobuf.SourceContext source_context = 4;</code>
         */
        public Builder setSourceContext(SourceContext value) {
            copyOnWrite();
            instance.setSourceContext(value);
            return this;
        }
        /**
         * <pre>
         * The source context.
         * </pre>
         *
         * <code>.google.protobuf.SourceContext source_context = 4;</code>
         */
        public Builder setSourceContext(
                SourceContext.Builder builderForValue) {
            copyOnWrite();
            instance.setSourceContext(builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * The source context.
         * </pre>
         *
         * <code>.google.protobuf.SourceContext source_context = 4;</code>
         */
        public Builder mergeSourceContext(SourceContext value) {
            copyOnWrite();
            instance.mergeSourceContext(value);
            return this;
        }
        /**
         * <pre>
         * The source context.
         * </pre>
         *
         * <code>.google.protobuf.SourceContext source_context = 4;</code>
         */
        public Builder clearSourceContext() {  copyOnWrite();
            instance.clearSourceContext();
            return this;
        }

        /**
         * <pre>
         * The source syntax.
         * </pre>
         *
         * <code>.google.protobuf.Syntax syntax = 5;</code>
         * @return The enum numeric value on the wire for syntax.
         */
        @Override
        public int getSyntaxValue() {
            return instance.getSyntaxValue();
        }
        /**
         * <pre>
         * The source syntax.
         * </pre>
         *
         * <code>.google.protobuf.Syntax syntax = 5;</code>
         * @param value The syntax to set.
         * @return This builder for chaining.
         */
        public Builder setSyntaxValue(int value) {
            copyOnWrite();
            instance.setSyntaxValue(value);
            return this;
        }
        /**
         * <pre>
         * The source syntax.
         * </pre>
         *
         * <code>.google.protobuf.Syntax syntax = 5;</code>
         * @return The syntax.
         */
        @Override
        public Syntax getSyntax() {
            return instance.getSyntax();
        }
        /**
         * <pre>
         * The source syntax.
         * </pre>
         *
         * <code>.google.protobuf.Syntax syntax = 5;</code>
         * @param value The enum numeric value on the wire for syntax to set.
         * @return This builder for chaining.
         */
        public Builder setSyntax(Syntax value) {
            copyOnWrite();
            instance.setSyntax(value);
            return this;
        }
        /**
         * <pre>
         * The source syntax.
         * </pre>
         *
         * <code>.google.protobuf.Syntax syntax = 5;</code>
         * @return This builder for chaining.
         */
        public Builder clearSyntax() {
            copyOnWrite();
            instance.clearSyntax();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.Enum)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Enum();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[] {
                        "name_",
                        "enumvalue_",
                        EnumValue.class,
                        "options_",
                        Option.class,
                        "sourceContext_",
                        "syntax_",
                };
                String info =
                        "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0208\u0002\u001b" +
                                "\u0003\u001b\u0004\t\u0005\f";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Enum> parser = PARSER;
                if (parser == null) {
                    synchronized (Enum.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<Enum>(
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


    // @@protoc_insertion_point(class_scope:google.protobuf.Enum)
    private static final Enum DEFAULT_INSTANCE;
    static {
        Enum defaultInstance = new Enum();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                Enum.class, defaultInstance);
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile Parser<Enum> PARSER;

    public static Parser<Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

