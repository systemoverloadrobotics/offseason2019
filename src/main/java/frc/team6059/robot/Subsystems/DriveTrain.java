package frc.team6059.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team6059.robot.RobotMap.*;

public class DriveTrain {
    DifferentialDrive _RobotDrive;

    public DriveTrain() {
        _RobotDrive = new DifferentialDrive(IO._frontLeftDrive, IO._frontRightDrive);
        IO._backRightDrive.follow(IO._frontRightDrive);
        IO._backLeftDrive.follow(IO._frontLeftDrive);
        IO._frontLeftDrive.setNeutralMode(NeutralMode.Brake);
        IO._frontRightDrive.setNeutralMode(NeutralMode.Brake);
        /*
        IO._backLeftDrive.setNeutralMode(NeutralMode.Brake);
        IO._backRightDrive.setNeutralMode(NeutralMode.Brake);
        use commented code if the back 2 drives don't follow the front 2 drives
        */
    }

    public void onTickUpdate() {
        _RobotDrive.arcadeDrive(Flightstick._driveForward(), Flightstick._driveRotation());

    }
}
