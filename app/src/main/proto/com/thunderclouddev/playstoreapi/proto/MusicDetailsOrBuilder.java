// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface MusicDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MusicDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 censoring = 1;</code>
   */
  boolean hasCensoring();
  /**
   * <code>optional int32 censoring = 1;</code>
   */
  int getCensoring();

  /**
   * <code>optional int32 durationSec = 2;</code>
   */
  boolean hasDurationSec();
  /**
   * <code>optional int32 durationSec = 2;</code>
   */
  int getDurationSec();

  /**
   * <code>optional string originalReleaseDate = 3;</code>
   */
  boolean hasOriginalReleaseDate();
  /**
   * <code>optional string originalReleaseDate = 3;</code>
   */
  java.lang.String getOriginalReleaseDate();
  /**
   * <code>optional string originalReleaseDate = 3;</code>
   */
  com.google.protobuf.ByteString
      getOriginalReleaseDateBytes();

  /**
   * <code>optional string label = 4;</code>
   */
  boolean hasLabel();
  /**
   * <code>optional string label = 4;</code>
   */
  java.lang.String getLabel();
  /**
   * <code>optional string label = 4;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>repeated .ArtistDetails artist = 5;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.ArtistDetails>
      getArtistList();
  /**
   * <code>repeated .ArtistDetails artist = 5;</code>
   */
  com.thunderclouddev.playstoreapi.proto.ArtistDetails getArtist(int index);
  /**
   * <code>repeated .ArtistDetails artist = 5;</code>
   */
  int getArtistCount();
  /**
   * <code>repeated .ArtistDetails artist = 5;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.ArtistDetailsOrBuilder>
      getArtistOrBuilderList();
  /**
   * <code>repeated .ArtistDetails artist = 5;</code>
   */
  com.thunderclouddev.playstoreapi.proto.ArtistDetailsOrBuilder getArtistOrBuilder(
      int index);

  /**
   * <code>repeated string genre = 6;</code>
   */
  com.google.protobuf.ProtocolStringList
      getGenreList();
  /**
   * <code>repeated string genre = 6;</code>
   */
  int getGenreCount();
  /**
   * <code>repeated string genre = 6;</code>
   */
  java.lang.String getGenre(int index);
  /**
   * <code>repeated string genre = 6;</code>
   */
  com.google.protobuf.ByteString
      getGenreBytes(int index);

  /**
   * <code>optional string releaseDate = 7;</code>
   */
  boolean hasReleaseDate();
  /**
   * <code>optional string releaseDate = 7;</code>
   */
  java.lang.String getReleaseDate();
  /**
   * <code>optional string releaseDate = 7;</code>
   */
  com.google.protobuf.ByteString
      getReleaseDateBytes();

  /**
   * <code>repeated int32 releaseType = 8;</code>
   */
  java.util.List<java.lang.Integer> getReleaseTypeList();
  /**
   * <code>repeated int32 releaseType = 8;</code>
   */
  int getReleaseTypeCount();
  /**
   * <code>repeated int32 releaseType = 8;</code>
   */
  int getReleaseType(int index);
}
