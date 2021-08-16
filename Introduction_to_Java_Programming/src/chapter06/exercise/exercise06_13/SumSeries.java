/*
 * Exercise 6.13
 *  (Sum series) Write a method to compute the following summation
 *
 *      m(i) = 1/2 + 2/3 + ... + 1 / (i + 1)
 *
 *  Write a test program that displays the following table:
 */
package chapter06.exercise.exercise06_13;

/**
 * Sum series
 * @author emaph
 */
public class SumSeries {
    public static void main(String[] args) {
        final double END = 20;

        // Print header
        System.out.println("i        m(i)");

        // Print details
        for (double i = 1; i <= END; i++) {
            double mi = m(i);
            System.out.printf("%-8.0f %-7.4f\n", i, mi);
        }
    }

    static double m(double num) {
        double sum = 0;

        for (double i = 1.0; i <= num; i++) {
            sum += i / (i + 1.0);
        }

        return sum;
    }
}
