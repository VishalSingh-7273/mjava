public class Program9 {
    public static void main(String[] args) {
        
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt; 
        System.out.println("AutoBoxing: Primitive int " + primitiveInt + " to Wrapped Integer " + wrappedInt);
        
       
        Integer anotherWrappedInt = 100;
        int anotherPrimitiveInt = anotherWrappedInt;
        System.out.println("UnBoxing: Wrapped Integer " + anotherWrappedInt + " to Primitive int " + anotherPrimitiveInt);
    }
    
}