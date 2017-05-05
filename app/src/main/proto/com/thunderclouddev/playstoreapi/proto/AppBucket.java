// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code AppBucket}
 */
public final class AppBucket extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:AppBucket)
    AppBucketOrBuilder {
  // Use AppBucket.newBuilder() to construct.
  private AppBucket(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private AppBucket(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final AppBucket defaultInstance;
  public static AppBucket getDefaultInstance() {
    return defaultInstance;
  }

  public AppBucket getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private AppBucket(
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
            bucketStartMsec_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            bucketDurationMsec_ = input.readInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              statCounters_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.StatCounters>();
              mutable_bitField0_ |= 0x00000004;
            }
            statCounters_.add(input.readMessage(com.thunderclouddev.playstoreapi.proto.StatCounters.PARSER, extensionRegistry));
            break;
          }
          case 32: {
            bitField0_ |= 0x00000004;
            operationCount_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        statCounters_ = java.util.Collections.unmodifiableList(statCounters_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AppBucket_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AppBucket_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.AppBucket.class, com.thunderclouddev.playstoreapi.proto.AppBucket.Builder.class);
  }

  public static com.google.protobuf.Parser<AppBucket> PARSER =
      new com.google.protobuf.AbstractParser<AppBucket>() {
    public AppBucket parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppBucket(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<AppBucket> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int BUCKETSTARTMSEC_FIELD_NUMBER = 1;
  private long bucketStartMsec_;
  /**
   * <code>optional int64 bucketStartMsec = 1;</code>
   */
  public boolean hasBucketStartMsec() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 bucketStartMsec = 1;</code>
   */
  public long getBucketStartMsec() {
    return bucketStartMsec_;
  }

  public static final int BUCKETDURATIONMSEC_FIELD_NUMBER = 2;
  private long bucketDurationMsec_;
  /**
   * <code>optional int64 bucketDurationMsec = 2;</code>
   */
  public boolean hasBucketDurationMsec() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 bucketDurationMsec = 2;</code>
   */
  public long getBucketDurationMsec() {
    return bucketDurationMsec_;
  }

  public static final int STATCOUNTERS_FIELD_NUMBER = 3;
  private java.util.List<com.thunderclouddev.playstoreapi.proto.StatCounters> statCounters_;
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public java.util.List<com.thunderclouddev.playstoreapi.proto.StatCounters> getStatCountersList() {
    return statCounters_;
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.StatCountersOrBuilder>
      getStatCountersOrBuilderList() {
    return statCounters_;
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public int getStatCountersCount() {
    return statCounters_.size();
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.StatCounters getStatCounters(int index) {
    return statCounters_.get(index);
  }
  /**
   * <code>repeated .StatCounters statCounters = 3;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.StatCountersOrBuilder getStatCountersOrBuilder(
      int index) {
    return statCounters_.get(index);
  }

  public static final int OPERATIONCOUNT_FIELD_NUMBER = 4;
  private long operationCount_;
  /**
   * <code>optional int64 operationCount = 4;</code>
   */
  public boolean hasOperationCount() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 operationCount = 4;</code>
   */
  public long getOperationCount() {
    return operationCount_;
  }

  private void initFields() {
    bucketStartMsec_ = 0L;
    bucketDurationMsec_ = 0L;
    statCounters_ = java.util.Collections.emptyList();
    operationCount_ = 0L;
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
      output.writeInt64(1, bucketStartMsec_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, bucketDurationMsec_);
    }
    for (int i = 0; i < statCounters_.size(); i++) {
      output.writeMessage(3, statCounters_.get(i));
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(4, operationCount_);
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
        .computeInt64Size(1, bucketStartMsec_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bucketDurationMsec_);
    }
    for (int i = 0; i < statCounters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, statCounters_.get(i));
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, operationCount_);
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

  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.AppBucket parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.AppBucket prototype) {
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
   * Protobuf type {@code AppBucket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AppBucket)
      com.thunderclouddev.playstoreapi.proto.AppBucketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AppBucket_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AppBucket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.AppBucket.class, com.thunderclouddev.playstoreapi.proto.AppBucket.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.AppBucket.newBuilder()
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
        getStatCountersFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      bucketStartMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      bucketDurationMsec_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (statCountersBuilder_ == null) {
        statCounters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        statCountersBuilder_.clear();
      }
      operationCount_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_AppBucket_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.AppBucket getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.AppBucket.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.AppBucket build() {
      com.thunderclouddev.playstoreapi.proto.AppBucket result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.AppBucket buildPartial() {
      com.thunderclouddev.playstoreapi.proto.AppBucket result = new com.thunderclouddev.playstoreapi.proto.AppBucket(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.bucketStartMsec_ = bucketStartMsec_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.bucketDurationMsec_ = bucketDurationMsec_;
      if (statCountersBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          statCounters_ = java.util.Collections.unmodifiableList(statCounters_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.statCounters_ = statCounters_;
      } else {
        result.statCounters_ = statCountersBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000004;
      }
      result.operationCount_ = operationCount_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.AppBucket) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.AppBucket)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.AppBucket other) {
      if (other == com.thunderclouddev.playstoreapi.proto.AppBucket.getDefaultInstance()) return this;
      if (other.hasBucketStartMsec()) {
        setBucketStartMsec(other.getBucketStartMsec());
      }
      if (other.hasBucketDurationMsec()) {
        setBucketDurationMsec(other.getBucketDurationMsec());
      }
      if (statCountersBuilder_ == null) {
        if (!other.statCounters_.isEmpty()) {
          if (statCounters_.isEmpty()) {
            statCounters_ = other.statCounters_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureStatCountersIsMutable();
            statCounters_.addAll(other.statCounters_);
          }
          onChanged();
        }
      } else {
        if (!other.statCounters_.isEmpty()) {
          if (statCountersBuilder_.isEmpty()) {
            statCountersBuilder_.dispose();
            statCountersBuilder_ = null;
            statCounters_ = other.statCounters_;
            bitField0_ = (bitField0_ & ~0x00000004);
            statCountersBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getStatCountersFieldBuilder() : null;
          } else {
            statCountersBuilder_.addAllMessages(other.statCounters_);
          }
        }
      }
      if (other.hasOperationCount()) {
        setOperationCount(other.getOperationCount());
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
      com.thunderclouddev.playstoreapi.proto.AppBucket parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.AppBucket) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long bucketStartMsec_ ;
    /**
     * <code>optional int64 bucketStartMsec = 1;</code>
     */
    public boolean hasBucketStartMsec() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 bucketStartMsec = 1;</code>
     */
    public long getBucketStartMsec() {
      return bucketStartMsec_;
    }
    /**
     * <code>optional int64 bucketStartMsec = 1;</code>
     */
    public Builder setBucketStartMsec(long value) {
      bitField0_ |= 0x00000001;
      bucketStartMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 bucketStartMsec = 1;</code>
     */
    public Builder clearBucketStartMsec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bucketStartMsec_ = 0L;
      onChanged();
      return this;
    }

    private long bucketDurationMsec_ ;
    /**
     * <code>optional int64 bucketDurationMsec = 2;</code>
     */
    public boolean hasBucketDurationMsec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 bucketDurationMsec = 2;</code>
     */
    public long getBucketDurationMsec() {
      return bucketDurationMsec_;
    }
    /**
     * <code>optional int64 bucketDurationMsec = 2;</code>
     */
    public Builder setBucketDurationMsec(long value) {
      bitField0_ |= 0x00000002;
      bucketDurationMsec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 bucketDurationMsec = 2;</code>
     */
    public Builder clearBucketDurationMsec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bucketDurationMsec_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.thunderclouddev.playstoreapi.proto.StatCounters> statCounters_ =
      java.util.Collections.emptyList();
    private void ensureStatCountersIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        statCounters_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.StatCounters>(statCounters_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.StatCounters, com.thunderclouddev.playstoreapi.proto.StatCounters.Builder, com.thunderclouddev.playstoreapi.proto.StatCountersOrBuilder> statCountersBuilder_;

    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.StatCounters> getStatCountersList() {
      if (statCountersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(statCounters_);
      } else {
        return statCountersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public int getStatCountersCount() {
      if (statCountersBuilder_ == null) {
        return statCounters_.size();
      } else {
        return statCountersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.StatCounters getStatCounters(int index) {
      if (statCountersBuilder_ == null) {
        return statCounters_.get(index);
      } else {
        return statCountersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder setStatCounters(
        int index, com.thunderclouddev.playstoreapi.proto.StatCounters value) {
      if (statCountersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatCountersIsMutable();
        statCounters_.set(index, value);
        onChanged();
      } else {
        statCountersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder setStatCounters(
        int index, com.thunderclouddev.playstoreapi.proto.StatCounters.Builder builderForValue) {
      if (statCountersBuilder_ == null) {
        ensureStatCountersIsMutable();
        statCounters_.set(index, builderForValue.build());
        onChanged();
      } else {
        statCountersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addStatCounters(com.thunderclouddev.playstoreapi.proto.StatCounters value) {
      if (statCountersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatCountersIsMutable();
        statCounters_.add(value);
        onChanged();
      } else {
        statCountersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addStatCounters(
        int index, com.thunderclouddev.playstoreapi.proto.StatCounters value) {
      if (statCountersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatCountersIsMutable();
        statCounters_.add(index, value);
        onChanged();
      } else {
        statCountersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addStatCounters(
        com.thunderclouddev.playstoreapi.proto.StatCounters.Builder builderForValue) {
      if (statCountersBuilder_ == null) {
        ensureStatCountersIsMutable();
        statCounters_.add(builderForValue.build());
        onChanged();
      } else {
        statCountersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addStatCounters(
        int index, com.thunderclouddev.playstoreapi.proto.StatCounters.Builder builderForValue) {
      if (statCountersBuilder_ == null) {
        ensureStatCountersIsMutable();
        statCounters_.add(index, builderForValue.build());
        onChanged();
      } else {
        statCountersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder addAllStatCounters(
        java.lang.Iterable<? extends com.thunderclouddev.playstoreapi.proto.StatCounters> values) {
      if (statCountersBuilder_ == null) {
        ensureStatCountersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, statCounters_);
        onChanged();
      } else {
        statCountersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder clearStatCounters() {
      if (statCountersBuilder_ == null) {
        statCounters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        statCountersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public Builder removeStatCounters(int index) {
      if (statCountersBuilder_ == null) {
        ensureStatCountersIsMutable();
        statCounters_.remove(index);
        onChanged();
      } else {
        statCountersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.StatCounters.Builder getStatCountersBuilder(
        int index) {
      return getStatCountersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.StatCountersOrBuilder getStatCountersOrBuilder(
        int index) {
      if (statCountersBuilder_ == null) {
        return statCounters_.get(index);  } else {
        return statCountersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.StatCountersOrBuilder>
         getStatCountersOrBuilderList() {
      if (statCountersBuilder_ != null) {
        return statCountersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(statCounters_);
      }
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.StatCounters.Builder addStatCountersBuilder() {
      return getStatCountersFieldBuilder().addBuilder(
          com.thunderclouddev.playstoreapi.proto.StatCounters.getDefaultInstance());
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.StatCounters.Builder addStatCountersBuilder(
        int index) {
      return getStatCountersFieldBuilder().addBuilder(
          index, com.thunderclouddev.playstoreapi.proto.StatCounters.getDefaultInstance());
    }
    /**
     * <code>repeated .StatCounters statCounters = 3;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.StatCounters.Builder>
         getStatCountersBuilderList() {
      return getStatCountersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.StatCounters, com.thunderclouddev.playstoreapi.proto.StatCounters.Builder, com.thunderclouddev.playstoreapi.proto.StatCountersOrBuilder>
        getStatCountersFieldBuilder() {
      if (statCountersBuilder_ == null) {
        statCountersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.StatCounters, com.thunderclouddev.playstoreapi.proto.StatCounters.Builder, com.thunderclouddev.playstoreapi.proto.StatCountersOrBuilder>(
                statCounters_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        statCounters_ = null;
      }
      return statCountersBuilder_;
    }

    private long operationCount_ ;
    /**
     * <code>optional int64 operationCount = 4;</code>
     */
    public boolean hasOperationCount() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 operationCount = 4;</code>
     */
    public long getOperationCount() {
      return operationCount_;
    }
    /**
     * <code>optional int64 operationCount = 4;</code>
     */
    public Builder setOperationCount(long value) {
      bitField0_ |= 0x00000008;
      operationCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 operationCount = 4;</code>
     */
    public Builder clearOperationCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      operationCount_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:AppBucket)
  }

  static {
    defaultInstance = new AppBucket(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:AppBucket)
}

