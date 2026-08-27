package Behavioral.MediatorPattern.solution.MediatorContractA;

import Behavioral.MediatorPattern.solution.ColleagueContractB.User;

public interface ChatRoomMediator {
    // The mediator handles routing the message
    void sendMessage(String message, User sender);

    // The mediator handles registering users
    void registerUser(User user);
}
