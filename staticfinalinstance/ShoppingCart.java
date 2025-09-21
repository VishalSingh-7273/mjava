package KeyWordAndInstanceOperatorLevel1;

public class ShoppingCart {
    static int discount = 10;
    final int productID;
    String productName;
    double price;
    int quantity;
    public ShoppingCart(String productName, double price, int quantity ,int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    public void displayDetails() {
        if(this instanceof ShoppingCart){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product ID: " + productID);
        System.out.println("Discount: " + discount+"%");
        }
        
    }
    public  static void updateDiscount( int newDiscount) {
        discount = newDiscount;
        
    }
    public static void main(String[] args) {
        ShoppingCart s1= new ShoppingCart("Laptop", 50000, 2, 1);
        ShoppingCart s2 = new ShoppingCart("Mobile", 20000, 3, 2);
        s1.displayDetails();
        s2.displayDetails();

    ShoppingCart.updateDiscount(20);
        s1.displayDetails();
        s2.displayDetails();
    }
}