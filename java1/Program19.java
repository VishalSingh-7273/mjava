public class Program19 {
     public static void main(String[] args) {
        long longValue = 9223372036854775807L; 

       
        float floatValue = longValue;

        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);

      
        if ((long) floatValue == longValue) {
            System.out.println(" Long Value Can Store In Float");
        } else {
            System.out.println(" Long Value Can Not Store In float ");
        }
    }
    
}