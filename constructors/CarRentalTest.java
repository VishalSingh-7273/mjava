class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
        dailyRate = 1000.0; // Default rate per day
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    void displayRentalDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: ₹" + dailyRate);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
        System.out.println("----------------------");
    }
}

public class CarRentalTest {
    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Using Default Constructor:");
        rental1.displayRentalDetails();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Sneha", "Hyundai Creta", 5, 2500.0);
        System.out.println("Using Parameterized Constructor:");
        rental2.displayRentalDetails();
    }
}
