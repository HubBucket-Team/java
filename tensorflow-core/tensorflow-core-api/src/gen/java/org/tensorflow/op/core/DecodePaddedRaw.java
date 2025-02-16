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
 * Reinterpret the bytes of a string as a vector of numbers.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class DecodePaddedRaw<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.DecodePaddedRaw}
   */
  public static class Options {
    
    /**
     * @param littleEndian Whether the input `input_bytes` is in little-endian order. Ignored for
     * `out_type` values that are stored in a single byte, like `uint8`
     */
    public Options littleEndian(Boolean littleEndian) {
      this.littleEndian = littleEndian;
      return this;
    }
    
    private Boolean littleEndian;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new DecodePaddedRaw operation.
   * 
   * @param scope current scope
   * @param inputBytes Tensor of string to be decoded.
   * @param fixedLength Length in bytes for each element of the decoded output. Must be a multiple
   * of the size of the output type.
   * @param outType 
   * @param options carries optional attributes values
   * @return a new instance of DecodePaddedRaw
   */
  public static <T extends Number> DecodePaddedRaw<T> create(Scope scope, Operand<String> inputBytes, Operand<Integer> fixedLength, Class<T> outType, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("DecodePaddedRaw", scope.makeOpName("DecodePaddedRaw"));
    opBuilder.addInput(inputBytes.asOutput());
    opBuilder.addInput(fixedLength.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("out_type", DataType.fromClass(outType));
    if (options != null) {
      for (Options opts : options) {
        if (opts.littleEndian != null) {
          opBuilder.setAttr("little_endian", opts.littleEndian);
        }
      }
    }
    return new DecodePaddedRaw<T>(opBuilder.build());
  }
  
  /**
   * @param littleEndian Whether the input `input_bytes` is in little-endian order. Ignored for
   * `out_type` values that are stored in a single byte, like `uint8`
   */
  public static Options littleEndian(Boolean littleEndian) {
    return new Options().littleEndian(littleEndian);
  }
  
  /**
   * A Tensor with one more dimension than the input `bytes`. The added dimension
   * will have size equal to the length of the elements of `bytes` divided by the
   * number of bytes to represent `out_type`.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private DecodePaddedRaw(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
