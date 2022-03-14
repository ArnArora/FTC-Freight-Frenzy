package org.firstinspires.ftc.teamcode.util;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;

import org.opencv.core.Point;
import org.opencv.core.Scalar;

public class Constants {
    public static double TICKS_PER_REV = 8192;
    public static double WHEEL_RADIUS = 0.688976378; // in
    public static double GEAR_RATIO = 1; // output (wheel) speed / input (encoder) speed

    public static double PARALLEL_X = 6.5846456693; // X is the up and down direction
    public static double PARALLEL_Y = 3.1496062992; // Y is the strafe direction

    public static double PERPENDICULAR_X = 1.1811023622;
    public static double PERPENDICULAR_Y = -1.624015748;

    public static double capUp=0.8;
    public static double capOut=0.6;
    public static double capDown=0.0;

    public static double collectionBoxPosition=0.3;
    public static double carryingBoxPosition=0.4;
    public static double droppingBoxPosition=0.8;


    public static Pose2d startPoseRedClose=new Pose2d(-36.0, -64.7, 3*Math.PI/2);
    public static Pose2d lineToShippingHubCloseRed =new Pose2d(-18.0,-32.0,7*Math.PI/8);
    public static Pose2d splineToCarouselCloseRed=new Pose2d(-58.0, -58, Math.PI/2);
    public static Pose2d lineFromCarouselCloseRed =new Pose2d(-56.0, -64.7, 3*Math.PI/2);
    public static Vector2d depoCloseRed=new Vector2d(56.0, -64.7);

    public static Pose2d startPoseRedFar=new Pose2d(12.0, -64.7, 3*Math.PI/2);
    public static Pose2d lineToShippingHubRedFar=new Pose2d(-6.0, -32.0, 9*Math.PI/8);
    public static Vector2d depoLineRedFar=new Vector2d(56.0, -64.7);
    public static Vector2d startVectorRedFar=new Vector2d(12.0, -64.7);

    public static Pose2d startPoseBlueClose=new Pose2d(-36.0, 64.7, Math.PI/2);
    public static Pose2d lineToShippingHubCloseBlue =new Pose2d(-18.0,32.0,9*Math.PI/8);
    public static Pose2d splineToCarouselCloseBlue=new Pose2d(-58.0, 58.0, 3*Math.PI/2);
    public static Pose2d lineFromCarouselCloseBlue =new Pose2d(-56.0, 64.7, Math.PI/2);
    public static Vector2d depoCloseBlue=new Vector2d(56.0, 64.7);

    public static Pose2d startPoseBlueFar=new Pose2d(12.0, 64.7, Math.PI/2);
    public static Pose2d lineToShippingHubBlueFar=new Pose2d(-6.0, 32.0, 7*Math.PI/8);
    public static Vector2d depoLineBlueFar=new Vector2d(56.0, 64.7);
    public static Vector2d startVectorBlueFar=new Vector2d(12.0, 64.7);

    public static double elevKS = 0.268/2.54;
    public static double elevKV = 1.89/2.54;
    public static double elevKA = 0.243/2.54;
    public static double elevKG = 0.268/2.54;

    public static int targetPosition =0;
    public static int armHeight3Position=2700;
    public static int armHeight2Position=1800;
    public static int armHeight1Position=1500;
    public static final Scalar BLUE = new Scalar(0, 0, 255);
    public static final Scalar GREEN = new Scalar(0, 255, 0);
    public static final Scalar RED=new Scalar(255, 0,0);

    public static final int difference = 15;

    public static final Point LEFT_REGION1_TLEFT = new Point(75,195);
    public static final Point LEFT_REGION1_BRIGHT = new Point(165,235);
    public static final Point LEFT_REGION2_TLEFT = new Point(195,195);
    public static final Point LEFT_REGION2_BRIGHT = new Point(285, 235);
    public static final Point LEFT_REGION3_TLEFT = new Point(350,195);
    public static final Point LEFT_REGION3_BRIGHT = new Point(440,235);

    public static final Point[] LEFT_POINTS = new Point[]{LEFT_REGION1_BRIGHT, LEFT_REGION1_TLEFT,
            LEFT_REGION2_BRIGHT, LEFT_REGION2_TLEFT, LEFT_REGION3_BRIGHT, LEFT_REGION3_TLEFT};

    public static final Point RIGHT_REGION1_TLEFT = new Point(75,195);
    public static final Point RIGHT_REGION1_BRIGHT = new Point(165,235);
    public static final Point RIGHT_REGION2_TLEFT = new Point(195,195);
    public static final Point RIGHT_REGION2_BRIGHT = new Point(285, 235);
    public static final Point RIGHT_REGION3_TLEFT = new Point(350,195);
    public static final Point RIGHT_REGION3_BRIGHT = new Point(440,235);

    public static final Point[] RIGHT_POINTS = new Point[]{RIGHT_REGION1_BRIGHT, RIGHT_REGION1_TLEFT,
            RIGHT_REGION2_BRIGHT, RIGHT_REGION2_TLEFT, RIGHT_REGION3_BRIGHT, RIGHT_REGION3_TLEFT};

    public static enum VISUALIZATION_DETERMINED {
        LEFT, RIGHT, CENTER, UNDETERMINED
    }
}
