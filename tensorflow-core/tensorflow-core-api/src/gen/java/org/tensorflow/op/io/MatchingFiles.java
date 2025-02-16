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
 * Returns the set of files matching one or more glob patterns.
 * <p>
 * Note that this routine only supports wildcard characters in the
 * basename portion of the pattern, not in the directory portion.
 * Note also that the order of filenames returned is deterministic.
 */
@Operator(group = "io")
public final class MatchingFiles extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new MatchingFiles operation.
   * 
   * @param scope current scope
   * @param pattern Shell wildcard pattern(s). Scalar or vector of type string.
   * @return a new instance of MatchingFiles
   */
  public static MatchingFiles create(Scope scope, Operand<String> pattern) {
    OperationBuilder opBuilder = scope.env().opBuilder("MatchingFiles", scope.makeOpName("MatchingFiles"));
    opBuilder.addInput(pattern.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new MatchingFiles(opBuilder.build());
  }
  
  /**
   * A vector of matching filenames.
   */
  public Output<String> filenames() {
    return filenames;
  }
  
  @Override
  public Output<String> asOutput() {
    return filenames;
  }
  
  private Output<String> filenames;
  
  private MatchingFiles(Operation operation) {
    super(operation);
    int outputIdx = 0;
    filenames = operation.output(outputIdx++);
  }
}
