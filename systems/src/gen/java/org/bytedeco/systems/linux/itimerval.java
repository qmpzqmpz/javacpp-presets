// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


/* Type of the second argument to `getitimer' and
   the second and third arguments `setitimer'.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class itimerval extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public itimerval() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public itimerval(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public itimerval(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public itimerval position(long position) {
        return (itimerval)super.position(position);
    }

    /* Value to put into `it_value' when the timer expires.  */
    public native @ByRef timeval it_interval(); public native itimerval it_interval(timeval setter);
    /* Time to the next timer expiration.  */
    public native @ByRef timeval it_value(); public native itimerval it_value(timeval setter);
  }