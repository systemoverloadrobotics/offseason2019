package frc.team6059.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;

public class Arcade {
    private static Joystick arcade = new Joystick(1);

    public static boolean _elvUp() { //Elevator
        return arcade.getPOV(0) == 0 || arcade.getPOV(0) == 45 || arcade.getPOV(0) == 315;
    }

    public static boolean _elvDown() { //Elevator
        return arcade.getPOV(0) == 180 || arcade.getPOV(0) == 135 || arcade.getPOV(0) == 225;
    }

    public static boolean _ballFeederExtend() { return arcade.getRawButton(3); } //Ball

    public static boolean _ballIntake() { return arcade.getRawButton(2); } //Ball

    public static boolean _ballOuttake() { return arcade.getRawButton(4); } //Ball

    public static boolean _hatchHook() { return arcade.getRawButton(6); } //Hatch Hook

    public static boolean _compressor() { return arcade.getRawButton(8); } //Ball

    public static boolean _elvOn() { return arcade.getRawButton(5); }
}
