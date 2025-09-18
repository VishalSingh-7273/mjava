class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class PersonTest {
    public static void main(String[] args) {
        // Create original person
        Person p1 = new Person("Sneha", 25);

        System.out.println("Original Person:");
        p1.displayDetails();

        System.out.println("-----------");

        // Create a copy using copy constructor
        Person p2 = new Person(p1);

        System.out.println("Copied Person:");
        p2.displayDetails();
    }
}
