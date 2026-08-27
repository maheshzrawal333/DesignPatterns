package Creational.FactoryPattern.solution.StrategiesB;

import Creational.FactoryPattern.solution.ContractA.PaymentStrategy;

public class ApplePayStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pinging Apple device for $" + amount);
    }
}
