// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface GetReviewsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetReviewsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Review review = 1;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.Review>
      getReviewList();
  /**
   * <code>repeated .Review review = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.Review getReview(int index);
  /**
   * <code>repeated .Review review = 1;</code>
   */
  int getReviewCount();
  /**
   * <code>repeated .Review review = 1;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.ReviewOrBuilder>
      getReviewOrBuilderList();
  /**
   * <code>repeated .Review review = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.ReviewOrBuilder getReviewOrBuilder(
      int index);

  /**
   * <code>optional int64 matchingCount = 2;</code>
   */
  boolean hasMatchingCount();
  /**
   * <code>optional int64 matchingCount = 2;</code>
   */
  long getMatchingCount();
}
