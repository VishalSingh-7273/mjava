package javaprogrammingelemnts.level1;

public class pendistribution {
     public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;   // Division operator
        int remainingPens = totalPens % students;    // Modulus operator

        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
