package Behavioral.StatePattern.solution.ContextB;


import Behavioral.StatePattern.solution.ContractA.State;
import Behavioral.StatePattern.solution.TheConcreteStatesC.DraftState;

public class Document {

    // COMPOSITION: The Document "Has-A" State
    private State currentState;

    public Document() {
        // A document always starts as a Draft
        this.currentState = new DraftState();
    }

    // The method to swap the state out!
    public void setState(State newState) {
        this.currentState = newState;
    }

    // The Action
    public void clickPublish() {
        // We don't use if/else. We just tell the current state to do its job!
        currentState.clickPublish(this);
    }
}
