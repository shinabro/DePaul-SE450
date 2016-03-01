package edu.depaul.cdm.se450.pattern.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(2, 3);
        calc.setStrategy(new AddStrategy());
        System.out.println(calc.getResult());

        calc.setStrategy(new MultiplicationStrategy());
        System.out.println(calc.getResult());
    }
}
