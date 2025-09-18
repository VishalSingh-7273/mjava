class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

// Main class
public class BookTest {
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Using Default Constructor:");
        defaultBook.displayDetails();

        System.out.println("------");

        // Using parameterized constructor
        Book paramBook = new Book("The Alchemist", "Paulo Coelho", 499.50);
        System.out.println("Using Parameterized Constructor:");
        paramBook.displayDetails();
    }
}