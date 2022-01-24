/*
 * Listing 2.6  FahrenheitToCelsius.java
 */
package chapter02.examples.listing02_06;

import java.util.Scanner;

/**
 * Calculate Celsius given the Fahrenheit temperature.
 * @author emaph
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter degrees in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit  " + fahrenheit + " is " + celsius + " in Celsius");
    }
}
