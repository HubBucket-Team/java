// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.tensorflow.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.c_api.global.tensorflow.*;


// TF_ApiDefMap encapsulates a collection of API definitions for an operation.
//
// This object maps the name of a TensorFlow operation to a description of the
// API to generate for it, as defined by the ApiDef protocol buffer (
// https://www.tensorflow.org/code/tensorflow/core/framework/api_def.proto)
//
// The ApiDef messages are typically used to generate convenience wrapper
// functions for TensorFlow operations in various language bindings.
@Opaque @Properties(inherit = org.tensorflow.c_api.presets.tensorflow.class)
public class TF_ApiDefMap extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TF_ApiDefMap() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_ApiDefMap(Pointer p) { super(p); }
}
