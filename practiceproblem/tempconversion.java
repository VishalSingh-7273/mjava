package practiceproblem;
import java.util.Scanner;
public class tempconversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celcius");
        int c = sc.nextInt(); 
        int f=(c*9/5)+32;
        System.out.println("temperature in fahrenheit:"+f);
        }
}
