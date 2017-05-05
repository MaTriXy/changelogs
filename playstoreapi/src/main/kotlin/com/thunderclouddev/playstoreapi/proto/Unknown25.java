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
 * Protobuf type {@code Unknown25}
 */
public final class Unknown25 extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Unknown25)
    Unknown25OrBuilder {
  // Use Unknown25.newBuilder() to construct.
  private Unknown25(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private Unknown25(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final Unknown25 defaultInstance;
  public static Unknown25 getDefaultInstance() {
    return defaultInstance;
  }

  public Unknown25 getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private Unknown25(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              item_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.Unknown25Item>();
              mutable_bitField0_ |= 0x00000001;
            }
            item_.add(input.readMessage(com.thunderclouddev.playstoreapi.proto.Unknown25Item.PARSER, extensionRegistry));
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
        item_ = java.util.Collections.unmodifiableList(item_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GooglePlay.internal_static_Unknown25_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_Unknown25_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Unknown25.class, Builder.class);
  }

  public static com.google.protobuf.Parser<Unknown25> PARSER =
      new com.google.protobuf.AbstractParser<Unknown25>() {
    public Unknown25 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Unknown25(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<Unknown25> getParserForType() {
    return PARSER;
  }

  public static final int ITEM_FIELD_NUMBER = 2;
  private java.util.List<com.thunderclouddev.playstoreapi.proto.Unknown25Item> item_;
  /**
   * <code>repeated .Unknown25Item item = 2;</code>
   */
  public java.util.List<com.thunderclouddev.playstoreapi.proto.Unknown25Item> getItemList() {
    return item_;
  }
  /**
   * <code>repeated .Unknown25Item item = 2;</code>
   */
  public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.Unknown25ItemOrBuilder>
      getItemOrBuilderList() {
    return item_;
  }
  /**
   * <code>repeated .Unknown25Item item = 2;</code>
   */
  public int getItemCount() {
    return item_.size();
  }
  /**
   * <code>repeated .Unknown25Item item = 2;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.Unknown25Item getItem(int index) {
    return item_.get(index);
  }
  /**
   * <code>repeated .Unknown25Item item = 2;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.Unknown25ItemOrBuilder getItemOrBuilder(
      int index) {
    return item_.get(index);
  }

  private void initFields() {
    item_ = java.util.Collections.emptyList();
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
    for (int i = 0; i < item_.size(); i++) {
      output.writeMessage(2, item_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < item_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, item_.get(i));
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

  public static Unknown25 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Unknown25 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Unknown25 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Unknown25 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Unknown25 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static Unknown25 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static Unknown25 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static Unknown25 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static Unknown25 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static Unknown25 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(Unknown25 prototype) {
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
   * Protobuf type {@code Unknown25}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Unknown25)
      com.thunderclouddev.playstoreapi.proto.Unknown25OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_Unknown25_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_Unknown25_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Unknown25.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.Unknown25.newBuilder()
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
        getItemFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (itemBuilder_ == null) {
        item_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemBuilder_.clear();
      }
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_Unknown25_descriptor;
    }

    public Unknown25 getDefaultInstanceForType() {
      return Unknown25.getDefaultInstance();
    }

    public Unknown25 build() {
      Unknown25 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Unknown25 buildPartial() {
      Unknown25 result = new Unknown25(this);
      int from_bitField0_ = bitField0_;
      if (itemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          item_ = java.util.Collections.unmodifiableList(item_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Unknown25) {
        return mergeFrom((Unknown25)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Unknown25 other) {
      if (other == Unknown25.getDefaultInstance()) return this;
      if (itemBuilder_ == null) {
        if (!other.item_.isEmpty()) {
          if (item_.isEmpty()) {
            item_ = other.item_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemIsMutable();
            item_.addAll(other.item_);
          }
          onChanged();
        }
      } else {
        if (!other.item_.isEmpty()) {
          if (itemBuilder_.isEmpty()) {
            itemBuilder_.dispose();
            itemBuilder_ = null;
            item_ = other.item_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getItemFieldBuilder() : null;
          } else {
            itemBuilder_.addAllMessages(other.item_);
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
      Unknown25 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Unknown25) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.thunderclouddev.playstoreapi.proto.Unknown25Item> item_ =
      java.util.Collections.emptyList();
    private void ensureItemIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        item_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.Unknown25Item>(item_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.Unknown25Item, com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder, com.thunderclouddev.playstoreapi.proto.Unknown25ItemOrBuilder> itemBuilder_;

    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.Unknown25Item> getItemList() {
      if (itemBuilder_ == null) {
        return java.util.Collections.unmodifiableList(item_);
      } else {
        return itemBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public int getItemCount() {
      if (itemBuilder_ == null) {
        return item_.size();
      } else {
        return itemBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Unknown25Item getItem(int index) {
      if (itemBuilder_ == null) {
        return item_.get(index);
      } else {
        return itemBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder setItem(
        int index, com.thunderclouddev.playstoreapi.proto.Unknown25Item value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.set(index, value);
        onChanged();
      } else {
        itemBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder setItem(
        int index, com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder addItem(com.thunderclouddev.playstoreapi.proto.Unknown25Item value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.add(value);
        onChanged();
      } else {
        itemBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder addItem(
        int index, com.thunderclouddev.playstoreapi.proto.Unknown25Item value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.add(index, value);
        onChanged();
      } else {
        itemBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder addItem(
        com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.add(builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder addItem(
        int index, com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder addAllItem(
        Iterable<? extends com.thunderclouddev.playstoreapi.proto.Unknown25Item> values) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, item_);
        onChanged();
      } else {
        itemBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public Builder removeItem(int index) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.remove(index);
        onChanged();
      } else {
        itemBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder getItemBuilder(
        int index) {
      return getItemFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Unknown25ItemOrBuilder getItemOrBuilder(
        int index) {
      if (itemBuilder_ == null) {
        return item_.get(index);  } else {
        return itemBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.Unknown25ItemOrBuilder>
         getItemOrBuilderList() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(item_);
      }
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder addItemBuilder() {
      return getItemFieldBuilder().addBuilder(
          com.thunderclouddev.playstoreapi.proto.Unknown25Item.getDefaultInstance());
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder addItemBuilder(
        int index) {
      return getItemFieldBuilder().addBuilder(
          index, com.thunderclouddev.playstoreapi.proto.Unknown25Item.getDefaultInstance());
    }
    /**
     * <code>repeated .Unknown25Item item = 2;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder>
         getItemBuilderList() {
      return getItemFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.Unknown25Item, com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder, com.thunderclouddev.playstoreapi.proto.Unknown25ItemOrBuilder>
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.Unknown25Item, com.thunderclouddev.playstoreapi.proto.Unknown25Item.Builder, com.thunderclouddev.playstoreapi.proto.Unknown25ItemOrBuilder>(
                item_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:Unknown25)
  }

  static {
    defaultInstance = new Unknown25(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:Unknown25)
}

