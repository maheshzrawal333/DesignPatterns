package Behavioral.ChainOfResponsibilityPattern.solution;

import Behavioral.ChainOfResponsibilityPattern.solution.ContractA.SecurityFilter;
import Behavioral.ChainOfResponsibilityPattern.solution.TheConcreteHandlersB.IpBlockFilter;
import Behavioral.ChainOfResponsibilityPattern.solution.TheConcreteHandlersB.RateLimitFilter;
import Behavioral.ChainOfResponsibilityPattern.solution.TheConcreteHandlersB.ValidationFilter;

public class Main {
    public static void main(String[] args) {

        // 1. Build the Chain (IP Check -> Validation -> Rate Limit)
        SecurityFilter firewall = new IpBlockFilter();

        firewall.setNext(new ValidationFilter())
                .setNext(new RateLimitFilter());

        // 2. Simulate Web Requests hitting the server
        System.out.println("--- Request 1: Valid User ---");
        boolean success1 = firewall.check("10.0.0.1", "alice@gmail.com");
        System.out.println("Login Success: " + success1 + "\n");

        System.out.println("--- Request 2: Missing Data ---");
        boolean success2 = firewall.check("10.0.0.1", null);
        System.out.println("Login Success: " + success2 + "\n");

        System.out.println("--- Request 3: Hacker IP ---");
        boolean success3 = firewall.check("192.168.1.99", "hacker@gmail.com");
        System.out.println("Login Success: " + success3 + "\n");

        System.out.println("--- Request 4: Rate Limiting kicks in! ---");
        boolean success4 = firewall.check("10.0.0.1", "alice@gmail.com");
        System.out.println("Login Success: " + success4 + "\n");
    }
}
