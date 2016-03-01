package edu.depaul.cdm.se450.pattern.behavioral.command;

/**
 * Invoker of Command pattern
 */
public class Calculator {
    private Command command;

    public Calculator(Command command) {
        this.command = command;
    }
    public int calculate() {
        command.execute();
        return command.getResult();
    }
}
