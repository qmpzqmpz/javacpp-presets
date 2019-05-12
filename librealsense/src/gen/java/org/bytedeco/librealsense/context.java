// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    @Namespace("rs") @NoOffset @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class context extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public context(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public context(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public context position(long position) {
            return (context)super.position(position);
        }
    

        // create realsense context required for rest of the API
        public context() { super((Pointer)null); allocate(); }
        private native void allocate();

        public context(rs_context handle) { super((Pointer)null); allocate(handle); }
        private native void allocate(rs_context handle);

        /** determine number of connected devices
         *  @return  the count of devices */
        public native int get_device_count();

        /** retrieve connected device by index
         *  @param index [in]  the zero based index of device to retrieve
         *  @return           the requested device */
        public native device get_device(int index);
    }