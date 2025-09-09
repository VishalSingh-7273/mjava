package practiceproblem;
import java.util.Scanner;
public class Powercalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        double b = sc.nextDouble();
        System.out.println("Enter exponent");
        double e = sc.nextDouble();
        double r=Math.pow(e, b);
        System.out.println("result is:"+r);
    }
}

