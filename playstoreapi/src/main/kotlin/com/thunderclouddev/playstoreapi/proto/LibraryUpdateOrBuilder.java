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

public interface LibraryUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LibraryUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 status = 1;</code>
   */
  boolean hasStatus();
  /**
   * <code>optional int32 status = 1;</code>
   */
  int getStatus();

  /**
   * <code>optional int32 corpus = 2;</code>
   */
  boolean hasCorpus();
  /**
   * <code>optional int32 corpus = 2;</code>
   */
  int getCorpus();

  /**
   * <code>optional bytes serverToken = 3;</code>
   */
  boolean hasServerToken();
  /**
   * <code>optional bytes serverToken = 3;</code>
   */
  com.google.protobuf.ByteString getServerToken();

  /**
   * <code>repeated .LibraryMutation mutation = 4;</code>
   */
  java.util.List<LibraryMutation>
      getMutationList();
  /**
   * <code>repeated .LibraryMutation mutation = 4;</code>
   */
  LibraryMutation getMutation(int index);
  /**
   * <code>repeated .LibraryMutation mutation = 4;</code>
   */
  int getMutationCount();
  /**
   * <code>repeated .LibraryMutation mutation = 4;</code>
   */
  java.util.List<? extends LibraryMutationOrBuilder>
      getMutationOrBuilderList();
  /**
   * <code>repeated .LibraryMutation mutation = 4;</code>
   */
  LibraryMutationOrBuilder getMutationOrBuilder(int index);

  /**
   * <code>optional bool hasMore = 5;</code>
   */
  boolean hasHasMore();
  /**
   * <code>optional bool hasMore = 5;</code>
   */
  boolean getHasMore();

  /**
   * <code>optional string libraryId = 6;</code>
   */
  boolean hasLibraryId();
  /**
   * <code>optional string libraryId = 6;</code>
   */
  String getLibraryId();
  /**
   * <code>optional string libraryId = 6;</code>
   */
  com.google.protobuf.ByteString
      getLibraryIdBytes();
}
