package Behavioral.ObserverPattern.solution.ContractsA.Publisher;

import Behavioral.ObserverPattern.solution.ContractsA.Listener.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}

