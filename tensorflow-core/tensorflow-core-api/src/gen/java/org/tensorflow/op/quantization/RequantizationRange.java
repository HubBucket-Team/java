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

package org.tensorflow.op.quantization;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Computes a range that covers the actual values present in a quantized tensor.
 * <p>
 * Given a quantized tensor described by `(input, input_min, input_max)`, outputs a
 * range that covers the actual values present in that tensor. This op is typically
 * used to produce the `requested_output_min` and `requested_output_max` for
 * `Requantize`.
 */
@Operator(group = "quantization")
public final class RequantizationRange extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new RequantizationRange operation.
   * 
   * @param scope current scope
   * @param input 
   * @param inputMin The float value that the minimum quantized input value represents.
   * @param inputMax The float value that the maximum quantized input value represents.
   * @return a new instance of RequantizationRange
   */
  public static <T> RequantizationRange create(Scope scope, Operand<T> input, Operand<Float> inputMin, Operand<Float> inputMax) {
    OperationBuilder opBuilder = scope.env().opBuilder("RequantizationRange", scope.makeOpName("RequantizationRange"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(inputMin.asOutput());
    opBuilder.addInput(inputMax.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new RequantizationRange(opBuilder.build());
  }
  
  /**
   * The computed min output.
   */
  public Output<Float> outputMin() {
    return outputMin;
  }
  
  /**
   * the computed max output.
   */
  public Output<Float> outputMax() {
    return outputMax;
  }
  
  private Output<Float> outputMin;
  private Output<Float> outputMax;
  
  private RequantizationRange(Operation operation) {
    super(operation);
    int outputIdx = 0;
    outputMin = operation.output(outputIdx++);
    outputMax = operation.output(outputIdx++);
  }
}
