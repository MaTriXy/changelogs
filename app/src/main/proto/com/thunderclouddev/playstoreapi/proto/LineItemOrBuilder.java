// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface LineItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LineItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string description = 2;</code>
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional .Offer offer = 3;</code>
   */
  boolean hasOffer();
  /**
   * <code>optional .Offer offer = 3;</code>
   */
  com.thunderclouddev.playstoreapi.proto.Offer getOffer();
  /**
   * <code>optional .Offer offer = 3;</code>
   */
  com.thunderclouddev.playstoreapi.proto.OfferOrBuilder getOfferOrBuilder();

  /**
   * <code>optional .Money amount = 4;</code>
   */
  boolean hasAmount();
  /**
   * <code>optional .Money amount = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.Money getAmount();
  /**
   * <code>optional .Money amount = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.MoneyOrBuilder getAmountOrBuilder();
}