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
 * Protobuf type {@code UploadDeviceConfigRequest}
 */
public final class UploadDeviceConfigRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:UploadDeviceConfigRequest)
    UploadDeviceConfigRequestOrBuilder {
  // Use UploadDeviceConfigRequest.newBuilder() to construct.
  private UploadDeviceConfigRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private UploadDeviceConfigRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final UploadDeviceConfigRequest defaultInstance;
  public static UploadDeviceConfigRequest getDefaultInstance() {
    return defaultInstance;
  }

  public UploadDeviceConfigRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private UploadDeviceConfigRequest(
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
            DeviceConfigurationProto.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = deviceConfiguration_.toBuilder();
            }
            deviceConfiguration_ = input.readMessage(DeviceConfigurationProto.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(deviceConfiguration_);
              deviceConfiguration_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            manufacturer_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            gcmRegistrationId_ = bs;
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
    return GooglePlay.internal_static_UploadDeviceConfigRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_UploadDeviceConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UploadDeviceConfigRequest.class, Builder.class);
  }

  public static com.google.protobuf.Parser<UploadDeviceConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UploadDeviceConfigRequest>() {
    public UploadDeviceConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UploadDeviceConfigRequest(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<UploadDeviceConfigRequest> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int DEVICECONFIGURATION_FIELD_NUMBER = 1;
  private DeviceConfigurationProto deviceConfiguration_;
  /**
   * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
   */
  public boolean hasDeviceConfiguration() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
   */
  public DeviceConfigurationProto getDeviceConfiguration() {
    return deviceConfiguration_;
  }
  /**
   * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
   */
  public DeviceConfigurationProtoOrBuilder getDeviceConfigurationOrBuilder() {
    return deviceConfiguration_;
  }

  public static final int MANUFACTURER_FIELD_NUMBER = 2;
  private Object manufacturer_;
  /**
   * <code>optional string manufacturer = 2;</code>
   */
  public boolean hasManufacturer() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string manufacturer = 2;</code>
   */
  public String getManufacturer() {
    Object ref = manufacturer_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        manufacturer_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string manufacturer = 2;</code>
   */
  public com.google.protobuf.ByteString
      getManufacturerBytes() {
    Object ref = manufacturer_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      manufacturer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCMREGISTRATIONID_FIELD_NUMBER = 3;
  private Object gcmRegistrationId_;
  /**
   * <code>optional string gcmRegistrationId = 3;</code>
   */
  public boolean hasGcmRegistrationId() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string gcmRegistrationId = 3;</code>
   */
  public String getGcmRegistrationId() {
    Object ref = gcmRegistrationId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        gcmRegistrationId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string gcmRegistrationId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getGcmRegistrationIdBytes() {
    Object ref = gcmRegistrationId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      gcmRegistrationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    deviceConfiguration_ = DeviceConfigurationProto.getDefaultInstance();
    manufacturer_ = "";
    gcmRegistrationId_ = "";
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
      output.writeMessage(1, deviceConfiguration_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getManufacturerBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getGcmRegistrationIdBytes());
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
        .computeMessageSize(1, deviceConfiguration_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getManufacturerBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getGcmRegistrationIdBytes());
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

  public static UploadDeviceConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UploadDeviceConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UploadDeviceConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UploadDeviceConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UploadDeviceConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static UploadDeviceConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static UploadDeviceConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static UploadDeviceConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static UploadDeviceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static UploadDeviceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(UploadDeviceConfigRequest prototype) {
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
   * Protobuf type {@code UploadDeviceConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UploadDeviceConfigRequest)
      com.thunderclouddev.playstoreapi.proto.UploadDeviceConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_UploadDeviceConfigRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_UploadDeviceConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UploadDeviceConfigRequest.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.UploadDeviceConfigRequest.newBuilder()
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
        getDeviceConfigurationFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (deviceConfigurationBuilder_ == null) {
        deviceConfiguration_ = DeviceConfigurationProto.getDefaultInstance();
      } else {
        deviceConfigurationBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      manufacturer_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      gcmRegistrationId_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_UploadDeviceConfigRequest_descriptor;
    }

    public UploadDeviceConfigRequest getDefaultInstanceForType() {
      return UploadDeviceConfigRequest.getDefaultInstance();
    }

    public UploadDeviceConfigRequest build() {
      UploadDeviceConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public UploadDeviceConfigRequest buildPartial() {
      UploadDeviceConfigRequest result = new UploadDeviceConfigRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (deviceConfigurationBuilder_ == null) {
        result.deviceConfiguration_ = deviceConfiguration_;
      } else {
        result.deviceConfiguration_ = deviceConfigurationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.manufacturer_ = manufacturer_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.gcmRegistrationId_ = gcmRegistrationId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UploadDeviceConfigRequest) {
        return mergeFrom((UploadDeviceConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UploadDeviceConfigRequest other) {
      if (other == UploadDeviceConfigRequest.getDefaultInstance()) return this;
      if (other.hasDeviceConfiguration()) {
        mergeDeviceConfiguration(other.getDeviceConfiguration());
      }
      if (other.hasManufacturer()) {
        bitField0_ |= 0x00000002;
        manufacturer_ = other.manufacturer_;
        onChanged();
      }
      if (other.hasGcmRegistrationId()) {
        bitField0_ |= 0x00000004;
        gcmRegistrationId_ = other.gcmRegistrationId_;
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
      UploadDeviceConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UploadDeviceConfigRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private DeviceConfigurationProto deviceConfiguration_ = DeviceConfigurationProto.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        DeviceConfigurationProto, DeviceConfigurationProto.Builder, DeviceConfigurationProtoOrBuilder> deviceConfigurationBuilder_;
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    public boolean hasDeviceConfiguration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    public DeviceConfigurationProto getDeviceConfiguration() {
      if (deviceConfigurationBuilder_ == null) {
        return deviceConfiguration_;
      } else {
        return deviceConfigurationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    public Builder setDeviceConfiguration(DeviceConfigurationProto value) {
      if (deviceConfigurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deviceConfiguration_ = value;
        onChanged();
      } else {
        deviceConfigurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    public Builder setDeviceConfiguration(
        DeviceConfigurationProto.Builder builderForValue) {
      if (deviceConfigurationBuilder_ == null) {
        deviceConfiguration_ = builderForValue.build();
        onChanged();
      } else {
        deviceConfigurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    public Builder mergeDeviceConfiguration(DeviceConfigurationProto value) {
      if (deviceConfigurationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            deviceConfiguration_ != DeviceConfigurationProto.getDefaultInstance()) {
          deviceConfiguration_ =
            DeviceConfigurationProto.newBuilder(deviceConfiguration_).mergeFrom(value).buildPartial();
        } else {
          deviceConfiguration_ = value;
        }
        onChanged();
      } else {
        deviceConfigurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    public Builder clearDeviceConfiguration() {
      if (deviceConfigurationBuilder_ == null) {
        deviceConfiguration_ = DeviceConfigurationProto.getDefaultInstance();
        onChanged();
      } else {
        deviceConfigurationBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    public DeviceConfigurationProto.Builder getDeviceConfigurationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeviceConfigurationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    public DeviceConfigurationProtoOrBuilder getDeviceConfigurationOrBuilder() {
      if (deviceConfigurationBuilder_ != null) {
        return deviceConfigurationBuilder_.getMessageOrBuilder();
      } else {
        return deviceConfiguration_;
      }
    }
    /**
     * <code>optional .DeviceConfigurationProto deviceConfiguration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        DeviceConfigurationProto, DeviceConfigurationProto.Builder, DeviceConfigurationProtoOrBuilder>
        getDeviceConfigurationFieldBuilder() {
      if (deviceConfigurationBuilder_ == null) {
        deviceConfigurationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            DeviceConfigurationProto, DeviceConfigurationProto.Builder, DeviceConfigurationProtoOrBuilder>(
                getDeviceConfiguration(),
                getParentForChildren(),
                isClean());
        deviceConfiguration_ = null;
      }
      return deviceConfigurationBuilder_;
    }

    private Object manufacturer_ = "";
    /**
     * <code>optional string manufacturer = 2;</code>
     */
    public boolean hasManufacturer() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string manufacturer = 2;</code>
     */
    public String getManufacturer() {
      Object ref = manufacturer_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          manufacturer_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string manufacturer = 2;</code>
     */
    public com.google.protobuf.ByteString
        getManufacturerBytes() {
      Object ref = manufacturer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        manufacturer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string manufacturer = 2;</code>
     */
    public Builder setManufacturer(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      manufacturer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string manufacturer = 2;</code>
     */
    public Builder clearManufacturer() {
      bitField0_ = (bitField0_ & ~0x00000002);
      manufacturer_ = getDefaultInstance().getManufacturer();
      onChanged();
      return this;
    }
    /**
     * <code>optional string manufacturer = 2;</code>
     */
    public Builder setManufacturerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      manufacturer_ = value;
      onChanged();
      return this;
    }

    private Object gcmRegistrationId_ = "";
    /**
     * <code>optional string gcmRegistrationId = 3;</code>
     */
    public boolean hasGcmRegistrationId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string gcmRegistrationId = 3;</code>
     */
    public String getGcmRegistrationId() {
      Object ref = gcmRegistrationId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          gcmRegistrationId_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string gcmRegistrationId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGcmRegistrationIdBytes() {
      Object ref = gcmRegistrationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        gcmRegistrationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string gcmRegistrationId = 3;</code>
     */
    public Builder setGcmRegistrationId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      gcmRegistrationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string gcmRegistrationId = 3;</code>
     */
    public Builder clearGcmRegistrationId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      gcmRegistrationId_ = getDefaultInstance().getGcmRegistrationId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string gcmRegistrationId = 3;</code>
     */
    public Builder setGcmRegistrationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      gcmRegistrationId_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:UploadDeviceConfigRequest)
  }

  static {
    defaultInstance = new UploadDeviceConfigRequest(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:UploadDeviceConfigRequest)
}
