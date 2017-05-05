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

public interface DeliveryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DeliveryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .AndroidAppDeliveryData appDeliveryData = 2;</code>
   */
  boolean hasAppDeliveryData();
  /**
   * <code>optional .AndroidAppDeliveryData appDeliveryData = 2;</code>
   */
  AndroidAppDeliveryData getAppDeliveryData();
  /**
   * <code>optional .AndroidAppDeliveryData appDeliveryData = 2;</code>
   */
  AndroidAppDeliveryDataOrBuilder getAppDeliveryDataOrBuilder();
}