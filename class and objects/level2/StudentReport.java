// Student.java
class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Student Name   : " + name);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks          : " + marks);
        System.out.println("Grade          : " + calculateGrade());
        System.out.println("----------------------------------");
    }
}

// Main class
public class StudentReport {
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student("Priyanshu", 101, 92);
        Student s2 = new Student("Rahul", 102, 76.5);
       
        // Display their reports
        s1.displayDetails();
        s2.displayDetails();
    }
}
