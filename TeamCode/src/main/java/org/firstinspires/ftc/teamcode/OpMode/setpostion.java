package org.firstinspires.ftc.teamcode.OpMode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
@Config
@TeleOp(name="setpositon" , group = "utils")
public class setpostion extends LinearOpMode {
    public Servo servo;
    public static double pozitie = 0.5;

    // TODO 0.35 limita minima si 0.65 limita maxima

    @Override
    public void runOpMode() throws InterruptedException {
        servo = hardwareMap.get(Servo.class,"servo");
        servo.setPosition(0.5);
        waitForStart();
        while(opModeIsActive()){

            servo.setPosition(pozitie);
            telemetry.addData("Pozitie servo:" , servo.getPosition());
            telemetry.update();
        }
    }
}
