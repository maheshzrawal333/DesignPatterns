package Structural.ProxyPattern;

import Structural.ProxyPattern.solution.ContractA.DatabaseAccess;
import Structural.ProxyPattern.solution.TheBouncerC.DatabaseAccessProxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Scenario 1: Standard User trying to access the DB ---");
        // We give the client the PROXY, not the real database
        DatabaseAccess standardUserDB = new DatabaseAccessProxy("GUEST");
        standardUserDB.executeQuery("DROP TABLE users"); // This will be blocked!

        System.out.println("--- Scenario 2: Admin accessing the DB ---");
        DatabaseAccess adminDB = new DatabaseAccessProxy("ADMIN");
        adminDB.executeQuery("SELECT * FROM users"); // This will pass!

        System.out.println("--- Scenario 3: Admin doing a second query ---");
        // Notice that the Oracle DB doesn't "boot up" a second time because of Lazy Loading!
        adminDB.executeQuery("UPDATE users SET status = 'ACTIVE'");
    }
}
