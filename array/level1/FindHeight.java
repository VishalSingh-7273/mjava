//     Create a program to find the mean height of players present in a football team.
package ArraysLevel1;
import java.util.Scanner;
public class FindHeight {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] heights = new double[11];
    double sum = 0.0;

    System.out.println("Enter the heights of 11 players in the football team (in meters):");
    for (int i = 0; i < heights.length; i++) {
        System.out.print("Height of player " + (i + 1) + ": ");
        heights[i] = scanner.nextDouble();
        sum += heights[i];
    }

    double meanHeight = sum / heights.length;
    System.out.printf("The mean height of the football team is: %.2f meters%n", meanHeight);
     scanner.close();
}
}
