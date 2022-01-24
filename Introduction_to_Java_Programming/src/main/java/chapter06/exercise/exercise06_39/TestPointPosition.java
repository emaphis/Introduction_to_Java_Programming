/*
 * Exercise 6.39
 */
package chapter06.exercise.exercise06_39;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class TestPointPosition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();


        System.out.print("(" + x2 + ", " + y2 + ") is on the ");
        // Output the position
        if (PointPositiom.onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.print("line segment");
        }
        else if (PointPositiom.leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("left side of the line");
        }
        else if (PointPositiom.onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.print("same line");
        }
        else if (PointPositiom.rightOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("right side of the line");
        }
        System.out.println(" from " + "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
}
