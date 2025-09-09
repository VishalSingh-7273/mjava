package practiceproblem;
import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle");
        double p = sc.nextDouble();
        System.out.println("Enter rate");
        double r = sc.nextDouble();
        System.out.println("Enter time");
        double t = sc.nextDouble();
        double s=(p*r*t)/100;
        System.out.println("simple intrest is:"+s);
    }
}
