package practiceproblem;
import java.util.Scanner;
public class Conversionkmtomile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km to convert in miles");
        double km = sc.nextDouble();
        double m = km*0.621371;
        System.out.println("distance in mile is:"+m);
    }
}
