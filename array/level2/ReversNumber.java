//Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
package ArraysLevel2;
import java.util.Scanner;
public class ReversNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index >= maxDigit) {
                System.out.println("Maximum of " + maxDigit + " digits reached.");
                break;
            }
            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }

        System.out.println("The reversed number is:");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
    
}
