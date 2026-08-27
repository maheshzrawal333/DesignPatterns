package Behavioral.StatePattern.solution.ContractA;


import Behavioral.StatePattern.solution.ContextB.Document;

public interface State {
    // We pass the document into the method so the state can change the document's internal state!
    void clickPublish(Document document);
}
