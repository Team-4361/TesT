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

    // Create a new PUBLIC method which prints out any text you want.
    // Example: "public void doIt()"
    // The print method is "System.out.println(INSERT TEXT IN QUOTES)"

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayGoodbye() {
        System.out.println("Bye!");
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
