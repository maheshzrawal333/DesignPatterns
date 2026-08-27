package Behavioral.StatePattern.solution.TheConcreteStatesC;


import Behavioral.StatePattern.solution.ContextB.Document;
import Behavioral.StatePattern.solution.ContractA.State;

public class PublishedState implements State {
    @Override
    public void clickPublish(Document document) {
        // If it is already published, clicking publish again shouldn't do anything.
        System.out.println("[Published]: ERROR - This document is already live. You cannot publish it again.");
    }
}
