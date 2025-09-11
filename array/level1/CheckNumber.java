// Write a program to take user input for 5 numbers and check whether a number is positive,
// negative, or zero. Further for positive numbers check if the number is even or odd.
// Finally compare the first and last elements of the array and display if they equal, greater or less
package ArraysLevel1;
import java.util.Scanner;
public class CheckNumber {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];
    for (int i = 0; i < numbers.length; i++) {
        System.out.print("Enter number " + (i + 1) + ": ");
        numbers[i] = scanner.nextInt();
        if (numbers[i] > 0) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is a positive even number.");
            } else {
                System.out.println(numbers[i] + " is a positive odd number.");
            }
        } else if (numbers[i] < 0) {
            System.out.println(numbers[i] + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    if (numbers[0] > numbers[numbers.length - 1]) {
        System.out.println("The first element " + numbers[0] + " is greater than the last element " + numbers[numbers.length - 1]);
    } else if (numbers[0] < numbers[numbers.length - 1]) {
        System.out.println("The first element " + numbers[0] + " is less than the last element " + numbers[numbers.length - 1]);
    } else {
        System.out.println("The first element " + numbers[0] + " is equal to the last element " + numbers[numbers.length - 1]);
    }
     scanner.close();
}
    
}
