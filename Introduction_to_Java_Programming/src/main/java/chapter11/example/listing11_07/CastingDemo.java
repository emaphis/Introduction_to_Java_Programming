/*
 * Listing 11.7
 * 11.9 Casting Objects and the instanceof Operator
 */
package chapter11.example.listing11_07;

import chapter11.example.examples.*;

/**
 *
 * @author emaph
 */
public class CastingDemo {
    /** Main method */
    public static void main(String[] args) {
        // Create and intialize two objects.
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }

    /** A method for displaying an object */
    private static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is " +
                    ((Circle)object).getArea());
            System.out.println("The circle diameter is " +
                    ((Circle)object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " +
                    ((Rectangle)object).getArea());
        }
    }
}

/*
The circle area is 3.141592653589793
The circle diameter is 2.0
The rectangle area is 1.0
*/