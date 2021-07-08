/*
 *  Exercise 2.16
 *      (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 *      side of a hexagon and displays its area. The formula for computing the area of a
 *      hexagon is
 *      Area = ((3 * sqrt3) / 2) * sq(s)
 */
package chapter02.exercise.exercise02_16;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

        double constant = (3 * Math.pow(3, 0.5)) / 2;
        double area = constant * Math.pow(side, 2);

        System.out.println("The area of the hexagon is " + area);
    }
}
