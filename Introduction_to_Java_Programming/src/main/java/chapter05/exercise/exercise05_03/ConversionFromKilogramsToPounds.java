/*
 * Exercise 5.3
 *  (Conversion from kilograms to pounds) Write a program that displays the follow-
 *  ing table (note 1 kilogram is 2.2 pounds):
 *
 *  Kilograms   Pounds
 *  1              2.2
 *  3              6.6
 *  . . .
 *  197          433.4
 *  199          437.8
 */
package chapter05.exercise.exercise05_03;

/**
 * Print Pound to Kilogram table
 * @author emaph
 */
public class ConversionFromKilogramsToPounds {
    public static void main(String[] args) {
        final double CONVERSION = 2.2;

        // Print header
        System.out.println("Kilograms    Pounds");

        // Print details
        for (int kilo = 1; kilo < 200; kilo += 2) {
            double pound = kilo * CONVERSION;
            System.out.printf("%-3d           %5.1f\n", kilo, pound);
        }
    }
}
