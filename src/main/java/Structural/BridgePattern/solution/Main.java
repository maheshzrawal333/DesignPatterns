package Structural.BridgePattern.solution;

import Structural.BridgePattern.solution.TheAbstractionHierarchyB.Notification;
import Structural.BridgePattern.solution.TheImplementationHierarchyA.EmailSender;
import Structural.BridgePattern.solution.TheImplementationHierarchyA.MessageSender;
import Structural.BridgePattern.solution.TheImplementationHierarchyA.SmsSender;
import Structural.BridgePattern.solution.TheRefinedAbstractionsC.StandardNotification;
import Structural.BridgePattern.solution.TheRefinedAbstractionsC.UrgentNotification;

public class Main {
    public static void main(String[] args) {

        // 1. Create our tools (The Implementations)
        MessageSender email = new EmailSender();
        MessageSender sms = new SmsSender();

        System.out.println("--- Scenario 1: Standard System Outage ---");
        // Mix: Standard + Email
        Notification standardEmail = new StandardNotification(email);
        standardEmail.notifyUser("Server maintenance at midnight.");

        System.out.println("\n--- Scenario 2: Critical Database Crash ---");
        // Mix: Urgent + SMS
        Notification urgentSms = new UrgentNotification(sms);
        urgentSms.notifyUser("Database is down! Wake up the engineers!");

        System.out.println("\n--- Scenario 3: Swapping dynamically ---");
        // Mix: Urgent + Email (We didn't have to write an UrgentEmailNotification class!)
        Notification urgentEmail = new UrgentNotification(email);
        urgentEmail.notifyUser("Database is down! Wake up the engineers!");
    }
}
