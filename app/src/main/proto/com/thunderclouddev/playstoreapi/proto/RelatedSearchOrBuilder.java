// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface RelatedSearchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RelatedSearch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string searchUrl = 1;</code>
   */
  boolean hasSearchUrl();
  /**
   * <code>optional string searchUrl = 1;</code>
   */
  java.lang.String getSearchUrl();
  /**
   * <code>optional string searchUrl = 1;</code>
   */
  com.google.protobuf.ByteString
      getSearchUrlBytes();

  /**
   * <code>optional string header = 2;</code>
   */
  boolean hasHeader();
  /**
   * <code>optional string header = 2;</code>
   */
  java.lang.String getHeader();
  /**
   * <code>optional string header = 2;</code>
   */
  com.google.protobuf.ByteString
      getHeaderBytes();

  /**
   * <code>optional int32 backendId = 3;</code>
   */
  boolean hasBackendId();
  /**
   * <code>optional int32 backendId = 3;</code>
   */
  int getBackendId();

  /**
   * <code>optional int32 docType = 4;</code>
   */
  boolean hasDocType();
  /**
   * <code>optional int32 docType = 4;</code>
   */
  int getDocType();

  /**
   * <code>optional bool current = 5;</code>
   */
  boolean hasCurrent();
  /**
   * <code>optional bool current = 5;</code>
   */
  boolean getCurrent();
}
