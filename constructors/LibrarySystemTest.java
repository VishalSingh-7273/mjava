class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Constructor
    Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // mark as borrowed
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry! \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("---------------------");
    }
}

// Main class
public class LibrarySystemTest {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 499.50, true);
        Book book2 = new Book("1984", "George Orwell", 399.00, false);

        // Display book details
        book1.displayDetails();
        book2.displayDetails();

        // Try borrowing books
        System.out.println("Attempting to borrow books:");
        book1.borrowBook(); // should succeed
        book2.borrowBook(); // should fail

        System.out.println("\nAfter Borrowing:");
        book1.displayDetails();
        book2.displayDetails();
    }
}
