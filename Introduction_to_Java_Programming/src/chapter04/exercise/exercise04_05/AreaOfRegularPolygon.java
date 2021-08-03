/*
 * Exercise 4.4
 *  (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 *  following formula (s is the length of a side)
 *
 *      Area = (n * s * s) / (4 * tan(PI/n))
 *
 *  Here, s is the length of a side. Write a program that prompts the user to enter the
 *  number of sides and their length of a regular polygon and displays its area
 */
package chapter04.exercise.exercise04_05;

import java.util.Scanner;

/**
 * @author emaph
 */
public class AreaOfRegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int number = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (number * side * side) / (4 * Math.tan(Math.PI / number));

        System.out.println("he area of the polygon is " + area);
    }
}
