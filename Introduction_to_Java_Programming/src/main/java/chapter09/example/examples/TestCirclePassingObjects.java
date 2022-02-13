/*
 *  Section 9.10  Passing Objects to Methods
 */
package chapter09.example.examples;

import chapter09.example.listing09_08.Circle;

/**
 *
 * @author emaph
 */
public class TestCirclePassingObjects {

    public static void main(String[] args) {
        // Circle defined in Listing 9.8
        Circle myCircle = new Circle(5.0);
        printCircle(myCircle);
    }

    public static void printCircle(Circle c) {
        System.out.println("The area of the circle of radius "
                + c.getRadius() + " is " + c.getArea());
    }
}

/*
The area of the circle of radius 5.0 is 78.53981633974483
 */
