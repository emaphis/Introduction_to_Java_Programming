/*
 * Listing 12.7
 * 12.4 Declaring, Throwing, and Catching Exceptions
 * Catching exceptions thrown by libraries.
 */
package chapter12.example.listing12_07;

/**
 * Declaring, Throwing, and Catching Exceptions
 * @author emaph
 */
public class CircleWithException {
    /** The radius fo the circle */
    private double radius;

    /** The number of objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with a radius 1.0 */
    public CircleWithException() {
        this(1.0);
    }

    /** Construct a circle with a specified radius */
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

     /** Set a new radius */
    public final void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    /** Return numberOfObjects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }


    public double findArea() {
        return radius * radius * 3.14159;
    }
}
