/*
 * Exercise 5.4
 *  Conversion from miles to kilometers) Write a program that displays the follow-
 *  ing table (note 1 mile is 1.609 kilometers):
 *
 *      Miles   Kilometers
 *      1            1.609
 *      2            3.218
 *      . . .
 *      9           14.481
 *      10          16.090
 */
package chapter05.exercise.exercise05_04;

/**
 * Conversion table from miles to kilometers
 * @author emaph
 */
public class ConversionFromMilesToKilometers {
    public static void main(String[] args) {
        final double CONVERSION = 1.609;

        // Print header
        System.out.println("Miles    Kilometers");

        // Print details
        for (int miles = 1; miles < 11; miles++) {
            double kilometers = miles * CONVERSION;
            System.out.printf("%-3d      %-5.3f\n", miles, kilometers);
        }
    }
}
