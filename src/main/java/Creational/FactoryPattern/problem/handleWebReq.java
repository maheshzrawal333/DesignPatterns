package Creational.FactoryPattern.problem;

import Creational.FactoryPattern.solution.BusinessLogicD.CheckoutService;
import Creational.FactoryPattern.solution.StrategiesB.CreditCardStrategy;
import Creational.FactoryPattern.solution.StrategiesB.PayPalStrategy;
import Creational.FactoryPattern.solution.ContractA.PaymentStrategy;

class handleWebReq{

    // The web server receives the user's request
    public void handleWebRequest(String userInput, double amount) {

        PaymentStrategy strategy = null;

        // Oh no, the massive if/else is back!
        if (userInput.equals("CREDIT_CARD")) {
            strategy = new CreditCardStrategy();
        } else if (userInput.equals("PAYPAL")) {
            strategy = new PayPalStrategy();
        }

        CheckoutService service = new CheckoutService(strategy);
        service.checkout(amount);
    }


}

