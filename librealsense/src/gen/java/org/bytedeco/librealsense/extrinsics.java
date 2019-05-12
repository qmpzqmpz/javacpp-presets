// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    /* Cross-stream extrinsics, encode the topology of how the different devices are connected */
    @Namespace("rs") @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class extrinsics extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public extrinsics() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public extrinsics(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public extrinsics(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public extrinsics position(long position) {
            return (extrinsics)super.position(position);
        }
    
        public native @Cast("bool") boolean is_identity();
        public native @ByVal float3 transform(@Const @ByRef float3 point);
    }