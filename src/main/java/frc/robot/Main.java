// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {
	private Main() {
	}

	public static void main(String... args) {
		// Yes I do believe we should start the robot
		RobotBase.startRobot(Robot::new);
	}
}
