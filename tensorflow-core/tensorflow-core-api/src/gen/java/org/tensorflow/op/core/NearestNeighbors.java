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
 * Selects the k nearest centers for each point.
 * <p>
 * Rows of points are assumed to be input points. Rows of centers are assumed to be
 * the list of candidate centers. For each point, the k centers that have least L2
 * distance to it are computed.
 */
public final class NearestNeighbors extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new NearestNeighbors operation.
   * 
   * @param scope current scope
   * @param points Matrix of shape (n, d). Rows are assumed to be input points.
   * @param centers Matrix of shape (m, d). Rows are assumed to be centers.
   * @param k Number of nearest centers to return for each point. If k is larger than m, then
   * only m centers are returned.
   * @return a new instance of NearestNeighbors
   */
  public static NearestNeighbors create(Scope scope, Operand<Float> points, Operand<Float> centers, Operand<Long> k) {
    OperationBuilder opBuilder = scope.env().opBuilder("NearestNeighbors", scope.makeOpName("NearestNeighbors"));
    opBuilder.addInput(points.asOutput());
    opBuilder.addInput(centers.asOutput());
    opBuilder.addInput(k.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new NearestNeighbors(opBuilder.build());
  }
  
  /**
   * Matrix of shape (n, min(m, k)). Each row contains the indices of the centers
   * closest to the corresponding point, ordered by increasing distance.
   */
  public Output<Long> nearestCenterIndices() {
    return nearestCenterIndices;
  }
  
  /**
   * Matrix of shape (n, min(m, k)). Each row contains the squared L2 distance to the
   * corresponding center in nearest_center_indices.
   */
  public Output<Float> nearestCenterDistances() {
    return nearestCenterDistances;
  }
  
  private Output<Long> nearestCenterIndices;
  private Output<Float> nearestCenterDistances;
  
  private NearestNeighbors(Operation operation) {
    super(operation);
    int outputIdx = 0;
    nearestCenterIndices = operation.output(outputIdx++);
    nearestCenterDistances = operation.output(outputIdx++);
  }
}
