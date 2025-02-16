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

package org.tensorflow.op.train;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Computes fingerprints of the input strings.
 */
@Operator(group = "train")
public final class SdcaFprint extends PrimitiveOp implements Operand<Long> {
  
  /**
   * Factory method to create a class wrapping a new SdcaFprint operation.
   * 
   * @param scope current scope
   * @param input vector of strings to compute fingerprints on.
   * @return a new instance of SdcaFprint
   */
  public static SdcaFprint create(Scope scope, Operand<String> input) {
    OperationBuilder opBuilder = scope.env().opBuilder("SdcaFprint", scope.makeOpName("SdcaFprint"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new SdcaFprint(opBuilder.build());
  }
  
  /**
   * a (N,2) shaped matrix where N is the number of elements in the input
   * vector. Each row contains the low and high parts of the fingerprint.
   */
  public Output<Long> output() {
    return output;
  }
  
  @Override
  public Output<Long> asOutput() {
    return output;
  }
  
  private Output<Long> output;
  
  private SdcaFprint(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
