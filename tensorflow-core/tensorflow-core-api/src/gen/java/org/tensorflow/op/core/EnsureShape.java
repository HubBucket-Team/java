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
import org.tensorflow.Shape;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Ensures that the tensor's shape matches the expected shape.
 * <p>
 * Raises an error if the input tensor's shape does not match the specified shape.
 * Returns the input tensor otherwise.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class EnsureShape<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new EnsureShape operation.
   * 
   * @param scope current scope
   * @param input A tensor, whose shape is to be validated.
   * @param shape The expected (possibly partially specified) shape of the input tensor.
   * @return a new instance of EnsureShape
   */
  public static <T> EnsureShape<T> create(Scope scope, Operand<T> input, Shape shape) {
    OperationBuilder opBuilder = scope.env().opBuilder("EnsureShape", scope.makeOpName("EnsureShape"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("shape", shape);
    return new EnsureShape<T>(opBuilder.build());
  }
  
  /**
   * A tensor with the same shape and contents as the input tensor or value.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private EnsureShape(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
