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
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Outputs a `Summary` protocol buffer with a histogram.
 * <p>
 * The generated
 * [`Summary`](https://www.tensorflow.org/code/tensorflow/core/framework/summary.proto)
 * has one summary value containing a histogram for `values`.
 * <p>
 * This op reports an `InvalidArgument` error if any value is not finite.
 */
@Operator(group = "summary")
public final class HistogramSummary extends PrimitiveOp implements Operand<String> {
  
  /**
   * Factory method to create a class wrapping a new HistogramSummary operation.
   * 
   * @param scope current scope
   * @param tag Scalar.  Tag to use for the `Summary.Value`.
   * @param values Any shape. Values to use to build the histogram.
   * @return a new instance of HistogramSummary
   */
  public static <T extends Number> HistogramSummary create(Scope scope, Operand<String> tag, Operand<T> values) {
    OperationBuilder opBuilder = scope.env().opBuilder("HistogramSummary", scope.makeOpName("HistogramSummary"));
    opBuilder.addInput(tag.asOutput());
    opBuilder.addInput(values.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new HistogramSummary(opBuilder.build());
  }
  
  /**
   * Scalar. Serialized `Summary` protocol buffer.
   */
  public Output<String> summary() {
    return summary;
  }
  
  @Override
  public Output<String> asOutput() {
    return summary;
  }
  
  private Output<String> summary;
  
  private HistogramSummary(Operation operation) {
    super(operation);
    int outputIdx = 0;
    summary = operation.output(outputIdx++);
  }
}
