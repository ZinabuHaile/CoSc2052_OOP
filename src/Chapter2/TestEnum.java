/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Chapter 2 
  Program Demonstration for : Enumaration in Java  
 */

package Chapter2;

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class TestEnum {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " means " + light.getAction());
        }
    }
}
