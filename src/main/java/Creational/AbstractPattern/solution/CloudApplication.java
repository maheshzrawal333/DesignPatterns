package Creational.AbstractPattern.solution;

import Creational.AbstractPattern.solution.TheAbstractFactoryC.CloudFactory;
import Creational.AbstractPattern.solution.TheProductFamiliesA.Server;
import Creational.AbstractPattern.solution.TheProductFamiliesA.Storage;

// 1. The Client Application (It knows NOTHING about AWS or Azure)
class CloudApplication {
    private final Server server;
    private final Storage storage;

    // It just accepts a generic factory and trusts it!
    public CloudApplication(CloudFactory factory) {
        this.server = factory.createServer();
        this.storage = factory.createStorage();
    }

    public void runDeploy() {
        server.bootUp();
        storage.save("User Backup Data");
    }
}
