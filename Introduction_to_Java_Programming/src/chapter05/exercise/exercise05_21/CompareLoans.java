/*
 * Exercise 5.21
 *  Financial application: compare loans with various interest rates) Write a pro-
 *  gram that lets the user enter the loan amount and loan period in number of years,
 *  and displays the monthly and total payments for each interest rate starting from
 *  5% to 8%, with an increment of 1/8. Here is a sample run:
 */
package chapter05.exercise.exercise05_21;

import java.util.Scanner;

/**
 * Compare loans with various interest rates
 * @author emaph
 */
public class CompareLoans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get load data
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        final double RATE_INCREMENT = 0.125;
        final int NUM_MONTHS = years * 12;
        final double BEGIN_RATE = 5.0;
        final double END_RATE = 8.0;

        // Print header
        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        // Print lown details
        for (double rate = BEGIN_RATE; rate <= END_RATE;  rate += RATE_INCREMENT) {
            double monthlyRate =  rate / 1200.0;
            double monthlyPayment = amount * monthlyRate /
                                    (1 - 1 / (Math.pow(1 + monthlyRate, years * 12)));
            double total = monthlyPayment * NUM_MONTHS;
            System.out.printf("%5.3f%%           %5.2f             %6.2f\n",
                    rate, monthlyPayment, total);
        }
    }
}
