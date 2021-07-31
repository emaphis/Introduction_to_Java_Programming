/*
 * Exercise 3.34
 *  (Geometry: point on line segment) Exercise 3.32 shows how to test whether a
 *  point is on an unbounded line. Revise Exercise 3.32 to test whether a point is on
 *  a line segment. Write a program that prompts the user to enter the three points for
 *  p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1.
 */
package chapter03.exercise.exercise03_34;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class PointOnALineSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // check if point is on line segment
        boolean segment =
                !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0
                || ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0
                || (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));

        if (segment) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from ("
                    + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from ("
                    + x0 + ", " + y0 + ") t0 (" + x1 + ", " + y1 + ")");
        }
    }
}
