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

import java.util.List;
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.Shape;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Creates a MultiDeviceIterator resource.
 */
public final class MultiDeviceIterator extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Factory method to create a class wrapping a new MultiDeviceIterator operation.
   * 
   * @param scope current scope
   * @param devices A list of devices the iterator works across.
   * @param sharedName If non-empty, this resource will be shared under the given name
   * across multiple sessions.
   * @param container If non-empty, this resource is placed in the given container.
   * Otherwise, a default container is used.
   * @param outputTypes The type list for the return values.
   * @param outputShapes The list of shapes being produced.
   * @return a new instance of MultiDeviceIterator
   */
  public static MultiDeviceIterator create(Scope scope, List<String> devices, String sharedName, String container, List<Class<?>> outputTypes, List<Shape> outputShapes) {
    OperationBuilder opBuilder = scope.env().opBuilder("MultiDeviceIterator", scope.makeOpName("MultiDeviceIterator"));
    opBuilder = scope.applyControlDependencies(opBuilder);
    String[] devicesArray = new String[devices.size()];
    for (int i = 0; i < devicesArray.length; ++i) {
      devicesArray[i] = devices.get(i);
    }
    opBuilder.setAttr("devices", devicesArray);
    opBuilder.setAttr("shared_name", sharedName);
    opBuilder.setAttr("container", container);
    DataType[] outputTypesArray = new DataType[outputTypes.size()];
    for (int i = 0; i < outputTypesArray.length; ++i) {
      outputTypesArray[i] = DataType.fromClass(outputTypes.get(i));
    }
    opBuilder.setAttr("output_types", outputTypesArray);
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0; i < outputShapesArray.length; ++i) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    return new MultiDeviceIterator(opBuilder.build());
  }
  
  /**
   * Handle to the resource created.
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
  
  private MultiDeviceIterator(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}
