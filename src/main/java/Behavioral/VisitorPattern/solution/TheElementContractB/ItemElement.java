package Behavioral.VisitorPattern.solution.TheElementContractB;

import Behavioral.VisitorPattern.solution.TheVisitorContractA.CartVisitor;

public interface ItemElement {
    double accept(CartVisitor visitor);
}
