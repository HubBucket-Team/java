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
 * Outputs a tensor containing the reduction across all input tensors.
 * <p>
 * Outputs a tensor containing the reduction across all input tensors passed to ops
 * within the same `shared_name.
 * <p>
 * The graph should be constructed so if one op runs with shared_name value `c`,
 * then `num_devices` ops will run with shared_name value `c`.  Failure to do so
 * will cause the graph execution to fail to complete.
 * <p>
 * input: the input to the reduction
 * data: the value of the reduction across all `num_devices` devices.
 * reduction: the reduction operation to perform.
 * num_devices: The number of devices participating in this reduction.
 * shared_name: Identifier that shared between ops of the same reduction.
 * 
 * @param <T> data type for {@code data()} output
 */
public final class NcclAllReduce<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new NcclAllReduce operation.
   * 
   * @param scope current scope
   * @param input 
   * @param reduction 
   * @param numDevices 
   * @param sharedName 
   * @return a new instance of NcclAllReduce
   */
  public static <T extends Number> NcclAllReduce<T> create(Scope scope, Operand<T> input, String reduction, Long numDevices, String sharedName) {
    OperationBuilder opBuilder = scope.env().opBuilder("NcclAllReduce", scope.makeOpName("NcclAllReduce"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("reduction", reduction);
    opBuilder.setAttr("num_devices", numDevices);
    opBuilder.setAttr("shared_name", sharedName);
    return new NcclAllReduce<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> data() {
    return data;
  }
  
  @Override
  public Output<T> asOutput() {
    return data;
  }
  
  private Output<T> data;
  
  private NcclAllReduce(Operation operation) {
    super(operation);
    int outputIdx = 0;
    data = operation.output(outputIdx++);
  }
}
