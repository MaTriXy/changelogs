// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code ArtistDetails}
 */
public final class ArtistDetails extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ArtistDetails)
    ArtistDetailsOrBuilder {
  // Use ArtistDetails.newBuilder() to construct.
  private ArtistDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private ArtistDetails(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final ArtistDetails defaultInstance;
  public static ArtistDetails getDefaultInstance() {
    return defaultInstance;
  }

  public ArtistDetails getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private ArtistDetails(
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
            detailsUrl_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            name_ = bs;
            break;
          }
          case 26: {
            com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = externalLinks_.toBuilder();
            }
            externalLinks_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(externalLinks_);
              externalLinks_ = subBuilder.buildPartial();
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
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ArtistDetails_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ArtistDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.ArtistDetails.class, com.thunderclouddev.playstoreapi.proto.ArtistDetails.Builder.class);
  }

  public static com.google.protobuf.Parser<ArtistDetails> PARSER =
      new com.google.protobuf.AbstractParser<ArtistDetails>() {
    public ArtistDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ArtistDetails(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ArtistDetails> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int DETAILSURL_FIELD_NUMBER = 1;
  private java.lang.Object detailsUrl_;
  /**
   * <code>optional string detailsUrl = 1;</code>
   */
  public boolean hasDetailsUrl() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string detailsUrl = 1;</code>
   */
  public java.lang.String getDetailsUrl() {
    java.lang.Object ref = detailsUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        detailsUrl_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string detailsUrl = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDetailsUrlBytes() {
    java.lang.Object ref = detailsUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detailsUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.Object name_;
  /**
   * <code>optional string name = 2;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTERNALLINKS_FIELD_NUMBER = 3;
  private com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks externalLinks_;
  /**
   * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
   */
  public boolean hasExternalLinks() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks getExternalLinks() {
    return externalLinks_;
  }
  /**
   * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.ArtistExternalLinksOrBuilder getExternalLinksOrBuilder() {
    return externalLinks_;
  }

  private void initFields() {
    detailsUrl_ = "";
    name_ = "";
    externalLinks_ = com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.getDefaultInstance();
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
      output.writeBytes(1, getDetailsUrlBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getNameBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, externalLinks_);
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
        .computeBytesSize(1, getDetailsUrlBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNameBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, externalLinks_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.ArtistDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.ArtistDetails prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ArtistDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ArtistDetails)
      com.thunderclouddev.playstoreapi.proto.ArtistDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ArtistDetails_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ArtistDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.ArtistDetails.class, com.thunderclouddev.playstoreapi.proto.ArtistDetails.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.ArtistDetails.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getExternalLinksFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      detailsUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (externalLinksBuilder_ == null) {
        externalLinks_ = com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.getDefaultInstance();
      } else {
        externalLinksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ArtistDetails_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.ArtistDetails getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.ArtistDetails.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.ArtistDetails build() {
      com.thunderclouddev.playstoreapi.proto.ArtistDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.ArtistDetails buildPartial() {
      com.thunderclouddev.playstoreapi.proto.ArtistDetails result = new com.thunderclouddev.playstoreapi.proto.ArtistDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.detailsUrl_ = detailsUrl_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (externalLinksBuilder_ == null) {
        result.externalLinks_ = externalLinks_;
      } else {
        result.externalLinks_ = externalLinksBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.ArtistDetails) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.ArtistDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.ArtistDetails other) {
      if (other == com.thunderclouddev.playstoreapi.proto.ArtistDetails.getDefaultInstance()) return this;
      if (other.hasDetailsUrl()) {
        bitField0_ |= 0x00000001;
        detailsUrl_ = other.detailsUrl_;
        onChanged();
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000002;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasExternalLinks()) {
        mergeExternalLinks(other.getExternalLinks());
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
      com.thunderclouddev.playstoreapi.proto.ArtistDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.ArtistDetails) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object detailsUrl_ = "";
    /**
     * <code>optional string detailsUrl = 1;</code>
     */
    public boolean hasDetailsUrl() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string detailsUrl = 1;</code>
     */
    public java.lang.String getDetailsUrl() {
      java.lang.Object ref = detailsUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          detailsUrl_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string detailsUrl = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDetailsUrlBytes() {
      java.lang.Object ref = detailsUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detailsUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string detailsUrl = 1;</code>
     */
    public Builder setDetailsUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      detailsUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string detailsUrl = 1;</code>
     */
    public Builder clearDetailsUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      detailsUrl_ = getDefaultInstance().getDetailsUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string detailsUrl = 1;</code>
     */
    public Builder setDetailsUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      detailsUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }

    private com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks externalLinks_ = com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks, com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.Builder, com.thunderclouddev.playstoreapi.proto.ArtistExternalLinksOrBuilder> externalLinksBuilder_;
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    public boolean hasExternalLinks() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks getExternalLinks() {
      if (externalLinksBuilder_ == null) {
        return externalLinks_;
      } else {
        return externalLinksBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    public Builder setExternalLinks(com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks value) {
      if (externalLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        externalLinks_ = value;
        onChanged();
      } else {
        externalLinksBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    public Builder setExternalLinks(
        com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.Builder builderForValue) {
      if (externalLinksBuilder_ == null) {
        externalLinks_ = builderForValue.build();
        onChanged();
      } else {
        externalLinksBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    public Builder mergeExternalLinks(com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks value) {
      if (externalLinksBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            externalLinks_ != com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.getDefaultInstance()) {
          externalLinks_ =
            com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.newBuilder(externalLinks_).mergeFrom(value).buildPartial();
        } else {
          externalLinks_ = value;
        }
        onChanged();
      } else {
        externalLinksBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    public Builder clearExternalLinks() {
      if (externalLinksBuilder_ == null) {
        externalLinks_ = com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.getDefaultInstance();
        onChanged();
      } else {
        externalLinksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.Builder getExternalLinksBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getExternalLinksFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.ArtistExternalLinksOrBuilder getExternalLinksOrBuilder() {
      if (externalLinksBuilder_ != null) {
        return externalLinksBuilder_.getMessageOrBuilder();
      } else {
        return externalLinks_;
      }
    }
    /**
     * <code>optional .ArtistExternalLinks externalLinks = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks, com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.Builder, com.thunderclouddev.playstoreapi.proto.ArtistExternalLinksOrBuilder>
        getExternalLinksFieldBuilder() {
      if (externalLinksBuilder_ == null) {
        externalLinksBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks, com.thunderclouddev.playstoreapi.proto.ArtistExternalLinks.Builder, com.thunderclouddev.playstoreapi.proto.ArtistExternalLinksOrBuilder>(
                getExternalLinks(),
                getParentForChildren(),
                isClean());
        externalLinks_ = null;
      }
      return externalLinksBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ArtistDetails)
  }

  static {
    defaultInstance = new ArtistDetails(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ArtistDetails)
}
