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

/**
 * Computes arctangent of `y/x` element-wise, respecting signs of the arguments.
 * <p>
 * This is the angle \( \theta \in [-\pi, \pi] \) such that
 * \[ x = r \cos(\theta) \]
 * and
 * \[ y = r \sin(\theta) \]
 * where \(r = \sqrt(x^2 + y^2) \).
 * 
 * @param <T> data type for {@code z()} output
 */
@Operator(group = "math")
public final class Atan2<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new Atan2 operation.
   * 
   * @param scope current scope
   * @param y 
   * @param x 
   * @return a new instance of Atan2
   */
  public static <T extends Number> Atan2<T> create(Scope scope, Operand<T> y, Operand<T> x) {
    OperationBuilder opBuilder = scope.env().opBuilder("Atan2", scope.makeOpName("Atan2"));
    opBuilder.addInput(y.asOutput());
    opBuilder.addInput(x.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Atan2<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> z() {
    return z;
  }
  
  @Override
  public Output<T> asOutput() {
    return z;
  }
  
  private Output<T> z;
  
  private Atan2(Operation operation) {
    super(operation);
    int outputIdx = 0;
    z = operation.output(outputIdx++);
  }
}
