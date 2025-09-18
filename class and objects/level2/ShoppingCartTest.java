import java.util.ArrayList;

// Represents a single item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Get total cost for this item
    double getTotalCost() {
        return price * quantity;
    }
}

// Represents the shopping cart
class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    // Method to add item
    void addItem(String name, double price, int quantity) {
        items.add(new CartItem(name, price, quantity));
        System.out.println(quantity + " x " + name + " added to the cart.");
    }

    // Method to remove item by name
    void removeItem(String name) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(name)) {
                items.remove(i);
                System.out.println(name + " removed from the cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(name + " not found in the cart.");
        }
    }

    // Method to display total cost
    void displayTotalCost() {
        double total = 0;
        System.out.println("\n--- Cart Items ---");
        for (CartItem item : items) {
            System.out.println(item.itemName + " (x" + item.quantity + ") = Rs. " + item.getTotalCost());
            total += item.getTotalCost();
        }
        System.out.println("Total Cost = Rs. " + total);
        System.out.println("---------------------------");
    }
}

// Main class
public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items
        cart.addItem("Notebook", 50.0, 2);
        cart.addItem("Pen", 10.0, 5);
        cart.addItem("Headphones", 1200.0, 1);

        // Display total
        cart.displayTotalCost();

        // Remove an item
        cart.removeItem("Pen");

        // Display updated total
        cart.displayTotalCost();
    }
}
