package frc.team6059.robot.Subsystems;

import edu.wpi.first.wpilibj.Servo;
import frc.team6059.robot.RobotMap.*;

public class HatchPanel {

    private Servo mServo;

    /**
     * class constructor
     */
    public HatchPanel() {

        mServo = IO._hatchHook;
    }

    /**
     * checks button status
     */
    public void onTickUpdate() {
        boolean button = Arcade._ballIntake();

        if (Arcade._compressor()) {
            IO._compressor.start();
        } else {
            IO._compressor.stop();
        }

        if (button) {
            mServo.setAngle(90);
        }
        else {
            mServo.setAngle(0);
        }
    }
}