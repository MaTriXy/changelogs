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
 * Protobuf type {@code TvEpisodeDetails}
 */
public final class TvEpisodeDetails extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:TvEpisodeDetails)
    TvEpisodeDetailsOrBuilder {
  // Use TvEpisodeDetails.newBuilder() to construct.
  private TvEpisodeDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private TvEpisodeDetails(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final TvEpisodeDetails defaultInstance;
  public static TvEpisodeDetails getDefaultInstance() {
    return defaultInstance;
  }

  public TvEpisodeDetails getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private TvEpisodeDetails(
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
            parentDetailsUrl_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            episodeIndex_ = input.readInt32();
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            releaseDate_ = bs;
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
    return GooglePlay.internal_static_TvEpisodeDetails_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_TvEpisodeDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TvEpisodeDetails.class, Builder.class);
  }

  public static com.google.protobuf.Parser<TvEpisodeDetails> PARSER =
      new com.google.protobuf.AbstractParser<TvEpisodeDetails>() {
    public TvEpisodeDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TvEpisodeDetails(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<TvEpisodeDetails> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int PARENTDETAILSURL_FIELD_NUMBER = 1;
  private Object parentDetailsUrl_;
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  public boolean hasParentDetailsUrl() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  public String getParentDetailsUrl() {
    Object ref = parentDetailsUrl_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        parentDetailsUrl_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string parentDetailsUrl = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentDetailsUrlBytes() {
    Object ref = parentDetailsUrl_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      parentDetailsUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EPISODEINDEX_FIELD_NUMBER = 2;
  private int episodeIndex_;
  /**
   * <code>optional int32 episodeIndex = 2;</code>
   */
  public boolean hasEpisodeIndex() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 episodeIndex = 2;</code>
   */
  public int getEpisodeIndex() {
    return episodeIndex_;
  }

  public static final int RELEASEDATE_FIELD_NUMBER = 3;
  private Object releaseDate_;
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  public boolean hasReleaseDate() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  public String getReleaseDate() {
    Object ref = releaseDate_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        releaseDate_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string releaseDate = 3;</code>
   */
  public com.google.protobuf.ByteString
      getReleaseDateBytes() {
    Object ref = releaseDate_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      releaseDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    parentDetailsUrl_ = "";
    episodeIndex_ = 0;
    releaseDate_ = "";
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
      output.writeBytes(1, getParentDetailsUrlBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, episodeIndex_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getReleaseDateBytes());
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
        .computeBytesSize(1, getParentDetailsUrlBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, episodeIndex_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getReleaseDateBytes());
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

  public static TvEpisodeDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TvEpisodeDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TvEpisodeDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TvEpisodeDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TvEpisodeDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static TvEpisodeDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static TvEpisodeDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static TvEpisodeDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static TvEpisodeDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static TvEpisodeDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(TvEpisodeDetails prototype) {
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
   * Protobuf type {@code TvEpisodeDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TvEpisodeDetails)
      com.thunderclouddev.playstoreapi.proto.TvEpisodeDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_TvEpisodeDetails_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_TvEpisodeDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TvEpisodeDetails.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.TvEpisodeDetails.newBuilder()
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
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      parentDetailsUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      episodeIndex_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      releaseDate_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_TvEpisodeDetails_descriptor;
    }

    public TvEpisodeDetails getDefaultInstanceForType() {
      return TvEpisodeDetails.getDefaultInstance();
    }

    public TvEpisodeDetails build() {
      TvEpisodeDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public TvEpisodeDetails buildPartial() {
      TvEpisodeDetails result = new TvEpisodeDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.parentDetailsUrl_ = parentDetailsUrl_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.episodeIndex_ = episodeIndex_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.releaseDate_ = releaseDate_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof TvEpisodeDetails) {
        return mergeFrom((TvEpisodeDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TvEpisodeDetails other) {
      if (other == TvEpisodeDetails.getDefaultInstance()) return this;
      if (other.hasParentDetailsUrl()) {
        bitField0_ |= 0x00000001;
        parentDetailsUrl_ = other.parentDetailsUrl_;
        onChanged();
      }
      if (other.hasEpisodeIndex()) {
        setEpisodeIndex(other.getEpisodeIndex());
      }
      if (other.hasReleaseDate()) {
        bitField0_ |= 0x00000004;
        releaseDate_ = other.releaseDate_;
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
      TvEpisodeDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TvEpisodeDetails) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object parentDetailsUrl_ = "";
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public boolean hasParentDetailsUrl() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public String getParentDetailsUrl() {
      Object ref = parentDetailsUrl_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          parentDetailsUrl_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentDetailsUrlBytes() {
      Object ref = parentDetailsUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        parentDetailsUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public Builder setParentDetailsUrl(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      parentDetailsUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public Builder clearParentDetailsUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      parentDetailsUrl_ = getDefaultInstance().getParentDetailsUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string parentDetailsUrl = 1;</code>
     */
    public Builder setParentDetailsUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      parentDetailsUrl_ = value;
      onChanged();
      return this;
    }

    private int episodeIndex_ ;
    /**
     * <code>optional int32 episodeIndex = 2;</code>
     */
    public boolean hasEpisodeIndex() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 episodeIndex = 2;</code>
     */
    public int getEpisodeIndex() {
      return episodeIndex_;
    }
    /**
     * <code>optional int32 episodeIndex = 2;</code>
     */
    public Builder setEpisodeIndex(int value) {
      bitField0_ |= 0x00000002;
      episodeIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 episodeIndex = 2;</code>
     */
    public Builder clearEpisodeIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      episodeIndex_ = 0;
      onChanged();
      return this;
    }

    private Object releaseDate_ = "";
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public boolean hasReleaseDate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public String getReleaseDate() {
      Object ref = releaseDate_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          releaseDate_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReleaseDateBytes() {
      Object ref = releaseDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        releaseDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public Builder setReleaseDate(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      releaseDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public Builder clearReleaseDate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      releaseDate_ = getDefaultInstance().getReleaseDate();
      onChanged();
      return this;
    }
    /**
     * <code>optional string releaseDate = 3;</code>
     */
    public Builder setReleaseDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      releaseDate_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:TvEpisodeDetails)
  }

  static {
    defaultInstance = new TvEpisodeDetails(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:TvEpisodeDetails)
}

