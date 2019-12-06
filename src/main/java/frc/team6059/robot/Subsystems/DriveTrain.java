package frc.team6059.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team6059.robot.RobotMap.*;


public class DriveTrain {
    // Adjustable Parameters
    //static double SpeedMultiplier = .75;    // Max Speed
    //static double RotationMultiplier = 0.65;  // Max Rotation.
    // End of Adjustable Parameters
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
        double sp = Flightstick._driveForward(); //REMOVED SPEEDMULITPLIER
        double rt = Flightstick._driveRotation(); //REMOVED SPEEDMULITPLIER
        _RobotDrive.arcadeDrive(speedDecrease(sp), speedDecrease(rt));
    }

    public double speedDecrease(double x) {
        if (Flightstick._speedReduction()) {
            return x * 0.45;
        } else if (Flightstick._maxSpeed()) {
            return x;
        } else {
            return x * .75;
        }
    }
//    public double speedDecrease(double x) {
//        if(Flightstick._speedReduction()){
//            return x * 0.75;
//        }
//        else {
//            return x;
//        }
}