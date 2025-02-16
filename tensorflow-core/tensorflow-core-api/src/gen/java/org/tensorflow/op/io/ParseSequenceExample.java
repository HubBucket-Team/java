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
 * Transforms a vector of brain.SequenceExample protos (as strings) into typed tensors.
 */
@Operator(group = "io")
public final class ParseSequenceExample extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.io.ParseSequenceExample}
   */
  public static class Options {
    
    /**
     * @param NcontextSparse 
     */
    public Options NcontextSparse(Long NcontextSparse) {
      this.NcontextSparse = NcontextSparse;
      return this;
    }
    
    /**
     * @param NcontextDense 
     */
    public Options NcontextDense(Long NcontextDense) {
      this.NcontextDense = NcontextDense;
      return this;
    }
    
    /**
     * @param NfeatureListSparse 
     */
    public Options NfeatureListSparse(Long NfeatureListSparse) {
      this.NfeatureListSparse = NfeatureListSparse;
      return this;
    }
    
    /**
     * @param NfeatureListDense 
     */
    public Options NfeatureListDense(Long NfeatureListDense) {
      this.NfeatureListDense = NfeatureListDense;
      return this;
    }
    
    /**
     * @param contextDenseShapes A list of Ncontext_dense shapes; the shapes of data in
     * each context Feature given in context_dense_keys.
     * The number of elements in the Feature corresponding to context_dense_key[j]
     * must always equal context_dense_shapes[j].NumEntries().
     * The shape of context_dense_values[j] will match context_dense_shapes[j].
     */
    public Options contextDenseShapes(List<Shape> contextDenseShapes) {
      this.contextDenseShapes = contextDenseShapes;
      return this;
    }
    
    /**
     * @param featureListDenseShapes A list of Nfeature_list_dense shapes; the shapes of
     * data in each FeatureList given in feature_list_dense_keys.
     * The shape of each Feature in the FeatureList corresponding to
     * feature_list_dense_key[j] must always equal
     * feature_list_dense_shapes[j].NumEntries().
     */
    public Options featureListDenseShapes(List<Shape> featureListDenseShapes) {
      this.featureListDenseShapes = featureListDenseShapes;
      return this;
    }
    
    private Long NcontextSparse;
    private Long NcontextDense;
    private Long NfeatureListSparse;
    private Long NfeatureListDense;
    private List<Shape> contextDenseShapes;
    private List<Shape> featureListDenseShapes;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new ParseSequenceExample operation.
   * 
   * @param scope current scope
   * @param serialized A vector containing binary serialized SequenceExample protos.
   * @param debugName A vector containing the names of the serialized protos.
   * May contain, for example, table key (descriptive) name for the
   * corresponding serialized proto.  This is purely useful for debugging
   * purposes, and the presence of values here has no effect on the output.
   * May also be an empty vector if no name is available.
   * @param contextDenseDefaults A list of Ncontext_dense Tensors (some may be empty).
   * context_dense_defaults[j] provides default values
   * when the SequenceExample's context map lacks context_dense_key[j].
   * If an empty Tensor is provided for context_dense_defaults[j],
   * then the Feature context_dense_keys[j] is required.
   * The input type is inferred from context_dense_defaults[j], even when it's
   * empty.  If context_dense_defaults[j] is not empty, its shape must match
   * context_dense_shapes[j].
   * @param featureListDenseMissingAssumedEmpty A vector listing the
   * FeatureList keys which may be missing from the SequenceExamples.  If the
   * associated FeatureList is missing, it is treated as empty.  By default,
   * any FeatureList not listed in this vector must exist in the SequenceExamples.
   * @param contextSparseKeys A list of Ncontext_sparse string Tensors (scalars).
   * The keys expected in the Examples' features associated with context_sparse
   * values.
   * @param contextDenseKeys A list of Ncontext_dense string Tensors (scalars).
   * The keys expected in the SequenceExamples' context features associated with
   * dense values.
   * @param featureListSparseKeys A list of Nfeature_list_sparse string Tensors
   * (scalars).  The keys expected in the FeatureLists associated with sparse
   * values.
   * @param featureListDenseKeys A list of Nfeature_list_dense string Tensors (scalars).
   * The keys expected in the SequenceExamples' feature_lists associated
   * with lists of dense values.
   * @param contextSparseTypes A list of Ncontext_sparse types; the data types of data in
   * each context Feature given in context_sparse_keys.
   * Currently the ParseSingleSequenceExample supports DT_FLOAT (FloatList),
   * DT_INT64 (Int64List), and DT_STRING (BytesList).
   * @param featureListDenseTypes 
   * @param featureListSparseTypes A list of Nfeature_list_sparse types; the data types
   * of data in each FeatureList given in feature_list_sparse_keys.
   * Currently the ParseSingleSequenceExample supports DT_FLOAT (FloatList),
   * DT_INT64 (Int64List), and DT_STRING (BytesList).
   * @param options carries optional attributes values
   * @return a new instance of ParseSequenceExample
   */
  public static ParseSequenceExample create(Scope scope, Operand<String> serialized, Operand<String> debugName, Iterable<Operand<?>> contextDenseDefaults, List<String> featureListDenseMissingAssumedEmpty, List<String> contextSparseKeys, List<String> contextDenseKeys, List<String> featureListSparseKeys, List<String> featureListDenseKeys, List<Class<?>> contextSparseTypes, List<Class<?>> featureListDenseTypes, List<Class<?>> featureListSparseTypes, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("ParseSequenceExample", scope.makeOpName("ParseSequenceExample"));
    opBuilder.addInput(serialized.asOutput());
    opBuilder.addInput(debugName.asOutput());
    opBuilder.addInputList(Operands.asOutputs(contextDenseDefaults));
    opBuilder = scope.applyControlDependencies(opBuilder);
    String[] featureListDenseMissingAssumedEmptyArray = new String[featureListDenseMissingAssumedEmpty.size()];
    for (int i = 0; i < featureListDenseMissingAssumedEmptyArray.length; ++i) {
      featureListDenseMissingAssumedEmptyArray[i] = featureListDenseMissingAssumedEmpty.get(i);
    }
    opBuilder.setAttr("feature_list_dense_missing_assumed_empty", featureListDenseMissingAssumedEmptyArray);
    String[] contextSparseKeysArray = new String[contextSparseKeys.size()];
    for (int i = 0; i < contextSparseKeysArray.length; ++i) {
      contextSparseKeysArray[i] = contextSparseKeys.get(i);
    }
    opBuilder.setAttr("context_sparse_keys", contextSparseKeysArray);
    String[] contextDenseKeysArray = new String[contextDenseKeys.size()];
    for (int i = 0; i < contextDenseKeysArray.length; ++i) {
      contextDenseKeysArray[i] = contextDenseKeys.get(i);
    }
    opBuilder.setAttr("context_dense_keys", contextDenseKeysArray);
    String[] featureListSparseKeysArray = new String[featureListSparseKeys.size()];
    for (int i = 0; i < featureListSparseKeysArray.length; ++i) {
      featureListSparseKeysArray[i] = featureListSparseKeys.get(i);
    }
    opBuilder.setAttr("feature_list_sparse_keys", featureListSparseKeysArray);
    String[] featureListDenseKeysArray = new String[featureListDenseKeys.size()];
    for (int i = 0; i < featureListDenseKeysArray.length; ++i) {
      featureListDenseKeysArray[i] = featureListDenseKeys.get(i);
    }
    opBuilder.setAttr("feature_list_dense_keys", featureListDenseKeysArray);
    DataType[] contextSparseTypesArray = new DataType[contextSparseTypes.size()];
    for (int i = 0; i < contextSparseTypesArray.length; ++i) {
      contextSparseTypesArray[i] = DataType.fromClass(contextSparseTypes.get(i));
    }
    opBuilder.setAttr("context_sparse_types", contextSparseTypesArray);
    DataType[] featureListDenseTypesArray = new DataType[featureListDenseTypes.size()];
    for (int i = 0; i < featureListDenseTypesArray.length; ++i) {
      featureListDenseTypesArray[i] = DataType.fromClass(featureListDenseTypes.get(i));
    }
    opBuilder.setAttr("feature_list_dense_types", featureListDenseTypesArray);
    DataType[] featureListSparseTypesArray = new DataType[featureListSparseTypes.size()];
    for (int i = 0; i < featureListSparseTypesArray.length; ++i) {
      featureListSparseTypesArray[i] = DataType.fromClass(featureListSparseTypes.get(i));
    }
    opBuilder.setAttr("feature_list_sparse_types", featureListSparseTypesArray);
    if (options != null) {
      for (Options opts : options) {
        if (opts.NcontextSparse != null) {
          opBuilder.setAttr("Ncontext_sparse", opts.NcontextSparse);
        }
        if (opts.NcontextDense != null) {
          opBuilder.setAttr("Ncontext_dense", opts.NcontextDense);
        }
        if (opts.NfeatureListSparse != null) {
          opBuilder.setAttr("Nfeature_list_sparse", opts.NfeatureListSparse);
        }
        if (opts.NfeatureListDense != null) {
          opBuilder.setAttr("Nfeature_list_dense", opts.NfeatureListDense);
        }
        if (opts.contextDenseShapes != null) {
          Shape[] contextDenseShapesArray = new Shape[opts.contextDenseShapes.size()];
          for (int i = 0; i < contextDenseShapesArray.length; ++i) {
            contextDenseShapesArray[i] = opts.contextDenseShapes.get(i);
          }
          opBuilder.setAttr("context_dense_shapes", contextDenseShapesArray);
        }
        if (opts.featureListDenseShapes != null) {
          Shape[] featureListDenseShapesArray = new Shape[opts.featureListDenseShapes.size()];
          for (int i = 0; i < featureListDenseShapesArray.length; ++i) {
            featureListDenseShapesArray[i] = opts.featureListDenseShapes.get(i);
          }
          opBuilder.setAttr("feature_list_dense_shapes", featureListDenseShapesArray);
        }
      }
    }
    return new ParseSequenceExample(opBuilder.build());
  }
  
  /**
   * @param NcontextSparse 
   */
  public static Options NcontextSparse(Long NcontextSparse) {
    return new Options().NcontextSparse(NcontextSparse);
  }
  
  /**
   * @param NcontextDense 
   */
  public static Options NcontextDense(Long NcontextDense) {
    return new Options().NcontextDense(NcontextDense);
  }
  
  /**
   * @param NfeatureListSparse 
   */
  public static Options NfeatureListSparse(Long NfeatureListSparse) {
    return new Options().NfeatureListSparse(NfeatureListSparse);
  }
  
  /**
   * @param NfeatureListDense 
   */
  public static Options NfeatureListDense(Long NfeatureListDense) {
    return new Options().NfeatureListDense(NfeatureListDense);
  }
  
  /**
   * @param contextDenseShapes A list of Ncontext_dense shapes; the shapes of data in
   * each context Feature given in context_dense_keys.
   * The number of elements in the Feature corresponding to context_dense_key[j]
   * must always equal context_dense_shapes[j].NumEntries().
   * The shape of context_dense_values[j] will match context_dense_shapes[j].
   */
  public static Options contextDenseShapes(List<Shape> contextDenseShapes) {
    return new Options().contextDenseShapes(contextDenseShapes);
  }
  
  /**
   * @param featureListDenseShapes A list of Nfeature_list_dense shapes; the shapes of
   * data in each FeatureList given in feature_list_dense_keys.
   * The shape of each Feature in the FeatureList corresponding to
   * feature_list_dense_key[j] must always equal
   * feature_list_dense_shapes[j].NumEntries().
   */
  public static Options featureListDenseShapes(List<Shape> featureListDenseShapes) {
    return new Options().featureListDenseShapes(featureListDenseShapes);
  }
  
  /**
   */
  public List<Output<Long>> contextSparseIndices() {
    return contextSparseIndices;
  }
  
  /**
   */
  public List<Output<?>> contextSparseValues() {
    return contextSparseValues;
  }
  
  /**
   */
  public List<Output<Long>> contextSparseShapes() {
    return contextSparseShapes;
  }
  
  /**
   */
  public List<Output<?>> contextDenseValues() {
    return contextDenseValues;
  }
  
  /**
   */
  public List<Output<Long>> featureListSparseIndices() {
    return featureListSparseIndices;
  }
  
  /**
   */
  public List<Output<?>> featureListSparseValues() {
    return featureListSparseValues;
  }
  
  /**
   */
  public List<Output<Long>> featureListSparseShapes() {
    return featureListSparseShapes;
  }
  
  /**
   */
  public List<Output<?>> featureListDenseValues() {
    return featureListDenseValues;
  }
  
  /**
   */
  public List<Output<Long>> featureListDenseLengths() {
    return featureListDenseLengths;
  }
  
  private List<Output<Long>> contextSparseIndices;
  private List<Output<?>> contextSparseValues;
  private List<Output<Long>> contextSparseShapes;
  private List<Output<?>> contextDenseValues;
  private List<Output<Long>> featureListSparseIndices;
  private List<Output<?>> featureListSparseValues;
  private List<Output<Long>> featureListSparseShapes;
  private List<Output<?>> featureListDenseValues;
  private List<Output<Long>> featureListDenseLengths;
  
  @SuppressWarnings("unchecked")
  private ParseSequenceExample(Operation operation) {
    super(operation);
    int outputIdx = 0;
    int contextSparseIndicesLength = operation.outputListLength("context_sparse_indices");
    contextSparseIndices = Arrays.asList((Output<Long>[])operation.outputList(outputIdx, contextSparseIndicesLength));
    outputIdx += contextSparseIndicesLength;
    int contextSparseValuesLength = operation.outputListLength("context_sparse_values");
    contextSparseValues = Arrays.asList(operation.outputList(outputIdx, contextSparseValuesLength));
    outputIdx += contextSparseValuesLength;
    int contextSparseShapesLength = operation.outputListLength("context_sparse_shapes");
    contextSparseShapes = Arrays.asList((Output<Long>[])operation.outputList(outputIdx, contextSparseShapesLength));
    outputIdx += contextSparseShapesLength;
    int contextDenseValuesLength = operation.outputListLength("context_dense_values");
    contextDenseValues = Arrays.asList(operation.outputList(outputIdx, contextDenseValuesLength));
    outputIdx += contextDenseValuesLength;
    int featureListSparseIndicesLength = operation.outputListLength("feature_list_sparse_indices");
    featureListSparseIndices = Arrays.asList((Output<Long>[])operation.outputList(outputIdx, featureListSparseIndicesLength));
    outputIdx += featureListSparseIndicesLength;
    int featureListSparseValuesLength = operation.outputListLength("feature_list_sparse_values");
    featureListSparseValues = Arrays.asList(operation.outputList(outputIdx, featureListSparseValuesLength));
    outputIdx += featureListSparseValuesLength;
    int featureListSparseShapesLength = operation.outputListLength("feature_list_sparse_shapes");
    featureListSparseShapes = Arrays.asList((Output<Long>[])operation.outputList(outputIdx, featureListSparseShapesLength));
    outputIdx += featureListSparseShapesLength;
    int featureListDenseValuesLength = operation.outputListLength("feature_list_dense_values");
    featureListDenseValues = Arrays.asList(operation.outputList(outputIdx, featureListDenseValuesLength));
    outputIdx += featureListDenseValuesLength;
    int featureListDenseLengthsLength = operation.outputListLength("feature_list_dense_lengths");
    featureListDenseLengths = Arrays.asList((Output<Long>[])operation.outputList(outputIdx, featureListDenseLengthsLength));
    outputIdx += featureListDenseLengthsLength;
  }
}
