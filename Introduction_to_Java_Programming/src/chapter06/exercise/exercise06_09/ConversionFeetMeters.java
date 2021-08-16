/*
 * Exercise 6.9
 *  (Conversions between feet and meters) Write a class that contains the following
 *  two methods:
 *
 *      /** Convert from feet to meters
 *      public static double footToMeter(double foot)
 *
 *      /** Convert from meters to feet
 *      public static double meterToFoot(double meter)
 *
 *  The formula for the conversion is:
 *
 *      meter = 0.305 * foot
 *      oot = 3.279 * meter
 *
 *` Write a test program that invokes these methods to display the following tables:
 */
package chapter06.exercise.exercise06_09;

/**
 * Conversions between feet and meters
 * @author emaph
 */
public class ConversionFeetMeters {
    public static void main(String[] args) {

        // Print header
        System.out.printf("%-7s%-9s%-7s%-9s%-6s\n", "Feet", "Meters", "   |   ", "Meters", "Feet");
        System.out.println("-----------------------------------------");

        // print detalis
        for (double feet = 1, meter = 20;
             feet <= 10;
             feet += 1, meter += 5) {
            double meter1 = footToMeter(feet);
            double feet1 = meterToFoot(meter);
            System.out.printf("%-7.1f%-9.3f%-7s%-9.1f%-7.3f\n",
                        feet, meter1, "   |   ", meter, feet1);
        }
    }


    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}