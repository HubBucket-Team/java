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

package org.tensorflow.op.data;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Produces a string handle for the given MultiDeviceIterator.
 */
public final class MultiDeviceIteratorToStringHandle extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new MultiDeviceIteratorToStringHandle operation.
   * 
   * @param scope current scope
   * @param multiDeviceIterator A MultiDeviceIterator resource.
   * @return a new instance of MultiDeviceIteratorToStringHandle
   */
  public static MultiDeviceIteratorToStringHandle create(Scope scope, Operand<?> multiDeviceIterator) {
    OperationBuilder opBuilder = scope.env().opBuilder("MultiDeviceIteratorToStringHandle", scope.makeOpName("MultiDeviceIteratorToStringHandle"));
    opBuilder.addInput(multiDeviceIterator.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new MultiDeviceIteratorToStringHandle(opBuilder.build());
  }
  
  /**
   * A string representing the resource.
   */
  public Output<String> stringHandle() {
    return stringHandle;
  }
  
  @Override
  public Output<String> asOutput() {
    return stringHandle;
  }
  
  private Output<String> stringHandle;
  
  private MultiDeviceIteratorToStringHandle(Operation operation) {
    super(operation);
    int outputIdx = 0;
    stringHandle = operation.output(outputIdx++);
  }
}
