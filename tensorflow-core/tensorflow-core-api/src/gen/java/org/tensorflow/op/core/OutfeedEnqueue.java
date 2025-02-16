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
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Enqueue a Tensor on the computation outfeed.
 */
public final class OutfeedEnqueue extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new OutfeedEnqueue operation.
   * 
   * @param scope current scope
   * @param input A tensor that will be inserted into the outfeed queue.
   * @return a new instance of OutfeedEnqueue
   */
  public static <T> OutfeedEnqueue create(Scope scope, Operand<T> input) {
    OperationBuilder opBuilder = scope.env().opBuilder("OutfeedEnqueue", scope.makeOpName("OutfeedEnqueue"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new OutfeedEnqueue(opBuilder.build());
  }
  
  
  private OutfeedEnqueue(Operation operation) {
    super(operation);
  }
}
