package Behavioral.ChainOfResponsibilityPattern.solution.TheConcreteHandlersB;

import Behavioral.ChainOfResponsibilityPattern.solution.ContractA.SecurityFilter;

public class IpBlockFilter extends SecurityFilter {
    @Override
    public boolean check(String ip, String email) {
        if (ip.equals("192.168.1.99")) { // Pretend this is a known hacker IP
            System.out.println("[Security]: BLOCKING request. Malicious IP detected.");
            return false; // Break the chain!
        }
        System.out.println("[Security]: IP is clean.");
        return checkNext(ip, email); // Pass to the next guard!
    }
}
