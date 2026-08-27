package Behavioral.CommandPattern.solution.ContractA;

public interface Command {
    void execute();
    void undo(); // The magic of the Command pattern!
}
