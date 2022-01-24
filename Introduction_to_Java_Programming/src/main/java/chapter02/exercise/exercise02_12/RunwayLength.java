/*
 * Exercise 2.12
 *  .(Physics: finding runway length) Given an airplane’s acceleration a and take-off
 *   speed v, you can compute the minimum runway length needed for an airplane to
 *  take off using the following formula:
 *
 *   length = (v * v)  / (2 * a)
 *
 *  Write a program that prompts the user to enter v in meters/second (m/s) and
 *  the acceleration a in meters/second squared (m/s2), then, displays the minimum
 *  runway length.
 */
package chapter02.exercise.exercise02_12;

import java.util.Scanner;

/**
 * Calculate minimum runway length given plain speed and acceleration
 * @author emaph
 */
public class RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();

        double length = (v * v)  / (2 * a);

        System.out.println("The minimum runway length for this airplaine is " + length);
    }
}
