package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by jacob.wiseberg on 1/11/2018.
 */

//@Autonomous
public class EncoderTest extends LinearOpMode {
    HardwareMechanumRobot robot = new HardwareMechanumRobot();

    public void setup(){

    }

    public void runOpMode(){
        robot.init(hardwareMap, true);

        waitForStart();

       // robot.pleaseEncodedMove(12, this);
       // robot.encoderTurn(1, 0.1, false, this);
       // robot.encoderDrive(12, 0.2, this);
       // robot.encoderDrive(-12, 0.2, this);
        robot.encoderPlz(10000, 0.2,this);
    }
}
