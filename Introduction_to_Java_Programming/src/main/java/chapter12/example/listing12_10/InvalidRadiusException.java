/*
 * Listing 12.10
 * 12.9 Defining Custom Exception Classes
 * You can define a custom exception class by extending the java.lang.Exception class
 */
package chapter12.example.listing12_10;

/**
 * Defining Custom Exception Classes
 * @author emaph
 */
public class InvalidRadiusException extends Exception {
    private double radius;

    /** Construct an exception */
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    /** Return the radius */
    public double getRadius() {
        return radius;
    }
}
