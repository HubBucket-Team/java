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
 */
public final class AnonymousRandomSeedGenerator extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new AnonymousRandomSeedGenerator operation.
   * 
   * @param scope current scope
   * @param seed 
   * @param seed2 
   * @return a new instance of AnonymousRandomSeedGenerator
   */
  public static AnonymousRandomSeedGenerator create(Scope scope, Operand<Long> seed, Operand<Long> seed2) {
    OperationBuilder opBuilder = scope.env().opBuilder("AnonymousRandomSeedGenerator", scope.makeOpName("AnonymousRandomSeedGenerator"));
    opBuilder.addInput(seed.asOutput());
    opBuilder.addInput(seed2.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new AnonymousRandomSeedGenerator(opBuilder.build());
  }
  
  /**
   */
  public Output<?> handle() {
    return handle;
  }
  
  /**
   */
  public Output<?> deleter() {
    return deleter;
  }
  
  private Output<?> handle;
  private Output<?> deleter;
  
  private AnonymousRandomSeedGenerator(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
    deleter = operation.output(outputIdx++);
  }
}
