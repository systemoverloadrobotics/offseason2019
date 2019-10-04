package frc.team6059.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;

public class IO {
    Servo _hatchHook = new Servo(0);
    Compressor _compressor = new Compressor(3);
    DoubleSolenoid _rightPistonSlide = new DoubleSolenoid(3, 0, 1);
    DoubleSolenoid _leftPistonSlide = new DoubleSolenoid(3, 2, 3);
    WPI_TalonSRX _frontRightDrive = new WPI_TalonSRX(4);
    WPI_TalonSRX _frontLeftDrive = new WPI_TalonSRX(5);
    WPI_VictorSPX _backRightDrive = new WPI_VictorSPX(6);
    WPI_VictorSPX _backLeftDrive = new WPI_VictorSPX(7);
    WPI_VictorSPX _elevatorMotor = new WPI_VictorSPX(8);
    WPI_VictorSPX _ballIntakeMotor = new WPI_VictorSPX(9);
    WPI_VictorSPX _rightFlywheel = new WPI_VictorSPX(10);
    WPI_VictorSPX _leftFlywheel = new WPI_VictorSPX(11);

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

