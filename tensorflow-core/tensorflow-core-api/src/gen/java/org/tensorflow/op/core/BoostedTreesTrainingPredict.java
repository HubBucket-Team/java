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
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Runs multiple additive regression ensemble predictors on input instances and
 * <p>
 * computes the update to cached logits. It is designed to be used during training.
 * It traverses the trees starting from cached tree id and cached node id and
 * calculates the updates to be pushed to the cache.
 */
public final class BoostedTreesTrainingPredict extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesTrainingPredict operation.
   * 
   * @param scope current scope
   * @param treeEnsembleHandle 
   * @param cachedTreeIds Rank 1 Tensor containing cached tree ids which is the starting
   * tree of prediction.
   * @param cachedNodeIds Rank 1 Tensor containing cached node id which is the starting
   * node of prediction.
   * @param bucketizedFeatures A list of rank 1 Tensors containing bucket id for each
   * feature.
   * @param logitsDimension scalar, dimension of the logits, to be used for partial logits
   * shape.
   * @return a new instance of BoostedTreesTrainingPredict
   */
  public static BoostedTreesTrainingPredict create(Scope scope, Operand<?> treeEnsembleHandle, Operand<Integer> cachedTreeIds, Operand<Integer> cachedNodeIds, Iterable<Operand<Integer>> bucketizedFeatures, Long logitsDimension) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesTrainingPredict", scope.makeOpName("BoostedTreesTrainingPredict"));
    opBuilder.addInput(treeEnsembleHandle.asOutput());
    opBuilder.addInput(cachedTreeIds.asOutput());
    opBuilder.addInput(cachedNodeIds.asOutput());
    opBuilder.addInputList(Operands.asOutputs(bucketizedFeatures));
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("logits_dimension", logitsDimension);
    return new BoostedTreesTrainingPredict(opBuilder.build());
  }
  
  /**
   * Rank 2 Tensor containing logits update (with respect to cached
   * values stored) for each example.
   */
  public Output<Float> partialLogits() {
    return partialLogits;
  }
  
  /**
   * Rank 1 Tensor containing new tree ids for each example.
   */
  public Output<Integer> treeIds() {
    return treeIds;
  }
  
  /**
   * Rank 1 Tensor containing new node ids in the new tree_ids.
   */
  public Output<Integer> nodeIds() {
    return nodeIds;
  }
  
  private Output<Float> partialLogits;
  private Output<Integer> treeIds;
  private Output<Integer> nodeIds;
  
  private BoostedTreesTrainingPredict(Operation operation) {
    super(operation);
    int outputIdx = 0;
    partialLogits = operation.output(outputIdx++);
    treeIds = operation.output(outputIdx++);
    nodeIds = operation.output(outputIdx++);
  }
}
