// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code ListResponse}
 */
public final class ListResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ListResponse)
    ListResponseOrBuilder {
  // Use ListResponse.newBuilder() to construct.
  private ListResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private ListResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final ListResponse defaultInstance;
  public static ListResponse getDefaultInstance() {
    return defaultInstance;
  }

  public ListResponse getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private ListResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              bucket_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.Bucket>();
              mutable_bitField0_ |= 0x00000001;
            }
            bucket_.add(input.readMessage(com.thunderclouddev.playstoreapi.proto.Bucket.PARSER, extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              doc_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.DocV2>();
              mutable_bitField0_ |= 0x00000002;
            }
            doc_.add(input.readMessage(com.thunderclouddev.playstoreapi.proto.DocV2.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        bucket_ = java.util.Collections.unmodifiableList(bucket_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        doc_ = java.util.Collections.unmodifiableList(doc_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.ListResponse.class, com.thunderclouddev.playstoreapi.proto.ListResponse.Builder.class);
  }

  public static com.google.protobuf.Parser<ListResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListResponse>() {
    public ListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListResponse(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ListResponse> getParserForType() {
    return PARSER;
  }

  public static final int BUCKET_FIELD_NUMBER = 1;
  private java.util.List<com.thunderclouddev.playstoreapi.proto.Bucket> bucket_;
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  public java.util.List<com.thunderclouddev.playstoreapi.proto.Bucket> getBucketList() {
    return bucket_;
  }
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.BucketOrBuilder>
      getBucketOrBuilderList() {
    return bucket_;
  }
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  public int getBucketCount() {
    return bucket_.size();
  }
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.Bucket getBucket(int index) {
    return bucket_.get(index);
  }
  /**
   * <code>repeated .Bucket bucket = 1;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.BucketOrBuilder getBucketOrBuilder(
      int index) {
    return bucket_.get(index);
  }

  public static final int DOC_FIELD_NUMBER = 2;
  private java.util.List<com.thunderclouddev.playstoreapi.proto.DocV2> doc_;
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  public java.util.List<com.thunderclouddev.playstoreapi.proto.DocV2> getDocList() {
    return doc_;
  }
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.DocV2OrBuilder>
      getDocOrBuilderList() {
    return doc_;
  }
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  public int getDocCount() {
    return doc_.size();
  }
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.DocV2 getDoc(int index) {
    return doc_.get(index);
  }
  /**
   * <code>repeated .DocV2 doc = 2;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.DocV2OrBuilder getDocOrBuilder(
      int index) {
    return doc_.get(index);
  }

  private void initFields() {
    bucket_ = java.util.Collections.emptyList();
    doc_ = java.util.Collections.emptyList();
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
    for (int i = 0; i < bucket_.size(); i++) {
      output.writeMessage(1, bucket_.get(i));
    }
    for (int i = 0; i < doc_.size(); i++) {
      output.writeMessage(2, doc_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bucket_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bucket_.get(i));
    }
    for (int i = 0; i < doc_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, doc_.get(i));
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

  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.ListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.ListResponse prototype) {
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
   * Protobuf type {@code ListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListResponse)
      com.thunderclouddev.playstoreapi.proto.ListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.ListResponse.class, com.thunderclouddev.playstoreapi.proto.ListResponse.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.ListResponse.newBuilder()
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
        getBucketFieldBuilder();
        getDocFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (bucketBuilder_ == null) {
        bucket_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bucketBuilder_.clear();
      }
      if (docBuilder_ == null) {
        doc_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        docBuilder_.clear();
      }
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_ListResponse_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.ListResponse getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.ListResponse.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.ListResponse build() {
      com.thunderclouddev.playstoreapi.proto.ListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.ListResponse buildPartial() {
      com.thunderclouddev.playstoreapi.proto.ListResponse result = new com.thunderclouddev.playstoreapi.proto.ListResponse(this);
      int from_bitField0_ = bitField0_;
      if (bucketBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          bucket_ = java.util.Collections.unmodifiableList(bucket_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bucket_ = bucket_;
      } else {
        result.bucket_ = bucketBuilder_.build();
      }
      if (docBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          doc_ = java.util.Collections.unmodifiableList(doc_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.doc_ = doc_;
      } else {
        result.doc_ = docBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.ListResponse) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.ListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.ListResponse other) {
      if (other == com.thunderclouddev.playstoreapi.proto.ListResponse.getDefaultInstance()) return this;
      if (bucketBuilder_ == null) {
        if (!other.bucket_.isEmpty()) {
          if (bucket_.isEmpty()) {
            bucket_ = other.bucket_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBucketIsMutable();
            bucket_.addAll(other.bucket_);
          }
          onChanged();
        }
      } else {
        if (!other.bucket_.isEmpty()) {
          if (bucketBuilder_.isEmpty()) {
            bucketBuilder_.dispose();
            bucketBuilder_ = null;
            bucket_ = other.bucket_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bucketBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getBucketFieldBuilder() : null;
          } else {
            bucketBuilder_.addAllMessages(other.bucket_);
          }
        }
      }
      if (docBuilder_ == null) {
        if (!other.doc_.isEmpty()) {
          if (doc_.isEmpty()) {
            doc_ = other.doc_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDocIsMutable();
            doc_.addAll(other.doc_);
          }
          onChanged();
        }
      } else {
        if (!other.doc_.isEmpty()) {
          if (docBuilder_.isEmpty()) {
            docBuilder_.dispose();
            docBuilder_ = null;
            doc_ = other.doc_;
            bitField0_ = (bitField0_ & ~0x00000002);
            docBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getDocFieldBuilder() : null;
          } else {
            docBuilder_.addAllMessages(other.doc_);
          }
        }
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
      com.thunderclouddev.playstoreapi.proto.ListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.ListResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.thunderclouddev.playstoreapi.proto.Bucket> bucket_ =
      java.util.Collections.emptyList();
    private void ensureBucketIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        bucket_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.Bucket>(bucket_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.Bucket, com.thunderclouddev.playstoreapi.proto.Bucket.Builder, com.thunderclouddev.playstoreapi.proto.BucketOrBuilder> bucketBuilder_;

    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.Bucket> getBucketList() {
      if (bucketBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bucket_);
      } else {
        return bucketBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public int getBucketCount() {
      if (bucketBuilder_ == null) {
        return bucket_.size();
      } else {
        return bucketBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Bucket getBucket(int index) {
      if (bucketBuilder_ == null) {
        return bucket_.get(index);
      } else {
        return bucketBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder setBucket(
        int index, com.thunderclouddev.playstoreapi.proto.Bucket value) {
      if (bucketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBucketIsMutable();
        bucket_.set(index, value);
        onChanged();
      } else {
        bucketBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder setBucket(
        int index, com.thunderclouddev.playstoreapi.proto.Bucket.Builder builderForValue) {
      if (bucketBuilder_ == null) {
        ensureBucketIsMutable();
        bucket_.set(index, builderForValue.build());
        onChanged();
      } else {
        bucketBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder addBucket(com.thunderclouddev.playstoreapi.proto.Bucket value) {
      if (bucketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBucketIsMutable();
        bucket_.add(value);
        onChanged();
      } else {
        bucketBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder addBucket(
        int index, com.thunderclouddev.playstoreapi.proto.Bucket value) {
      if (bucketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBucketIsMutable();
        bucket_.add(index, value);
        onChanged();
      } else {
        bucketBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder addBucket(
        com.thunderclouddev.playstoreapi.proto.Bucket.Builder builderForValue) {
      if (bucketBuilder_ == null) {
        ensureBucketIsMutable();
        bucket_.add(builderForValue.build());
        onChanged();
      } else {
        bucketBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder addBucket(
        int index, com.thunderclouddev.playstoreapi.proto.Bucket.Builder builderForValue) {
      if (bucketBuilder_ == null) {
        ensureBucketIsMutable();
        bucket_.add(index, builderForValue.build());
        onChanged();
      } else {
        bucketBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder addAllBucket(
        java.lang.Iterable<? extends com.thunderclouddev.playstoreapi.proto.Bucket> values) {
      if (bucketBuilder_ == null) {
        ensureBucketIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bucket_);
        onChanged();
      } else {
        bucketBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder clearBucket() {
      if (bucketBuilder_ == null) {
        bucket_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bucketBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public Builder removeBucket(int index) {
      if (bucketBuilder_ == null) {
        ensureBucketIsMutable();
        bucket_.remove(index);
        onChanged();
      } else {
        bucketBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Bucket.Builder getBucketBuilder(
        int index) {
      return getBucketFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.BucketOrBuilder getBucketOrBuilder(
        int index) {
      if (bucketBuilder_ == null) {
        return bucket_.get(index);  } else {
        return bucketBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.BucketOrBuilder>
         getBucketOrBuilderList() {
      if (bucketBuilder_ != null) {
        return bucketBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bucket_);
      }
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Bucket.Builder addBucketBuilder() {
      return getBucketFieldBuilder().addBuilder(
          com.thunderclouddev.playstoreapi.proto.Bucket.getDefaultInstance());
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Bucket.Builder addBucketBuilder(
        int index) {
      return getBucketFieldBuilder().addBuilder(
          index, com.thunderclouddev.playstoreapi.proto.Bucket.getDefaultInstance());
    }
    /**
     * <code>repeated .Bucket bucket = 1;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.Bucket.Builder>
         getBucketBuilderList() {
      return getBucketFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.Bucket, com.thunderclouddev.playstoreapi.proto.Bucket.Builder, com.thunderclouddev.playstoreapi.proto.BucketOrBuilder>
        getBucketFieldBuilder() {
      if (bucketBuilder_ == null) {
        bucketBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.Bucket, com.thunderclouddev.playstoreapi.proto.Bucket.Builder, com.thunderclouddev.playstoreapi.proto.BucketOrBuilder>(
                bucket_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        bucket_ = null;
      }
      return bucketBuilder_;
    }

    private java.util.List<com.thunderclouddev.playstoreapi.proto.DocV2> doc_ =
      java.util.Collections.emptyList();
    private void ensureDocIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        doc_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.DocV2>(doc_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.DocV2, com.thunderclouddev.playstoreapi.proto.DocV2.Builder, com.thunderclouddev.playstoreapi.proto.DocV2OrBuilder> docBuilder_;

    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.DocV2> getDocList() {
      if (docBuilder_ == null) {
        return java.util.Collections.unmodifiableList(doc_);
      } else {
        return docBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public int getDocCount() {
      if (docBuilder_ == null) {
        return doc_.size();
      } else {
        return docBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.DocV2 getDoc(int index) {
      if (docBuilder_ == null) {
        return doc_.get(index);
      } else {
        return docBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder setDoc(
        int index, com.thunderclouddev.playstoreapi.proto.DocV2 value) {
      if (docBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocIsMutable();
        doc_.set(index, value);
        onChanged();
      } else {
        docBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder setDoc(
        int index, com.thunderclouddev.playstoreapi.proto.DocV2.Builder builderForValue) {
      if (docBuilder_ == null) {
        ensureDocIsMutable();
        doc_.set(index, builderForValue.build());
        onChanged();
      } else {
        docBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder addDoc(com.thunderclouddev.playstoreapi.proto.DocV2 value) {
      if (docBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocIsMutable();
        doc_.add(value);
        onChanged();
      } else {
        docBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder addDoc(
        int index, com.thunderclouddev.playstoreapi.proto.DocV2 value) {
      if (docBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocIsMutable();
        doc_.add(index, value);
        onChanged();
      } else {
        docBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder addDoc(
        com.thunderclouddev.playstoreapi.proto.DocV2.Builder builderForValue) {
      if (docBuilder_ == null) {
        ensureDocIsMutable();
        doc_.add(builderForValue.build());
        onChanged();
      } else {
        docBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder addDoc(
        int index, com.thunderclouddev.playstoreapi.proto.DocV2.Builder builderForValue) {
      if (docBuilder_ == null) {
        ensureDocIsMutable();
        doc_.add(index, builderForValue.build());
        onChanged();
      } else {
        docBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder addAllDoc(
        java.lang.Iterable<? extends com.thunderclouddev.playstoreapi.proto.DocV2> values) {
      if (docBuilder_ == null) {
        ensureDocIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, doc_);
        onChanged();
      } else {
        docBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder clearDoc() {
      if (docBuilder_ == null) {
        doc_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        docBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public Builder removeDoc(int index) {
      if (docBuilder_ == null) {
        ensureDocIsMutable();
        doc_.remove(index);
        onChanged();
      } else {
        docBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.DocV2.Builder getDocBuilder(
        int index) {
      return getDocFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.DocV2OrBuilder getDocOrBuilder(
        int index) {
      if (docBuilder_ == null) {
        return doc_.get(index);  } else {
        return docBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.DocV2OrBuilder>
         getDocOrBuilderList() {
      if (docBuilder_ != null) {
        return docBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(doc_);
      }
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.DocV2.Builder addDocBuilder() {
      return getDocFieldBuilder().addBuilder(
          com.thunderclouddev.playstoreapi.proto.DocV2.getDefaultInstance());
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.DocV2.Builder addDocBuilder(
        int index) {
      return getDocFieldBuilder().addBuilder(
          index, com.thunderclouddev.playstoreapi.proto.DocV2.getDefaultInstance());
    }
    /**
     * <code>repeated .DocV2 doc = 2;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.DocV2.Builder>
         getDocBuilderList() {
      return getDocFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.DocV2, com.thunderclouddev.playstoreapi.proto.DocV2.Builder, com.thunderclouddev.playstoreapi.proto.DocV2OrBuilder>
        getDocFieldBuilder() {
      if (docBuilder_ == null) {
        docBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.DocV2, com.thunderclouddev.playstoreapi.proto.DocV2.Builder, com.thunderclouddev.playstoreapi.proto.DocV2OrBuilder>(
                doc_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        doc_ = null;
      }
      return docBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ListResponse)
  }

  static {
    defaultInstance = new ListResponse(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ListResponse)
}

