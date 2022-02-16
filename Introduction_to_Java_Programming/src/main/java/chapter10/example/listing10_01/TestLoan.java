/*
 * Listing 10.1
 * 10.2 Class Abstraction and Encapsulation
 */
package chapter10.example.listing10_01;

import java.util.Scanner;

/**
 * Exercise the Loan class
 * @author emaph
 */
public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter annual interest rate
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double  annualInterestRate = input.nextDouble();

        // Enter number of years
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        // Enter loan amount
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        // Create a loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());

    }
}

/*
Enter annual interest rate, for example, 8.25: 2.5
Enter number of years as an integer: 5
Enter loan amount, for example, 120000.95: 1000
The loan was created on Tue Feb 15 15:30:25 EST 2022
The monthly payment is 17.75
The total payment is 1064.84
*/
