// Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay,
// along with the old and new salary.
package ArraysLevel2;
import java.util.Scanner;
public class CalculatedBonus {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] salaries = new double[10];
    double[] yearsOfService = new double[10];
    double[] bonuses = new double[10];
    double[] newSalaries = new double[10];
    double totalBonus = 0.0;
    double totalOldSalary = 0.0;
    double totalNewSalary = 0.0;

    for (int i = 0; i < 10; i++) {
        System.out.print("Enter salary for employee " + (i + 1) + ": ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service for employee " + (i + 1) + ": ");
        double years = scanner.nextDouble();

        if (salary <= 0 || years < 0) {
            System.out.println("Invalid input. Please enter again.");
            i--; 
            continue;
        }

        salaries[i] = salary;
        yearsOfService[i] = years;
    }

    for (int i = 0; i < 10; i++) {
        double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
        bonuses[i] = salaries[i] * bonusRate;
        newSalaries[i] = salaries[i] + bonuses[i];
        totalBonus += bonuses[i];
        totalOldSalary += salaries[i];
        totalNewSalary += newSalaries[i];
    }

    System.out.printf("Total bonus payout: %.2f%n", totalBonus);
    System.out.printf("Total old salary: %.2f%n", totalOldSalary);
    System.out.printf("Total new salary: %.2f%n", totalNewSalary);
     scanner.close();
}
}
