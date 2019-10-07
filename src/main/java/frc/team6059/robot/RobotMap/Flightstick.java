package frc.team6059.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;

public class Flightstick {
    private static Joystick flightstick = new Joystick(0);

    public static double _driveForward() { return flightstick.getRawAxis(); } //Drive Train

    public static double _driveRotation() { return flightstick.getRawAxis(); } //Drive Train

    public static boolean _speedReduction() { return flightstick.getRawButton(); } //Drive Train

    public static boolean _autoAlign() { return flightstick.getRawButton(); } //Drive Train
}
