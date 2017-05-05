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
 * Protobuf type {@code LineItem}
 */
public final class LineItem extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:LineItem)
    LineItemOrBuilder {
  // Use LineItem.newBuilder() to construct.
  private LineItem(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private LineItem(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final LineItem defaultInstance;
  public static LineItem getDefaultInstance() {
    return defaultInstance;
  }

  public LineItem getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private LineItem(
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
            name_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            description_ = bs;
            break;
          }
          case 26: {
            Offer.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = offer_.toBuilder();
            }
            offer_ = input.readMessage(Offer.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(offer_);
              offer_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
          case 34: {
            com.thunderclouddev.playstoreapi.proto.Money.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              subBuilder = amount_.toBuilder();
            }
            amount_ = input.readMessage(com.thunderclouddev.playstoreapi.proto.Money.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(amount_);
              amount_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
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
    return GooglePlay.internal_static_LineItem_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_LineItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LineItem.class, Builder.class);
  }

  public static com.google.protobuf.Parser<LineItem> PARSER =
      new com.google.protobuf.AbstractParser<LineItem>() {
    public LineItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LineItem(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<LineItem> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private Object description_;
  /**
   * <code>optional string description = 2;</code>
   */
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string description = 2;</code>
   */
  public String getDescription() {
    Object ref = description_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        description_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string description = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    Object ref = description_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OFFER_FIELD_NUMBER = 3;
  private Offer offer_;
  /**
   * <code>optional .Offer offer = 3;</code>
   */
  public boolean hasOffer() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .Offer offer = 3;</code>
   */
  public Offer getOffer() {
    return offer_;
  }
  /**
   * <code>optional .Offer offer = 3;</code>
   */
  public OfferOrBuilder getOfferOrBuilder() {
    return offer_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 4;
  private com.thunderclouddev.playstoreapi.proto.Money amount_;
  /**
   * <code>optional .Money amount = 4;</code>
   */
  public boolean hasAmount() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional .Money amount = 4;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.Money getAmount() {
    return amount_;
  }
  /**
   * <code>optional .Money amount = 4;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.MoneyOrBuilder getAmountOrBuilder() {
    return amount_;
  }

  private void initFields() {
    name_ = "";
    description_ = "";
    offer_ = Offer.getDefaultInstance();
    amount_ = com.thunderclouddev.playstoreapi.proto.Money.getDefaultInstance();
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
      output.writeBytes(1, getNameBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getDescriptionBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, offer_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, amount_);
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
        .computeBytesSize(1, getNameBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getDescriptionBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, offer_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, amount_);
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

  public static LineItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LineItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LineItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LineItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LineItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static LineItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static LineItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static LineItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static LineItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static LineItem parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(LineItem prototype) {
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
   * Protobuf type {@code LineItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LineItem)
      com.thunderclouddev.playstoreapi.proto.LineItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_LineItem_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_LineItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LineItem.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.LineItem.newBuilder()
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
        getOfferFieldBuilder();
        getAmountFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      description_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (offerBuilder_ == null) {
        offer_ = Offer.getDefaultInstance();
      } else {
        offerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      if (amountBuilder_ == null) {
        amount_ = com.thunderclouddev.playstoreapi.proto.Money.getDefaultInstance();
      } else {
        amountBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_LineItem_descriptor;
    }

    public LineItem getDefaultInstanceForType() {
      return LineItem.getDefaultInstance();
    }

    public LineItem build() {
      LineItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public LineItem buildPartial() {
      LineItem result = new LineItem(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.description_ = description_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      if (offerBuilder_ == null) {
        result.offer_ = offer_;
      } else {
        result.offer_ = offerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      if (amountBuilder_ == null) {
        result.amount_ = amount_;
      } else {
        result.amount_ = amountBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof LineItem) {
        return mergeFrom((LineItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LineItem other) {
      if (other == LineItem.getDefaultInstance()) return this;
      if (other.hasName()) {
        bitField0_ |= 0x00000001;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasDescription()) {
        bitField0_ |= 0x00000002;
        description_ = other.description_;
        onChanged();
      }
      if (other.hasOffer()) {
        mergeOffer(other.getOffer());
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
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
      LineItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (LineItem) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }

    private Object description_ = "";
    /**
     * <code>optional string description = 2;</code>
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string description = 2;</code>
     */
    public String getDescription() {
      Object ref = description_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          description_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string description = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string description = 2;</code>
     */
    public Builder setDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 2;</code>
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000002);
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 2;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      description_ = value;
      onChanged();
      return this;
    }

    private Offer offer_ = Offer.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        Offer, Offer.Builder, OfferOrBuilder> offerBuilder_;
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    public boolean hasOffer() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    public Offer getOffer() {
      if (offerBuilder_ == null) {
        return offer_;
      } else {
        return offerBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    public Builder setOffer(Offer value) {
      if (offerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        offer_ = value;
        onChanged();
      } else {
        offerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    public Builder setOffer(
        Offer.Builder builderForValue) {
      if (offerBuilder_ == null) {
        offer_ = builderForValue.build();
        onChanged();
      } else {
        offerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    public Builder mergeOffer(Offer value) {
      if (offerBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004) &&
            offer_ != Offer.getDefaultInstance()) {
          offer_ =
            Offer.newBuilder(offer_).mergeFrom(value).buildPartial();
        } else {
          offer_ = value;
        }
        onChanged();
      } else {
        offerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    public Builder clearOffer() {
      if (offerBuilder_ == null) {
        offer_ = Offer.getDefaultInstance();
        onChanged();
      } else {
        offerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    public Offer.Builder getOfferBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getOfferFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    public OfferOrBuilder getOfferOrBuilder() {
      if (offerBuilder_ != null) {
        return offerBuilder_.getMessageOrBuilder();
      } else {
        return offer_;
      }
    }
    /**
     * <code>optional .Offer offer = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        Offer, Offer.Builder, OfferOrBuilder>
        getOfferFieldBuilder() {
      if (offerBuilder_ == null) {
        offerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            Offer, Offer.Builder, OfferOrBuilder>(
                getOffer(),
                getParentForChildren(),
                isClean());
        offer_ = null;
      }
      return offerBuilder_;
    }

    private com.thunderclouddev.playstoreapi.proto.Money amount_ = com.thunderclouddev.playstoreapi.proto.Money.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.Money, com.thunderclouddev.playstoreapi.proto.Money.Builder, com.thunderclouddev.playstoreapi.proto.MoneyOrBuilder> amountBuilder_;
    /**
     * <code>optional .Money amount = 4;</code>
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .Money amount = 4;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Money getAmount() {
      if (amountBuilder_ == null) {
        return amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Money amount = 4;</code>
     */
    public Builder setAmount(com.thunderclouddev.playstoreapi.proto.Money value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
        onChanged();
      } else {
        amountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .Money amount = 4;</code>
     */
    public Builder setAmount(
        com.thunderclouddev.playstoreapi.proto.Money.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
        onChanged();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .Money amount = 4;</code>
     */
    public Builder mergeAmount(com.thunderclouddev.playstoreapi.proto.Money value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008) &&
            amount_ != com.thunderclouddev.playstoreapi.proto.Money.getDefaultInstance()) {
          amount_ =
            com.thunderclouddev.playstoreapi.proto.Money.newBuilder(amount_).mergeFrom(value).buildPartial();
        } else {
          amount_ = value;
        }
        onChanged();
      } else {
        amountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>optional .Money amount = 4;</code>
     */
    public Builder clearAmount() {
      if (amountBuilder_ == null) {
        amount_ = com.thunderclouddev.playstoreapi.proto.Money.getDefaultInstance();
        onChanged();
      } else {
        amountBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <code>optional .Money amount = 4;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Money.Builder getAmountBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Money amount = 4;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.MoneyOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_;
      }
    }
    /**
     * <code>optional .Money amount = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.Money, com.thunderclouddev.playstoreapi.proto.Money.Builder, com.thunderclouddev.playstoreapi.proto.MoneyOrBuilder>
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.Money, com.thunderclouddev.playstoreapi.proto.Money.Builder, com.thunderclouddev.playstoreapi.proto.MoneyOrBuilder>(
                getAmount(),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:LineItem)
  }

  static {
    defaultInstance = new LineItem(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:LineItem)
}
