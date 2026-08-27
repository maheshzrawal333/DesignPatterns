package Structural.BridgePattern.solution.TheRefinedAbstractionsC;

import Structural.BridgePattern.solution.TheAbstractionHierarchyB.Notification;
import Structural.BridgePattern.solution.TheImplementationHierarchyA.MessageSender;

public class StandardNotification extends Notification {

    public StandardNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        // Standard notification just passes the message through
        System.out.println("[Standard Logic]: Preparing standard payload.");
        sender.sendMessage(message);
    }
}
