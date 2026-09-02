//Scenario: Sunrise Public Library wants a simple digital system to manage its books. Every book has a title, author, price, and ISBN number.
// The library wants to keep every book's data private and safe from accidental modification, so it must be accessed only through defined methods.
// The library also wants to track the total number of books added to the system so far (shared across all Book objects), and it wants the library's name to be fixed and unchangeable throughout the program.
//        (a) Design a class Book with private data members: title (String), author (String), price (double), isbn (String). Provide public getter and setter methods for each field.  [4]
//        (b) Write a parameterized constructor that initializes title, author, price and isbn when a Book object is created.  [2]
//        (c) Add a static variable bookCount that increments by 1 every time a new Book object is created, and a final variable libraryName initialized to "Sunrise Public Library".  [2]
//        (d) Using the driver code below, complete the Book class so that the program compiles and produces the expected output.  [2]


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
