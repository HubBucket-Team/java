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

package org.tensorflow.op.sparse;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Applies a sparse gradient to a given accumulator.
 * <p>
 * Does not add if local_step is smaller than the accumulator's
 * global_step.
 */
@Operator(group = "sparse")
public final class SparseAccumulatorApplyGradient extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new SparseAccumulatorApplyGradient operation.
   * 
   * @param scope current scope
   * @param handle The handle to a accumulator.
   * @param localStep The local_step value at which the sparse gradient was computed.
   * @param gradientIndices Indices of the sparse gradient to be accumulated. Must be a
   * vector.
   * @param gradientValues Values are the non-zero slices of the gradient, and must have
   * the same first dimension as indices, i.e., the nnz represented by indices and
   * values must be consistent.
   * @param gradientShape Shape of the sparse gradient to be accumulated.
   * @param hasKnownShape Boolean indicating whether gradient_shape is unknown, in which
   * case the input is ignored during validation.
   * @return a new instance of SparseAccumulatorApplyGradient
   */
  public static <T> SparseAccumulatorApplyGradient create(Scope scope, Operand<String> handle, Operand<Long> localStep, Operand<Long> gradientIndices, Operand<T> gradientValues, Operand<Long> gradientShape, Boolean hasKnownShape) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseAccumulatorApplyGradient", scope.makeOpName("SparseAccumulatorApplyGradient"));
    opBuilder.addInput(handle.asOutput());
    opBuilder.addInput(localStep.asOutput());
    opBuilder.addInput(gradientIndices.asOutput());
    opBuilder.addInput(gradientValues.asOutput());
    opBuilder.addInput(gradientShape.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("has_known_shape", hasKnownShape);
    return new SparseAccumulatorApplyGradient(opBuilder.build());
  }
  
  
  private SparseAccumulatorApplyGradient(Operation operation) {
    super(operation);
  }
}
