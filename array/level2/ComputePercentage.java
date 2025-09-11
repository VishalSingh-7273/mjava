// Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade

package ArraysLevel2;
import java.util.Scanner;
public class ComputePercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        double[][] marks = new double[numberOfStudents][3]; 
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                double mark;
                while (true) {
                    System.out.print("Enter marks in " + subject + " (positive value): ");
                    mark = scanner.nextDouble();
                    if (mark >= 0) {
                        break;
                    }
                    System.out.println("Please enter a positive value for marks.");
                }
                marks[i][j] = mark;
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } 
            else {
                grades[i] = "R";
            }
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Student %d: Physics: %.2f, Chemistry: %.2f, Maths: %.2f, Percentage: %.2f%%, Grade: %s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
    }
     scanner.close();
}
}
