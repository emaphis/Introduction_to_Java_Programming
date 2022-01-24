/*
 * Listing 5.8
 *  Minimizing Numberic Erross
 */
package chapter05.example.listing05_08;

/**
 * @author emaph
 */
public class TestSum {
    // float result --   The sum is 50.499985
    // double result --  The sum is 50.49999887123704
    public static void main(String args[]) {
        // Initialize sum
        double sum = 0;

        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (double i = 0.01d; i<= 1.0d; i = i + 0.01d)
            sum += i;

        // Display result
        System.out.println("The sum is " + sum);
    }
}
