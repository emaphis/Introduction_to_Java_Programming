/*
 * Exercise 7.25
 *  (Algebra: solve quadratic equations) Write a method for solving a quadratic equa-
 *  tion using the following header:
 *
 *      public static int solveQuadratic(double[] eqn, double[] roots)
 *
 *  The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array
 *  eqn and the real roots are stored in roots. The method returns the number of real
 *  roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
 *
 *  Write a program that prompts the user to enter values for a, b, and c and displays
 *  the number of real roots and all real roots.
 */
package chapter07.exercise.exercise07_25;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class QuadraticEquations {
    static final int A = 0;
    static final int B = 1;
    static final int C = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];

        System.out.print("Enter the equations coefficients ");
        eqn[A] = input.nextDouble();
        eqn[B] = input.nextDouble();
        eqn[C] = input.nextDouble();

        int numberOfRoots = solveQuadratic(eqn, roots);

        // Display output
        switch (numberOfRoots) {
            case 0:
                System.out.println("The equation has no real roots");
                break;
            case 1:
                System.out.println("The equation has one root: " + roots[0]);
                break;
            case 2:
                System.out.println("The equation has two roots: " + roots[0]
                        + " and " + roots[1]);
                break;
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        int count = 0;

        // Calculate the discriminant
        double disc = (eqn[B] * eqn[B]) - (4 * eqn[A] * eqn[C]);

        // Calcuate the roots.
        if (disc < 0) {
            count = 0;
        } else if (disc > 0) {
            count = 2;
            roots[0] = (-eqn[B] + Math.pow(disc, 0.5)) / (2 * eqn[A]);
            roots[1] = (-eqn[B] - Math.pow(disc, 0.5)) / (2 * eqn[A]);
        }
        else if (disc == 0) {
            count = 1;
            roots[0] = (-eqn[B] + Math.pow(disc, 0.5)) / (2 * eqn[A]);
        }

        return count;
    }
}
