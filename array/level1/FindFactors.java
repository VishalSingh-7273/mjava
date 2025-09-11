// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
package ArraysLevel1;
import java.util.Scanner;
public class FindFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
            
        }
        

        int[] factors = new int[number]; 
        int factorCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[factorCount] = i;
                factorCount++;
            }
        }

        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factorCount; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
