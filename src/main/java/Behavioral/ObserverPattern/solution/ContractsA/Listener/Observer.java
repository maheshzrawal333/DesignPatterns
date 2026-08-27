package Behavioral.ObserverPattern.solution.ContractsA.Listener;

public interface Observer {
    // This is the method the channel will call to notify the listener
    void update(String videoTitle);
}
