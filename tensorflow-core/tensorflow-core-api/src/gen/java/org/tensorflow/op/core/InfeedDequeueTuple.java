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

import java.util.Arrays;
import java.util.Iterator;
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
 * Fetches multiple values from infeed as an XLA tuple.
 */
public final class InfeedDequeueTuple extends PrimitiveOp implements Iterable<Operand<Object>> {
  
  /**
   * Factory method to create a class wrapping a new InfeedDequeueTuple operation.
   * 
   * @param scope current scope
   * @param dtypes The element types of each element in `outputs`.
   * @param shapes The shapes of each tensor in `outputs`.
   * @return a new instance of InfeedDequeueTuple
   */
  public static InfeedDequeueTuple create(Scope scope, List<Class<?>> dtypes, List<Shape> shapes) {
    OperationBuilder opBuilder = scope.env().opBuilder("InfeedDequeueTuple", scope.makeOpName("InfeedDequeueTuple"));
    opBuilder = scope.applyControlDependencies(opBuilder);
    DataType[] dtypesArray = new DataType[dtypes.size()];
    for (int i = 0; i < dtypesArray.length; ++i) {
      dtypesArray[i] = DataType.fromClass(dtypes.get(i));
    }
    opBuilder.setAttr("dtypes", dtypesArray);
    Shape[] shapesArray = new Shape[shapes.size()];
    for (int i = 0; i < shapesArray.length; ++i) {
      shapesArray[i] = shapes.get(i);
    }
    opBuilder.setAttr("shapes", shapesArray);
    return new InfeedDequeueTuple(opBuilder.build());
  }
  
  /**
   * A list of tensors that will be provided using the infeed mechanism.
   */
  public List<Output<?>> outputs() {
    return outputs;
  }
  
  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<Object>> iterator() {
    return (Iterator) outputs.iterator();
  }
  
  private List<Output<?>> outputs;
  
  private InfeedDequeueTuple(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int outputsLength = operation.outputListLength("outputs");
    outputs = Arrays.asList(operation.outputList(outputIdx, outputsLength));
    outputIdx += outputsLength;
  }
}
