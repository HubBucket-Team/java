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

package org.tensorflow.op.io;

import java.util.Arrays;
import java.util.List;
import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.Shape;
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Transforms a tf.Example proto (as a string) into typed tensors.
 */
@Operator(group = "io")
public final class ParseSingleExample extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new ParseSingleExample operation.
   * 
   * @param scope current scope
   * @param serialized A vector containing a batch of binary serialized Example protos.
   * @param denseDefaults A list of Tensors (some may be empty), whose length matches
   * the length of `dense_keys`. dense_defaults[j] provides default values
   * when the example's feature_map lacks dense_key[j].  If an empty Tensor is
   * provided for dense_defaults[j], then the Feature dense_keys[j] is required.
   * The input type is inferred from dense_defaults[j], even when it's empty.
   * If dense_defaults[j] is not empty, and dense_shapes[j] is fully defined,
   * then the shape of dense_defaults[j] must match that of dense_shapes[j].
   * If dense_shapes[j] has an undefined major dimension (variable strides dense
   * feature), dense_defaults[j] must contain a single element:
   * the padding element.
   * @param numSparse The number of sparse features to be parsed from the example. This
   * must match the lengths of `sparse_keys` and `sparse_types`.
   * @param sparseKeys A list of `num_sparse` strings.
   * The keys expected in the Examples' features associated with sparse values.
   * @param denseKeys The keys expected in the Examples' features associated with dense
   * values.
   * @param sparseTypes A list of `num_sparse` types; the data types of data in each
   * Feature given in sparse_keys.
   * Currently the ParseSingleExample op supports DT_FLOAT (FloatList),
   * DT_INT64 (Int64List), and DT_STRING (BytesList).
   * @param denseShapes The shapes of data in each Feature given in dense_keys.
   * The length of this list must match the length of `dense_keys`.  The
   * number of elements in the Feature corresponding to dense_key[j] must
   * always equal dense_shapes[j].NumEntries().  If dense_shapes[j] ==
   * (D0, D1, ..., DN) then the shape of output Tensor dense_values[j]
   * will be (D0, D1, ..., DN): In the case dense_shapes[j] = (-1, D1,
   * ..., DN), the shape of the output Tensor dense_values[j] will be (M,
   * D1, .., DN), where M is the number of blocks of elements of length
   * D1 * .... * DN, in the input.
   * @return a new instance of ParseSingleExample
   */
  public static ParseSingleExample create(Scope scope, Operand<String> serialized, Iterable<Operand<?>> denseDefaults, Long numSparse, List<String> sparseKeys, List<String> denseKeys, List<Class<?>> sparseTypes, List<Shape> denseShapes) {
    OperationBuilder opBuilder = scope.env().opBuilder("ParseSingleExample", scope.makeOpName("ParseSingleExample"));
    opBuilder.addInput(serialized.asOutput());
    opBuilder.addInputList(Operands.asOutputs(denseDefaults));
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("num_sparse", numSparse);
    String[] sparseKeysArray = new String[sparseKeys.size()];
    for (int i = 0; i < sparseKeysArray.length; ++i) {
      sparseKeysArray[i] = sparseKeys.get(i);
    }
    opBuilder.setAttr("sparse_keys", sparseKeysArray);
    String[] denseKeysArray = new String[denseKeys.size()];
    for (int i = 0; i < denseKeysArray.length; ++i) {
      denseKeysArray[i] = denseKeys.get(i);
    }
    opBuilder.setAttr("dense_keys", denseKeysArray);
    DataType[] sparseTypesArray = new DataType[sparseTypes.size()];
    for (int i = 0; i < sparseTypesArray.length; ++i) {
      sparseTypesArray[i] = DataType.fromClass(sparseTypes.get(i));
    }
    opBuilder.setAttr("sparse_types", sparseTypesArray);
    Shape[] denseShapesArray = new Shape[denseShapes.size()];
    for (int i = 0; i < denseShapesArray.length; ++i) {
      denseShapesArray[i] = denseShapes.get(i);
    }
    opBuilder.setAttr("dense_shapes", denseShapesArray);
    return new ParseSingleExample(opBuilder.build());
  }
  
  /**
   */
  public List<Output<Long>> sparseIndices() {
    return sparseIndices;
  }
  
  /**
   */
  public List<Output<?>> sparseValues() {
    return sparseValues;
  }
  
  /**
   */
  public List<Output<Long>> sparseShapes() {
    return sparseShapes;
  }
  
  /**
   */
  public List<Output<?>> denseValues() {
    return denseValues;
  }
  
  private List<Output<Long>> sparseIndices;
  private List<Output<?>> sparseValues;
  private List<Output<Long>> sparseShapes;
  private List<Output<?>> denseValues;
  
  @SuppressWarnings("unchecked")
  private ParseSingleExample(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int sparseIndicesLength = operation.outputListLength("sparse_indices");
    sparseIndices = Arrays.asList((Output<Long>[])operation.outputList(outputIdx, sparseIndicesLength));
    outputIdx += sparseIndicesLength;
    int sparseValuesLength = operation.outputListLength("sparse_values");
    sparseValues = Arrays.asList(operation.outputList(outputIdx, sparseValuesLength));
    outputIdx += sparseValuesLength;
    int sparseShapesLength = operation.outputListLength("sparse_shapes");
    sparseShapes = Arrays.asList((Output<Long>[])operation.outputList(outputIdx, sparseShapesLength));
    outputIdx += sparseShapesLength;
    int denseValuesLength = operation.outputListLength("dense_values");
    denseValues = Arrays.asList(operation.outputList(outputIdx, denseValuesLength));
    outputIdx += denseValuesLength;
  }
}
