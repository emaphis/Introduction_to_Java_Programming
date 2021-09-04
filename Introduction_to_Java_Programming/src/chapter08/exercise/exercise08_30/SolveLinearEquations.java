/*
 * Exercise 8.30
 *  Algebra: solve linear equations) Write a method that solves the following 2 * 2
 *  system of linear equations:
 *
 *      a00x + a01y = b0        b0 * a11  - b1 * a0           b1 * a00 - b0 * a10
 *                          x = --------------------   y =  --------------------
 *      a10x + a11y = b1        a00 * a11 - a01 * a10       a00 * a11 - a01 * a10
 *
 *  The method header is:
 *
 *      public static double[] linearEquation(double[][] a, double[] b)
 *
 *  The method returns null if a00 * a11 - a01 * a10 is 0. Write a test program that
 *  prompts the user to enter a00, a01, a10, a11, b0, and b1 and displays the result. If
 *  a00 * a11 - a01 * a10 is 0, report that “The equation has no solution.” A sample run is
 *  similar to Programming Exercise 3.3.
 */
package chapter08.exercise.exercise08_30;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class SolveLinearEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a00, a01, a10, a11");
        double a[][] = getArrayA(input);
        System.out.println("Enter b0, b1");
        double b[] = getArrayB(input);

        double[] out = linearEquation(a, b);

        if (out != null)
            System.out.println("x is " + out[0] + " y is " + out[1]);
        else
            System.out.println("The equation has no solution.");

    }

    public static double[] linearEquation(double[][] a, double[] b)  {
        double desc = (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
        if (desc == 0.0)
            return null;

        double[] solution = new double[2];
        solution[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / desc;
        solution[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / desc;
        return solution;
    }

    private static double[][] getArrayA(Scanner input) {
        double[][] out = new double[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                out[i][j] = input.nextDouble();
        return out;
    }

    private static double[] getArrayB(Scanner input) {
        double[] out = new double[2];
        out[0] = input.nextDouble();
        out[1] = input.nextDouble();
        return out;
    }

}

// test data:
// 9.0 4.0 3.0 -5.0
// -6.0 -21.0
// solution x = -2.0 and y = 3.0

// 1.0 2.0 2.0 4.0
// 4.0 5.0
// no soluion