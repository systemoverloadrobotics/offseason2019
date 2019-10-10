package frc.team6059.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.team6059.robot.RobotMap.*;

public class Ball {

    public Ball() {

    }

    public void onTickUpdate() {
        if (Arcade._ballFeederExtend()) this.feederExtend();
        if (Arcade._ballIntake() ^ Arcade._ballOuttake()) {
            if (Arcade._ballIntake()) this.ballIntake();
            else this.ballOuttake();
        }
    }

    private void feederExtend(){
        IO._rightPistonSlide.set(DoubleSolenoid.Value.kForward);
        IO._leftPistonSlide.set(DoubleSolenoid.Value.kForward);
    }
    private void ballOuttake(){
        IO._ballIntakeMotor.set(ControlMode.PercentOutput,1);
        IO._rightFlywheel.set(ControlMode.PercentOutput,1);
        IO._leftFlywheel.set(ControlMode.PercentOutput,-1);
    }
    private void ballIntake(){
        IO._ballIntakeMotor.set(ControlMode.PercentOutput, -1);
        IO._rightFlywheel.set(ControlMode.PercentOutput, 1);
        IO._leftFlywheel.set(ControlMode.PercentOutput, -1);
    }
}
