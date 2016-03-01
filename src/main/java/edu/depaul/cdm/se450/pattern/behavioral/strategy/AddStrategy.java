package edu.depaul.cdm.se450.pattern.behavioral.strategy;

public class AddStrategy implements Strategy {
    @Override
    public int calculate(int lhs, int rhs) {
        return lhs + rhs;
    }
}
