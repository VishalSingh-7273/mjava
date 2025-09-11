package javaprogrammingelemnts.level2;

import java.util.Scanner;

public class Quotientandreminder {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (dividend): ");
        int dividend = sc.nextInt();
        System.out.print("Enter the second number (divisor): ");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
        sc.close();
    }
}