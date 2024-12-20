package frc.robot.subsystems.drive.io;

import edu.wpi.first.math.geometry.Rotation2d;
import frc.robot.Util;

public interface SwerveModuleIO {
    // Set drive motor voltage
    public void setDriveVolts(double volts);

    // Set turn motor voltage
    public void setTurnVolts(double volts);

    // Set drive motor velocity
    public void setDriveVelocity(double veloRadsPerSecond);

    // Set turn motor turn position
    public void setTurnPosition(Rotation2d angle);

    // Set drive motor PID configuration
    public void setDrivePID(Util.PID pid);

    // Set turn motor PID configuration
    public void setTurnPID(Util.PID pid);

    // Set drive motor brake mode state
    public void setDriveBrakeState(boolean on);

    // Set turn motor brake mode state
    public void setTurnBrakeState(boolean on);

    // Stop motors
    public void stop();
}
