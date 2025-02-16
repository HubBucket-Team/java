/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.core;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Retrieves the tree ensemble resource stamp token, number of trees and growing statistics.
 */
public final class BoostedTreesGetEnsembleStates extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesGetEnsembleStates operation.
   * 
   * @param scope current scope
   * @param treeEnsembleHandle Handle to the tree ensemble.
   * @return a new instance of BoostedTreesGetEnsembleStates
   */
  public static BoostedTreesGetEnsembleStates create(Scope scope, Operand<?> treeEnsembleHandle) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesGetEnsembleStates", scope.makeOpName("BoostedTreesGetEnsembleStates"));
    opBuilder.addInput(treeEnsembleHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new BoostedTreesGetEnsembleStates(opBuilder.build());
  }
  
  /**
   * Stamp token of the tree ensemble resource.
   */
  public Output<Long> stampToken() {
    return stampToken;
  }
  
  /**
   * The number of trees in the tree ensemble resource.
   */
  public Output<Integer> numTrees() {
    return numTrees;
  }
  
  /**
   * The number of trees that were finished successfully.
   */
  public Output<Integer> numFinalizedTrees() {
    return numFinalizedTrees;
  }
  
  /**
   * The number of layers we attempted to build (but not necessarily succeeded).
   */
  public Output<Integer> numAttemptedLayers() {
    return numAttemptedLayers;
  }
  
  /**
   * Rank size 2 tensor that contains start and end ids of the nodes in the latest
   * layer.
   */
  public Output<Integer> lastLayerNodesRange() {
    return lastLayerNodesRange;
  }
  
  private Output<Long> stampToken;
  private Output<Integer> numTrees;
  private Output<Integer> numFinalizedTrees;
  private Output<Integer> numAttemptedLayers;
  private Output<Integer> lastLayerNodesRange;
  
  private BoostedTreesGetEnsembleStates(Operation operation) {
    super(operation);
    int outputIdx = 0;
    stampToken = operation.output(outputIdx++);
    numTrees = operation.output(outputIdx++);
    numFinalizedTrees = operation.output(outputIdx++);
    numAttemptedLayers = operation.output(outputIdx++);
    lastLayerNodesRange = operation.output(outputIdx++);
  }
}
