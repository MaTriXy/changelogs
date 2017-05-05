// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface AndroidAppDeliveryDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AndroidAppDeliveryData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 downloadSize = 1;</code>
   */
  boolean hasDownloadSize();
  /**
   * <code>optional int64 downloadSize = 1;</code>
   */
  long getDownloadSize();

  /**
   * <code>optional string signature = 2;</code>
   */
  boolean hasSignature();
  /**
   * <code>optional string signature = 2;</code>
   */
  java.lang.String getSignature();
  /**
   * <code>optional string signature = 2;</code>
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

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
   * <code>repeated .AppFileMetadata additionalFile = 4;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.AppFileMetadata>
      getAdditionalFileList();
  /**
   * <code>repeated .AppFileMetadata additionalFile = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.AppFileMetadata getAdditionalFile(int index);
  /**
   * <code>repeated .AppFileMetadata additionalFile = 4;</code>
   */
  int getAdditionalFileCount();
  /**
   * <code>repeated .AppFileMetadata additionalFile = 4;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.AppFileMetadataOrBuilder>
      getAdditionalFileOrBuilderList();
  /**
   * <code>repeated .AppFileMetadata additionalFile = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.AppFileMetadataOrBuilder getAdditionalFileOrBuilder(
      int index);

  /**
   * <code>repeated .HttpCookie downloadAuthCookie = 5;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.HttpCookie>
      getDownloadAuthCookieList();
  /**
   * <code>repeated .HttpCookie downloadAuthCookie = 5;</code>
   */
  com.thunderclouddev.playstoreapi.proto.HttpCookie getDownloadAuthCookie(int index);
  /**
   * <code>repeated .HttpCookie downloadAuthCookie = 5;</code>
   */
  int getDownloadAuthCookieCount();
  /**
   * <code>repeated .HttpCookie downloadAuthCookie = 5;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.HttpCookieOrBuilder>
      getDownloadAuthCookieOrBuilderList();
  /**
   * <code>repeated .HttpCookie downloadAuthCookie = 5;</code>
   */
  com.thunderclouddev.playstoreapi.proto.HttpCookieOrBuilder getDownloadAuthCookieOrBuilder(
      int index);

  /**
   * <code>optional bool forwardLocked = 6;</code>
   */
  boolean hasForwardLocked();
  /**
   * <code>optional bool forwardLocked = 6;</code>
   */
  boolean getForwardLocked();

  /**
   * <code>optional int64 refundTimeout = 7;</code>
   */
  boolean hasRefundTimeout();
  /**
   * <code>optional int64 refundTimeout = 7;</code>
   */
  long getRefundTimeout();

  /**
   * <code>optional bool serverInitiated = 8;</code>
   */
  boolean hasServerInitiated();
  /**
   * <code>optional bool serverInitiated = 8;</code>
   */
  boolean getServerInitiated();

  /**
   * <code>optional int64 postInstallRefundWindowMillis = 9;</code>
   */
  boolean hasPostInstallRefundWindowMillis();
  /**
   * <code>optional int64 postInstallRefundWindowMillis = 9;</code>
   */
  long getPostInstallRefundWindowMillis();

  /**
   * <code>optional bool immediateStartNeeded = 10;</code>
   */
  boolean hasImmediateStartNeeded();
  /**
   * <code>optional bool immediateStartNeeded = 10;</code>
   */
  boolean getImmediateStartNeeded();

  /**
   * <code>optional .AndroidAppPatchData patchData = 11;</code>
   */
  boolean hasPatchData();
  /**
   * <code>optional .AndroidAppPatchData patchData = 11;</code>
   */
  com.thunderclouddev.playstoreapi.proto.AndroidAppPatchData getPatchData();
  /**
   * <code>optional .AndroidAppPatchData patchData = 11;</code>
   */
  com.thunderclouddev.playstoreapi.proto.AndroidAppPatchDataOrBuilder getPatchDataOrBuilder();

  /**
   * <code>optional .EncryptionParams encryptionParams = 12;</code>
   */
  boolean hasEncryptionParams();
  /**
   * <code>optional .EncryptionParams encryptionParams = 12;</code>
   */
  com.thunderclouddev.playstoreapi.proto.EncryptionParams getEncryptionParams();
  /**
   * <code>optional .EncryptionParams encryptionParams = 12;</code>
   */
  com.thunderclouddev.playstoreapi.proto.EncryptionParamsOrBuilder getEncryptionParamsOrBuilder();
}
