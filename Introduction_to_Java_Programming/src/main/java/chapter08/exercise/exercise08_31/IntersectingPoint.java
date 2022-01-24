/*
 * Exercise 8.31
 *  (Geometry: intersecting point) Write a method that returns the intersecting point of
 *  two lines. The intersecting point of the two lines can be found by using the formula
 *  given in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
 *  two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is:

 *      public static double[] getIntersectingPoint(double[][] points)
 *
 *  The points are stored in a 4-by-2 two-dimensional array points with (points
 *  [0][0], points[0][1]) for (x1, y1). The method returns the intersecting point
 *  or null if the two lines are parallel. Write a program that prompts the user to enter
 *  four points and displays the intersecting point. See Programming Exercise 3.25
 *  for a sample run.
 */
package chapter08.exercise.exercise08_31;

import java.util.Scanner;

/**
 * Intersecting point
 * @author emaph
 */
public class IntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = getArray(4, input);

        double[] point = getIntersectingPoint(points);
        if (point != null)
            System.out.println("The intersecting point is at (" + point[0]
                                + ", " + point[1] + ")");
        else
            System.out.println("The lines are parallel");
    }

    public static double[] getIntersectingPoint(double[][] points) {
        int x = 0, y = 1;
        double a = points[0][y] - points[1][y];
        double b = points[0][x] - points[1][x];
        double c = points[2][y] - points[3][y];
        double d = points[2][x] - points[3][x];
        double e = (a * points[0][x]) - (b * points[0][y]);
        double f = (c * points[2][x]) - (d * points[2][y]);
        double deter = (a * d) - (b * c);

        if (deter == 0.0) return null;
        else {
            double[] point = new double[2];
            point[0] = (e * d - b * f) / deter;
            point[1] = -((a * f) - (e * c)) / deter;
            return point;
        }
    }

    private static double[][] getArray(int size, Scanner input) {
        double[][] array = new double[size][2];
        for (int i = 0; i < size; i++) {
            array[i][0] = input.nextDouble();
            array[i][1] = input.nextDouble();
        }
        return array;
    }
}

// test run: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
// produces: 2.88889, 1.1111

// test run: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
// parallel