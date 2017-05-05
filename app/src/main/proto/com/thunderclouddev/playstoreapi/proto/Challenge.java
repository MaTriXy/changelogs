// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

/**
 * Protobuf type {@code Challenge}
 */
public final class Challenge extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Challenge)
    ChallengeOrBuilder {
  // Use Challenge.newBuilder() to construct.
  private Challenge(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Challenge(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Challenge defaultInstance;
  public static Challenge getDefaultInstance() {
    return defaultInstance;
  }

  public Challenge getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Challenge(
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
            com.thunderclouddev.playstoreapi.proto.AddressChallenge.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = addressChallenge_.toBuilder();
            }
            addressChallenge_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.AddressChallenge.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(addressChallenge_);
              addressChallenge_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = authenticationChallenge_.toBuilder();
            }
            authenticationChallenge_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(authenticationChallenge_);
              authenticationChallenge_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
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
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_Challenge_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_Challenge_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thunderclouddev.playstoreapi.proto.Challenge.class, com.thunderclouddev.playstoreapi.proto.Challenge.Builder.class);
  }

  public static com.google.protobuf.Parser<Challenge> PARSER =
      new com.google.protobuf.AbstractParser<Challenge>() {
    public Challenge parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Challenge(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Challenge> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int ADDRESSCHALLENGE_FIELD_NUMBER = 1;
  private com.thunderclouddev.playstoreapi.proto.AddressChallenge addressChallenge_;
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  public boolean hasAddressChallenge() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.AddressChallenge getAddressChallenge() {
    return addressChallenge_;
  }
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.AddressChallengeOrBuilder getAddressChallengeOrBuilder() {
    return addressChallenge_;
  }

  public static final int AUTHENTICATIONCHALLENGE_FIELD_NUMBER = 2;
  private com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge authenticationChallenge_;
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  public boolean hasAuthenticationChallenge() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge getAuthenticationChallenge() {
    return authenticationChallenge_;
  }
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.AuthenticationChallengeOrBuilder getAuthenticationChallengeOrBuilder() {
    return authenticationChallenge_;
  }

  private void initFields() {
    addressChallenge_ = com.thunderclouddev.playstoreapi.proto.AddressChallenge.getDefaultInstance();
    authenticationChallenge_ = com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.getDefaultInstance();
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
      output.writeMessage(1, addressChallenge_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, authenticationChallenge_);
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
        .computeMessageSize(1, addressChallenge_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, authenticationChallenge_);
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

  public static com.thunderclouddev.playstoreapi.proto.Challenge parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.thunderclouddev.playstoreapi.proto.Challenge parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.thunderclouddev.playstoreapi.proto.Challenge prototype) {
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
   * Protobuf type {@code Challenge}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Challenge)
      com.thunderclouddev.playstoreapi.proto.ChallengeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_Challenge_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_Challenge_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thunderclouddev.playstoreapi.proto.Challenge.class, com.thunderclouddev.playstoreapi.proto.Challenge.Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.Challenge.newBuilder()
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
        getAddressChallengeFieldBuilder();
        getAuthenticationChallengeFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (addressChallengeBuilder_ == null) {
        addressChallenge_ = com.thunderclouddev.playstoreapi.proto.AddressChallenge.getDefaultInstance();
      } else {
        addressChallengeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (authenticationChallengeBuilder_ == null) {
        authenticationChallenge_ = com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.getDefaultInstance();
      } else {
        authenticationChallengeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thunderclouddev.playstoreapi.proto.GooglePlay.internal_static_Challenge_descriptor;
    }

    public com.thunderclouddev.playstoreapi.proto.Challenge getDefaultInstanceForType() {
      return com.thunderclouddev.playstoreapi.proto.Challenge.getDefaultInstance();
    }

    public com.thunderclouddev.playstoreapi.proto.Challenge build() {
      com.thunderclouddev.playstoreapi.proto.Challenge result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.thunderclouddev.playstoreapi.proto.Challenge buildPartial() {
      com.thunderclouddev.playstoreapi.proto.Challenge result = new com.thunderclouddev.playstoreapi.proto.Challenge(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (addressChallengeBuilder_ == null) {
        result.addressChallenge_ = addressChallenge_;
      } else {
        result.addressChallenge_ = addressChallengeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (authenticationChallengeBuilder_ == null) {
        result.authenticationChallenge_ = authenticationChallenge_;
      } else {
        result.authenticationChallenge_ = authenticationChallengeBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thunderclouddev.playstoreapi.proto.Challenge) {
        return mergeFrom((com.thunderclouddev.playstoreapi.proto.Challenge)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thunderclouddev.playstoreapi.proto.Challenge other) {
      if (other == com.thunderclouddev.playstoreapi.proto.Challenge.getDefaultInstance()) return this;
      if (other.hasAddressChallenge()) {
        mergeAddressChallenge(other.getAddressChallenge());
      }
      if (other.hasAuthenticationChallenge()) {
        mergeAuthenticationChallenge(other.getAuthenticationChallenge());
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
      com.thunderclouddev.playstoreapi.proto.Challenge parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thunderclouddev.playstoreapi.proto.Challenge) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.thunderclouddev.playstoreapi.proto.AddressChallenge addressChallenge_ = com.thunderclouddev.playstoreapi.proto.AddressChallenge.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.AddressChallenge, com.thunderclouddev.playstoreapi.proto.AddressChallenge.Builder, com.thunderclouddev.playstoreapi.proto.AddressChallengeOrBuilder> addressChallengeBuilder_;
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public boolean hasAddressChallenge() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AddressChallenge getAddressChallenge() {
      if (addressChallengeBuilder_ == null) {
        return addressChallenge_;
      } else {
        return addressChallengeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public Builder setAddressChallenge(com.thunderclouddev.playstoreapi.proto.AddressChallenge value) {
      if (addressChallengeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        addressChallenge_ = value;
        onChanged();
      } else {
        addressChallengeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public Builder setAddressChallenge(
        com.thunderclouddev.playstoreapi.proto.AddressChallenge.Builder builderForValue) {
      if (addressChallengeBuilder_ == null) {
        addressChallenge_ = builderForValue.build();
        onChanged();
      } else {
        addressChallengeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public Builder mergeAddressChallenge(com.thunderclouddev.playstoreapi.proto.AddressChallenge value) {
      if (addressChallengeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            addressChallenge_ != com.thunderclouddev.playstoreapi.proto.AddressChallenge.getDefaultInstance()) {
          addressChallenge_ =
            com.thunderclouddev.playstoreapi.proto.AddressChallenge.newBuilder(addressChallenge_).mergeFrom(value).buildPartial();
        } else {
          addressChallenge_ = value;
        }
        onChanged();
      } else {
        addressChallengeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public Builder clearAddressChallenge() {
      if (addressChallengeBuilder_ == null) {
        addressChallenge_ = com.thunderclouddev.playstoreapi.proto.AddressChallenge.getDefaultInstance();
        onChanged();
      } else {
        addressChallengeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AddressChallenge.Builder getAddressChallengeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAddressChallengeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AddressChallengeOrBuilder getAddressChallengeOrBuilder() {
      if (addressChallengeBuilder_ != null) {
        return addressChallengeBuilder_.getMessageOrBuilder();
      } else {
        return addressChallenge_;
      }
    }
    /**
     * <code>optional .AddressChallenge addressChallenge = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.AddressChallenge, com.thunderclouddev.playstoreapi.proto.AddressChallenge.Builder, com.thunderclouddev.playstoreapi.proto.AddressChallengeOrBuilder>
        getAddressChallengeFieldBuilder() {
      if (addressChallengeBuilder_ == null) {
        addressChallengeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.AddressChallenge, com.thunderclouddev.playstoreapi.proto.AddressChallenge.Builder, com.thunderclouddev.playstoreapi.proto.AddressChallengeOrBuilder>(
                getAddressChallenge(),
                getParentForChildren(),
                isClean());
        addressChallenge_ = null;
      }
      return addressChallengeBuilder_;
    }

    private com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge authenticationChallenge_ = com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge, com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.Builder, com.thunderclouddev.playstoreapi.proto.AuthenticationChallengeOrBuilder> authenticationChallengeBuilder_;
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public boolean hasAuthenticationChallenge() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge getAuthenticationChallenge() {
      if (authenticationChallengeBuilder_ == null) {
        return authenticationChallenge_;
      } else {
        return authenticationChallengeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public Builder setAuthenticationChallenge(com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge value) {
      if (authenticationChallengeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authenticationChallenge_ = value;
        onChanged();
      } else {
        authenticationChallengeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public Builder setAuthenticationChallenge(
        com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.Builder builderForValue) {
      if (authenticationChallengeBuilder_ == null) {
        authenticationChallenge_ = builderForValue.build();
        onChanged();
      } else {
        authenticationChallengeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public Builder mergeAuthenticationChallenge(com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge value) {
      if (authenticationChallengeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            authenticationChallenge_ != com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.getDefaultInstance()) {
          authenticationChallenge_ =
            com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.newBuilder(authenticationChallenge_).mergeFrom(value).buildPartial();
        } else {
          authenticationChallenge_ = value;
        }
        onChanged();
      } else {
        authenticationChallengeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public Builder clearAuthenticationChallenge() {
      if (authenticationChallengeBuilder_ == null) {
        authenticationChallenge_ = com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.getDefaultInstance();
        onChanged();
      } else {
        authenticationChallengeBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.Builder getAuthenticationChallengeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAuthenticationChallengeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.AuthenticationChallengeOrBuilder getAuthenticationChallengeOrBuilder() {
      if (authenticationChallengeBuilder_ != null) {
        return authenticationChallengeBuilder_.getMessageOrBuilder();
      } else {
        return authenticationChallenge_;
      }
    }
    /**
     * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge, com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.Builder, com.thunderclouddev.playstoreapi.proto.AuthenticationChallengeOrBuilder>
        getAuthenticationChallengeFieldBuilder() {
      if (authenticationChallengeBuilder_ == null) {
        authenticationChallengeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge, com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge.Builder, com.thunderclouddev.playstoreapi.proto.AuthenticationChallengeOrBuilder>(
                getAuthenticationChallenge(),
                getParentForChildren(),
                isClean());
        authenticationChallenge_ = null;
      }
      return authenticationChallengeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:Challenge)
  }

  static {
    defaultInstance = new Challenge(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:Challenge)
}
