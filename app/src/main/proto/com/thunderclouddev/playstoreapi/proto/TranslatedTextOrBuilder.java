// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface TranslatedTextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TranslatedText)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string text = 1;</code>
   */
  boolean hasText();
  /**
   * <code>optional string text = 1;</code>
   */
  java.lang.String getText();
  /**
   * <code>optional string text = 1;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>optional string sourceLocale = 2;</code>
   */
  boolean hasSourceLocale();
  /**
   * <code>optional string sourceLocale = 2;</code>
   */
  java.lang.String getSourceLocale();
  /**
   * <code>optional string sourceLocale = 2;</code>
   */
  com.google.protobuf.ByteString
      getSourceLocaleBytes();

  /**
   * <code>optional string targetLocale = 3;</code>
   */
  boolean hasTargetLocale();
  /**
   * <code>optional string targetLocale = 3;</code>
   */
  java.lang.String getTargetLocale();
  /**
   * <code>optional string targetLocale = 3;</code>
   */
  com.google.protobuf.ByteString
      getTargetLocaleBytes();
}