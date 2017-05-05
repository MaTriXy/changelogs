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
 * Protobuf type {@code Unknown25Item}
 */
public final class Unknown25Item extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Unknown25Item)
    Unknown25ItemOrBuilder {
  // Use Unknown25Item.newBuilder() to construct.
  private Unknown25Item(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Unknown25Item(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Unknown25Item defaultInstance;
  public static Unknown25Item getDefaultInstance() {
    return defaultInstance;
  }

  public Unknown25Item getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Unknown25Item(
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
            label_ = bs;
            break;
          }
          case 26: {
            Unknown25Container.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = container_.toBuilder();
            }
            container_ = input.readMessage(Unknown25Container.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(container_);
              container_ = subBuilder.buildPartial();
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
    return GooglePlay.internal_static_Unknown25Item_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_Unknown25Item_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Unknown25Item.class, Builder.class);
  }

  public static com.google.protobuf.Parser<Unknown25Item> PARSER =
      new com.google.protobuf.AbstractParser<Unknown25Item>() {
    public Unknown25Item parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Unknown25Item(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<Unknown25Item> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int LABEL_FIELD_NUMBER = 1;
  private Object label_;
  /**
   * <code>optional string label = 1;</code>
   */
  public boolean hasLabel() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string label = 1;</code>
   */
  public String getLabel() {
    Object ref = label_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        label_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string label = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLabelBytes() {
    Object ref = label_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      label_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTAINER_FIELD_NUMBER = 3;
  private Unknown25Container container_;
  /**
   * <code>optional .Unknown25Container container = 3;</code>
   */
  public boolean hasContainer() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .Unknown25Container container = 3;</code>
   */
  public Unknown25Container getContainer() {
    return container_;
  }
  /**
   * <code>optional .Unknown25Container container = 3;</code>
   */
  public Unknown25ContainerOrBuilder getContainerOrBuilder() {
    return container_;
  }

  private void initFields() {
    label_ = "";
    container_ = Unknown25Container.getDefaultInstance();
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
      output.writeBytes(1, getLabelBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(3, container_);
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
        .computeBytesSize(1, getLabelBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, container_);
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

  public static Unknown25Item parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Unknown25Item parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Unknown25Item parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Unknown25Item parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Unknown25Item parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static Unknown25Item parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static Unknown25Item parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static Unknown25Item parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static Unknown25Item parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static Unknown25Item parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(Unknown25Item prototype) {
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
   * Protobuf type {@code Unknown25Item}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Unknown25Item)
      com.thunderclouddev.playstoreapi.proto.Unknown25ItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_Unknown25Item_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_Unknown25Item_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Unknown25Item.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.Unknown25Item.newBuilder()
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
        getContainerFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      label_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (containerBuilder_ == null) {
        container_ = Unknown25Container.getDefaultInstance();
      } else {
        containerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_Unknown25Item_descriptor;
    }

    public Unknown25Item getDefaultInstanceForType() {
      return Unknown25Item.getDefaultInstance();
    }

    public Unknown25Item build() {
      Unknown25Item result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Unknown25Item buildPartial() {
      Unknown25Item result = new Unknown25Item(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.label_ = label_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (containerBuilder_ == null) {
        result.container_ = container_;
      } else {
        result.container_ = containerBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Unknown25Item) {
        return mergeFrom((Unknown25Item)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Unknown25Item other) {
      if (other == Unknown25Item.getDefaultInstance()) return this;
      if (other.hasLabel()) {
        bitField0_ |= 0x00000001;
        label_ = other.label_;
        onChanged();
      }
      if (other.hasContainer()) {
        mergeContainer(other.getContainer());
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
      Unknown25Item parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Unknown25Item) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object label_ = "";
    /**
     * <code>optional string label = 1;</code>
     */
    public boolean hasLabel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public String getLabel() {
      Object ref = label_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          label_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLabelBytes() {
      Object ref = label_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder setLabel(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      label_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder clearLabel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      label_ = getDefaultInstance().getLabel();
      onChanged();
      return this;
    }
    /**
     * <code>optional string label = 1;</code>
     */
    public Builder setLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      label_ = value;
      onChanged();
      return this;
    }

    private Unknown25Container container_ = Unknown25Container.getDefaultInstance();
    private com.google.protobuf.SingleFieldBuilder<
        Unknown25Container, Unknown25Container.Builder, Unknown25ContainerOrBuilder> containerBuilder_;
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    public boolean hasContainer() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    public Unknown25Container getContainer() {
      if (containerBuilder_ == null) {
        return container_;
      } else {
        return containerBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    public Builder setContainer(Unknown25Container value) {
      if (containerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        container_ = value;
        onChanged();
      } else {
        containerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    public Builder setContainer(
        Unknown25Container.Builder builderForValue) {
      if (containerBuilder_ == null) {
        container_ = builderForValue.build();
        onChanged();
      } else {
        containerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    public Builder mergeContainer(Unknown25Container value) {
      if (containerBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            container_ != Unknown25Container.getDefaultInstance()) {
          container_ =
            Unknown25Container.newBuilder(container_).mergeFrom(value).buildPartial();
        } else {
          container_ = value;
        }
        onChanged();
      } else {
        containerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    public Builder clearContainer() {
      if (containerBuilder_ == null) {
        container_ = Unknown25Container.getDefaultInstance();
        onChanged();
      } else {
        containerBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    public Unknown25Container.Builder getContainerBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getContainerFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    public Unknown25ContainerOrBuilder getContainerOrBuilder() {
      if (containerBuilder_ != null) {
        return containerBuilder_.getMessageOrBuilder();
      } else {
        return container_;
      }
    }
    /**
     * <code>optional .Unknown25Container container = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        Unknown25Container, Unknown25Container.Builder, Unknown25ContainerOrBuilder>
        getContainerFieldBuilder() {
      if (containerBuilder_ == null) {
        containerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            Unknown25Container, Unknown25Container.Builder, Unknown25ContainerOrBuilder>(
                getContainer(),
                getParentForChildren(),
                isClean());
        container_ = null;
      }
      return containerBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:Unknown25Item)
  }

  static {
    defaultInstance = new Unknown25Item(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:Unknown25Item)
}

