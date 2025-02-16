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

package org.tensorflow.op.nn;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Computes rectified linear gradients for a Relu operation.
 * 
 * @param <T> data type for {@code backprops()} output
 */
public final class ReluGrad<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new ReluGrad operation.
   * 
   * @param scope current scope
   * @param gradients The backpropagated gradients to the corresponding Relu operation.
   * @param features The features passed as input to the corresponding Relu operation, OR
   * the outputs of that operation (both work equivalently).
   * @return a new instance of ReluGrad
   */
  public static <T extends Number> ReluGrad<T> create(Scope scope, Operand<T> gradients, Operand<T> features) {
    OperationBuilder opBuilder = scope.env().opBuilder("ReluGrad", scope.makeOpName("ReluGrad"));
    opBuilder.addInput(gradients.asOutput());
    opBuilder.addInput(features.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new ReluGrad<T>(opBuilder.build());
  }
  
  /**
   * `gradients * (features > 0)`.
   */
  public Output<T> backprops() {
    return backprops;
  }
  
  @Override
  public Output<T> asOutput() {
    return backprops;
  }
  
  private Output<T> backprops;
  
  private ReluGrad(Operation operation) {
    super(operation);
    int outputIdx = 0;
    backprops = operation.output(outputIdx++);
  }
}
