package KeyWordAndInstanceOperatorLevel1;

public class LibraryManagement {
    static String libraryName = "ABC Library";
    String title;
    String author;
    final int isbn ;
    public LibraryManagement(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void displayBookDetails(){
        if(this instanceof LibraryManagement)
        System.out.println("Library Name: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    public static void displayLibraryName(){
        System.out.println("Library Name: " + libraryName);
    }
    public static void main(String []args){
        LibraryManagement b1 = new LibraryManagement("Ramayana", "Valmiki", 978);
        LibraryManagement b2 = new LibraryManagement(" The India Way", "S.Jaishankar", 948);
        b1.displayBookDetails();
        b2.displayBookDetails();
        LibraryManagement.displayLibraryName();
       
    }
}
