package Structural.FacadePattern.solution;

import Structural.FacadePattern.solution.TheFrontDeskB.OrderFacade;

public class Main {
    public static void main(String[] args) {

        // The client only talks to the Facade
        OrderFacade amazonFrontDesk = new OrderFacade();

        // One simple method call handles 4 different backend systems!
        amazonFrontDesk.placeOrder(
                "MacBook Pro",
                "1234-5678-9012",
                2500.00,
                "123 Developer Way, Tech City"
        );
    }
}
