 //Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
package ArraysLevel1;
import java.util.Scanner;
public class Array2D { 
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int rows = 3;
    int cols = 3;
    int[][] array2D = new int[rows][cols];
    System.out.println("Enter elements for a 3x3 matrix:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print("Element [" + i + "][" + j + "]: ");
            array2D[i][j] = scanner.nextInt();
        }
    }
    int[] array1D = new int[rows * cols];
    int index = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            array1D[index++] = array2D[i][j];
        }
    }
    System.out.println("The elements in the single dimension array are:");
    for (int num : array1D) {
        System.out.print(num + " ");
    }
    System.out.println();
     scanner.close();
}
}
