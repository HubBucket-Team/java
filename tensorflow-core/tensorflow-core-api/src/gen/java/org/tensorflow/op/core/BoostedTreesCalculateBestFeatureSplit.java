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
 * Calculates gains for each feature and returns the best possible split information for the feature.
 * <p>
 * The split information is the best threshold (bucket id), gains and left/right node contributions per node for each feature.
 * <p>
 * It is possible that not all nodes can be split on each feature. Hence, the list of possible nodes can differ between the features. Therefore, we return `node_ids_list` for each feature, containing the list of nodes that this feature can be used to split.
 * <p>
 * In this manner, the output is the best split per features and per node, so that it needs to be combined later to produce the best split for each node (among all possible features).
 * <p>
 * The output shapes are compatible in a way that the first dimension of all tensors are the same and equal to the number of possible split nodes for each feature.
 */
public final class BoostedTreesCalculateBestFeatureSplit extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.BoostedTreesCalculateBestFeatureSplit}
   */
  public static class Options {
    
    /**
     * @param splitType A string indicating if this Op should perform inequality split or equality split.
     */
    public Options splitType(String splitType) {
      this.splitType = splitType;
      return this;
    }
    
    private String splitType;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesCalculateBestFeatureSplit operation.
   * 
   * @param scope current scope
   * @param nodeIdRange A Rank 1 tensor (shape=[2]) to specify the range [first, last) of node ids to process within `stats_summary_list`. The nodes are iterated between the two nodes specified by the tensor, as like `for node_id in range(node_id_range[0], node_id_range[1])` (Note that the last index node_id_range[1] is exclusive).
   * @param statsSummary A Rank 4 tensor (#shape=[max_splits, feature_dims, bucket, stats_dims]) for accumulated stats summary (gradient/hessian) per node, per dimension, per buckets for each feature.
   * The first dimension of the tensor is the maximum number of splits, and thus not all elements of it will be used, but only the indexes specified by node_ids will be used.
   * @param l1 l1 regularization factor on leaf weights, per instance based.
   * @param l2 l2 regularization factor on leaf weights, per instance based.
   * @param treeComplexity adjustment to the gain, per leaf based.
   * @param minNodeWeight mininum avg of hessians in a node before required for the node to be considered for splitting.
   * @param logitsDimension The dimension of logit, i.e., number of classes.
   * @param options carries optional attributes values
   * @return a new instance of BoostedTreesCalculateBestFeatureSplit
   */
  public static BoostedTreesCalculateBestFeatureSplit create(Scope scope, Operand<Integer> nodeIdRange, Operand<Float> statsSummary, Operand<Float> l1, Operand<Float> l2, Operand<Float> treeComplexity, Operand<Float> minNodeWeight, Long logitsDimension, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesCalculateBestFeatureSplit", scope.makeOpName("BoostedTreesCalculateBestFeatureSplit"));
    opBuilder.addInput(nodeIdRange.asOutput());
    opBuilder.addInput(statsSummary.asOutput());
    opBuilder.addInput(l1.asOutput());
    opBuilder.addInput(l2.asOutput());
    opBuilder.addInput(treeComplexity.asOutput());
    opBuilder.addInput(minNodeWeight.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("logits_dimension", logitsDimension);
    if (options != null) {
      for (Options opts : options) {
        if (opts.splitType != null) {
          opBuilder.setAttr("split_type", opts.splitType);
        }
      }
    }
    return new BoostedTreesCalculateBestFeatureSplit(opBuilder.build());
  }
  
  /**
   * @param splitType A string indicating if this Op should perform inequality split or equality split.
   */
  public static Options splitType(String splitType) {
    return new Options().splitType(splitType);
  }
  
  /**
   * A Rank 1 tensors indicating possible split node ids for each feature. The length of the list is num_features, but each tensor has different size as each feature provides different possible nodes. See above for details like shapes and sizes.
   */
  public Output<Integer> nodeIds() {
    return nodeIds;
  }
  
  /**
   * A Rank 1 tensors indicating the best gains for each feature to split for certain nodes. See above for details like shapes and sizes.
   */
  public Output<Float> gains() {
    return gains;
  }
  
  /**
   * A Rank 1 tensors indicating the best feature dimension for each feature to split for certain nodes if the feature is multi-dimension. See above for details like shapes and sizes.
   */
  public Output<Integer> featureDimensions() {
    return featureDimensions;
  }
  
  /**
   * A Rank 1 tensors indicating the bucket id to compare with (as a threshold) for split in each node. See above for details like shapes and sizes.
   */
  public Output<Integer> thresholds() {
    return thresholds;
  }
  
  /**
   * A Rank 2 tensors indicating the contribution of the left nodes when branching from parent nodes (given by the tensor element in the output node_ids_list) to the left direction by the given threshold for each feature. This value will be used to make the left node value by adding to the parent node value. Second dimension size is 1 for 1-dimensional logits, but would be larger for multi-class problems. See above for details like shapes and sizes.
   */
  public Output<Float> leftNodeContribs() {
    return leftNodeContribs;
  }
  
  /**
   * A Rank 2 tensors, with the same shape/conditions as left_node_contribs_list, but just that the value is for the right node.
   */
  public Output<Float> rightNodeContribs() {
    return rightNodeContribs;
  }
  
  /**
   * A Rank 1 tensors indicating the which direction to go if data is missing. See above for details like shapes and sizes.
   */
  public Output<String> splitWithDefaultDirections() {
    return splitWithDefaultDirections;
  }
  
  private Output<Integer> nodeIds;
  private Output<Float> gains;
  private Output<Integer> featureDimensions;
  private Output<Integer> thresholds;
  private Output<Float> leftNodeContribs;
  private Output<Float> rightNodeContribs;
  private Output<String> splitWithDefaultDirections;
  
  private BoostedTreesCalculateBestFeatureSplit(Operation operation) {
    super(operation);
    int outputIdx = 0;
    nodeIds = operation.output(outputIdx++);
    gains = operation.output(outputIdx++);
    featureDimensions = operation.output(outputIdx++);
    thresholds = operation.output(outputIdx++);
    leftNodeContribs = operation.output(outputIdx++);
    rightNodeContribs = operation.output(outputIdx++);
    splitWithDefaultDirections = operation.output(outputIdx++);
  }
}
