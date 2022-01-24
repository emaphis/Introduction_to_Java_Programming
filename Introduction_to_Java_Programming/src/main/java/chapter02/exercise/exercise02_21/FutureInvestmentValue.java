/*
 * Exercise 2.21
 * .(Financial application: calculate future investment value) Write a program that
 *  reads in investment amount, annual interest rate, and number of years and dis-
 *  plays the future investment value using the following formula:
 *
 *  futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
 */
package chapter02.exercise.exercise02_21;

import java.util.Scanner;

/**
 * Calculate future value of an investment
 * @author emaph
 */
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        double numberOfMonths =  numberOfYears * 12;
        double value = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfMonths);

        System.out.println("Future value is $" + value);
    }
}
