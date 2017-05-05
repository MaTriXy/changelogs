// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code PasswordPrompt}
 */
public final class PasswordPrompt extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:PasswordPrompt)
    PasswordPromptOrBuilder {
  // Use PasswordPrompt.newBuilder() to construct.
  private PasswordPrompt(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private PasswordPrompt(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final PasswordPrompt defaultInstance;
  public static PasswordPrompt getDefaultInstance() {
    return defaultInstance;
  }

  public PasswordPrompt getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private PasswordPrompt(
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
            prompt_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            forgotPasswordUrl_ = bs;
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
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_PasswordPrompt_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_PasswordPrompt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.PasswordPrompt.class, com.thunderclouddev.playstoreapi.proto.PasswordPrompt.Builder.class);
  }

  public static com.google.protobuf.Parser<PasswordPrompt> PARSER =
      new com.google.protobuf.AbstractParser<PasswordPrompt>() {
    public PasswordPrompt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PasswordPrompt(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<PasswordPrompt> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int PROMPT_FIELD_NUMBER = 1;
  private java.lang.Object prompt_;
  /**
   * <code>optional string prompt = 1;</code>
   */
  public boolean hasPrompt() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string prompt = 1;</code>
   */
  public java.lang.String getPrompt() {
    java.lang.Object ref = prompt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        prompt_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string prompt = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPromptBytes() {
    java.lang.Object ref = prompt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prompt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORGOTPASSWORDURL_FIELD_NUMBER = 2;
  private java.lang.Object forgotPasswordUrl_;
  /**
   * <code>optional string forgotPasswordUrl = 2;</code>
   */
  public boolean hasForgotPasswordUrl() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string forgotPasswordUrl = 2;</code>
   */
  public java.lang.String getForgotPasswordUrl() {
    java.lang.Object ref = forgotPasswordUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        forgotPasswordUrl_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string forgotPasswordUrl = 2;</code>
   */
  public com.google.protobuf.ByteString
      getForgotPasswordUrlBytes() {
    java.lang.Object ref = forgotPasswordUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      forgotPasswordUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    prompt_ = "";
    forgotPasswordUrl_ = "";
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
      output.writeBytes(1, getPromptBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getForgotPasswordUrlBytes());
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
        .computeBytesSize(1, getPromptBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getForgotPasswordUrlBytes());
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

  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.PasswordPrompt parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.PasswordPrompt prototype) {
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
   * Protobuf type {@code PasswordPrompt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PasswordPrompt)
      com.thunderclouddev.playstoreapi.proto.PasswordPromptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_PasswordPrompt_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_PasswordPrompt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.PasswordPrompt.class, com.thunderclouddev.playstoreapi.proto.PasswordPrompt.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.PasswordPrompt.newBuilder()
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
      prompt_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      forgotPasswordUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_PasswordPrompt_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.PasswordPrompt getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.PasswordPrompt.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.PasswordPrompt build() {
      com.thunderclouddev.playstoreapi.proto.PasswordPrompt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.PasswordPrompt buildPartial() {
      com.thunderclouddev.playstoreapi.proto.PasswordPrompt result = new com.thunderclouddev.playstoreapi.proto.PasswordPrompt(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.prompt_ = prompt_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.forgotPasswordUrl_ = forgotPasswordUrl_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.PasswordPrompt) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.PasswordPrompt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.PasswordPrompt other) {
      if (other == com.thunderclouddev.playstoreapi.proto.PasswordPrompt.getDefaultInstance()) return this;
      if (other.hasPrompt()) {
        bitField0_ |= 0x00000001;
        prompt_ = other.prompt_;
        onChanged();
      }
      if (other.hasForgotPasswordUrl()) {
        bitField0_ |= 0x00000002;
        forgotPasswordUrl_ = other.forgotPasswordUrl_;
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
      com.thunderclouddev.playstoreapi.proto.PasswordPrompt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.PasswordPrompt) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object prompt_ = "";
    /**
     * <code>optional string prompt = 1;</code>
     */
    public boolean hasPrompt() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string prompt = 1;</code>
     */
    public java.lang.String getPrompt() {
      java.lang.Object ref = prompt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          prompt_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string prompt = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPromptBytes() {
      java.lang.Object ref = prompt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prompt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string prompt = 1;</code>
     */
    public Builder setPrompt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      prompt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string prompt = 1;</code>
     */
    public Builder clearPrompt() {
      bitField0_ = (bitField0_ & ~0x00000001);
      prompt_ = getDefaultInstance().getPrompt();
      onChanged();
      return this;
    }
    /**
     * <code>optional string prompt = 1;</code>
     */
    public Builder setPromptBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      prompt_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object forgotPasswordUrl_ = "";
    /**
     * <code>optional string forgotPasswordUrl = 2;</code>
     */
    public boolean hasForgotPasswordUrl() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string forgotPasswordUrl = 2;</code>
     */
    public java.lang.String getForgotPasswordUrl() {
      java.lang.Object ref = forgotPasswordUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          forgotPasswordUrl_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string forgotPasswordUrl = 2;</code>
     */
    public com.google.protobuf.ByteString
        getForgotPasswordUrlBytes() {
      java.lang.Object ref = forgotPasswordUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        forgotPasswordUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string forgotPasswordUrl = 2;</code>
     */
    public Builder setForgotPasswordUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      forgotPasswordUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string forgotPasswordUrl = 2;</code>
     */
    public Builder clearForgotPasswordUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      forgotPasswordUrl_ = getDefaultInstance().getForgotPasswordUrl();
      onChanged();
      return this;
    }
    /**
     * <code>optional string forgotPasswordUrl = 2;</code>
     */
    public Builder setForgotPasswordUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      forgotPasswordUrl_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:PasswordPrompt)
  }

  static {
    defaultInstance = new PasswordPrompt(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:PasswordPrompt)
}
