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
 * Reshapes a quantized tensor as per the Reshape op.
 * <p>
 * ```
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class QuantizedReshape<T> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new QuantizedReshape operation.
   * 
   * @param scope current scope
   * @param tensor 
   * @param shape Defines the shape of the output tensor.
   * @param inputMin The minimum value of the input.
   * @param inputMax The maximum value of the input.
   * @return a new instance of QuantizedReshape
   */
  public static <T, U extends Number> QuantizedReshape<T> create(Scope scope, Operand<T> tensor, Operand<U> shape, Operand<Float> inputMin, Operand<Float> inputMax) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizedReshape", scope.makeOpName("QuantizedReshape"));
    opBuilder.addInput(tensor.asOutput());
    opBuilder.addInput(shape.asOutput());
    opBuilder.addInput(inputMin.asOutput());
    opBuilder.addInput(inputMax.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new QuantizedReshape<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> output() {
    return output;
  }
  
  /**
   * This value is copied from input_min.
   */
  public Output<Float> outputMin() {
    return outputMin;
  }
  
  /**
   * This value is copied from input_max.
   */
  public Output<Float> outputMax() {
    return outputMax;
  }
  
  private Output<T> output;
  private Output<Float> outputMin;
  private Output<Float> outputMax;
  
  private QuantizedReshape(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
    outputMin = operation.output(outputIdx++);
    outputMax = operation.output(outputIdx++);
  }
}
