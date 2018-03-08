package org.usfirst.frc1518.CommandBasedTest.commands;

import org.usfirst.frc1518.CommandBasedTest.OI;
import org.usfirst.frc1518.CommandBasedTest.Robot;
import org.usfirst.frc1518.CommandBasedTest.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {

	public Drive() {
		// TODO Auto-generated constructor stub
		//requires(Robot.driveTrain);
	}

	public Drive(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Drive(double timeout) {
		super(timeout);
		// TODO Auto-generated constructor stub
	}

	public Drive(String name, double timeout) {
		super(name, timeout);
		// TODO Auto-generated constructor stub
	}

	protected void execute(){

		if (Robot.isTankMode == true) {
			if (Robot.isReversed == true) {
				Robot.driveTrain.driveCartesian(Robot.oi.mainstick.getY(), Robot.oi.mainstick.getX(), Robot.oi.mainstick.getZ());
			}
			else {
				// reversing zAxis when steering reversed
				Robot.driveTrain.driveCartesian(Robot.oi.mainstick.getY() * -1, Robot.oi.mainstick.getX() * -1, Robot.oi.mainstick.getZ());
			}
		}
		else {
			// combine z and x axis for steering preference
			// multiply the x axis by 0.5 to give more control
			// multiply the z axis by itself to slow power curve
			
			double liveZ = Robot.oi.mainstick.getZ();
			double liveX = Robot.oi.mainstick.getX();
			double liveY = Robot.oi.mainstick.getY();
			liveZ = (liveZ * Math.abs(liveZ)) * 0.6;	// 60% for best control 
			liveX = liveX * .8;							// 80% for better control
			liveY = liveY * Math.abs(liveY);  			// Squared using absolute to maintain negative values
			double steering = liveZ + liveX;			// Combine X & Z so both can control steering

			if (Robot.isReversed == true) {
				if (OI.turbo.get() == true) {
					Robot.driveTrain.driveCartesian(liveY * -1, 0, steering);
				}
				else {
				Robot.driveTrain.driveCartesian(liveY * -.80, 0, steering);
				}
			}
			else {
				// reversing drive and steering when in reversed drive
				if (OI.turbo.get() == true) {
					Robot.driveTrain.driveCartesian(liveY * 1, 0, steering);
				}
				else {
				Robot.driveTrain.driveCartesian(liveY * .80, 0, steering);
				}
			}

		}
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void end() {
		//Robot.driveTrain.stop();
	}
	protected void interrupted(){
		end();
	}
}
