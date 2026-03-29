/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Chapter 2
  Program Demonstration for : 
              Instance Variables and Methods 
              Creating objects 
              Accessing : instance variables and methods 
              
 */
package Chapter2;

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee();
       
        e1.name="Zinabu";
        System.out.println("The name of the employee e1 is :"+e1.name);
        e1.age=23;
        e1.salary=15000;
        e1.outputDetails();
    }  

    
}
