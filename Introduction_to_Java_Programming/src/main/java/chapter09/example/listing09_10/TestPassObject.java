/*
 * Listing 9.10
 *  9.10 Passing Objects to Methods
 */
package chapter09.example.listing09_10;

import chapter09.example.listing09_08.Circle;

/**
 * Passing objects as parameters
 * @author emaph
 */
public class TestPassObject {
    /** Main method */
    public static void main(String[] args) {
        // create a circle object with radious of 1
        Circle myCircle = new Circle(1);

        // Print areas for radius 1, 2, 3, 4, and 5
        int n = 5;
        printAreas(myCircle, n);

        /**  See myCircle.radius and times */
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    /** Print a table of areas for radius */
    public static void printAreas(Circle c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}

/*
Radius 		Area
1.0		3.141592653589793
2.0		12.566370614359172
3.0		28.274333882308138
4.0		50.26548245743669
5.0		78.53981633974483

Radius is 6.0
n is 5
*/
