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
 * Computes gradients for the exponential linear (Elu) operation.
 * 
 * @param <T> data type for {@code backprops()} output
 */
public final class EluGrad<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new EluGrad operation.
   * 
   * @param scope current scope
   * @param gradients The backpropagated gradients to the corresponding Elu operation.
   * @param outputs The outputs of the corresponding Elu operation.
   * @return a new instance of EluGrad
   */
  public static <T extends Number> EluGrad<T> create(Scope scope, Operand<T> gradients, Operand<T> outputs) {
    OperationBuilder opBuilder = scope.env().opBuilder("EluGrad", scope.makeOpName("EluGrad"));
    opBuilder.addInput(gradients.asOutput());
    opBuilder.addInput(outputs.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new EluGrad<T>(opBuilder.build());
  }
  
  /**
   * The gradients: `gradients * (outputs + 1)` if outputs < 0,
   * `gradients` otherwise.
   */
  public Output<T> backprops() {
    return backprops;
  }
  
  @Override
  public Output<T> asOutput() {
    return backprops;
  }
  
  private Output<T> backprops;
  
  private EluGrad(Operation operation) {
    super(operation);
    int outputIdx = 0;
    backprops = operation.output(outputIdx++);
  }
}
