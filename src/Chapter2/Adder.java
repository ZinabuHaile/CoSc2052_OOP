/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : One
  Program Demonstration for :  Page 48 Exercise
   Write a method that takes as input an integer value and returns 
   the sum of all integers less than that value. For example,
   if the input is 6, the output is 5+4+3+2+1 = 15. 
   If the input is negative, the output should be -1.

 */

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class Adder {
    public static void main(String[] args) {
        System.out.println("The Sum is : "+sum(6));
    }
    
    public static int sum(int n){
        int s=0;
        if(n<0)
            return -1;
        
        for(int i=n-1;i>0;i--)
            s+=i;
        return s;
    }
    
}