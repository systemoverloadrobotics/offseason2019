package frc.team6059.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;

public class Arcade {
    private static Joystick arcadeStick = new Joystick(1);

    public static boolean _elvUp() { //Elevator
        return arcadeStick.getPOV(0) == 0 || arcadeStick.getPOV(0) == 45 || arcadeStick.getPOV(0) == 315;
    }

    public static boolean _elvDown() { //Elevator
        return arcadeStick.getPOV(0) == 180 || arcadeStick.getPOV(0) == 135 || arcadeStick.getPOV(0) == 225;
    }

    public static boolean _ballFeederExtend() { return arcadeStick.getRawButton(); } //Ball

    public static boolean _ballIntake() { return arcadeStick.getRawButton(); } //Ball

    public static boolean _ballOuttake() { return arcadeStick.getRawButton(); } //Ball

    public static boolean _hatchHook() { return arcadeStick.getRawButton(); } //Hatch Hook
}
