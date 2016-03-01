package edu.depaul.cdm.se450.pattern.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Command c = new AddCommand(2, 2);
        Calculator invoker = new Calculator(c);
        int result = invoker.calculate();
    }
}
