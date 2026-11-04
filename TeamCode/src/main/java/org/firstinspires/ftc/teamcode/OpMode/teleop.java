package org.firstinspires.ftc.teamcode.OpMode;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.PinpointDrive;
//tstasd
@TeleOp(name="Teleop", group="tepeop")
public class teleop extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        PinpointDrive drive = new PinpointDrive(hardwareMap, new Pose2d(new Vector2d(0.0,0.0), 0), true);
        while(opModeInInit()){
            telemetry.addLine("In init");
            telemetry.update();

        }
        while(opModeIsActive()){

            /*
            drive.setDrivePowers(new PoseVelocity2d(
                    new Vector2d(
                            -gamepad1.left_stick_y,
                            -gamepad1.left_stick_x
                    ),
                    -gamepad1.right_stick_x
            ));
            */



            telemetry.addLine("Ready");
            telemetry.addData("Time:",System.nanoTime());
            telemetry.update();
        }
    }
}
