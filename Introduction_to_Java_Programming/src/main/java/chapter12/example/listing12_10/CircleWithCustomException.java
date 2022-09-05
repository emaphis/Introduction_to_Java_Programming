/*
 * Listing 12.11
 * 12.9 Defining Custom Exception Classes
 */
package chapter12.example.listing12_10;


/**
 * Circle with Exception
 * @author emaph
 */
public class CircleWithCustomException {
    /** The radius of the circle */
    private double radius;

    /** The number of objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with a radius 1 */
    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    public CircleWithCustomException(double newRadius)
            throws InvalidRadiusException {
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
     * Throws custom exception if new radius is negative
     */
    public void setRadius(double newRadius)
        throws InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
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
