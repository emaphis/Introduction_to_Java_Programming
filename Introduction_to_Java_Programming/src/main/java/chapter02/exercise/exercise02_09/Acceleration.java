/*
 * Exercise 2.9
 *   Physics: acceleration) Average acceleration is defined as the change of velocity
 *   divided by the time taken to make the change, as given by the following formula:
 *
 *  acc =  (vel1 - vel2) / t
 *
 *    Write a program that prompts the user to enter the starting velocity v0 in meters/
 *    second, the ending velocity v1 in meters/second, and the time span t in seconds,
 *    then displays the average acceleration.
 */
package chapter02.exercise.exercise02_09;

import java.util.Scanner;

/**
 * Calculate acceleration a stating velocity and and ending velocity and the time span.
 * @author emaph
 */
public class Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double acc = (v1 - v0) / t;

        System.out.println("The average acceleration is " + acc);
    }
}
