package Structural.BridgePattern.solution.TheRefinedAbstractionsC;

import Structural.BridgePattern.solution.TheAbstractionHierarchyB.Notification;
import Structural.BridgePattern.solution.TheImplementationHierarchyA.MessageSender;

public class UrgentNotification extends Notification {

    public UrgentNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        // Urgent notification adds severe warnings before crossing the bridge!
        System.out.println("[Urgent Logic]: Appending critical priority headers!");
        String urgentPayload = "🚨 CRITICAL ALERT: " + message.toUpperCase() + " 🚨";
        sender.sendMessage(urgentPayload);
    }
}
