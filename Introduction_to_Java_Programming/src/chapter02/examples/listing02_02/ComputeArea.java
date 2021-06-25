/*
 * Example from 2.2
 * Listing 2.1
 * Calculate area of Circle.
 */
package chapter02.examples.listing02_02;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class ComputeArea {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Step 2: Compute area
        double area = radius * radius * 3.14159;

        // Step 3 : Dispay the area
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }

}
