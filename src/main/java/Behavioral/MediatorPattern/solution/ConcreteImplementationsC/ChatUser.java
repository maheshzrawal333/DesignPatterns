package Behavioral.MediatorPattern.solution.ConcreteImplementationsC;

import Behavioral.MediatorPattern.solution.ColleagueContractB.User;
import Behavioral.MediatorPattern.solution.MediatorContractA.ChatRoomMediator;

public class ChatUser extends User {

    public ChatUser(ChatRoomMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        // Delegate the heavy lifting to the central hub!
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received: " + message);
    }
}
