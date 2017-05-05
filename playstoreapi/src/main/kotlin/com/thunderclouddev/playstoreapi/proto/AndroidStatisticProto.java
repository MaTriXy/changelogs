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
 * Protobuf type {@code AndroidStatisticProto}
 */
public final class AndroidStatisticProto extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:AndroidStatisticProto)
    AndroidStatisticProtoOrBuilder {
  // Use AndroidStatisticProto.newBuilder() to construct.
  private AndroidStatisticProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AndroidStatisticProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AndroidStatisticProto defaultInstance;
  public static AndroidStatisticProto getDefaultInstance() {
    return defaultInstance;
  }

  public AndroidStatisticProto getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AndroidStatisticProto(
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
            tag_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            count_ = input.readInt32();
            break;
          }
          case 29: {
            bitField0_ |= 0x00000004;
            sum_ = input.readFloat();
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
    return GooglePlay.internal_static_AndroidStatisticProto_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_AndroidStatisticProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AndroidStatisticProto.class, Builder.class);
  }

  public static com.google.protobuf.Parser<AndroidStatisticProto> PARSER =
      new com.google.protobuf.AbstractParser<AndroidStatisticProto>() {
    public AndroidStatisticProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AndroidStatisticProto(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<AndroidStatisticProto> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int TAG_FIELD_NUMBER = 1;
  private Object tag_;
  /**
   * <code>optional string tag = 1;</code>
   */
  public boolean hasTag() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string tag = 1;</code>
   */
  public String getTag() {
    Object ref = tag_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        tag_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string tag = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTagBytes() {
    Object ref = tag_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>optional int32 count = 2;</code>
   */
  public boolean hasCount() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 count = 2;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int SUM_FIELD_NUMBER = 3;
  private float sum_;
  /**
   * <code>optional float sum = 3;</code>
   */
  public boolean hasSum() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional float sum = 3;</code>
   */
  public float getSum() {
    return sum_;
  }

  private void initFields() {
    tag_ = "";
    count_ = 0;
    sum_ = 0F;
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
      output.writeBytes(1, getTagBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, count_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeFloat(3, sum_);
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
        .computeBytesSize(1, getTagBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, sum_);
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

  public static AndroidStatisticProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AndroidStatisticProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AndroidStatisticProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AndroidStatisticProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AndroidStatisticProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static AndroidStatisticProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static AndroidStatisticProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static AndroidStatisticProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static AndroidStatisticProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static AndroidStatisticProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(AndroidStatisticProto prototype) {
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
   * Protobuf type {@code AndroidStatisticProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AndroidStatisticProto)
      com.thunderclouddev.playstoreapi.proto.AndroidStatisticProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_AndroidStatisticProto_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_AndroidStatisticProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AndroidStatisticProto.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.AndroidStatisticProto.newBuilder()
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
      tag_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      count_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      sum_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_AndroidStatisticProto_descriptor;
    }

    public AndroidStatisticProto getDefaultInstanceForType() {
      return AndroidStatisticProto.getDefaultInstance();
    }

    public AndroidStatisticProto build() {
      AndroidStatisticProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AndroidStatisticProto buildPartial() {
      AndroidStatisticProto result = new AndroidStatisticProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.tag_ = tag_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.count_ = count_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.sum_ = sum_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AndroidStatisticProto) {
        return mergeFrom((AndroidStatisticProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AndroidStatisticProto other) {
      if (other == AndroidStatisticProto.getDefaultInstance()) return this;
      if (other.hasTag()) {
        bitField0_ |= 0x00000001;
        tag_ = other.tag_;
        onChanged();
      }
      if (other.hasCount()) {
        setCount(other.getCount());
      }
      if (other.hasSum()) {
        setSum(other.getSum());
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
      AndroidStatisticProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AndroidStatisticProto) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object tag_ = "";
    /**
     * <code>optional string tag = 1;</code>
     */
    public boolean hasTag() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public String getTag() {
      Object ref = tag_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tag_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public Builder setTag(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      tag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public Builder clearTag() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      tag_ = value;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>optional int32 count = 2;</code>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>optional int32 count = 2;</code>
     */
    public Builder setCount(int value) {
      bitField0_ |= 0x00000002;
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 count = 2;</code>
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0;
      onChanged();
      return this;
    }

    private float sum_ ;
    /**
     * <code>optional float sum = 3;</code>
     */
    public boolean hasSum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional float sum = 3;</code>
     */
    public float getSum() {
      return sum_;
    }
    /**
     * <code>optional float sum = 3;</code>
     */
    public Builder setSum(float value) {
      bitField0_ |= 0x00000004;
      sum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional float sum = 3;</code>
     */
    public Builder clearSum() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sum_ = 0F;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AndroidStatisticProto)
  }

  static {
    defaultInstance = new AndroidStatisticProto(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:AndroidStatisticProto)
}

