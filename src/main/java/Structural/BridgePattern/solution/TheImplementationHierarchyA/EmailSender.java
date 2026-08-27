package Structural.BridgePattern.solution.TheImplementationHierarchyA;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Connecting to SMTP Server... Sending Email: " + message);
    }
}
