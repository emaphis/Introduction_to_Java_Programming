/*
 * Exercise 6.35
 *  Geometry: area of a pentagon) The area of a pentagon can be computed using
 *  the following formula:
 *
 *      area = (5 * s * s) / (4 * tan(PI/5)
 *
 *  Where:
 *      s is legnth of pentagon side
 *
 *  Write a method that returns the area of a pentagon using the following header:
 *
 *      public static double area(double side)
 *
 *  Write a main method that prompts the user to enter the side of a pentagon and
 *  displays its area.
 */
package chapter06.exercise.exercise06_35;

import java.util.Scanner;

/**
 * Area of a pentagon
 * @author emaph
 */
public class AreaOfPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate area
        double area = area(side);

        System.out.println("The area of the pentagon is " + area);
    }

    public static double area(double side) {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
}
