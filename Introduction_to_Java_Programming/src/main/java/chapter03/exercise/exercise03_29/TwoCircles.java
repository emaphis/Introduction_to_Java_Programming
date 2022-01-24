/*
 * Exercise 3.29
 *  (Geometry: two circles) Write a program that prompts the user to enter the center
 *  coordinates and radii of two circles and determines whether the second circle
 *  is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: cir-
 *  cle2 is inside circle1 if the distance between the two centers 6 = r1 − r2
 *  and circle2 overlaps circle1 if the distance between the two centers 6 =
 *  r1 + r2. Test your program to cover all cases.)
 */
package chapter03.exercise.exercise03_29;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class TwoCircles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        // calculate distiance between two centers
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // compare geometries
        if (dist <= Math.abs(r1 - r2)) {
            System.out.println("circle2 is inside circle1");
        } else if (dist > r1 + r2) {
            System.out.println("circle2 does not overlap circle1");
        } else {
            System.out.println("circle2 overlaps circle1");
        }
    }
}
