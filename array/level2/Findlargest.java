// Create a program to store the digits of the number in an array and find the largest and second largest element of the array. 
package ArraysLevel2;
import java.util.Scanner;
public class Findlargest {              
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

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        if (largest == Integer.MIN_VALUE) {
            System.out.println("No digits were entered.");
        } else {
            System.out.println("The largest digit is: " + largest);
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("There is no second largest digit.");
            } else {
                System.out.println("The second largest digit is: " + secondLargest);
            }
        }

        scanner.close();
    }
}