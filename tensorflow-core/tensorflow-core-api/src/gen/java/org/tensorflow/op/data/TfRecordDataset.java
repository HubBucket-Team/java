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
 * Creates a dataset that emits the records from one or more TFRecord files.
 */
public final class TfRecordDataset extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Factory method to create a class wrapping a new TfRecordDataset operation.
   * 
   * @param scope current scope
   * @param filenames A scalar or vector containing the name(s) of the file(s) to be
   * read.
   * @param compressionType A scalar containing either (i) the empty string (no
   * compression), (ii) "ZLIB", or (iii) "GZIP".
   * @param bufferSize A scalar representing the number of bytes to buffer. A value of
   * 0 means no buffering will be performed.
   * @return a new instance of TfRecordDataset
   */
  public static TfRecordDataset create(Scope scope, Operand<String> filenames, Operand<String> compressionType, Operand<Long> bufferSize) {
    OperationBuilder opBuilder = scope.env().opBuilder("TFRecordDataset", scope.makeOpName("TfRecordDataset"));
    opBuilder.addInput(filenames.asOutput());
    opBuilder.addInput(compressionType.asOutput());
    opBuilder.addInput(bufferSize.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TfRecordDataset(opBuilder.build());
  }
  
  /**
   */
  public Output<?> handle() {
    return handle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) handle;
  }
  
  private Output<?> handle;
  
  private TfRecordDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}
