// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1518.CommandBasedTest;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Servo launcherLeftServo;
    public static TalonSRX launcherBottomWheels;
    public static TalonSRX launcherTopWheels;
    public static Servo launcherRightServo;
    public static Talon driveTrainRearLeftDrive;
    public static VictorSP driveTrainRearRightDrive;
    public static VictorSP driveTrainFrontLeftDrive;
    public static Talon driveTrainFrontRightDrive;
    public static VictorSP shootermotor;
    public static VictorSP tailRight;
    public static VictorSP liftMotor1;
    public static VictorSP liftMotor2;
    public static VictorSP tailMotor;
    public static DigitalInput tailLimit1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        launcherLeftServo = new Servo(9);
        LiveWindow.addActuator("Fangs", "Left Servo", launcherLeftServo);
        
      launcherBottomWheels = new TalonSRX(6);
      LiveWindow.addActuator("Launcher", "Bottom Wheels", launcherBottomWheels);
        
       launcherTopWheels = new TalonSRX(5);
        LiveWindow.addActuator("Launcher", "Top Wheels", launcherTopWheels);
        
        launcherRightServo = new Servo(8);
        LiveWindow.addActuator("Fangs", "Right Servo", launcherRightServo);
        
        driveTrainRearLeftDrive = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Rear Left Drive", driveTrainRearLeftDrive);
        
        driveTrainRearRightDrive = new VictorSP(1);
        LiveWindow.addActuator("DriveTrain", "Rear Right Drive", driveTrainRearRightDrive);
        
        driveTrainFrontLeftDrive = new VictorSP(2);
        LiveWindow.addActuator("DriveTrain", "Front Left Drive", driveTrainFrontLeftDrive);
        
        driveTrainFrontRightDrive = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "Front Right Drive", driveTrainFrontRightDrive);
        
        shootermotor = new VictorSP(4);
        LiveWindow.addActuator("Launcher", "shooter motor", shootermotor);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
