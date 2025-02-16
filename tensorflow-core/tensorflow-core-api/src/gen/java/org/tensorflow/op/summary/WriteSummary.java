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

package org.tensorflow.op.summary;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 */
public final class WriteSummary extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new WriteSummary operation.
   * 
   * @param scope current scope
   * @param writer 
   * @param step 
   * @param tensor 
   * @param tag 
   * @param summaryMetadata 
   * @return a new instance of WriteSummary
   */
  public static <T> WriteSummary create(Scope scope, Operand<?> writer, Operand<Long> step, Operand<T> tensor, Operand<String> tag, Operand<String> summaryMetadata) {
    OperationBuilder opBuilder = scope.env().opBuilder("WriteSummary", scope.makeOpName("WriteSummary"));
    opBuilder.addInput(writer.asOutput());
    opBuilder.addInput(step.asOutput());
    opBuilder.addInput(tensor.asOutput());
    opBuilder.addInput(tag.asOutput());
    opBuilder.addInput(summaryMetadata.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new WriteSummary(opBuilder.build());
  }
  
  
  private WriteSummary(Operation operation) {
    super(operation);
  }
}
