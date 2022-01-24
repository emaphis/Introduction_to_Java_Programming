/*
 * Exercise 5.22
 *  (Financial application: loan amortization schedule) The monthly payment for a given
 *  loan pays the principal and the interest. The monthly interest is computed by multiply-
 *  ing the monthly interest rate and the balance (the remaining principal). The principal
 *  paid for the month is therefore the monthly payment minus the monthly interest. Write
 *  a program that lets the user enter the loan amount, number of years, and interest rate
 *  then displays the amortization schedule for the loan
 */
package chapter05.exercise.exercise05_22;

import java.util.Scanner;

/**
 * loan amortization schedule
 * @author emaph
 */
public class LoanAmortization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get account information
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println();

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate montly paymet
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.printf("Montlhy Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);
        System.out.println();

        // Print header
        System.out.println("Payment#     Interest     Principal    Balance");

        // Print details
        double balance = loanAmount;
        double interest;
        double principal;

        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;

            System.out.printf("%-10d   %-10.2f   %-10.2f   %-10.2f  \n",
                    i, interest, principal,  balance);
        }
    }
}
