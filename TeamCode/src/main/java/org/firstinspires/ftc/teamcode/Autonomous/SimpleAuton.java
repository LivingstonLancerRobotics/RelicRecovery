package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HardwareMechanumRobot;

/**
 * Created by spork on 9/30/2017.
 */

@Autonomous(name = "SimpleAuton", group = "Linear Opmode")
public class SimpleAuton extends LinearOpMode {

    HardwareMechanumRobot robot = new HardwareMechanumRobot();
    public void setup(){

    }

    public void runOpMode(){
        waitForStart();

        robot.init(hardwareMap, true);

        robot.fl.setPower(0.86);
        robot.fr.setPower(0.86);
        robot.bl.setPower(0.86);
        robot.br.setPower(0.86);
        sleep(500);
        robot.setDrivePower(0, true);
    }
}

