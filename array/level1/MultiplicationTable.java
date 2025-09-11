package ArraysLevel1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Array to store multiplication results from 6 to 9
        int[] multiplicationResult = new int[4];
        
        // Calculate multiplication for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        
        // Display the results
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        
        sc.close();
    }
}
