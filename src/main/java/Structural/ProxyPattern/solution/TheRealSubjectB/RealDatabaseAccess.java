package Structural.ProxyPattern.solution.TheRealSubjectB;

import Structural.ProxyPattern.solution.ContractA.DatabaseAccess;

public class RealDatabaseAccess implements DatabaseAccess {

    public RealDatabaseAccess() {
        // Simulating an expensive boot-up process
        System.out.println("--- Booting up secure connection to Oracle DB ---");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("[Database Executing]: " + query);
    }
}
