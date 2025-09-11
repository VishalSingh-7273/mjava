// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
package ArraysLevel2;
import java.util.Scanner;
public class FindYoungestFriend {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] friends = {"Amar", "Akbar", "Anthony"};
    int[] ages = new int[3];
    double[] heights = new double[3];

    for (int i = 0; i < friends.length; i++) {
        System.out.print("Enter age of " + friends[i] + ": ");
        ages[i] = scanner.nextInt();

        System.out.print("Enter height of " + friends[i] + " in meters: ");
        heights[i] = scanner.nextDouble();
    }

    int youngestIndex = 0;
    double tallestHeight = heights[0];
    int tallestIndex = 0;

    for (int i = 1; i < friends.length; i++) {
        if (ages[i] < ages[youngestIndex]) {
            youngestIndex = i;
        }
        if (heights[i] > tallestHeight) {
            tallestHeight = heights[i];
            tallestIndex = i;
        }
    }

    System.out.println("The youngest friend is: " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
    System.out.println("The tallest friend is: " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " meters");

    scanner.close();
}
}