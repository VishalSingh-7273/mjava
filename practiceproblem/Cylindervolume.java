package practiceproblem;
import java.util.Scanner;
public class Cylindervolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double r= sc.nextDouble();
        System.out.println("Enter Height");
        double h= sc.nextDouble();
        double v=Math.PI*r*r*h;
        System.out.println("Volume of cylinder:"+v);
        
    }
}
