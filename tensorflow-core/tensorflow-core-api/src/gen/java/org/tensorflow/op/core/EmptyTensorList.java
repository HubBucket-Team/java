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
 * Creates and returns an empty tensor list.
 * <p>
 * All list elements must be tensors of dtype element_dtype and shape compatible
 * with element_shape.
 * <p>
 * handle: an empty tensor list.
 * element_dtype: the type of elements in the list.
 * element_shape: a shape compatible with that of elements in the list.
 */
@Operator
public final class EmptyTensorList extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Factory method to create a class wrapping a new EmptyTensorList operation.
   * 
   * @param scope current scope
   * @param elementShape 
   * @param maxNumElements 
   * @param elementDtype 
   * @return a new instance of EmptyTensorList
   */
  public static <T extends Number, U> EmptyTensorList create(Scope scope, Operand<T> elementShape, Operand<Integer> maxNumElements, Class<U> elementDtype) {
    OperationBuilder opBuilder = scope.env().opBuilder("EmptyTensorList", scope.makeOpName("EmptyTensorList"));
    opBuilder.addInput(elementShape.asOutput());
    opBuilder.addInput(maxNumElements.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("element_dtype", DataType.fromClass(elementDtype));
    return new EmptyTensorList(opBuilder.build());
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
  
  private EmptyTensorList(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}
