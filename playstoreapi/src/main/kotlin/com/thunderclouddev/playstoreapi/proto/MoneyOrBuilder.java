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

public interface MoneyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Money)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 micros = 1;</code>
   */
  boolean hasMicros();
  /**
   * <code>optional int64 micros = 1;</code>
   */
  long getMicros();

  /**
   * <code>optional string currencyCode = 2;</code>
   */
  boolean hasCurrencyCode();
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  String getCurrencyCode();
  /**
   * <code>optional string currencyCode = 2;</code>
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  boolean hasFormattedAmount();
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  String getFormattedAmount();
  /**
   * <code>optional string formattedAmount = 3;</code>
   */
  com.google.protobuf.ByteString
      getFormattedAmountBytes();
}
