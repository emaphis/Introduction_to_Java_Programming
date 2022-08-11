/*
 * Exercise 9.8
 * Fan class
 */
package chapter09.exercise.exercise09_08;

/**
 * Fan class
 * @author emaph
 */
public class Fan {
    /** Constants that represent Fan speeds */
   public static final int SLOW = 1;
   public static final int MEDIUM = 2;
   public static final int FAST = 3;

   private int speed;
   private boolean on;
   private double radius;
   private String color;

   /** Create default Fan */
   public Fan() {
       speed = SLOW;
       on = false;
       radius = 5;
       color = "blue";
   }

   /** set Fan speed */
   public void setSpeed(int newSpeed) {
       speed = newSpeed;
   }

   /** get Fan speed */
   public int getSpeed() {
        return speed;
   }

   /** return Fan turned on status */
   public boolean isOn() {
       return on;
   }

   /** turn Fan on or off  */
   public void setOn(boolean isOn) {
       on = isOn;
   }

   /** set Fan radius */
   public void setRadius(double newRadius) {
       radius = newRadius;
   }

   /** get Fan radius */
   public double getRadius() {
       return radius;
   }

   /** set fan color */
   public void setColor(String newColor) {
       color = newColor;
   }

   /** get Fan color */
    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        String out =
                "speed " + speed +
                "\ncolor " + color +
                "\nradius " + radius;
        if (isOn())
            out += "\nfan is on\n";
        else
            out += "\nfan is off\n";
        return out;
    }

}
