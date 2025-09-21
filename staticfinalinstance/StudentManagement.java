package KeyWordAndInstanceOperatorLevel1;

public class StudentManagement {
    static String universityName = "Chitkara University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;
    public StudentManagement(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public void display(){
        if(this instanceof StudentManagement){
        System.out.println("University Name: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Total Students: " + totalStudents);
    }
}
    static void displayTotalStudents(){
        System.out.println("Total Students: " + totalStudents);
    }
    public static void main(String []args){
        StudentManagement student1 = new StudentManagement("Hariom", 101, "A");
        StudentManagement student2 = new StudentManagement("Rohit", 102, "B");
        student1.display();
        student2.display();
    StudentManagement.displayTotalStudents();
    }
}
