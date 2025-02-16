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

package org.tensorflow.op.strings;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Strip leading and trailing whitespaces from the Tensor.
 */
@Operator(group = "strings")
public final class Strip extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new Strip operation.
   * 
   * @param scope current scope
   * @param input A string `Tensor` of any shape.
   * @return a new instance of Strip
   */
  public static Strip create(Scope scope, Operand<String> input) {
    OperationBuilder opBuilder = scope.env().opBuilder("StringStrip", scope.makeOpName("Strip"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Strip(opBuilder.build());
  }
  
  /**
   * A string `Tensor` of the same shape as the input.
   */
  public Output<String> output() {
    return output;
  }
  
  @Override
  public Output<String> asOutput() {
    return output;
  }
  
  private Output<String> output;
  
  private Strip(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
