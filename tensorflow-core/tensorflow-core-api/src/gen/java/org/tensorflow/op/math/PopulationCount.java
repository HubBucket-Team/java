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

package org.tensorflow.op.math;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.UInt8;

/**
 * Computes element-wise population count (a.k.a. popcount, bitsum, bitcount).
 * <p>
 * For each entry in `x`, calculates the number of `1` (on) bits in the binary
 * representation of that entry.
 * <p>
 * <b>NOTE</b>: It is more efficient to first `tf.bitcast` your tensors into
 * `int32` or `int64` and perform the bitcount on the result, than to feed in
 * 8- or 16-bit inputs and then aggregate the resulting counts.
 */
@Operator(group = "math")
public final class PopulationCount extends PrimitiveOp implements Operand<UInt8> {
  
  /**
   * Factory method to create a class wrapping a new PopulationCount operation.
   * 
   * @param scope current scope
   * @param x 
   * @return a new instance of PopulationCount
   */
  public static <T extends Number> PopulationCount create(Scope scope, Operand<T> x) {
    OperationBuilder opBuilder = scope.env().opBuilder("PopulationCount", scope.makeOpName("PopulationCount"));
    opBuilder.addInput(x.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new PopulationCount(opBuilder.build());
  }
  
  /**
   */
  public Output<UInt8> y() {
    return y;
  }
  
  @Override
  public Output<UInt8> asOutput() {
    return y;
  }
  
  private Output<UInt8> y;
  
  private PopulationCount(Operation operation) {
    super(operation);
    int outputIdx = 0;
    y = operation.output(outputIdx++);
  }
}
