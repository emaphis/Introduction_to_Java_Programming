/*
 * Exercise 4.1
 *  (Geometry: area of a pentagon) Write a program that prompts the user to enter
 *  the length from the center of a pentagon to a vertex and computes the area of the
 *  pentagon
 *
 *  The formula for computing the area of a pentagon is:
 *
 *      area = (5 * s * s) / (4 * tan(PI/5))
 *
 *      s = 2 * r * sin(PI/5)
 *
 *  Where:
 *      s is legnth of pentagon side
 *      r is distance from center to vertex
 *
 *   Round up two digits after the decimal point.
 */
package chapter04.exercise.exercise04_01;

import java.util.Scanner;

/**
 * @author emaph
 */
public class AreaOfPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double radius = input.nextDouble();

        // calculade length of side
        double side = 2 * radius * Math.sin(Math.PI / 5);

        // Calculate area
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %5.2f\n", area);
    }
}
