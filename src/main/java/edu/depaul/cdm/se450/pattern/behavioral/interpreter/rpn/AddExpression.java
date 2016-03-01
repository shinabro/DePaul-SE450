package edu.depaul.cdm.se450.pattern.behavioral.interpreter.rpn;


public class AddExpression implements Expression {
    private Expression lhs;
    private Expression rhs;

    public AddExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public int interpret() {
        return lhs.interpret() + rhs.interpret();
    }
}
