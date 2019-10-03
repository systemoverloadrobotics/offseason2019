package frc.team6059.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;

public class Arcade {
    private static edu.wpi.first.wpilibj.Joystick arcadeStick = new Joystick(1);

    public static boolean _povUp() {
        return arcadeStick.getPOV(0) == 0 || arcadeStick.getPOV(0) == 45 || arcadeStick.getPOV(0) == 315;
    }

    public static boolean _povDown() {
        return arcadeStick.getPOV(0) == 180 || arcadeStick.getPOV(0) == 135 || arcadeStick.getPOV(0) == 225;
    }

    public static boolean outtakeButton() {
        return arcadeStick.getRawButton(1);
    }

    public static boolean intakeButton() {
        return arcadeStick.getRawButton(2);
    }

    public static boolean intakeExtender() {
        return arcadeStick.getRawButton(3);
    }

    public static boolean autoAlign() {
        return arcadeStick.getRawButton(4);
    }

    public static boolean hatchEct() {
        return arcadeStick.getRawButton(5);
    }

    public static boolean compSwitch() {
        return arcadeStick.getRawButton(6);
    }

    public static boolean hatch() {
        return arcadeStick.getRawButton(8);
    }

    public static double elevatorOn() {
        return arcadeStick.getRawAxis(3);
    }
}
