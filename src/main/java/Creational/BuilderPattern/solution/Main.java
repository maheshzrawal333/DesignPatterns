package Creational.BuilderPattern.solution;

public class Main {
    public static void main(String[] args) {

        // 1. Create a user with all details
        User fullUser = new User.Builder("Alice", "Smith")
                .email("alice@gmail.com")
                .phone("555-1234")
                .age(28)
                .build(); // Locks it in!

        // 2. Create a user with only the required fields and age. No nulls needed!
        User partialUser = new User.Builder("Bob", "Johnson")
                .age(45)
                .build();

        System.out.println(fullUser.toString());
        System.out.println(partialUser.toString());
    }
}
