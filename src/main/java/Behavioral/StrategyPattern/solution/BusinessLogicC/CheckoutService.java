package Behavioral.StrategyPattern.solution.BusinessLogicC;

import Behavioral.StrategyPattern.solution.ContractA.PaymentStrategy;

public class CheckoutService {

    // COMPOSITION: It "Has-A" payment strategy.
    private final PaymentStrategy strategy;

    // INJECTION: We hand it the specific strategy it needs.
    public CheckoutService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double amount) {
        // It just blindly executes the strategy!
        strategy.pay(amount);
    }
}
