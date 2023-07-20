//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.google.mediapipe.util.proto;

import com.google.mediapipe.util.proto.ColorProto.Color;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.Internal.ProtobufList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class RenderDataProto {
    private RenderDataProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class RenderViewport extends GeneratedMessageLite<RenderViewport, RenderViewport.Builder> implements RenderViewportOrBuilder {
        private int bitField0_;
        public static final int ID_FIELD_NUMBER = 1;
        private String id_ = "";
        public static final int WIDTH_PX_FIELD_NUMBER = 2;
        private int widthPx_;
        public static final int HEIGHT_PX_FIELD_NUMBER = 3;
        private int heightPx_;
        public static final int COMPOSE_ON_VIDEO_FIELD_NUMBER = 4;
        private boolean composeOnVideo_;
        private static final RenderViewport DEFAULT_INSTANCE;
        private static volatile Parser<RenderViewport> PARSER;

        private RenderViewport() {
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        private void setId(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 1;
            this.id_ = value;
        }

        private void clearId() {
            this.bitField0_ &= -2;
            this.id_ = getDefaultInstance().getId();
        }

        private void setIdBytes(ByteString value) {
            this.id_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public boolean hasWidthPx() {
            return (this.bitField0_ & 2) != 0;
        }

        public int getWidthPx() {
            return this.widthPx_;
        }

        private void setWidthPx(int value) {
            this.bitField0_ |= 2;
            this.widthPx_ = value;
        }

        private void clearWidthPx() {
            this.bitField0_ &= -3;
            this.widthPx_ = 0;
        }

        public boolean hasHeightPx() {
            return (this.bitField0_ & 4) != 0;
        }

        public int getHeightPx() {
            return this.heightPx_;
        }

        private void setHeightPx(int value) {
            this.bitField0_ |= 4;
            this.heightPx_ = value;
        }

        private void clearHeightPx() {
            this.bitField0_ &= -5;
            this.heightPx_ = 0;
        }

        public boolean hasComposeOnVideo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean getComposeOnVideo() {
            return this.composeOnVideo_;
        }

        private void setComposeOnVideo(boolean value) {
            this.bitField0_ |= 8;
            this.composeOnVideo_ = value;
        }

        private void clearComposeOnVideo() {
            this.bitField0_ &= -9;
            this.composeOnVideo_ = false;
        }

        public static RenderViewport parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderViewport parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderViewport parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderViewport parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderViewport parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderViewport parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderViewport parseFrom(InputStream input) throws IOException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderViewport parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RenderViewport parseDelimitedFrom(InputStream input) throws IOException {
            return (RenderViewport)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderViewport parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderViewport)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RenderViewport parseFrom(CodedInputStream input) throws IOException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderViewport parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderViewport)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RenderViewport prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new RenderViewport();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "id_", "widthPx_", "heightPx_", "composeOnVideo_"};
                    String info = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RenderViewport> parser = PARSER;
                    if (parser == null) {
                        Class var5 = RenderViewport.class;
                        synchronized(RenderViewport.class) {
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

        public static RenderViewport getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RenderViewport> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            RenderViewport defaultInstance = new RenderViewport();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(RenderViewport.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RenderViewport, Builder> implements RenderViewportOrBuilder {
            private Builder() {
                super(RenderViewport.DEFAULT_INSTANCE);
            }

            public boolean hasId() {
                return ((RenderViewport)this.instance).hasId();
            }

            public String getId() {
                return ((RenderViewport)this.instance).getId();
            }

            public ByteString getIdBytes() {
                return ((RenderViewport)this.instance).getIdBytes();
            }

            public Builder setId(String value) {
                this.copyOnWrite();
                ((RenderViewport)this.instance).setId(value);
                return this;
            }

            public Builder clearId() {
                this.copyOnWrite();
                ((RenderViewport)this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString value) {
                this.copyOnWrite();
                ((RenderViewport)this.instance).setIdBytes(value);
                return this;
            }

            public boolean hasWidthPx() {
                return ((RenderViewport)this.instance).hasWidthPx();
            }

            public int getWidthPx() {
                return ((RenderViewport)this.instance).getWidthPx();
            }

            public Builder setWidthPx(int value) {
                this.copyOnWrite();
                ((RenderViewport)this.instance).setWidthPx(value);
                return this;
            }

            public Builder clearWidthPx() {
                this.copyOnWrite();
                ((RenderViewport)this.instance).clearWidthPx();
                return this;
            }

            public boolean hasHeightPx() {
                return ((RenderViewport)this.instance).hasHeightPx();
            }

            public int getHeightPx() {
                return ((RenderViewport)this.instance).getHeightPx();
            }

            public Builder setHeightPx(int value) {
                this.copyOnWrite();
                ((RenderViewport)this.instance).setHeightPx(value);
                return this;
            }

            public Builder clearHeightPx() {
                this.copyOnWrite();
                ((RenderViewport)this.instance).clearHeightPx();
                return this;
            }

            public boolean hasComposeOnVideo() {
                return ((RenderViewport)this.instance).hasComposeOnVideo();
            }

            public boolean getComposeOnVideo() {
                return ((RenderViewport)this.instance).getComposeOnVideo();
            }

            public Builder setComposeOnVideo(boolean value) {
                this.copyOnWrite();
                ((RenderViewport)this.instance).setComposeOnVideo(value);
                return this;
            }

            public Builder clearComposeOnVideo() {
                this.copyOnWrite();
                ((RenderViewport)this.instance).clearComposeOnVideo();
                return this;
            }
        }
    }

    public interface RenderViewportOrBuilder extends MessageLiteOrBuilder {
        boolean hasId();

        String getId();

        ByteString getIdBytes();

        boolean hasWidthPx();

        int getWidthPx();

        boolean hasHeightPx();

        int getHeightPx();

        boolean hasComposeOnVideo();

        boolean getComposeOnVideo();
    }

    public static final class RenderAnnotation extends GeneratedMessageLite<RenderAnnotation, RenderAnnotation.Builder> implements RenderAnnotationOrBuilder {
        private int bitField0_;
        private int dataCase_ = 0;
        private Object data_;
        public static final int RECTANGLE_FIELD_NUMBER = 1;
        public static final int FILLED_RECTANGLE_FIELD_NUMBER = 2;
        public static final int OVAL_FIELD_NUMBER = 3;
        public static final int FILLED_OVAL_FIELD_NUMBER = 4;
        public static final int POINT_FIELD_NUMBER = 5;
        public static final int LINE_FIELD_NUMBER = 6;
        public static final int ARROW_FIELD_NUMBER = 7;
        public static final int TEXT_FIELD_NUMBER = 8;
        public static final int ROUNDED_RECTANGLE_FIELD_NUMBER = 9;
        public static final int FILLED_ROUNDED_RECTANGLE_FIELD_NUMBER = 10;
        public static final int GRADIENT_LINE_FIELD_NUMBER = 14;
        public static final int SCRIBBLE_FIELD_NUMBER = 15;
        public static final int THICKNESS_FIELD_NUMBER = 11;
        private double thickness_ = 1.0D;
        public static final int COLOR_FIELD_NUMBER = 12;
        private Color color_;
        public static final int SCENE_TAG_FIELD_NUMBER = 13;
        private String sceneTag_ = "";
        private static final RenderAnnotation DEFAULT_INSTANCE;
        private static volatile Parser<RenderAnnotation> PARSER;

        private RenderAnnotation() {
        }

        public DataCase getDataCase() {
            return DataCase.forNumber(this.dataCase_);
        }

        private void clearData() {
            this.dataCase_ = 0;
            this.data_ = null;
        }

        public boolean hasRectangle() {
            return this.dataCase_ == 1;
        }

        public Rectangle getRectangle() {
            return this.dataCase_ == 1 ? (Rectangle)this.data_ : Rectangle.getDefaultInstance();
        }

        private void setRectangle(Rectangle value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 1;
        }

        private void mergeRectangle(Rectangle value) {
            value.getClass();
            if (this.dataCase_ == 1 && this.data_ != Rectangle.getDefaultInstance()) {
                this.data_ = ((Rectangle.Builder) Rectangle.newBuilder((Rectangle)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 1;
        }

        private void clearRectangle() {
            if (this.dataCase_ == 1) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasFilledRectangle() {
            return this.dataCase_ == 2;
        }

        public FilledRectangle getFilledRectangle() {
            return this.dataCase_ == 2 ? (FilledRectangle)this.data_ : FilledRectangle.getDefaultInstance();
        }

        private void setFilledRectangle(FilledRectangle value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 2;
        }

        private void mergeFilledRectangle(FilledRectangle value) {
            value.getClass();
            if (this.dataCase_ == 2 && this.data_ != FilledRectangle.getDefaultInstance()) {
                this.data_ = ((FilledRectangle.Builder) FilledRectangle.newBuilder((FilledRectangle)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 2;
        }

        private void clearFilledRectangle() {
            if (this.dataCase_ == 2) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasOval() {
            return this.dataCase_ == 3;
        }

        public Oval getOval() {
            return this.dataCase_ == 3 ? (Oval)this.data_ : Oval.getDefaultInstance();
        }

        private void setOval(Oval value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 3;
        }

        private void mergeOval(Oval value) {
            value.getClass();
            if (this.dataCase_ == 3 && this.data_ != Oval.getDefaultInstance()) {
                this.data_ = ((Oval.Builder) Oval.newBuilder((Oval)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 3;
        }

        private void clearOval() {
            if (this.dataCase_ == 3) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasFilledOval() {
            return this.dataCase_ == 4;
        }

        public FilledOval getFilledOval() {
            return this.dataCase_ == 4 ? (FilledOval)this.data_ : FilledOval.getDefaultInstance();
        }

        private void setFilledOval(FilledOval value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 4;
        }

        private void mergeFilledOval(FilledOval value) {
            value.getClass();
            if (this.dataCase_ == 4 && this.data_ != FilledOval.getDefaultInstance()) {
                this.data_ = ((FilledOval.Builder) FilledOval.newBuilder((FilledOval)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 4;
        }

        private void clearFilledOval() {
            if (this.dataCase_ == 4) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasPoint() {
            return this.dataCase_ == 5;
        }

        public Point getPoint() {
            return this.dataCase_ == 5 ? (Point)this.data_ : Point.getDefaultInstance();
        }

        private void setPoint(Point value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 5;
        }

        private void mergePoint(Point value) {
            value.getClass();
            if (this.dataCase_ == 5 && this.data_ != Point.getDefaultInstance()) {
                this.data_ = ((Point.Builder) Point.newBuilder((Point)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 5;
        }

        private void clearPoint() {
            if (this.dataCase_ == 5) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasLine() {
            return this.dataCase_ == 6;
        }

        public Line getLine() {
            return this.dataCase_ == 6 ? (Line)this.data_ : Line.getDefaultInstance();
        }

        private void setLine(Line value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 6;
        }

        private void mergeLine(Line value) {
            value.getClass();
            if (this.dataCase_ == 6 && this.data_ != Line.getDefaultInstance()) {
                this.data_ = ((Line.Builder) Line.newBuilder((Line)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 6;
        }

        private void clearLine() {
            if (this.dataCase_ == 6) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasArrow() {
            return this.dataCase_ == 7;
        }

        public Arrow getArrow() {
            return this.dataCase_ == 7 ? (Arrow)this.data_ : Arrow.getDefaultInstance();
        }

        private void setArrow(Arrow value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 7;
        }

        private void mergeArrow(Arrow value) {
            value.getClass();
            if (this.dataCase_ == 7 && this.data_ != Arrow.getDefaultInstance()) {
                this.data_ = ((Arrow.Builder) Arrow.newBuilder((Arrow)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 7;
        }

        private void clearArrow() {
            if (this.dataCase_ == 7) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasText() {
            return this.dataCase_ == 8;
        }

        public Text getText() {
            return this.dataCase_ == 8 ? (Text)this.data_ : Text.getDefaultInstance();
        }

        private void setText(Text value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 8;
        }

        private void mergeText(Text value) {
            value.getClass();
            if (this.dataCase_ == 8 && this.data_ != Text.getDefaultInstance()) {
                this.data_ = ((Text.Builder) Text.newBuilder((Text)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 8;
        }

        private void clearText() {
            if (this.dataCase_ == 8) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasRoundedRectangle() {
            return this.dataCase_ == 9;
        }

        public RoundedRectangle getRoundedRectangle() {
            return this.dataCase_ == 9 ? (RoundedRectangle)this.data_ : RoundedRectangle.getDefaultInstance();
        }

        private void setRoundedRectangle(RoundedRectangle value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 9;
        }

        private void mergeRoundedRectangle(RoundedRectangle value) {
            value.getClass();
            if (this.dataCase_ == 9 && this.data_ != RoundedRectangle.getDefaultInstance()) {
                this.data_ = ((RoundedRectangle.Builder) RoundedRectangle.newBuilder((RoundedRectangle)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 9;
        }

        private void clearRoundedRectangle() {
            if (this.dataCase_ == 9) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasFilledRoundedRectangle() {
            return this.dataCase_ == 10;
        }

        public FilledRoundedRectangle getFilledRoundedRectangle() {
            return this.dataCase_ == 10 ? (FilledRoundedRectangle)this.data_ : FilledRoundedRectangle.getDefaultInstance();
        }

        private void setFilledRoundedRectangle(FilledRoundedRectangle value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 10;
        }

        private void mergeFilledRoundedRectangle(FilledRoundedRectangle value) {
            value.getClass();
            if (this.dataCase_ == 10 && this.data_ != FilledRoundedRectangle.getDefaultInstance()) {
                this.data_ = ((FilledRoundedRectangle.Builder) FilledRoundedRectangle.newBuilder((FilledRoundedRectangle)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 10;
        }

        private void clearFilledRoundedRectangle() {
            if (this.dataCase_ == 10) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasGradientLine() {
            return this.dataCase_ == 14;
        }

        public GradientLine getGradientLine() {
            return this.dataCase_ == 14 ? (GradientLine)this.data_ : GradientLine.getDefaultInstance();
        }

        private void setGradientLine(GradientLine value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 14;
        }

        private void mergeGradientLine(GradientLine value) {
            value.getClass();
            if (this.dataCase_ == 14 && this.data_ != GradientLine.getDefaultInstance()) {
                this.data_ = ((GradientLine.Builder) GradientLine.newBuilder((GradientLine)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 14;
        }

        private void clearGradientLine() {
            if (this.dataCase_ == 14) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasScribble() {
            return this.dataCase_ == 15;
        }

        public Scribble getScribble() {
            return this.dataCase_ == 15 ? (Scribble)this.data_ : Scribble.getDefaultInstance();
        }

        private void setScribble(Scribble value) {
            value.getClass();
            this.data_ = value;
            this.dataCase_ = 15;
        }

        private void mergeScribble(Scribble value) {
            value.getClass();
            if (this.dataCase_ == 15 && this.data_ != Scribble.getDefaultInstance()) {
                this.data_ = ((Scribble.Builder) Scribble.newBuilder((Scribble)this.data_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.data_ = value;
            }

            this.dataCase_ = 15;
        }

        private void clearScribble() {
            if (this.dataCase_ == 15) {
                this.dataCase_ = 0;
                this.data_ = null;
            }

        }

        public boolean hasThickness() {
            return (this.bitField0_ & 4096) != 0;
        }

        public double getThickness() {
            return this.thickness_;
        }

        private void setThickness(double value) {
            this.bitField0_ |= 4096;
            this.thickness_ = value;
        }

        private void clearThickness() {
            this.bitField0_ &= -4097;
            this.thickness_ = 1.0D;
        }

        public boolean hasColor() {
            return (this.bitField0_ & 8192) != 0;
        }

        public Color getColor() {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
        }

        private void setColor(Color value) {
            value.getClass();
            this.color_ = value;
            this.bitField0_ |= 8192;
        }

        private void mergeColor(Color value) {
            value.getClass();
            if (this.color_ != null && this.color_ != Color.getDefaultInstance()) {
                this.color_ = (Color)((Color.Builder)Color.newBuilder(this.color_).mergeFrom(value)).buildPartial();
            } else {
                this.color_ = value;
            }

            this.bitField0_ |= 8192;
        }

        private void clearColor() {
            this.color_ = null;
            this.bitField0_ &= -8193;
        }

        public boolean hasSceneTag() {
            return (this.bitField0_ & 16384) != 0;
        }

        public String getSceneTag() {
            return this.sceneTag_;
        }

        public ByteString getSceneTagBytes() {
            return ByteString.copyFromUtf8(this.sceneTag_);
        }

        private void setSceneTag(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 16384;
            this.sceneTag_ = value;
        }

        private void clearSceneTag() {
            this.bitField0_ &= -16385;
            this.sceneTag_ = getDefaultInstance().getSceneTag();
        }

        private void setSceneTagBytes(ByteString value) {
            this.sceneTag_ = value.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        public static RenderAnnotation parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderAnnotation parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderAnnotation parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderAnnotation parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderAnnotation parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderAnnotation parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderAnnotation parseFrom(InputStream input) throws IOException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderAnnotation parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RenderAnnotation parseDelimitedFrom(InputStream input) throws IOException {
            return (RenderAnnotation)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderAnnotation parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderAnnotation)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RenderAnnotation parseFrom(CodedInputStream input) throws IOException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderAnnotation parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderAnnotation)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RenderAnnotation prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new RenderAnnotation();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"data_", "dataCase_", "bitField0_", Rectangle.class, FilledRectangle.class, Oval.class, FilledOval.class, Point.class, Line.class, Arrow.class, Text.class, RoundedRectangle.class, FilledRoundedRectangle.class, "thickness_", "color_", "sceneTag_", GradientLine.class, Scribble.class};
                    String info = "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bက\f\fဉ\r\rဈ\u000e\u000eြ\u0000\u000fြ\u0000";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RenderAnnotation> parser = PARSER;
                    if (parser == null) {
                        Class var5 = RenderAnnotation.class;
                        synchronized(RenderAnnotation.class) {
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

        public static RenderAnnotation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RenderAnnotation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            RenderAnnotation defaultInstance = new RenderAnnotation();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(RenderAnnotation.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RenderAnnotation, Builder> implements RenderAnnotationOrBuilder {
            private Builder() {
                super(RenderAnnotation.DEFAULT_INSTANCE);
            }

            public DataCase getDataCase() {
                return ((RenderAnnotation)this.instance).getDataCase();
            }

            public Builder clearData() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearData();
                return this;
            }

            public boolean hasRectangle() {
                return ((RenderAnnotation)this.instance).hasRectangle();
            }

            public Rectangle getRectangle() {
                return ((RenderAnnotation)this.instance).getRectangle();
            }

            public Builder setRectangle(Rectangle value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setRectangle(value);
                return this;
            }

            public Builder setRectangle(Rectangle.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setRectangle((Rectangle)builderForValue.build());
                return this;
            }

            public Builder mergeRectangle(Rectangle value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeRectangle(value);
                return this;
            }

            public Builder clearRectangle() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearRectangle();
                return this;
            }

            public boolean hasFilledRectangle() {
                return ((RenderAnnotation)this.instance).hasFilledRectangle();
            }

            public FilledRectangle getFilledRectangle() {
                return ((RenderAnnotation)this.instance).getFilledRectangle();
            }

            public Builder setFilledRectangle(FilledRectangle value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setFilledRectangle(value);
                return this;
            }

            public Builder setFilledRectangle(FilledRectangle.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setFilledRectangle((FilledRectangle)builderForValue.build());
                return this;
            }

            public Builder mergeFilledRectangle(FilledRectangle value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeFilledRectangle(value);
                return this;
            }

            public Builder clearFilledRectangle() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearFilledRectangle();
                return this;
            }

            public boolean hasOval() {
                return ((RenderAnnotation)this.instance).hasOval();
            }

            public Oval getOval() {
                return ((RenderAnnotation)this.instance).getOval();
            }

            public Builder setOval(Oval value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setOval(value);
                return this;
            }

            public Builder setOval(Oval.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setOval((Oval)builderForValue.build());
                return this;
            }

            public Builder mergeOval(Oval value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeOval(value);
                return this;
            }

            public Builder clearOval() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearOval();
                return this;
            }

            public boolean hasFilledOval() {
                return ((RenderAnnotation)this.instance).hasFilledOval();
            }

            public FilledOval getFilledOval() {
                return ((RenderAnnotation)this.instance).getFilledOval();
            }

            public Builder setFilledOval(FilledOval value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setFilledOval(value);
                return this;
            }

            public Builder setFilledOval(FilledOval.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setFilledOval((FilledOval)builderForValue.build());
                return this;
            }

            public Builder mergeFilledOval(FilledOval value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeFilledOval(value);
                return this;
            }

            public Builder clearFilledOval() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearFilledOval();
                return this;
            }

            public boolean hasPoint() {
                return ((RenderAnnotation)this.instance).hasPoint();
            }

            public Point getPoint() {
                return ((RenderAnnotation)this.instance).getPoint();
            }

            public Builder setPoint(Point value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setPoint(value);
                return this;
            }

            public Builder setPoint(Point.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setPoint((Point)builderForValue.build());
                return this;
            }

            public Builder mergePoint(Point value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergePoint(value);
                return this;
            }

            public Builder clearPoint() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearPoint();
                return this;
            }

            public boolean hasLine() {
                return ((RenderAnnotation)this.instance).hasLine();
            }

            public Line getLine() {
                return ((RenderAnnotation)this.instance).getLine();
            }

            public Builder setLine(Line value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setLine(value);
                return this;
            }

            public Builder setLine(Line.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setLine((Line)builderForValue.build());
                return this;
            }

            public Builder mergeLine(Line value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeLine(value);
                return this;
            }

            public Builder clearLine() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearLine();
                return this;
            }

            public boolean hasArrow() {
                return ((RenderAnnotation)this.instance).hasArrow();
            }

            public Arrow getArrow() {
                return ((RenderAnnotation)this.instance).getArrow();
            }

            public Builder setArrow(Arrow value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setArrow(value);
                return this;
            }

            public Builder setArrow(Arrow.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setArrow((Arrow)builderForValue.build());
                return this;
            }

            public Builder mergeArrow(Arrow value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeArrow(value);
                return this;
            }

            public Builder clearArrow() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearArrow();
                return this;
            }

            public boolean hasText() {
                return ((RenderAnnotation)this.instance).hasText();
            }

            public Text getText() {
                return ((RenderAnnotation)this.instance).getText();
            }

            public Builder setText(Text value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setText(value);
                return this;
            }

            public Builder setText(Text.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setText((Text)builderForValue.build());
                return this;
            }

            public Builder mergeText(Text value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeText(value);
                return this;
            }

            public Builder clearText() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearText();
                return this;
            }

            public boolean hasRoundedRectangle() {
                return ((RenderAnnotation)this.instance).hasRoundedRectangle();
            }

            public RoundedRectangle getRoundedRectangle() {
                return ((RenderAnnotation)this.instance).getRoundedRectangle();
            }

            public Builder setRoundedRectangle(RoundedRectangle value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setRoundedRectangle(value);
                return this;
            }

            public Builder setRoundedRectangle(RoundedRectangle.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setRoundedRectangle((RoundedRectangle)builderForValue.build());
                return this;
            }

            public Builder mergeRoundedRectangle(RoundedRectangle value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeRoundedRectangle(value);
                return this;
            }

            public Builder clearRoundedRectangle() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearRoundedRectangle();
                return this;
            }

            public boolean hasFilledRoundedRectangle() {
                return ((RenderAnnotation)this.instance).hasFilledRoundedRectangle();
            }

            public FilledRoundedRectangle getFilledRoundedRectangle() {
                return ((RenderAnnotation)this.instance).getFilledRoundedRectangle();
            }

            public Builder setFilledRoundedRectangle(FilledRoundedRectangle value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setFilledRoundedRectangle(value);
                return this;
            }

            public Builder setFilledRoundedRectangle(FilledRoundedRectangle.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setFilledRoundedRectangle((FilledRoundedRectangle)builderForValue.build());
                return this;
            }

            public Builder mergeFilledRoundedRectangle(FilledRoundedRectangle value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeFilledRoundedRectangle(value);
                return this;
            }

            public Builder clearFilledRoundedRectangle() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearFilledRoundedRectangle();
                return this;
            }

            public boolean hasGradientLine() {
                return ((RenderAnnotation)this.instance).hasGradientLine();
            }

            public GradientLine getGradientLine() {
                return ((RenderAnnotation)this.instance).getGradientLine();
            }

            public Builder setGradientLine(GradientLine value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setGradientLine(value);
                return this;
            }

            public Builder setGradientLine(GradientLine.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setGradientLine((GradientLine)builderForValue.build());
                return this;
            }

            public Builder mergeGradientLine(GradientLine value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeGradientLine(value);
                return this;
            }

            public Builder clearGradientLine() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearGradientLine();
                return this;
            }

            public boolean hasScribble() {
                return ((RenderAnnotation)this.instance).hasScribble();
            }

            public Scribble getScribble() {
                return ((RenderAnnotation)this.instance).getScribble();
            }

            public Builder setScribble(Scribble value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setScribble(value);
                return this;
            }

            public Builder setScribble(Scribble.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setScribble((Scribble)builderForValue.build());
                return this;
            }

            public Builder mergeScribble(Scribble value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeScribble(value);
                return this;
            }

            public Builder clearScribble() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearScribble();
                return this;
            }

            public boolean hasThickness() {
                return ((RenderAnnotation)this.instance).hasThickness();
            }

            public double getThickness() {
                return ((RenderAnnotation)this.instance).getThickness();
            }

            public Builder setThickness(double value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setThickness(value);
                return this;
            }

            public Builder clearThickness() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearThickness();
                return this;
            }

            public boolean hasColor() {
                return ((RenderAnnotation)this.instance).hasColor();
            }

            public Color getColor() {
                return ((RenderAnnotation)this.instance).getColor();
            }

            public Builder setColor(Color value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setColor(value);
                return this;
            }

            public Builder setColor(Color.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setColor((Color)builderForValue.build());
                return this;
            }

            public Builder mergeColor(Color value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).mergeColor(value);
                return this;
            }

            public Builder clearColor() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearColor();
                return this;
            }

            public boolean hasSceneTag() {
                return ((RenderAnnotation)this.instance).hasSceneTag();
            }

            public String getSceneTag() {
                return ((RenderAnnotation)this.instance).getSceneTag();
            }

            public ByteString getSceneTagBytes() {
                return ((RenderAnnotation)this.instance).getSceneTagBytes();
            }

            public Builder setSceneTag(String value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setSceneTag(value);
                return this;
            }

            public Builder clearSceneTag() {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).clearSceneTag();
                return this;
            }

            public Builder setSceneTagBytes(ByteString value) {
                this.copyOnWrite();
                ((RenderAnnotation)this.instance).setSceneTagBytes(value);
                return this;
            }
        }

        public static enum DataCase {
            RECTANGLE(1),
            FILLED_RECTANGLE(2),
            OVAL(3),
            FILLED_OVAL(4),
            POINT(5),
            LINE(6),
            ARROW(7),
            TEXT(8),
            ROUNDED_RECTANGLE(9),
            FILLED_ROUNDED_RECTANGLE(10),
            GRADIENT_LINE(14),
            SCRIBBLE(15),
            DATA_NOT_SET(0);

            private final int value;

            private DataCase(int value) {
                this.value = value;
            }

            /** @deprecated */
            @Deprecated
            public static DataCase valueOf(int value) {
                return forNumber(value);
            }

            public static DataCase forNumber(int value) {
                switch(value) {
                    case 0:
                        return DATA_NOT_SET;
                    case 1:
                        return RECTANGLE;
                    case 2:
                        return FILLED_RECTANGLE;
                    case 3:
                        return OVAL;
                    case 4:
                        return FILLED_OVAL;
                    case 5:
                        return POINT;
                    case 6:
                        return LINE;
                    case 7:
                        return ARROW;
                    case 8:
                        return TEXT;
                    case 9:
                        return ROUNDED_RECTANGLE;
                    case 10:
                        return FILLED_ROUNDED_RECTANGLE;
                    case 11:
                    case 12:
                    case 13:
                    default:
                        return null;
                    case 14:
                        return GRADIENT_LINE;
                    case 15:
                        return SCRIBBLE;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        public static final class Text extends GeneratedMessageLite<Text, Text.Builder> implements TextOrBuilder {
            private int bitField0_;
            public static final int DISPLAY_TEXT_FIELD_NUMBER = 1;
            private String displayText_ = "";
            public static final int LEFT_FIELD_NUMBER = 2;
            private double left_;
            public static final int BASELINE_FIELD_NUMBER = 3;
            private double baseline_;
            public static final int FONT_HEIGHT_FIELD_NUMBER = 4;
            private double fontHeight_ = 8.0D;
            public static final int NORMALIZED_FIELD_NUMBER = 5;
            private boolean normalized_;
            public static final int FONT_FACE_FIELD_NUMBER = 6;
            private int fontFace_;
            public static final int CENTER_HORIZONTALLY_FIELD_NUMBER = 7;
            private boolean centerHorizontally_;
            public static final int CENTER_VERTICALLY_FIELD_NUMBER = 8;
            private boolean centerVertically_;
            public static final int OUTLINE_THICKNESS_FIELD_NUMBER = 11;
            private double outlineThickness_;
            public static final int OUTLINE_COLOR_FIELD_NUMBER = 12;
            private Color outlineColor_;
            private static final Text DEFAULT_INSTANCE;
            private static volatile Parser<Text> PARSER;

            private Text() {
            }

            public boolean hasDisplayText() {
                return (this.bitField0_ & 1) != 0;
            }

            public String getDisplayText() {
                return this.displayText_;
            }

            public ByteString getDisplayTextBytes() {
                return ByteString.copyFromUtf8(this.displayText_);
            }

            private void setDisplayText(String value) {
                Class<?> valueClass = value.getClass();
                this.bitField0_ |= 1;
                this.displayText_ = value;
            }

            private void clearDisplayText() {
                this.bitField0_ &= -2;
                this.displayText_ = getDefaultInstance().getDisplayText();
            }

            private void setDisplayTextBytes(ByteString value) {
                this.displayText_ = value.toStringUtf8();
                this.bitField0_ |= 1;
            }

            public boolean hasLeft() {
                return (this.bitField0_ & 2) != 0;
            }

            public double getLeft() {
                return this.left_;
            }

            private void setLeft(double value) {
                this.bitField0_ |= 2;
                this.left_ = value;
            }

            private void clearLeft() {
                this.bitField0_ &= -3;
                this.left_ = 0.0D;
            }

            public boolean hasBaseline() {
                return (this.bitField0_ & 4) != 0;
            }

            public double getBaseline() {
                return this.baseline_;
            }

            private void setBaseline(double value) {
                this.bitField0_ |= 4;
                this.baseline_ = value;
            }

            private void clearBaseline() {
                this.bitField0_ &= -5;
                this.baseline_ = 0.0D;
            }

            public boolean hasFontHeight() {
                return (this.bitField0_ & 8) != 0;
            }

            public double getFontHeight() {
                return this.fontHeight_;
            }

            private void setFontHeight(double value) {
                this.bitField0_ |= 8;
                this.fontHeight_ = value;
            }

            private void clearFontHeight() {
                this.bitField0_ &= -9;
                this.fontHeight_ = 8.0D;
            }

            public boolean hasNormalized() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean getNormalized() {
                return this.normalized_;
            }

            private void setNormalized(boolean value) {
                this.bitField0_ |= 16;
                this.normalized_ = value;
            }

            private void clearNormalized() {
                this.bitField0_ &= -17;
                this.normalized_ = false;
            }

            public boolean hasFontFace() {
                return (this.bitField0_ & 32) != 0;
            }

            public int getFontFace() {
                return this.fontFace_;
            }

            private void setFontFace(int value) {
                this.bitField0_ |= 32;
                this.fontFace_ = value;
            }

            private void clearFontFace() {
                this.bitField0_ &= -33;
                this.fontFace_ = 0;
            }

            public boolean hasCenterHorizontally() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean getCenterHorizontally() {
                return this.centerHorizontally_;
            }

            private void setCenterHorizontally(boolean value) {
                this.bitField0_ |= 64;
                this.centerHorizontally_ = value;
            }

            private void clearCenterHorizontally() {
                this.bitField0_ &= -65;
                this.centerHorizontally_ = false;
            }

            public boolean hasCenterVertically() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean getCenterVertically() {
                return this.centerVertically_;
            }

            private void setCenterVertically(boolean value) {
                this.bitField0_ |= 128;
                this.centerVertically_ = value;
            }

            private void clearCenterVertically() {
                this.bitField0_ &= -129;
                this.centerVertically_ = false;
            }

            public boolean hasOutlineThickness() {
                return (this.bitField0_ & 256) != 0;
            }

            public double getOutlineThickness() {
                return this.outlineThickness_;
            }

            private void setOutlineThickness(double value) {
                this.bitField0_ |= 256;
                this.outlineThickness_ = value;
            }

            private void clearOutlineThickness() {
                this.bitField0_ &= -257;
                this.outlineThickness_ = 0.0D;
            }

            public boolean hasOutlineColor() {
                return (this.bitField0_ & 512) != 0;
            }

            public Color getOutlineColor() {
                return this.outlineColor_ == null ? Color.getDefaultInstance() : this.outlineColor_;
            }

            private void setOutlineColor(Color value) {
                value.getClass();
                this.outlineColor_ = value;
                this.bitField0_ |= 512;
            }

            private void mergeOutlineColor(Color value) {
                value.getClass();
                if (this.outlineColor_ != null && this.outlineColor_ != Color.getDefaultInstance()) {
                    this.outlineColor_ = (Color)((Color.Builder)Color.newBuilder(this.outlineColor_).mergeFrom(value)).buildPartial();
                } else {
                    this.outlineColor_ = value;
                }

                this.bitField0_ |= 512;
            }

            private void clearOutlineColor() {
                this.outlineColor_ = null;
                this.bitField0_ &= -513;
            }

            public static Text parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Text parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Text parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Text parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Text parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Text parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Text parseFrom(InputStream input) throws IOException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Text parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Text parseDelimitedFrom(InputStream input) throws IOException {
                return (Text)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Text parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Text)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Text parseFrom(CodedInputStream input) throws IOException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Text parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Text)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Text prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Text();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "displayText_", "left_", "baseline_", "fontHeight_", "normalized_", "fontFace_", "centerHorizontally_", "centerVertically_", "outlineThickness_", "outlineColor_"};
                        String info = "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006\bဇ\u0007\u000bက\b\fဉ\t";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Text> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Text.class;
                            synchronized(Text.class) {
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

            public static Text getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Text> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Text defaultInstance = new Text();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Text.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Text, Builder> implements TextOrBuilder {
                private Builder() {
                    super(Text.DEFAULT_INSTANCE);
                }

                public boolean hasDisplayText() {
                    return ((Text)this.instance).hasDisplayText();
                }

                public String getDisplayText() {
                    return ((Text)this.instance).getDisplayText();
                }

                public ByteString getDisplayTextBytes() {
                    return ((Text)this.instance).getDisplayTextBytes();
                }

                public Builder setDisplayText(String value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setDisplayText(value);
                    return this;
                }

                public Builder clearDisplayText() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearDisplayText();
                    return this;
                }

                public Builder setDisplayTextBytes(ByteString value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setDisplayTextBytes(value);
                    return this;
                }

                public boolean hasLeft() {
                    return ((Text)this.instance).hasLeft();
                }

                public double getLeft() {
                    return ((Text)this.instance).getLeft();
                }

                public Builder setLeft(double value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setLeft(value);
                    return this;
                }

                public Builder clearLeft() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearLeft();
                    return this;
                }

                public boolean hasBaseline() {
                    return ((Text)this.instance).hasBaseline();
                }

                public double getBaseline() {
                    return ((Text)this.instance).getBaseline();
                }

                public Builder setBaseline(double value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setBaseline(value);
                    return this;
                }

                public Builder clearBaseline() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearBaseline();
                    return this;
                }

                public boolean hasFontHeight() {
                    return ((Text)this.instance).hasFontHeight();
                }

                public double getFontHeight() {
                    return ((Text)this.instance).getFontHeight();
                }

                public Builder setFontHeight(double value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setFontHeight(value);
                    return this;
                }

                public Builder clearFontHeight() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearFontHeight();
                    return this;
                }

                public boolean hasNormalized() {
                    return ((Text)this.instance).hasNormalized();
                }

                public boolean getNormalized() {
                    return ((Text)this.instance).getNormalized();
                }

                public Builder setNormalized(boolean value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setNormalized(value);
                    return this;
                }

                public Builder clearNormalized() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearNormalized();
                    return this;
                }

                public boolean hasFontFace() {
                    return ((Text)this.instance).hasFontFace();
                }

                public int getFontFace() {
                    return ((Text)this.instance).getFontFace();
                }

                public Builder setFontFace(int value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setFontFace(value);
                    return this;
                }

                public Builder clearFontFace() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearFontFace();
                    return this;
                }

                public boolean hasCenterHorizontally() {
                    return ((Text)this.instance).hasCenterHorizontally();
                }

                public boolean getCenterHorizontally() {
                    return ((Text)this.instance).getCenterHorizontally();
                }

                public Builder setCenterHorizontally(boolean value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setCenterHorizontally(value);
                    return this;
                }

                public Builder clearCenterHorizontally() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearCenterHorizontally();
                    return this;
                }

                public boolean hasCenterVertically() {
                    return ((Text)this.instance).hasCenterVertically();
                }

                public boolean getCenterVertically() {
                    return ((Text)this.instance).getCenterVertically();
                }

                public Builder setCenterVertically(boolean value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setCenterVertically(value);
                    return this;
                }

                public Builder clearCenterVertically() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearCenterVertically();
                    return this;
                }

                public boolean hasOutlineThickness() {
                    return ((Text)this.instance).hasOutlineThickness();
                }

                public double getOutlineThickness() {
                    return ((Text)this.instance).getOutlineThickness();
                }

                public Builder setOutlineThickness(double value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setOutlineThickness(value);
                    return this;
                }

                public Builder clearOutlineThickness() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearOutlineThickness();
                    return this;
                }

                public boolean hasOutlineColor() {
                    return ((Text)this.instance).hasOutlineColor();
                }

                public Color getOutlineColor() {
                    return ((Text)this.instance).getOutlineColor();
                }

                public Builder setOutlineColor(Color value) {
                    this.copyOnWrite();
                    ((Text)this.instance).setOutlineColor(value);
                    return this;
                }

                public Builder setOutlineColor(Color.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Text)this.instance).setOutlineColor((Color)builderForValue.build());
                    return this;
                }

                public Builder mergeOutlineColor(Color value) {
                    this.copyOnWrite();
                    ((Text)this.instance).mergeOutlineColor(value);
                    return this;
                }

                public Builder clearOutlineColor() {
                    this.copyOnWrite();
                    ((Text)this.instance).clearOutlineColor();
                    return this;
                }
            }
        }

        public interface TextOrBuilder extends MessageLiteOrBuilder {
            boolean hasDisplayText();

            String getDisplayText();

            ByteString getDisplayTextBytes();

            boolean hasLeft();

            double getLeft();

            boolean hasBaseline();

            double getBaseline();

            boolean hasFontHeight();

            double getFontHeight();

            boolean hasNormalized();

            boolean getNormalized();

            boolean hasFontFace();

            int getFontFace();

            boolean hasCenterHorizontally();

            boolean getCenterHorizontally();

            boolean hasCenterVertically();

            boolean getCenterVertically();

            boolean hasOutlineThickness();

            double getOutlineThickness();

            boolean hasOutlineColor();

            Color getOutlineColor();
        }

        public static final class Arrow extends GeneratedMessageLite<Arrow, Arrow.Builder> implements ArrowOrBuilder {
            private int bitField0_;
            public static final int X_START_FIELD_NUMBER = 1;
            private double xStart_;
            public static final int Y_START_FIELD_NUMBER = 2;
            private double yStart_;
            public static final int X_END_FIELD_NUMBER = 3;
            private double xEnd_;
            public static final int Y_END_FIELD_NUMBER = 4;
            private double yEnd_;
            public static final int NORMALIZED_FIELD_NUMBER = 5;
            private boolean normalized_;
            private static final Arrow DEFAULT_INSTANCE;
            private static volatile Parser<Arrow> PARSER;

            private Arrow() {
            }

            public boolean hasXStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public double getXStart() {
                return this.xStart_;
            }

            private void setXStart(double value) {
                this.bitField0_ |= 1;
                this.xStart_ = value;
            }

            private void clearXStart() {
                this.bitField0_ &= -2;
                this.xStart_ = 0.0D;
            }

            public boolean hasYStart() {
                return (this.bitField0_ & 2) != 0;
            }

            public double getYStart() {
                return this.yStart_;
            }

            private void setYStart(double value) {
                this.bitField0_ |= 2;
                this.yStart_ = value;
            }

            private void clearYStart() {
                this.bitField0_ &= -3;
                this.yStart_ = 0.0D;
            }

            public boolean hasXEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            public double getXEnd() {
                return this.xEnd_;
            }

            private void setXEnd(double value) {
                this.bitField0_ |= 4;
                this.xEnd_ = value;
            }

            private void clearXEnd() {
                this.bitField0_ &= -5;
                this.xEnd_ = 0.0D;
            }

            public boolean hasYEnd() {
                return (this.bitField0_ & 8) != 0;
            }

            public double getYEnd() {
                return this.yEnd_;
            }

            private void setYEnd(double value) {
                this.bitField0_ |= 8;
                this.yEnd_ = value;
            }

            private void clearYEnd() {
                this.bitField0_ &= -9;
                this.yEnd_ = 0.0D;
            }

            public boolean hasNormalized() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean getNormalized() {
                return this.normalized_;
            }

            private void setNormalized(boolean value) {
                this.bitField0_ |= 16;
                this.normalized_ = value;
            }

            private void clearNormalized() {
                this.bitField0_ &= -17;
                this.normalized_ = false;
            }

            public static Arrow parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Arrow parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Arrow parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Arrow parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Arrow parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Arrow parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Arrow parseFrom(InputStream input) throws IOException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Arrow parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Arrow parseDelimitedFrom(InputStream input) throws IOException {
                return (Arrow)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Arrow parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Arrow)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Arrow parseFrom(CodedInputStream input) throws IOException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Arrow parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Arrow)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Arrow prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Arrow();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "xStart_", "yStart_", "xEnd_", "yEnd_", "normalized_"};
                        String info = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005ဇ\u0004";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Arrow> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Arrow.class;
                            synchronized(Arrow.class) {
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

            public static Arrow getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Arrow> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Arrow defaultInstance = new Arrow();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Arrow.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Arrow, Builder> implements ArrowOrBuilder {
                private Builder() {
                    super(Arrow.DEFAULT_INSTANCE);
                }

                public boolean hasXStart() {
                    return ((Arrow)this.instance).hasXStart();
                }

                public double getXStart() {
                    return ((Arrow)this.instance).getXStart();
                }

                public Builder setXStart(double value) {
                    this.copyOnWrite();
                    ((Arrow)this.instance).setXStart(value);
                    return this;
                }

                public Builder clearXStart() {
                    this.copyOnWrite();
                    ((Arrow)this.instance).clearXStart();
                    return this;
                }

                public boolean hasYStart() {
                    return ((Arrow)this.instance).hasYStart();
                }

                public double getYStart() {
                    return ((Arrow)this.instance).getYStart();
                }

                public Builder setYStart(double value) {
                    this.copyOnWrite();
                    ((Arrow)this.instance).setYStart(value);
                    return this;
                }

                public Builder clearYStart() {
                    this.copyOnWrite();
                    ((Arrow)this.instance).clearYStart();
                    return this;
                }

                public boolean hasXEnd() {
                    return ((Arrow)this.instance).hasXEnd();
                }

                public double getXEnd() {
                    return ((Arrow)this.instance).getXEnd();
                }

                public Builder setXEnd(double value) {
                    this.copyOnWrite();
                    ((Arrow)this.instance).setXEnd(value);
                    return this;
                }

                public Builder clearXEnd() {
                    this.copyOnWrite();
                    ((Arrow)this.instance).clearXEnd();
                    return this;
                }

                public boolean hasYEnd() {
                    return ((Arrow)this.instance).hasYEnd();
                }

                public double getYEnd() {
                    return ((Arrow)this.instance).getYEnd();
                }

                public Builder setYEnd(double value) {
                    this.copyOnWrite();
                    ((Arrow)this.instance).setYEnd(value);
                    return this;
                }

                public Builder clearYEnd() {
                    this.copyOnWrite();
                    ((Arrow)this.instance).clearYEnd();
                    return this;
                }

                public boolean hasNormalized() {
                    return ((Arrow)this.instance).hasNormalized();
                }

                public boolean getNormalized() {
                    return ((Arrow)this.instance).getNormalized();
                }

                public Builder setNormalized(boolean value) {
                    this.copyOnWrite();
                    ((Arrow)this.instance).setNormalized(value);
                    return this;
                }

                public Builder clearNormalized() {
                    this.copyOnWrite();
                    ((Arrow)this.instance).clearNormalized();
                    return this;
                }
            }
        }

        public interface ArrowOrBuilder extends MessageLiteOrBuilder {
            boolean hasXStart();

            double getXStart();

            boolean hasYStart();

            double getYStart();

            boolean hasXEnd();

            double getXEnd();

            boolean hasYEnd();

            double getYEnd();

            boolean hasNormalized();

            boolean getNormalized();
        }

        public static final class Scribble extends GeneratedMessageLite<Scribble, Scribble.Builder> implements ScribbleOrBuilder {
            public static final int POINT_FIELD_NUMBER = 1;
            private ProtobufList<Point> point_ = emptyProtobufList();
            private static final Scribble DEFAULT_INSTANCE;
            private static volatile Parser<Scribble> PARSER;

            private Scribble() {
            }

            public List<Point> getPointList() {
                return this.point_;
            }

            public List<? extends PointOrBuilder> getPointOrBuilderList() {
                return this.point_;
            }

            public int getPointCount() {
                return this.point_.size();
            }

            public Point getPoint(int index) {
                return (Point)this.point_.get(index);
            }

            public PointOrBuilder getPointOrBuilder(int index) {
                return (PointOrBuilder)this.point_.get(index);
            }

            private void ensurePointIsMutable() {
                ProtobufList<Point> tmp = this.point_;
                if (!tmp.isModifiable()) {
                    this.point_ = GeneratedMessageLite.mutableCopy(tmp);
                }

            }

            private void setPoint(int index, Point value) {
                value.getClass();
                this.ensurePointIsMutable();
                this.point_.set(index, value);
            }

            private void addPoint(Point value) {
                value.getClass();
                this.ensurePointIsMutable();
                this.point_.add(value);
            }

            private void addPoint(int index, Point value) {
                value.getClass();
                this.ensurePointIsMutable();
                this.point_.add(index, value);
            }

            private void addAllPoint(Iterable<? extends Point> values) {
                this.ensurePointIsMutable();
                AbstractMessageLite.addAll(values, this.point_);
            }

            private void clearPoint() {
                this.point_ = emptyProtobufList();
            }

            private void removePoint(int index) {
                this.ensurePointIsMutable();
                this.point_.remove(index);
            }

            public static Scribble parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Scribble parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Scribble parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Scribble parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Scribble parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Scribble parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Scribble parseFrom(InputStream input) throws IOException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Scribble parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Scribble parseDelimitedFrom(InputStream input) throws IOException {
                return (Scribble)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Scribble parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Scribble)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Scribble parseFrom(CodedInputStream input) throws IOException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Scribble parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Scribble)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Scribble prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Scribble();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"point_", Point.class};
                        String info = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Scribble> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Scribble.class;
                            synchronized(Scribble.class) {
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

            public static Scribble getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Scribble> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Scribble defaultInstance = new Scribble();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Scribble.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Scribble, Builder> implements ScribbleOrBuilder {
                private Builder() {
                    super(Scribble.DEFAULT_INSTANCE);
                }

                public List<Point> getPointList() {
                    return Collections.unmodifiableList(((Scribble)this.instance).getPointList());
                }

                public int getPointCount() {
                    return ((Scribble)this.instance).getPointCount();
                }

                public Point getPoint(int index) {
                    return ((Scribble)this.instance).getPoint(index);
                }

                public Builder setPoint(int index, Point value) {
                    this.copyOnWrite();
                    ((Scribble)this.instance).setPoint(index, value);
                    return this;
                }

                public Builder setPoint(int index, Point.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Scribble)this.instance).setPoint(index, (Point)builderForValue.build());
                    return this;
                }

                public Builder addPoint(Point value) {
                    this.copyOnWrite();
                    ((Scribble)this.instance).addPoint(value);
                    return this;
                }

                public Builder addPoint(int index, Point value) {
                    this.copyOnWrite();
                    ((Scribble)this.instance).addPoint(index, value);
                    return this;
                }

                public Builder addPoint(Point.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Scribble)this.instance).addPoint((Point)builderForValue.build());
                    return this;
                }

                public Builder addPoint(int index, Point.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Scribble)this.instance).addPoint(index, (Point)builderForValue.build());
                    return this;
                }

                public Builder addAllPoint(Iterable<? extends Point> values) {
                    this.copyOnWrite();
                    ((Scribble)this.instance).addAllPoint(values);
                    return this;
                }

                public Builder clearPoint() {
                    this.copyOnWrite();
                    ((Scribble)this.instance).clearPoint();
                    return this;
                }

                public Builder removePoint(int index) {
                    this.copyOnWrite();
                    ((Scribble)this.instance).removePoint(index);
                    return this;
                }
            }
        }

        public interface ScribbleOrBuilder extends MessageLiteOrBuilder {
            List<Point> getPointList();

            Point getPoint(int index);

            int getPointCount();
        }

        public static final class GradientLine extends GeneratedMessageLite<GradientLine, GradientLine.Builder> implements GradientLineOrBuilder {
            private int bitField0_;
            public static final int X_START_FIELD_NUMBER = 1;
            private double xStart_;
            public static final int Y_START_FIELD_NUMBER = 2;
            private double yStart_;
            public static final int X_END_FIELD_NUMBER = 3;
            private double xEnd_;
            public static final int Y_END_FIELD_NUMBER = 4;
            private double yEnd_;
            public static final int NORMALIZED_FIELD_NUMBER = 5;
            private boolean normalized_;
            public static final int COLOR1_FIELD_NUMBER = 6;
            private Color color1_;
            public static final int COLOR2_FIELD_NUMBER = 7;
            private Color color2_;
            private static final GradientLine DEFAULT_INSTANCE;
            private static volatile Parser<GradientLine> PARSER;

            private GradientLine() {
            }

            public boolean hasXStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public double getXStart() {
                return this.xStart_;
            }

            private void setXStart(double value) {
                this.bitField0_ |= 1;
                this.xStart_ = value;
            }

            private void clearXStart() {
                this.bitField0_ &= -2;
                this.xStart_ = 0.0D;
            }

            public boolean hasYStart() {
                return (this.bitField0_ & 2) != 0;
            }

            public double getYStart() {
                return this.yStart_;
            }

            private void setYStart(double value) {
                this.bitField0_ |= 2;
                this.yStart_ = value;
            }

            private void clearYStart() {
                this.bitField0_ &= -3;
                this.yStart_ = 0.0D;
            }

            public boolean hasXEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            public double getXEnd() {
                return this.xEnd_;
            }

            private void setXEnd(double value) {
                this.bitField0_ |= 4;
                this.xEnd_ = value;
            }

            private void clearXEnd() {
                this.bitField0_ &= -5;
                this.xEnd_ = 0.0D;
            }

            public boolean hasYEnd() {
                return (this.bitField0_ & 8) != 0;
            }

            public double getYEnd() {
                return this.yEnd_;
            }

            private void setYEnd(double value) {
                this.bitField0_ |= 8;
                this.yEnd_ = value;
            }

            private void clearYEnd() {
                this.bitField0_ &= -9;
                this.yEnd_ = 0.0D;
            }

            public boolean hasNormalized() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean getNormalized() {
                return this.normalized_;
            }

            private void setNormalized(boolean value) {
                this.bitField0_ |= 16;
                this.normalized_ = value;
            }

            private void clearNormalized() {
                this.bitField0_ &= -17;
                this.normalized_ = false;
            }

            public boolean hasColor1() {
                return (this.bitField0_ & 32) != 0;
            }

            public Color getColor1() {
                return this.color1_ == null ? Color.getDefaultInstance() : this.color1_;
            }

            private void setColor1(Color value) {
                value.getClass();
                this.color1_ = value;
                this.bitField0_ |= 32;
            }

            private void mergeColor1(Color value) {
                value.getClass();
                if (this.color1_ != null && this.color1_ != Color.getDefaultInstance()) {
                    this.color1_ = (Color)((Color.Builder)Color.newBuilder(this.color1_).mergeFrom(value)).buildPartial();
                } else {
                    this.color1_ = value;
                }

                this.bitField0_ |= 32;
            }

            private void clearColor1() {
                this.color1_ = null;
                this.bitField0_ &= -33;
            }

            public boolean hasColor2() {
                return (this.bitField0_ & 64) != 0;
            }

            public Color getColor2() {
                return this.color2_ == null ? Color.getDefaultInstance() : this.color2_;
            }

            private void setColor2(Color value) {
                value.getClass();
                this.color2_ = value;
                this.bitField0_ |= 64;
            }

            private void mergeColor2(Color value) {
                value.getClass();
                if (this.color2_ != null && this.color2_ != Color.getDefaultInstance()) {
                    this.color2_ = (Color)((Color.Builder)Color.newBuilder(this.color2_).mergeFrom(value)).buildPartial();
                } else {
                    this.color2_ = value;
                }

                this.bitField0_ |= 64;
            }

            private void clearColor2() {
                this.color2_ = null;
                this.bitField0_ &= -65;
            }

            public static GradientLine parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static GradientLine parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static GradientLine parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static GradientLine parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static GradientLine parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static GradientLine parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static GradientLine parseFrom(InputStream input) throws IOException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static GradientLine parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static GradientLine parseDelimitedFrom(InputStream input) throws IOException {
                return (GradientLine)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static GradientLine parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (GradientLine)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static GradientLine parseFrom(CodedInputStream input) throws IOException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static GradientLine parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (GradientLine)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(GradientLine prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new GradientLine();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "xStart_", "yStart_", "xEnd_", "yEnd_", "normalized_", "color1_", "color2_"};
                        String info = "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<GradientLine> parser = PARSER;
                        if (parser == null) {
                            Class var5 = GradientLine.class;
                            synchronized(GradientLine.class) {
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

            public static GradientLine getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<GradientLine> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                GradientLine defaultInstance = new GradientLine();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(GradientLine.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<GradientLine, Builder> implements GradientLineOrBuilder {
                private Builder() {
                    super(GradientLine.DEFAULT_INSTANCE);
                }

                public boolean hasXStart() {
                    return ((GradientLine)this.instance).hasXStart();
                }

                public double getXStart() {
                    return ((GradientLine)this.instance).getXStart();
                }

                public Builder setXStart(double value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setXStart(value);
                    return this;
                }

                public Builder clearXStart() {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).clearXStart();
                    return this;
                }

                public boolean hasYStart() {
                    return ((GradientLine)this.instance).hasYStart();
                }

                public double getYStart() {
                    return ((GradientLine)this.instance).getYStart();
                }

                public Builder setYStart(double value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setYStart(value);
                    return this;
                }

                public Builder clearYStart() {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).clearYStart();
                    return this;
                }

                public boolean hasXEnd() {
                    return ((GradientLine)this.instance).hasXEnd();
                }

                public double getXEnd() {
                    return ((GradientLine)this.instance).getXEnd();
                }

                public Builder setXEnd(double value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setXEnd(value);
                    return this;
                }

                public Builder clearXEnd() {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).clearXEnd();
                    return this;
                }

                public boolean hasYEnd() {
                    return ((GradientLine)this.instance).hasYEnd();
                }

                public double getYEnd() {
                    return ((GradientLine)this.instance).getYEnd();
                }

                public Builder setYEnd(double value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setYEnd(value);
                    return this;
                }

                public Builder clearYEnd() {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).clearYEnd();
                    return this;
                }

                public boolean hasNormalized() {
                    return ((GradientLine)this.instance).hasNormalized();
                }

                public boolean getNormalized() {
                    return ((GradientLine)this.instance).getNormalized();
                }

                public Builder setNormalized(boolean value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setNormalized(value);
                    return this;
                }

                public Builder clearNormalized() {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).clearNormalized();
                    return this;
                }

                public boolean hasColor1() {
                    return ((GradientLine)this.instance).hasColor1();
                }

                public Color getColor1() {
                    return ((GradientLine)this.instance).getColor1();
                }

                public Builder setColor1(Color value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setColor1(value);
                    return this;
                }

                public Builder setColor1(Color.Builder builderForValue) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setColor1((Color)builderForValue.build());
                    return this;
                }

                public Builder mergeColor1(Color value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).mergeColor1(value);
                    return this;
                }

                public Builder clearColor1() {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).clearColor1();
                    return this;
                }

                public boolean hasColor2() {
                    return ((GradientLine)this.instance).hasColor2();
                }

                public Color getColor2() {
                    return ((GradientLine)this.instance).getColor2();
                }

                public Builder setColor2(Color value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setColor2(value);
                    return this;
                }

                public Builder setColor2(Color.Builder builderForValue) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).setColor2((Color)builderForValue.build());
                    return this;
                }

                public Builder mergeColor2(Color value) {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).mergeColor2(value);
                    return this;
                }

                public Builder clearColor2() {
                    this.copyOnWrite();
                    ((GradientLine)this.instance).clearColor2();
                    return this;
                }
            }
        }

        public interface GradientLineOrBuilder extends MessageLiteOrBuilder {
            boolean hasXStart();

            double getXStart();

            boolean hasYStart();

            double getYStart();

            boolean hasXEnd();

            double getXEnd();

            boolean hasYEnd();

            double getYEnd();

            boolean hasNormalized();

            boolean getNormalized();

            boolean hasColor1();

            Color getColor1();

            boolean hasColor2();

            Color getColor2();
        }

        public static final class Line extends GeneratedMessageLite<Line, Line.Builder> implements LineOrBuilder {
            private int bitField0_;
            public static final int X_START_FIELD_NUMBER = 1;
            private double xStart_;
            public static final int Y_START_FIELD_NUMBER = 2;
            private double yStart_;
            public static final int X_END_FIELD_NUMBER = 3;
            private double xEnd_;
            public static final int Y_END_FIELD_NUMBER = 4;
            private double yEnd_;
            public static final int NORMALIZED_FIELD_NUMBER = 5;
            private boolean normalized_;
            public static final int LINE_TYPE_FIELD_NUMBER = 6;
            private int lineType_ = 1;
            private static final Line DEFAULT_INSTANCE;
            private static volatile Parser<Line> PARSER;

            private Line() {
            }

            public boolean hasXStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public double getXStart() {
                return this.xStart_;
            }

            private void setXStart(double value) {
                this.bitField0_ |= 1;
                this.xStart_ = value;
            }

            private void clearXStart() {
                this.bitField0_ &= -2;
                this.xStart_ = 0.0D;
            }

            public boolean hasYStart() {
                return (this.bitField0_ & 2) != 0;
            }

            public double getYStart() {
                return this.yStart_;
            }

            private void setYStart(double value) {
                this.bitField0_ |= 2;
                this.yStart_ = value;
            }

            private void clearYStart() {
                this.bitField0_ &= -3;
                this.yStart_ = 0.0D;
            }

            public boolean hasXEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            public double getXEnd() {
                return this.xEnd_;
            }

            private void setXEnd(double value) {
                this.bitField0_ |= 4;
                this.xEnd_ = value;
            }

            private void clearXEnd() {
                this.bitField0_ &= -5;
                this.xEnd_ = 0.0D;
            }

            public boolean hasYEnd() {
                return (this.bitField0_ & 8) != 0;
            }

            public double getYEnd() {
                return this.yEnd_;
            }

            private void setYEnd(double value) {
                this.bitField0_ |= 8;
                this.yEnd_ = value;
            }

            private void clearYEnd() {
                this.bitField0_ &= -9;
                this.yEnd_ = 0.0D;
            }

            public boolean hasNormalized() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean getNormalized() {
                return this.normalized_;
            }

            private void setNormalized(boolean value) {
                this.bitField0_ |= 16;
                this.normalized_ = value;
            }

            private void clearNormalized() {
                this.bitField0_ &= -17;
                this.normalized_ = false;
            }

            public boolean hasLineType() {
                return (this.bitField0_ & 32) != 0;
            }

            public LineType getLineType() {
                LineType result = LineType.forNumber(this.lineType_);
                return result == null ? LineType.SOLID : result;
            }

            private void setLineType(LineType value) {
                this.lineType_ = value.getNumber();
                this.bitField0_ |= 32;
            }

            private void clearLineType() {
                this.bitField0_ &= -33;
                this.lineType_ = 1;
            }

            public static Line parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Line parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Line parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Line parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Line parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Line parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Line parseFrom(InputStream input) throws IOException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Line parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Line parseDelimitedFrom(InputStream input) throws IOException {
                return (Line)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Line parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Line)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Line parseFrom(CodedInputStream input) throws IOException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Line parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Line)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Line prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Line();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "xStart_", "yStart_", "xEnd_", "yEnd_", "normalized_", "lineType_", LineType.internalGetVerifier()};
                        String info = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005ဇ\u0004\u0006ဌ\u0005";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Line> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Line.class;
                            synchronized(Line.class) {
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

            public static Line getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Line> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Line defaultInstance = new Line();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Line.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Line, Builder> implements LineOrBuilder {
                private Builder() {
                    super(Line.DEFAULT_INSTANCE);
                }

                public boolean hasXStart() {
                    return ((Line)this.instance).hasXStart();
                }

                public double getXStart() {
                    return ((Line)this.instance).getXStart();
                }

                public Builder setXStart(double value) {
                    this.copyOnWrite();
                    ((Line)this.instance).setXStart(value);
                    return this;
                }

                public Builder clearXStart() {
                    this.copyOnWrite();
                    ((Line)this.instance).clearXStart();
                    return this;
                }

                public boolean hasYStart() {
                    return ((Line)this.instance).hasYStart();
                }

                public double getYStart() {
                    return ((Line)this.instance).getYStart();
                }

                public Builder setYStart(double value) {
                    this.copyOnWrite();
                    ((Line)this.instance).setYStart(value);
                    return this;
                }

                public Builder clearYStart() {
                    this.copyOnWrite();
                    ((Line)this.instance).clearYStart();
                    return this;
                }

                public boolean hasXEnd() {
                    return ((Line)this.instance).hasXEnd();
                }

                public double getXEnd() {
                    return ((Line)this.instance).getXEnd();
                }

                public Builder setXEnd(double value) {
                    this.copyOnWrite();
                    ((Line)this.instance).setXEnd(value);
                    return this;
                }

                public Builder clearXEnd() {
                    this.copyOnWrite();
                    ((Line)this.instance).clearXEnd();
                    return this;
                }

                public boolean hasYEnd() {
                    return ((Line)this.instance).hasYEnd();
                }

                public double getYEnd() {
                    return ((Line)this.instance).getYEnd();
                }

                public Builder setYEnd(double value) {
                    this.copyOnWrite();
                    ((Line)this.instance).setYEnd(value);
                    return this;
                }

                public Builder clearYEnd() {
                    this.copyOnWrite();
                    ((Line)this.instance).clearYEnd();
                    return this;
                }

                public boolean hasNormalized() {
                    return ((Line)this.instance).hasNormalized();
                }

                public boolean getNormalized() {
                    return ((Line)this.instance).getNormalized();
                }

                public Builder setNormalized(boolean value) {
                    this.copyOnWrite();
                    ((Line)this.instance).setNormalized(value);
                    return this;
                }

                public Builder clearNormalized() {
                    this.copyOnWrite();
                    ((Line)this.instance).clearNormalized();
                    return this;
                }

                public boolean hasLineType() {
                    return ((Line)this.instance).hasLineType();
                }

                public LineType getLineType() {
                    return ((Line)this.instance).getLineType();
                }

                public Builder setLineType(LineType value) {
                    this.copyOnWrite();
                    ((Line)this.instance).setLineType(value);
                    return this;
                }

                public Builder clearLineType() {
                    this.copyOnWrite();
                    ((Line)this.instance).clearLineType();
                    return this;
                }
            }

            public static enum LineType implements EnumLite {
                UNKNOWN(0),
                SOLID(1),
                DASHED(2);

                public static final int UNKNOWN_VALUE = 0;
                public static final int SOLID_VALUE = 1;
                public static final int DASHED_VALUE = 2;
                private static final EnumLiteMap<LineType> internalValueMap = new EnumLiteMap<LineType>() {
                    public LineType findValueByNumber(int number) {
                        return LineType.forNumber(number);
                    }
                };
                private final int value;

                public final int getNumber() {
                    return this.value;
                }

                /** @deprecated */
                @Deprecated
                public static LineType valueOf(int value) {
                    return forNumber(value);
                }

                public static LineType forNumber(int value) {
                    switch(value) {
                        case 0:
                            return UNKNOWN;
                        case 1:
                            return SOLID;
                        case 2:
                            return DASHED;
                        default:
                            return null;
                    }
                }

                public static EnumLiteMap<LineType> internalGetValueMap() {
                    return internalValueMap;
                }

                public static EnumVerifier internalGetVerifier() {
                    return LineTypeVerifier.INSTANCE;
                }

                private LineType(int value) {
                    this.value = value;
                }

                private static final class LineTypeVerifier implements EnumVerifier {
                    static final EnumVerifier INSTANCE = new LineTypeVerifier();

                    private LineTypeVerifier() {
                    }

                    public boolean isInRange(int number) {
                        return LineType.forNumber(number) != null;
                    }
                }
            }
        }

        public interface LineOrBuilder extends MessageLiteOrBuilder {
            boolean hasXStart();

            double getXStart();

            boolean hasYStart();

            double getYStart();

            boolean hasXEnd();

            double getXEnd();

            boolean hasYEnd();

            double getYEnd();

            boolean hasNormalized();

            boolean getNormalized();

            boolean hasLineType();

            Line.LineType getLineType();
        }

        public static final class Point extends GeneratedMessageLite<Point, Point.Builder> implements PointOrBuilder {
            private int bitField0_;
            public static final int X_FIELD_NUMBER = 1;
            private double x_;
            public static final int Y_FIELD_NUMBER = 2;
            private double y_;
            public static final int NORMALIZED_FIELD_NUMBER = 3;
            private boolean normalized_;
            private static final Point DEFAULT_INSTANCE;
            private static volatile Parser<Point> PARSER;

            private Point() {
            }

            public boolean hasX() {
                return (this.bitField0_ & 1) != 0;
            }

            public double getX() {
                return this.x_;
            }

            private void setX(double value) {
                this.bitField0_ |= 1;
                this.x_ = value;
            }

            private void clearX() {
                this.bitField0_ &= -2;
                this.x_ = 0.0D;
            }

            public boolean hasY() {
                return (this.bitField0_ & 2) != 0;
            }

            public double getY() {
                return this.y_;
            }

            private void setY(double value) {
                this.bitField0_ |= 2;
                this.y_ = value;
            }

            private void clearY() {
                this.bitField0_ &= -3;
                this.y_ = 0.0D;
            }

            public boolean hasNormalized() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean getNormalized() {
                return this.normalized_;
            }

            private void setNormalized(boolean value) {
                this.bitField0_ |= 4;
                this.normalized_ = value;
            }

            private void clearNormalized() {
                this.bitField0_ &= -5;
                this.normalized_ = false;
            }

            public static Point parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Point parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Point parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Point parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Point parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Point parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Point parseFrom(InputStream input) throws IOException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Point parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Point parseDelimitedFrom(InputStream input) throws IOException {
                return (Point)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Point parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Point)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Point parseFrom(CodedInputStream input) throws IOException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Point parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Point)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Point prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Point();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "x_", "y_", "normalized_"};
                        String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဇ\u0002";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Point> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Point.class;
                            synchronized(Point.class) {
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

            public static Point getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Point> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Point defaultInstance = new Point();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Point.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Point, Builder> implements PointOrBuilder {
                private Builder() {
                    super(Point.DEFAULT_INSTANCE);
                }

                public boolean hasX() {
                    return ((Point)this.instance).hasX();
                }

                public double getX() {
                    return ((Point)this.instance).getX();
                }

                public Builder setX(double value) {
                    this.copyOnWrite();
                    ((Point)this.instance).setX(value);
                    return this;
                }

                public Builder clearX() {
                    this.copyOnWrite();
                    ((Point)this.instance).clearX();
                    return this;
                }

                public boolean hasY() {
                    return ((Point)this.instance).hasY();
                }

                public double getY() {
                    return ((Point)this.instance).getY();
                }

                public Builder setY(double value) {
                    this.copyOnWrite();
                    ((Point)this.instance).setY(value);
                    return this;
                }

                public Builder clearY() {
                    this.copyOnWrite();
                    ((Point)this.instance).clearY();
                    return this;
                }

                public boolean hasNormalized() {
                    return ((Point)this.instance).hasNormalized();
                }

                public boolean getNormalized() {
                    return ((Point)this.instance).getNormalized();
                }

                public Builder setNormalized(boolean value) {
                    this.copyOnWrite();
                    ((Point)this.instance).setNormalized(value);
                    return this;
                }

                public Builder clearNormalized() {
                    this.copyOnWrite();
                    ((Point)this.instance).clearNormalized();
                    return this;
                }
            }
        }

        public interface PointOrBuilder extends MessageLiteOrBuilder {
            boolean hasX();

            double getX();

            boolean hasY();

            double getY();

            boolean hasNormalized();

            boolean getNormalized();
        }

        public static final class FilledOval extends GeneratedMessageLite<FilledOval, FilledOval.Builder> implements FilledOvalOrBuilder {
            private int bitField0_;
            public static final int OVAL_FIELD_NUMBER = 1;
            private Oval oval_;
            public static final int FILL_COLOR_FIELD_NUMBER = 2;
            private Color fillColor_;
            private static final FilledOval DEFAULT_INSTANCE;
            private static volatile Parser<FilledOval> PARSER;

            private FilledOval() {
            }

            public boolean hasOval() {
                return (this.bitField0_ & 1) != 0;
            }

            public Oval getOval() {
                return this.oval_ == null ? Oval.getDefaultInstance() : this.oval_;
            }

            private void setOval(Oval value) {
                value.getClass();
                this.oval_ = value;
                this.bitField0_ |= 1;
            }

            private void mergeOval(Oval value) {
                value.getClass();
                if (this.oval_ != null && this.oval_ != Oval.getDefaultInstance()) {
                    this.oval_ = (Oval)((Oval.Builder) Oval.newBuilder(this.oval_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
                } else {
                    this.oval_ = value;
                }

                this.bitField0_ |= 1;
            }

            private void clearOval() {
                this.oval_ = null;
                this.bitField0_ &= -2;
            }

            public boolean hasFillColor() {
                return (this.bitField0_ & 2) != 0;
            }

            public Color getFillColor() {
                return this.fillColor_ == null ? Color.getDefaultInstance() : this.fillColor_;
            }

            private void setFillColor(Color value) {
                value.getClass();
                this.fillColor_ = value;
                this.bitField0_ |= 2;
            }

            private void mergeFillColor(Color value) {
                value.getClass();
                if (this.fillColor_ != null && this.fillColor_ != Color.getDefaultInstance()) {
                    this.fillColor_ = (Color)((Color.Builder)Color.newBuilder(this.fillColor_).mergeFrom(value)).buildPartial();
                } else {
                    this.fillColor_ = value;
                }

                this.bitField0_ |= 2;
            }

            private void clearFillColor() {
                this.fillColor_ = null;
                this.bitField0_ &= -3;
            }

            public static FilledOval parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledOval parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledOval parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledOval parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledOval parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledOval parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledOval parseFrom(InputStream input) throws IOException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledOval parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FilledOval parseDelimitedFrom(InputStream input) throws IOException {
                return (FilledOval)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledOval parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledOval)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FilledOval parseFrom(CodedInputStream input) throws IOException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledOval parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledOval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(FilledOval prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new FilledOval();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "oval_", "fillColor_"};
                        String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<FilledOval> parser = PARSER;
                        if (parser == null) {
                            Class var5 = FilledOval.class;
                            synchronized(FilledOval.class) {
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

            public static FilledOval getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<FilledOval> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                FilledOval defaultInstance = new FilledOval();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(FilledOval.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<FilledOval, Builder> implements FilledOvalOrBuilder {
                private Builder() {
                    super(FilledOval.DEFAULT_INSTANCE);
                }

                public boolean hasOval() {
                    return ((FilledOval)this.instance).hasOval();
                }

                public Oval getOval() {
                    return ((FilledOval)this.instance).getOval();
                }

                public Builder setOval(Oval value) {
                    this.copyOnWrite();
                    ((FilledOval)this.instance).setOval(value);
                    return this;
                }

                public Builder setOval(Oval.Builder builderForValue) {
                    this.copyOnWrite();
                    ((FilledOval)this.instance).setOval((Oval)builderForValue.build());
                    return this;
                }

                public Builder mergeOval(Oval value) {
                    this.copyOnWrite();
                    ((FilledOval)this.instance).mergeOval(value);
                    return this;
                }

                public Builder clearOval() {
                    this.copyOnWrite();
                    ((FilledOval)this.instance).clearOval();
                    return this;
                }

                public boolean hasFillColor() {
                    return ((FilledOval)this.instance).hasFillColor();
                }

                public Color getFillColor() {
                    return ((FilledOval)this.instance).getFillColor();
                }

                public Builder setFillColor(Color value) {
                    this.copyOnWrite();
                    ((FilledOval)this.instance).setFillColor(value);
                    return this;
                }

                public Builder setFillColor(Color.Builder builderForValue) {
                    this.copyOnWrite();
                    ((FilledOval)this.instance).setFillColor((Color)builderForValue.build());
                    return this;
                }

                public Builder mergeFillColor(Color value) {
                    this.copyOnWrite();
                    ((FilledOval)this.instance).mergeFillColor(value);
                    return this;
                }

                public Builder clearFillColor() {
                    this.copyOnWrite();
                    ((FilledOval)this.instance).clearFillColor();
                    return this;
                }
            }
        }

        public interface FilledOvalOrBuilder extends MessageLiteOrBuilder {
            boolean hasOval();

            Oval getOval();

            boolean hasFillColor();

            Color getFillColor();
        }

        public static final class Oval extends GeneratedMessageLite<Oval, Oval.Builder> implements OvalOrBuilder {
            private int bitField0_;
            public static final int RECTANGLE_FIELD_NUMBER = 1;
            private Rectangle rectangle_;
            private static final Oval DEFAULT_INSTANCE;
            private static volatile Parser<Oval> PARSER;

            private Oval() {
            }

            public boolean hasRectangle() {
                return (this.bitField0_ & 1) != 0;
            }

            public Rectangle getRectangle() {
                return this.rectangle_ == null ? Rectangle.getDefaultInstance() : this.rectangle_;
            }

            private void setRectangle(Rectangle value) {
                value.getClass();
                this.rectangle_ = value;
                this.bitField0_ |= 1;
            }

            private void mergeRectangle(Rectangle value) {
                value.getClass();
                if (this.rectangle_ != null && this.rectangle_ != Rectangle.getDefaultInstance()) {
                    this.rectangle_ = (Rectangle)((Rectangle.Builder) Rectangle.newBuilder(this.rectangle_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
                } else {
                    this.rectangle_ = value;
                }

                this.bitField0_ |= 1;
            }

            private void clearRectangle() {
                this.rectangle_ = null;
                this.bitField0_ &= -2;
            }

            public static Oval parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Oval parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Oval parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Oval parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Oval parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Oval parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Oval parseFrom(InputStream input) throws IOException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Oval parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Oval parseDelimitedFrom(InputStream input) throws IOException {
                return (Oval)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Oval parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Oval)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Oval parseFrom(CodedInputStream input) throws IOException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Oval parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Oval)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Oval prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Oval();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "rectangle_"};
                        String info = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Oval> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Oval.class;
                            synchronized(Oval.class) {
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

            public static Oval getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Oval> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Oval defaultInstance = new Oval();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Oval.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Oval, Builder> implements OvalOrBuilder {
                private Builder() {
                    super(Oval.DEFAULT_INSTANCE);
                }

                public boolean hasRectangle() {
                    return ((Oval)this.instance).hasRectangle();
                }

                public Rectangle getRectangle() {
                    return ((Oval)this.instance).getRectangle();
                }

                public Builder setRectangle(Rectangle value) {
                    this.copyOnWrite();
                    ((Oval)this.instance).setRectangle(value);
                    return this;
                }

                public Builder setRectangle(Rectangle.Builder builderForValue) {
                    this.copyOnWrite();
                    ((Oval)this.instance).setRectangle((Rectangle)builderForValue.build());
                    return this;
                }

                public Builder mergeRectangle(Rectangle value) {
                    this.copyOnWrite();
                    ((Oval)this.instance).mergeRectangle(value);
                    return this;
                }

                public Builder clearRectangle() {
                    this.copyOnWrite();
                    ((Oval)this.instance).clearRectangle();
                    return this;
                }
            }
        }

        public interface OvalOrBuilder extends MessageLiteOrBuilder {
            boolean hasRectangle();

            Rectangle getRectangle();
        }

        public static final class FilledRoundedRectangle extends GeneratedMessageLite<FilledRoundedRectangle, FilledRoundedRectangle.Builder> implements FilledRoundedRectangleOrBuilder {
            private int bitField0_;
            public static final int ROUNDED_RECTANGLE_FIELD_NUMBER = 1;
            private RoundedRectangle roundedRectangle_;
            public static final int FILL_COLOR_FIELD_NUMBER = 2;
            private Color fillColor_;
            private static final FilledRoundedRectangle DEFAULT_INSTANCE;
            private static volatile Parser<FilledRoundedRectangle> PARSER;

            private FilledRoundedRectangle() {
            }

            public boolean hasRoundedRectangle() {
                return (this.bitField0_ & 1) != 0;
            }

            public RoundedRectangle getRoundedRectangle() {
                return this.roundedRectangle_ == null ? RoundedRectangle.getDefaultInstance() : this.roundedRectangle_;
            }

            private void setRoundedRectangle(RoundedRectangle value) {
                value.getClass();
                this.roundedRectangle_ = value;
                this.bitField0_ |= 1;
            }

            private void mergeRoundedRectangle(RoundedRectangle value) {
                value.getClass();
                if (this.roundedRectangle_ != null && this.roundedRectangle_ != RoundedRectangle.getDefaultInstance()) {
                    this.roundedRectangle_ = (RoundedRectangle)((RoundedRectangle.Builder) RoundedRectangle.newBuilder(this.roundedRectangle_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
                } else {
                    this.roundedRectangle_ = value;
                }

                this.bitField0_ |= 1;
            }

            private void clearRoundedRectangle() {
                this.roundedRectangle_ = null;
                this.bitField0_ &= -2;
            }

            public boolean hasFillColor() {
                return (this.bitField0_ & 2) != 0;
            }

            public Color getFillColor() {
                return this.fillColor_ == null ? Color.getDefaultInstance() : this.fillColor_;
            }

            private void setFillColor(Color value) {
                value.getClass();
                this.fillColor_ = value;
                this.bitField0_ |= 2;
            }

            private void mergeFillColor(Color value) {
                value.getClass();
                if (this.fillColor_ != null && this.fillColor_ != Color.getDefaultInstance()) {
                    this.fillColor_ = (Color)((Color.Builder)Color.newBuilder(this.fillColor_).mergeFrom(value)).buildPartial();
                } else {
                    this.fillColor_ = value;
                }

                this.bitField0_ |= 2;
            }

            private void clearFillColor() {
                this.fillColor_ = null;
                this.bitField0_ &= -3;
            }

            public static FilledRoundedRectangle parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledRoundedRectangle parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledRoundedRectangle parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledRoundedRectangle parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledRoundedRectangle parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledRoundedRectangle parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledRoundedRectangle parseFrom(InputStream input) throws IOException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledRoundedRectangle parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FilledRoundedRectangle parseDelimitedFrom(InputStream input) throws IOException {
                return (FilledRoundedRectangle)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledRoundedRectangle parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledRoundedRectangle)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FilledRoundedRectangle parseFrom(CodedInputStream input) throws IOException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledRoundedRectangle parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledRoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(FilledRoundedRectangle prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new FilledRoundedRectangle();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "roundedRectangle_", "fillColor_"};
                        String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<FilledRoundedRectangle> parser = PARSER;
                        if (parser == null) {
                            Class var5 = FilledRoundedRectangle.class;
                            synchronized(FilledRoundedRectangle.class) {
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

            public static FilledRoundedRectangle getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<FilledRoundedRectangle> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                FilledRoundedRectangle defaultInstance = new FilledRoundedRectangle();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(FilledRoundedRectangle.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<FilledRoundedRectangle, Builder> implements FilledRoundedRectangleOrBuilder {
                private Builder() {
                    super(FilledRoundedRectangle.DEFAULT_INSTANCE);
                }

                public boolean hasRoundedRectangle() {
                    return ((FilledRoundedRectangle)this.instance).hasRoundedRectangle();
                }

                public RoundedRectangle getRoundedRectangle() {
                    return ((FilledRoundedRectangle)this.instance).getRoundedRectangle();
                }

                public Builder setRoundedRectangle(RoundedRectangle value) {
                    this.copyOnWrite();
                    ((FilledRoundedRectangle)this.instance).setRoundedRectangle(value);
                    return this;
                }

                public Builder setRoundedRectangle(RoundedRectangle.Builder builderForValue) {
                    this.copyOnWrite();
                    ((FilledRoundedRectangle)this.instance).setRoundedRectangle((RoundedRectangle)builderForValue.build());
                    return this;
                }

                public Builder mergeRoundedRectangle(RoundedRectangle value) {
                    this.copyOnWrite();
                    ((FilledRoundedRectangle)this.instance).mergeRoundedRectangle(value);
                    return this;
                }

                public Builder clearRoundedRectangle() {
                    this.copyOnWrite();
                    ((FilledRoundedRectangle)this.instance).clearRoundedRectangle();
                    return this;
                }

                public boolean hasFillColor() {
                    return ((FilledRoundedRectangle)this.instance).hasFillColor();
                }

                public Color getFillColor() {
                    return ((FilledRoundedRectangle)this.instance).getFillColor();
                }

                public Builder setFillColor(Color value) {
                    this.copyOnWrite();
                    ((FilledRoundedRectangle)this.instance).setFillColor(value);
                    return this;
                }

                public Builder setFillColor(Color.Builder builderForValue) {
                    this.copyOnWrite();
                    ((FilledRoundedRectangle)this.instance).setFillColor((Color)builderForValue.build());
                    return this;
                }

                public Builder mergeFillColor(Color value) {
                    this.copyOnWrite();
                    ((FilledRoundedRectangle)this.instance).mergeFillColor(value);
                    return this;
                }

                public Builder clearFillColor() {
                    this.copyOnWrite();
                    ((FilledRoundedRectangle)this.instance).clearFillColor();
                    return this;
                }
            }
        }

        public interface FilledRoundedRectangleOrBuilder extends MessageLiteOrBuilder {
            boolean hasRoundedRectangle();

            RoundedRectangle getRoundedRectangle();

            boolean hasFillColor();

            Color getFillColor();
        }

        public static final class RoundedRectangle extends GeneratedMessageLite<RoundedRectangle, RoundedRectangle.Builder> implements RoundedRectangleOrBuilder {
            private int bitField0_;
            public static final int RECTANGLE_FIELD_NUMBER = 1;
            private Rectangle rectangle_;
            public static final int CORNER_RADIUS_FIELD_NUMBER = 2;
            private int cornerRadius_;
            public static final int LINE_TYPE_FIELD_NUMBER = 3;
            private int lineType_ = 4;
            private static final RoundedRectangle DEFAULT_INSTANCE;
            private static volatile Parser<RoundedRectangle> PARSER;

            private RoundedRectangle() {
            }

            public boolean hasRectangle() {
                return (this.bitField0_ & 1) != 0;
            }

            public Rectangle getRectangle() {
                return this.rectangle_ == null ? Rectangle.getDefaultInstance() : this.rectangle_;
            }

            private void setRectangle(Rectangle value) {
                value.getClass();
                this.rectangle_ = value;
                this.bitField0_ |= 1;
            }

            private void mergeRectangle(Rectangle value) {
                value.getClass();
                if (this.rectangle_ != null && this.rectangle_ != Rectangle.getDefaultInstance()) {
                    this.rectangle_ = (Rectangle)((Rectangle.Builder) Rectangle.newBuilder(this.rectangle_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
                } else {
                    this.rectangle_ = value;
                }

                this.bitField0_ |= 1;
            }

            private void clearRectangle() {
                this.rectangle_ = null;
                this.bitField0_ &= -2;
            }

            public boolean hasCornerRadius() {
                return (this.bitField0_ & 2) != 0;
            }

            public int getCornerRadius() {
                return this.cornerRadius_;
            }

            private void setCornerRadius(int value) {
                this.bitField0_ |= 2;
                this.cornerRadius_ = value;
            }

            private void clearCornerRadius() {
                this.bitField0_ &= -3;
                this.cornerRadius_ = 0;
            }

            public boolean hasLineType() {
                return (this.bitField0_ & 4) != 0;
            }

            public int getLineType() {
                return this.lineType_;
            }

            private void setLineType(int value) {
                this.bitField0_ |= 4;
                this.lineType_ = value;
            }

            private void clearLineType() {
                this.bitField0_ &= -5;
                this.lineType_ = 4;
            }

            public static RoundedRectangle parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RoundedRectangle parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RoundedRectangle parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RoundedRectangle parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RoundedRectangle parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static RoundedRectangle parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static RoundedRectangle parseFrom(InputStream input) throws IOException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static RoundedRectangle parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static RoundedRectangle parseDelimitedFrom(InputStream input) throws IOException {
                return (RoundedRectangle)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static RoundedRectangle parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RoundedRectangle)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static RoundedRectangle parseFrom(CodedInputStream input) throws IOException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static RoundedRectangle parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (RoundedRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(RoundedRectangle prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new RoundedRectangle();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "rectangle_", "cornerRadius_", "lineType_"};
                        String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<RoundedRectangle> parser = PARSER;
                        if (parser == null) {
                            Class var5 = RoundedRectangle.class;
                            synchronized(RoundedRectangle.class) {
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

            public static RoundedRectangle getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<RoundedRectangle> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                RoundedRectangle defaultInstance = new RoundedRectangle();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(RoundedRectangle.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<RoundedRectangle, Builder> implements RoundedRectangleOrBuilder {
                private Builder() {
                    super(RoundedRectangle.DEFAULT_INSTANCE);
                }

                public boolean hasRectangle() {
                    return ((RoundedRectangle)this.instance).hasRectangle();
                }

                public Rectangle getRectangle() {
                    return ((RoundedRectangle)this.instance).getRectangle();
                }

                public Builder setRectangle(Rectangle value) {
                    this.copyOnWrite();
                    ((RoundedRectangle)this.instance).setRectangle(value);
                    return this;
                }

                public Builder setRectangle(Rectangle.Builder builderForValue) {
                    this.copyOnWrite();
                    ((RoundedRectangle)this.instance).setRectangle((Rectangle)builderForValue.build());
                    return this;
                }

                public Builder mergeRectangle(Rectangle value) {
                    this.copyOnWrite();
                    ((RoundedRectangle)this.instance).mergeRectangle(value);
                    return this;
                }

                public Builder clearRectangle() {
                    this.copyOnWrite();
                    ((RoundedRectangle)this.instance).clearRectangle();
                    return this;
                }

                public boolean hasCornerRadius() {
                    return ((RoundedRectangle)this.instance).hasCornerRadius();
                }

                public int getCornerRadius() {
                    return ((RoundedRectangle)this.instance).getCornerRadius();
                }

                public Builder setCornerRadius(int value) {
                    this.copyOnWrite();
                    ((RoundedRectangle)this.instance).setCornerRadius(value);
                    return this;
                }

                public Builder clearCornerRadius() {
                    this.copyOnWrite();
                    ((RoundedRectangle)this.instance).clearCornerRadius();
                    return this;
                }

                public boolean hasLineType() {
                    return ((RoundedRectangle)this.instance).hasLineType();
                }

                public int getLineType() {
                    return ((RoundedRectangle)this.instance).getLineType();
                }

                public Builder setLineType(int value) {
                    this.copyOnWrite();
                    ((RoundedRectangle)this.instance).setLineType(value);
                    return this;
                }

                public Builder clearLineType() {
                    this.copyOnWrite();
                    ((RoundedRectangle)this.instance).clearLineType();
                    return this;
                }
            }
        }

        public interface RoundedRectangleOrBuilder extends MessageLiteOrBuilder {
            boolean hasRectangle();

            Rectangle getRectangle();

            boolean hasCornerRadius();

            int getCornerRadius();

            boolean hasLineType();

            int getLineType();
        }

        public static final class FilledRectangle extends GeneratedMessageLite<FilledRectangle, FilledRectangle.Builder> implements FilledRectangleOrBuilder {
            private int bitField0_;
            public static final int RECTANGLE_FIELD_NUMBER = 1;
            private Rectangle rectangle_;
            public static final int FILL_COLOR_FIELD_NUMBER = 2;
            private Color fillColor_;
            private static final FilledRectangle DEFAULT_INSTANCE;
            private static volatile Parser<FilledRectangle> PARSER;

            private FilledRectangle() {
            }

            public boolean hasRectangle() {
                return (this.bitField0_ & 1) != 0;
            }

            public Rectangle getRectangle() {
                return this.rectangle_ == null ? Rectangle.getDefaultInstance() : this.rectangle_;
            }

            private void setRectangle(Rectangle value) {
                value.getClass();
                this.rectangle_ = value;
                this.bitField0_ |= 1;
            }

            private void mergeRectangle(Rectangle value) {
                value.getClass();
                if (this.rectangle_ != null && this.rectangle_ != Rectangle.getDefaultInstance()) {
                    this.rectangle_ = (Rectangle)((Rectangle.Builder) Rectangle.newBuilder(this.rectangle_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
                } else {
                    this.rectangle_ = value;
                }

                this.bitField0_ |= 1;
            }

            private void clearRectangle() {
                this.rectangle_ = null;
                this.bitField0_ &= -2;
            }

            public boolean hasFillColor() {
                return (this.bitField0_ & 2) != 0;
            }

            public Color getFillColor() {
                return this.fillColor_ == null ? Color.getDefaultInstance() : this.fillColor_;
            }

            private void setFillColor(Color value) {
                value.getClass();
                this.fillColor_ = value;
                this.bitField0_ |= 2;
            }

            private void mergeFillColor(Color value) {
                value.getClass();
                if (this.fillColor_ != null && this.fillColor_ != Color.getDefaultInstance()) {
                    this.fillColor_ = (Color)((Color.Builder)Color.newBuilder(this.fillColor_).mergeFrom(value)).buildPartial();
                } else {
                    this.fillColor_ = value;
                }

                this.bitField0_ |= 2;
            }

            private void clearFillColor() {
                this.fillColor_ = null;
                this.bitField0_ &= -3;
            }

            public static FilledRectangle parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledRectangle parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledRectangle parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledRectangle parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledRectangle parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FilledRectangle parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FilledRectangle parseFrom(InputStream input) throws IOException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledRectangle parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FilledRectangle parseDelimitedFrom(InputStream input) throws IOException {
                return (FilledRectangle)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledRectangle parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledRectangle)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FilledRectangle parseFrom(CodedInputStream input) throws IOException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FilledRectangle parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FilledRectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(FilledRectangle prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new FilledRectangle();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "rectangle_", "fillColor_"};
                        String info = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<FilledRectangle> parser = PARSER;
                        if (parser == null) {
                            Class var5 = FilledRectangle.class;
                            synchronized(FilledRectangle.class) {
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

            public static FilledRectangle getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<FilledRectangle> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                FilledRectangle defaultInstance = new FilledRectangle();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(FilledRectangle.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<FilledRectangle, Builder> implements FilledRectangleOrBuilder {
                private Builder() {
                    super(FilledRectangle.DEFAULT_INSTANCE);
                }

                public boolean hasRectangle() {
                    return ((FilledRectangle)this.instance).hasRectangle();
                }

                public Rectangle getRectangle() {
                    return ((FilledRectangle)this.instance).getRectangle();
                }

                public Builder setRectangle(Rectangle value) {
                    this.copyOnWrite();
                    ((FilledRectangle)this.instance).setRectangle(value);
                    return this;
                }

                public Builder setRectangle(Rectangle.Builder builderForValue) {
                    this.copyOnWrite();
                    ((FilledRectangle)this.instance).setRectangle((Rectangle)builderForValue.build());
                    return this;
                }

                public Builder mergeRectangle(Rectangle value) {
                    this.copyOnWrite();
                    ((FilledRectangle)this.instance).mergeRectangle(value);
                    return this;
                }

                public Builder clearRectangle() {
                    this.copyOnWrite();
                    ((FilledRectangle)this.instance).clearRectangle();
                    return this;
                }

                public boolean hasFillColor() {
                    return ((FilledRectangle)this.instance).hasFillColor();
                }

                public Color getFillColor() {
                    return ((FilledRectangle)this.instance).getFillColor();
                }

                public Builder setFillColor(Color value) {
                    this.copyOnWrite();
                    ((FilledRectangle)this.instance).setFillColor(value);
                    return this;
                }

                public Builder setFillColor(Color.Builder builderForValue) {
                    this.copyOnWrite();
                    ((FilledRectangle)this.instance).setFillColor((Color)builderForValue.build());
                    return this;
                }

                public Builder mergeFillColor(Color value) {
                    this.copyOnWrite();
                    ((FilledRectangle)this.instance).mergeFillColor(value);
                    return this;
                }

                public Builder clearFillColor() {
                    this.copyOnWrite();
                    ((FilledRectangle)this.instance).clearFillColor();
                    return this;
                }
            }
        }

        public interface FilledRectangleOrBuilder extends MessageLiteOrBuilder {
            boolean hasRectangle();

            Rectangle getRectangle();

            boolean hasFillColor();

            Color getFillColor();
        }

        public static final class Rectangle extends GeneratedMessageLite<Rectangle, Rectangle.Builder> implements RectangleOrBuilder {
            private int bitField0_;
            public static final int LEFT_FIELD_NUMBER = 1;
            private double left_;
            public static final int TOP_FIELD_NUMBER = 2;
            private double top_;
            public static final int RIGHT_FIELD_NUMBER = 3;
            private double right_;
            public static final int BOTTOM_FIELD_NUMBER = 4;
            private double bottom_;
            public static final int NORMALIZED_FIELD_NUMBER = 5;
            private boolean normalized_;
            public static final int ROTATION_FIELD_NUMBER = 6;
            private double rotation_;
            public static final int TOP_LEFT_THICKNESS_FIELD_NUMBER = 7;
            private double topLeftThickness_;
            private static final Rectangle DEFAULT_INSTANCE;
            private static volatile Parser<Rectangle> PARSER;

            private Rectangle() {
            }

            public boolean hasLeft() {
                return (this.bitField0_ & 1) != 0;
            }

            public double getLeft() {
                return this.left_;
            }

            private void setLeft(double value) {
                this.bitField0_ |= 1;
                this.left_ = value;
            }

            private void clearLeft() {
                this.bitField0_ &= -2;
                this.left_ = 0.0D;
            }

            public boolean hasTop() {
                return (this.bitField0_ & 2) != 0;
            }

            public double getTop() {
                return this.top_;
            }

            private void setTop(double value) {
                this.bitField0_ |= 2;
                this.top_ = value;
            }

            private void clearTop() {
                this.bitField0_ &= -3;
                this.top_ = 0.0D;
            }

            public boolean hasRight() {
                return (this.bitField0_ & 4) != 0;
            }

            public double getRight() {
                return this.right_;
            }

            private void setRight(double value) {
                this.bitField0_ |= 4;
                this.right_ = value;
            }

            private void clearRight() {
                this.bitField0_ &= -5;
                this.right_ = 0.0D;
            }

            public boolean hasBottom() {
                return (this.bitField0_ & 8) != 0;
            }

            public double getBottom() {
                return this.bottom_;
            }

            private void setBottom(double value) {
                this.bitField0_ |= 8;
                this.bottom_ = value;
            }

            private void clearBottom() {
                this.bitField0_ &= -9;
                this.bottom_ = 0.0D;
            }

            public boolean hasNormalized() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean getNormalized() {
                return this.normalized_;
            }

            private void setNormalized(boolean value) {
                this.bitField0_ |= 16;
                this.normalized_ = value;
            }

            private void clearNormalized() {
                this.bitField0_ &= -17;
                this.normalized_ = false;
            }

            public boolean hasRotation() {
                return (this.bitField0_ & 32) != 0;
            }

            public double getRotation() {
                return this.rotation_;
            }

            private void setRotation(double value) {
                this.bitField0_ |= 32;
                this.rotation_ = value;
            }

            private void clearRotation() {
                this.bitField0_ &= -33;
                this.rotation_ = 0.0D;
            }

            public boolean hasTopLeftThickness() {
                return (this.bitField0_ & 64) != 0;
            }

            public double getTopLeftThickness() {
                return this.topLeftThickness_;
            }

            private void setTopLeftThickness(double value) {
                this.bitField0_ |= 64;
                this.topLeftThickness_ = value;
            }

            private void clearTopLeftThickness() {
                this.bitField0_ &= -65;
                this.topLeftThickness_ = 0.0D;
            }

            public static Rectangle parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Rectangle parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Rectangle parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Rectangle parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Rectangle parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Rectangle parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Rectangle parseFrom(InputStream input) throws IOException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Rectangle parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Rectangle parseDelimitedFrom(InputStream input) throws IOException {
                return (Rectangle)parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Rectangle parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Rectangle)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Rectangle parseFrom(CodedInputStream input) throws IOException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Rectangle parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Rectangle)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Rectangle prototype) {
                return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
            }

            protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
                switch(method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Rectangle();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = new Object[]{"bitField0_", "left_", "top_", "right_", "bottom_", "normalized_", "rotation_", "topLeftThickness_"};
                        String info = "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005ဇ\u0004\u0006က\u0005\u0007က\u0006";
                        return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Rectangle> parser = PARSER;
                        if (parser == null) {
                            Class var5 = Rectangle.class;
                            synchronized(Rectangle.class) {
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

            public static Rectangle getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Rectangle> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            static {
                Rectangle defaultInstance = new Rectangle();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Rectangle.class, defaultInstance);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Rectangle, Builder> implements RectangleOrBuilder {
                private Builder() {
                    super(Rectangle.DEFAULT_INSTANCE);
                }

                public boolean hasLeft() {
                    return ((Rectangle)this.instance).hasLeft();
                }

                public double getLeft() {
                    return ((Rectangle)this.instance).getLeft();
                }

                public Builder setLeft(double value) {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).setLeft(value);
                    return this;
                }

                public Builder clearLeft() {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).clearLeft();
                    return this;
                }

                public boolean hasTop() {
                    return ((Rectangle)this.instance).hasTop();
                }

                public double getTop() {
                    return ((Rectangle)this.instance).getTop();
                }

                public Builder setTop(double value) {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).setTop(value);
                    return this;
                }

                public Builder clearTop() {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).clearTop();
                    return this;
                }

                public boolean hasRight() {
                    return ((Rectangle)this.instance).hasRight();
                }

                public double getRight() {
                    return ((Rectangle)this.instance).getRight();
                }

                public Builder setRight(double value) {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).setRight(value);
                    return this;
                }

                public Builder clearRight() {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).clearRight();
                    return this;
                }

                public boolean hasBottom() {
                    return ((Rectangle)this.instance).hasBottom();
                }

                public double getBottom() {
                    return ((Rectangle)this.instance).getBottom();
                }

                public Builder setBottom(double value) {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).setBottom(value);
                    return this;
                }

                public Builder clearBottom() {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).clearBottom();
                    return this;
                }

                public boolean hasNormalized() {
                    return ((Rectangle)this.instance).hasNormalized();
                }

                public boolean getNormalized() {
                    return ((Rectangle)this.instance).getNormalized();
                }

                public Builder setNormalized(boolean value) {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).setNormalized(value);
                    return this;
                }

                public Builder clearNormalized() {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).clearNormalized();
                    return this;
                }

                public boolean hasRotation() {
                    return ((Rectangle)this.instance).hasRotation();
                }

                public double getRotation() {
                    return ((Rectangle)this.instance).getRotation();
                }

                public Builder setRotation(double value) {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).setRotation(value);
                    return this;
                }

                public Builder clearRotation() {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).clearRotation();
                    return this;
                }

                public boolean hasTopLeftThickness() {
                    return ((Rectangle)this.instance).hasTopLeftThickness();
                }

                public double getTopLeftThickness() {
                    return ((Rectangle)this.instance).getTopLeftThickness();
                }

                public Builder setTopLeftThickness(double value) {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).setTopLeftThickness(value);
                    return this;
                }

                public Builder clearTopLeftThickness() {
                    this.copyOnWrite();
                    ((Rectangle)this.instance).clearTopLeftThickness();
                    return this;
                }
            }
        }

        public interface RectangleOrBuilder extends MessageLiteOrBuilder {
            boolean hasLeft();

            double getLeft();

            boolean hasTop();

            double getTop();

            boolean hasRight();

            double getRight();

            boolean hasBottom();

            double getBottom();

            boolean hasNormalized();

            boolean getNormalized();

            boolean hasRotation();

            double getRotation();

            boolean hasTopLeftThickness();

            double getTopLeftThickness();
        }
    }

    public interface RenderAnnotationOrBuilder extends MessageLiteOrBuilder {
        boolean hasRectangle();

        RenderAnnotation.Rectangle getRectangle();

        boolean hasFilledRectangle();

        RenderAnnotation.FilledRectangle getFilledRectangle();

        boolean hasOval();

        RenderAnnotation.Oval getOval();

        boolean hasFilledOval();

        RenderAnnotation.FilledOval getFilledOval();

        boolean hasPoint();

        RenderAnnotation.Point getPoint();

        boolean hasLine();

        RenderAnnotation.Line getLine();

        boolean hasArrow();

        RenderAnnotation.Arrow getArrow();

        boolean hasText();

        RenderAnnotation.Text getText();

        boolean hasRoundedRectangle();

        RenderAnnotation.RoundedRectangle getRoundedRectangle();

        boolean hasFilledRoundedRectangle();

        RenderAnnotation.FilledRoundedRectangle getFilledRoundedRectangle();

        boolean hasGradientLine();

        RenderAnnotation.GradientLine getGradientLine();

        boolean hasScribble();

        RenderAnnotation.Scribble getScribble();

        boolean hasThickness();

        double getThickness();

        boolean hasColor();

        Color getColor();

        boolean hasSceneTag();

        String getSceneTag();

        ByteString getSceneTagBytes();

        RenderAnnotation.DataCase getDataCase();
    }

    public static final class RenderData extends GeneratedMessageLite<RenderData, RenderData.Builder> implements RenderDataOrBuilder {
        private int bitField0_;
        public static final int RENDER_ANNOTATIONS_FIELD_NUMBER = 1;
        private ProtobufList<RenderAnnotation> renderAnnotations_ = emptyProtobufList();
        public static final int SCENE_CLASS_FIELD_NUMBER = 2;
        private String sceneClass_ = "";
        public static final int SCENE_VIEWPORT_FIELD_NUMBER = 3;
        private RenderViewport sceneViewport_;
        private static final RenderData DEFAULT_INSTANCE;
        private static volatile Parser<RenderData> PARSER;

        private RenderData() {
        }

        public List<RenderAnnotation> getRenderAnnotationsList() {
            return this.renderAnnotations_;
        }

        public List<? extends RenderAnnotationOrBuilder> getRenderAnnotationsOrBuilderList() {
            return this.renderAnnotations_;
        }

        public int getRenderAnnotationsCount() {
            return this.renderAnnotations_.size();
        }

        public RenderAnnotation getRenderAnnotations(int index) {
            return (RenderAnnotation)this.renderAnnotations_.get(index);
        }

        public RenderAnnotationOrBuilder getRenderAnnotationsOrBuilder(int index) {
            return (RenderAnnotationOrBuilder)this.renderAnnotations_.get(index);
        }

        private void ensureRenderAnnotationsIsMutable() {
            ProtobufList<RenderAnnotation> tmp = this.renderAnnotations_;
            if (!tmp.isModifiable()) {
                this.renderAnnotations_ = GeneratedMessageLite.mutableCopy(tmp);
            }

        }

        private void setRenderAnnotations(int index, RenderAnnotation value) {
            value.getClass();
            this.ensureRenderAnnotationsIsMutable();
            this.renderAnnotations_.set(index, value);
        }

        private void addRenderAnnotations(RenderAnnotation value) {
            value.getClass();
            this.ensureRenderAnnotationsIsMutable();
            this.renderAnnotations_.add(value);
        }

        private void addRenderAnnotations(int index, RenderAnnotation value) {
            value.getClass();
            this.ensureRenderAnnotationsIsMutable();
            this.renderAnnotations_.add(index, value);
        }

        private void addAllRenderAnnotations(Iterable<? extends RenderAnnotation> values) {
            this.ensureRenderAnnotationsIsMutable();
            AbstractMessageLite.addAll(values, this.renderAnnotations_);
        }

        private void clearRenderAnnotations() {
            this.renderAnnotations_ = emptyProtobufList();
        }

        private void removeRenderAnnotations(int index) {
            this.ensureRenderAnnotationsIsMutable();
            this.renderAnnotations_.remove(index);
        }

        public boolean hasSceneClass() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getSceneClass() {
            return this.sceneClass_;
        }

        public ByteString getSceneClassBytes() {
            return ByteString.copyFromUtf8(this.sceneClass_);
        }

        private void setSceneClass(String value) {
            Class<?> valueClass = value.getClass();
            this.bitField0_ |= 1;
            this.sceneClass_ = value;
        }

        private void clearSceneClass() {
            this.bitField0_ &= -2;
            this.sceneClass_ = getDefaultInstance().getSceneClass();
        }

        private void setSceneClassBytes(ByteString value) {
            this.sceneClass_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public boolean hasSceneViewport() {
            return (this.bitField0_ & 2) != 0;
        }

        public RenderViewport getSceneViewport() {
            return this.sceneViewport_ == null ? RenderViewport.getDefaultInstance() : this.sceneViewport_;
        }

        private void setSceneViewport(RenderViewport value) {
            value.getClass();
            this.sceneViewport_ = value;
            this.bitField0_ |= 2;
        }

        private void mergeSceneViewport(RenderViewport value) {
            value.getClass();
            if (this.sceneViewport_ != null && this.sceneViewport_ != RenderViewport.getDefaultInstance()) {
                this.sceneViewport_ = (RenderViewport)((RenderViewport.Builder) RenderViewport.newBuilder(this.sceneViewport_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
            } else {
                this.sceneViewport_ = value;
            }

            this.bitField0_ |= 2;
        }

        private void clearSceneViewport() {
            this.sceneViewport_ = null;
            this.bitField0_ &= -3;
        }

        public static RenderData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderData parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RenderData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RenderData parseFrom(InputStream input) throws IOException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RenderData parseDelimitedFrom(InputStream input) throws IOException {
            return (RenderData)parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderData)parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RenderData parseFrom(CodedInputStream input) throws IOException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RenderData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RenderData)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RenderData prototype) {
            return (Builder)DEFAULT_INSTANCE.createBuilder(prototype);
        }

        protected final Object dynamicMethod(MethodToInvoke method, Object arg0, Object arg1) {
            switch(method) {
                case NEW_MUTABLE_INSTANCE:
                    return new RenderData();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = new Object[]{"bitField0_", "renderAnnotations_", RenderAnnotation.class, "sceneClass_", "sceneViewport_"};
                    String info = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဉ\u0001";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RenderData> parser = PARSER;
                    if (parser == null) {
                        Class var5 = RenderData.class;
                        synchronized(RenderData.class) {
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

        public static RenderData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RenderData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        static {
            RenderData defaultInstance = new RenderData();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(RenderData.class, defaultInstance);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RenderData, Builder> implements RenderDataOrBuilder {
            private Builder() {
                super(RenderData.DEFAULT_INSTANCE);
            }

            public List<RenderAnnotation> getRenderAnnotationsList() {
                return Collections.unmodifiableList(((RenderData)this.instance).getRenderAnnotationsList());
            }

            public int getRenderAnnotationsCount() {
                return ((RenderData)this.instance).getRenderAnnotationsCount();
            }

            public RenderAnnotation getRenderAnnotations(int index) {
                return ((RenderData)this.instance).getRenderAnnotations(index);
            }

            public Builder setRenderAnnotations(int index, RenderAnnotation value) {
                this.copyOnWrite();
                ((RenderData)this.instance).setRenderAnnotations(index, value);
                return this;
            }

            public Builder setRenderAnnotations(int index, RenderAnnotation.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderData)this.instance).setRenderAnnotations(index, (RenderAnnotation)builderForValue.build());
                return this;
            }

            public Builder addRenderAnnotations(RenderAnnotation value) {
                this.copyOnWrite();
                ((RenderData)this.instance).addRenderAnnotations(value);
                return this;
            }

            public Builder addRenderAnnotations(int index, RenderAnnotation value) {
                this.copyOnWrite();
                ((RenderData)this.instance).addRenderAnnotations(index, value);
                return this;
            }

            public Builder addRenderAnnotations(RenderAnnotation.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderData)this.instance).addRenderAnnotations((RenderAnnotation)builderForValue.build());
                return this;
            }

            public Builder addRenderAnnotations(int index, RenderAnnotation.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderData)this.instance).addRenderAnnotations(index, (RenderAnnotation)builderForValue.build());
                return this;
            }

            public Builder addAllRenderAnnotations(Iterable<? extends RenderAnnotation> values) {
                this.copyOnWrite();
                ((RenderData)this.instance).addAllRenderAnnotations(values);
                return this;
            }

            public Builder clearRenderAnnotations() {
                this.copyOnWrite();
                ((RenderData)this.instance).clearRenderAnnotations();
                return this;
            }

            public Builder removeRenderAnnotations(int index) {
                this.copyOnWrite();
                ((RenderData)this.instance).removeRenderAnnotations(index);
                return this;
            }

            public boolean hasSceneClass() {
                return ((RenderData)this.instance).hasSceneClass();
            }

            public String getSceneClass() {
                return ((RenderData)this.instance).getSceneClass();
            }

            public ByteString getSceneClassBytes() {
                return ((RenderData)this.instance).getSceneClassBytes();
            }

            public Builder setSceneClass(String value) {
                this.copyOnWrite();
                ((RenderData)this.instance).setSceneClass(value);
                return this;
            }

            public Builder clearSceneClass() {
                this.copyOnWrite();
                ((RenderData)this.instance).clearSceneClass();
                return this;
            }

            public Builder setSceneClassBytes(ByteString value) {
                this.copyOnWrite();
                ((RenderData)this.instance).setSceneClassBytes(value);
                return this;
            }

            public boolean hasSceneViewport() {
                return ((RenderData)this.instance).hasSceneViewport();
            }

            public RenderViewport getSceneViewport() {
                return ((RenderData)this.instance).getSceneViewport();
            }

            public Builder setSceneViewport(RenderViewport value) {
                this.copyOnWrite();
                ((RenderData)this.instance).setSceneViewport(value);
                return this;
            }

            public Builder setSceneViewport(RenderViewport.Builder builderForValue) {
                this.copyOnWrite();
                ((RenderData)this.instance).setSceneViewport((RenderViewport)builderForValue.build());
                return this;
            }

            public Builder mergeSceneViewport(RenderViewport value) {
                this.copyOnWrite();
                ((RenderData)this.instance).mergeSceneViewport(value);
                return this;
            }

            public Builder clearSceneViewport() {
                this.copyOnWrite();
                ((RenderData)this.instance).clearSceneViewport();
                return this;
            }
        }
    }

    public interface RenderDataOrBuilder extends MessageLiteOrBuilder {
        List<RenderAnnotation> getRenderAnnotationsList();

        RenderAnnotation getRenderAnnotations(int index);

        int getRenderAnnotationsCount();

        boolean hasSceneClass();

        String getSceneClass();

        ByteString getSceneClassBytes();

        boolean hasSceneViewport();

        RenderViewport getSceneViewport();
    }
}
