// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videostab;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_videostab.*;


@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class ToFileMotionWriter extends ImageMotionEstimatorBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ToFileMotionWriter(Pointer p) { super(p); }

    public ToFileMotionWriter(@Str BytePointer path, @Ptr ImageMotionEstimatorBase estimator) { super((Pointer)null); allocate(path, estimator); }
    private native void allocate(@Str BytePointer path, @Ptr ImageMotionEstimatorBase estimator);
    public ToFileMotionWriter(@Str String path, @Ptr ImageMotionEstimatorBase estimator) { super((Pointer)null); allocate(path, estimator); }
    private native void allocate(@Str String path, @Ptr ImageMotionEstimatorBase estimator);

    public native void setMotionModel(@Cast("cv::videostab::MotionModel") int val);
    public native @Cast("cv::videostab::MotionModel") int motionModel();

    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1);
    public native @ByVal Mat estimate(@Const @ByRef Mat frame0, @Const @ByRef Mat frame1, @Cast("bool*") boolean[] ok/*=0*/);
}