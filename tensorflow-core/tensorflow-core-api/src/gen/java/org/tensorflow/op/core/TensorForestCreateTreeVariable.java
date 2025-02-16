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
 * Creates a tree resource and returns a handle to it.
 */
public final class TensorForestCreateTreeVariable extends PrimitiveOp {
  
  /**
   * Factory method to create a class wrapping a new TensorForestCreateTreeVariable operation.
   * 
   * @param scope current scope
   * @param treeHandle Handle to the tree resource to be created.
   * @param treeConfig Serialized proto string of the boosted_trees.Tree.
   * @return a new instance of TensorForestCreateTreeVariable
   */
  public static TensorForestCreateTreeVariable create(Scope scope, Operand<?> treeHandle, Operand<String> treeConfig) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorForestCreateTreeVariable", scope.makeOpName("TensorForestCreateTreeVariable"));
    opBuilder.addInput(treeHandle.asOutput());
    opBuilder.addInput(treeConfig.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TensorForestCreateTreeVariable(opBuilder.build());
  }
  
  
  private TensorForestCreateTreeVariable(Operation operation) {
    super(operation);
  }
}
