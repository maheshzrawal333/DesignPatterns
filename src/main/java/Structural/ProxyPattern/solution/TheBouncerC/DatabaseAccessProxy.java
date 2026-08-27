package Structural.ProxyPattern.solution.TheBouncerC;

import Structural.ProxyPattern.solution.ContractA.DatabaseAccess;
import Structural.ProxyPattern.solution.TheRealSubjectB.RealDatabaseAccess;

public class DatabaseAccessProxy implements DatabaseAccess {

    private RealDatabaseAccess realDatabase;
    private final String userRole;

    // We pass the user's role into the Proxy
    public DatabaseAccessProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Proxy: Intercepted query request. Checking permissions...");

        // 1. The Security Check
        if ("ADMIN".equalsIgnoreCase(userRole)) {

            // 2. Lazy Loading (Only build the heavy object if we absolutely need it)
            if (realDatabase == null) {
                realDatabase = new RealDatabaseAccess();
            }

            // 3. Delegate to the real object
            realDatabase.executeQuery(query);
            System.out.println("Proxy: Query successful.\n");
        } else {
            // Kick them out!
            System.out.println("Proxy: ACCESS DENIED. Role '" + userRole + "' cannot run queries.\n");
        }
    }
}
