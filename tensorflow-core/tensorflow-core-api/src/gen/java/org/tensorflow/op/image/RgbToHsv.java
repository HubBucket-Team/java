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

package org.tensorflow.op.image;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Converts one or more images from RGB to HSV.
 * <p>
 * Outputs a tensor of the same shape as the `images` tensor, containing the HSV
 * value of the pixels. The output is only well defined if the value in `images`
 * are in `[0,1]`.
 * <p>
 * `output[..., 0]` contains hue, `output[..., 1]` contains saturation, and
 * `output[..., 2]` contains value. All HSV values are in `[0,1]`. A hue of 0
 * corresponds to pure red, hue 1/3 is pure green, and 2/3 is pure blue.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator(group = "image")
public final class RgbToHsv<T extends Number> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new RgbToHsv operation.
   * 
   * @param scope current scope
   * @param images 1-D or higher rank. RGB data to convert. Last dimension must be size 3.
   * @return a new instance of RgbToHsv
   */
  public static <T extends Number> RgbToHsv<T> create(Scope scope, Operand<T> images) {
    OperationBuilder opBuilder = scope.env().opBuilder("RGBToHSV", scope.makeOpName("RgbToHsv"));
    opBuilder.addInput(images.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new RgbToHsv<T>(opBuilder.build());
  }
  
  /**
   * `images` converted to HSV.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private RgbToHsv(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
