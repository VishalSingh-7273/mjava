class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price (per unit): Rs. " + price);
    }

    // Method to calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

// Main class
public class InventoryTest {
    public static void main(String[] args) {
        // Create item objects
        Item item1 = new Item(101, "Notebook", 50.0);

        // Display item details
        System.out.println("Item 1 Details:");
        item1.displayDetails();
        System.out.println("Total cost for 5 units: Rs. " + item1.calculateTotalCost(5));
        System.out.println("-----------------------------------");

    }
}
