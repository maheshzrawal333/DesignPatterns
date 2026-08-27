package Creational.BuilderPattern.solution;

public class User {
    // 1. All fields are final (Immutable!)
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final int age;

    // 2. PRIVATE Constructor. It takes the Builder as an argument.
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    // Getters only. No setters, because the object is final!
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + " | Age: " + age + " | Email: " + email;
    }

    // ==========================================
    // 3. THE STATIC INNER BUILDER CLASS
    // ==========================================
    public static class Builder {
        // Required parameters
        private final String firstName;
        private final String lastName;

        // Optional parameters (initialized to default values)
        private String email = "No email provided";
        private String phone = "No phone provided";
        private int age = 0;

        // The Builder constructor forces the required fields!
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Optional setter methods return "this" (the Builder itself) so we can chain them!
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        // 4. The Final Step: Build the immutable User object
        public User build() {
            return new User(this);
        }
    }
}