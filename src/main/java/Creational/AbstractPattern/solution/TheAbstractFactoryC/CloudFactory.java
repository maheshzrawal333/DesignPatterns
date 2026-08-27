package Creational.AbstractPattern.solution.TheAbstractFactoryC;

import Creational.AbstractPattern.solution.TheProductFamiliesA.Server;
import Creational.AbstractPattern.solution.TheProductFamiliesA.Storage;

public interface CloudFactory {
    Server createServer();
    Storage createStorage();
}
