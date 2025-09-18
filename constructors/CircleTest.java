class Circle {
    double radius;

   
    Circle() {
        this(1.0); 
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display circle details
    void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// Main class
public class CircleTest {
    public static void main(String[] args) {
        // Using default constructor (will set radius = 1.0)
        Circle defaultCircle = new Circle();
        System.out.println("Using Default Constructor:");
        defaultCircle.displayDetails();

        System.out.println("--------");

        // Using parameterized constructor (radius = 5.5)
        Circle customCircle = new Circle(5.5);
        System.out.println("Using Parameterized Constructor:");
        customCircle.displayDetails();
    }
}
