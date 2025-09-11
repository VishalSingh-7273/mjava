package javaprogrammingelemnts.level2;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter distance in feet: ");
    double feet = sc.nextDouble();
    double yards = feet / 3;
    double miles = feet / 5280;
    System.out.println(feet + " feet is equal to " + yards + " yards and " + miles + " miles.");
    sc.close();
}
}
