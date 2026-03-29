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
//This covers tasks 5 and demonstrates polymorphism.
public class Library {
    public static void main(String[] args) {
        // Task 5: Array of Objects
        Book[] inventory = new Book[3];

        inventory[0] = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        inventory[1] = new EBook("Java Programming", "Zinabu H.", 0.0, 4.5);
        inventory[2] = new FictionBook("1984", "George Orwell", 12.50);

        // Demonstrating Runtime Polymorphism
        System.out.println("--- Library Inventory ---");
        for (Book b : inventory) {
            b.displayInfo(); // Calls overridden version in EBook if applicable
            System.out.println("Category: " + b.getCategory());
            System.out.println("-------------------------");
        }

        // Task 8: Displaying static count
        System.out.println("Total books created: " + Book.getTotalBooks());

        // Task 4 & 9: Testing Equality and Validation
        Book otherBook = new FictionBook("1984", "George Orwell", 10.0);
        System.out.println("Is '1984' in inventory equal to otherBook? " + inventory[2].equals(otherBook));
        
        System.out.print("Testing negative price validation: ");
        inventory[0].setPrice(-5.0);
    }
}
