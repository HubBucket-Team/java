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
 * Compute the lower regularized incomplete Gamma function `P(a, x)`.
 * <p>
 * The lower regularized incomplete Gamma function is defined as:
 * <p>
 * \\(P(a, x) = gamma(a, x) / Gamma(a) = 1 - Q(a, x)\\)
 * <p>
 * where
 * <p>
 * \\(gamma(a, x) = \\int_{0}^{x} t^{a-1} exp(-t) dt\\)
 * <p>
 * is the lower incomplete Gamma function.
 * <p>
 * Note, above `Q(a, x)` (`Igammac`) is the upper regularized complete
 * Gamma function.
 * 
 * @param <T> data type for {@code z()} output
 */
@Operator(group = "math")
public final class Igamma<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new Igamma operation.
   * 
   * @param scope current scope
   * @param a 
   * @param x 
   * @return a new instance of Igamma
   */
  public static <T extends Number> Igamma<T> create(Scope scope, Operand<T> a, Operand<T> x) {
    OperationBuilder opBuilder = scope.env().opBuilder("Igamma", scope.makeOpName("Igamma"));
    opBuilder.addInput(a.asOutput());
    opBuilder.addInput(x.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Igamma<T>(opBuilder.build());
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
  
  private Igamma(Operation operation) {
    super(operation);
    int outputIdx = 0;
    z = operation.output(outputIdx++);
  }
}
