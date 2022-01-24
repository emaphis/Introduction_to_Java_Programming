/*
 * Exercise 8.32
 *  (Geometry: area of a triangle) Write a method that returns the area of a triangle
 *  using the following header:
 *
 *      public static double getTriangleArea(double[][] points)
 *
 *  The points are stored in a 3-by-2 two-dimensional array points with points
 *  [0][0] and points[0][1] for (x1, y1). The triangle area can be computed
 *  using the formula in Programming Exercise 2.19. The method returns 0 if the
 *  three points are on the same line. Write a program that prompts the user to enter
 *  three points of a triangle and displays the triangle’s area.
 *
 *      side = sqrt( sq(x2-x1) + sq(y2-y1))
 *      s = (side1 + side2 + side3)/2;
 *      area =  sqrt (sqr(s - side1)(s - side2)(s - side3))
*/
package chapter08.exercise.exercise08_32;

import java.util.Scanner;

/**
 * Calculate the area of an irregular triangle
 * @author emaph
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 y1 x2 y2 x3 y3: ");
        double [][] points = get3Points(input);
        double area = getTriangleArea(points);

        if (area != 0)
            System.out.println("The area of the triangle is " + area);
        else
            System.out.println("The three points are on the same line");
    }

    public static double getTriangleArea(double[][] points) {
        if (sameLine(points[0], points[1], points[2]))
            return 0;

        double side1 = getSide(points[1], points[0]);
        double side2 = getSide(points[2], points[1]);
        double side3 = getSide(points[0], points[2]);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    public static double getSide(double[] point1, double[] point2) {
        int x = 0, y = 1;
        return Math.sqrt(Math.pow(point2[x] - point1[x], 2) +
                         Math.pow(point2[y] - point1[y], 2));
    }

    public static boolean sameLine(double[] point0, double[] point1, double point2[]) {
	int x = 0, y = 1;
        double ret = (point1[x] - point0[x]) * (point2[y] - point0[y]) -
	             (point2[x] - point0[x]) * (point1[y] - point0[y]);
        return ret == 0.0;
    }

    public static double[][] get3Points(Scanner input) {
        int x = 0, y = 1;
        double[][] points = new double[3][2];  // three pairs.

        for (int i = 0; i < 3; i++) {
            points[i][x] = input.nextDouble();
            points[i][y] = input.nextDouble();
        }
        return points;
    }
}

// 2.5 2 5 -1.0 4.0 2.0
// 2.25

// 2 2 4.5 4.5 6 6
// same line