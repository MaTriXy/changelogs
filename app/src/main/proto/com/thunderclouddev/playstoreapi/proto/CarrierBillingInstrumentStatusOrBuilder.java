// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface CarrierBillingInstrumentStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CarrierBillingInstrumentStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .CarrierTos carrierTos = 1;</code>
   */
  boolean hasCarrierTos();
  /**
   * <code>optional .CarrierTos carrierTos = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.CarrierTos getCarrierTos();
  /**
   * <code>optional .CarrierTos carrierTos = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.CarrierTosOrBuilder getCarrierTosOrBuilder();

  /**
   * <code>optional bool associationRequired = 2;</code>
   */
  boolean hasAssociationRequired();
  /**
   * <code>optional bool associationRequired = 2;</code>
   */
  boolean getAssociationRequired();

  /**
   * <code>optional bool passwordRequired = 3;</code>
   */
  boolean hasPasswordRequired();
  /**
   * <code>optional bool passwordRequired = 3;</code>
   */
  boolean getPasswordRequired();

  /**
   * <code>optional .PasswordPrompt carrierPasswordPrompt = 4;</code>
   */
  boolean hasCarrierPasswordPrompt();
  /**
   * <code>optional .PasswordPrompt carrierPasswordPrompt = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.PasswordPrompt getCarrierPasswordPrompt();
  /**
   * <code>optional .PasswordPrompt carrierPasswordPrompt = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.PasswordPromptOrBuilder getCarrierPasswordPromptOrBuilder();

  /**
   * <code>optional int32 apiVersion = 5;</code>
   */
  boolean hasApiVersion();
  /**
   * <code>optional int32 apiVersion = 5;</code>
   */
  int getApiVersion();

  /**
   * <code>optional string name = 6;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 6;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 6;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}