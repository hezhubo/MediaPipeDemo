//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.util.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class ColorProto {
    private ColorProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class ColorMap extends GeneratedMessageLite<ColorMap, ColorMap.Builder> implements ColorMapOrBuilder {
        public static final int LABEL_TO_COLOR_FIELD_NUMBER = 1;
        private MapFieldLite<String, Color> labelToColor_ = MapFieldLite.emptyMapField();
        private static final ColorMap DEFAULT_INSTANCE;
        private static volatile Parser<ColorMap> PARSER;

        private ColorMap() {
        }

        private MapFieldLite<String, Color> internalGetLabelToColor() {
            return this.labelToColor_;
        }

        private MapFieldLite<String, Color> internalGetMutableLabelToColor() {
            if (!this.labelToColor_.isMutable()) {
                this.labelToColor_ = this.labelToColor_.mutableCopy();
            }

            return this.labelToColor_;
        }

        public int getLabelToColorCount() {
            return this.internalGetLabelToColor().size();
        }

        public boolean containsLabelToColor(String key) {
            Class<?> keyClass = key.getClass();
            return this.internalGetLabelToColor().containsKey(key);
        }

        /** @deprecated */
        @Deprecated
        public Map<String, Color> getLabelToColor() {
            return this.getLabelToColorMap();
        }

        public Map<String, Color> getLabelToColorMap() {
            return Collections.unmodifiableMap(this.internalGetLabelToColor());
        }

        public Color getLabelToColorOrDefault(String key, Color defaultValue) {
            Class<?> keyClass = key.getClass();
            Map<String, Color> map = this.internalGetLabelToColor();
            return map.containsKey(key) ? (Color)map.get(key) : defaultValue;
        }

        public Color getLabelToColorOrThrow(String key) {
            Class<?> keyClass = key.getClass();
            Map<String, Color> map = this.internalGetLabelToColor();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            } else {
                return (Color)map.get(key);
            }
        }

        private Map<String, Color> getMutableLabelToColorMap() {
            return this.internalGetMutableLabelToColor();
        }

        public static ColorMap parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ColorMap parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ColorMap parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ColorMap parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ColorMap parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ColorMap parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ColorMap parseFrom(InputStream input) throws IOException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ColorMap parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ColorMap parseDelimitedFrom(InputStream input) throws IOException {
            return (ColorMap)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ColorMap parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ColorMap)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ColorMap parseFrom(CodedInputStream input) throws IOException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ColorMap parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ColorMap)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ColorMap prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new ColorMap();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"labelToColor_", LabelToColorDefaultEntryHolder.defaultEntry};
                    String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ColorMap> parser = PARSER;
                    if (parser == null) {
                        Class var5 = ColorMap.class;
                        synchronized(ColorMap.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = (Parser)parser;
                            }
                        }
                    }

                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static ColorMap getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ColorMap> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            ColorMap defaultInstance = new ColorMap();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(ColorMap.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ColorMap, Builder> implements ColorMapOrBuilder {
            private Builder() {
                super(ColorMap.DEFAULT_INSTANCE);
            }

            public int getLabelToColorCount() {
                return ((ColorMap)this.instance).getLabelToColorMap().size();
            }

            public boolean containsLabelToColor(String key) {
                Class<?> keyClass = key.getClass();
                return ((ColorMap)this.instance).getLabelToColorMap().containsKey(key);
            }

            public Builder clearLabelToColor() {
                this.copyOnWrite();
                ((ColorMap)this.instance).getMutableLabelToColorMap().clear();
                return this;
            }

            public Builder removeLabelToColor(String key) {
                Class<?> keyClass = key.getClass();
                this.copyOnWrite();
                ((ColorMap)this.instance).getMutableLabelToColorMap().remove(key);
                return this;
            }

            /** @deprecated */
            @Deprecated
            public Map<String, Color> getLabelToColor() {
                return this.getLabelToColorMap();
            }

            public Map<String, Color> getLabelToColorMap() {
                return Collections.unmodifiableMap(((ColorMap)this.instance).getLabelToColorMap());
            }

            public Color getLabelToColorOrDefault(String key, Color defaultValue) {
                Class<?> keyClass = key.getClass();
                Map<String, Color> map = ((ColorMap)this.instance).getLabelToColorMap();
                return map.containsKey(key) ? (Color)map.get(key) : defaultValue;
            }

            public Color getLabelToColorOrThrow(String key) {
                Class<?> keyClass = key.getClass();
                Map<String, Color> map = ((ColorMap)this.instance).getLabelToColorMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                } else {
                    return (Color)map.get(key);
                }
            }

            public Builder putLabelToColor(String key, Color value) {
                Class<?> keyClass = key.getClass();
                Class<?> valueClass = value.getClass();
                this.copyOnWrite();
                ((ColorMap)this.instance).getMutableLabelToColorMap().put(key, value);
                return this;
            }

            public Builder putAllLabelToColor(Map<String, Color> values) {
                this.copyOnWrite();
                ((ColorMap)this.instance).getMutableLabelToColorMap().putAll(values);
                return this;
            }
        }

        private static final class LabelToColorDefaultEntryHolder {
            static final MapEntryLite<String, Color> defaultEntry;

            private LabelToColorDefaultEntryHolder() {
            }

            static {
                defaultEntry = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.MESSAGE, Color.getDefaultInstance());
            }
        }
    }

    public interface ColorMapOrBuilder extends MessageLiteOrBuilder {
        int getLabelToColorCount();

        boolean containsLabelToColor(String key);

        /** @deprecated */
        @Deprecated
        Map<String, Color> getLabelToColor();

        Map<String, Color> getLabelToColorMap();

        Color getLabelToColorOrDefault(String key, Color defaultValue);

        Color getLabelToColorOrThrow(String key);
    }

    public static final class Color extends GeneratedMessageLite<Color, Color.Builder> implements ColorOrBuilder {
        private int bitField0_;
        public static final int R_FIELD_NUMBER = 1;
        private int r_;
        public static final int G_FIELD_NUMBER = 2;
        private int g_;
        public static final int B_FIELD_NUMBER = 3;
        private int b_;
        private static final Color DEFAULT_INSTANCE;
        private static volatile Parser<Color> PARSER;

        private Color() {
        }

        public boolean hasR() {
            return (this.bitField0_ & 1) != 0;
        }

        public int getR() {
            return this.r_;
        }

        private void setR(int value) {
            this.bitField0_ |= 1;
            this.r_ = value;
        }

        private void clearR() {
            this.bitField0_ &= -2;
            this.r_ = 0;
        }

        public boolean hasG() {
            return (this.bitField0_ & 2) != 0;
        }

        public int getG() {
            return this.g_;
        }

        private void setG(int value) {
            this.bitField0_ |= 2;
            this.g_ = value;
        }

        private void clearG() {
            this.bitField0_ &= -3;
            this.g_ = 0;
        }

        public boolean hasB() {
            return (this.bitField0_ & 4) != 0;
        }

        public int getB() {
            return this.b_;
        }

        private void setB(int value) {
            this.bitField0_ |= 4;
            this.b_ = value;
        }

        private void clearB() {
            this.bitField0_ &= -5;
            this.b_ = 0;
        }

        public static Color parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Color parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Color parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Color parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Color parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Color parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Color parseFrom(InputStream input) throws IOException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Color parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Color parseDelimitedFrom(InputStream input) throws IOException {
            return (Color)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Color parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Color)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Color parseFrom(CodedInputStream input) throws IOException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Color parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Color)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Color prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Color();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "r_", "g_", "b_"};
                    String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Color> parser = PARSER;
                    if (parser == null) {
                        Class var5 = Color.class;
                        synchronized(Color.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = (Parser)parser;
                            }
                        }
                    }

                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static Color getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Color> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            Color defaultInstance = new Color();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Color.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Color, Builder> implements ColorOrBuilder {
            private Builder() {
                super(Color.DEFAULT_INSTANCE);
            }

            public boolean hasR() {
                return ((Color)this.instance).hasR();
            }

            public int getR() {
                return ((Color)this.instance).getR();
            }

            public Builder setR(int value) {
                this.copyOnWrite();
                ((Color)this.instance).setR(value);
                return this;
            }

            public Builder clearR() {
                this.copyOnWrite();
                ((Color)this.instance).clearR();
                return this;
            }

            public boolean hasG() {
                return ((Color)this.instance).hasG();
            }

            public int getG() {
                return ((Color)this.instance).getG();
            }

            public Builder setG(int value) {
                this.copyOnWrite();
                ((Color)this.instance).setG(value);
                return this;
            }

            public Builder clearG() {
                this.copyOnWrite();
                ((Color)this.instance).clearG();
                return this;
            }

            public boolean hasB() {
                return ((Color)this.instance).hasB();
            }

            public int getB() {
                return ((Color)this.instance).getB();
            }

            public Builder setB(int value) {
                this.copyOnWrite();
                ((Color)this.instance).setB(value);
                return this;
            }

            public Builder clearB() {
                this.copyOnWrite();
                ((Color)this.instance).clearB();
                return this;
            }
        }
    }

    public interface ColorOrBuilder extends MessageLiteOrBuilder {
        boolean hasR();

        int getR();

        boolean hasG();

        int getG();

        boolean hasB();

        int getB();
    }
}
