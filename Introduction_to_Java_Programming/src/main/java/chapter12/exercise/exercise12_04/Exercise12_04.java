/*
 * Exercise 12.4
 *  (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 *  throw IllegalArgumentException if the loan amount, interest rate, or
 *  number of years is less than or equal to zero.
 */
package chapter12.exercise.exercise12_04;

import java.util.Scanner;

/**
 * Exercise the Loan class, with IllegalArgumentException
 * @author emaph
 */
public class Exercise12_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Loan loan = new Loan();

        try {
            // Enter annual interest rate
            System.out.print("Enter annual interest rate, for example, 8.25: ");
            double  annualInterestRate = input.nextDouble();
            loan.setAnnualInterestRate(annualInterestRate);

            // Enter number of years
            System.out.print("Enter number of years as an integer: ");
            int numberOfYears = input.nextInt();
            loan.setNumberOfYears(numberOfYears);

            // Enter loan amount
            System.out.print("Enter loan amount, for example, 120000.95: ");
            double loanAmount = input.nextDouble();
            loan.setLoanAmount(loanAmount);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

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

Enter annual interest rate, for example, 8.25: 0
Annual interest rate must be greater than zero

Enter annual interest rate, for example, 8.25: 2.5
Enter number of years as an integer: 0
Number of years must be greater than zero
*/
