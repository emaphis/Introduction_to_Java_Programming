/*
 * Exercise 9.12
 *  (Geometry: intersecting point) Suppose two line segments intersect. The two end-
 *  points for the first line segment are (x1, y1) and (x2, y2) and for the second line
 *  segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 *  these four endpoints and displays the intersecting point. As discussed in Program-
 *  ming Exercise 3.25, the intersecting point can be found by solving a linear equa-
 *  tion. Use the LinearEquation class in Programming Exercise 9.11 to solve this
 *  equation. See Programming Exercise 3.25 for sample run
 */
package chapter09.exercise.exercise09_12;

import chapter09.exercise.exercise09_11.LinearEquation;
import java.util.Scanner;

/**
 * intersecting point
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

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (!eq.isSolvable()) return null;
        else {
            double[] point = new double[2];
            point[0] = eq.getX();
            point[1] = eq.getY();
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

// 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
// (2.888888888888889, -1.1111111111111112)

// 2 2 7 6.0 4.0 2.0 -1.0 -2.0
// The lines are parallel
