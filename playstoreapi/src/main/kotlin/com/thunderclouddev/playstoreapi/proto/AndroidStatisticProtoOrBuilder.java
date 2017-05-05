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

public interface AndroidStatisticProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AndroidStatisticProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string tag = 1;</code>
   */
  boolean hasTag();
  /**
   * <code>optional string tag = 1;</code>
   */
  String getTag();
  /**
   * <code>optional string tag = 1;</code>
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <code>optional int32 count = 2;</code>
   */
  boolean hasCount();
  /**
   * <code>optional int32 count = 2;</code>
   */
  int getCount();

  /**
   * <code>optional float sum = 3;</code>
   */
  boolean hasSum();
  /**
   * <code>optional float sum = 3;</code>
   */
  float getSum();
}
