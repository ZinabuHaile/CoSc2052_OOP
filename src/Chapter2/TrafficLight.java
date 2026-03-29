 /* 
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
public enum TrafficLight {
    RED("STOP"), 
    YELLOW("CAUTION"), 
    GREEN("GO");

    private String action;

    // Private constructor
    private TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
