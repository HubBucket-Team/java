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

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns the shape of the variable pointed to by `resource`.
 * <p>
 * This operation returns a 1-D integer tensor representing the shape of `input`.
 * <p>
 * For example:
 * <pre>{@code
 * # 't' is [[[1, 1, 1], [2, 2, 2]], [[3, 3, 3], [4, 4, 4]]]
 * shape(t) ==> [2, 2, 3]
 * }</pre>
 * 
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class VariableShape<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new VariableShape operation.
   * 
   * @param scope current scope
   * @param input 
   * @param outType 
   * @return a new instance of VariableShape
   */
  public static <T extends Number> VariableShape<T> create(Scope scope, Operand<?> input, Class<T> outType) {
    OperationBuilder opBuilder = scope.env().opBuilder("VariableShape", scope.makeOpName("VariableShape"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("out_type", DataType.fromClass(outType));
    return new VariableShape<T>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new VariableShape operation using default output types.
   * 
   * @param scope current scope
   * @param input 
   * @return a new instance of VariableShape
   */
  public static VariableShape<Integer> create(Scope scope, Operand<?> input) {
    return create(scope, input, Integer.class);
  }
  
  /**
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private VariableShape(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
