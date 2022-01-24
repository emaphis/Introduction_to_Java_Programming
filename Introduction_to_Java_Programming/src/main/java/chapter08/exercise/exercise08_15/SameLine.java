/*
 * Exercise 8.15
 *  (Geometry: same line?) Programming Exercise 6.39 gives a method for testing
 *  whether three points are on the same line.
 *
 *  Write the following method to test whether all the points in the array points are
 *  on the same line:
 *
 *      public static boolean sameLine(double[][] points)
 *
 *  Write a program that prompts the user to enter five points and displays whether
 *  they are on the same line
 */
package chapter08.exercise.exercise08_15;

import java.util.Scanner;

/**
 * same line?
 * @author emaph
 */
public class SameLine {
    final static double EPSILON = 0.00001;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPoints = 5;

        System.out.print("Enter five points: ");
        double[][] points = getPoints(numPoints, input);
        if (sameLine(points))
            System.out.println("The five points are on the same line");
        else
            System.out.println("The five points are not on the same line");
    }


    // points are represented as two element double arrays -- double[2]

    public static boolean sameLine(double[][] points) {
        boolean linear = true;
        for (int i = 0; i < points.length - 2; i++) {
            linear = linear && Math.abs(findPos(points[0], points[1], points[2])) < EPSILON;
        }
        return linear;
    }


    /** find the position of point */
    public static double findPos(double[] p0, double[] p1, double[] p2) {
        double x0 = p0[0], y0 = p0[1];
        double x1 = p1[0], y1 = p1[1];
        double x2 = p2[0], y2 = p2[1];
        return (x1 - x0) * (y2 - y0 ) - (x2 - x0 ) * (y1 - y0) ;
    }


    private static double[][] getPoints(int numPoints, Scanner input) {
        double[][] points = new double[numPoints][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        return points;
    }
}

// 3.4 2 6.5 9.5 2.3 2.3 5.5 5 -5 4
// not

// 1 1 2 2 3 3 4 4 5 5
// yes
