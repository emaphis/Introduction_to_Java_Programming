/*
 * Listing 9.1
 *  9.3 Example: Defining Classes and Creating Objects
 */
package chapter09.example.listing09_01;

/**
 * This Circle class
 * @author emaph
 */
//.Define the circle class wtih two constructors
class Circle {
    double radius = 1;

    /** Construct a circle with a radius */
    public Circle() {
    }

    /** Construct a circle with a specified radius */
    public Circle(double newRadius) {
        this.radius = newRadius;
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