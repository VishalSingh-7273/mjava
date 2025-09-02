public class Program8 {
    public static void main(String[] args) {
        
        int intValue = 100;
        double doubleValue = intValue; 
        System.out.println("Implicit Casting: " + doubleValue);

        
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; 
        System.out.println("Explicit Casting: " + anotherIntValue);
    }
    
}