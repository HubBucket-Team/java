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
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;

/**
 * Update relevant entries in '*var' and '*accum' according to the adagrad scheme.
 * <p>
 * That is for rows we have grad for, we update var and accum as follows:
 * accum += grad * grad
 * var -= lr * grad * (1 / sqrt(accum))
 */
public final class ResourceSparseApplyAdagradV2 extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.ResourceSparseApplyAdagradV2}
   */
  public static class Options {
    
    /**
     * @param useLocking If `True`, updating of the var and accum tensors will be protected
     * by a lock; otherwise the behavior is undefined, but may exhibit less
     * contention.
     */
    public Options useLocking(Boolean useLocking) {
      this.useLocking = useLocking;
      return this;
    }
    
    /**
     * @param updateSlots 
     */
    public Options updateSlots(Boolean updateSlots) {
      this.updateSlots = updateSlots;
      return this;
    }
    
    private Boolean useLocking;
    private Boolean updateSlots;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new ResourceSparseApplyAdagradV2 operation.
   * 
   * @param scope current scope
   * @param var Should be from a Variable().
   * @param accum Should be from a Variable().
   * @param lr Learning rate. Must be a scalar.
   * @param epsilon Constant factor. Must be a scalar.
   * @param grad The gradient.
   * @param indices A vector of indices into the first dimension of var and accum.
   * @param options carries optional attributes values
   * @return a new instance of ResourceSparseApplyAdagradV2
   */
  public static <T, U extends Number> ResourceSparseApplyAdagradV2 create(Scope scope, Operand<?> var, Operand<?> accum, Operand<T> lr, Operand<T> epsilon, Operand<T> grad, Operand<U> indices, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("ResourceSparseApplyAdagradV2", scope.makeOpName("ResourceSparseApplyAdagradV2"));
    opBuilder.addInput(var.asOutput());
    opBuilder.addInput(accum.asOutput());
    opBuilder.addInput(lr.asOutput());
    opBuilder.addInput(epsilon.asOutput());
    opBuilder.addInput(grad.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.useLocking != null) {
          opBuilder.setAttr("use_locking", opts.useLocking);
        }
        if (opts.updateSlots != null) {
          opBuilder.setAttr("update_slots", opts.updateSlots);
        }
      }
    }
    return new ResourceSparseApplyAdagradV2(opBuilder.build());
  }
  
  /**
   * @param useLocking If `True`, updating of the var and accum tensors will be protected
   * by a lock; otherwise the behavior is undefined, but may exhibit less
   * contention.
   */
  public static Options useLocking(Boolean useLocking) {
    return new Options().useLocking(useLocking);
  }
  
  /**
   * @param updateSlots 
   */
  public static Options updateSlots(Boolean updateSlots) {
    return new Options().updateSlots(updateSlots);
  }
  
  
  private ResourceSparseApplyAdagradV2(Operation operation) {
    super(operation);
  }
}
