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

public interface RelatedLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RelatedLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string label = 1;</code>
   */
  boolean hasLabel();
  /**
   * <code>optional string label = 1;</code>
   */
  String getLabel();
  /**
   * <code>optional string label = 1;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>optional string url1 = 2;</code>
   */
  boolean hasUrl1();
  /**
   * <code>optional string url1 = 2;</code>
   */
  String getUrl1();
  /**
   * <code>optional string url1 = 2;</code>
   */
  com.google.protobuf.ByteString
      getUrl1Bytes();

  /**
   * <code>optional string url2 = 3;</code>
   */
  boolean hasUrl2();
  /**
   * <code>optional string url2 = 3;</code>
   */
  String getUrl2();
  /**
   * <code>optional string url2 = 3;</code>
   */
  com.google.protobuf.ByteString
      getUrl2Bytes();
}
