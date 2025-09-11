// Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers
package ArraysLevel1;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop.");

        while (true) {
            System.out.print("Enter number: ");
            double input = sc.nextDouble();

            
            if (input <= 0) {
                break;
            }

            
            if (index >= 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            
            numbers[index] = input;
            index++;
        }

        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; 
        }

        System.out.println("\nTotal sum: " + total);

        sc.close();
    }
}

            

    

