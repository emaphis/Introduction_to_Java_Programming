/*
 * Listing 9.6
 * 9.7 Static Variables, Constants, and Methods
 */
package chapter09.example.listing09_06;


/**
 *
 * @author emaph
 */
public class Circle {
    /** The radius of the circle */
    double radius;

    /** The number of objects created */
    static int numberOfObjects = 0;

    /** Construct a circle with a radius of 1 */
    public Circle() {
        radius = 1;
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    public Circle(double newRadius) {
        this.radius = newRadius;
        numberOfObjects++;
    }

    /** Return number of objects */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return the perimeter of this circle */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Set a new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
