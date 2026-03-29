
import java.util.Scanner;

/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : One
  Program Demonstration for : Page 48 Exercise
        Write a method that takes as input an array of integers 
        and returns the average of the values in the array. 

 */

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class ArrayToMethod {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=kb.nextInt();
        
        int[] arr=new int[size];
       
        for(int i=0;i<arr.length;i++)
            arr[i]=kb.nextInt();
           
        System.out.println("The Average of the elements:"+arrayAverage(arr));
    }
    
    public static int arrayAverage(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        
        return sum/a.length;
    }
}
