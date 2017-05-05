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

public interface FileMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FileMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 fileType = 1;</code>
   */
  boolean hasFileType();
  /**
   * <code>optional int32 fileType = 1;</code>
   */
  int getFileType();

  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  boolean hasVersionCode();
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  int getVersionCode();

  /**
   * <code>optional int64 size = 3;</code>
   */
  boolean hasSize();
  /**
   * <code>optional int64 size = 3;</code>
   */
  long getSize();
}