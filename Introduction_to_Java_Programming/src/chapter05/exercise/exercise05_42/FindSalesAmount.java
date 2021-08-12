/*
 * Exercise 5.42
 *  (Financial application: find the sales amount) Rewrite Programming Exercise
 *  5.39 as follows:
 *
 *  ■ Use a for loop instead of a do-while loop.
 *  ■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 */
package chapter05.exercise.exercise05_42;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class FindSalesAmount {
    public static void main(String[] args) {
        final double LOW_COMM_RATE = 0.06;
        final double MED_COMM_RATE = 0.10;
        final double HIGH_COMM_RATE = 0.12;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter desired commision amount: ");
        final double COMMISSION_SOUGHT = input.nextInt();

        double remainder;
        double commision = 0;
        double sales;

        for (sales = 0.0; commision <= COMMISSION_SOUGHT; sales += 1.0) {
            remainder = 0;
            commision = 0;

            if (sales > 10000.00) {
                remainder = sales - 10000;
                commision += remainder * HIGH_COMM_RATE;
            }

            if (sales > 5000.00) {
                remainder -= (remainder - 5000.00);
                commision += remainder * MED_COMM_RATE;
            }

            if (sales > 0.00) {
                commision += remainder * LOW_COMM_RATE;
            }
        }

        System.out.printf("Sales of $%.2f beats desired commission of $%.2f\n", sales,  COMMISSION_SOUGHT);
        System.out.printf("Producing a commision of $%.2f\n", commision);
    }
}

// Enter desired commision amount: 30000
// Sales of $253335.00 beats desired commission of $30000.00
// Producing a commision of $30000.08
