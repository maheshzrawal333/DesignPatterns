package Behavioral.ChainOfResponsibilityPattern.solution.TheConcreteHandlersB;

import Behavioral.ChainOfResponsibilityPattern.solution.ContractA.SecurityFilter;

public class RateLimitFilter extends SecurityFilter {
    private int requestCount = 0;

    @Override
    public boolean check(String ip, String email) {
        requestCount++;
        if (requestCount > 2) {
            System.out.println("[Security]: BLOCKING request. Rate limit exceeded (Max 2).");
            return false; // Break the chain!
        }
        System.out.println("[Security]: Rate limit OK.");
        return checkNext(ip, email); // Pass to the next guard!
    }
}
