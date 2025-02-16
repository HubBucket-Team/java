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
 * Determine the script codes of a given tensor of Unicode integer code points.
 * <p>
 * This operation converts Unicode code points to script codes corresponding to
 * each code point. Script codes correspond to International Components for
 * Unicode (ICU) UScriptCode values. See http://icu-project.org/apiref/icu4c/uscript_8h.html.
 * Returns -1 (USCRIPT_INVALID_CODE) for invalid codepoints. Output shape will
 * match input shape.
 */
@Operator(group = "strings")
public final class UnicodeScript extends PrimitiveOp implements Operand<Integer> {
  
  /**
   * Factory method to create a class wrapping a new UnicodeScript operation.
   * 
   * @param scope current scope
   * @param input A Tensor of int32 Unicode code points.
   * @return a new instance of UnicodeScript
   */
  public static UnicodeScript create(Scope scope, Operand<Integer> input) {
    OperationBuilder opBuilder = scope.env().opBuilder("UnicodeScript", scope.makeOpName("UnicodeScript"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new UnicodeScript(opBuilder.build());
  }
  
  /**
   * A Tensor of int32 script codes corresponding to each input code point.
   */
  public Output<Integer> output() {
    return output;
  }
  
  @Override
  public Output<Integer> asOutput() {
    return output;
  }
  
  private Output<Integer> output;
  
  private UnicodeScript(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
