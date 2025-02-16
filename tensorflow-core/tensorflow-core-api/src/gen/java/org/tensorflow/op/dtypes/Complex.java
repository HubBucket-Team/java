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

package org.tensorflow.op.dtypes;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Converts two real numbers to a complex number.
 * <p>
 * Given a tensor `real` representing the real part of a complex number, and a
 * tensor `imag` representing the imaginary part of a complex number, this
 * operation returns complex numbers elementwise of the form \\(a + bj\\), where
 * <i>a</i> represents the `real` part and <i>b</i> represents the `imag` part.
 * <p>
 * The input tensors `real` and `imag` must have the same shape.
 * <p>
 * For example:
 * <pre>{@code
 * # tensor 'real' is [2.25, 3.25]
 * # tensor `imag` is [4.75, 5.75]
 * tf.complex(real, imag) ==> [[2.25 + 4.75j], [3.25 + 5.75j]]
 * }</pre>
 * 
 * 
 * @param <U> data type for {@code out()} output
 */
@Operator(group = "dtypes")
public final class Complex<U> extends PrimitiveOp implements Operand<U> {
  
  /**
   * Factory method to create a class wrapping a new Complex operation.
   * 
   * @param scope current scope
   * @param real 
   * @param imag 
   * @param Tout 
   * @return a new instance of Complex
   */
  public static <U, T extends Number> Complex<U> create(Scope scope, Operand<T> real, Operand<T> imag, Class<U> Tout) {
    OperationBuilder opBuilder = scope.env().opBuilder("Complex", scope.makeOpName("Complex"));
    opBuilder.addInput(real.asOutput());
    opBuilder.addInput(imag.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("Tout", DataType.fromClass(Tout));
    return new Complex<U>(opBuilder.build());
  }
  
  /**
   */
  public Output<U> out() {
    return out;
  }
  
  @Override
  public Output<U> asOutput() {
    return out;
  }
  
  private Output<U> out;
  
  private Complex(Operation operation) {
    super(operation);
    int outputIdx = 0;
    out = operation.output(outputIdx++);
  }
}
