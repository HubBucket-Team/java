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
import org.tensorflow.Shape;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Returns immutable tensor from memory region.
 * <p>
 * The current implementation memmaps the tensor from a file.
 * 
 * @param <T> data type for {@code tensor()} output
 */
@Operator
public final class ImmutableConst<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new ImmutableConst operation.
   * 
   * @param scope current scope
   * @param dtype Type of the returned tensor.
   * @param shape Shape of the returned tensor.
   * @param memoryRegionName Name of readonly memory region used by the tensor, see
   * NewReadOnlyMemoryRegionFromFile in tensorflow::Env.
   * @return a new instance of ImmutableConst
   */
  public static <T> ImmutableConst<T> create(Scope scope, Class<T> dtype, Shape shape, String memoryRegionName) {
    OperationBuilder opBuilder = scope.env().opBuilder("ImmutableConst", scope.makeOpName("ImmutableConst"));
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("dtype", DataType.fromClass(dtype));
    opBuilder.setAttr("shape", shape);
    opBuilder.setAttr("memory_region_name", memoryRegionName);
    return new ImmutableConst<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> tensor() {
    return tensor;
  }
  
  @Override
  public Output<T> asOutput() {
    return tensor;
  }
  
  private Output<T> tensor;
  
  private ImmutableConst(Operation operation) {
    super(operation);
    int outputIdx = 0;
    tensor = operation.output(outputIdx++);
  }
}
