package frc.team6059.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;

public class Flightstick {
    private static Joystick flightstick = new Joystick(0);

    public static double _driveForward() { return flightstick.getRawAxis(1); } //Drive Train

    public static double _driveRotation() { return flightstick.getRawAxis(0); } //Drive Train

    public static boolean _speedReduction() { return flightstick.getRawButton(1); } //Drive Train

    public static boolean _autoAlign() { return flightstick.getRawButton(2); } //Drive Train
}
