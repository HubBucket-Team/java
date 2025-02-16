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
import org.tensorflow.op.annotation.Operator;

/**
 * Applies sparse subtraction to individual values or slices in a Variable.
 * <p>
 * `ref` is a `Tensor` with rank `P` and `indices` is a `Tensor` of rank `Q`.
 * <p>
 * `indices` must be integer tensor, containing indices into `ref`.
 * It must be shape `[d_0, ..., d_{Q-2}, K]` where `0 < K <= P`.
 * <p>
 * The innermost dimension of `indices` (with length `K`) corresponds to
 * indices into elements (if `K = P`) or slices (if `K < P`) along the `K`th
 * dimension of `ref`.
 * <p>
 * `updates` is `Tensor` of rank `Q-1+P-K` with shape:
 * <pre>{@code
 * [d_0, ..., d_{Q-2}, ref.shape[K], ..., ref.shape[P-1]]
 * }</pre>
 * For example, say we want to subtract 4 scattered elements from a rank-1 tensor
 * with 8 elements. In Python, that subtraction would look like this:
 * <pre>{@code
 * ref = tf.Variable([1, 2, 3, 4, 5, 6, 7, 8], use_resource=True)
 * indices = tf.constant([[4], [3], [1], [7]])
 * updates = tf.constant([9, 10, 11, 12])
 * sub = tf.scatter_nd_sub(ref, indices, updates)
 * with tf.Session() as sess:
 *   print sess.run(sub)
 * }</pre>
 * The resulting update to ref would look like this:
 * <p>
 *     [1, -9, 3, -6, -4, 6, 7, -4]
 * <p>
 * See `tf.scatter_nd` for more details about how to make updates to
 * slices.
 */
@Operator
public final class ResourceScatterNdSub extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.ResourceScatterNdSub}
   */
  public static class Options {
    
    /**
     * @param useLocking An optional bool. Defaults to True. If True, the assignment will
     * be protected by a lock; otherwise the behavior is undefined,
     * but may exhibit less contention.
     */
    public Options useLocking(Boolean useLocking) {
      this.useLocking = useLocking;
      return this;
    }
    
    private Boolean useLocking;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new ResourceScatterNdSub operation.
   * 
   * @param scope current scope
   * @param ref A resource handle. Must be from a VarHandleOp.
   * @param indices A Tensor. Must be one of the following types: int32, int64.
   * A tensor of indices into ref.
   * @param updates A Tensor. Must have the same type as ref. A tensor of
   * values to add to ref.
   * @param options carries optional attributes values
   * @return a new instance of ResourceScatterNdSub
   */
  public static <T extends Number, U> ResourceScatterNdSub create(Scope scope, Operand<?> ref, Operand<T> indices, Operand<U> updates, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("ResourceScatterNdSub", scope.makeOpName("ResourceScatterNdSub"));
    opBuilder.addInput(ref.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(updates.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.useLocking != null) {
          opBuilder.setAttr("use_locking", opts.useLocking);
        }
      }
    }
    return new ResourceScatterNdSub(opBuilder.build());
  }
  
  /**
   * @param useLocking An optional bool. Defaults to True. If True, the assignment will
   * be protected by a lock; otherwise the behavior is undefined,
   * but may exhibit less contention.
   */
  public static Options useLocking(Boolean useLocking) {
    return new Options().useLocking(useLocking);
  }
  
  
  private ResourceScatterNdSub(Operation operation) {
    super(operation);
  }
}
