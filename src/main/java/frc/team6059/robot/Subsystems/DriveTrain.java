package frc.team6059.robot.Subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team6059.robot.RobotMap.*;

public class DriveTrain {
    DifferentialDrive _RobotDrive;

    public DriveTrain() {
        _RobotDrive = new DifferentialDrive(IO._frontLeftDrive, IO._frontRightDrive);
        IO._backRightDrive.follow(IO._frontRightDrive);
        IO._backLeftDrive.follow(IO._frontLeftDrive);
    }

    public void onTickUpdate() {
        _RobotDrive.arcadeDrive(Flightstick._driveForward(), Flightstick._driveRotation());

    }
}
