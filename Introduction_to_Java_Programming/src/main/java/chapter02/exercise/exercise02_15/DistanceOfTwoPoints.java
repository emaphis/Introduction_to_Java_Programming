/*
 * Exercise 2.15
 *  (Geometry: distance of two points) Write a program that prompts the user to
 *  enter two points (x1, y1) and (x2, y2) and displays their distance. The for-
 *  mula for computing the distance is sqrt(x2 - x1)sq + (y2 - y1)sq. Note you can use
 *  Math.pow(a, 0.5) to compute sqrta.
 */
package chapter02.exercise.exercise02_15;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1 ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2 ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double xSqr = Math.pow(x2 - x1, 2);
        double ySqr = Math.pow(y2 - y1, 2);

        double distance = Math.pow(xSqr + ySqr, 0.5);

        System.out.println("The distance between the two points is " + distance);
    }
}
