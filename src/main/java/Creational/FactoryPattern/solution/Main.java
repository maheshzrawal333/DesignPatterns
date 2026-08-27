package Creational.FactoryPattern.solution;

import Creational.FactoryPattern.solution.BusinessLogicD.CheckoutService;
import Creational.FactoryPattern.solution.ContractA.PaymentStrategy;
import Creational.FactoryPattern.solution.FactoryC.PaymentFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Starting E-Commerce Server ---");

        // Simulate User 1 clicking "PayPal" to pay $50.00
        handleWebRequest("PAYPAL", 50.00);

        // Simulate User 2 clicking "Credit Card" to pay $120.50
        handleWebRequest("CREDIT_CARD", 120.50);

        // Simulate User 3 making a typo (This will safely trigger our exception!)
        try {
            handleWebRequest("BITCOIN", 900.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // This method acts like our Web Controller
    private static void handleWebRequest(String userClick, double amount) {

        // 1. The Factory builds the tool
        PaymentStrategy strategy = PaymentFactory.createStrategy(userClick);

        // 2. We inject the tool into the Service
        CheckoutService service = new CheckoutService(strategy);

        // 3. We execute the business logic
        service.checkout(amount);
    }
}
