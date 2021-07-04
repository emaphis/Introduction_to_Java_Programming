/*
 * Exercise 2.10
 *  .(Science: calculating energy) Write a program that calculates the energy needed
 *   to heat water from an initial temperature to a final temperature. Your program
 *   should prompt the user to enter the amount of water in kilograms and the initial
 *   and final temperatures of the water. The formula to compute the energy is
 *
 *     Q = M * (finalTemperature – initialTemperature) * 4184
 *
 *   where M is the weight of water in kilograms, initial and final temperatures are in
 *   degrees Celsius, and energy Q is measured in joules
 */
package chapter02.exercise.exercise02_10;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class Energy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amont of water in kilograms: ");
        double m = input.nextDouble();

        System.out.print("Enter initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double q = m * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + q);
    }

}
