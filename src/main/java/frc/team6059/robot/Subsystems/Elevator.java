package frc.team6059.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.team6059.robot.RobotMap.*;

public class Elevator {

    public Elevator() {

    }

    public void onTickUpdate() {
        if (Arcade._elvOn()) {
            if (Arcade._elvUp()) {
                IO._elevatorMotor.set(ControlMode.PercentOutput, -.5);
            } else if (Arcade._elvDown()) {
                IO._elevatorMotor.set(ControlMode.PercentOutput, .1);
            } else {
                IO._elevatorMotor.set(ControlMode.PercentOutput, -.1);
            }
        } else {
            IO._elevatorMotor.set(ControlMode.PercentOutput, 0);
        }
    }
}
