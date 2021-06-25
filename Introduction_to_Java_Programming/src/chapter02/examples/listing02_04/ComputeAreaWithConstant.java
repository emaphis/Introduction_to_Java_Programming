/*
 * Listing 2.4
 * Constant example
 */
package chapter02.examples.listing02_04;

import java.util.Scanner;

/**
 * Constant example
 *
 * @author emaph
 */
public class ComputeAreaWithConstant {

    public static void main(String[] args) {
        final double PI = 3.14159;  // Declare a constant

        // create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * PI;

        // Display result
        System.out.println("The area for the circle of radius "
                + radius + " is " + area);
    }
}
