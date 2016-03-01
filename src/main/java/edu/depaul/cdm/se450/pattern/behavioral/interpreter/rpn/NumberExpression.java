package edu.depaul.cdm.se450.pattern.behavioral.interpreter.rpn;

public class NumberExpression implements Expression{
    private int num;

    public NumberExpression(int i) {
        num = i;
    }

    @Override
    public int interpret() {
        return num;
    }

    @Override
    public String toString() {
        return "" + num;
    }
}
