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

package org.tensorflow.op.linalg;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "linalg")
public final class BatchMatrixSetDiag<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new BatchMatrixSetDiag operation.
   * 
   * @param scope current scope
   * @param input 
   * @param diagonal 
   * @return a new instance of BatchMatrixSetDiag
   */
  public static <T> BatchMatrixSetDiag<T> create(Scope scope, Operand<T> input, Operand<T> diagonal) {
    OperationBuilder opBuilder = scope.env().opBuilder("BatchMatrixSetDiag", scope.makeOpName("BatchMatrixSetDiag"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(diagonal.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new BatchMatrixSetDiag<T>(opBuilder.build());
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
  
  private BatchMatrixSetDiag(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
