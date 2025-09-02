public class Program12 {
    public static void main(String[] args) {
        byte b = 10;
        char c = 'A'; 
        short s = 20;

        int result1 = b + c + s;
        System.out.println("(Byte + Char + Short)Promoted to int : " + result1);

        int i = 30;
        long l = 40L;
        long result2 = i + l;
        System.out.println("(int + Long)Promoted to Long: " + result2);


        float f = 50.0f;
        float result3 = l + f;
        System.out.println("(Long + Float)Promoted to Float " + result3);

        double d = 60.0;
        double result4 = f + d;
        System.out.println("(Double + Float)Promoted to Double " + result4);

        
        
    }
    
}