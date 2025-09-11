// Rework the program 3, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
package ArraysLevel2;
import java.util.Scanner;
public class LargestDigit {
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
