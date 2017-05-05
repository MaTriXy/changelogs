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

public interface FilterEvaluationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FilterEvaluationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  java.util.List<com.thunderclouddev.playstoreapi.proto.RuleEvaluation>
      getRuleEvaluationList();
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.RuleEvaluation getRuleEvaluation(int index);
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  int getRuleEvaluationCount();
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  java.util.List<? extends com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder>
      getRuleEvaluationOrBuilderList();
  /**
   * <code>repeated .RuleEvaluation ruleEvaluation = 1;</code>
   */
  com.thunderclouddev.playstoreapi.proto.RuleEvaluationOrBuilder getRuleEvaluationOrBuilder(
      int index);
}