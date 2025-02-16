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

/**
 * A TPU core selector Op.
 * <p>
 * This Op produces a set of TPU cores (for warm-up) or a single TPU core
 * (for regular inference) to execute the TPU program on. The output is
 * consumed by TPUPartitionedCall.
 */
public final class TPUOrdinalSelector extends PrimitiveOp implements Operand<Integer> {
  
  /**
   * Factory method to create a class wrapping a new TPUOrdinalSelector operation.
   * 
   * @param scope current scope
   * @return a new instance of TPUOrdinalSelector
   */
  public static TPUOrdinalSelector create(Scope scope) {
    OperationBuilder opBuilder = scope.env().opBuilder("TPUOrdinalSelector", scope.makeOpName("TPUOrdinalSelector"));
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TPUOrdinalSelector(opBuilder.build());
  }
  
  /**
   * A vector 1 or more TPU cores.
   */
  public Output<Integer> deviceOrdinals() {
    return deviceOrdinals;
  }
  
  @Override
  public Output<Integer> asOutput() {
    return deviceOrdinals;
  }
  
  private Output<Integer> deviceOrdinals;
  
  private TPUOrdinalSelector(Operation operation) {
    super(operation);
    int outputIdx = 0;
    deviceOrdinals = operation.output(outputIdx++);
  }
}
