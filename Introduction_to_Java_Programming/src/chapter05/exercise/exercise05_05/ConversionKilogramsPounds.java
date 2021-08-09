/*
 * Exercise 5.6
 *  (Conversion from kilograms to pounds and pounds to kilograms) Write a program
 *  that displays the following two tables side by side:
 *
 *      Kilograms   Pounds  |   Pounds  Kilograms
 *      1              2.2  |   20           9.09
 *      3              6.6  |   25          11.36
 *      ...
 *      197          433.4  |   510        231.82
 *      199          437.8  |   515        234.09
 */
package chapter05.exercise.exercise05_05;

/**
 *
 * @author emaph
 */
public class ConversionKilogramsPounds {
    public static void main(String[] args) {

        final double KILOS2POUNDS = 2.2;
        final double POUNDS2KILOS = 1.0 / 2.2;

        // Print out header
        System.out.println("Kilograms   Pounds   |   Pounds   Kilograms");

        // Print out details
        for (int kilos = 1, pounds = 20; kilos < 200; kilos += 2, pounds += 5) {
            double newPounds = kilos * KILOS2POUNDS;
            double newKilos = pounds * POUNDS2KILOS;

            System.out.printf("%-9d%9.1f   |   %-9d%9.2f%n", kilos, newPounds, pounds, newKilos);
        }
    }

}
