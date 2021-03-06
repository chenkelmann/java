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
 * Sparse addition of two CSR matrices, C = alpha * A + beta * B.
 * <p>
 * The gradients of SparseMatrixAdd outputs with respect to alpha and beta are not
 * currently defined (TensorFlow will return zeros for these entries).
 */
public final class SparseMatrixAdd extends RawOp implements Operand<TType> {
  
  /**
   * Factory method to create a class wrapping a new SparseMatrixAdd operation.
   * 
   * @param scope current scope
   * @param a A CSRSparseMatrix.
   * @param b A CSRSparseMatrix.
   * @param alpha A constant scalar.
   * @param beta A constant scalar.
   * @return a new instance of SparseMatrixAdd
   */
  @Endpoint(describeByClass = true)
  public static <T extends TType> SparseMatrixAdd create(Scope scope, Operand<?> a, Operand<?> b, Operand<T> alpha, Operand<T> beta) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseMatrixAdd", scope.makeOpName("SparseMatrixAdd"));
    opBuilder.addInput(a.asOutput());
    opBuilder.addInput(b.asOutput());
    opBuilder.addInput(alpha.asOutput());
    opBuilder.addInput(beta.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new SparseMatrixAdd(opBuilder.build());
  }
  
  /**
   * A CSRSparseMatrix.
   */
  public Output<?> c() {
    return c;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) c;
  }
  
  private Output<?> c;
  
  private SparseMatrixAdd(Operation operation) {
    super(operation);
    int outputIdx = 0;
    c = operation.output(outputIdx++);
  }
}
