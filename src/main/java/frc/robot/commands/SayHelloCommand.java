// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

/**
 * An example command that uses an example subsystem.
 */
public class SayHelloCommand extends CommandBase {
    public SayHelloCommand() {
        // Note we need to "require" this system. Now only ONE command can run
        // per Subsystem.
        addRequirements(Robot.printSystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        Robot.printSystem.sayHello();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.printSystem.sayGoodbye();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
