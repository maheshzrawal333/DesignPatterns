package Behavioral.ChainOfResponsibilityPattern.solution.ContractA;

public abstract class SecurityFilter {

    // This holds the next link in the chain
    private SecurityFilter nextFilter;

    // This allows us to snap the LEGO blocks together
    public SecurityFilter setNext(SecurityFilter nextFilter) {
        this.nextFilter = nextFilter;
        return nextFilter; // We return it so we can chain them nicely!
    }

    // The method every child must implement
    public abstract boolean check(String ip, String email);

    // A helper method to pass the baton to the next runner
    protected boolean checkNext(String ip, String email) {
        if (nextFilter == null) {
            return true; // We reached the end of the chain, everything passed!
        }
        return nextFilter.check(ip, email);
    }
}
