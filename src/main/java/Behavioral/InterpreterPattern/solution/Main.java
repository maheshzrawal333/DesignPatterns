package Behavioral.InterpreterPattern.solution;

import Behavioral.InterpreterPattern.solution.TheContractA.Expression;
import Behavioral.InterpreterPattern.solution.TheNonTerminalExpressionsC.AndExpression;
import Behavioral.InterpreterPattern.solution.TheNonTerminalExpressionsC.OrExpression;
import Behavioral.InterpreterPattern.solution.TheTerminalExpressionB.TerminalExpression;

public class Main {

    // Helper method to build our specific rule tree
    public static Expression buildAccessRule() {
        Expression admin = new TerminalExpression("ADMIN");
        Expression manager = new TerminalExpression("MANAGER");
        Expression active = new TerminalExpression("ACTIVE");

        // (MANAGER AND ACTIVE)
        Expression managerAndActive = new AndExpression(manager, active);

        // ADMIN OR (MANAGER AND ACTIVE)
        return new OrExpression(admin, managerAndActive);
    }

    public static void main(String[] args) {

        // 1. Build the Rule Engine Tree
        Expression accessRule = buildAccessRule();

        System.out.println("--- Testing Access Rules ---");

        // 2. Test User 1: A basic user
        String user1 = "USER, ACTIVE";
        System.out.println("User 1 access: " + accessRule.interpret(user1)); // False

        // 3. Test User 2: A Manager, but inactive
        String user2 = "MANAGER, INACTIVE";
        System.out.println("User 2 access: " + accessRule.interpret(user2)); // False

        // 4. Test User 3: An Active Manager
        String user3 = "MANAGER, ACTIVE";
        System.out.println("User 3 access: " + accessRule.interpret(user3)); // True!

        // 5. Test User 4: An Admin (doesn't even need to be active!)
        String user4 = "ADMIN, INACTIVE";
        System.out.println("User 4 access: " + accessRule.interpret(user4)); // True!
    }
}
