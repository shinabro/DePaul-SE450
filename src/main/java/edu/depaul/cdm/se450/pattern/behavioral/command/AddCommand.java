package edu.depaul.cdm.se450.pattern.behavioral.command;

public class AddCommand implements Command {
    private int rhs;
    private int lhs;
    private int result;

    public AddCommand(int rhs, int lhs) {
        this.rhs = rhs;
        this.lhs = lhs;
    }

    public int getResult() {
        return result;
    }

    @Override
    public void execute() {
        result = rhs + lhs;
    }
}
