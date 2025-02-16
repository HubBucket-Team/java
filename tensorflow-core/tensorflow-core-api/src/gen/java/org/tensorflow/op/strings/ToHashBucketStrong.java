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

package org.tensorflow.op.strings;

import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;

/**
 * Converts each string in the input Tensor to its hash mod by a number of buckets.
 * <p>
 * The hash function is deterministic on the content of the string within the
 * process. The hash function is a keyed hash function, where attribute `key`
 * defines the key of the hash function. `key` is an array of 2 elements.
 * <p>
 * A strong hash is important when inputs may be malicious, e.g. URLs with
 * additional components. Adversaries could try to make their inputs hash to the
 * same bucket for a denial-of-service attack or to skew the results. A strong
 * hash can be used to make it difficult to find inputs with a skewed hash value
 * distribution over buckets. This requires that the hash function is
 * seeded by a high-entropy (random) "key" unknown to the adversary.
 * <p>
 * The additional robustness comes at a cost of roughly 4x higher compute
 * time than `tf.string_to_hash_bucket_fast`.
 */
@Operator(group = "strings")
public final class ToHashBucketStrong extends PrimitiveOp implements Operand<Long> {
  
  /**
   * Factory method to create a class wrapping a new ToHashBucketStrong operation.
   * 
   * @param scope current scope
   * @param input The strings to assign a hash bucket.
   * @param numBuckets The number of buckets.
   * @param key The key used to seed the hash function, passed as a list of two uint64
   * elements.
   * @return a new instance of ToHashBucketStrong
   */
  public static ToHashBucketStrong create(Scope scope, Operand<String> input, Long numBuckets, List<Long> key) {
    OperationBuilder opBuilder = scope.env().opBuilder("StringToHashBucketStrong", scope.makeOpName("ToHashBucketStrong"));
    opBuilder.addInput(input.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("num_buckets", numBuckets);
    long[] keyArray = new long[key.size()];
    for (int i = 0; i < keyArray.length; ++i) {
      keyArray[i] = key.get(i);
    }
    opBuilder.setAttr("key", keyArray);
    return new ToHashBucketStrong(opBuilder.build());
  }
  
  /**
   * A Tensor of the same shape as the input `string_tensor`.
   */
  public Output<Long> output() {
    return output;
  }
  
  @Override
  public Output<Long> asOutput() {
    return output;
  }
  
  private Output<Long> output;
  
  private ToHashBucketStrong(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
