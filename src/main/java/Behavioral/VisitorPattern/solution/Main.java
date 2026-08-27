package Behavioral.VisitorPattern.solution;

import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Electronics;
import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Grocery;
import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Liquor;
import Behavioral.VisitorPattern.solution.TheConcreteVisitorsD.ShippingCostVisitor;
import Behavioral.VisitorPattern.solution.TheConcreteVisitorsD.TaxVisitor;
import Behavioral.VisitorPattern.solution.TheElementContractB.ItemElement;
import Behavioral.VisitorPattern.solution.TheVisitorContractA.CartVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ItemElement> cart = new ArrayList<>();
        cart.add(new Electronics(1000.0, 3.5)); // $1000 laptop, 3.5kg
        cart.add(new Grocery(50.0));            // $50 apples
        cart.add(new Liquor(80.0));             // $80 whiskey

        // Let's calculate total Taxes!
        CartVisitor taxCalculator = new TaxVisitor();
        double totalTax = 0.0;

        for (ItemElement item : cart) {
            totalTax += item.accept(taxCalculator);
        }
        System.out.println("Total Tax to pay: $" + totalTax);

        // Let's calculate total Shipping!
        CartVisitor shippingCalculator = new ShippingCostVisitor();
        double totalShipping = 0.0;

        for (ItemElement item : cart) {
            totalShipping += item.accept(shippingCalculator);
        }
        System.out.println("Total Shipping cost: $" + totalShipping);
    }
}