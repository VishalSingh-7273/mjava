//An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
package ArraysLevel2;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obesity";
            }
        }

        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s%n", heights[i], weights[i], bmis[i], weightStatuses[i]);
        }

        scanner.close();
    }
    
}
