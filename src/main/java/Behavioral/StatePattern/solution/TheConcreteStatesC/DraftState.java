package Behavioral.StatePattern.solution.TheConcreteStatesC;


import Behavioral.StatePattern.solution.ContextB.Document;
import Behavioral.StatePattern.solution.ContractA.State;

public class DraftState implements State {
    @Override
    public void clickPublish(Document document) {
        System.out.println("[Draft]: Publishing requested. Moving document to the REVIEW queue.");
        // Transition to the next state!
        document.setState(new ReviewState());
    }
}
