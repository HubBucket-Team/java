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

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns the real part of a complex number.
 * <p>
 * Given a tensor `input` of complex numbers, this operation returns a tensor of
 * type `float` that is the real part of each element in `input`. All elements in
 * `input` must be complex numbers of the form \\(a + bj\\), where <i>a</i> is the real
 *  part returned by this operation and <i>b</i> is the imaginary part.
 * <p>
 * For example:
 * <pre>{@code
 * # tensor 'input' is [-2.25 + 4.75j, 3.25 + 5.75j]
 * tf.real(input) ==> [-2.25, 3.25]
 * }</pre>
 * 
 * 
 * @param <U> data type for {@code output()} output
 */
@Operator(group = "math")
public final class Real<U extends Number> extends PrimitiveOp implements Operand<U> {
  
  /**
   * Factory method to create a class wrapping a new Real operation.
   * 
   * @param scope current scope
   * @param input 
   * @param Tout 
   * @return a new instance of Real
   */
  public static <U extends Number, T> Real<U> create(Scope scope, Operand<T> input, Class<U> Tout) {
    OperationBuilder opBuilder = scope.env().opBuilder("Real", scope.makeOpName("Real"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("Tout", DataType.fromClass(Tout));
    return new Real<U>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new Real operation using default output types.
   * 
   * @param scope current scope
   * @param input 
   * @return a new instance of Real
   */
  public static <T> Real<Float> create(Scope scope, Operand<T> input) {
    return create(scope, input, Float.class);
  }
  
  /**
   */
  public Output<U> output() {
    return output;
  }
  
  @Override
  public Output<U> asOutput() {
    return output;
  }
  
  private Output<U> output;
  
  private Real(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
