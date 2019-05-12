// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_eigen_genv_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_eigen_genv_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_eigen_genv_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_eigen_genv_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_eigen_genv_workspace position(long position) {
        return (gsl_eigen_genv_workspace)super.position(position);
    }

  public native @Cast("size_t") long size(); public native gsl_eigen_genv_workspace size(long setter);            /* size of matrices */

  public native gsl_vector work1(); public native gsl_eigen_genv_workspace work1(gsl_vector setter);      /* 1-norm of columns of A */
  public native gsl_vector work2(); public native gsl_eigen_genv_workspace work2(gsl_vector setter);      /* 1-norm of columns of B */
  public native gsl_vector work3(); public native gsl_eigen_genv_workspace work3(gsl_vector setter);      /* real part of eigenvector */
  public native gsl_vector work4(); public native gsl_eigen_genv_workspace work4(gsl_vector setter);      /* imag part of eigenvector */
  public native gsl_vector work5(); public native gsl_eigen_genv_workspace work5(gsl_vector setter);      /* real part of back-transformed eigenvector */
  public native gsl_vector work6(); public native gsl_eigen_genv_workspace work6(gsl_vector setter);      /* imag part of back-transformed eigenvector */

  public native gsl_matrix Q(); public native gsl_eigen_genv_workspace Q(gsl_matrix setter);          /* pointer to left Schur vectors */
  public native gsl_matrix Z(); public native gsl_eigen_genv_workspace Z(gsl_matrix setter);          /* pointer to right Schur vectors */

  public native gsl_eigen_gen_workspace gen_workspace_p(); public native gsl_eigen_genv_workspace gen_workspace_p(gsl_eigen_gen_workspace setter);
}