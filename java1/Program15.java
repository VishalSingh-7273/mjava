class Program15{
 
    public static void main(String[] args) {
        
        int a = 10;
        int b = a;   
        b = 20;     

        System.out.println("Primitive Variables:");
        System.out.println("a = " + a); 
        System.out.println("b = " + b); 


        int[] arr1 = {1, 2, 3}; 
        int[] arr2 = arr1;      

        arr2[0] = 99;          

        System.out.println("\nReference Variables:");
        System.out.println("arr1[0] = " + arr1[0]); 
        System.out.println("arr2[0] = " + arr2[0]); 
    }
}