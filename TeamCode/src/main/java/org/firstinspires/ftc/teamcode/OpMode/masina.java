package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name="masina", group="masina")
public class masina extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {


        DcMotor motorspate;
        motorspate = hardwareMap.get(DcMotor.class, "motorSpate");
        motorspate.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorspate.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        Servo servo;
        servo = hardwareMap.get(Servo.class,"servo");
        servo.setPosition(0.5);
        waitForStart();
        while(opModeIsActive()){
            motorspate.setPower(-(gamepad1.right_trigger-gamepad1.left_trigger));
            if (gamepad1.left_stick_x<0){
                servo.setPosition((-gamepad1.left_stick_x) / 5 + 0.5);
            } else if (gamepad1.left_stick_x>0) {
                servo.setPosition((-gamepad1.left_stick_x)/5 + 0.5);
            }else{
                servo.setPosition(0.5);
            }
            telemetry.addData("servo: " , servo.getPosition());
            telemetry.update();
        }

    }
}
