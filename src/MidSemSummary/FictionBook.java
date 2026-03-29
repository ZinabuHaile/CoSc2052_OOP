/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Mis Sem Summary
  Program Demonstration for : 
 */

package MidSemSummary;

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */

//Task 10
public class FictionBook extends Book {
    public FictionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public String getCategory() {
        return "Fiction"; 
    }
}