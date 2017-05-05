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
 * Protobuf type {@code TranslatedText}
 */
public final class TranslatedText extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:TranslatedText)
    TranslatedTextOrBuilder {
  // Use TranslatedText.newBuilder() to construct.
  private TranslatedText(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private TranslatedText(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final TranslatedText defaultInstance;
  public static TranslatedText getDefaultInstance() {
    return defaultInstance;
  }

  public TranslatedText getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private TranslatedText(
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
            text_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            sourceLocale_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            targetLocale_ = bs;
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
    return GooglePlay.internal_static_TranslatedText_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_TranslatedText_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TranslatedText.class, Builder.class);
  }

  public static com.google.protobuf.Parser<TranslatedText> PARSER =
      new com.google.protobuf.AbstractParser<TranslatedText>() {
    public TranslatedText parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TranslatedText(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<TranslatedText> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 1;
  private Object text_;
  /**
   * <code>optional string text = 1;</code>
   */
  public boolean hasText() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string text = 1;</code>
   */
  public String getText() {
    Object ref = text_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        text_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string text = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTextBytes() {
    Object ref = text_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCELOCALE_FIELD_NUMBER = 2;
  private Object sourceLocale_;
  /**
   * <code>optional string sourceLocale = 2;</code>
   */
  public boolean hasSourceLocale() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string sourceLocale = 2;</code>
   */
  public String getSourceLocale() {
    Object ref = sourceLocale_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        sourceLocale_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string sourceLocale = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSourceLocaleBytes() {
    Object ref = sourceLocale_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      sourceLocale_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGETLOCALE_FIELD_NUMBER = 3;
  private Object targetLocale_;
  /**
   * <code>optional string targetLocale = 3;</code>
   */
  public boolean hasTargetLocale() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional string targetLocale = 3;</code>
   */
  public String getTargetLocale() {
    Object ref = targetLocale_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        targetLocale_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string targetLocale = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTargetLocaleBytes() {
    Object ref = targetLocale_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      targetLocale_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private void initFields() {
    text_ = "";
    sourceLocale_ = "";
    targetLocale_ = "";
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
      output.writeBytes(1, getTextBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(2, getSourceLocaleBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, getTargetLocaleBytes());
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
        .computeBytesSize(1, getTextBytes());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getSourceLocaleBytes());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getTargetLocaleBytes());
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

  public static TranslatedText parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TranslatedText parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TranslatedText parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TranslatedText parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TranslatedText parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static TranslatedText parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static TranslatedText parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static TranslatedText parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static TranslatedText parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static TranslatedText parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(TranslatedText prototype) {
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
   * Protobuf type {@code TranslatedText}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TranslatedText)
      com.thunderclouddev.playstoreapi.proto.TranslatedTextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_TranslatedText_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_TranslatedText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TranslatedText.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.TranslatedText.newBuilder()
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
      text_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      sourceLocale_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      targetLocale_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_TranslatedText_descriptor;
    }

    public TranslatedText getDefaultInstanceForType() {
      return TranslatedText.getDefaultInstance();
    }

    public TranslatedText build() {
      TranslatedText result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public TranslatedText buildPartial() {
      TranslatedText result = new TranslatedText(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.text_ = text_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.sourceLocale_ = sourceLocale_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.targetLocale_ = targetLocale_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof TranslatedText) {
        return mergeFrom((TranslatedText)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TranslatedText other) {
      if (other == TranslatedText.getDefaultInstance()) return this;
      if (other.hasText()) {
        bitField0_ |= 0x00000001;
        text_ = other.text_;
        onChanged();
      }
      if (other.hasSourceLocale()) {
        bitField0_ |= 0x00000002;
        sourceLocale_ = other.sourceLocale_;
        onChanged();
      }
      if (other.hasTargetLocale()) {
        bitField0_ |= 0x00000004;
        targetLocale_ = other.targetLocale_;
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
      TranslatedText parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TranslatedText) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object text_ = "";
    /**
     * <code>optional string text = 1;</code>
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string text = 1;</code>
     */
    public String getText() {
      Object ref = text_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          text_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string text = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string text = 1;</code>
     */
    public Builder setText(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      text_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string text = 1;</code>
     */
    public Builder clearText() {
      bitField0_ = (bitField0_ & ~0x00000001);
      text_ = getDefaultInstance().getText();
      onChanged();
      return this;
    }
    /**
     * <code>optional string text = 1;</code>
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      text_ = value;
      onChanged();
      return this;
    }

    private Object sourceLocale_ = "";
    /**
     * <code>optional string sourceLocale = 2;</code>
     */
    public boolean hasSourceLocale() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string sourceLocale = 2;</code>
     */
    public String getSourceLocale() {
      Object ref = sourceLocale_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sourceLocale_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string sourceLocale = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSourceLocaleBytes() {
      Object ref = sourceLocale_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sourceLocale_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string sourceLocale = 2;</code>
     */
    public Builder setSourceLocale(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      sourceLocale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string sourceLocale = 2;</code>
     */
    public Builder clearSourceLocale() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sourceLocale_ = getDefaultInstance().getSourceLocale();
      onChanged();
      return this;
    }
    /**
     * <code>optional string sourceLocale = 2;</code>
     */
    public Builder setSourceLocaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      sourceLocale_ = value;
      onChanged();
      return this;
    }

    private Object targetLocale_ = "";
    /**
     * <code>optional string targetLocale = 3;</code>
     */
    public boolean hasTargetLocale() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string targetLocale = 3;</code>
     */
    public String getTargetLocale() {
      Object ref = targetLocale_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          targetLocale_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string targetLocale = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTargetLocaleBytes() {
      Object ref = targetLocale_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        targetLocale_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string targetLocale = 3;</code>
     */
    public Builder setTargetLocale(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      targetLocale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string targetLocale = 3;</code>
     */
    public Builder clearTargetLocale() {
      bitField0_ = (bitField0_ & ~0x00000004);
      targetLocale_ = getDefaultInstance().getTargetLocale();
      onChanged();
      return this;
    }
    /**
     * <code>optional string targetLocale = 3;</code>
     */
    public Builder setTargetLocaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      targetLocale_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:TranslatedText)
  }

  static {
    defaultInstance = new TranslatedText(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:TranslatedText)
}

