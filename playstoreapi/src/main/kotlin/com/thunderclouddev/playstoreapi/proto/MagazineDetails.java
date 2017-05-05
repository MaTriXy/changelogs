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
 * Protobuf type {@code MagazineDetails}
 */
public final class MagazineDetails extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:MagazineDetails)
    MagazineDetailsOrBuilder {
  // Use MagazineDetails.newBuilder() to construct.
  private MagazineDetails(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private MagazineDetails(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final MagazineDetails defaultInstance;
  public static MagazineDetails getDefaultInstance() {
    return defaultInstance;
  }

  public MagazineDetails getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private MagazineDetails(
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
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            deviceAvailabilityDescriptionHtml_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            psvDescription_ = bs;
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000008;
            deliveryFrequencyDescription_ = bs;
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
    return GooglePlay.internal_static_MagazineDetails_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_MagazineDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MagazineDetails.class, Builder.class);
  }

  public static com.google.protobuf.Parser<MagazineDetails> PARSER =
      new com.google.protobuf.AbstractParser<MagazineDetails>() {
    public MagazineDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MagazineDetails(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<MagazineDetails> getParserForType() {
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

  public static final int DEVICEAVAILABILITYDESCRIPTIONHTML_FIELD_NUMBER = 2;
  private Object deviceAvailabilityDescriptionHtml_;
  /**
   * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
   */
  public boolean hasDeviceAvailabilityDescriptionHtml() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
   */
  public String getDeviceAvailabilityDescriptionHtml() {
    Object ref = deviceAvailabilityDescriptionHtml_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        deviceAvailabilityDescriptionHtml_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceAvailabilityDescriptionHtmlBytes() {
    Object ref = deviceAvailabilityDescriptionHtml_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      deviceAvailabilityDescriptionHtml_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PSVDESCRIPTION_FIELD_NUMBER = 3;
  private Object psvDescription_;
  /**
   * <code>optional string psvDescription = 3;</code>
   */
  public boolean hasPsvDescription() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string psvDescription = 3;</code>
   */
  public String getPsvDescription() {
    Object ref = psvDescription_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        psvDescription_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string psvDescription = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPsvDescriptionBytes() {
    Object ref = psvDescription_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      psvDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELIVERYFREQUENCYDESCRIPTION_FIELD_NUMBER = 4;
  private Object deliveryFrequencyDescription_;
  /**
   * <code>optional string deliveryFrequencyDescription = 4;</code>
   */
  public boolean hasDeliveryFrequencyDescription() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional string deliveryFrequencyDescription = 4;</code>
   */
  public String getDeliveryFrequencyDescription() {
    Object ref = deliveryFrequencyDescription_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        deliveryFrequencyDescription_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string deliveryFrequencyDescription = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDeliveryFrequencyDescriptionBytes() {
    Object ref = deliveryFrequencyDescription_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      deliveryFrequencyDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    parentDetailsUrl_ = "";
    deviceAvailabilityDescriptionHtml_ = "";
    psvDescription_ = "";
    deliveryFrequencyDescription_ = "";
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
      output.writeBytes(2, getDeviceAvailabilityDescriptionHtmlBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getPsvDescriptionBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeBytes(4, getDeliveryFrequencyDescriptionBytes());
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
        .computeBytesSize(2, getDeviceAvailabilityDescriptionHtmlBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getPsvDescriptionBytes());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, getDeliveryFrequencyDescriptionBytes());
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

  public static MagazineDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MagazineDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MagazineDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MagazineDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MagazineDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static MagazineDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static MagazineDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static MagazineDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static MagazineDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static MagazineDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(MagazineDetails prototype) {
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
   * Protobuf type {@code MagazineDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MagazineDetails)
      com.thunderclouddev.playstoreapi.proto.MagazineDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_MagazineDetails_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_MagazineDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MagazineDetails.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.MagazineDetails.newBuilder()
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
      deviceAvailabilityDescriptionHtml_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      psvDescription_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      deliveryFrequencyDescription_ = "";
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_MagazineDetails_descriptor;
    }

    public MagazineDetails getDefaultInstanceForType() {
      return MagazineDetails.getDefaultInstance();
    }

    public MagazineDetails build() {
      MagazineDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public MagazineDetails buildPartial() {
      MagazineDetails result = new MagazineDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.parentDetailsUrl_ = parentDetailsUrl_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.deviceAvailabilityDescriptionHtml_ = deviceAvailabilityDescriptionHtml_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.psvDescription_ = psvDescription_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.deliveryFrequencyDescription_ = deliveryFrequencyDescription_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MagazineDetails) {
        return mergeFrom((MagazineDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MagazineDetails other) {
      if (other == MagazineDetails.getDefaultInstance()) return this;
      if (other.hasParentDetailsUrl()) {
        bitField0_ |= 0x00000001;
        parentDetailsUrl_ = other.parentDetailsUrl_;
        onChanged();
      }
      if (other.hasDeviceAvailabilityDescriptionHtml()) {
        bitField0_ |= 0x00000002;
        deviceAvailabilityDescriptionHtml_ = other.deviceAvailabilityDescriptionHtml_;
        onChanged();
      }
      if (other.hasPsvDescription()) {
        bitField0_ |= 0x00000004;
        psvDescription_ = other.psvDescription_;
        onChanged();
      }
      if (other.hasDeliveryFrequencyDescription()) {
        bitField0_ |= 0x00000008;
        deliveryFrequencyDescription_ = other.deliveryFrequencyDescription_;
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
      MagazineDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MagazineDetails) e.getUnfinishedMessage();
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

    private Object deviceAvailabilityDescriptionHtml_ = "";
    /**
     * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
     */
    public boolean hasDeviceAvailabilityDescriptionHtml() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
     */
    public String getDeviceAvailabilityDescriptionHtml() {
      Object ref = deviceAvailabilityDescriptionHtml_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceAvailabilityDescriptionHtml_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceAvailabilityDescriptionHtmlBytes() {
      Object ref = deviceAvailabilityDescriptionHtml_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        deviceAvailabilityDescriptionHtml_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
     */
    public Builder setDeviceAvailabilityDescriptionHtml(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      deviceAvailabilityDescriptionHtml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
     */
    public Builder clearDeviceAvailabilityDescriptionHtml() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deviceAvailabilityDescriptionHtml_ = getDefaultInstance().getDeviceAvailabilityDescriptionHtml();
      onChanged();
      return this;
    }
    /**
     * <code>optional string deviceAvailabilityDescriptionHtml = 2;</code>
     */
    public Builder setDeviceAvailabilityDescriptionHtmlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      deviceAvailabilityDescriptionHtml_ = value;
      onChanged();
      return this;
    }

    private Object psvDescription_ = "";
    /**
     * <code>optional string psvDescription = 3;</code>
     */
    public boolean hasPsvDescription() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string psvDescription = 3;</code>
     */
    public String getPsvDescription() {
      Object ref = psvDescription_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          psvDescription_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string psvDescription = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPsvDescriptionBytes() {
      Object ref = psvDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        psvDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string psvDescription = 3;</code>
     */
    public Builder setPsvDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      psvDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string psvDescription = 3;</code>
     */
    public Builder clearPsvDescription() {
      bitField0_ = (bitField0_ & ~0x00000004);
      psvDescription_ = getDefaultInstance().getPsvDescription();
      onChanged();
      return this;
    }
    /**
     * <code>optional string psvDescription = 3;</code>
     */
    public Builder setPsvDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      psvDescription_ = value;
      onChanged();
      return this;
    }

    private Object deliveryFrequencyDescription_ = "";
    /**
     * <code>optional string deliveryFrequencyDescription = 4;</code>
     */
    public boolean hasDeliveryFrequencyDescription() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string deliveryFrequencyDescription = 4;</code>
     */
    public String getDeliveryFrequencyDescription() {
      Object ref = deliveryFrequencyDescription_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deliveryFrequencyDescription_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string deliveryFrequencyDescription = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDeliveryFrequencyDescriptionBytes() {
      Object ref = deliveryFrequencyDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        deliveryFrequencyDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string deliveryFrequencyDescription = 4;</code>
     */
    public Builder setDeliveryFrequencyDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      deliveryFrequencyDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string deliveryFrequencyDescription = 4;</code>
     */
    public Builder clearDeliveryFrequencyDescription() {
      bitField0_ = (bitField0_ & ~0x00000008);
      deliveryFrequencyDescription_ = getDefaultInstance().getDeliveryFrequencyDescription();
      onChanged();
      return this;
    }
    /**
     * <code>optional string deliveryFrequencyDescription = 4;</code>
     */
    public Builder setDeliveryFrequencyDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      deliveryFrequencyDescription_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:MagazineDetails)
  }

  static {
    defaultInstance = new MagazineDetails(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:MagazineDetails)
}
