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
 * Returns the argument of a complex number.
 * <p>
 * Given a tensor `input` of complex numbers, this operation returns a tensor of
 * type `float` that is the argument of each element in `input`. All elements in
 * `input` must be complex numbers of the form \\(a + bj\\), where <i>a</i>
 * is the real part and <i>b</i> is the imaginary part.
 * <p>
 * The argument returned by this operation is of the form \\(atan2(b, a)\\).
 * <p>
 * For example:
 * <pre>{@code
 * # tensor 'input' is [-2.25 + 4.75j, 3.25 + 5.75j]
 * tf.angle(input) ==> [2.0132, 1.056]
 * }</pre>
 * @compatibility(numpy)
 * Equivalent to np.angle.
 * @end_compatibility
 * 
 * @param <U> data type for {@code output()} output
 */
@Operator(group = "math")
public final class Angle<U extends Number> extends PrimitiveOp implements Operand<U> {
  
  /**
   * Factory method to create a class wrapping a new Angle operation.
   * 
   * @param scope current scope
   * @param input 
   * @param Tout 
   * @return a new instance of Angle
   */
  public static <U extends Number, T> Angle<U> create(Scope scope, Operand<T> input, Class<U> Tout) {
    OperationBuilder opBuilder = scope.env().opBuilder("Angle", scope.makeOpName("Angle"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("Tout", DataType.fromClass(Tout));
    return new Angle<U>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new Angle operation using default output types.
   * 
   * @param scope current scope
   * @param input 
   * @return a new instance of Angle
   */
  public static <T> Angle<Float> create(Scope scope, Operand<T> input) {
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
  
  private Angle(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
