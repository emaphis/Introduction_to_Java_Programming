/*
 * Exercise 4.2
 *  (Geometry: great circle distance) The great circle distance is the distance be-
 *  tween two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the
 *  geographical latitude and longitude of two points. The great circle distance be-
 *  tween the two points can be computed using the following formula:
 *
 *      d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 *
 *  Write a program that prompts the user to enter the latitude and longitude of two
 *  points on the earth in degrees and displays its great circle distance. The average
 *  radius of the earth is 6,371.01 km. Note you need to convert the degrees into
 *  radi ans using the Math.toRadians method since the Java trigonometric meth-
 *  ods use radians. The latitude and longitude degrees in the formula are for north
 *  and west. Use negative to indicate south and east degrees.
 */
package chapter04.exercise.exercise04_02;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read in coordinates
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double dx1 = input.nextDouble();
        double dy1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double dx2 = input.nextDouble();
        double dy2 = input.nextDouble();

        // Convert degrees to radians for sin functions
        double x1 = Math.toRadians(dx1);
        double y1 = Math.toRadians(dy1);
        double x2 = Math.toRadians(dx2);
        double y2 = Math.toRadians(dy2);

        final double RADIUS = 6371.01;

        double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2)
                + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between the two points is "
            + distance + " km");
    }
}
