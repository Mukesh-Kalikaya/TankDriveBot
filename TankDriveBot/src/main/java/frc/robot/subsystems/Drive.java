// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class Drive extends SubsystemBase {
  private static DifferentialDrive differentialDrive;

  private final WPI_TalonSRX leftMotor;
  private final WPI_TalonSRX leftBackMotor;
  private final WPI_TalonSRX rightMotor;
  private final WPI_TalonSRX rightBackMotor;

  /** Creates a new Drivetrain. */
  public Drive() {
    leftMotor = new WPI_TalonSRX(Constants.leftDriveMaster);
    rightMotor = new WPI_TalonSRX(Constants.rightDriveMaster);
    leftBackMotor = new WPI_TalonSRX(Constants.leftDriveSlave);
    rightBackMotor = new WPI_TalonSRX(Constants.rightDriveSlave);

    leftBackMotor.follow(leftMotor);
    rightBackMotor.follow(rightMotor);

    differentialDrive = new DifferentialDrive(leftMotor, rightMotor);

    leftMotor.setInverted(true);
  }

  @Override
  public void periodic() { 
  }

  public void setSpeed(double leftSpeed, double rightSpeed) {
    differentialDrive.tankDrive(leftSpeed, rightSpeed);
  }
}
