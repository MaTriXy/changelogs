// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code BulkDetailsRequest}
 */
public final class BulkDetailsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:BulkDetailsRequest)
    BulkDetailsRequestOrBuilder {
  // Use BulkDetailsRequest.newBuilder() to construct.
  private BulkDetailsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private BulkDetailsRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final BulkDetailsRequest defaultInstance;
  public static BulkDetailsRequest getDefaultInstance() {
    return defaultInstance;
  }

  public BulkDetailsRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private BulkDetailsRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              docid_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            docid_.add(bs);
            break;
          }
          case 16: {
            bitField0_ |= 0x00000001;
            includeChildDocs_ = input.readBool();
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
        docid_ = docid_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_BulkDetailsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_BulkDetailsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest.class, com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest.Builder.class);
  }

  public static com.google.protobuf.Parser<BulkDetailsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BulkDetailsRequest>() {
    public BulkDetailsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BulkDetailsRequest(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<BulkDetailsRequest> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int DOCID_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList docid_;
  /**
   * <code>repeated string docid = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getDocidList() {
    return docid_;
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  public int getDocidCount() {
    return docid_.size();
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  public java.lang.String getDocid(int index) {
    return docid_.get(index);
  }
  /**
   * <code>repeated string docid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDocidBytes(int index) {
    return docid_.getByteString(index);
  }

  public static final int INCLUDECHILDDOCS_FIELD_NUMBER = 2;
  private boolean includeChildDocs_;
  /**
   * <code>optional bool includeChildDocs = 2;</code>
   */
  public boolean hasIncludeChildDocs() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bool includeChildDocs = 2;</code>
   */
  public boolean getIncludeChildDocs() {
    return includeChildDocs_;
  }

  private void initFields() {
    docid_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    includeChildDocs_ = false;
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
    for (int i = 0; i < docid_.size(); i++) {
      output.writeBytes(1, docid_.getByteString(i));
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(2, includeChildDocs_);
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < docid_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(docid_.getByteString(i));
      }
      size += dataSize;
      size += 1 * getDocidList().size();
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeChildDocs_);
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

  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest prototype) {
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
   * Protobuf type {@code BulkDetailsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BulkDetailsRequest)
      com.thunderclouddev.playstoreapi.proto.BulkDetailsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_BulkDetailsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_BulkDetailsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest.class, com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest.newBuilder()
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
      docid_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      includeChildDocs_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_BulkDetailsRequest_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest build() {
      com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest buildPartial() {
      com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest result = new com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        docid_ = docid_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.docid_ = docid_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000001;
      }
      result.includeChildDocs_ = includeChildDocs_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest other) {
      if (other == com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest.getDefaultInstance()) return this;
      if (!other.docid_.isEmpty()) {
        if (docid_.isEmpty()) {
          docid_ = other.docid_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDocidIsMutable();
          docid_.addAll(other.docid_);
        }
        onChanged();
      }
      if (other.hasIncludeChildDocs()) {
        setIncludeChildDocs(other.getIncludeChildDocs());
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
      com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.BulkDetailsRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList docid_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDocidIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        docid_ = new com.google.protobuf.LazyStringArrayList(docid_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getDocidList() {
      return docid_.getUnmodifiableView();
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public int getDocidCount() {
      return docid_.size();
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public java.lang.String getDocid(int index) {
      return docid_.get(index);
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDocidBytes(int index) {
      return docid_.getByteString(index);
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder setDocid(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDocidIsMutable();
      docid_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder addDocid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDocidIsMutable();
      docid_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder addAllDocid(
        java.lang.Iterable<java.lang.String> values) {
      ensureDocidIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, docid_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder clearDocid() {
      docid_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string docid = 1;</code>
     */
    public Builder addDocidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDocidIsMutable();
      docid_.add(value);
      onChanged();
      return this;
    }

    private boolean includeChildDocs_ ;
    /**
     * <code>optional bool includeChildDocs = 2;</code>
     */
    public boolean hasIncludeChildDocs() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool includeChildDocs = 2;</code>
     */
    public boolean getIncludeChildDocs() {
      return includeChildDocs_;
    }
    /**
     * <code>optional bool includeChildDocs = 2;</code>
     */
    public Builder setIncludeChildDocs(boolean value) {
      bitField0_ |= 0x00000002;
      includeChildDocs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool includeChildDocs = 2;</code>
     */
    public Builder clearIncludeChildDocs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      includeChildDocs_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:BulkDetailsRequest)
  }

  static {
    defaultInstance = new BulkDetailsRequest(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:BulkDetailsRequest)
}

