// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface ClientLibraryStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientLibraryState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 corpus = 1;</code>
   */
  boolean hasCorpus();
  /**
   * <code>optional int32 corpus = 1;</code>
   */
  int getCorpus();

  /**
   * <code>optional bytes serverToken = 2;</code>
   */
  boolean hasServerToken();
  /**
   * <code>optional bytes serverToken = 2;</code>
   */
  com.google.protobuf.ByteString getServerToken();

  /**
   * <code>optional int64 hashCodeSum = 3;</code>
   */
  boolean hasHashCodeSum();
  /**
   * <code>optional int64 hashCodeSum = 3;</code>
   */
  long getHashCodeSum();

  /**
   * <code>optional int32 librarySize = 4;</code>
   */
  boolean hasLibrarySize();
  /**
   * <code>optional int32 librarySize = 4;</code>
   */
  int getLibrarySize();

  /**
   * <code>optional string libraryId = 5;</code>
   */
  boolean hasLibraryId();
  /**
   * <code>optional string libraryId = 5;</code>
   */
  java.lang.String getLibraryId();
  /**
   * <code>optional string libraryId = 5;</code>
   */
  com.google.protobuf.ByteString
      getLibraryIdBytes();
}
