package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.openftc.easyopencv.OpenCvPipeline;

public class PracticeCV extends OpenCvPipeline {
    Telemetry telemetry;
    Mat mat = new Mat();
    public PracticeCV(Telemetry t){
        telemetry = t;
    }
    @Override
    public Mat processFrame(Mat input){
        Imgproc.cvtColor(input, mat, Imgproc.COLOR_RGB2GRAY);
        return mat;
    }


}
