// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code AlbumDetails}
 */
public final class AlbumDetails extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:AlbumDetails)
    AlbumDetailsOrBuilder {
  // Use AlbumDetails.newBuilder() to construct.
  private AlbumDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AlbumDetails(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AlbumDetails defaultInstance;
  public static AlbumDetails getDefaultInstance() {
    return defaultInstance;
  }

  public AlbumDetails getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AlbumDetails(
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
          case 18: {
            com.thunderclouddev.playstoreapi.proto.MusicDetails.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = details_.toBuilder();
            }
            details_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.MusicDetails.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(details_);
              details_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            com.thunderclouddev.playstoreapi.proto.ArtistDetails.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = displayArtist_.toBuilder();
            }
            displayArtist_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.ArtistDetails.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(displayArtist_);
              displayArtist_ = subBuilder.buildPartial();
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
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AlbumDetails_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AlbumDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.AlbumDetails.class, com.thunderclouddev.playstoreapi.proto.AlbumDetails.Builder.class);
  }

  public static com.google.protobuf.Parser<AlbumDetails> PARSER =
      new com.google.protobuf.AbstractParser<AlbumDetails>() {
    public AlbumDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlbumDetails(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<AlbumDetails> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string name = 1;</code>
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
   * <code>optional string name = 1;</code>
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

  public static final int DETAILS_FIELD_NUMBER = 2;
  private com.thunderclouddev.playstoreapi.proto.MusicDetails details_;
  /**
   * <code>optional .MusicDetails details = 2;</code>
   */
  public boolean hasDetails() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .MusicDetails details = 2;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.MusicDetails getDetails() {
    return details_;
  }
  /**
   * <code>optional .MusicDetails details = 2;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.MusicDetailsOrBuilder getDetailsOrBuilder() {
    return details_;
  }

  public static final int DISPLAYARTIST_FIELD_NUMBER = 3;
  private com.thunderclouddev.playstoreapi.proto.ArtistDetails displayArtist_;
  /**
   * <code>optional .ArtistDetails displayArtist = 3;</code>
   */
  public boolean hasDisplayArtist() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .ArtistDetails displayArtist = 3;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.ArtistDetails getDisplayArtist() {
    return displayArtist_;
  }
  /**
   * <code>optional .ArtistDetails displayArtist = 3;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.ArtistDetailsOrBuilder getDisplayArtistOrBuilder() {
    return displayArtist_;
  }

  private void initFields() {
    name_ = "";
    details_ = com.thunderclouddev.playstoreapi.proto.MusicDetails.getDefaultInstance();
    displayArtist_ = com.thunderclouddev.playstoreapi.proto.ArtistDetails.getDefaultInstance();
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
      output.writeMessage(2, details_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, displayArtist_);
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
        .computeMessageSize(2, details_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, displayArtist_);
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

  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AlbumDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.AlbumDetails prototype) {
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
   * Protobuf type {@code AlbumDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AlbumDetails)
      com.thunderclouddev.playstoreapi.proto.AlbumDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AlbumDetails_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AlbumDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.AlbumDetails.class, com.thunderclouddev.playstoreapi.proto.AlbumDetails.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.AlbumDetails.newBuilder()
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
        getDetailsFieldBuilder();
        getDisplayArtistFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (detailsBuilder_ == null) {
        details_ = com.thunderclouddev.playstoreapi.proto.MusicDetails.getDefaultInstance();
      } else {
        detailsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      if (displayArtistBuilder_ == null) {
        displayArtist_ = com.thunderclouddev.playstoreapi.proto.ArtistDetails.getDefaultInstance();
      } else {
        displayArtistBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AlbumDetails_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.AlbumDetails getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.AlbumDetails.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.AlbumDetails build() {
      com.thunderclouddev.playstoreapi.proto.AlbumDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.AlbumDetails buildPartial() {
      com.thunderclouddev.playstoreapi.proto.AlbumDetails result = new com.thunderclouddev.playstoreapi.proto.AlbumDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (detailsBuilder_ == null) {
        result.details_ = details_;
      } else {
        result.details_ = detailsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (displayArtistBuilder_ == null) {
        result.displayArtist_ = displayArtist_;
      } else {
        result.displayArtist_ = displayArtistBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.AlbumDetails) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.AlbumDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.AlbumDetails other) {
      if (other == com.thunderclouddev.playstoreapi.proto.AlbumDetails.getDefaultInstance()) return this;
      if (other.hasName()) {
        bitField0_ |= 0x00000001;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasDetails()) {
        mergeDetails(other.getDetails());
      }
      if (other.hasDisplayArtist()) {
        mergeDisplayArtist(other.getDisplayArtist());
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
      com.thunderclouddev.playstoreapi.proto.AlbumDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.AlbumDetails) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
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
     * <code>optional string name = 1;</code>
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
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
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

    private com.thunderclouddev.playstoreapi.proto.MusicDetails details_ = com.thunderclouddev.playstoreapi.proto.MusicDetails.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.MusicDetails, com.thunderclouddev.playstoreapi.proto.MusicDetails.Builder, com.thunderclouddev.playstoreapi.proto.MusicDetailsOrBuilder> detailsBuilder_;
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    public boolean hasDetails() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.MusicDetails getDetails() {
      if (detailsBuilder_ == null) {
        return details_;
      } else {
        return detailsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    public Builder setDetails(com.thunderclouddev.playstoreapi.proto.MusicDetails value) {
      if (detailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        details_ = value;
        onChanged();
      } else {
        detailsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    public Builder setDetails(
        com.thunderclouddev.playstoreapi.proto.MusicDetails.Builder builderForValue) {
      if (detailsBuilder_ == null) {
        details_ = builderForValue.build();
        onChanged();
      } else {
        detailsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    public Builder mergeDetails(com.thunderclouddev.playstoreapi.proto.MusicDetails value) {
      if (detailsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            details_ != com.thunderclouddev.playstoreapi.proto.MusicDetails.getDefaultInstance()) {
          details_ =
            com.thunderclouddev.playstoreapi.proto.MusicDetails.newBuilder(details_).mergeFrom(value).buildPartial();
        } else {
          details_ = value;
        }
        onChanged();
      } else {
        detailsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    public Builder clearDetails() {
      if (detailsBuilder_ == null) {
        details_ = com.thunderclouddev.playstoreapi.proto.MusicDetails.getDefaultInstance();
        onChanged();
      } else {
        detailsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.MusicDetails.Builder getDetailsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDetailsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.MusicDetailsOrBuilder getDetailsOrBuilder() {
      if (detailsBuilder_ != null) {
        return detailsBuilder_.getMessageOrBuilder();
      } else {
        return details_;
      }
    }
    /**
     * <code>optional .MusicDetails details = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.MusicDetails, com.thunderclouddev.playstoreapi.proto.MusicDetails.Builder, com.thunderclouddev.playstoreapi.proto.MusicDetailsOrBuilder>
        getDetailsFieldBuilder() {
      if (detailsBuilder_ == null) {
        detailsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.MusicDetails, com.thunderclouddev.playstoreapi.proto.MusicDetails.Builder, com.thunderclouddev.playstoreapi.proto.MusicDetailsOrBuilder>(
                getDetails(),
                getParentForChildren(),
                isClean());
        details_ = null;
      }
      return detailsBuilder_;
    }

    private com.thunderclouddev.playstoreapi.proto.ArtistDetails displayArtist_ = com.thunderclouddev.playstoreapi.proto.ArtistDetails.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.ArtistDetails, com.thunderclouddev.playstoreapi.proto.ArtistDetails.Builder, com.thunderclouddev.playstoreapi.proto.ArtistDetailsOrBuilder> displayArtistBuilder_;
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    public boolean hasDisplayArtist() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.ArtistDetails getDisplayArtist() {
      if (displayArtistBuilder_ == null) {
        return displayArtist_;
      } else {
        return displayArtistBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    public Builder setDisplayArtist(com.thunderclouddev.playstoreapi.proto.ArtistDetails value) {
      if (displayArtistBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        displayArtist_ = value;
        onChanged();
      } else {
        displayArtistBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    public Builder setDisplayArtist(
        com.thunderclouddev.playstoreapi.proto.ArtistDetails.Builder builderForValue) {
      if (displayArtistBuilder_ == null) {
        displayArtist_ = builderForValue.build();
        onChanged();
      } else {
        displayArtistBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    public Builder mergeDisplayArtist(com.thunderclouddev.playstoreapi.proto.ArtistDetails value) {
      if (displayArtistBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            displayArtist_ != com.thunderclouddev.playstoreapi.proto.ArtistDetails.getDefaultInstance()) {
          displayArtist_ =
            com.thunderclouddev.playstoreapi.proto.ArtistDetails.newBuilder(displayArtist_).mergeFrom(value).buildPartial();
        } else {
          displayArtist_ = value;
        }
        onChanged();
      } else {
        displayArtistBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    public Builder clearDisplayArtist() {
      if (displayArtistBuilder_ == null) {
        displayArtist_ = com.thunderclouddev.playstoreapi.proto.ArtistDetails.getDefaultInstance();
        onChanged();
      } else {
        displayArtistBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.ArtistDetails.Builder getDisplayArtistBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDisplayArtistFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.ArtistDetailsOrBuilder getDisplayArtistOrBuilder() {
      if (displayArtistBuilder_ != null) {
        return displayArtistBuilder_.getMessageOrBuilder();
      } else {
        return displayArtist_;
      }
    }
    /**
     * <code>optional .ArtistDetails displayArtist = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.ArtistDetails, com.thunderclouddev.playstoreapi.proto.ArtistDetails.Builder, com.thunderclouddev.playstoreapi.proto.ArtistDetailsOrBuilder>
        getDisplayArtistFieldBuilder() {
      if (displayArtistBuilder_ == null) {
        displayArtistBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.ArtistDetails, com.thunderclouddev.playstoreapi.proto.ArtistDetails.Builder, com.thunderclouddev.playstoreapi.proto.ArtistDetailsOrBuilder>(
                getDisplayArtist(),
                getParentForChildren(),
                isClean());
        displayArtist_ = null;
      }
      return displayArtistBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:AlbumDetails)
  }

  static {
    defaultInstance = new AlbumDetails(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:AlbumDetails)
}

