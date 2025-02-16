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

/**
 * Computes rectified linear: `max(features, features * alpha)`.
 * 
 * @param <T> data type for {@code activations()} output
 */
public final class LeakyRelu<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.nn.LeakyRelu}
   */
  public static class Options {
    
    /**
     * @param alpha 
     */
    public Options alpha(Float alpha) {
      this.alpha = alpha;
      return this;
    }
    
    private Float alpha;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new LeakyRelu operation.
   * 
   * @param scope current scope
   * @param features 
   * @param options carries optional attributes values
   * @return a new instance of LeakyRelu
   */
  public static <T extends Number> LeakyRelu<T> create(Scope scope, Operand<T> features, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("LeakyRelu", scope.makeOpName("LeakyRelu"));
    opBuilder.addInput(features.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.alpha != null) {
          opBuilder.setAttr("alpha", opts.alpha);
        }
      }
    }
    return new LeakyRelu<T>(opBuilder.build());
  }
  
  /**
   * @param alpha 
   */
  public static Options alpha(Float alpha) {
    return new Options().alpha(alpha);
  }
  
  /**
   */
  public Output<T> activations() {
    return activations;
  }
  
  @Override
  public Output<T> asOutput() {
    return activations;
  }
  
  private Output<T> activations;
  
  private LeakyRelu(Operation operation) {
    super(operation);
    int outputIdx = 0;
    activations = operation.output(outputIdx++);
  }
}
