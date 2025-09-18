class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

// Main class
 class EmployeeDetails {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("Priyanshu", 101, 50000.0);

        // Display details of employees
        emp1.displayDetails();
    }
}

 