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
 * Protobuf type {@code Dependency}
 */
public final class Dependency extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Dependency)
    DependencyOrBuilder {
  // Use Dependency.newBuilder() to construct.
  private Dependency(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Dependency(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Dependency defaultInstance;
  public static Dependency getDefaultInstance() {
    return defaultInstance;
  }

  public Dependency getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Dependency(
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
            packageName_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            version_ = input.readInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000004;
            unknown4_ = input.readInt32();
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
    return GooglePlay.internal_static_Dependency_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_Dependency_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Dependency.class, Builder.class);
  }

  public static com.google.protobuf.Parser<Dependency> PARSER =
      new com.google.protobuf.AbstractParser<Dependency>() {
    public Dependency parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Dependency(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<Dependency> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int PACKAGENAME_FIELD_NUMBER = 1;
  private Object packageName_;
  /**
   * <code>optional string packageName = 1;</code>
   */
  public boolean hasPackageName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string packageName = 1;</code>
   */
  public String getPackageName() {
    Object ref = packageName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        packageName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string packageName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPackageNameBytes() {
    Object ref = packageName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      packageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_;
  /**
   * <code>optional int32 version = 2;</code>
   */
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 version = 2;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int UNKNOWN4_FIELD_NUMBER = 4;
  private int unknown4_;
  /**
   * <code>optional int32 unknown4 = 4;</code>
   */
  public boolean hasUnknown4() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 unknown4 = 4;</code>
   */
  public int getUnknown4() {
    return unknown4_;
  }

  private void initFields() {
    packageName_ = "";
    version_ = 0;
    unknown4_ = 0;
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
      output.writeBytes(1, getPackageNameBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, version_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(4, unknown4_);
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
        .computeBytesSize(1, getPackageNameBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, version_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, unknown4_);
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

  public static Dependency parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Dependency parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Dependency parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Dependency parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Dependency parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static Dependency parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static Dependency parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static Dependency parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static Dependency parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static Dependency parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(Dependency prototype) {
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
   * Protobuf type {@code Dependency}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Dependency)
      com.thunderclouddev.playstoreapi.proto.DependencyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_Dependency_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_Dependency_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Dependency.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.Dependency.newBuilder()
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
      packageName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      version_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      unknown4_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_Dependency_descriptor;
    }

    public Dependency getDefaultInstanceForType() {
      return Dependency.getDefaultInstance();
    }

    public Dependency build() {
      Dependency result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Dependency buildPartial() {
      Dependency result = new Dependency(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.packageName_ = packageName_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.version_ = version_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.unknown4_ = unknown4_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Dependency) {
        return mergeFrom((Dependency)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Dependency other) {
      if (other == Dependency.getDefaultInstance()) return this;
      if (other.hasPackageName()) {
        bitField0_ |= 0x00000001;
        packageName_ = other.packageName_;
        onChanged();
      }
      if (other.hasVersion()) {
        setVersion(other.getVersion());
      }
      if (other.hasUnknown4()) {
        setUnknown4(other.getUnknown4());
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
      Dependency parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Dependency) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object packageName_ = "";
    /**
     * <code>optional string packageName = 1;</code>
     */
    public boolean hasPackageName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public String getPackageName() {
      Object ref = packageName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          packageName_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPackageNameBytes() {
      Object ref = packageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        packageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public Builder setPackageName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      packageName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public Builder clearPackageName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      packageName_ = getDefaultInstance().getPackageName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string packageName = 1;</code>
     */
    public Builder setPackageNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      packageName_ = value;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <code>optional int32 version = 2;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 version = 2;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <code>optional int32 version = 2;</code>
     */
    public Builder setVersion(int value) {
      bitField0_ |= 0x00000002;
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 version = 2;</code>
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      version_ = 0;
      onChanged();
      return this;
    }

    private int unknown4_ ;
    /**
     * <code>optional int32 unknown4 = 4;</code>
     */
    public boolean hasUnknown4() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 unknown4 = 4;</code>
     */
    public int getUnknown4() {
      return unknown4_;
    }
    /**
     * <code>optional int32 unknown4 = 4;</code>
     */
    public Builder setUnknown4(int value) {
      bitField0_ |= 0x00000004;
      unknown4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 unknown4 = 4;</code>
     */
    public Builder clearUnknown4() {
      bitField0_ = (bitField0_ & ~0x00000004);
      unknown4_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Dependency)
  }

  static {
    defaultInstance = new Dependency(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:Dependency)
}

