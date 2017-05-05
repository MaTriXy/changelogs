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
 * Protobuf type {@code AndroidUsageStatsReport}
 */
public final class AndroidUsageStatsReport extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:AndroidUsageStatsReport)
    AndroidUsageStatsReportOrBuilder {
  // Use AndroidUsageStatsReport.newBuilder() to construct.
  private AndroidUsageStatsReport(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AndroidUsageStatsReport(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AndroidUsageStatsReport defaultInstance;
  public static AndroidUsageStatsReport getDefaultInstance() {
    return defaultInstance;
  }

  public AndroidUsageStatsReport getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AndroidUsageStatsReport(
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
          case 8: {
            bitField0_ |= 0x00000001;
            androidId_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            loggingId_ = input.readInt64();
            break;
          }
          case 26: {
            com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = usageStats_.toBuilder();
            }
            usageStats_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(usageStats_);
              usageStats_ = subBuilder.buildPartial();
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
    return GooglePlay.internal_static_AndroidUsageStatsReport_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_AndroidUsageStatsReport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AndroidUsageStatsReport.class, Builder.class);
  }

  public static com.google.protobuf.Parser<AndroidUsageStatsReport> PARSER =
      new com.google.protobuf.AbstractParser<AndroidUsageStatsReport>() {
    public AndroidUsageStatsReport parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AndroidUsageStatsReport(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<AndroidUsageStatsReport> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int ANDROIDID_FIELD_NUMBER = 1;
  private long androidId_;
  /**
   * <code>optional int64 androidId = 1;</code>
   */
  public boolean hasAndroidId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 androidId = 1;</code>
   */
  public long getAndroidId() {
    return androidId_;
  }

  public static final int LOGGINGID_FIELD_NUMBER = 2;
  private long loggingId_;
  /**
   * <code>optional int64 loggingId = 2;</code>
   */
  public boolean hasLoggingId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 loggingId = 2;</code>
   */
  public long getLoggingId() {
    return loggingId_;
  }

  public static final int USAGESTATS_FIELD_NUMBER = 3;
  private com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto usageStats_;
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  public boolean hasUsageStats() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto getUsageStats() {
    return usageStats_;
  }
  /**
   * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProtoOrBuilder getUsageStatsOrBuilder() {
    return usageStats_;
  }

  private void initFields() {
    androidId_ = 0L;
    loggingId_ = 0L;
    usageStats_ = com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.getDefaultInstance();
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
      output.writeInt64(1, androidId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, loggingId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, usageStats_);
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
        .computeInt64Size(1, androidId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, loggingId_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, usageStats_);
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

  public static AndroidUsageStatsReport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AndroidUsageStatsReport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AndroidUsageStatsReport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AndroidUsageStatsReport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AndroidUsageStatsReport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static AndroidUsageStatsReport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static AndroidUsageStatsReport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static AndroidUsageStatsReport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static AndroidUsageStatsReport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static AndroidUsageStatsReport parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(AndroidUsageStatsReport prototype) {
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
   * Protobuf type {@code AndroidUsageStatsReport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AndroidUsageStatsReport)
      com.thunderclouddev.playstoreapi.proto.AndroidUsageStatsReportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_AndroidUsageStatsReport_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_AndroidUsageStatsReport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AndroidUsageStatsReport.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.AndroidUsageStatsReport.newBuilder()
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
        getUsageStatsFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      androidId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      loggingId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (usageStatsBuilder_ == null) {
        usageStats_ = com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.getDefaultInstance();
      } else {
        usageStatsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_AndroidUsageStatsReport_descriptor;
    }

    public AndroidUsageStatsReport getDefaultInstanceForType() {
      return AndroidUsageStatsReport.getDefaultInstance();
    }

    public AndroidUsageStatsReport build() {
      AndroidUsageStatsReport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AndroidUsageStatsReport buildPartial() {
      AndroidUsageStatsReport result = new AndroidUsageStatsReport(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.androidId_ = androidId_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.loggingId_ = loggingId_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (usageStatsBuilder_ == null) {
        result.usageStats_ = usageStats_;
      } else {
        result.usageStats_ = usageStatsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AndroidUsageStatsReport) {
        return mergeFrom((AndroidUsageStatsReport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AndroidUsageStatsReport other) {
      if (other == AndroidUsageStatsReport.getDefaultInstance()) return this;
      if (other.hasAndroidId()) {
        setAndroidId(other.getAndroidId());
      }
      if (other.hasLoggingId()) {
        setLoggingId(other.getLoggingId());
      }
      if (other.hasUsageStats()) {
        mergeUsageStats(other.getUsageStats());
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
      AndroidUsageStatsReport parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AndroidUsageStatsReport) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long androidId_ ;
    /**
     * <code>optional int64 androidId = 1;</code>
     */
    public boolean hasAndroidId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 androidId = 1;</code>
     */
    public long getAndroidId() {
      return androidId_;
    }
    /**
     * <code>optional int64 androidId = 1;</code>
     */
    public Builder setAndroidId(long value) {
      bitField0_ |= 0x00000001;
      androidId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 androidId = 1;</code>
     */
    public Builder clearAndroidId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      androidId_ = 0L;
      onChanged();
      return this;
    }

    private long loggingId_ ;
    /**
     * <code>optional int64 loggingId = 2;</code>
     */
    public boolean hasLoggingId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 loggingId = 2;</code>
     */
    public long getLoggingId() {
      return loggingId_;
    }
    /**
     * <code>optional int64 loggingId = 2;</code>
     */
    public Builder setLoggingId(long value) {
      bitField0_ |= 0x00000002;
      loggingId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 loggingId = 2;</code>
     */
    public Builder clearLoggingId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      loggingId_ = 0L;
      onChanged();
      return this;
    }

    private com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto usageStats_ = com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto, com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.Builder, com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProtoOrBuilder> usageStatsBuilder_;
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public boolean hasUsageStats() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto getUsageStats() {
      if (usageStatsBuilder_ == null) {
        return usageStats_;
      } else {
        return usageStatsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public Builder setUsageStats(com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto value) {
      if (usageStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        usageStats_ = value;
        onChanged();
      } else {
        usageStatsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public Builder setUsageStats(
        com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.Builder builderForValue) {
      if (usageStatsBuilder_ == null) {
        usageStats_ = builderForValue.build();
        onChanged();
      } else {
        usageStatsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public Builder mergeUsageStats(com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto value) {
      if (usageStatsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            usageStats_ != com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.getDefaultInstance()) {
          usageStats_ =
            com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.newBuilder(usageStats_).mergeFrom(value).buildPartial();
        } else {
          usageStats_ = value;
        }
        onChanged();
      } else {
        usageStatsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public Builder clearUsageStats() {
      if (usageStatsBuilder_ == null) {
        usageStats_ = com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.getDefaultInstance();
        onChanged();
      } else {
        usageStatsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.Builder getUsageStatsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUsageStatsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProtoOrBuilder getUsageStatsOrBuilder() {
      if (usageStatsBuilder_ != null) {
        return usageStatsBuilder_.getMessageOrBuilder();
      } else {
        return usageStats_;
      }
    }
    /**
     * <code>optional .UsageStatsExtensionProto usageStats = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto, com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.Builder, com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProtoOrBuilder>
        getUsageStatsFieldBuilder() {
      if (usageStatsBuilder_ == null) {
        usageStatsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto, com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.Builder, com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProtoOrBuilder>(
                getUsageStats(),
                getParentForChildren(),
                isClean());
        usageStats_ = null;
      }
      return usageStatsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:AndroidUsageStatsReport)
  }

  static {
    defaultInstance = new AndroidUsageStatsReport(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:AndroidUsageStatsReport)
}

