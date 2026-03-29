package Chapter2;

/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Chapter 2
  Program Demonstration for :  Exercise Page 26
 */

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class TestDate {
    public static void main(String[] args) {
        Date obj=new Date();
        obj.setDay(12);
        obj.setMonth("March");
        obj.setYear(2026);
        
        
        obj.writeOutPut();
        
        
    }
}
