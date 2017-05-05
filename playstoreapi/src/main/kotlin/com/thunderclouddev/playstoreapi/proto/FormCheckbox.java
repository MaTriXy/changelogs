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
 * Protobuf type {@code FormCheckbox}
 */
public final class FormCheckbox extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:FormCheckbox)
    FormCheckboxOrBuilder {
  // Use FormCheckbox.newBuilder() to construct.
  private FormCheckbox(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private FormCheckbox(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final FormCheckbox defaultInstance;
  public static FormCheckbox getDefaultInstance() {
    return defaultInstance;
  }

  public FormCheckbox getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private FormCheckbox(
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
            description_ = bs;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            checked_ = input.readBool();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            required_ = input.readBool();
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
    return GooglePlay.internal_static_FormCheckbox_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_FormCheckbox_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FormCheckbox.class, Builder.class);
  }

  public static com.google.protobuf.Parser<FormCheckbox> PARSER =
      new com.google.protobuf.AbstractParser<FormCheckbox>() {
    public FormCheckbox parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FormCheckbox(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<FormCheckbox> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  private Object description_;
  /**
   * <code>optional string description = 1;</code>
   */
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string description = 1;</code>
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
   * <code>optional string description = 1;</code>
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

  public static final int CHECKED_FIELD_NUMBER = 2;
  private boolean checked_;
  /**
   * <code>optional bool checked = 2;</code>
   */
  public boolean hasChecked() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional bool checked = 2;</code>
   */
  public boolean getChecked() {
    return checked_;
  }

  public static final int REQUIRED_FIELD_NUMBER = 3;
  private boolean required_;
  /**
   * <code>optional bool required = 3;</code>
   */
  public boolean hasRequired() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bool required = 3;</code>
   */
  public boolean getRequired() {
    return required_;
  }

  private void initFields() {
    description_ = "";
    checked_ = false;
    required_ = false;
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
      output.writeBytes(1, getDescriptionBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBool(2, checked_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(3, required_);
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
        .computeBytesSize(1, getDescriptionBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, checked_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, required_);
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

  public static FormCheckbox parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FormCheckbox parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FormCheckbox parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FormCheckbox parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FormCheckbox parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static FormCheckbox parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static FormCheckbox parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static FormCheckbox parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static FormCheckbox parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static FormCheckbox parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(FormCheckbox prototype) {
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
   * Protobuf type {@code FormCheckbox}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FormCheckbox)
      com.thunderclouddev.playstoreapi.proto.FormCheckboxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_FormCheckbox_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_FormCheckbox_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FormCheckbox.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.FormCheckbox.newBuilder()
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
      description_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      checked_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      required_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_FormCheckbox_descriptor;
    }

    public FormCheckbox getDefaultInstanceForType() {
      return FormCheckbox.getDefaultInstance();
    }

    public FormCheckbox build() {
      FormCheckbox result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public FormCheckbox buildPartial() {
      FormCheckbox result = new FormCheckbox(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.description_ = description_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.checked_ = checked_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.required_ = required_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof FormCheckbox) {
        return mergeFrom((FormCheckbox)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FormCheckbox other) {
      if (other == FormCheckbox.getDefaultInstance()) return this;
      if (other.hasDescription()) {
        bitField0_ |= 0x00000001;
        description_ = other.description_;
        onChanged();
      }
      if (other.hasChecked()) {
        setChecked(other.getChecked());
      }
      if (other.hasRequired()) {
        setRequired(other.getRequired());
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
      FormCheckbox parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FormCheckbox) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object description_ = "";
    /**
     * <code>optional string description = 1;</code>
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string description = 1;</code>
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
     * <code>optional string description = 1;</code>
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
     * <code>optional string description = 1;</code>
     */
    public Builder setDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 1;</code>
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000001);
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 1;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      description_ = value;
      onChanged();
      return this;
    }

    private boolean checked_ ;
    /**
     * <code>optional bool checked = 2;</code>
     */
    public boolean hasChecked() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool checked = 2;</code>
     */
    public boolean getChecked() {
      return checked_;
    }
    /**
     * <code>optional bool checked = 2;</code>
     */
    public Builder setChecked(boolean value) {
      bitField0_ |= 0x00000002;
      checked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool checked = 2;</code>
     */
    public Builder clearChecked() {
      bitField0_ = (bitField0_ & ~0x00000002);
      checked_ = false;
      onChanged();
      return this;
    }

    private boolean required_ ;
    /**
     * <code>optional bool required = 3;</code>
     */
    public boolean hasRequired() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool required = 3;</code>
     */
    public boolean getRequired() {
      return required_;
    }
    /**
     * <code>optional bool required = 3;</code>
     */
    public Builder setRequired(boolean value) {
      bitField0_ |= 0x00000004;
      required_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool required = 3;</code>
     */
    public Builder clearRequired() {
      bitField0_ = (bitField0_ & ~0x00000004);
      required_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:FormCheckbox)
  }

  static {
    defaultInstance = new FormCheckbox(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:FormCheckbox)
}

