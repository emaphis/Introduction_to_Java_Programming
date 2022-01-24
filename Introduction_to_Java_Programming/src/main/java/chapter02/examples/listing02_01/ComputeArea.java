/*
 * Listing 2.1  ComputeArea.java.
 */
package chapter02.examples.listing02_01;

/**
 * Compute Area of Circle
 * @author emaph
 */
public class ComputeArea {
    public static void main(String[] args) {
        double radius;  // Declare radius.
        double area;    // Declare area;

        // Assign a radius
        radius = 20;

        // compute area
        area = radius * radius * 3.1459;

        // Display results
        System.out.println("The area for the circle of radius  " + radius + " is " + area);
    }

}
