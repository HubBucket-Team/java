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
import org.tensorflow.op.annotation.Operator;

/**
 * Joins the elements of `inputs` based on `segment_ids`.
 * <p>
 * Computes the string join along segments of a tensor.
 * Given `segment_ids` with rank `N` and `data` with rank `N+M`:
 * <p>
 *     `output[i, k1...kM] = strings.join([data[j1...jN, k1...kM])`
 * <p>
 * where the join is over all [j1...jN] such that segment_ids[j1...jN] = i.
 * Strings are joined in row-major order.
 * <p>
 * For example:
 * <pre>{@code
 * inputs = [['Y', 'q', 'c'], ['Y', '6', '6'], ['p', 'G', 'a']]
 * output_array = string_ops.unsorted_segment_join(inputs=inputs,
 *                                                 segment_ids=[1, 0, 1],
 *                                                 num_segments=2,
 *                                                 separator=':'))
 * # output_array ==> [['Y', '6', '6'], ['Y:p', 'q:G', 'c:a']]
 * 
 * 
 * inputs = ['this', 'is', 'a', 'test']
 * output_array = string_ops.unsorted_segment_join(inputs=inputs,
 *                                                 segment_ids=[0, 0, 0, 0],
 *                                                 num_segments=1,
 *                                                 separator=':'))
 * # output_array ==> ['this:is:a:test']
 * }</pre>
 * 
 */
@Operator
public final class UnsortedSegmentJoin extends PrimitiveOp implements Operand<String> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.UnsortedSegmentJoin}
   */
  public static class Options {
    
    /**
     * @param separator The separator to use when joining.
     */
    public Options separator(String separator) {
      this.separator = separator;
      return this;
    }
    
    private String separator;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new UnsortedSegmentJoin operation.
   * 
   * @param scope current scope
   * @param inputs The input to be joined.
   * @param segmentIds A tensor whose shape is a prefix of data.shape.  Negative segment ids are not
   * supported.
   * @param numSegments A scalar.
   * @param options carries optional attributes values
   * @return a new instance of UnsortedSegmentJoin
   */
  public static <T extends Number, U extends Number> UnsortedSegmentJoin create(Scope scope, Operand<String> inputs, Operand<T> segmentIds, Operand<U> numSegments, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("UnsortedSegmentJoin", scope.makeOpName("UnsortedSegmentJoin"));
    opBuilder.addInput(inputs.asOutput());
    opBuilder.addInput(segmentIds.asOutput());
    opBuilder.addInput(numSegments.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.separator != null) {
          opBuilder.setAttr("separator", opts.separator);
        }
      }
    }
    return new UnsortedSegmentJoin(opBuilder.build());
  }
  
  /**
   * @param separator The separator to use when joining.
   */
  public static Options separator(String separator) {
    return new Options().separator(separator);
  }
  
  /**
   */
  public Output<String> output() {
    return output;
  }
  
  @Override
  public Output<String> asOutput() {
    return output;
  }
  
  private Output<String> output;
  
  private UnsortedSegmentJoin(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
