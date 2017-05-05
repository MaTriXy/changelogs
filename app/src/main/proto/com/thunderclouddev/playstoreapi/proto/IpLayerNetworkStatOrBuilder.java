// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface IpLayerNetworkStatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:IpLayerNetworkStat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string networkDetails = 1;</code>
   */
  boolean hasNetworkDetails();
  /**
   * <code>optional string networkDetails = 1;</code>
   */
  java.lang.String getNetworkDetails();
  /**
   * <code>optional string networkDetails = 1;</code>
   */
  com.google.protobuf.ByteString
      getNetworkDetailsBytes();

  /**
   * <code>optional int32 type = 2;</code>
   */
  boolean hasType();
  /**
   * <code>optional int32 type = 2;</code>
   */
  int getType();

  /**
   * <code>repeated .IpLayerNetworkBucket ipLayerNetworkBucket = 3;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.IpLayerNetworkBucket>
      getIpLayerNetworkBucketList();
  /**
   * <code>repeated .IpLayerNetworkBucket ipLayerNetworkBucket = 3;</code>
   */
  com.thunderclouddev.playstoreapi.proto.IpLayerNetworkBucket getIpLayerNetworkBucket(int index);
  /**
   * <code>repeated .IpLayerNetworkBucket ipLayerNetworkBucket = 3;</code>
   */
  int getIpLayerNetworkBucketCount();
  /**
   * <code>repeated .IpLayerNetworkBucket ipLayerNetworkBucket = 3;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.IpLayerNetworkBucketOrBuilder>
      getIpLayerNetworkBucketOrBuilderList();
  /**
   * <code>repeated .IpLayerNetworkBucket ipLayerNetworkBucket = 3;</code>
   */
  com.thunderclouddev.playstoreapi.proto.IpLayerNetworkBucketOrBuilder getIpLayerNetworkBucketOrBuilder(
      int index);

  /**
   * <code>repeated .IpLayerAppStat ipLayerAppStat = 4;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.IpLayerAppStat>
      getIpLayerAppStatList();
  /**
   * <code>repeated .IpLayerAppStat ipLayerAppStat = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.IpLayerAppStat getIpLayerAppStat(int index);
  /**
   * <code>repeated .IpLayerAppStat ipLayerAppStat = 4;</code>
   */
  int getIpLayerAppStatCount();
  /**
   * <code>repeated .IpLayerAppStat ipLayerAppStat = 4;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.IpLayerAppStatOrBuilder>
      getIpLayerAppStatOrBuilderList();
  /**
   * <code>repeated .IpLayerAppStat ipLayerAppStat = 4;</code>
   */
  com.thunderclouddev.playstoreapi.proto.IpLayerAppStatOrBuilder getIpLayerAppStatOrBuilder(
      int index);
}
