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

public interface PackageInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PackageInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string pkgName = 1;</code>
   */
  boolean hasPkgName();
  /**
   * <code>optional string pkgName = 1;</code>
   */
  String getPkgName();
  /**
   * <code>optional string pkgName = 1;</code>
   */
  com.google.protobuf.ByteString
      getPkgNameBytes();

  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  boolean hasVersionCode();
  /**
   * <code>optional int32 versionCode = 2;</code>
   */
  int getVersionCode();
}