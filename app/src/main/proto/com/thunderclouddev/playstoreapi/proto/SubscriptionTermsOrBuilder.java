// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GooglePlay.proto

package com.thunderclouddev.playstoreapi.proto;

public interface SubscriptionTermsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SubscriptionTerms)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .TimePeriod recurringPeriod = 1;</code>
   */
  boolean hasRecurringPeriod();
  /**
   * <code>optional .TimePeriod recurringPeriod = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.TimePeriod getRecurringPeriod();
  /**
   * <code>optional .TimePeriod recurringPeriod = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.TimePeriodOrBuilder getRecurringPeriodOrBuilder();

  /**
   * <code>optional .TimePeriod trialPeriod = 2;</code>
   */
  boolean hasTrialPeriod();
  /**
   * <code>optional .TimePeriod trialPeriod = 2;</code>
   */
  com.thunderclouddev.playstoreapi.proto.TimePeriod getTrialPeriod();
  /**
   * <code>optional .TimePeriod trialPeriod = 2;</code>
   */
  com.thunderclouddev.playstoreapi.proto.TimePeriodOrBuilder getTrialPeriodOrBuilder();
}