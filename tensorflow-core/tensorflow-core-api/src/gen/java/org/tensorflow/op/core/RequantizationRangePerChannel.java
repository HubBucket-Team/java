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
 * Computes requantization range per channel.
 */
public final class RequantizationRangePerChannel extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new RequantizationRangePerChannel operation.
   * 
   * @param scope current scope
   * @param input The original input tensor.
   * @param inputMin The minimum value of the input tensor
   * @param inputMax The maximum value of the input tensor.
   * @param clipValueMax The maximum value of the output that needs to be clipped.
   * Example: set this to 6 for Relu6. 
   * @return a new instance of RequantizationRangePerChannel
   */
  public static <T> RequantizationRangePerChannel create(Scope scope, Operand<T> input, Operand<Float> inputMin, Operand<Float> inputMax, Float clipValueMax) {
    OperationBuilder opBuilder = scope.env().opBuilder("RequantizationRangePerChannel", scope.makeOpName("RequantizationRangePerChannel"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(inputMin.asOutput());
    opBuilder.addInput(inputMax.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("clip_value_max", clipValueMax);
    return new RequantizationRangePerChannel(opBuilder.build());
  }
  
  /**
   * The minimum value of the final output tensor
   */
  public Output<Float> outputMin() {
    return outputMin;
  }
  
  /**
   * The maximum value of the final output tensor.
   */
  public Output<Float> outputMax() {
    return outputMax;
  }
  
  private Output<Float> outputMin;
  private Output<Float> outputMax;
  
  private RequantizationRangePerChannel(Operation operation) {
    super(operation);
    int outputIdx = 0;
    outputMin = operation.output(outputIdx++);
    outputMax = operation.output(outputIdx++);
  }
}
