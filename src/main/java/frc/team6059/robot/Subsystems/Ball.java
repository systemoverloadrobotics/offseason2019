package frc.team6059.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.team6059.robot.RobotMap.*;

public class Ball {

    public Ball() {

    }

    public void onTickUpdate() {
        if(Arcade._compressor()) IO._compressor.start();
        else IO._compressor.stop();
        if (Arcade._ballFeederExtend()) this.feederExtend();
        else this.feederRetract();
        if (Arcade._ballIntake() ^ Arcade._ballOuttake()) {
            if (Arcade._ballIntake()) this.ballIntake();
            else this.ballOuttake();
        }
        else this.wheelStop();
    }

    private void feederExtend(){
        IO._rightPistonSlide.set(DoubleSolenoid.Value.kForward);
    }
    private void feederRetract(){
        IO._rightPistonSlide.set(DoubleSolenoid.Value.kReverse);
    }
    private void ballOuttake(){
        IO._ballIntakeMotor.set(ControlMode.PercentOutput,0.5);
        IO._rightFlywheel.set(ControlMode.PercentOutput,0.5);
        IO._leftFlywheel.set(ControlMode.PercentOutput,-0.5);
    }
    private void ballIntake(){
        IO._ballIntakeMotor.set(ControlMode.PercentOutput, -0.5);
        IO._rightFlywheel.set(ControlMode.PercentOutput, 0.5);
        IO._leftFlywheel.set(ControlMode.PercentOutput, -0.5);
    }
    private void wheelStop(){
        IO._ballIntakeMotor.set(ControlMode.PercentOutput, 0);
        IO._rightFlywheel.set(ControlMode.PercentOutput, 0);
        IO._leftFlywheel.set(ControlMode.PercentOutput, 0);
    }
}
