package PractiseQue1;

public class Book {
    // Private data members
    private String title;
    private String author;
    private double price;
    private String isbn;

    // Static variable
    public static int bookCount = 0;

    // Final variable
    public static final String libraryName = "Sunrise Public Library";

    // Parameterized constructor
    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;

        // Increment count for every new Book object
        bookCount++;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for ISBN
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
