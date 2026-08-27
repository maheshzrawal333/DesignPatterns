package Behavioral.VisitorPattern.solution.TheConcreteVisitorsD;


import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Electronics;
import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Grocery;
import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Liquor;
import Behavioral.VisitorPattern.solution.TheVisitorContractA.CartVisitor;

public class ShippingCostVisitor implements CartVisitor {
    @Override
    public double visit(Electronics electronics) {
        // Shipping is $5 per KG for heavy electronics
        return electronics.getWeight() * 5.0;
    }

    @Override
    public double visit(Grocery grocery) {
        // Flat rate $2 for groceries
        return 2.0;
    }

    @Override
    public double visit(Liquor liquor) {
        // Flat rate $10 because it is fragile glass
        return 10.0;
    }
}
