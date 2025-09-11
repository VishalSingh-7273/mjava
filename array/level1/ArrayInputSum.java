// Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number.
// Show all the numbers as well as the sum of all numbers 
package ArraysLevel1;
import java.util.Scanner;
public class ArrayInputSum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            if (number <= 0 || index >= 10) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("The sum of the numbers entered is: " + total);
         scanner.close();
    }
}
