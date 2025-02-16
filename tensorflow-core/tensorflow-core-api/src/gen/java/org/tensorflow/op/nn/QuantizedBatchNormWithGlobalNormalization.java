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

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Quantized Batch normalization.
 * <p>
 * This op is deprecated and will be removed in the future. Prefer
 * `tf.nn.batch_normalization`.
 * 
 * @param <U> data type for {@code result()} output
 */
@Operator(group = "nn")
public final class QuantizedBatchNormWithGlobalNormalization<U> extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new QuantizedBatchNormWithGlobalNormalization operation.
   * 
   * @param scope current scope
   * @param t A 4D input Tensor.
   * @param tMin The value represented by the lowest quantized input.
   * @param tMax The value represented by the highest quantized input.
   * @param m A 1D mean Tensor with size matching the last dimension of t.
   * This is the first output from tf.nn.moments,
   * or a saved moving average thereof.
   * @param mMin The value represented by the lowest quantized mean.
   * @param mMax The value represented by the highest quantized mean.
   * @param v A 1D variance Tensor with size matching the last dimension of t.
   * This is the second output from tf.nn.moments,
   * or a saved moving average thereof.
   * @param vMin The value represented by the lowest quantized variance.
   * @param vMax The value represented by the highest quantized variance.
   * @param beta A 1D beta Tensor with size matching the last dimension of t.
   * An offset to be added to the normalized tensor.
   * @param betaMin The value represented by the lowest quantized offset.
   * @param betaMax The value represented by the highest quantized offset.
   * @param gamma A 1D gamma Tensor with size matching the last dimension of t.
   * If "scale_after_normalization" is true, this tensor will be multiplied
   * with the normalized tensor.
   * @param gammaMin The value represented by the lowest quantized gamma.
   * @param gammaMax The value represented by the highest quantized gamma.
   * @param outType 
   * @param varianceEpsilon A small float number to avoid dividing by 0.
   * @param scaleAfterNormalization A bool indicating whether the resulted tensor
   * needs to be multiplied with gamma.
   * @return a new instance of QuantizedBatchNormWithGlobalNormalization
   */
  public static <U, T> QuantizedBatchNormWithGlobalNormalization<U> create(Scope scope, Operand<T> t, Operand<Float> tMin, Operand<Float> tMax, Operand<T> m, Operand<Float> mMin, Operand<Float> mMax, Operand<T> v, Operand<Float> vMin, Operand<Float> vMax, Operand<T> beta, Operand<Float> betaMin, Operand<Float> betaMax, Operand<T> gamma, Operand<Float> gammaMin, Operand<Float> gammaMax, Class<U> outType, Float varianceEpsilon, Boolean scaleAfterNormalization) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizedBatchNormWithGlobalNormalization", scope.makeOpName("QuantizedBatchNormWithGlobalNormalization"));
    opBuilder.addInput(t.asOutput());
    opBuilder.addInput(tMin.asOutput());
    opBuilder.addInput(tMax.asOutput());
    opBuilder.addInput(m.asOutput());
    opBuilder.addInput(mMin.asOutput());
    opBuilder.addInput(mMax.asOutput());
    opBuilder.addInput(v.asOutput());
    opBuilder.addInput(vMin.asOutput());
    opBuilder.addInput(vMax.asOutput());
    opBuilder.addInput(beta.asOutput());
    opBuilder.addInput(betaMin.asOutput());
    opBuilder.addInput(betaMax.asOutput());
    opBuilder.addInput(gamma.asOutput());
    opBuilder.addInput(gammaMin.asOutput());
    opBuilder.addInput(gammaMax.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("out_type", DataType.fromClass(outType));
    opBuilder.setAttr("variance_epsilon", varianceEpsilon);
    opBuilder.setAttr("scale_after_normalization", scaleAfterNormalization);
    return new QuantizedBatchNormWithGlobalNormalization<U>(opBuilder.build());
  }
  
  /**
   */
  public Output<U> result() {
    return result;
  }
  
  /**
   */
  public Output<Float> resultMin() {
    return resultMin;
  }
  
  /**
   */
  public Output<Float> resultMax() {
    return resultMax;
  }
  
  private Output<U> result;
  private Output<Float> resultMin;
  private Output<Float> resultMax;
  
  private QuantizedBatchNormWithGlobalNormalization(Operation operation) {
    super(operation);
    int outputIdx = 0;
    result = operation.output(outputIdx++);
    resultMin = operation.output(outputIdx++);
    resultMax = operation.output(outputIdx++);
  }
}
