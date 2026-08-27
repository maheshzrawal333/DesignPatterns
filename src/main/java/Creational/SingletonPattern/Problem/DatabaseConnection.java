package Creational.SingletonPattern.Problem;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // DANGER!
        }
        return instance;
    }
}
