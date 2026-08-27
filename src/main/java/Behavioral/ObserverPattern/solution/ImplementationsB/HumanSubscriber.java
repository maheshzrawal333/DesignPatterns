package Behavioral.ObserverPattern.solution.ImplementationsB;

import Behavioral.ObserverPattern.solution.ContractsA.Listener.Observer;

public class HumanSubscriber implements Observer {

    private final String name;

    public HumanSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Hello " + name + ", a new video is out: " + videoTitle);
    }
}
