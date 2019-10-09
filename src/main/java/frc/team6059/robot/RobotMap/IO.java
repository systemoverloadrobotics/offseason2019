package frc.team6059.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.*;

public class IO {
    public static Ultrasonic     _distance         = new Ultrasonic(1, 1);
    public static DigitalInput   _elevatorBottom   = new DigitalInput(0); //Elevator
    public static Servo          _hatchHook        = new Servo(0); //HatchPanel
    public static Compressor     _compressor       = new Compressor(3); //Ball
    public static DoubleSolenoid _rightPistonSlide = new DoubleSolenoid(3, 0, 1); //Ball
    public static DoubleSolenoid _leftPistonSlide  = new DoubleSolenoid(3, 2, 3); //Ball
    public static WPI_TalonSRX   _frontRightDrive  = new WPI_TalonSRX(4); //DriveTrain
    public static WPI_TalonSRX   _frontLeftDrive   = new WPI_TalonSRX(5); //DriveTrain
    public static WPI_VictorSPX  _backRightDrive   = new WPI_VictorSPX(6); //DriveTrain
    public static WPI_VictorSPX  _backLeftDrive    = new WPI_VictorSPX(7); //DriveTrain
    public static WPI_VictorSPX  _elevatorMotor    = new WPI_VictorSPX(8); //Elevator
    public static WPI_VictorSPX  _ballIntakeMotor  = new WPI_VictorSPX(9); //Ball
    public static WPI_VictorSPX  _rightFlywheel    = new WPI_VictorSPX(10); //Ball
    public static WPI_VictorSPX  _leftFlywheel     = new WPI_VictorSPX(11); //Ball

    public IO() {
        _frontRightDrive.configFactoryDefault();
        _frontLeftDrive.configFactoryDefault();
        _backRightDrive.configFactoryDefault();
        _backLeftDrive.configFactoryDefault();
        _elevatorMotor.configFactoryDefault();
        _ballIntakeMotor.configFactoryDefault();
        _rightFlywheel.configFactoryDefault();
        _leftFlywheel.configFactoryDefault();
    }
}

