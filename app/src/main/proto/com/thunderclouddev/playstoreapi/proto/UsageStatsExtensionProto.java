// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code UsageStatsExtensionProto}
 */
public final class UsageStatsExtensionProto extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:UsageStatsExtensionProto)
    UsageStatsExtensionProtoOrBuilder {
  // Use UsageStatsExtensionProto.newBuilder() to construct.
  private UsageStatsExtensionProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private UsageStatsExtensionProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final UsageStatsExtensionProto defaultInstance;
  public static UsageStatsExtensionProto getDefaultInstance() {
    return defaultInstance;
  }

  public UsageStatsExtensionProto getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private UsageStatsExtensionProto(
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
            com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = dataUsage_.toBuilder();
            }
            dataUsage_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataUsage_);
              dataUsage_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_UsageStatsExtensionProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_UsageStatsExtensionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.class, com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.Builder.class);
  }

  public static com.google.protobuf.Parser<UsageStatsExtensionProto> PARSER =
      new com.google.protobuf.AbstractParser<UsageStatsExtensionProto>() {
    public UsageStatsExtensionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UsageStatsExtensionProto(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<UsageStatsExtensionProto> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int DATAUSAGE_FIELD_NUMBER = 1;
  private com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto dataUsage_;
  /**
   * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
   */
  public boolean hasDataUsage() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto getDataUsage() {
    return dataUsage_;
  }
  /**
   * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProtoOrBuilder getDataUsageOrBuilder() {
    return dataUsage_;
  }

  private void initFields() {
    dataUsage_ = com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.getDefaultInstance();
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
      output.writeMessage(1, dataUsage_);
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
        .computeMessageSize(1, dataUsage_);
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

  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto prototype) {
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
   * Protobuf type {@code UsageStatsExtensionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UsageStatsExtensionProto)
      com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_UsageStatsExtensionProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_UsageStatsExtensionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.class, com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.newBuilder()
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
        getDataUsageFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (dataUsageBuilder_ == null) {
        dataUsage_ = com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.getDefaultInstance();
      } else {
        dataUsageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_UsageStatsExtensionProto_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto build() {
      com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto buildPartial() {
      com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto result = new com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (dataUsageBuilder_ == null) {
        result.dataUsage_ = dataUsage_;
      } else {
        result.dataUsage_ = dataUsageBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto other) {
      if (other == com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto.getDefaultInstance()) return this;
      if (other.hasDataUsage()) {
        mergeDataUsage(other.getDataUsage());
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
      com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.UsageStatsExtensionProto) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto dataUsage_ = com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto, com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.Builder, com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProtoOrBuilder> dataUsageBuilder_;
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    public boolean hasDataUsage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto getDataUsage() {
      if (dataUsageBuilder_ == null) {
        return dataUsage_;
      } else {
        return dataUsageBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    public Builder setDataUsage(com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto value) {
      if (dataUsageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataUsage_ = value;
        onChanged();
      } else {
        dataUsageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    public Builder setDataUsage(
        com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.Builder builderForValue) {
      if (dataUsageBuilder_ == null) {
        dataUsage_ = builderForValue.build();
        onChanged();
      } else {
        dataUsageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    public Builder mergeDataUsage(com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto value) {
      if (dataUsageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            dataUsage_ != com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.getDefaultInstance()) {
          dataUsage_ =
            com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.newBuilder(dataUsage_).mergeFrom(value).buildPartial();
        } else {
          dataUsage_ = value;
        }
        onChanged();
      } else {
        dataUsageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    public Builder clearDataUsage() {
      if (dataUsageBuilder_ == null) {
        dataUsage_ = com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.getDefaultInstance();
        onChanged();
      } else {
        dataUsageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.Builder getDataUsageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataUsageFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProtoOrBuilder getDataUsageOrBuilder() {
      if (dataUsageBuilder_ != null) {
        return dataUsageBuilder_.getMessageOrBuilder();
      } else {
        return dataUsage_;
      }
    }
    /**
     * <code>optional .AndroidDataUsageProto dataUsage = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto, com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.Builder, com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProtoOrBuilder>
        getDataUsageFieldBuilder() {
      if (dataUsageBuilder_ == null) {
        dataUsageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto, com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProto.Builder, com.thunderclouddev.playstoreapi.proto.AndroidDataUsageProtoOrBuilder>(
                getDataUsage(),
                getParentForChildren(),
                isClean());
        dataUsage_ = null;
      }
      return dataUsageBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:UsageStatsExtensionProto)
  }

  static {
    defaultInstance = new UsageStatsExtensionProto(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:UsageStatsExtensionProto)
}

