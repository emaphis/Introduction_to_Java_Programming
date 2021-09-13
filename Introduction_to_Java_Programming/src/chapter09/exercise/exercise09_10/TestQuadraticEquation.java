/*
 * Exercist 9.10
 *  (Algebra: quadratic equations) Design a class named QuadraticEquation for
 *  a quadratic equation ax2 + bx + c = 0. The class contains:
 *
 *  ■ Private data fields a, b, and c that represent three coefficients.
 *  ■ A constructor with the arguments for a, b, and c.
 *  ■ Three getter methods for a, b, and c.
 *  ■ A method named getDiscriminant() that returns the discriminant, which is
 *
 *      disc = (b * b) - (4 * a * c);
 *
 *  ■ The methods named getRoot1() and getRoot2() for returning two roots
 *    of the equations
 *
 *      r1 = (-b + Math.pow(disc, 0.5)) / (2 * a);
 *      r2 = (-b - Math.pow(disc, 0.5)) / (2 * a);
 *
 *  These methods are useful only if the discriminant is nonnegative. Let these methods
 *  return 0 if the discriminant is negative.
 *
 *  Draw the UML diagram for the class then implement the class. Write a test pro-
 *  gram that prompts the user to enter values for a, b, and c and displays the result
 *  based on the discriminant. If the discriminant is positive, display the two roots. If
 *  the discriminant is 0, display the one root. Otherwise, display “The equation has
 *  no roots.” See Programming Exercise 3.1 for sample runs.
 */
package chapter09.exercise.exercise09_10;

import java.util.Scanner;

/**
 * Quadratic equation test
 * @author emaph
 */
public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation qeq = new QuadraticEquation(a, b, c);

        double disc = qeq.getDiscriminant();
        if (disc < 0) {
            System.out.println("The equation has no real roots");
        }
        else if (disc > 0) {
            double r1 = qeq.getRoot1();
            double r2 = qeq.getRoot2();
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        }
        else if (disc == 0) {
            double r = qeq.getRoot1();
            System.out.println("The equation has one root: " + r);
        }
    }
}
