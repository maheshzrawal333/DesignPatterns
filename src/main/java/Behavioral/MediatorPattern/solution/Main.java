package Behavioral.MediatorPattern.solution;

import Behavioral.MediatorPattern.solution.ColleagueContractB.ChatRoom;
import Behavioral.MediatorPattern.solution.ColleagueContractB.User;
import Behavioral.MediatorPattern.solution.ConcreteImplementationsC.ChatUser;
import Behavioral.MediatorPattern.solution.MediatorContractA.ChatRoomMediator;

public class Main {
    public static void main(String[] args) {

        // 1. Boot up the Central Hub
        ChatRoomMediator chatRoom = new ChatRoom();

        // 2. Create the users and connect them ONLY to the hub
        User mahesh = new ChatUser(chatRoom, "Mahesh");
        User alice = new ChatUser(chatRoom, "Alice");
        User bob = new ChatUser(chatRoom, "Bob");

        // 3. Register them
        chatRoom.registerUser(mahesh);
        chatRoom.registerUser(alice);
        chatRoom.registerUser(bob);

        System.out.println("\n--- Chat Begins ---");

        // Mahesh only talks to the Hub. The Hub handles the rest!
        mahesh.send("Hello everyone! Have you studied Design Patterns?");

        System.out.println();

        alice.send("Yes! We just finished the Chain of Responsibility.");
    }
}
