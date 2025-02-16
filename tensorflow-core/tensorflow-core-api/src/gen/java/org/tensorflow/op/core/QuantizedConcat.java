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
import org.tensorflow.op.annotation.Operator;

/**
 * Concatenates quantized tensors along one dimension.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class QuantizedConcat<T> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new QuantizedConcat operation.
   * 
   * @param scope current scope
   * @param concatDim 0-D.  The dimension along which to concatenate.  Must be in the
   * range [0, rank(values)).
   * @param values The `N` Tensors to concatenate. Their ranks and types must match,
   * and their sizes must match in all dimensions except `concat_dim`.
   * @param inputMins The minimum scalar values for each of the input tensors.
   * @param inputMaxes The maximum scalar values for each of the input tensors.
   * @return a new instance of QuantizedConcat
   */
  public static <T> QuantizedConcat<T> create(Scope scope, Operand<Integer> concatDim, Iterable<Operand<T>> values, Iterable<Operand<Float>> inputMins, Iterable<Operand<Float>> inputMaxes) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizedConcat", scope.makeOpName("QuantizedConcat"));
    opBuilder.addInput(concatDim.asOutput());
    opBuilder.addInputList(Operands.asOutputs(values));
    opBuilder.addInputList(Operands.asOutputs(inputMins));
    opBuilder.addInputList(Operands.asOutputs(inputMaxes));
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new QuantizedConcat<T>(opBuilder.build());
  }
  
  /**
   * A `Tensor` with the concatenation of values stacked along the
   * `concat_dim` dimension.  This tensor's shape matches that of `values` except
   * in `concat_dim` where it has the sum of the sizes.
   */
  public Output<T> output() {
    return output;
  }
  
  /**
   * The float value that the minimum quantized output value represents.
   */
  public Output<Float> outputMin() {
    return outputMin;
  }
  
  /**
   * The float value that the maximum quantized output value represents.
   */
  public Output<Float> outputMax() {
    return outputMax;
  }
  
  private Output<T> output;
  private Output<Float> outputMin;
  private Output<Float> outputMax;
  
  private QuantizedConcat(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
    outputMin = operation.output(outputIdx++);
    outputMax = operation.output(outputIdx++);
  }
}
