package edu.depaul.cdm.se450.pattern.behavioral.strategy;


public class MultiplicationStrategy implements Strategy {
    @Override
    public int calculate(int lhs, int rhs) {
        return lhs * rhs;
    }
}