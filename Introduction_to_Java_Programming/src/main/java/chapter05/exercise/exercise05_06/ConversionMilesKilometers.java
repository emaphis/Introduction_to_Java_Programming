/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *  (Conversion from miles to kilometers) Write a program that displays the following
 *  two tables side by side:
 *
 *      Miles    Kilometers   |   Kilometers   Miles
 *      1        1.609        |   20           12.430
 *      2        3.218        |   25           15.538
 *      ...
 *      9        14.481       |   60           37.290
 *      10       16.090       |   65           40.398
 */
package chapter05.exercise.exercise05_06;

/**
 *
 * @author emaph
 */
public class ConversionMilesKilometers {
    public static void main(String[] args) {
        final double MILES2KILOS = 1.609;
        final double KILOM2MILES = 1.0 / MILES2KILOS;

        // Print out header
        System.out.println("Miles     Kilometers  |  Kilometers     Miles");

        // Calculate and print out details
        for (int miles = 1, kilos = 20; miles < 11; miles++, kilos += 5) {
            double newKilos = miles * MILES2KILOS;
            double newMiles = kilos * KILOM2MILES;

            System.out.printf("%-10d%-10.3f  |  %-15d%.3f%n", miles, newKilos, kilos, newMiles);
        }
    }
}
