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
 * Protobuf type {@code ClientLibraryState}
 */
public final class ClientLibraryState extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ClientLibraryState)
    ClientLibraryStateOrBuilder {
  // Use ClientLibraryState.newBuilder() to construct.
  private ClientLibraryState(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private ClientLibraryState(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final ClientLibraryState defaultInstance;
  public static ClientLibraryState getDefaultInstance() {
    return defaultInstance;
  }

  public ClientLibraryState getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private ClientLibraryState(
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
            corpus_ = input.readInt32();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            serverToken_ = input.readBytes();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            hashCodeSum_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            librarySize_ = input.readInt32();
            break;
          }
          case 42: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000010;
            libraryId_ = bs;
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
    return GooglePlay.internal_static_ClientLibraryState_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_ClientLibraryState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ClientLibraryState.class, Builder.class);
  }

  public static com.google.protobuf.Parser<ClientLibraryState> PARSER =
      new com.google.protobuf.AbstractParser<ClientLibraryState>() {
    public ClientLibraryState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientLibraryState(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<ClientLibraryState> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int CORPUS_FIELD_NUMBER = 1;
  private int corpus_;
  /**
   * <code>optional int32 corpus = 1;</code>
   */
  public boolean hasCorpus() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 corpus = 1;</code>
   */
  public int getCorpus() {
    return corpus_;
  }

  public static final int SERVERTOKEN_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString serverToken_;
  /**
   * <code>optional bytes serverToken = 2;</code>
   */
  public boolean hasServerToken() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional bytes serverToken = 2;</code>
   */
  public com.google.protobuf.ByteString getServerToken() {
    return serverToken_;
  }

  public static final int HASHCODESUM_FIELD_NUMBER = 3;
  private long hashCodeSum_;
  /**
   * <code>optional int64 hashCodeSum = 3;</code>
   */
  public boolean hasHashCodeSum() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 hashCodeSum = 3;</code>
   */
  public long getHashCodeSum() {
    return hashCodeSum_;
  }

  public static final int LIBRARYSIZE_FIELD_NUMBER = 4;
  private int librarySize_;
  /**
   * <code>optional int32 librarySize = 4;</code>
   */
  public boolean hasLibrarySize() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int32 librarySize = 4;</code>
   */
  public int getLibrarySize() {
    return librarySize_;
  }

  public static final int LIBRARYID_FIELD_NUMBER = 5;
  private Object libraryId_;
  /**
   * <code>optional string libraryId = 5;</code>
   */
  public boolean hasLibraryId() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional string libraryId = 5;</code>
   */
  public String getLibraryId() {
    Object ref = libraryId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        libraryId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string libraryId = 5;</code>
   */
  public com.google.protobuf.ByteString
      getLibraryIdBytes() {
    Object ref = libraryId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      libraryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    corpus_ = 0;
    serverToken_ = com.google.protobuf.ByteString.EMPTY;
    hashCodeSum_ = 0L;
    librarySize_ = 0;
    libraryId_ = "";
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
      output.writeInt32(1, corpus_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, serverToken_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, hashCodeSum_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt32(4, librarySize_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeBytes(5, getLibraryIdBytes());
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
        .computeInt32Size(1, corpus_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, serverToken_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, hashCodeSum_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, librarySize_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, getLibraryIdBytes());
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

  public static ClientLibraryState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClientLibraryState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClientLibraryState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClientLibraryState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClientLibraryState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static ClientLibraryState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static ClientLibraryState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static ClientLibraryState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static ClientLibraryState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static ClientLibraryState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(ClientLibraryState prototype) {
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
   * Protobuf type {@code ClientLibraryState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientLibraryState)
      com.thunderclouddev.playstoreapi.proto.ClientLibraryStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_ClientLibraryState_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_ClientLibraryState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ClientLibraryState.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.ClientLibraryState.newBuilder()
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
      corpus_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      serverToken_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      hashCodeSum_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      librarySize_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      libraryId_ = "";
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_ClientLibraryState_descriptor;
    }

    public ClientLibraryState getDefaultInstanceForType() {
      return ClientLibraryState.getDefaultInstance();
    }

    public ClientLibraryState build() {
      ClientLibraryState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ClientLibraryState buildPartial() {
      ClientLibraryState result = new ClientLibraryState(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.corpus_ = corpus_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.serverToken_ = serverToken_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.hashCodeSum_ = hashCodeSum_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.librarySize_ = librarySize_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.libraryId_ = libraryId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ClientLibraryState) {
        return mergeFrom((ClientLibraryState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ClientLibraryState other) {
      if (other == ClientLibraryState.getDefaultInstance()) return this;
      if (other.hasCorpus()) {
        setCorpus(other.getCorpus());
      }
      if (other.hasServerToken()) {
        setServerToken(other.getServerToken());
      }
      if (other.hasHashCodeSum()) {
        setHashCodeSum(other.getHashCodeSum());
      }
      if (other.hasLibrarySize()) {
        setLibrarySize(other.getLibrarySize());
      }
      if (other.hasLibraryId()) {
        bitField0_ |= 0x00000010;
        libraryId_ = other.libraryId_;
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
      ClientLibraryState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ClientLibraryState) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int corpus_ ;
    /**
     * <code>optional int32 corpus = 1;</code>
     */
    public boolean hasCorpus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 corpus = 1;</code>
     */
    public int getCorpus() {
      return corpus_;
    }
    /**
     * <code>optional int32 corpus = 1;</code>
     */
    public Builder setCorpus(int value) {
      bitField0_ |= 0x00000001;
      corpus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 corpus = 1;</code>
     */
    public Builder clearCorpus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      corpus_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString serverToken_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes serverToken = 2;</code>
     */
    public boolean hasServerToken() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes serverToken = 2;</code>
     */
    public com.google.protobuf.ByteString getServerToken() {
      return serverToken_;
    }
    /**
     * <code>optional bytes serverToken = 2;</code>
     */
    public Builder setServerToken(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      serverToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes serverToken = 2;</code>
     */
    public Builder clearServerToken() {
      bitField0_ = (bitField0_ & ~0x00000002);
      serverToken_ = getDefaultInstance().getServerToken();
      onChanged();
      return this;
    }

    private long hashCodeSum_ ;
    /**
     * <code>optional int64 hashCodeSum = 3;</code>
     */
    public boolean hasHashCodeSum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 hashCodeSum = 3;</code>
     */
    public long getHashCodeSum() {
      return hashCodeSum_;
    }
    /**
     * <code>optional int64 hashCodeSum = 3;</code>
     */
    public Builder setHashCodeSum(long value) {
      bitField0_ |= 0x00000004;
      hashCodeSum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 hashCodeSum = 3;</code>
     */
    public Builder clearHashCodeSum() {
      bitField0_ = (bitField0_ & ~0x00000004);
      hashCodeSum_ = 0L;
      onChanged();
      return this;
    }

    private int librarySize_ ;
    /**
     * <code>optional int32 librarySize = 4;</code>
     */
    public boolean hasLibrarySize() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 librarySize = 4;</code>
     */
    public int getLibrarySize() {
      return librarySize_;
    }
    /**
     * <code>optional int32 librarySize = 4;</code>
     */
    public Builder setLibrarySize(int value) {
      bitField0_ |= 0x00000008;
      librarySize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 librarySize = 4;</code>
     */
    public Builder clearLibrarySize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      librarySize_ = 0;
      onChanged();
      return this;
    }

    private Object libraryId_ = "";
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public boolean hasLibraryId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public String getLibraryId() {
      Object ref = libraryId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          libraryId_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public com.google.protobuf.ByteString
        getLibraryIdBytes() {
      Object ref = libraryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        libraryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public Builder setLibraryId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      libraryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public Builder clearLibraryId() {
      bitField0_ = (bitField0_ & ~0x00000010);
      libraryId_ = getDefaultInstance().getLibraryId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string libraryId = 5;</code>
     */
    public Builder setLibraryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      libraryId_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ClientLibraryState)
  }

  static {
    defaultInstance = new ClientLibraryState(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:ClientLibraryState)
}
