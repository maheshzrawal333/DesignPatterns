package Creational.AbstractPattern.solution.TheConcreteProductsB;

import Creational.AbstractPattern.solution.TheProductFamiliesA.Storage;

public class AzureBlobStorage implements Storage {
    @Override
    public void save(String data) { System.out.println("[Azure Blob]: Saving data to Blob Container..."); }
}
