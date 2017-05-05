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

public interface AndroidAppNotificationDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AndroidAppNotificationData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 versionCode = 1;</code>
   */
  boolean hasVersionCode();
  /**
   * <code>optional int32 versionCode = 1;</code>
   */
  int getVersionCode();

  /**
   * <code>optional string assetId = 2;</code>
   */
  boolean hasAssetId();
  /**
   * <code>optional string assetId = 2;</code>
   */
  String getAssetId();
  /**
   * <code>optional string assetId = 2;</code>
   */
  com.google.protobuf.ByteString
      getAssetIdBytes();
}