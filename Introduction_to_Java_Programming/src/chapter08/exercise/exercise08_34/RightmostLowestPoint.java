/*
 * Exercise 8.34
 *  (Geometry: rightmost lowest point) In computational geometry, often you need
 *  to find the rightmost lowest point in a set of points. Write the following method
 *  that returns the rightmost lowest point in a set of points:
 *
 *      public static double[] getRightmostLowestPoint(double[][] points)
 *
 *  Write a test program that prompts the user to enter the coordinates of six points
 *  and displays the rightmost lowest point
 */
package chapter08.exercise.exercise08_34;

import java.util.Scanner;

/**
 * Rightmost lowest point
 * @author emaph
 */
public class RightmostLowestPoint {
    public static void main(String[] args) {
        final int SIZE = 6;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 6 points: ");
        double[][] points = getPoints(SIZE, input);
        double[] rightmost = getRightmostLowestPoint(points);
        System.out.println("The rightmost point is (" + rightmost[0] + ", " + rightmost[1] + ")");
    }

    /** find the minimum of both x and y coordinates */
    public static double[] getRightmostLowestPoint(double[][] points) {
        double max = points[0][0] - points[0][1];
        double x = 0, y = 0;
        for (int i = 1; i < points.length; i++) {
            double sum = points[i][0] - points[i][1];
            System.out.print(sum + ", ");
            if (sum > max) {
                max = sum;
                x = points[i][0];
                y = points[i][1];
            }
        }
        return new double[] { x, y };
    }

    private static double[][] getPoints(int size, Scanner input) {
        double[][] points = new double[size][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        return points;
    }

}

//  1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
// (6.5, −7.0)
