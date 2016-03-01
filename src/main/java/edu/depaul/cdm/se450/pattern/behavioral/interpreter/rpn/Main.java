package edu.depaul.cdm.se450.pattern.behavioral.interpreter.rpn;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String tokenString = "4 4 +";

        String[] tokenList = tokenString.split(" ");
        Stack<Expression> stack = new Stack();

        for (String s : tokenList) {
            try {
                Expression num =new NumberExpression(Integer.parseInt(s));
                stack.push(num);
            } catch (NumberFormatException nfe) {
                Expression lhs =stack.pop();
                Expression rhs = stack.pop();
                if ("+".equals(s)) {
                    Expression operation = new AddExpression(lhs, rhs);
                    int result = operation.interpret();
                    stack.push(new NumberExpression(result));
                }

            }
        }

        System.out.println(stack.pop());
    }
}
