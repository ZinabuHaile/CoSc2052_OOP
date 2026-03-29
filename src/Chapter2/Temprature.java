package Chapter2;

/*
 * 
  Academic Year : 2025-26
  Course name   : Object Oriented Programming 
  Course Code   : CoSc2052
  Chapter       : Two 
  Program Demonstration for : Exercise Page 61-62 
 */

/**
 *
 * @author Zinabu H. zinabuscholar@gmail.com
 */
public class Temprature {
    private double value;
    private char scale;

    public Temprature() {
     value=0.0;
     scale='C';
    }
    public Temprature(double value){
      this.value=value;
      this.scale='C';
    }
    public Temprature(char scale){
      this.value=0.0;
      this.scale=scale;
    }
    public Temprature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
    
    public double getTempCelsius(){
        if(scale=='C')
            return value;
        else
            return 5*(this.value - 32)/9.0;
    }
    
    public double getTempFahrenheit(){
        if(scale=='F')
            return value;
        else
             return 9*(this.value/5.0) + 32;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setValue(double value) {
        this.value = value;
    }
   public void setValueScale(char scale, double value){
        this.scale=scale;
        this.value=value;
    }
    
    
}
