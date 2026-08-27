package Creational.SingletonPattern.solution;

public class Main {
    public static void main(String[] args) {

        System.out.println("App started. Database is not connected yet.");

        // 1. First time calling it. The inner class loads, and the connection boots up.
        System.out.println("\nFetching connection 1...");
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        conn1.executeQuery("SELECT * FROM users");

        // 2. Second time calling it. It skips the boot-up and returns the EXACT SAME object in memory.
        System.out.println("\nFetching connection 2...");
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        conn2.executeQuery("UPDATE balance SET amount = 500");

        // 3. Let's prove they are the exact same object in RAM!
        System.out.println("\nAre conn1 and conn2 the exact same object in memory?");
        System.out.println(conn1 == conn2); // This will print 'true'
    }
}
