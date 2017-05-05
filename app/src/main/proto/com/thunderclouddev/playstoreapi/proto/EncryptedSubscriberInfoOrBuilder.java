// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface EncryptedSubscriberInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EncryptedSubscriberInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string data = 1;</code>
   */
  boolean hasData();
  /**
   * <code>optional string data = 1;</code>
   */
  java.lang.String getData();
  /**
   * <code>optional string data = 1;</code>
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  boolean hasEncryptedKey();
  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  java.lang.String getEncryptedKey();
  /**
   * <code>optional string encryptedKey = 2;</code>
   */
  com.google.protobuf.ByteString
      getEncryptedKeyBytes();

  /**
   * <code>optional string signature = 3;</code>
   */
  boolean hasSignature();
  /**
   * <code>optional string signature = 3;</code>
   */
  java.lang.String getSignature();
  /**
   * <code>optional string signature = 3;</code>
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

  /**
   * <code>optional string initVector = 4;</code>
   */
  boolean hasInitVector();
  /**
   * <code>optional string initVector = 4;</code>
   */
  java.lang.String getInitVector();
  /**
   * <code>optional string initVector = 4;</code>
   */
  com.google.protobuf.ByteString
      getInitVectorBytes();

  /**
   * <code>optional int32 googleKeyVersion = 5;</code>
   */
  boolean hasGoogleKeyVersion();
  /**
   * <code>optional int32 googleKeyVersion = 5;</code>
   */
  int getGoogleKeyVersion();

  /**
   * <code>optional int32 carrierKeyVersion = 6;</code>
   */
  boolean hasCarrierKeyVersion();
  /**
   * <code>optional int32 carrierKeyVersion = 6;</code>
   */
  int getCarrierKeyVersion();
}