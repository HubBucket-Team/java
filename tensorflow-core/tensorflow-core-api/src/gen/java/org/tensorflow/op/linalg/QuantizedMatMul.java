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

package org.tensorflow.op.linalg;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Perform a quantized matrix multiplication of  `a` by the matrix `b`.
 * <p>
 * The inputs must be two-dimensional matrices and the inner dimension of
 * `a` (after being transposed if `transpose_a` is non-zero) must match the
 * outer dimension of `b` (after being transposed if `transposed_b` is
 * non-zero).
 * 
 * @param <V> data type for {@code out()} output
 */
@Operator(group = "linalg")
public final class QuantizedMatMul<V> extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.linalg.QuantizedMatMul}
   */
  public static class Options {
    
    /**
     * @param transposeA If true, `a` is transposed before multiplication.
     */
    public Options transposeA(Boolean transposeA) {
      this.transposeA = transposeA;
      return this;
    }
    
    /**
     * @param transposeB If true, `b` is transposed before multiplication.
     */
    public Options transposeB(Boolean transposeB) {
      this.transposeB = transposeB;
      return this;
    }
    
    private Boolean transposeA;
    private Boolean transposeB;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new QuantizedMatMul operation.
   * 
   * @param scope current scope
   * @param a Must be a two-dimensional tensor.
   * @param b Must be a two-dimensional tensor.
   * @param minA The float value that the lowest quantized `a` value represents.
   * @param maxA The float value that the highest quantized `a` value represents.
   * @param minB The float value that the lowest quantized `b` value represents.
   * @param maxB The float value that the highest quantized `b` value represents.
   * @param Toutput 
   * @param Tactivation The type of output produced by activation function
   * following this operation.
   * @param options carries optional attributes values
   * @return a new instance of QuantizedMatMul
   */
  public static <V, T, U, W> QuantizedMatMul<V> create(Scope scope, Operand<T> a, Operand<U> b, Operand<Float> minA, Operand<Float> maxA, Operand<Float> minB, Operand<Float> maxB, Class<V> Toutput, Class<W> Tactivation, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizedMatMul", scope.makeOpName("QuantizedMatMul"));
    opBuilder.addInput(a.asOutput());
    opBuilder.addInput(b.asOutput());
    opBuilder.addInput(minA.asOutput());
    opBuilder.addInput(maxA.asOutput());
    opBuilder.addInput(minB.asOutput());
    opBuilder.addInput(maxB.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("Toutput", DataType.fromClass(Toutput));
    opBuilder.setAttr("Tactivation", DataType.fromClass(Tactivation));
    if (options != null) {
      for (Options opts : options) {
        if (opts.transposeA != null) {
          opBuilder.setAttr("transpose_a", opts.transposeA);
        }
        if (opts.transposeB != null) {
          opBuilder.setAttr("transpose_b", opts.transposeB);
        }
      }
    }
    return new QuantizedMatMul<V>(opBuilder.build());
  }
  
  /**
   * @param transposeA If true, `a` is transposed before multiplication.
   */
  public static Options transposeA(Boolean transposeA) {
    return new Options().transposeA(transposeA);
  }
  
  /**
   * @param transposeB If true, `b` is transposed before multiplication.
   */
  public static Options transposeB(Boolean transposeB) {
    return new Options().transposeB(transposeB);
  }
  
  /**
   */
  public Output<V> out() {
    return out;
  }
  
  /**
   * The float value that the lowest quantized output value represents.
   */
  public Output<Float> minOut() {
    return minOut;
  }
  
  /**
   * The float value that the highest quantized output value represents.
   */
  public Output<Float> maxOut() {
    return maxOut;
  }
  
  private Output<V> out;
  private Output<Float> minOut;
  private Output<Float> maxOut;
  
  private QuantizedMatMul(Operation operation) {
    super(operation);
    int outputIdx = 0;
    out = operation.output(outputIdx++);
    minOut = operation.output(outputIdx++);
    maxOut = operation.output(outputIdx++);
  }
}
