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
 * Protobuf type {@code OwnershipInfo}
 */
public final class OwnershipInfo extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:OwnershipInfo)
    OwnershipInfoOrBuilder {
  // Use OwnershipInfo.newBuilder() to construct.
  private OwnershipInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private OwnershipInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final OwnershipInfo defaultInstance;
  public static OwnershipInfo getDefaultInstance() {
    return defaultInstance;
  }

  public OwnershipInfo getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private OwnershipInfo(
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
            initiationTimestampMsec_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            validUntilTimestampMsec_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            autoRenewing_ = input.readBool();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            refundTimeoutTimestampMsec_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            postDeliveryRefundWindowMsec_ = input.readInt64();
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
    return GooglePlay.internal_static_OwnershipInfo_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_OwnershipInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            OwnershipInfo.class, Builder.class);
  }

  public static com.google.protobuf.Parser<OwnershipInfo> PARSER =
      new com.google.protobuf.AbstractParser<OwnershipInfo>() {
    public OwnershipInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OwnershipInfo(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<OwnershipInfo> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int INITIATIONTIMESTAMPMSEC_FIELD_NUMBER = 1;
  private long initiationTimestampMsec_;
  /**
   * <code>optional int64 initiationTimestampMsec = 1;</code>
   */
  public boolean hasInitiationTimestampMsec() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 initiationTimestampMsec = 1;</code>
   */
  public long getInitiationTimestampMsec() {
    return initiationTimestampMsec_;
  }

  public static final int VALIDUNTILTIMESTAMPMSEC_FIELD_NUMBER = 2;
  private long validUntilTimestampMsec_;
  /**
   * <code>optional int64 validUntilTimestampMsec = 2;</code>
   */
  public boolean hasValidUntilTimestampMsec() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 validUntilTimestampMsec = 2;</code>
   */
  public long getValidUntilTimestampMsec() {
    return validUntilTimestampMsec_;
  }

  public static final int AUTORENEWING_FIELD_NUMBER = 3;
  private boolean autoRenewing_;
  /**
   * <code>optional bool autoRenewing = 3;</code>
   */
  public boolean hasAutoRenewing() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bool autoRenewing = 3;</code>
   */
  public boolean getAutoRenewing() {
    return autoRenewing_;
  }

  public static final int REFUNDTIMEOUTTIMESTAMPMSEC_FIELD_NUMBER = 4;
  private long refundTimeoutTimestampMsec_;
  /**
   * <code>optional int64 refundTimeoutTimestampMsec = 4;</code>
   */
  public boolean hasRefundTimeoutTimestampMsec() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int64 refundTimeoutTimestampMsec = 4;</code>
   */
  public long getRefundTimeoutTimestampMsec() {
    return refundTimeoutTimestampMsec_;
  }

  public static final int POSTDELIVERYREFUNDWINDOWMSEC_FIELD_NUMBER = 5;
  private long postDeliveryRefundWindowMsec_;
  /**
   * <code>optional int64 postDeliveryRefundWindowMsec = 5;</code>
   */
  public boolean hasPostDeliveryRefundWindowMsec() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional int64 postDeliveryRefundWindowMsec = 5;</code>
   */
  public long getPostDeliveryRefundWindowMsec() {
    return postDeliveryRefundWindowMsec_;
  }

  private void initFields() {
    initiationTimestampMsec_ = 0L;
    validUntilTimestampMsec_ = 0L;
    autoRenewing_ = false;
    refundTimeoutTimestampMsec_ = 0L;
    postDeliveryRefundWindowMsec_ = 0L;
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
      output.writeInt64(1, initiationTimestampMsec_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, validUntilTimestampMsec_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(3, autoRenewing_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, refundTimeoutTimestampMsec_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt64(5, postDeliveryRefundWindowMsec_);
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
        .computeInt64Size(1, initiationTimestampMsec_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, validUntilTimestampMsec_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, autoRenewing_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, refundTimeoutTimestampMsec_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, postDeliveryRefundWindowMsec_);
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

  public static OwnershipInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static OwnershipInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static OwnershipInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static OwnershipInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static OwnershipInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static OwnershipInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static OwnershipInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static OwnershipInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static OwnershipInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static OwnershipInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(OwnershipInfo prototype) {
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
   * Protobuf type {@code OwnershipInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OwnershipInfo)
      com.thunderclouddev.playstoreapi.proto.OwnershipInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_OwnershipInfo_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_OwnershipInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OwnershipInfo.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.OwnershipInfo.newBuilder()
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
      initiationTimestampMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      validUntilTimestampMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      autoRenewing_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      refundTimeoutTimestampMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      postDeliveryRefundWindowMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_OwnershipInfo_descriptor;
    }

    public OwnershipInfo getDefaultInstanceForType() {
      return OwnershipInfo.getDefaultInstance();
    }

    public OwnershipInfo build() {
      OwnershipInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public OwnershipInfo buildPartial() {
      OwnershipInfo result = new OwnershipInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.initiationTimestampMsec_ = initiationTimestampMsec_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.validUntilTimestampMsec_ = validUntilTimestampMsec_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.autoRenewing_ = autoRenewing_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.refundTimeoutTimestampMsec_ = refundTimeoutTimestampMsec_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.postDeliveryRefundWindowMsec_ = postDeliveryRefundWindowMsec_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof OwnershipInfo) {
        return mergeFrom((OwnershipInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(OwnershipInfo other) {
      if (other == OwnershipInfo.getDefaultInstance()) return this;
      if (other.hasInitiationTimestampMsec()) {
        setInitiationTimestampMsec(other.getInitiationTimestampMsec());
      }
      if (other.hasValidUntilTimestampMsec()) {
        setValidUntilTimestampMsec(other.getValidUntilTimestampMsec());
      }
      if (other.hasAutoRenewing()) {
        setAutoRenewing(other.getAutoRenewing());
      }
      if (other.hasRefundTimeoutTimestampMsec()) {
        setRefundTimeoutTimestampMsec(other.getRefundTimeoutTimestampMsec());
      }
      if (other.hasPostDeliveryRefundWindowMsec()) {
        setPostDeliveryRefundWindowMsec(other.getPostDeliveryRefundWindowMsec());
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
      OwnershipInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (OwnershipInfo) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long initiationTimestampMsec_ ;
    /**
     * <code>optional int64 initiationTimestampMsec = 1;</code>
     */
    public boolean hasInitiationTimestampMsec() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 initiationTimestampMsec = 1;</code>
     */
    public long getInitiationTimestampMsec() {
      return initiationTimestampMsec_;
    }
    /**
     * <code>optional int64 initiationTimestampMsec = 1;</code>
     */
    public Builder setInitiationTimestampMsec(long value) {
      bitField0_ |= 0x00000001;
      initiationTimestampMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 initiationTimestampMsec = 1;</code>
     */
    public Builder clearInitiationTimestampMsec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      initiationTimestampMsec_ = 0L;
      onChanged();
      return this;
    }

    private long validUntilTimestampMsec_ ;
    /**
     * <code>optional int64 validUntilTimestampMsec = 2;</code>
     */
    public boolean hasValidUntilTimestampMsec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 validUntilTimestampMsec = 2;</code>
     */
    public long getValidUntilTimestampMsec() {
      return validUntilTimestampMsec_;
    }
    /**
     * <code>optional int64 validUntilTimestampMsec = 2;</code>
     */
    public Builder setValidUntilTimestampMsec(long value) {
      bitField0_ |= 0x00000002;
      validUntilTimestampMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 validUntilTimestampMsec = 2;</code>
     */
    public Builder clearValidUntilTimestampMsec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validUntilTimestampMsec_ = 0L;
      onChanged();
      return this;
    }

    private boolean autoRenewing_ ;
    /**
     * <code>optional bool autoRenewing = 3;</code>
     */
    public boolean hasAutoRenewing() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool autoRenewing = 3;</code>
     */
    public boolean getAutoRenewing() {
      return autoRenewing_;
    }
    /**
     * <code>optional bool autoRenewing = 3;</code>
     */
    public Builder setAutoRenewing(boolean value) {
      bitField0_ |= 0x00000004;
      autoRenewing_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool autoRenewing = 3;</code>
     */
    public Builder clearAutoRenewing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      autoRenewing_ = false;
      onChanged();
      return this;
    }

    private long refundTimeoutTimestampMsec_ ;
    /**
     * <code>optional int64 refundTimeoutTimestampMsec = 4;</code>
     */
    public boolean hasRefundTimeoutTimestampMsec() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 refundTimeoutTimestampMsec = 4;</code>
     */
    public long getRefundTimeoutTimestampMsec() {
      return refundTimeoutTimestampMsec_;
    }
    /**
     * <code>optional int64 refundTimeoutTimestampMsec = 4;</code>
     */
    public Builder setRefundTimeoutTimestampMsec(long value) {
      bitField0_ |= 0x00000008;
      refundTimeoutTimestampMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 refundTimeoutTimestampMsec = 4;</code>
     */
    public Builder clearRefundTimeoutTimestampMsec() {
      bitField0_ = (bitField0_ & ~0x00000008);
      refundTimeoutTimestampMsec_ = 0L;
      onChanged();
      return this;
    }

    private long postDeliveryRefundWindowMsec_ ;
    /**
     * <code>optional int64 postDeliveryRefundWindowMsec = 5;</code>
     */
    public boolean hasPostDeliveryRefundWindowMsec() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 postDeliveryRefundWindowMsec = 5;</code>
     */
    public long getPostDeliveryRefundWindowMsec() {
      return postDeliveryRefundWindowMsec_;
    }
    /**
     * <code>optional int64 postDeliveryRefundWindowMsec = 5;</code>
     */
    public Builder setPostDeliveryRefundWindowMsec(long value) {
      bitField0_ |= 0x00000010;
      postDeliveryRefundWindowMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 postDeliveryRefundWindowMsec = 5;</code>
     */
    public Builder clearPostDeliveryRefundWindowMsec() {
      bitField0_ = (bitField0_ & ~0x00000010);
      postDeliveryRefundWindowMsec_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:OwnershipInfo)
  }

  static {
    defaultInstance = new OwnershipInfo(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:OwnershipInfo)
}

