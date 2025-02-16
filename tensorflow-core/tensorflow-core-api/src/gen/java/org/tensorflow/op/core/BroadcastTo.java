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
 * Broadcast an array for a compatible shape.
 * <p>
 * Broadcasting is the process of making arrays to have compatible shapes
 * for arithmetic operations. Two shapes are compatible if for each
 * dimension pair they are either equal or one of them is one. When trying
 * to broadcast a Tensor to a shape, it starts with the trailing dimensions,
 * and works its way forward.
 * <p>
 * For example,
 * <pre>{@code
 * >>> x = tf.constant([1, 2, 3])
 * >>> y = tf.broadcast_to(x, [3, 3])
 * >>> sess.run(y)
 * array([[1, 2, 3],
 *        [1, 2, 3],
 *        [1, 2, 3]], dtype=int32)
 * }</pre>
 * In the above example, the input Tensor with the shape of `[1, 3]`
 * is broadcasted to output Tensor with shape of `[3, 3]`.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class BroadcastTo<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new BroadcastTo operation.
   * 
   * @param scope current scope
   * @param input A Tensor to broadcast.
   * @param shape An 1-D `int` Tensor. The shape of the desired output.
   * @return a new instance of BroadcastTo
   */
  public static <T, U extends Number> BroadcastTo<T> create(Scope scope, Operand<T> input, Operand<U> shape) {
    OperationBuilder opBuilder = scope.env().opBuilder("BroadcastTo", scope.makeOpName("BroadcastTo"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(shape.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new BroadcastTo<T>(opBuilder.build());
  }
  
  /**
   * A Tensor.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private BroadcastTo(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
