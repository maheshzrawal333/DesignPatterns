package Behavioral.VisitorPattern.solution.TheVisitorContractA;

import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Electronics;
import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Grocery;
import Behavioral.VisitorPattern.solution.TheConcreteElementsC.Liquor;

public interface CartVisitor {
    // The Visitor knows exactly how to handle every specific type of item!
    double visit(Electronics electronics);
    double visit(Grocery grocery);
    double visit(Liquor liquor);
}
