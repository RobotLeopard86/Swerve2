// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
	// Instance of autonomous command
	private Command autonomousCommand;

	// Manages controller input and command mapping
	private RobotContainer robotContainer;

	@Override
	public void robotInit() {
		// Yes I do believe we should make a robot container
		robotContainer = new RobotContainer();

		// Set brownout voltage to keep our baby roboRIO safe
		RobotController.setBrownoutVoltage(6.0);
	}

	@Override
	public void robotPeriodic() {
		// Yes I do believe we should run the command scheduler
		CommandScheduler.getInstance().run();
	}

	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
	}

	@Override
	public void disabledExit() {
	}

	@Override
	public void autonomousInit() {
		// Fetch autonomous command
		autonomousCommand = robotContainer.getAutonomousCommand();

		// Null check
		if (autonomousCommand != null) {
			// Schedule the autonomous command
			autonomousCommand.schedule();
		}
	}

	@Override
	public void autonomousPeriodic() {
	}

	@Override
	public void autonomousExit() {
	}

	@Override
	public void teleopInit() {
		// Cancel the autonomous command
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}
	}

	@Override
	public void teleopPeriodic() {
	}

	@Override
	public void teleopExit() {
	}

	@Override
	public void testInit() {
		// Cancel everything when we start tests
		CommandScheduler.getInstance().cancelAll();
	}

	@Override
	public void testPeriodic() {
	}

	@Override
	public void testExit() {
	}
}
