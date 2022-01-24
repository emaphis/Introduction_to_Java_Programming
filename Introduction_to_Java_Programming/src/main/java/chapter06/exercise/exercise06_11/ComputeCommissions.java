/*
 * Exercise 6.11
 *  (Financial application: compute commissions) Write a method that computes the
 *  commission, using the scheme in Programming Exercise 5.39. The header of the
 *  method is as follows:
 *
 *      public static double computeCommission(double salesAmount)
 *
 *
 */
package chapter06.exercise.exercise06_11;

/**
 * Compute Commissions
 * @author emaph
 */
public class ComputeCommissions {
    public static void main(String[] args) {

        // Print header
        System.out.println("Sales Amount     Commission");

        // print details
        double commission;
        for (double salesAmount = 10_000; salesAmount <= 100_000; salesAmount += 5000.0) {
            commission = computeCommission(salesAmount);
            System.out.printf("%-16.0f %-7.1f\n", salesAmount, commission);
        }
    }

    public static double computeCommission(double salesAmount) {
        final double LOW_COMM_RATE = 0.06;
        final double MED_COMM_RATE = 0.10;
        final double HIGH_COMM_RATE = 0.12;

        double commission = 100.0;
        double remainder = 0;

        if (salesAmount > 10000.00) {
            remainder = salesAmount - 10000;
            commission += remainder * HIGH_COMM_RATE;
        }

        if (salesAmount > 5000.00) {
            remainder -= (remainder - 5000.00);
            commission += remainder * MED_COMM_RATE;
        }

        if (salesAmount > 0.00) {
            commission += remainder * LOW_COMM_RATE;
        }

        return commission;
    }
}
