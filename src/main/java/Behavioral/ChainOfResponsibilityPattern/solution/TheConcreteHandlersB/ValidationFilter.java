package Behavioral.ChainOfResponsibilityPattern.solution.TheConcreteHandlersB;

import Behavioral.ChainOfResponsibilityPattern.solution.ContractA.SecurityFilter;

public class ValidationFilter extends SecurityFilter {
    @Override
    public boolean check(String ip, String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("[Security]: BLOCKING request. Email is missing.");
            return false; // Break the chain!
        }
        System.out.println("[Security]: Payload is valid.");
        return checkNext(ip, email); // Pass to the next guard!
    }
}
