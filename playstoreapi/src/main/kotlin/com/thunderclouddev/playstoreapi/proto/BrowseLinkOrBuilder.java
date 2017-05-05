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

public interface BrowseLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BrowseLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   */
  String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string dataUrl = 3;</code>
   */
  boolean hasDataUrl();
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  String getDataUrl();
  /**
   * <code>optional string dataUrl = 3;</code>
   */
  com.google.protobuf.ByteString
      getDataUrlBytes();

  /**
   * <code>optional .Image icon = 5;</code>
   */
  boolean hasIcon();
  /**
   * <code>optional .Image icon = 5;</code>
   */
  Image getIcon();
  /**
   * <code>optional .Image icon = 5;</code>
   */
  ImageOrBuilder getIconOrBuilder();

  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  boolean hasUnknownCategoryContainer();
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainer getUnknownCategoryContainer();
  /**
   * <code>optional .UnknownCategoryContainer unknownCategoryContainer = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.UnknownCategoryContainerOrBuilder getUnknownCategoryContainerOrBuilder();
}