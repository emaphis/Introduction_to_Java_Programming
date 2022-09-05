/*
 * Listing 12.7
 * 12.4 Declaring, Throwing, and Catching Exceptions
 */
package chapter12.example.listing12_07;

/**
 * Circle with Exception
 * @author emaph
 */
public class CircleWithException {
    /** The radius of the circle */
    private double radius;

    /** The number of objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with a radius 1 */
    public CircleWithException() {
        this(1.0);
        numberOfObjects++;
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

    /**
     * Set a new radius for this circle
     * <b>
     * Throws exception if new radius is negative
     */
    public void setRadius(double newRadius)
        throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }


    /** Return number of objects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
