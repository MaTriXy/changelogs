// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface ChallengeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Challenge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  boolean hasAddressChallenge();
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.AddressChallenge getAddressChallenge();
  /**
   * <code>optional .AddressChallenge addressChallenge = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.AddressChallengeOrBuilder getAddressChallengeOrBuilder();

  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  boolean hasAuthenticationChallenge();
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  com.thunderclouddev.playstoreapi.proto.AuthenticationChallenge getAuthenticationChallenge();
  /**
   * <code>optional .AuthenticationChallenge authenticationChallenge = 2;</code>
   */
  com.thunderclouddev.playstoreapi.proto.AuthenticationChallengeOrBuilder getAuthenticationChallengeOrBuilder();
}
