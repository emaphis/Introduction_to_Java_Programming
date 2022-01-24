/*
 * Listing 9.1
 *  9.3 Example: Defining Classes and Creating Objects
 */
package chapter09.example.listing09_01;

/**
 *
 * @author emaph
 */
public class TestCircle {
    /** Main method */
    public static void main(String[] args) {
        // Create a circle with radius of 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius "
            + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius of 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius "
            + circle2.radius + " is " + circle2.getArea());

        // Create a circle of radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius "
            + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.setRadius(100);
        System.out.println("The area of the circle of radius "
            + circle2.radius + " is " + circle2.getArea());
    }

}


//.Define the circle class wtih two constructors
class Circle {
    double radius;

    /** Construct a circle with a radius */
    public Circle() {
        radius = 1;
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