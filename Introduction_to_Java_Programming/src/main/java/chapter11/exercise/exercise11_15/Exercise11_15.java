/*
 * Exercise 11.15
 *  (Area of a convex polygon) A polygon is convex if it contains any line segments
 *  that connects two points of the polygon. Write a program that prompts the user
 *  to enter the number of points in a convex polygon, enter the points clockwise,
 *  then displays the area of the polygon. For the formula for computing the area of
 *  a polygon, see http://www.mathwords.com/a/area_convex_polygon.htm
 */
package chapter11.exercise.exercise11_15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Area of a convex polygon
 * @author emaph
 */
public class Exercise11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int num = input.nextInt();

        System.out.println("Enter the coordinates of the points: ");

        /** ArrayList of Pairs of doubles.  Pair represents a point */
        ArrayList<double[]> points = getPoints(input, num);
        input.close();

        double area = getPolygonArea(points);
        System.out.println("The total areais " + area);
    }

    private static ArrayList<double[]> getPoints(Scanner input, int num) {
        ArrayList<double[]> points = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            double[] point = new double[2];
            point[0] = input.nextDouble();
            point[1] = input.nextDouble();
            points.add(point);
        }
        return points;
    }

    /**
     * Find the area of a convex polygon
     * <p>
     * see: <https://www.mathwords.com/a/area_convex_polygon.htm>
     * <p>
     * area = s1/2 * [(x1y2 + x2y3 + x3y4 + ... + xny1) - (y1x2 + y2x3 + y3x4 + ... + ynx1)]
     */
    private static double getPolygonArea(ArrayList<double[]> points) {
        double[] firstPoint = points.get(0);
        double[] lastPoint = points.get(points.size() - 1);
        final int X = 0;
        final int Y = 1;

        double accum1 = lastPoint[X] * firstPoint[Y];
        for (int i = 0; i < points.size() - 1; i++) {
            double[] point1 = points.get(i);
            double[] point2 = points.get(i + 1);
            accum1 += point1[X] * point2[Y];
        }

        double accum2 = lastPoint[Y] * firstPoint[X];
        for (int i = 0; i < points.size() - 1; i++) {
            double[] point1 = points.get(i);
            double[] point2 = points.get(i + 1);
            accum2 += point1[Y] * point2[X];
        }

        double area = Math.abs((accum1 - accum2) / 2);
        return area;
    }
}

/*
Enter the number of points: 7
Enter the coordinates of the points:
-12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -5.5
The total areais 244.575
*/
