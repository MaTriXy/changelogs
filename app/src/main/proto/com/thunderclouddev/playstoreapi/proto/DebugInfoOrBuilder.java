// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface DebugInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DebugInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string message = 1;</code>
   */
  com.google.protobuf.ProtocolStringList
      getMessageList();
  /**
   * <code>repeated string message = 1;</code>
   */
  int getMessageCount();
  /**
   * <code>repeated string message = 1;</code>
   */
  java.lang.String getMessage(int index);
  /**
   * <code>repeated string message = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes(int index);

  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.DebugInfo.Timing>
      getTimingList();
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  com.thunderclouddev.playstoreapi.proto.DebugInfo.Timing getTiming(int index);
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  int getTimingCount();
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.DebugInfo.TimingOrBuilder>
      getTimingOrBuilderList();
  /**
   * <code>repeated group Timing = 2 { ... }</code>
   */
  com.thunderclouddev.playstoreapi.proto.DebugInfo.TimingOrBuilder getTimingOrBuilder(
      int index);
}
