package Inheritance;
public class EmployeeManagement {
    String name ;
    int id ;
    double salary ; 
    EmployeeManagement(int id, String name, double salary){
        this.id = id ;
        this.name = name ;
        this.salary = salary ;   
    } 
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends EmployeeManagement {
    int teamSize ;
    Manager(String name, int id, double salary, int teamSize){
        super(id, name, salary);
        this.teamSize = teamSize ;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends EmployeeManagement {
    String programmingLanguage ;
    Developer(String name, int id, double salary, String programmingLanguage){
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage ;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends EmployeeManagement {
    String university ;
    Intern(String name, int id, double salary, String university){
        super(id, name, salary);
        this.university = university ;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
     
}
class Main1 {
    public static void main(String[] args) {
        Manager manager = new Manager("rahul", 1, 80000, 5);
        Developer developer = new Developer("vinay", 2, 60000, "Java");
        Intern intern = new Intern("sumit", 3, 30000, "XYZ University");

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();    
    }
}
