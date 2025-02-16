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
import org.tensorflow.op.annotation.Operator;

/**
 * Converts a flat index or array of flat indices into a tuple of
 * <p>
 * coordinate arrays.
 * <p>
 * @compatibility(numpy)
 * Equivalent to np.unravel_index
 * @end_compatibility
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class UnravelIndex<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new UnravelIndex operation.
   * 
   * @param scope current scope
   * @param indices An 0-D or 1-D `int` Tensor whose elements are indices into the
   * flattened version of an array of dimensions dims.
   * @param dims An 1-D `int` Tensor. The shape of the array to use for unraveling
   * indices.
   * @return a new instance of UnravelIndex
   */
  public static <T extends Number> UnravelIndex<T> create(Scope scope, Operand<T> indices, Operand<T> dims) {
    OperationBuilder opBuilder = scope.env().opBuilder("UnravelIndex", scope.makeOpName("UnravelIndex"));
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(dims.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new UnravelIndex<T>(opBuilder.build());
  }
  
  /**
   * An 2-D (or 1-D if indices is 0-D) tensor where each row has the
   * same shape as the indices array.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private UnravelIndex(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
