package frc.team6059.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

    private Joystick joystick;
    private WPI_VictorSPX motor;

    @Override
    public void robotInit() {
        joystick = new Joystick(0);
        motor = new WPI_VictorSPX(10);
    }

    @Override
    public void robotPeriodic() {
        motor.set(ControlMode.PercentOutput, joystick.getRawAxis(1));
        System.out.println(joystick.getRawAxis(1));
    }

    @Override
    public void autonomousInit() {
    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopPeriodic() {
    }

    @Override
    public void testPeriodic() {
    }
}
