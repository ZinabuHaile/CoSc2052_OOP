/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Mid Sem Summary
  Program Demonstration for : 
 */

package MidSemSummary;

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
// Task 6: Inheritance
public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, String author, double price, double fileSizeMB) {
        // Task 6: Using super() to initialize inherited fields
        super(title, author, price);
        this.fileSizeMB = fileSizeMB;
    }

    // Task 7: Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls parent display logic
        System.out.println("File Size: " + fileSizeMB + " MB");
    }

    @Override
    public String getCategory() {
        return "Digital/E-Book";
    }
}
