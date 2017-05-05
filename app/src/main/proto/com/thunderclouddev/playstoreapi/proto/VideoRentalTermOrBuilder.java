// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface VideoRentalTermOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VideoRentalTerm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 offerType = 1;</code>
   */
  boolean hasOfferType();
  /**
   * <code>optional int32 offerType = 1;</code>
   */
  int getOfferType();

  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  boolean hasOfferAbbreviation();
  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  java.lang.String getOfferAbbreviation();
  /**
   * <code>optional string offerAbbreviation = 2;</code>
   */
  com.google.protobuf.ByteString
      getOfferAbbreviationBytes();

  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  boolean hasRentalHeader();
  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  java.lang.String getRentalHeader();
  /**
   * <code>optional string rentalHeader = 3;</code>
   */
  com.google.protobuf.ByteString
      getRentalHeaderBytes();

  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.VideoRentalTerm.Term>
      getTermList();
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  com.thunderclouddev.playstoreapi.proto.VideoRentalTerm.Term getTerm(int index);
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  int getTermCount();
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.VideoRentalTerm.TermOrBuilder>
      getTermOrBuilderList();
  /**
   * <code>repeated group Term = 4 { ... }</code>
   */
  com.thunderclouddev.playstoreapi.proto.VideoRentalTerm.TermOrBuilder getTermOrBuilder(
      int index);
}