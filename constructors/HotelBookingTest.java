class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    void displayBooking() {
        System.out.println("Hotel Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("-----------");
    }
}

// Main class
public class HotelBookingTest {
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Using Default Constructor:");
        booking1.displayBooking();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Sneha", "Deluxe", 3);
        System.out.println("Using Parameterized Constructor:");
        booking2.displayBooking();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Using Copy Constructor:");
        booking3.displayBooking();
    }
}
