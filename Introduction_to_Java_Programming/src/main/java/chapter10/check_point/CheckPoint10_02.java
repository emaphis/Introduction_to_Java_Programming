/*
 * Check Point 10.2
 * Class Abstraction and Encapsulation
 */
package chapter10.check_point;
import java.util.Scanner;

// 10.2.1 If you redefine the Loan class in Listing 10.2 without setter methods, is the class
//        immutable?
// a.  No. It can return a mutable Date object.

public class CheckPoint10_02 {
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
        chapter10.example.listing10_01.Loan loan = new chapter10.example.listing10_01.Loan(annualInterestRate, numberOfYears, loanAmount);

        // Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());
    }
}
