/*
 * Exercise 9.11
 *  (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 *  2 * 2 system of linear equations:
 *
 *      ax + by = e   x = ed - bf  y = af - ec
 *	cx + dy = f       ad - bc      ad - bc
 *
 *  The class contains:
 *  ■ Private data fields a, b, c, d, e, and f.
 *  ■ A constructor with the arguments for a, b, c, d, e, and f.
 *  ■ Six getter methods for a, b, c, d, e, and f.
 *  ■ A method named isSolvable() that returns true if ad - bc is not 0.
 *  ■ Methods getX() and getY() that return the solution for the equation.
 *
 *  Draw the UML diagram for the class then implement the class. Write a test pro-
 *  gram that prompts the user to enter a, b, c, d, e, and f and displays the result.
 *  If ad - bc is 0, report that “The equation has no solution.” See Programming
 *  Exercise 3.3 for sample runs.
 */
package chapter09.exercise.exercise09_11;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable()) {
            double x = eq.getX();
            double y = eq.getY();
            System.out.println("x is " + x + " y is " + y);
        }
        else
            System.out.println("The equation has no solution.");
    }
}

// 9.0 4.0 3.0 -5.0 -6.0 -21.0
// x is -2.0 y is 3.0

// 1.0 2.0 2.0 4.0 4.0 5.0
// The equation has no solution.
