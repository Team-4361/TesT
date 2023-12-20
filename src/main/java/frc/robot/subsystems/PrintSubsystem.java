// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PrintSubsystem extends SubsystemBase {
    /**
     * Creates a new ExampleSubsystem.
     */
    public PrintSubsystem() {}

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayGoodbye() {
        System.out.println("Bye!");
    }

    // Add some more methods here and create a command for it!
    // Duplicate "SayHelloCommand" as an example.

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
