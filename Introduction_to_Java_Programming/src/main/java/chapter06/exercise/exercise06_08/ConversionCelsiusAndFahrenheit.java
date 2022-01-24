/*
 * Exercise 6.8
 *  (Conversions between Celsius and Fahrenheit) Write a class that contains the
 *  following two methods:
 *
 *      Convert from Celsius to Fahrenheit
 *      public static double celsiusToFahrenheit(double celsius)
 *
 *      Convert from Fahrenheit to Celsius
 *      public static double fahrenheitToCelsius(double fahrenheit)
 *
 *  The formula for the conversion is as follows:
 *
 *      fahrenheit = (9.0 / 5) * celsius + 32
 *      celsius = (5.0 / 9) * (fahrenheit – 32)
 *
 *  Write a test program that invokes these methods to display
 */
package chapter06.exercise.exercise06_08;

/**
 * Conversions between Celsius and Fahrenheit
 * @author emaph
 */
public class ConversionCelsiusAndFahrenheit {
    public static void main(String[] args) {

        // Print header
        System.out.printf("%-12s %11s   |   %-12s  %-12s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("----------------------------------------------------");

        // Print details
        for (double celsius = 40, fahrenheit = 120;
             celsius >= 31;
             celsius -= 1, fahrenheit -= 10) {
            double fahrenheit1 = celsiusToFahrenheit(celsius);
            double celsius1 = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%-12.1f  %-12.1f |   %-12.1f  %-12.2f\n",
                    celsius, fahrenheit1, fahrenheit, celsius1);
        }
    }


    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return  fahrenheit;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
