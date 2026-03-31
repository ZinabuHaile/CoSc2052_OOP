/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Mid Sem
  Program Demonstration for : 
 */

package MidSemSummary;

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
// Task 10: Making the class abstract Task 10
public abstract class Book {
    // Task 1 & 8: Private attributes and static variable
    private String title;
    private String author;
    private double price;
    private static int bookCount = 0; // Task 8: Static variable to track total books

    // Task 2: Constructor Overloading
    // No-argument constructor
    public Book() {
        this("Default Title", "Unknown", 0.0);
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this(title, author, 0.0);
    }

    // Full constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price); // Using mutator for validation
        bookCount++;     // Incrementing static counter
    }

    // Task 1 & 9: Accessors and Mutators with Validation
    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Title cannot be empty.");
        }
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    
    // Task 9: Data validation in mutator
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    // Task 8: Static method to access static variable
    public static int getTotalBooks() {
        return bookCount;
    }

    // Task 7: Method to be overridden
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    // Task 3 & 5: Overriding toString()
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " [Price: $" + price + "]";
    }

    // Task 4: Overriding equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return title.equals(other.title) && author.equals(other.author);
    }

    // Task 10: Abstract method
    public abstract String getCategory();
}
