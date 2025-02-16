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
 * Converts a `RaggedTensor` into a `SparseTensor` with the same values.
 * <p>
 * input=ragged.from_nested_row_splits(rt_dense_values, rt_nested_splits)
 * output=SparseTensor(indices=sparse_indices, values=sparse_values,
 *                     dense_shape=sparse_dense_shape)
 * 
 * @param <U> data type for {@code sparseValues()} output
 */
public final class RaggedTensorToSparse<U> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new RaggedTensorToSparse operation.
   * 
   * @param scope current scope
   * @param rtNestedSplits The `row_splits` for the `RaggedTensor`.
   * @param rtDenseValues The `flat_values` for the `RaggedTensor`.
   * @return a new instance of RaggedTensorToSparse
   */
  public static <U, T extends Number> RaggedTensorToSparse<U> create(Scope scope, Iterable<Operand<T>> rtNestedSplits, Operand<U> rtDenseValues) {
    OperationBuilder opBuilder = scope.env().opBuilder("RaggedTensorToSparse", scope.makeOpName("RaggedTensorToSparse"));
    opBuilder.addInputList(Operands.asOutputs(rtNestedSplits));
    opBuilder.addInput(rtDenseValues.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new RaggedTensorToSparse<U>(opBuilder.build());
  }
  
  /**
   * The indices for the `SparseTensor`.
   */
  public Output<Long> sparseIndices() {
    return sparseIndices;
  }
  
  /**
   * The values of the `SparseTensor`.
   */
  public Output<U> sparseValues() {
    return sparseValues;
  }
  
  /**
   * `sparse_dense_shape` is a tight bounding box of the input `RaggedTensor`.
   */
  public Output<Long> sparseDenseShape() {
    return sparseDenseShape;
  }
  
  private Output<Long> sparseIndices;
  private Output<U> sparseValues;
  private Output<Long> sparseDenseShape;
  
  private RaggedTensorToSparse(Operation operation) {
    super(operation);
    int outputIdx = 0;
    sparseIndices = operation.output(outputIdx++);
    sparseValues = operation.output(outputIdx++);
    sparseDenseShape = operation.output(outputIdx++);
  }
}
