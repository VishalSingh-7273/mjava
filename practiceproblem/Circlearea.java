package practiceproblem;
import java.util.Scanner;
public class Circlearea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double r = sc.nextDouble();
        double a=Math.PI*r*r;
        System.out.println("area of circle is:"+a);
    }
}
