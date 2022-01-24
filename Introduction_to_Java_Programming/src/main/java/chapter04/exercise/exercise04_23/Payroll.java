/*
 * Exercise 4.23
 *  (Financial application: payroll) Write a program that reads the following infor-
 *  mation and prints a payroll statement:
 *
 *      Employee’s name (e.g., Smith)
 *      Number of hours worked in a week (e.g., 10)
 *      Hourly pay rate (e.g., 9.75)
 *      Federal tax withholding rate (e.g., 20%)
 *      State tax withholding rate (e.g., 9%)
 */
package chapter04.exercise.exercise04_23;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class Payroll {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee’s name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        // Calcuate pay
        double grossPay = hours * payRate;
        double fedWithhold = grossPay * fedTaxRate;
        double stateWithhold = grossPay * stateTaxRate;
        double totalDeduction = fedWithhold + stateWithhold;
        double netPay = grossPay - totalDeduction;

        // Output report
        System.out.println();
        System.out.println("Employee Name: " + name);
        System.out.printf("Hours Worked: %5.1f\n", hours);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);

        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n",
                (fedTaxRate * 100), fedWithhold);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n",
                (stateTaxRate * 100), stateWithhold);
        System.out.printf("  Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}
