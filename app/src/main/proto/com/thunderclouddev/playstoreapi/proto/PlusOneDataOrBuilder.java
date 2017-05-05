// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface PlusOneDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PlusOneData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool setByUser = 1;</code>
   */
  boolean hasSetByUser();
  /**
   * <code>optional bool setByUser = 1;</code>
   */
  boolean getSetByUser();

  /**
   * <code>optional int64 total = 2;</code>
   */
  boolean hasTotal();
  /**
   * <code>optional int64 total = 2;</code>
   */
  long getTotal();

  /**
   * <code>optional int64 circlesTotal = 3;</code>
   */
  boolean hasCirclesTotal();
  /**
   * <code>optional int64 circlesTotal = 3;</code>
   */
  long getCirclesTotal();

  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.PlusPerson>
      getCirclesPeopleList();
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.PlusPerson getCirclesPeople(int index);
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  int getCirclesPeopleCount();
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.PlusPersonOrBuilder>
      getCirclesPeopleOrBuilderList();
  /**
   * <code>repeated .PlusPerson circlesPeople = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.PlusPersonOrBuilder getCirclesPeopleOrBuilder(
      int index);
}
