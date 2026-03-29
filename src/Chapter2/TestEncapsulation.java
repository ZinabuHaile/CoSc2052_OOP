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
public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation e1=new Encapsulation();
       
        e1.name="Zinabu";
        System.out.println("The name of the employee e1 is :"+e1.name);
       // e1.age=23; //Illegal Trying to access private instance variable
        e1.setAge(23);
        System.out.println("Employee age is :"+e1.getAge());
        e1.salary=15000;
        e1.outputDetails();
        
    }  

    
}
