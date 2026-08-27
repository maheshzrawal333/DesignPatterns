package Creational.FactoryPattern.solution.BusinessLogicD;

import Creational.FactoryPattern.solution.ContractA.PaymentStrategy;

public class CheckoutService {

    // COMPOSITION: "Has-A" Strategy
    private final PaymentStrategy strategy;

    // INJECTION: Forced through the constructor
    public CheckoutService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double amount) {
        // We don't care how it pays, we just tell the tool to do its job!
        strategy.pay(amount);
    }
}
