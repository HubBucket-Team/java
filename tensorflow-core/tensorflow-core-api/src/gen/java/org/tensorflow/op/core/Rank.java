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
 * Returns the rank of a tensor.
 * <p>
 * This operation returns an integer representing the rank of `input`.
 * <p>
 * For example:
 * <pre>{@code
 * # 't' is [[[1, 1, 1], [2, 2, 2]], [[3, 3, 3], [4, 4, 4]]]
 * # shape of tensor 't' is [2, 2, 3]
 * rank(t) ==> 3
 * }</pre>
 * <b>Note</b>: The rank of a tensor is not the same as the rank of a matrix. The rank
 * of a tensor is the number of indices required to uniquely select each element
 * of the tensor. Rank is also known as "order", "degree", or "ndims."
 */
@Operator
public final class Rank extends PrimitiveOp implements Operand<Integer> {
  
  /**
   * Factory method to create a class wrapping a new Rank operation.
   * 
   * @param scope current scope
   * @param input 
   * @return a new instance of Rank
   */
  public static <T> Rank create(Scope scope, Operand<T> input) {
    OperationBuilder opBuilder = scope.env().opBuilder("Rank", scope.makeOpName("Rank"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Rank(opBuilder.build());
  }
  
  /**
   */
  public Output<Integer> output() {
    return output;
  }
  
  @Override
  public Output<Integer> asOutput() {
    return output;
  }
  
  private Output<Integer> output;
  
  private Rank(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
