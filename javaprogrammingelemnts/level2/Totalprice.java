package javaprogrammingelemnts.level2;

import java.util.Scanner;

public class Totalprice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the unit price of the item: ");
    double unitPrice = sc.nextDouble();     
    System.out.print("Enter the quantity to be bought: ");
    int quantity = sc.nextInt();
    double totalPrice = unitPrice * quantity;
    System.out.println("The total price is: " + totalPrice);
    sc.close();
}
}
