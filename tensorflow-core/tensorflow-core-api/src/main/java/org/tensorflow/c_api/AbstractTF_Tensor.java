/*
 Copyright 2019 The TensorFlow Authors. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 =======================================================================
 */

package org.tensorflow.c_api;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.Properties;

import static org.tensorflow.c_api.global.tensorflow.*;

@Properties(inherit = org.tensorflow.c_api.presets.tensorflow.class)
public abstract class AbstractTF_Tensor extends Pointer {
    protected static class DeleteDeallocator extends TF_Tensor implements Pointer.Deallocator {
        DeleteDeallocator(TF_Tensor s) { super(s); }
        @Override public void deallocate() { if (!isNull()) TF_DeleteTensor(this); setNull(); }
    }

    /** TensorFlow crashes if we don't pass it a deallocator, so... */
    protected static Deallocator_Pointer_long_Pointer dummyDeallocator = new Deallocator_Pointer_long_Pointer() {
        @Override public void call(Pointer data, long len, Pointer arg) { }
    };

    static {
        PointerScope s = PointerScope.getInnerScope();
        if (s != null) {
            s.detach(dummyDeallocator);
        }
    }

    /** A reference to prevent deallocation. */
    protected Pointer pointer;

    public AbstractTF_Tensor(Pointer p) { super(p); }

    /**
     * Calls TF_NewTensor(), and registers a deallocator.
     * @return TF_Tensor created. Do not call TF_DeleteTensor() on it.
     */
    public static TF_Tensor newTensor(int dtype, long[] dims, Pointer data) {
        TF_Tensor t = TF_NewTensor(dtype, dims, dims.length, data, data.limit(), dummyDeallocator, null);
        if (t != null) {
            t.pointer = data;
            t.deallocator(new DeleteDeallocator(t));
        }
        return t;
    }

    /**
     * Calls TF_AllocateTensor(), and registers a deallocator.
     * @return TF_Tensor created. Do not call TF_DeleteTensor() on it.
     */
    public static TF_Tensor allocateTensor(int dtype, long[] dims, long length) {
        TF_Tensor t = TF_AllocateTensor(dtype, dims, dims.length, length);
        if (t != null) {
            t.deallocator(new DeleteDeallocator(t));
        }
        return t;
    }

    /**
     * Calls the deallocator, if registered, otherwise has no effect.
     */
    public void delete() {
        deallocate();
    }
}
