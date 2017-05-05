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
 * Protobuf type {@code BrowseLink}
 */
public final class BrowseLink extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:BrowseLink)
    BrowseLinkOrBuilder {
  // Use BrowseLink.newBuilder() to construct.
  private BrowseLink(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private BrowseLink(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final BrowseLink defaultInstance;
  public static BrowseLink getDefaultInstance() {
    return defaultInstance;
  }

  public BrowseLink getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private BrowseLink(
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
            name_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            dataUrl_ = bs;
            break;
          }
          case 34: {
            com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              subBuilder = unknownCategoryContainer_.toBuilder();
            }
            unknownCategoryContainer_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(unknownCategoryContainer_);
              unknownCategoryContainer_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
            break;
          }
          case 42: {
            Image.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = icon_.toBuilder();
            }
            icon_ = input.readMessage(Image.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(icon_);
              icon_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
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
    return GooglePlay.internal_static_BrowseLink_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_BrowseLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BrowseLink.class, Builder.class);
  }

  public static com.google.protobuf.Parser<BrowseLink> PARSER =
      new com.google.protobuf.AbstractParser<BrowseLink>() {
    public BrowseLink parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BrowseLink(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<BrowseLink> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATAURL_FIELD_NUMBER = 3;
  private Object dataUrl_;
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  public boolean hasDataUrl() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  public String getDataUrl() {
    Object ref = dataUrl_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        dataUrl_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDataUrlBytes() {
    Object ref = dataUrl_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      dataUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ICON_FIELD_NUMBER = 5;
  private Image icon_;
  /**
   * <code>optional .Image icon = 5;</code>
   */
  public boolean hasIcon() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .Image icon = 5;</code>
   */
  public Image getIcon() {
    return icon_;
  }
  /**
   * <code>optional .Image icon = 5;</code>
   */
  public ImageOrBuilder getIconOrBuilder() {
    return icon_;
  }

  public static final int UNKNOWNCATEGORYCONTAINER_FIELD_NUMBER = 4;
  private com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer unknownCategoryContainer_;
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  public boolean hasUnknownCategoryContainer() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer getUnknownCategoryContainer() {
    return unknownCategoryContainer_;
  }
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainerOrBuilder getUnknownCategoryContainerOrBuilder() {
    return unknownCategoryContainer_;
  }

  private void initFields() {
    name_ = "";
    dataUrl_ = "";
    icon_ = Image.getDefaultInstance();
    unknownCategoryContainer_ = com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.getDefaultInstance();
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
      output.writeBytes(1, getNameBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(3, getDataUrlBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, unknownCategoryContainer_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(5, icon_);
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
        .computeBytesSize(1, getNameBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getDataUrlBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, unknownCategoryContainer_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, icon_);
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

  public static BrowseLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BrowseLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BrowseLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BrowseLink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BrowseLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static BrowseLink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static BrowseLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static BrowseLink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static BrowseLink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static BrowseLink parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(BrowseLink prototype) {
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
   * Protobuf type {@code BrowseLink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BrowseLink)
      com.thunderclouddev.playstoreapi.proto.BrowseLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_BrowseLink_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_BrowseLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BrowseLink.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.BrowseLink.newBuilder()
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
        getIconFieldBuilder();
        getUnknownCategoryContainerFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      dataUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (iconBuilder_ == null) {
        icon_ = Image.getDefaultInstance();
      } else {
        iconBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      if (unknownCategoryContainerBuilder_ == null) {
        unknownCategoryContainer_ = com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.getDefaultInstance();
      } else {
        unknownCategoryContainerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_BrowseLink_descriptor;
    }

    public BrowseLink getDefaultInstanceForType() {
      return BrowseLink.getDefaultInstance();
    }

    public BrowseLink build() {
      BrowseLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public BrowseLink buildPartial() {
      BrowseLink result = new BrowseLink(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.dataUrl_ = dataUrl_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (iconBuilder_ == null) {
        result.icon_ = icon_;
      } else {
        result.icon_ = iconBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      if (unknownCategoryContainerBuilder_ == null) {
        result.unknownCategoryContainer_ = unknownCategoryContainer_;
      } else {
        result.unknownCategoryContainer_ = unknownCategoryContainerBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BrowseLink) {
        return mergeFrom((BrowseLink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BrowseLink other) {
      if (other == BrowseLink.getDefaultInstance()) return this;
      if (other.hasName()) {
        bitField0_ |= 0x00000001;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasDataUrl()) {
        bitField0_ |= 0x00000002;
        dataUrl_ = other.dataUrl_;
        onChanged();
      }
      if (other.hasIcon()) {
        mergeIcon(other.getIcon());
      }
      if (other.hasUnknownCategoryContainer()) {
        mergeUnknownCategoryContainer(other.getUnknownCategoryContainer());
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
      BrowseLink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (BrowseLink) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }

    private Object dataUrl_ = "";
    /**
     * <code>optional string dataUrl = 3;</code>
     */
    public boolean hasDataUrl() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string dataUrl = 3;</code>
     */
    public String getDataUrl() {
      Object ref = dataUrl_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          dataUrl_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string dataUrl = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDataUrlBytes() {
      Object ref = dataUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        dataUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string dataUrl = 3;</code>
     */
    public Builder setDataUrl(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      dataUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string dataUrl = 3;</code>
     */
    public Builder clearDataUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataUrl_ = getDefaultInstance().getDataUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string dataUrl = 3;</code>
     */
    public Builder setDataUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      dataUrl_ = value;
      onChanged();
      return this;
    }

    private Image icon_ = Image.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        Image, Image.Builder, ImageOrBuilder> iconBuilder_;
    /**
     * <code>optional .Image icon = 5;</code>
     */
    public boolean hasIcon() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Image icon = 5;</code>
     */
    public Image getIcon() {
      if (iconBuilder_ == null) {
        return icon_;
      } else {
        return iconBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Image icon = 5;</code>
     */
    public Builder setIcon(Image value) {
      if (iconBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        icon_ = value;
        onChanged();
      } else {
        iconBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Image icon = 5;</code>
     */
    public Builder setIcon(
        Image.Builder builderForValue) {
      if (iconBuilder_ == null) {
        icon_ = builderForValue.build();
        onChanged();
      } else {
        iconBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Image icon = 5;</code>
     */
    public Builder mergeIcon(Image value) {
      if (iconBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            icon_ != Image.getDefaultInstance()) {
          icon_ =
            Image.newBuilder(icon_).mergeFrom(value).buildPartial();
        } else {
          icon_ = value;
        }
        onChanged();
      } else {
        iconBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Image icon = 5;</code>
     */
    public Builder clearIcon() {
      if (iconBuilder_ == null) {
        icon_ = Image.getDefaultInstance();
        onChanged();
      } else {
        iconBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .Image icon = 5;</code>
     */
    public Image.Builder getIconBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getIconFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Image icon = 5;</code>
     */
    public ImageOrBuilder getIconOrBuilder() {
      if (iconBuilder_ != null) {
        return iconBuilder_.getMessageOrBuilder();
      } else {
        return icon_;
      }
    }
    /**
     * <code>optional .Image icon = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        Image, Image.Builder, ImageOrBuilder>
        getIconFieldBuilder() {
      if (iconBuilder_ == null) {
        iconBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            Image, Image.Builder, ImageOrBuilder>(
                getIcon(),
                getParentForChildren(),
                isClean());
        icon_ = null;
      }
      return iconBuilder_;
    }

    private com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer unknownCategoryContainer_ = com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer, com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.Builder, com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainerOrBuilder> unknownCategoryContainerBuilder_;
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    public boolean hasUnknownCategoryContainer() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer getUnknownCategoryContainer() {
      if (unknownCategoryContainerBuilder_ == null) {
        return unknownCategoryContainer_;
      } else {
        return unknownCategoryContainerBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    public Builder setUnknownCategoryContainer(com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer value) {
      if (unknownCategoryContainerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        unknownCategoryContainer_ = value;
        onChanged();
      } else {
        unknownCategoryContainerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    public Builder setUnknownCategoryContainer(
        com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.Builder builderForValue) {
      if (unknownCategoryContainerBuilder_ == null) {
        unknownCategoryContainer_ = builderForValue.build();
        onChanged();
      } else {
        unknownCategoryContainerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    public Builder mergeUnknownCategoryContainer(com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer value) {
      if (unknownCategoryContainerBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008) &&
            unknownCategoryContainer_ != com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.getDefaultInstance()) {
          unknownCategoryContainer_ =
            com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.newBuilder(unknownCategoryContainer_).mergeFrom(value).buildPartial();
        } else {
          unknownCategoryContainer_ = value;
        }
        onChanged();
      } else {
        unknownCategoryContainerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    public Builder clearUnknownCategoryContainer() {
      if (unknownCategoryContainerBuilder_ == null) {
        unknownCategoryContainer_ = com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.getDefaultInstance();
        onChanged();
      } else {
        unknownCategoryContainerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.Builder getUnknownCategoryContainerBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getUnknownCategoryContainerFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainerOrBuilder getUnknownCategoryContainerOrBuilder() {
      if (unknownCategoryContainerBuilder_ != null) {
        return unknownCategoryContainerBuilder_.getMessageOrBuilder();
      } else {
        return unknownCategoryContainer_;
      }
    }
    /**
     * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer, com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.Builder, com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainerOrBuilder>
        getUnknownCategoryContainerFieldBuilder() {
      if (unknownCategoryContainerBuilder_ == null) {
        unknownCategoryContainerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer, com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer.Builder, com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainerOrBuilder>(
                getUnknownCategoryContainer(),
                getParentForChildren(),
                isClean());
        unknownCategoryContainer_ = null;
      }
      return unknownCategoryContainerBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:BrowseLink)
  }

  static {
    defaultInstance = new BrowseLink(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:BrowseLink)
}

