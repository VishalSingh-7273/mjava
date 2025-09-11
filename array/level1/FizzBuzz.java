 // Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number,
 // but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". 
 //Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,.
package ArraysLevel1;
import java.util.Scanner;
public class FizzBuzz {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int number = scanner.nextInt();

    if (number <= 0) {
        System.out.println("Error: Please enter a positive integer greater than 0.");
        return;
    }

    String[] results = new String[number];
    
    for (int i = 1; i <= number; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            results[i - 1] = "FizzBuzz";
        } else if (i % 3 == 0) {
            results[i - 1] = "Fizz";
        } else if (i % 5 == 0) {
            results[i - 1] = "Buzz";
        } else {
            results[i - 1] = Integer.toString(i);
        }
    }

    for (int i = 0; i < results.length; i++) {
        System.out.println("Position " + (i + 1) + " = " + results[i]);
    }

    scanner.close();
}
}
