public class Program14 {
    public static void main(String[] args) {
        int number = 42; // You can change this value to test with different numbers
        
        String binaryString = Integer.toBinaryString(number);
        String hexString = Integer.toHexString(number);
        
        System.out.println("Number: " + number);
        System.out.println("Convert To Binary: " + binaryString);
        System.out.println(" Convert To Hexadecimal : " + hexString);
    }
    
}