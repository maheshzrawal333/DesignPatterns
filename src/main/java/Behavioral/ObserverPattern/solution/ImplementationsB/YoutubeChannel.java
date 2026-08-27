package Behavioral.ObserverPattern.solution.ImplementationsB;

import Behavioral.ObserverPattern.solution.ContractsA.Listener.Observer;
import Behavioral.ObserverPattern.solution.ContractsA.Publisher.Subject;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    private final List<Observer> subscribers = new ArrayList<>();
    private String latestVideoTitle;

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // Iterate through the list and push the notification to everyone!
        for (Observer subscriber : subscribers) {
            subscriber.update(latestVideoTitle);
        }
    }

    // This is the business logic
    public void uploadVideo(String title) {
        this.latestVideoTitle = title;
        System.out.println("\n--- Channel uploaded a new video: " + title + " ---");

        // The exact millisecond the video uploads, trigger the notifications!
        notifyObservers();
    }
}
