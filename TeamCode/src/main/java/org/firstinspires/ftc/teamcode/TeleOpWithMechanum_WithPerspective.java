package org.firstinspires.ftc.teamcode;

/**
 * Created by dina.brustein on 9/27/2017.
 */

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;


public class TeleOpWithMechanum_WithPerspective extends LinearOpMode {
    HardwareMechanumRobot robot = new HardwareMechanumRobot();
    public static double x, y, z, trueX, trueY;

    public void setup(){

    }

    public void runOpMode(){

        Gamepad gamepad1 = new Gamepad();
        Gamepad gamepad2 = new Gamepad();
        
        robot.init(hardwareMap, false);

        z = gamepad1.left_stick_x; //moving left/right
        y = gamepad1.left_stick_y; //moving forwards/backwards
        x = gamepad1.right_stick_x; //turning
/*
        trueX = ((Math.cos(Math.toRadians(360 - robot.imu.angleUnit.formatAngle(angles.angleUnit,angles.secondAngle )   ))) * x) - ((Math.sin(Math.toRadians(360 - Artemis.convertYaw(Artemis.navx_device.getYaw())))) * y); //sets trueX to rotated value
        trueY = ((Math.sin(Math.toRadians(360 - Artemis.convertYaw(Artemis.navx_device.getYaw())))) * x) + ((Math.cos(Math.toRadians(360 - Artemis.convertYaw(Artemis.navx_device.getYaw())))) * y);
*/

        if(x < -0.15){
            robot.strafe(0.86,true);
        }

        if(x > 0.15){
            robot.strafe(0.86,false);
        }

        if(y > 0.15){
            robot.setDrivePower(0.8,false);
        }

        if(y < -0.15){
            robot.setDrivePower(0.8,true);
        }

        if(z > 0.15){
            robot.turn(0.35,false);
        }

        if(z < -0.15){
            robot.turn(0.35, true);
        }
    }

}
