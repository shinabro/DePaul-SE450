package edu.depaul.cdm.se450.pattern.behavioral.strategy;

/**
 * Context within strategy
 */
public class Calculator {
    private Strategy strategy;
    private int lhs;
    private int rhs;

    public Calculator(int rhs, int lhs) {
        this.rhs = rhs;
        this.lhs = lhs;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult() {
        return strategy.calculate(lhs, rhs);
    }
}
