/*
 * Exercise 4.7
 *  (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 *  at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
 *  the user to enter the radius of the bounding circle of a pentagon and displays the
 *  coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
 *  console format to display two digits after the decimal point.
 */
package chapter04.exercise.exercise04_07;

import java.util.Scanner;

/* Formulat for sides given radius from Exercise 4.1
 *   side = 2 * r * tan(PI / 5);
*/

/**
 * Point coordinates for a given pentagon.
 * @author emaph
 */
public class CornerPointCoordinates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        // Calculate angle of inscribed angles in radians;
        double angle = Math.toRadians(360.0 / 5);

        // Decrement the angles and compute the coordinates for the five vetices
        // of the pentagram..
        // Note: this would be much simpler with methods and loops
        double angle1 = angle;
        double x1 = radius * Math.sin(angle1);
        double y1 = radius * Math.cos(angle1);

        double angle2 = angle1 - angle;
        double x2 = radius * Math.sin(angle2);
        double y2 = radius * Math.cos(angle2);

        double angle3 = angle2 - angle;
        double x3 = radius * Math.sin(angle3);
        double y3 = radius * Math.cos(angle3);

        double angle4 = angle3 - angle;
        double x4 = radius * Math.sin(angle4);
        double y4 = radius * Math.cos(angle4);

        double angle5 = angle4 - angle;
        double x5 = radius * Math.sin(angle5);
        double y5 = radius * Math.cos(angle5);

        // Print the angles
        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%5.2f, %5.2f)\n", x1, y1);
        System.out.printf("(%5.2f, %5.2f)\n", x2, y2);
        System.out.printf("(%5.2f, %5.2f)\n", x3, y3);
        System.out.printf("(%5.2f, %5.2f)\n", x4, y4);
        System.out.printf("(%5.2f, %5.2f)\n", x5, y5);
    }
}
