package frc.team6059.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.team6059.robot.Subsystems.*;

public class Robot extends TimedRobot {

    private Ball ball = new Ball();
    private BallFeeder ballFeeder = new BallFeeder();
    private DriveTrain driveTrain = new DriveTrain();
    private Elevator elevator = new Elevator();
    private HatchPanel hatchPanel = new HatchPanel();

    @Override
    public void robotInit() {
    }

    @Override
    public void robotPeriodic() {
        //No full auto code is currently planned to be made so all teleop code will be run for both auto and teleop periods
        ball.onTickUpdate();
        ballFeeder.onTickUpdate();
        driveTrain.onTickUpdate();
        elevator.onTickUpdate();
        hatchPanel.onTickUpdate();
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
