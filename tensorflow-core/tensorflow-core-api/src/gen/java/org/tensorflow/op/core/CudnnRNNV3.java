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

/**
 * A RNN backed by cuDNN.
 * <p>
 * Computes the RNN from the input and initial states, with respect to the params
 * buffer. Accepts one extra input "sequence_lengths" than CudnnRNN.
 * <p>
 * rnn_mode: Indicates the type of the RNN model.
 * input_mode: Indicates whether there is a linear projection between the input and
 *   the actual computation before the first layer. 'skip_input' is only allowed
 *   when input_size == num_units; 'auto_select' implies 'skip_input' when
 *   input_size == num_units; otherwise, it implies 'linear_input'.
 * direction: Indicates whether a bidirectional model will be used. Should be
 *   "unidirectional" or "bidirectional".
 * dropout: Dropout probability. When set to 0., dropout is disabled.
 * seed: The 1st part of a seed to initialize dropout.
 * seed2: The 2nd part of a seed to initialize dropout.
 * input: If time_major is true, this is a 3-D tensor with the shape of
 *     [seq_length, batch_size, input_size]. If time_major is false, the shape is
 *     [batch_size, seq_length, input_size].
 * input_h: If time_major is true, this is a 3-D tensor with the shape of
 *     [num_layer * dir, batch_size, num_units]. If time_major is false, the shape
 *     is [batch_size, num_layer * dir, num_units].
 * input_c: For LSTM, a 3-D tensor with the shape of
 *     [num_layer * dir, batch, num_units]. For other models, it is ignored.
 * params: A 1-D tensor that contains the weights and biases in an opaque layout.
 *     The size must be created through CudnnRNNParamsSize, and initialized
 *     separately. Note that they might not be compatible across different
 *     generations. So it is a good idea to save and restore
 * sequence_lengths: a vector of lengths of each input sequence.
 * output: If time_major is true, this is a 3-D tensor with the shape of
 *     [seq_length, batch_size, dir * num_units]. If time_major is false, the
 *     shape is [batch_size, seq_length, dir * num_units].
 * output_h: The same shape has input_h.
 * output_c: The same shape as input_c for LSTM. An empty tensor for other models.
 * is_training: Indicates whether this operation is used for inferenece or
 *   training.
 * time_major: Indicates whether the input/output format is time major or batch
 *     major.
 * reserve_space: An opaque tensor that can be used in backprop calculation. It
 *   is only produced if is_training is true.
 * 
 * @param <T> data type for {@code output()} output
 */
public final class CudnnRNNV3<T extends Number> extends PrimitiveOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.CudnnRNNV3}
   */
  public static class Options {
    
    /**
     * @param rnnMode 
     */
    public Options rnnMode(String rnnMode) {
      this.rnnMode = rnnMode;
      return this;
    }
    
    /**
     * @param inputMode 
     */
    public Options inputMode(String inputMode) {
      this.inputMode = inputMode;
      return this;
    }
    
    /**
     * @param direction 
     */
    public Options direction(String direction) {
      this.direction = direction;
      return this;
    }
    
    /**
     * @param dropout 
     */
    public Options dropout(Float dropout) {
      this.dropout = dropout;
      return this;
    }
    
    /**
     * @param seed 
     */
    public Options seed(Long seed) {
      this.seed = seed;
      return this;
    }
    
    /**
     * @param seed2 
     */
    public Options seed2(Long seed2) {
      this.seed2 = seed2;
      return this;
    }
    
    /**
     * @param numProj 
     */
    public Options numProj(Long numProj) {
      this.numProj = numProj;
      return this;
    }
    
    /**
     * @param isTraining 
     */
    public Options isTraining(Boolean isTraining) {
      this.isTraining = isTraining;
      return this;
    }
    
    /**
     * @param timeMajor 
     */
    public Options timeMajor(Boolean timeMajor) {
      this.timeMajor = timeMajor;
      return this;
    }
    
    private String rnnMode;
    private String inputMode;
    private String direction;
    private Float dropout;
    private Long seed;
    private Long seed2;
    private Long numProj;
    private Boolean isTraining;
    private Boolean timeMajor;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new CudnnRNNV3 operation.
   * 
   * @param scope current scope
   * @param input 
   * @param inputH 
   * @param inputC 
   * @param params 
   * @param sequenceLengths 
   * @param options carries optional attributes values
   * @return a new instance of CudnnRNNV3
   */
  public static <T extends Number> CudnnRNNV3<T> create(Scope scope, Operand<T> input, Operand<T> inputH, Operand<T> inputC, Operand<T> params, Operand<Integer> sequenceLengths, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("CudnnRNNV3", scope.makeOpName("CudnnRNNV3"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(inputH.asOutput());
    opBuilder.addInput(inputC.asOutput());
    opBuilder.addInput(params.asOutput());
    opBuilder.addInput(sequenceLengths.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.rnnMode != null) {
          opBuilder.setAttr("rnn_mode", opts.rnnMode);
        }
        if (opts.inputMode != null) {
          opBuilder.setAttr("input_mode", opts.inputMode);
        }
        if (opts.direction != null) {
          opBuilder.setAttr("direction", opts.direction);
        }
        if (opts.dropout != null) {
          opBuilder.setAttr("dropout", opts.dropout);
        }
        if (opts.seed != null) {
          opBuilder.setAttr("seed", opts.seed);
        }
        if (opts.seed2 != null) {
          opBuilder.setAttr("seed2", opts.seed2);
        }
        if (opts.numProj != null) {
          opBuilder.setAttr("num_proj", opts.numProj);
        }
        if (opts.isTraining != null) {
          opBuilder.setAttr("is_training", opts.isTraining);
        }
        if (opts.timeMajor != null) {
          opBuilder.setAttr("time_major", opts.timeMajor);
        }
      }
    }
    return new CudnnRNNV3<T>(opBuilder.build());
  }
  
  /**
   * @param rnnMode 
   */
  public static Options rnnMode(String rnnMode) {
    return new Options().rnnMode(rnnMode);
  }
  
  /**
   * @param inputMode 
   */
  public static Options inputMode(String inputMode) {
    return new Options().inputMode(inputMode);
  }
  
  /**
   * @param direction 
   */
  public static Options direction(String direction) {
    return new Options().direction(direction);
  }
  
  /**
   * @param dropout 
   */
  public static Options dropout(Float dropout) {
    return new Options().dropout(dropout);
  }
  
  /**
   * @param seed 
   */
  public static Options seed(Long seed) {
    return new Options().seed(seed);
  }
  
  /**
   * @param seed2 
   */
  public static Options seed2(Long seed2) {
    return new Options().seed2(seed2);
  }
  
  /**
   * @param numProj 
   */
  public static Options numProj(Long numProj) {
    return new Options().numProj(numProj);
  }
  
  /**
   * @param isTraining 
   */
  public static Options isTraining(Boolean isTraining) {
    return new Options().isTraining(isTraining);
  }
  
  /**
   * @param timeMajor 
   */
  public static Options timeMajor(Boolean timeMajor) {
    return new Options().timeMajor(timeMajor);
  }
  
  /**
   */
  public Output<T> output() {
    return output;
  }
  
  /**
   */
  public Output<T> outputH() {
    return outputH;
  }
  
  /**
   */
  public Output<T> outputC() {
    return outputC;
  }
  
  /**
   */
  public Output<T> reserveSpace() {
    return reserveSpace;
  }
  
  /**
   */
  public Output<?> hostReserved() {
    return hostReserved;
  }
  
  private Output<T> output;
  private Output<T> outputH;
  private Output<T> outputC;
  private Output<T> reserveSpace;
  private Output<?> hostReserved;
  
  private CudnnRNNV3(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
    outputH = operation.output(outputIdx++);
    outputC = operation.output(outputIdx++);
    reserveSpace = operation.output(outputIdx++);
    hostReserved = operation.output(outputIdx++);
  }
}
