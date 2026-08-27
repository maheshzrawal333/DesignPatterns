package Creational.AbstractPattern.solution.TheConcreteProductsB;

import Creational.AbstractPattern.solution.TheProductFamiliesA.Storage;

public class AwsS3Storage implements Storage {
    @Override
    public void save(String data) { System.out.println("[AWS S3]: Saving data to S3 Bucket..."); }
}
