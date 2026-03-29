/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Chapter 2
  Program Demonstration for : 
              Instance Variables and Methods 
              
 */

package Chapter2;

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class Employee {
       String name;
       int age;
       double salary;// Monthly Salary
       
       public void outputDetails(){
           System.out.println("Name: " + name +", Age:" + age + ", Salary: " + salary);
       }
}
