package Week1_DesignPatternsAndPrinciples.Ex9_CommandPatternExample.Code;

public class RemoteControl {
    private Command command;

    // Set command dynamically
    public void setCommand(Command command) {
        this.command = command;
    }

    // Execute current command
    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set!");
        }
    }
}