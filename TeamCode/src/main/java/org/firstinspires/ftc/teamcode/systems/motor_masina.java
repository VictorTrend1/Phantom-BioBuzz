package org.firstinspires.ftc.teamcode.systems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class motor_masina {
    public DcMotor motor;

    public motor_masina(HardwareMap hw){
        motor = hw.get(DcMotor.class,"motorSpate");
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    public void power(double asd){
        motor.setPower(asd);
    }
    public void startmotor(){
        motor.setPower(1);
    }
    public void stopmotor(){
        motor.setPower(0);
    }
}
