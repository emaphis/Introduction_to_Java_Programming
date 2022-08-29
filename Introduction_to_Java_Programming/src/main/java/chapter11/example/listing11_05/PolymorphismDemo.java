/*
 * Listing 11.5
 * 11.7 Polymorphism
 */
package chapter11.example.listing11_05;

import chapter11.example.examples.*;

/**
 * Demo polymorphism.
 * @author emaph
 */
public class PolymorphismDemo {
    /** Main method */
    public static void main(String[] args) {
        // Display circle and rectangle properties
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    /** Display geometric object properties */
    private static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                " Color is " + object.getColor());
    }
}

/*
Created on Mon Aug 29 11:51:50 EDT 2022 Color is red
Created on Mon Aug 29 11:51:50 EDT 2022 Color is black
*/
