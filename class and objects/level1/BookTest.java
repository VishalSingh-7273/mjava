
class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Book Title  : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price (Rs.) : " + price);
        System.out.println("---------------------------");
    }
}

// Main class
public class BookTest {
    public static void main(String[] args) {
        // Creating book objects
        Book b1 = new Book("Java Programming", "James Gosling", 550.50);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 650.00);
        Book b3 = new Book("Clean Code", "Robert C. Martin", 720.75);

        // Display details
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
