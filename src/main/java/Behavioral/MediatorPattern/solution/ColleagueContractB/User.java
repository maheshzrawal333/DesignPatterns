package Behavioral.MediatorPattern.solution.ColleagueContractB;

import Behavioral.MediatorPattern.solution.MediatorContractA.ChatRoomMediator;

public abstract class User {
    protected ChatRoomMediator mediator;
    protected String name;

    public User(ChatRoomMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
