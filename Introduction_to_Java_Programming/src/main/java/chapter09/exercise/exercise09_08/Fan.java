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
   public static final int SLOW = 1;
   public static final int MEDIUM = 2;
   public static final int FAST = 3;

   private int speed;
   private boolean on;
   private double radius;
   private String color;

   public Fan() {
       speed = SLOW;
       on = false;
       radius = 5;
       color = "blue";
   }

   public void setSpeed(int newSpeed) {
       speed = newSpeed;
   }

   public String getSpeed() {
       switch (speed) {
           case SLOW:
               return "Slow";
           case MEDIUM:
               return "Medium";
           case FAST:
               return "Fast";
           default:
               return "Unkown";
       }
   }

   public boolean isOn() {
       return on;
   }

   public void setOn(boolean isOn) {
       on = isOn;
   }

   public void setRadius(double newRadius) {
       radius = newRadius;
   }

   public double getRadius() {
       return radius;
   }

   public void setColor(String newColor) {
       color = newColor;
   }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (isOn())
            return "speed= " + getSpeed() + ", color= " + getColor() + ", radius= " + getRadius();
        else
            return "color= " + getColor() + ", radius= " + getRadius()  + ", fan is off";
    }
}
