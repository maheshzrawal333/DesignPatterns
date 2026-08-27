package Behavioral.MediatorPattern.solution.ColleagueContractB;

import Behavioral.MediatorPattern.solution.MediatorContractA.ChatRoomMediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatRoomMediator {

    private final List<User> users = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        users.add(user);
        System.out.println("System: " + user.name + " joined the chat.");
    }

    @Override
    public void sendMessage(String message, User sender) {
        // The hub routes the message to everyone EXCEPT the person who sent it
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}