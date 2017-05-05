// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface AndroidAppPatchDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AndroidAppPatchData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 baseVersionCode = 1;</code>
   */
  boolean hasBaseVersionCode();
  /**
   * <code>optional int32 baseVersionCode = 1;</code>
   */
  int getBaseVersionCode();

  /**
   * <code>optional string baseSignature = 2;</code>
   */
  boolean hasBaseSignature();
  /**
   * <code>optional string baseSignature = 2;</code>
   */
  java.lang.String getBaseSignature();
  /**
   * <code>optional string baseSignature = 2;</code>
   */
  com.google.protobuf.ByteString
      getBaseSignatureBytes();

  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  boolean hasDownloadUrl();
  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  java.lang.String getDownloadUrl();
  /**
   * <code>optional string downloadUrl = 3;</code>
   */
  com.google.protobuf.ByteString
      getDownloadUrlBytes();

  /**
   * <code>optional int32 patchFormat = 4;</code>
   */
  boolean hasPatchFormat();
  /**
   * <code>optional int32 patchFormat = 4;</code>
   */
  int getPatchFormat();

  /**
   * <code>optional int64 maxPatchSize = 5;</code>
   */
  boolean hasMaxPatchSize();
  /**
   * <code>optional int64 maxPatchSize = 5;</code>
   */
  long getMaxPatchSize();
}
