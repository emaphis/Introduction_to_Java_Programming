/*
 * Exercise 4.4
 *  (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 *  following formula (s is the length of a side):
 *
 *  The formula for computing the area of a pentagon is:
 *
 *      area = (6 * s * s) / (4 * tan(PI/6))
 *
 *  Where:
 *      s is legnth of hexagon side
 *
 *  Write a program that prompts the user to enter the side of a hexagon and displays
 *  its area
 */
package chapter04.exercise.exercise04_04;

import java.util.Scanner;

/**
 * @author emaph
 */
public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate area
        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %5.2f\n", area);
    }
}
