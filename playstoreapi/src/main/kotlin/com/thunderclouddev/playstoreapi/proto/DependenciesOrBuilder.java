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

public interface DependenciesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Dependencies)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 unknown1 = 1;</code>
   */
  boolean hasUnknown1();
  /**
   * <code>optional int32 unknown1 = 1;</code>
   */
  int getUnknown1();

  /**
   * <code>optional int64 unknown2 = 2;</code>
   */
  boolean hasUnknown2();
  /**
   * <code>optional int64 unknown2 = 2;</code>
   */
  long getUnknown2();

  /**
   * <code>repeated .Dependency dependency = 3;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.Dependency>
      getDependencyList();
  /**
   * <code>repeated .Dependency dependency = 3;</code>
   */
  com.thunderclouddev.playstoreapi.proto.Dependency getDependency(int index);
  /**
   * <code>repeated .Dependency dependency = 3;</code>
   */
  int getDependencyCount();
  /**
   * <code>repeated .Dependency dependency = 3;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.DependencyOrBuilder>
      getDependencyOrBuilderList();
  /**
   * <code>repeated .Dependency dependency = 3;</code>
   */
  com.thunderclouddev.playstoreapi.proto.DependencyOrBuilder getDependencyOrBuilder(int index);

  /**
   * <code>optional int32 unknown3 = 4;</code>
   */
  boolean hasUnknown3();
  /**
   * <code>optional int32 unknown3 = 4;</code>
   */
  int getUnknown3();
}