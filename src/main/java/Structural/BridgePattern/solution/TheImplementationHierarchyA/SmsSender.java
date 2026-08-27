package Structural.BridgePattern.solution.TheImplementationHierarchyA;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Connecting to Telecom API... Sending SMS: " + message);
    }
}
