/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Two 
  Program Demonstration for : Exercise Page 26
 */

package Chapter2;

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class Date {
private String month;
    private int day;
    private int year;
     
     public void writeOutPut(){
          System.out.println("The Date is : " + getDay() +"/" + getMonth() + "/" + getYear());
     }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
