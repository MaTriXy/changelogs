// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code AndroidEventProto}
 */
public final class AndroidEventProto extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:AndroidEventProto)
    AndroidEventProtoOrBuilder {
  // Use AndroidEventProto.newBuilder() to construct.
  private AndroidEventProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AndroidEventProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AndroidEventProto defaultInstance;
  public static AndroidEventProto getDefaultInstance() {
    return defaultInstance;
  }

  public AndroidEventProto getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AndroidEventProto(
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
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            value_ = bs;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            timeMsec_ = input.readInt64();
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
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AndroidEventProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AndroidEventProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.AndroidEventProto.class, com.thunderclouddev.playstoreapi.proto.AndroidEventProto.Builder.class);
  }

  public static com.google.protobuf.Parser<AndroidEventProto> PARSER =
      new com.google.protobuf.AbstractParser<AndroidEventProto>() {
    public AndroidEventProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AndroidEventProto(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<AndroidEventProto> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int TAG_FIELD_NUMBER = 1;
  private java.lang.Object tag_;
  /**
   * <code>optional string tag = 1;</code>
   */
  public boolean hasTag() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string tag = 1;</code>
   */
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
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
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private java.lang.Object value_;
  /**
   * <code>optional string value = 2;</code>
   */
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string value = 2;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMEMSEC_FIELD_NUMBER = 3;
  private long timeMsec_;
  /**
   * <code>optional int64 timeMsec = 3;</code>
   */
  public boolean hasTimeMsec() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 timeMsec = 3;</code>
   */
  public long getTimeMsec() {
    return timeMsec_;
  }

  private void initFields() {
    tag_ = "";
    value_ = "";
    timeMsec_ = 0L;
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
      output.writeBytes(2, getValueBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, timeMsec_);
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
        .computeBytesSize(2, getValueBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timeMsec_);
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

  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AndroidEventProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.AndroidEventProto prototype) {
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
   * Protobuf type {@code AndroidEventProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AndroidEventProto)
      com.thunderclouddev.playstoreapi.proto.AndroidEventProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AndroidEventProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AndroidEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.AndroidEventProto.class, com.thunderclouddev.playstoreapi.proto.AndroidEventProto.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.AndroidEventProto.newBuilder()
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
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      tag_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      timeMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AndroidEventProto_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.AndroidEventProto getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.AndroidEventProto.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.AndroidEventProto build() {
      com.thunderclouddev.playstoreapi.proto.AndroidEventProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.AndroidEventProto buildPartial() {
      com.thunderclouddev.playstoreapi.proto.AndroidEventProto result = new com.thunderclouddev.playstoreapi.proto.AndroidEventProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.tag_ = tag_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.value_ = value_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.timeMsec_ = timeMsec_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.AndroidEventProto) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.AndroidEventProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.AndroidEventProto other) {
      if (other == com.thunderclouddev.playstoreapi.proto.AndroidEventProto.getDefaultInstance()) return this;
      if (other.hasTag()) {
        bitField0_ |= 0x00000001;
        tag_ = other.tag_;
        onChanged();
      }
      if (other.hasValue()) {
        bitField0_ |= 0x00000002;
        value_ = other.value_;
        onChanged();
      }
      if (other.hasTimeMsec()) {
        setTimeMsec(other.getTimeMsec());
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
      com.thunderclouddev.playstoreapi.proto.AndroidEventProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.AndroidEventProto) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object tag_ = "";
    /**
     * <code>optional string tag = 1;</code>
     */
    public boolean hasTag() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tag_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string tag = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
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
        java.lang.String value) {
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

    private java.lang.Object value_ = "";
    /**
     * <code>optional string value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      value_ = value;
      onChanged();
      return this;
    }

    private long timeMsec_ ;
    /**
     * <code>optional int64 timeMsec = 3;</code>
     */
    public boolean hasTimeMsec() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 timeMsec = 3;</code>
     */
    public long getTimeMsec() {
      return timeMsec_;
    }
    /**
     * <code>optional int64 timeMsec = 3;</code>
     */
    public Builder setTimeMsec(long value) {
      bitField0_ |= 0x00000004;
      timeMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 timeMsec = 3;</code>
     */
    public Builder clearTimeMsec() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timeMsec_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AndroidEventProto)
  }

  static {
    defaultInstance = new AndroidEventProto(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:AndroidEventProto)
}

