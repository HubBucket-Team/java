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

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Outputs all keys and values in the table.
 * 
 * @param <T> data type for {@code keys()} output
 * @param <U> data type for {@code values()} output
 */
@Operator
public final class LookupTableExport<T, U> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new LookupTableExport operation.
   * 
   * @param scope current scope
   * @param tableHandle Handle to the table.
   * @param Tkeys 
   * @param Tvalues 
   * @return a new instance of LookupTableExport
   */
  public static <T, U> LookupTableExport<T, U> create(Scope scope, Operand<?> tableHandle, Class<T> Tkeys, Class<U> Tvalues) {
    OperationBuilder opBuilder = scope.env().opBuilder("LookupTableExportV2", scope.makeOpName("LookupTableExport"));
    opBuilder.addInput(tableHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("Tkeys", DataType.fromClass(Tkeys));
    opBuilder.setAttr("Tvalues", DataType.fromClass(Tvalues));
    return new LookupTableExport<T, U>(opBuilder.build());
  }
  
  /**
   * Vector of all keys present in the table.
   */
  public Output<T> keys() {
    return keys;
  }
  
  /**
   * Tensor of all values in the table. Indexed in parallel with `keys`.
   */
  public Output<U> values() {
    return values;
  }
  
  private Output<T> keys;
  private Output<U> values;
  
  private LookupTableExport(Operation operation) {
    super(operation);
    int outputIdx = 0;
    keys = operation.output(outputIdx++);
    values = operation.output(outputIdx++);
  }
}
