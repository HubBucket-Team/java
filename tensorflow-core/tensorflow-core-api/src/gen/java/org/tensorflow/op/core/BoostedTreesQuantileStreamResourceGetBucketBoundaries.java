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

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Generate the bucket boundaries for each feature based on accumulated summaries.
 * <p>
 * An op that returns a list of float tensors for a quantile stream resource. Each
 * tensor is Rank 1 containing bucket boundaries for a single feature.
 */
public final class BoostedTreesQuantileStreamResourceGetBucketBoundaries extends PrimitiveOp implements Iterable<Operand<Float>> {
  
  /**
   * Factory method to create a class wrapping a new BoostedTreesQuantileStreamResourceGetBucketBoundaries operation.
   * 
   * @param scope current scope
   * @param quantileStreamResourceHandle resource handle referring to a QuantileStreamResource.
   * @param numFeatures inferred int; number of features to get bucket boundaries for.
   * @return a new instance of BoostedTreesQuantileStreamResourceGetBucketBoundaries
   */
  public static BoostedTreesQuantileStreamResourceGetBucketBoundaries create(Scope scope, Operand<?> quantileStreamResourceHandle, Long numFeatures) {
    OperationBuilder opBuilder = scope.env().opBuilder("BoostedTreesQuantileStreamResourceGetBucketBoundaries", scope.makeOpName("BoostedTreesQuantileStreamResourceGetBucketBoundaries"));
    opBuilder.addInput(quantileStreamResourceHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("num_features", numFeatures);
    return new BoostedTreesQuantileStreamResourceGetBucketBoundaries(opBuilder.build());
  }
  
  /**
   * float; List of Rank 1 Tensors each containing the bucket boundaries for a feature.
   */
  public List<Output<Float>> bucketBoundaries() {
    return bucketBoundaries;
  }
  
  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<Float>> iterator() {
    return (Iterator) bucketBoundaries.iterator();
  }
  
  private List<Output<Float>> bucketBoundaries;
  
  @SuppressWarnings("unchecked")
  private BoostedTreesQuantileStreamResourceGetBucketBoundaries(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int bucketBoundariesLength = operation.outputListLength("bucket_boundaries");
    bucketBoundaries = Arrays.asList((Output<Float>[])operation.outputList(outputIdx, bucketBoundariesLength));
    outputIdx += bucketBoundariesLength;
  }
}
