package EncapsulationInterface;

interface Discountable {
    double applyDiscount(double amount);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.95;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Non-Veg items";
    }
}

public class FoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        double total = item.calculateTotalPrice();
        if (item instanceof Discountable) {
            total = ((Discountable) item).applyDiscount(total);
            System.out.println(((Discountable) item).getDiscountDetails());
        }
        System.out.println("Final Price: " + total);
       
    }

    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Tikka", 200, 2),
            new NonVegItem("Chicken Biryani", 300, 1)
        };

        for (FoodItem item : order) {
            processOrder(item);
        }
    }
}
