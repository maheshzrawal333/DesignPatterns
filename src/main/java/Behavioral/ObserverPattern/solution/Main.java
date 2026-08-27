package Behavioral.ObserverPattern.solution;

import Behavioral.ObserverPattern.solution.ContractsA.Listener.Observer;
import Behavioral.ObserverPattern.solution.ImplementationsB.HumanSubscriber;
import Behavioral.ObserverPattern.solution.ImplementationsB.YoutubeChannel;

public class Main {
    public static void main(String[] args) {

        // 1. Create the Channel
        YoutubeChannel channel = new YoutubeChannel();

        // 2. Create the Observers
        Observer mahesh = new HumanSubscriber("Mahesh");
        Observer alice = new HumanSubscriber("Alice");
        Observer bob = new HumanSubscriber("Bob");

        // 3. Mahesh and Alice subscribe. Bob does not.
        channel.subscribe(mahesh);
        channel.subscribe(alice);

        // 4. Upload a video. Only Mahesh and Alice should be notified!
        channel.uploadVideo("Java Design Patterns Masterclass");

        // 5. Alice unsubscribes, but Bob subscribes.
        channel.unsubscribe(alice);
        channel.subscribe(bob);

        // 6. Upload a second video.
        channel.uploadVideo("Advanced Unit Testing with Mockito");
    }
}
