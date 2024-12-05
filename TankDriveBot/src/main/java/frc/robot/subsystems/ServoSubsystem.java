// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Servo;
import frc.robot.Constants;

public class ServoSubsystem extends SubsystemBase {



  /** Creates a new Servo. */
  public void boxOpen() {
    boxController.setSpeed(1);
  }

  public void boxClose() {
    boxController.setSpeed(-1);
  }
}
