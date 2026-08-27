package Creational.SingletonPattern.solution;

public class DatabaseConnection {

    // 1. PRIVATE Constructor: No one is allowed to use "new DatabaseConnection()"
    private DatabaseConnection() {
        System.out.println("--- BOOTING UP: Establishing secure connection to the Database... ---");
        // Imagine 5 seconds of heavy setup code here
    }

    // 2. THE SECRET: A private static inner class.
    // Java guarantees that this inner class is NOT loaded into memory
    // until someone specifically asks for it. And when it does load,
    // Java makes it 100% thread-safe automatically!
    private static class ConnectionHolder {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    // 3. The Global Access Point
    public static DatabaseConnection getInstance() {
        // We simply return the instance from the hidden inner class
        return ConnectionHolder.INSTANCE;
    }

    // Just a dummy method to prove it works
    public void executeQuery(String query) {
        System.out.println("Executing: " + query);
    }
}
