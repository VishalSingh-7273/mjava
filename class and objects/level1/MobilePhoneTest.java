// MobilePhone.java
class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : Rs. " + price);
        System.out.println("-------------------------------");
    }
}

// Main class
public class MobilePhoneTest {
    public static void main(String[] args) {
        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999.0);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 65000.0);
    
        // Display details
        phone1.displayDetails();
        phone2.displayDetails();
    }
}
