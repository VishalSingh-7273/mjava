// Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
// Hint => 
// Take input for a number of persons
// Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
//        double[][] personData = new double[number][3];
//        String[] weightStatus = new String[number];
// Take input for weight and height of the persons and for negative values, ask the user to enter positive values
// Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
// Display the height, weight, BMI and status of each person

package ArraysLevel2;
import java.util.Scanner;
public class BMI2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3]; // 0: weight, 1: height, 2: BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            double weight;
            while (true) {
                System.out.print("Enter weight in kg (positive value): ");
                weight = scanner.nextDouble();
                if (weight > 0) {
                    break;
                }
                System.out.println("Please enter a positive value for weight.");
            }

            double height;
            while (true) {
                System.out.print("Enter height in meters (positive value): ");
                height = scanner.nextDouble();
                if (height > 0) {
                    break;
                }
                System.out.println("Please enter a positive value for height.");
            }

            double bmi = weight / (height * height);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        System.out.printf("%-10s %-10s %-10s %-20s%n", "Weight(kg)", "Height(m)", "BMI", "Weight Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
    
}
