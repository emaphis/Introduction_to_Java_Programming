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
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Build a 2 by 2 linear equation
        double a = (y1 - y2);
        double b = (-x1 + x2);
        double c = (y3 - y4);
        double d = (-x3 + x4);
        double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
        double f = -y3 * (x3 - x4) + (y3 - y4) * x3;

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable())
            System.out.println("The intersecting point is at (" + eq.getX()
                                + ", " + eq.getY() + ")");
        else
            System.out.println("The lines are parallel");
    }
}

// 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
// (2.888888888888889, -1.1111111111111112)

// 2 2 7 6.0 4.0 2.0 -1.0 -2.0
// The lines are parallel
