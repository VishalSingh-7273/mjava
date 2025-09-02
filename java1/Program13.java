class Program13 {
   
    String name;
    static String college = "ABC College";

    Program13(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }
}

class Student {
    public static void main(String[] args) {
       
        Program13 s1 = new Program13("Rahul");
        Program13 s2 = new Program13("Priya");

       
        s1.display();
        s2.display();

           Program13.college = "XYZ University";

        System.out.println("\nAfter changing static variable:");
        s1.display();
        s2.display();
    }
}