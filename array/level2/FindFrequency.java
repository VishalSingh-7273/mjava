// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
package ArraysLevel2;
import java.util.Scanner;
public class FindFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index >= maxDigit) {
                maxDigit += 10; // Increase the size by 10
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }

        int[] frequency = new int[10]; 

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
    
}
