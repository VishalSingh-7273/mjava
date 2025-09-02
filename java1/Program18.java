public class Program18 {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Maximum Integer Value: " + maxInt);
        
        // Adding 1 to the maximum integer value to demonstrate overflow
        int overflowedValue = maxInt + 1;
        System.out.println("Value after overflow: " + overflowedValue);
    }
    
}