package practiceproblem;
import java.util.Scanner;
public class averageofthreenumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double r = (a+b+c)/3;
        System.out.println("Average of the numbers is:"+r);
    }
}

