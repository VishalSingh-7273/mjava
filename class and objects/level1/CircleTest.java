// Circle.java
class Circle {
    // Attribute
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Radius of Circle       : " + radius);
        System.out.println("Area of Circle         : " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }
}

// Main class
public class CircleTest {
    public static void main(String[] args) {
        // Creating Circle objects
        Circle c1 = new Circle(5.0);

        // Displaying details
        c1.displayDetails();
    }
}
