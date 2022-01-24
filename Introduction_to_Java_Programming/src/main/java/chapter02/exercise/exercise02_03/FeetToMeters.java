/*
 * Exercise 2.3
 *    (Convert feet into meters) Write a program that reads a number in feet, converts it
 *    to meters, and displays the result.
 *    One foot is 0.305 meter.
 */
package chapter02.exercise.exercise02_03;

import java.util.Scanner;

/**
 * Enter a length in feet to convert to meters.
 * @author emaph
 */
public class FeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
