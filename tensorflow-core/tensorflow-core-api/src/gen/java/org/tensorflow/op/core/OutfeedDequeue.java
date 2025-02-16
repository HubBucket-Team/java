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
import org.tensorflow.Shape;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Retrieves a single tensor from the computation outfeed.
 * <p>
 * This operation will block indefinitely until data is available.
 * 
 * @param <T> data type for {@code output()} output
 */
public final class OutfeedDequeue<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.OutfeedDequeue}
   */
  public static class Options {
    
    /**
     * @param deviceOrdinal The TPU device to use. This should be -1 when the Op
     * is running on a TPU device, and >= 0 when the Op is running on the CPU
     * device.
     */
    public Options deviceOrdinal(Long deviceOrdinal) {
      this.deviceOrdinal = deviceOrdinal;
      return this;
    }
    
    private Long deviceOrdinal;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new OutfeedDequeue operation.
   * 
   * @param scope current scope
   * @param dtype The type of elements in the tensor.
   * @param shape The shape of the tensor.
   * @param options carries optional attributes values
   * @return a new instance of OutfeedDequeue
   */
  public static <T> OutfeedDequeue<T> create(Scope scope, Class<T> dtype, Shape shape, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("OutfeedDequeue", scope.makeOpName("OutfeedDequeue"));
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("dtype", DataType.fromClass(dtype));
    opBuilder.setAttr("shape", shape);
    if (options != null) {
      for (Options opts : options) {
        if (opts.deviceOrdinal != null) {
          opBuilder.setAttr("device_ordinal", opts.deviceOrdinal);
        }
      }
    }
    return new OutfeedDequeue<T>(opBuilder.build());
  }
  
  /**
   * @param deviceOrdinal The TPU device to use. This should be -1 when the Op
   * is running on a TPU device, and >= 0 when the Op is running on the CPU
   * device.
   */
  public static Options deviceOrdinal(Long deviceOrdinal) {
    return new Options().deviceOrdinal(deviceOrdinal);
  }
  
  /**
   * A tensor that will be read from the device outfeed.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private OutfeedDequeue(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
