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

package org.tensorflow.op.nn;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Performs greedy decoding on the logits given in inputs.
 * <p>
 * A note about the attribute merge_repeated: if enabled, when
 * consecutive logits' maximum indices are the same, only the first of
 * these is emitted.  Labeling the blank '*', the sequence "A B B * B B"
 * becomes "A B B" if merge_repeated = True and "A B B B B" if
 * merge_repeated = False.
 * <p>
 * Regardless of the value of merge_repeated, if the maximum index of a given
 * time and batch corresponds to the blank, index `(num_classes - 1)`, no new
 * element is emitted.
 */
@Operator(group = "nn")
public final class CtcGreedyDecoder extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.nn.CtcGreedyDecoder}
   */
  public static class Options {
    
    /**
     * @param mergeRepeated If True, merge repeated classes in output.
     */
    public Options mergeRepeated(Boolean mergeRepeated) {
      this.mergeRepeated = mergeRepeated;
      return this;
    }
    
    private Boolean mergeRepeated;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new CtcGreedyDecoder operation.
   * 
   * @param scope current scope
   * @param inputs 3-D, shape: `(max_time x batch_size x num_classes)`, the logits.
   * @param sequenceLength A vector containing sequence lengths, size `(batch_size)`.
   * @param options carries optional attributes values
   * @return a new instance of CtcGreedyDecoder
   */
  public static CtcGreedyDecoder create(Scope scope, Operand<Float> inputs, Operand<Integer> sequenceLength, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("CTCGreedyDecoder", scope.makeOpName("CtcGreedyDecoder"));
    opBuilder.addInput(inputs.asOutput());
    opBuilder.addInput(sequenceLength.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.mergeRepeated != null) {
          opBuilder.setAttr("merge_repeated", opts.mergeRepeated);
        }
      }
    }
    return new CtcGreedyDecoder(opBuilder.build());
  }
  
  /**
   * @param mergeRepeated If True, merge repeated classes in output.
   */
  public static Options mergeRepeated(Boolean mergeRepeated) {
    return new Options().mergeRepeated(mergeRepeated);
  }
  
  /**
   * Indices matrix, size `(total_decoded_outputs x 2)`,
   * of a `SparseTensor<int64, 2>`.  The rows store: [batch, time].
   */
  public Output<Long> decodedIndices() {
    return decodedIndices;
  }
  
  /**
   * Values vector, size: `(total_decoded_outputs)`,
   * of a `SparseTensor<int64, 2>`.  The vector stores the decoded classes.
   */
  public Output<Long> decodedValues() {
    return decodedValues;
  }
  
  /**
   * Shape vector, size `(2)`, of the decoded SparseTensor.
   * Values are: `[batch_size, max_decoded_length]`.
   */
  public Output<Long> decodedShape() {
    return decodedShape;
  }
  
  /**
   * Matrix, size `(batch_size x 1)`, containing sequence
   * log-probabilities.
   */
  public Output<Float> logProbability() {
    return logProbability;
  }
  
  private Output<Long> decodedIndices;
  private Output<Long> decodedValues;
  private Output<Long> decodedShape;
  private Output<Float> logProbability;
  
  private CtcGreedyDecoder(Operation operation) {
    super(operation);
    int outputIdx = 0;
    decodedIndices = operation.output(outputIdx++);
    decodedValues = operation.output(outputIdx++);
    decodedShape = operation.output(outputIdx++);
    logProbability = operation.output(outputIdx++);
  }
}
