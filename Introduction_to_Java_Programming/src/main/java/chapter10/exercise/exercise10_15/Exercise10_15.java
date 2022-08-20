/*
 * Exercise 10.15
 *  (Geometry: the bounding rectangle) A bounding rectangle is the minimum rect￾angle that encloses a set of points in a two-dimensional plane, as shown in
 *   Figure 10.24d. Write a method that returns a bounding rectangle for a set of
 *   points in a two-dimensional plane, as follows:
 *
 *   public static MyRectangle2D getRectangle(double[][] points)
 *
 *   The Rectangle2D class is defined in Programming Exercise 10.13. Write a test
 *   program that prompts the user to enter five points and displays the bounding
 *   rectangle’s center, width, and height.
 */
package chapter10.exercise.exercise10_15;

import chapter10.exercise.exercise10_13.MyRectangle2D;
import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class Exercise10_15 {
    // Global constants to index the points array.
    final static int X = 0, Y = 1;

    public static void main(String[] args) {
        // get 5 points.
        double[][] points = getPoints(5);

        // Calculate bounding rectangle
        MyRectangle2D rect = getRectangle(points);

        displayRectangle(rect);
    }

    private static double[][] getPoints(int size) {
        double[][] points = new double[size][2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        for (int i = 0; i < 5; i++) {
            points[i][X] = input.nextDouble();
            points[i][Y] = input.nextDouble();
        }
        return points;
    }

    /** returns a bounding rectangle for a set of
     *  points in a two-dimensional plane */
    private static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][X];
        double minY = points[0][Y];
        double maxX = points[0][X];
        double maxY = points[0][Y];

        for (int i = 0; i < points.length; i++) {
            double x = points[i][X];
            double y = points[i][Y];

            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        double height = maxY - minY;
        double width = maxX - minX;
        double x = minX + width / 2.0;
        double y = minY + height / 2.0;

        return new MyRectangle2D(x, y, width, height);
    }

    private static void displayRectangle(MyRectangle2D rect) {
        System.out.printf("The bounding rectangle's center (%s, %s), width %s, height %s",
                rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
    }
}

/*
Enter five points:  1.0 2.5 3 4 5 6 7 8 9 10
The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5
*/
