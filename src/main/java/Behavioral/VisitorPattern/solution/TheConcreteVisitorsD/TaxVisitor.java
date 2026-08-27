package Behavioral.VisitorPattern.solution.TheConcreteVisitorsD;

import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Electronics;
import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Grocery;
import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Liquor;
import Behavioral.VisitorPattern.solution.TheVisitorContractA.CartVisitor;

public class TaxVisitor implements CartVisitor {
    @Override
    public double visit(Electronics electronics) {
        // Electronics have a 20% tax
        return electronics.getPrice() * 0.20;
    }

    @Override
    public double visit(Grocery grocery) {
        // Groceries are tax-free!
        return 0.0;
    }

    @Override
    public double visit(Liquor liquor) {
        // Liquor has a heavy 30% "Sin Tax"
        return liquor.getPrice() * 0.30;
    }
}
