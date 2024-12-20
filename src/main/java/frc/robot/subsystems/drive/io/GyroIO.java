package frc.robot.subsystems.drive.io;

import edu.wpi.first.math.geometry.Rotation2d;

public interface GyroIO {
    // Gyro status
    public static class GyroStatus {
        public Rotation2d yawPos;
        public double yawVelocityRadsPerSecond;
    }

    // Get gyro status
    GyroStatus getStatus();

    // Reset gyro position to zero
    void zero();
}
