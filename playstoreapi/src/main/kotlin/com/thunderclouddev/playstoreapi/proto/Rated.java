/*
 * Copyright (c) 2017.
 * Distributed under the GNU GPLv3 by David Whitman.
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * This source code is made available to help others learn. Please don't clone my app.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code Rated}
 */
public final class Rated extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Rated)
    RatedOrBuilder {
  // Use Rated.newBuilder() to construct.
  private Rated(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Rated(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Rated defaultInstance;
  public static Rated getDefaultInstance() {
    return defaultInstance;
  }

  public Rated getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Rated(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            label_ = bs;
            break;
          }
          case 18: {
            Image.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = image_.toBuilder();
            }
            image_ = input.readMessage(Image.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(image_);
              image_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            learnMoreHtmlLink_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GooglePlay.internal_static_Rated_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_Rated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Rated.class, Builder.class);
  }

  public static com.google.protobuf.Parser<Rated> PARSER =
      new com.google.protobuf.AbstractParser<Rated>() {
    public Rated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Rated(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<Rated> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int LABEL_FIELD_NUMBER = 1;
  private Object label_;
  /**
   * <code>optional string label = 1;</code>
   */
  public boolean hasLabel() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string label = 1;</code>
   */
  public String getLabel() {
    Object ref = label_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        label_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string label = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLabelBytes() {
    Object ref = label_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      label_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_FIELD_NUMBER = 2;
  private Image image_;
  /**
   * <code>optional .Image image = 2;</code>
   */
  public boolean hasImage() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .Image image = 2;</code>
   */
  public Image getImage() {
    return image_;
  }
  /**
   * <code>optional .Image image = 2;</code>
   */
  public ImageOrBuilder getImageOrBuilder() {
    return image_;
  }

  public static final int LEARNMOREHTMLLINK_FIELD_NUMBER = 4;
  private Object learnMoreHtmlLink_;
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  public boolean hasLearnMoreHtmlLink() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  public String getLearnMoreHtmlLink() {
    Object ref = learnMoreHtmlLink_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        learnMoreHtmlLink_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string learnMoreHtmlLink = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLearnMoreHtmlLinkBytes() {
    Object ref = learnMoreHtmlLink_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      learnMoreHtmlLink_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    label_ = "";
    image_ = Image.getDefaultInstance();
    learnMoreHtmlLink_ = "";
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBytes(1, getLabelBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, image_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(4, getLearnMoreHtmlLinkBytes());
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getLabelBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, image_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, getLearnMoreHtmlLinkBytes());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  protected Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static Rated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Rated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Rated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Rated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Rated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static Rated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static Rated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static Rated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static Rated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static Rated parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(Rated prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Rated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Rated)
      com.thunderclouddev.playstoreapi.proto.RatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_Rated_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_Rated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Rated.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.Rated.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getImageFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      label_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (imageBuilder_ == null) {
        image_ = Image.getDefaultInstance();
      } else {
        imageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      learnMoreHtmlLink_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_Rated_descriptor;
    }

    public Rated getDefaultInstanceForType() {
      return Rated.getDefaultInstance();
    }

    public Rated build() {
      Rated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Rated buildPartial() {
      Rated result = new Rated(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.label_ = label_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (imageBuilder_ == null) {
        result.image_ = image_;
      } else {
        result.image_ = imageBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.learnMoreHtmlLink_ = learnMoreHtmlLink_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Rated) {
        return mergeFrom((Rated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Rated other) {
      if (other == Rated.getDefaultInstance()) return this;
      if (other.hasLabel()) {
        bitField0_ |= 0x00000001;
        label_ = other.label_;
        onChanged();
      }
      if (other.hasImage()) {
        mergeImage(other.getImage());
      }
      if (other.hasLearnMoreHtmlLink()) {
        bitField0_ |= 0x00000004;
        learnMoreHtmlLink_ = other.learnMoreHtmlLink_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Rated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Rated) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object label_ = "";
    /**
     * <code>optional string label = 1;</code>
     */
    public boolean hasLabel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public String getLabel() {
      Object ref = label_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          label_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLabelBytes() {
      Object ref = label_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder setLabel(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      label_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder clearLabel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      label_ = getDefaultInstance().getLabel();
      onChanged();
      return this;
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder setLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      label_ = value;
      onChanged();
      return this;
    }

    private Image image_ = Image.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        Image, Image.Builder, ImageOrBuilder> imageBuilder_;
    /**
     * <code>optional .Image image = 2;</code>
     */
    public boolean hasImage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Image getImage() {
      if (imageBuilder_ == null) {
        return image_;
      } else {
        return imageBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Builder setImage(Image value) {
      if (imageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        image_ = value;
        onChanged();
      } else {
        imageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Builder setImage(
        Image.Builder builderForValue) {
      if (imageBuilder_ == null) {
        image_ = builderForValue.build();
        onChanged();
      } else {
        imageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Builder mergeImage(Image value) {
      if (imageBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            image_ != Image.getDefaultInstance()) {
          image_ =
            Image.newBuilder(image_).mergeFrom(value).buildPartial();
        } else {
          image_ = value;
        }
        onChanged();
      } else {
        imageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Builder clearImage() {
      if (imageBuilder_ == null) {
        image_ = Image.getDefaultInstance();
        onChanged();
      } else {
        imageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public Image.Builder getImageBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getImageFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    public ImageOrBuilder getImageOrBuilder() {
      if (imageBuilder_ != null) {
        return imageBuilder_.getMessageOrBuilder();
      } else {
        return image_;
      }
    }
    /**
     * <code>optional .Image image = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        Image, Image.Builder, ImageOrBuilder>
        getImageFieldBuilder() {
      if (imageBuilder_ == null) {
        imageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            Image, Image.Builder, ImageOrBuilder>(
                getImage(),
                getParentForChildren(),
                isClean());
        image_ = null;
      }
      return imageBuilder_;
    }

    private Object learnMoreHtmlLink_ = "";
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public boolean hasLearnMoreHtmlLink() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public String getLearnMoreHtmlLink() {
      Object ref = learnMoreHtmlLink_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          learnMoreHtmlLink_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLearnMoreHtmlLinkBytes() {
      Object ref = learnMoreHtmlLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        learnMoreHtmlLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public Builder setLearnMoreHtmlLink(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      learnMoreHtmlLink_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public Builder clearLearnMoreHtmlLink() {
      bitField0_ = (bitField0_ & ~0x00000004);
      learnMoreHtmlLink_ = getDefaultInstance().getLearnMoreHtmlLink();
      onChanged();
      return this;
    }
    /**
     * <code>optional string learnMoreHtmlLink = 4;</code>
     */
    public Builder setLearnMoreHtmlLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      learnMoreHtmlLink_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Rated)
  }

  static {
    defaultInstance = new Rated(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:Rated)
}

