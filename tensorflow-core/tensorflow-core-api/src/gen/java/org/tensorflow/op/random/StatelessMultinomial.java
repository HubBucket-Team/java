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

package org.tensorflow.op.random;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Draws samples from a multinomial distribution.
 * 
 * @param <V> data type for {@code output()} output
 */
@Operator(group = "random")
public final class StatelessMultinomial<V extends Number> extends PrimitiveOp implements Operand<V> {
  
  /**
   * Factory method to create a class wrapping a new StatelessMultinomial operation.
   * 
   * @param scope current scope
   * @param logits 2-D Tensor with shape `[batch_size, num_classes]`.  Each slice `[i, :]`
   * represents the unnormalized log probabilities for all classes.
   * @param numSamples 0-D.  Number of independent samples to draw for each row slice.
   * @param seed 2 seeds (shape [2]).
   * @param outputDtype 
   * @return a new instance of StatelessMultinomial
   */
  public static <V extends Number, T extends Number, U extends Number> StatelessMultinomial<V> create(Scope scope, Operand<T> logits, Operand<Integer> numSamples, Operand<U> seed, Class<V> outputDtype) {
    OperationBuilder opBuilder = scope.env().opBuilder("StatelessMultinomial", scope.makeOpName("StatelessMultinomial"));
    opBuilder.addInput(logits.asOutput());
    opBuilder.addInput(numSamples.asOutput());
    opBuilder.addInput(seed.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("output_dtype", DataType.fromClass(outputDtype));
    return new StatelessMultinomial<V>(opBuilder.build());
  }
  
  /**
   * Factory method to create a class wrapping a new StatelessMultinomial operation using default output types.
   * 
   * @param scope current scope
   * @param logits 2-D Tensor with shape `[batch_size, num_classes]`.  Each slice `[i, :]`
   * represents the unnormalized log probabilities for all classes.
   * @param numSamples 0-D.  Number of independent samples to draw for each row slice.
   * @param seed 2 seeds (shape [2]).
   * @return a new instance of StatelessMultinomial
   */
  public static <T extends Number, U extends Number> StatelessMultinomial<Long> create(Scope scope, Operand<T> logits, Operand<Integer> numSamples, Operand<U> seed) {
    return create(scope, logits, numSamples, seed, Long.class);
  }
  
  /**
   * 2-D Tensor with shape `[batch_size, num_samples]`.  Each slice `[i, :]`
   * contains the drawn class labels with range `[0, num_classes)`.
   */
  public Output<V> output() {
    return output;
  }
  
  @Override
  public Output<V> asOutput() {
    return output;
  }
  
  private Output<V> output;
  
  private StatelessMultinomial(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
