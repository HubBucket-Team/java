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
 * Returns element-wise remainder of division. This emulates C semantics in that
 * <p>
 * the result here is consistent with a truncating divide. E.g. `truncate(x / y) *
 * y + truncate_mod(x, y) = x`.
 * <p>
 * <i>NOTE</i>: `math.TruncateMod` supports broadcasting. More about broadcasting
 * [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html)
 * 
 * @param <T> data type for {@code z()} output
 */
@Operator(group = "math")
public final class TruncateMod<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new TruncateMod operation.
   * 
   * @param scope current scope
   * @param x 
   * @param y 
   * @return a new instance of TruncateMod
   */
  public static <T extends Number> TruncateMod<T> create(Scope scope, Operand<T> x, Operand<T> y) {
    OperationBuilder opBuilder = scope.env().opBuilder("TruncateMod", scope.makeOpName("TruncateMod"));
    opBuilder.addInput(x.asOutput());
    opBuilder.addInput(y.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TruncateMod<T>(opBuilder.build());
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
  
  private TruncateMod(Operation operation) {
    super(operation);
    int outputIdx = 0;
    z = operation.output(outputIdx++);
  }
}
