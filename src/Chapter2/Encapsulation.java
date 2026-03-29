/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : One
  Program Demonstration for : 
 */

package Chapter2;

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class Encapsulation {

       String name;
       private int age;
       double salary;// Monthly Salary
       
       public void outputDetails(){
           System.out.println("Name: " + name +", Age:" + age + ", Salary: " + salary);
       }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
       
       
}


