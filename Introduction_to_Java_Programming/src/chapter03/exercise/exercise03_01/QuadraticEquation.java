/*
 * Exercise 3.1
 *
 *  Algebra: solve quadratic equations) The two roots of a quadratic equation
 *  ax2 + bx + c = 0 can be obtained using the following formula:
 *    disc = b^2 - 4ac
 *    r1 = (-b + sqrt(disc)) / 2a
 *    r2 = (-b - sqrt(disc)) / 2a
 *  b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 *  equation has two real roots. If it is zero, the equation has one root. If it is nega-
 *  tive, the equation has no real roots.
 *  Write a program that prompts the user to enter values for a, b, and c and displays
 *  the result based on the discriminant. If the discriminant is positive, display two
 *  roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 *  has no real roots.”
 */
package chapter03.exercise.exercise03_01;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculate the discriminant
        double disc = (b * b) - (4 * a * c);

        // Calcuate the roots.
        if (disc < 0) {
            System.out.println("The equation has no real roots");
        }
        if (disc > 0) {
            double r1 = (-b + Math.pow(disc, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(disc, 0.5)) / (2 * a);
            System.out.println("The equation has tow roots: " + r1 + " and " + r2);
        }
        else if (disc == 0) {
            double r = (-b + Math.pow(disc, 0.5)) / (2 * a);
            System.out.println("The equation has one root: " + r);
        }

    }
}
