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
 * The shape of the elements of the given list, as a tensor.
 * <p>
 *   input_handle: the list
 *   element_shape: the shape of elements of the list
 * 
 * @param <T> data type for {@code elementShape()} output
 */
@Operator
public final class TensorListElementShape<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new TensorListElementShape operation.
   * 
   * @param scope current scope
   * @param inputHandle 
   * @param shapeType 
   * @return a new instance of TensorListElementShape
   */
  public static <T extends Number> TensorListElementShape<T> create(Scope scope, Operand<?> inputHandle, Class<T> shapeType) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorListElementShape", scope.makeOpName("TensorListElementShape"));
    opBuilder.addInput(inputHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("shape_type", DataType.fromClass(shapeType));
    return new TensorListElementShape<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> elementShape() {
    return elementShape;
  }
  
  @Override
  public Output<T> asOutput() {
    return elementShape;
  }
  
  private Output<T> elementShape;
  
  private TensorListElementShape(Operation operation) {
    super(operation);
    int outputIdx = 0;
    elementShape = operation.output(outputIdx++);
  }
}
