package Behavioral.StatePattern.solution.TheConcreteStatesC;

import Behavioral.StatePattern.solution.ContextB.Document;
import Behavioral.StatePattern.solution.ContractA.State;

public class ReviewState implements State {
    @Override
    public void clickPublish(Document document) {
        System.out.println("[Review]: Admin approved! Publishing document to the live website.");
        // Transition to the final state!
        document.setState(new PublishedState());
    }
}
