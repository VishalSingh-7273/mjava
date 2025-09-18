// MovieTicket.java
class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;

    // Default Constructor
    MovieTicket() {
        this.movieName = "Not Booked";
        this.seatNumber = -1;
        this.price = 0.0;
    }

    // Method to book a ticket
    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayTicket() {
        if (seatNumber == -1) {
            System.out.println("No ticket booked yet!");
        } else {
            System.out.println("Movie Name  : " + movieName);
            System.out.println("Seat Number : " + seatNumber);
            System.out.println("Price       : Rs. " + price);
            System.out.println("--------------------------------");
        }
    }
}

// Main class
public class MovieTicketSystem {
    public static void main(String[] args) {
        // Create ticket object
        MovieTicket ticket1 = new MovieTicket();

        // Try to display before booking
        ticket1.displayTicket();

        // Book ticket
        ticket1.bookTicket("Avengers: Endgame", 12, 250.0);

        // Display after booking
        ticket1.displayTicket();
    }
}
