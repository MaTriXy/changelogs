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

public interface DocumentVariantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DocumentVariant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 variationType = 1;</code>
   */
  boolean hasVariationType();
  /**
   * <code>optional int32 variationType = 1;</code>
   */
  int getVariationType();

  /**
   * <code>optional .Rule rule = 2;</code>
   */
  boolean hasRule();
  /**
   * <code>optional .Rule rule = 2;</code>
   */
  Rule getRule();
  /**
   * <code>optional .Rule rule = 2;</code>
   */
  RuleOrBuilder getRuleOrBuilder();

  /**
   * <code>optional string title = 3;</code>
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 3;</code>
   */
  String getTitle();
  /**
   * <code>optional string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>repeated string snippet = 4;</code>
   */
  com.google.protobuf.ProtocolStringList
      getSnippetList();
  /**
   * <code>repeated string snippet = 4;</code>
   */
  int getSnippetCount();
  /**
   * <code>repeated string snippet = 4;</code>
   */
  String getSnippet(int index);
  /**
   * <code>repeated string snippet = 4;</code>
   */
  com.google.protobuf.ByteString
      getSnippetBytes(int index);

  /**
   * <code>optional string recentChanges = 5;</code>
   */
  boolean hasRecentChanges();
  /**
   * <code>optional string recentChanges = 5;</code>
   */
  String getRecentChanges();
  /**
   * <code>optional string recentChanges = 5;</code>
   */
  com.google.protobuf.ByteString
      getRecentChangesBytes();

  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.TranslatedText>
      getAutoTranslationList();
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  com.thunderclouddev.playstoreapi.proto.TranslatedText getAutoTranslation(int index);
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  int getAutoTranslationCount();
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.TranslatedTextOrBuilder>
      getAutoTranslationOrBuilderList();
  /**
   * <code>repeated .TranslatedText autoTranslation = 6;</code>
   */
  com.thunderclouddev.playstoreapi.proto.TranslatedTextOrBuilder getAutoTranslationOrBuilder(
      int index);

  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  java.util.List<Offer>
      getOfferList();
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  Offer getOffer(int index);
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  int getOfferCount();
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  java.util.List<? extends OfferOrBuilder>
      getOfferOrBuilderList();
  /**
   * <code>repeated .Offer offer = 7;</code>
   */
  OfferOrBuilder getOfferOrBuilder(int index);

  /**
   * <code>optional int64 channelId = 9;</code>
   */
  boolean hasChannelId();
  /**
   * <code>optional int64 channelId = 9;</code>
   */
  long getChannelId();

  /**
   * <code>repeated .Document child = 10;</code>
   */
  java.util.List<Document>
      getChildList();
  /**
   * <code>repeated .Document child = 10;</code>
   */
  Document getChild(int index);
  /**
   * <code>repeated .Document child = 10;</code>
   */
  int getChildCount();
  /**
   * <code>repeated .Document child = 10;</code>
   */
  java.util.List<? extends DocumentOrBuilder>
      getChildOrBuilderList();
  /**
   * <code>repeated .Document child = 10;</code>
   */
  DocumentOrBuilder getChildOrBuilder(int index);

  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  java.util.List<Document>
      getDecorationList();
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  Document getDecoration(int index);
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  int getDecorationCount();
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  java.util.List<? extends DocumentOrBuilder>
      getDecorationOrBuilderList();
  /**
   * <code>repeated .Document decoration = 11;</code>
   */
  DocumentOrBuilder getDecorationOrBuilder(int index);
}