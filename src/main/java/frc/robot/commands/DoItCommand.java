package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class DoItCommand extends CommandBase {

    private int counter = 0; // A counter variable to see how many times our
                             // code executes.

    public DoItCommand() {
        // Add the requirement for our "PrintSubsystem" here. Look at
        // the "SayHelloCommand" as an example.
    }

    @Override
    public void initialize() {
        // This part runs one time and makes counter equal to zero.
        counter = 0;
    }

    @Override
    public void execute() {
        // Call your function here! Remember to start it with "Robot.printSystem"
        // Example: a method named "test" should be "Robot.printSubsystem.test();"






        counter++; // add one to counter
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("We are done!");
    }

    @Override
    public boolean isFinished() {
        // Add an if-statement which returns true if "counter" is greater than 10.
        // Return false otherwise.
    }
}
