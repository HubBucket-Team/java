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
 * Assign `value` to the sliced l-value reference of `ref`.
 * <p>
 * The values of `value` are assigned to the positions in the variable
 * `ref` that are selected by the slice parameters. The slice parameters
 * `begin`, `end`, `strides`, etc. work exactly as in `StridedSlice`.
 * <p>
 * NOTE this op currently does not support broadcasting and so `value`'s
 * shape must be exactly the shape produced by the slice of `ref`.
 * 
 * @param <T> data type for {@code outputRef()} output
 */
@Operator
public final class StridedSliceAssign<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.StridedSliceAssign}
   */
  public static class Options {
    
    /**
     * @param beginMask 
     */
    public Options beginMask(Long beginMask) {
      this.beginMask = beginMask;
      return this;
    }
    
    /**
     * @param endMask 
     */
    public Options endMask(Long endMask) {
      this.endMask = endMask;
      return this;
    }
    
    /**
     * @param ellipsisMask 
     */
    public Options ellipsisMask(Long ellipsisMask) {
      this.ellipsisMask = ellipsisMask;
      return this;
    }
    
    /**
     * @param newAxisMask 
     */
    public Options newAxisMask(Long newAxisMask) {
      this.newAxisMask = newAxisMask;
      return this;
    }
    
    /**
     * @param shrinkAxisMask 
     */
    public Options shrinkAxisMask(Long shrinkAxisMask) {
      this.shrinkAxisMask = shrinkAxisMask;
      return this;
    }
    
    private Long beginMask;
    private Long endMask;
    private Long ellipsisMask;
    private Long newAxisMask;
    private Long shrinkAxisMask;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new StridedSliceAssign operation.
   * 
   * @param scope current scope
   * @param ref 
   * @param begin 
   * @param end 
   * @param strides 
   * @param value 
   * @param options carries optional attributes values
   * @return a new instance of StridedSliceAssign
   */
  public static <T, U extends Number> StridedSliceAssign<T> create(Scope scope, Operand<T> ref, Operand<U> begin, Operand<U> end, Operand<U> strides, Operand<T> value, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("StridedSliceAssign", scope.makeOpName("StridedSliceAssign"));
    opBuilder.addInput(ref.asOutput());
    opBuilder.addInput(begin.asOutput());
    opBuilder.addInput(end.asOutput());
    opBuilder.addInput(strides.asOutput());
    opBuilder.addInput(value.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.beginMask != null) {
          opBuilder.setAttr("begin_mask", opts.beginMask);
        }
        if (opts.endMask != null) {
          opBuilder.setAttr("end_mask", opts.endMask);
        }
        if (opts.ellipsisMask != null) {
          opBuilder.setAttr("ellipsis_mask", opts.ellipsisMask);
        }
        if (opts.newAxisMask != null) {
          opBuilder.setAttr("new_axis_mask", opts.newAxisMask);
        }
        if (opts.shrinkAxisMask != null) {
          opBuilder.setAttr("shrink_axis_mask", opts.shrinkAxisMask);
        }
      }
    }
    return new StridedSliceAssign<T>(opBuilder.build());
  }
  
  /**
   * @param beginMask 
   */
  public static Options beginMask(Long beginMask) {
    return new Options().beginMask(beginMask);
  }
  
  /**
   * @param endMask 
   */
  public static Options endMask(Long endMask) {
    return new Options().endMask(endMask);
  }
  
  /**
   * @param ellipsisMask 
   */
  public static Options ellipsisMask(Long ellipsisMask) {
    return new Options().ellipsisMask(ellipsisMask);
  }
  
  /**
   * @param newAxisMask 
   */
  public static Options newAxisMask(Long newAxisMask) {
    return new Options().newAxisMask(newAxisMask);
  }
  
  /**
   * @param shrinkAxisMask 
   */
  public static Options shrinkAxisMask(Long shrinkAxisMask) {
    return new Options().shrinkAxisMask(shrinkAxisMask);
  }
  
  /**
   */
  public Output<T> outputRef() {
    return outputRef;
  }
  
  @Override
  public Output<T> asOutput() {
    return outputRef;
  }
  
  private Output<T> outputRef;
  
  private StridedSliceAssign(Operation operation) {
    super(operation);
    int outputIdx = 0;
    outputRef = operation.output(outputIdx++);
  }
}
