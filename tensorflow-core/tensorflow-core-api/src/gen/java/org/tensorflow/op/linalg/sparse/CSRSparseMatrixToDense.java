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

package org.tensorflow.op.linalg.sparse;

import org.tensorflow.DataType;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.family.TType;

/**
 * Convert a (possibly batched) CSRSparseMatrix to dense.
 * 
 * @param <T> data type for {@code denseOutput()} output
 */
public final class CSRSparseMatrixToDense<T extends TType> extends RawOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new CSRSparseMatrixToDense operation.
   * 
   * @param scope current scope
   * @param sparseInput A batched CSRSparseMatrix.
   * @param type 
   * @return a new instance of CSRSparseMatrixToDense
   */
  @Endpoint(describeByClass = true)
  public static <T extends TType> CSRSparseMatrixToDense<T> create(Scope scope, Operand<?> sparseInput, DataType<T> type) {
    OperationBuilder opBuilder = scope.env().opBuilder("CSRSparseMatrixToDense", scope.makeOpName("CSRSparseMatrixToDense"));
    opBuilder.addInput(sparseInput.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    opBuilder.setAttr("type", type);
    return new CSRSparseMatrixToDense<T>(opBuilder.build());
  }
  
  /**
   * A dense tensor.
   */
  public Output<T> denseOutput() {
    return denseOutput;
  }
  
  @Override
  public Output<T> asOutput() {
    return denseOutput;
  }
  
  private Output<T> denseOutput;
  
  private CSRSparseMatrixToDense(Operation operation) {
    super(operation);
    int outputIdx = 0;
    denseOutput = operation.output(outputIdx++);
  }
}
