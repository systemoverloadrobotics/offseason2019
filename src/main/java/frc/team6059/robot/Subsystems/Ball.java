package frc.team6059.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.team6059.robot.RobotMap.*;

public class Ball {

    public Ball() {
        IO._rightFlywheel.setNeutralMode(NeutralMode.Brake);
        IO._leftFlywheel.setNeutralMode(NeutralMode.Brake);
    }

    public void onTickUpdate() {
        if (Arcade._ballFeederExtend()) {
            IO._rightPistonSlide.set(DoubleSolenoid.Value.kForward);
            IO._ballIntakeMotor.set(ControlMode.PercentOutput, .5);
            IO._rightFlywheel.set(ControlMode.PercentOutput, .5);
            IO._leftFlywheel.set(ControlMode.PercentOutput, -.5);
        } else if (Arcade._ballOuttake()) {
            IO._rightPistonSlide.set(DoubleSolenoid.Value.kReverse);
            IO._ballIntakeMotor.set(ControlMode.PercentOutput, .5);
            IO._rightFlywheel.set(ControlMode.PercentOutput, .2);
            IO._leftFlywheel.set(ControlMode.PercentOutput, -.2);
        } else if (Arcade._elvOn()) {
           // IO._rightPistonSlide.set(DoubleSolenoid.Value.kForward);
            IO._ballIntakeMotor.set(ControlMode.PercentOutput, 0);
            IO._rightFlywheel.set(ControlMode.PercentOutput, -.5);
            IO._leftFlywheel.set(ControlMode.PercentOutput, .5);
        } else if (Arcade._hatchHook()) {
            IO._rightPistonSlide.set(DoubleSolenoid.Value.kForward);
            IO._ballIntakeMotor.set(ControlMode.PercentOutput, 0);
            IO._rightFlywheel.set(ControlMode.PercentOutput, .5);
            IO._leftFlywheel.set(ControlMode.PercentOutput, -.5);
        } else if (Arcade._extendIntake()) {
            IO._rightPistonSlide.set(DoubleSolenoid.Value.kReverse);
            IO._ballIntakeMotor.set(ControlMode.PercentOutput, 0);
            IO._rightFlywheel.set(ControlMode.PercentOutput, 0);
            IO._leftFlywheel.set(ControlMode.PercentOutput, 0);
        } else if (Arcade._extendIn() == 1){
            IO._rightPistonSlide.set(DoubleSolenoid.Value.kReverse);
            IO._ballIntakeMotor.set(ControlMode.PercentOutput, 0);
            IO._rightFlywheel.set(ControlMode.PercentOutput, .5);
            IO._leftFlywheel.set(ControlMode.PercentOutput, -0.5);
        }
    }
}
//IO._rightPistonSlide.set(DoubleSolenoid.Value.kReverse);
//        IO._ballIntakeMotor.set(ControlMode.PercentOutput, .5);
//        IO._rightFlywheel.set(ControlMode.PercentOutput, .5);
//        IO._leftFlywheel.set(ControlMode.PercentOutput, -.5);