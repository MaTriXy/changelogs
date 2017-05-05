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
 * Protobuf type {@code FilterEvaluationInfo}
 */
public final class FilterEvaluationInfo extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:FilterEvaluationInfo)
    FilterEvaluationInfoOrBuilder {
  // Use FilterEvaluationInfo.newBuilder() to construct.
  private FilterEvaluationInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private FilterEvaluationInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

  private static final FilterEvaluationInfo defaultInstance;
  public static FilterEvaluationInfo getDefaultInstance() {
    return defaultInstance;
  }

  public FilterEvaluationInfo getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final com.google.protobuf.UnknownFieldSet unknownFields;
  @Override
  public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
    return this.unknownFields;
  }
  private FilterEvaluationInfo(
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
              ruleEvaluation_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.RuleEvaluation>();
              mutable_bitField0_ |= 0x00000001;
            }
            ruleEvaluation_.add(input.readMessage(com.thunderclouddev.playstoreapi.proto.RuleEvaluation.PARSER, extensionRegistry));
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
        ruleEvaluation_ = java.util.Collections.unmodifiableList(ruleEvaluation_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GooglePlay.internal_static_FilterEvaluationInfo_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GooglePlay.internal_static_FilterEvaluationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FilterEvaluationInfo.class, Builder.class);
  }

  public static com.google.protobuf.Parser<FilterEvaluationInfo> PARSER =
      new com.google.protobuf.AbstractParser<FilterEvaluationInfo>() {
    public FilterEvaluationInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FilterEvaluationInfo(input, extensionRegistry);
    }
  };

  @Override
  public com.google.protobuf.Parser<FilterEvaluationInfo> getParserForType() {
    return PARSER;
  }

  public static final int RULEEVALUATION_FIELD_NUMBER = 1;
  private java.util.List<com.thunderclouddev.playstoreapi.proto.RuleEvaluation> ruleEvaluation_;
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  public java.util.List<com.thunderclouddev.playstoreapi.proto.RuleEvaluation> getRuleEvaluationList() {
    return ruleEvaluation_;
  }
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder>
      getRuleEvaluationOrBuilderList() {
    return ruleEvaluation_;
  }
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  public int getRuleEvaluationCount() {
    return ruleEvaluation_.size();
  }
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.RuleEvaluation getRuleEvaluation(int index) {
    return ruleEvaluation_.get(index);
  }
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  public com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder getRuleEvaluationOrBuilder(
      int index) {
    return ruleEvaluation_.get(index);
  }

  private void initFields() {
    ruleEvaluation_ = java.util.Collections.emptyList();
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
    for (int i = 0; i < ruleEvaluation_.size(); i++) {
      output.writeMessage(1, ruleEvaluation_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ruleEvaluation_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ruleEvaluation_.get(i));
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

  public static FilterEvaluationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FilterEvaluationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FilterEvaluationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FilterEvaluationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FilterEvaluationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static FilterEvaluationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static FilterEvaluationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static FilterEvaluationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static FilterEvaluationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static FilterEvaluationInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(FilterEvaluationInfo prototype) {
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
   * Protobuf type {@code FilterEvaluationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FilterEvaluationInfo)
      com.thunderclouddev.playstoreapi.proto.FilterEvaluationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GooglePlay.internal_static_FilterEvaluationInfo_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GooglePlay.internal_static_FilterEvaluationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FilterEvaluationInfo.class, Builder.class);
    }

    // Construct using com.thunderclouddev.playstoreapi.proto.FilterEvaluationInfo.newBuilder()
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
        getRuleEvaluationFieldBuilder();
      }
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      if (ruleEvaluationBuilder_ == null) {
        ruleEvaluation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ruleEvaluationBuilder_.clear();
      }
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GooglePlay.internal_static_FilterEvaluationInfo_descriptor;
    }

    public FilterEvaluationInfo getDefaultInstanceForType() {
      return FilterEvaluationInfo.getDefaultInstance();
    }

    public FilterEvaluationInfo build() {
      FilterEvaluationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public FilterEvaluationInfo buildPartial() {
      FilterEvaluationInfo result = new FilterEvaluationInfo(this);
      int from_bitField0_ = bitField0_;
      if (ruleEvaluationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          ruleEvaluation_ = java.util.Collections.unmodifiableList(ruleEvaluation_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ruleEvaluation_ = ruleEvaluation_;
      } else {
        result.ruleEvaluation_ = ruleEvaluationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof FilterEvaluationInfo) {
        return mergeFrom((FilterEvaluationInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FilterEvaluationInfo other) {
      if (other == FilterEvaluationInfo.getDefaultInstance()) return this;
      if (ruleEvaluationBuilder_ == null) {
        if (!other.ruleEvaluation_.isEmpty()) {
          if (ruleEvaluation_.isEmpty()) {
            ruleEvaluation_ = other.ruleEvaluation_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRuleEvaluationIsMutable();
            ruleEvaluation_.addAll(other.ruleEvaluation_);
          }
          onChanged();
        }
      } else {
        if (!other.ruleEvaluation_.isEmpty()) {
          if (ruleEvaluationBuilder_.isEmpty()) {
            ruleEvaluationBuilder_.dispose();
            ruleEvaluationBuilder_ = null;
            ruleEvaluation_ = other.ruleEvaluation_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ruleEvaluationBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRuleEvaluationFieldBuilder() : null;
          } else {
            ruleEvaluationBuilder_.addAllMessages(other.ruleEvaluation_);
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
      FilterEvaluationInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FilterEvaluationInfo) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.thunderclouddev.playstoreapi.proto.RuleEvaluation> ruleEvaluation_ =
      java.util.Collections.emptyList();
    private void ensureRuleEvaluationIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ruleEvaluation_ = new java.util.ArrayList<com.thunderclouddev.playstoreapi.proto.RuleEvaluation>(ruleEvaluation_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.RuleEvaluation, com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder, com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder> ruleEvaluationBuilder_;

    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.RuleEvaluation> getRuleEvaluationList() {
      if (ruleEvaluationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ruleEvaluation_);
      } else {
        return ruleEvaluationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public int getRuleEvaluationCount() {
      if (ruleEvaluationBuilder_ == null) {
        return ruleEvaluation_.size();
      } else {
        return ruleEvaluationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.RuleEvaluation getRuleEvaluation(int index) {
      if (ruleEvaluationBuilder_ == null) {
        return ruleEvaluation_.get(index);
      } else {
        return ruleEvaluationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder setRuleEvaluation(
        int index, com.thunderclouddev.playstoreapi.proto.RuleEvaluation value) {
      if (ruleEvaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleEvaluationIsMutable();
        ruleEvaluation_.set(index, value);
        onChanged();
      } else {
        ruleEvaluationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder setRuleEvaluation(
        int index, com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder builderForValue) {
      if (ruleEvaluationBuilder_ == null) {
        ensureRuleEvaluationIsMutable();
        ruleEvaluation_.set(index, builderForValue.build());
        onChanged();
      } else {
        ruleEvaluationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder addRuleEvaluation(com.thunderclouddev.playstoreapi.proto.RuleEvaluation value) {
      if (ruleEvaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleEvaluationIsMutable();
        ruleEvaluation_.add(value);
        onChanged();
      } else {
        ruleEvaluationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder addRuleEvaluation(
        int index, com.thunderclouddev.playstoreapi.proto.RuleEvaluation value) {
      if (ruleEvaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleEvaluationIsMutable();
        ruleEvaluation_.add(index, value);
        onChanged();
      } else {
        ruleEvaluationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder addRuleEvaluation(
        com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder builderForValue) {
      if (ruleEvaluationBuilder_ == null) {
        ensureRuleEvaluationIsMutable();
        ruleEvaluation_.add(builderForValue.build());
        onChanged();
      } else {
        ruleEvaluationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder addRuleEvaluation(
        int index, com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder builderForValue) {
      if (ruleEvaluationBuilder_ == null) {
        ensureRuleEvaluationIsMutable();
        ruleEvaluation_.add(index, builderForValue.build());
        onChanged();
      } else {
        ruleEvaluationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder addAllRuleEvaluation(
        Iterable<? extends com.thunderclouddev.playstoreapi.proto.RuleEvaluation> values) {
      if (ruleEvaluationBuilder_ == null) {
        ensureRuleEvaluationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ruleEvaluation_);
        onChanged();
      } else {
        ruleEvaluationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder clearRuleEvaluation() {
      if (ruleEvaluationBuilder_ == null) {
        ruleEvaluation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ruleEvaluationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public Builder removeRuleEvaluation(int index) {
      if (ruleEvaluationBuilder_ == null) {
        ensureRuleEvaluationIsMutable();
        ruleEvaluation_.remove(index);
        onChanged();
      } else {
        ruleEvaluationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder getRuleEvaluationBuilder(
        int index) {
      return getRuleEvaluationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder getRuleEvaluationOrBuilder(
        int index) {
      if (ruleEvaluationBuilder_ == null) {
        return ruleEvaluation_.get(index);  } else {
        return ruleEvaluationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public java.util.List<? extends com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder>
         getRuleEvaluationOrBuilderList() {
      if (ruleEvaluationBuilder_ != null) {
        return ruleEvaluationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ruleEvaluation_);
      }
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder addRuleEvaluationBuilder() {
      return getRuleEvaluationFieldBuilder().addBuilder(
          com.thunderclouddev.playstoreapi.proto.RuleEvaluation.getDefaultInstance());
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder addRuleEvaluationBuilder(
        int index) {
      return getRuleEvaluationFieldBuilder().addBuilder(
          index, com.thunderclouddev.playstoreapi.proto.RuleEvaluation.getDefaultInstance());
    }
    /**
     * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
     */
    public java.util.List<com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder>
         getRuleEvaluationBuilderList() {
      return getRuleEvaluationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.thunderclouddev.playstoreapi.proto.RuleEvaluation, com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder, com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder>
        getRuleEvaluationFieldBuilder() {
      if (ruleEvaluationBuilder_ == null) {
        ruleEvaluationBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.thunderclouddev.playstoreapi.proto.RuleEvaluation, com.thunderclouddev.playstoreapi.proto.RuleEvaluation.Builder, com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder>(
                ruleEvaluation_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        ruleEvaluation_ = null;
      }
      return ruleEvaluationBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:FilterEvaluationInfo)
  }

  static {
    defaultInstance = new FilterEvaluationInfo(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:FilterEvaluationInfo)
}

