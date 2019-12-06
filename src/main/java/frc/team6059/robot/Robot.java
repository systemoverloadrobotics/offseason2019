package frc.team6059.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.team6059.robot.RobotMap.Arcade;
import frc.team6059.robot.Subsystems.*;

public class Robot extends TimedRobot {

    private Ball ball = new Ball();
    private DriveTrain driveTrain = new DriveTrain();
    private Elevator elevator = new Elevator();
    private HatchPanel hatchPanel = new HatchPanel();

    @Override
    public void robotInit() {
        CameraServer.getInstance().startAutomaticCapture();
    }

    @Override
    public void robotPeriodic() {
        //No full auto code is currently planned to be made so all teleop code will be run for both auto and teleop periods
        ball.onTickUpdate();
        elevator.onTickUpdate();
        hatchPanel.onTickUpdate();
        driveTrain.onTickUpdate();
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
