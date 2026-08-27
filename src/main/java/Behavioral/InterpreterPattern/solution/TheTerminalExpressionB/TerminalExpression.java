package Behavioral.InterpreterPattern.solution.TheTerminalExpressionB;

import Behavioral.InterpreterPattern.solution.TheContractA.Expression;

public class TerminalExpression implements Expression {

    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        // If the context contains our word, this part of the rule is TRUE!
        return context.contains(data);
    }
}
