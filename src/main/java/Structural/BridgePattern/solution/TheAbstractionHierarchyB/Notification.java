package Structural.BridgePattern.solution.TheAbstractionHierarchyB;

import Structural.BridgePattern.solution.TheImplementationHierarchyA.MessageSender;

public abstract class Notification {

    // THE BRIDGE: Composition over Inheritance!
    // We hold the interface, so we can swap out Email/SMS dynamically at runtime.
    protected final MessageSender sender;

    public Notification(MessageSender sender) {
        this.sender = sender;
    }

    // The business logic method that children will implement
    public abstract void notifyUser(String message);
}
