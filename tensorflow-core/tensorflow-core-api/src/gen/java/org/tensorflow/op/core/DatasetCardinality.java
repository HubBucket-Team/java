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
 * Returns the cardinality of `input_dataset`.
 * <p>
 * Returns the cardinality of `input_dataset`.
 */
public final class DatasetCardinality extends PrimitiveOp implements Operand<Long> {
  
  /**
   * Factory method to create a class wrapping a new DatasetCardinality operation.
   * 
   * @param scope current scope
   * @param inputDataset A variant tensor representing the dataset to return cardinality for.
   * @return a new instance of DatasetCardinality
   */
  public static DatasetCardinality create(Scope scope, Operand<?> inputDataset) {
    OperationBuilder opBuilder = scope.env().opBuilder("DatasetCardinality", scope.makeOpName("DatasetCardinality"));
    opBuilder.addInput(inputDataset.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new DatasetCardinality(opBuilder.build());
  }
  
  /**
   * The cardinality of `input_dataset`. Named constants are used to represent
   * infinite and unknown cardinality.
   */
  public Output<Long> cardinality() {
    return cardinality;
  }
  
  @Override
  public Output<Long> asOutput() {
    return cardinality;
  }
  
  private Output<Long> cardinality;
  
  private DatasetCardinality(Operation operation) {
    super(operation);
    int outputIdx = 0;
    cardinality = operation.output(outputIdx++);
  }
}
