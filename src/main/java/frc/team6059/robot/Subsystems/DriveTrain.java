package frc.team6059.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team6059.robot.RobotMap.*;



public class DriveTrain {
    // Adjustable Parameters
    static double SpeedMultiplier = 0.4;    // Max Speed
    static double RotationMultiplier = 0.4;  // Max Rotation.
    // End of Adjustable Parameters

    // Other Constants
    static double SpeedReductionConstant = 0.5;  // Cut speed in 1/2 speedReduction is enabled.
    static double Kp = -0.1f;  // Proportional control constant.
    static double min_command = 0.05f;   // minimum rotation.
    // End of Other Constants.


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
        if(Flightstick._autoAlign()) {
            autoAlign();
        }
        else{
            double sp = Flightstick._driveForward() * SpeedMultiplier;
            double rt = Flightstick._driveRotation() * RotationMultiplier;
            _RobotDrive.arcadeDrive(speedDecrease(sp), rt);
        }

    }

    public double speedDecrease(double x) {
        if(Flightstick._speedReduction()){
            return x * 0.5;
        }
        else{
            return x;
        }
    }

    public double autoAlign() {

        double offset = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tx").getDouble(0);

        double heading_error = -offset  / 29.8; // LL2:  offset will be a number between -29.8 and 29.8 -- offset will  range from -1 to 1
        double steering_adjust = Kp * offset;
        if (offset > 0)
        {
            steering_adjust = Kp*heading_error - min_command;
        }
        else if (offset < 0)
        {
            steering_adjust = Kp*heading_error + min_command;
        }
        _RobotDrive.arcadeDrive(Flightstick._driveForward() * SpeedMultiplier, steering_adjust);


        return 0;
    }
}