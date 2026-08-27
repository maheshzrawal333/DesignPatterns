package Behavioral.InterpreterPattern.solution.TheContractA;

public interface Expression {
    // Evaluates the rule against the provided context (the user's actual data)
    boolean interpret(String context);
}
