/*
 * Exercise 3.22
 *  (Geometry: point in a circle?) Write a program that prompts the user to enter a
 *  point (x, y) and checks whether the point is within the circle centered at (0, 0)
 *  with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 *  circle, as shown in Figure 3.7a.
 *
 *  (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 *  he formula for computing the distance is  sqrt((x2 - x1)^2 + (y2 - y1)^2)
 *  Test your program to cover all cases.)
 */
package chapter03.exercise.exercise03_22;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class PointInACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance =  Math.pow(Math.pow(x2 - 0, 2) + Math.pow(y2 - 0, 2), 0.5);

        if (distance <= 10) {
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
        } else {
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
        }
    }
}
