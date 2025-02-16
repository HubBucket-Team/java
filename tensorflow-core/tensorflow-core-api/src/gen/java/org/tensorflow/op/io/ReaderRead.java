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

package org.tensorflow.op.io;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns the next record (key, value pair) produced by a Reader.
 * <p>
 * Will dequeue from the input queue if necessary (e.g. when the
 * Reader needs to start reading from a new file since it has finished
 * with the previous file).
 */
@Operator(group = "io")
public final class ReaderRead extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new ReaderRead operation.
   * 
   * @param scope current scope
   * @param readerHandle Handle to a Reader.
   * @param queueHandle Handle to a Queue, with string work items.
   * @return a new instance of ReaderRead
   */
  public static ReaderRead create(Scope scope, Operand<?> readerHandle, Operand<?> queueHandle) {
    OperationBuilder opBuilder = scope.env().opBuilder("ReaderReadV2", scope.makeOpName("ReaderRead"));
    opBuilder.addInput(readerHandle.asOutput());
    opBuilder.addInput(queueHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new ReaderRead(opBuilder.build());
  }
  
  /**
   * A scalar.
   */
  public Output<String> key() {
    return key;
  }
  
  /**
   * A scalar.
   */
  public Output<String> value() {
    return value;
  }
  
  private Output<String> key;
  private Output<String> value;
  
  private ReaderRead(Operation operation) {
    super(operation);
    int outputIdx = 0;
    key = operation.output(outputIdx++);
    value = operation.output(outputIdx++);
  }
}
