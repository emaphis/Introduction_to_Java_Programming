/*
 * Listing 9.8
 * 9.9 Data Field Encapsulation
 */
package chapter09.example.listing09_08;


/**
 * Circle with encapsulation.
 * @author emaph
 */
public class Circle {
    /** The radius of the circle */
    private double radius = 1;

    /** The number of objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with a radius 1 */
    public Circle() {
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    public Circle(double newRadius) {
        this.radius = newRadius;
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
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

}
