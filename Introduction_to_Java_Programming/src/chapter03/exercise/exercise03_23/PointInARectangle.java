/*
 * Exercise 3.23
 *  (Geometry: point in a rectangle?) Write a program that prompts the user to enter
 *  a point (x, y) and checks whether the point is within the rectangle centered at
 *  (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
 *  (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
 *  rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
 *  vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
 *  cover all cases.)
 */
package chapter03.exercise.exercise03_23;

import java.util.Scanner;

/**
 * Check if a point is inside a given square.
 * @author emaph
 */
public class PointInARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with tow coordnates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // the square
        final double sx = 10;
        final double sy = 5;

        boolean inside = (Math.abs(x) <= sx / 2 && Math.abs(y) <= sy / 2);

        if (inside) {
            System.out.println("(" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("(" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
