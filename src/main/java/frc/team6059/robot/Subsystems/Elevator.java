package frc.team6059.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.team6059.robot.RobotMap.*;

public class Elevator {

    public Elevator() {

    }

    public void onTickUpdate() {
        if (Arcade._hatchHook() || Arcade._extendIntake()) {
            IO._elevatorMotor.set(ControlMode.PercentOutput, 0);
        } else {
            if (Arcade._elvUp()) {
                IO._elevatorMotor.set(ControlMode.PercentOutput, -.6);
            } else if (Arcade._elvDown()) {
                IO._elevatorMotor.set(ControlMode.PercentOutput, .1);
            } else {
                IO._elevatorMotor.set(ControlMode.PercentOutput, -.2);
            }
        }
    }
}
