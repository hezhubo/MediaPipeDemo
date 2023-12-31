// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

/**
 * <pre>
 * A protocol buffer message type.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Type}
 */
public  final class Type extends
        GeneratedMessageLite<
                Type, Type.Builder> implements
        // @@protoc_insertion_point(message_implements:google.protobuf.Type)
        TypeOrBuilder {
    private Type() {
        name_ = "";
        fields_ = emptyProtobufList();
        oneofs_ = GeneratedMessageLite.emptyProtobufList();
        options_ = emptyProtobufList();
    }
    public static final int NAME_FIELD_NUMBER = 1;
    private String name_;
    /**
     * <pre>
     * The fully qualified message name.
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
     * The fully qualified message name.
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
     * The fully qualified message name.
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
     * The fully qualified message name.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    private void clearName() {

        name_ = getDefaultInstance().getName();
    }
    /**
     * <pre>
     * The fully qualified message name.
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

    public static final int FIELDS_FIELD_NUMBER = 2;
    private Internal.ProtobufList<Field> fields_;
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    @Override
    public java.util.List<Field> getFieldsList() {
        return fields_;
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    public java.util.List<? extends FieldOrBuilder>
    getFieldsOrBuilderList() {
        return fields_;
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    @Override
    public int getFieldsCount() {
        return fields_.size();
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    @Override
    public Field getFields(int index) {
        return fields_.get(index);
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    public FieldOrBuilder getFieldsOrBuilder(
            int index) {
        return fields_.get(index);
    }
    private void ensureFieldsIsMutable() {
        Internal.ProtobufList<Field> tmp = fields_;
        if (!tmp.isModifiable()) {
            fields_ =
                    GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    private void setFields(
            int index, Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        fields_.set(index, value);
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    private void addFields(Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        fields_.add(value);
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    private void addFields(
            int index, Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        fields_.add(index, value);
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    private void addAllFields(
            Iterable<? extends Field> values) {
        ensureFieldsIsMutable();
        AbstractMessageLite.addAll(
                values, fields_);
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    private void clearFields() {
        fields_ = emptyProtobufList();
    }
    /**
     * <pre>
     * The list of fields.
     * </pre>
     *
     * <code>repeated .google.protobuf.Field fields = 2;</code>
     */
    private void removeFields(int index) {
        ensureFieldsIsMutable();
        fields_.remove(index);
    }

    public static final int ONEOFS_FIELD_NUMBER = 3;
    private Internal.ProtobufList<String> oneofs_;
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     * @return A list containing the oneofs.
     */
    @Override
    public java.util.List<String> getOneofsList() {
        return oneofs_;
    }
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     * @return The count of oneofs.
     */
    @Override
    public int getOneofsCount() {
        return oneofs_.size();
    }
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     * @param index The index of the element to return.
     * @return The oneofs at the given index.
     */
    @Override
    public String getOneofs(int index) {
        return oneofs_.get(index);
    }
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the oneofs at the given index.
     */
    @Override
    public ByteString
    getOneofsBytes(int index) {
        return ByteString.copyFromUtf8(
                oneofs_.get(index));
    }
    private void ensureOneofsIsMutable() {
        Internal.ProtobufList<String> tmp =
                oneofs_;  if (!tmp.isModifiable()) {
            oneofs_ =
                    GeneratedMessageLite.mutableCopy(tmp);
        }
    }
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     * @param index The index to set the value at.
     * @param value The oneofs to set.
     */
    private void setOneofs(
            int index, String value) {
        Class<?> valueClass = value.getClass();
        ensureOneofsIsMutable();
        oneofs_.set(index, value);
    }
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     * @param value The oneofs to add.
     */
    private void addOneofs(
            String value) {
        Class<?> valueClass = value.getClass();
        ensureOneofsIsMutable();
        oneofs_.add(value);
    }
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     * @param values The oneofs to add.
     */
    private void addAllOneofs(
            Iterable<String> values) {
        ensureOneofsIsMutable();
        AbstractMessageLite.addAll(
                values, oneofs_);
    }
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     */
    private void clearOneofs() {
        oneofs_ = GeneratedMessageLite.emptyProtobufList();
    }
    /**
     * <pre>
     * The list of types appearing in `oneof` definitions in this type.
     * </pre>
     *
     * <code>repeated string oneofs = 3;</code>
     * @param value The bytes of the oneofs to add.
     */
    private void addOneofsBytes(
            ByteString value) {
        checkByteStringIsUtf8(value);
        ensureOneofsIsMutable();
        oneofs_.add(value.toStringUtf8());
    }

    public static final int OPTIONS_FIELD_NUMBER = 4;
    private Internal.ProtobufList<Option> options_;
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    @Override
    public java.util.List<Option> getOptionsList() {
        return options_;
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    public java.util.List<? extends OptionOrBuilder>
    getOptionsOrBuilderList() {
        return options_;
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    @Override
    public int getOptionsCount() {
        return options_.size();
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    @Override
    public Option getOptions(int index) {
        return options_.get(index);
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
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
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    private void setOptions(
            int index, Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        options_.set(index, value);
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    private void addOptions(Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        options_.add(value);
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    private void addOptions(
            int index, Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        options_.add(index, value);
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    private void addAllOptions(
            Iterable<? extends Option> values) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll(
                values, options_);
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    private void clearOptions() {
        options_ = emptyProtobufList();
    }
    /**
     * <pre>
     * The protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 4;</code>
     */
    private void removeOptions(int index) {
        ensureOptionsIsMutable();
        options_.remove(index);
    }

    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    private SourceContext sourceContext_;
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
     * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
     * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
     * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
     * <code>.google.protobuf.SourceContext source_context = 5;</code>
     */
    private void clearSourceContext() {  sourceContext_ = null;

    }

    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int syntax_;
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 6;</code>
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
     * <code>.google.protobuf.Syntax syntax = 6;</code>
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
     * <code>.google.protobuf.Syntax syntax = 6;</code>
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
     * <code>.google.protobuf.Syntax syntax = 6;</code>
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
     * <code>.google.protobuf.Syntax syntax = 6;</code>
     */
    private void clearSyntax() {

        syntax_ = 0;
    }

    public static Type parseFrom(
            java.nio.ByteBuffer data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Type parseFrom(
            java.nio.ByteBuffer data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Type parseFrom(
            ByteString data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Type parseFrom(
            ByteString data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Type parseFrom(byte[] data)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }
    public static Type parseFrom(
            byte[] data,
            ExtensionRegistryLite extensionRegistry)
            throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static Type parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Type parseFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Type parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static Type parseDelimitedFrom(
            java.io.InputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static Type parseFrom(
            CodedInputStream input)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }
    public static Type parseFrom(
            CodedInputStream input,
            ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(Type prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A protocol buffer message type.
     * </pre>
     *
     * Protobuf type {@code google.protobuf.Type}
     */
    public static final class Builder extends
            GeneratedMessageLite.Builder<
                    Type, Builder> implements
            // @@protoc_insertion_point(builder_implements:google.protobuf.Type)
            TypeOrBuilder {
        // Construct using com.google.protobuf.Type.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * The fully qualified message name.
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
         * The fully qualified message name.
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
         * The fully qualified message name.
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
         * The fully qualified message name.
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
         * The fully qualified message name.
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
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        @Override
        public java.util.List<Field> getFieldsList() {
            return java.util.Collections.unmodifiableList(
                    instance.getFieldsList());
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        @Override
        public int getFieldsCount() {
            return instance.getFieldsCount();
        }/**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        @Override
        public Field getFields(int index) {
            return instance.getFields(index);
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder setFields(
                int index, Field value) {
            copyOnWrite();
            instance.setFields(index, value);
            return this;
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder setFields(
                int index, Field.Builder builderForValue) {
            copyOnWrite();
            instance.setFields(index,
                    builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder addFields(Field value) {
            copyOnWrite();
            instance.addFields(value);
            return this;
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder addFields(
                int index, Field value) {
            copyOnWrite();
            instance.addFields(index, value);
            return this;
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder addFields(
                Field.Builder builderForValue) {
            copyOnWrite();
            instance.addFields(builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder addFields(
                int index, Field.Builder builderForValue) {
            copyOnWrite();
            instance.addFields(index,
                    builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder addAllFields(
                Iterable<? extends Field> values) {
            copyOnWrite();
            instance.addAllFields(values);
            return this;
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder clearFields() {
            copyOnWrite();
            instance.clearFields();
            return this;
        }
        /**
         * <pre>
         * The list of fields.
         * </pre>
         *
         * <code>repeated .google.protobuf.Field fields = 2;</code>
         */
        public Builder removeFields(int index) {
            copyOnWrite();
            instance.removeFields(index);
            return this;
        }

        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @return A list containing the oneofs.
         */
        @Override
        public java.util.List<String>
        getOneofsList() {
            return java.util.Collections.unmodifiableList(
                    instance.getOneofsList());
        }
        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @return The count of oneofs.
         */
        @Override
        public int getOneofsCount() {
            return instance.getOneofsCount();
        }
        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @param index The index of the element to return.
         * @return The oneofs at the given index.
         */
        @Override
        public String getOneofs(int index) {
            return instance.getOneofs(index);
        }
        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @param index The index of the value to return.
         * @return The bytes of the oneofs at the given index.
         */
        @Override
        public ByteString
        getOneofsBytes(int index) {
            return instance.getOneofsBytes(index);
        }
        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @param index The index to set the value at.
         * @param value The oneofs to set.
         * @return This builder for chaining.
         */
        public Builder setOneofs(
                int index, String value) {
            copyOnWrite();
            instance.setOneofs(index, value);
            return this;
        }
        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @param value The oneofs to add.
         * @return This builder for chaining.
         */
        public Builder addOneofs(
                String value) {
            copyOnWrite();
            instance.addOneofs(value);
            return this;
        }
        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @param values The oneofs to add.
         * @return This builder for chaining.
         */
        public Builder addAllOneofs(
                Iterable<String> values) {
            copyOnWrite();
            instance.addAllOneofs(values);
            return this;
        }
        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @return This builder for chaining.
         */
        public Builder clearOneofs() {
            copyOnWrite();
            instance.clearOneofs();
            return this;
        }
        /**
         * <pre>
         * The list of types appearing in `oneof` definitions in this type.
         * </pre>
         *
         * <code>repeated string oneofs = 3;</code>
         * @param value The bytes of the oneofs to add.
         * @return This builder for chaining.
         */
        public Builder addOneofsBytes(
                ByteString value) {
            copyOnWrite();
            instance.addOneofsBytes(value);
            return this;
        }

        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        @Override
        public java.util.List<Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(
                    instance.getOptionsList());
        }
        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        @Override
        public int getOptionsCount() {
            return instance.getOptionsCount();
        }/**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        @Override
        public Option getOptions(int index) {
            return instance.getOptions(index);
        }
        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        public Builder setOptions(
                int index, Option value) {
            copyOnWrite();
            instance.setOptions(index, value);
            return this;
        }
        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
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
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        public Builder addOptions(Option value) {
            copyOnWrite();
            instance.addOptions(value);
            return this;
        }
        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        public Builder addOptions(
                int index, Option value) {
            copyOnWrite();
            instance.addOptions(index, value);
            return this;
        }
        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        public Builder addOptions(
                Option.Builder builderForValue) {
            copyOnWrite();
            instance.addOptions(builderForValue.build());
            return this;
        }
        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
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
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        public Builder addAllOptions(
                Iterable<? extends Option> values) {
            copyOnWrite();
            instance.addAllOptions(values);
            return this;
        }
        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
         */
        public Builder clearOptions() {
            copyOnWrite();
            instance.clearOptions();
            return this;
        }
        /**
         * <pre>
         * The protocol buffer options.
         * </pre>
         *
         * <code>repeated .google.protobuf.Option options = 4;</code>
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
         * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
         * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
         * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
         * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
         * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
         * <code>.google.protobuf.SourceContext source_context = 5;</code>
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
         * <code>.google.protobuf.Syntax syntax = 6;</code>
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
         * <code>.google.protobuf.Syntax syntax = 6;</code>
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
         * <code>.google.protobuf.Syntax syntax = 6;</code>
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
         * <code>.google.protobuf.Syntax syntax = 6;</code>
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
         * <code>.google.protobuf.Syntax syntax = 6;</code>
         * @return This builder for chaining.
         */
        public Builder clearSyntax() {
            copyOnWrite();
            instance.clearSyntax();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:google.protobuf.Type)
    }
    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Type();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[] {
                        "name_",
                        "fields_",
                        Field.class,
                        "oneofs_",
                        "options_",
                        Option.class,
                        "sourceContext_",
                        "syntax_",
                };
                String info =
                        "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u0208\u0002\u001b" +
                                "\u0003\u021a\u0004\u001b\u0005\t\u0006\f";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                Parser<Type> parser = PARSER;
                if (parser == null) {
                    synchronized (Type.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<Type>(
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


    // @@protoc_insertion_point(class_scope:google.protobuf.Type)
    private static final Type DEFAULT_INSTANCE;
    static {
        Type defaultInstance = new Type();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(
                Type.class, defaultInstance);
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile Parser<Type> PARSER;

    public static Parser<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

