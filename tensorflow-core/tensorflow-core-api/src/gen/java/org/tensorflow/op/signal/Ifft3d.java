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

package org.tensorflow.op.signal;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Inverse 3D fast Fourier transform.
 * <p>
 * Computes the inverse 3-dimensional discrete Fourier transform over the
 * inner-most 3 dimensions of `input`.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "signal")
public final class Ifft3d<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new Ifft3d operation.
   * 
   * @param scope current scope
   * @param input A complex64 tensor.
   * @return a new instance of Ifft3d
   */
  public static <T> Ifft3d<T> create(Scope scope, Operand<T> input) {
    OperationBuilder opBuilder = scope.env().opBuilder("IFFT3D", scope.makeOpName("Ifft3d"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Ifft3d<T>(opBuilder.build());
  }
  
  /**
   * A complex64 tensor of the same shape as `input`. The inner-most 3
   *   dimensions of `input` are replaced with their inverse 3D Fourier transform.
   * <p>
   * @compatibility(numpy)
   * Equivalent to np.fft.ifftn with 3 dimensions.
   * @end_compatibility
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private Ifft3d(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
