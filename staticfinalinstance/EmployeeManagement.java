package KeyWordAndInstanceOperatorLevel1;

public class EmployeeManagement {
    static String companyName = "ABC Company";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;
    EmployeeManagement(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }
    public void displatEmployeeDetails() {
        if(this instanceof EmployeeManagement){
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}
    public static  void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public static void main(String []args){
        EmployeeManagement employee1 = new EmployeeManagement(1, "mayank", "Manager");
        EmployeeManagement employee2 = new EmployeeManagement(2, "rohit", "Developer");
        employee1.displatEmployeeDetails();
        employee2.displatEmployeeDetails();
        displayTotalEmployees();
    }
}
