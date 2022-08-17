/*
 * Exercise 6.15
 *  (Financial application: print a tax table) Listing 3.5 gives a program to compute
 *  tax. Write a method for computing tax using the following header:
 *
 *      public static double computeTax(int status, double taxableIncome)
 *
 *  Use this method to write a program that prints a tax table for taxable income
 *  from $50,000 to $60,000 with intervals of $50 for all the following statuses:
 *
 *  Hint: round the tax into integers using Math.round
 *  (i.e., Math .round(computeTax(status, taxableIncome))).
 */
package chapter06.exercise.exercise06_15;

/**
 *Number of days in a year
 * @author emaph
 */
public class PrintTaxTable {
    final static int SINGLE = 0;
    final static int JOINT = 1;
    final static int SEPARATE = 2;
    final static int HEAD = 3;

    static double from = 50000;
    static double to = 60000;

    public static void main(String[] args) {
        // Header
        System.out.println("Taxable    Single     Married     Married     Head of");
        System.out.println("Income     Single     Joint      Separate    a House");

        // details
        for (double income = from; income <= to; income += 50) {
            System.out.printf("%-10d %-10d %-10d  %-10d  %-10d\n",
                    Math.round(income),
                    Math.round(computeTax(SINGLE, income)),
                    Math.round(computeTax(JOINT, income)),
                    Math.round(computeTax(SEPARATE, income)),
                    Math.round(computeTax(HEAD, income)));
        }

    }

    public static double computeTax(int status, double taxableIncome) {
        double tax;
        double amount10 = 0;
        double amount15 = 0;
        double amount25 = 0;
        double amount28 = 0;
        double amount33 = 0;

        // Convert chart to a case statement
        switch(status) {
            case SINGLE:
                amount10 = 8351;
                amount15 = 33951;
                amount25 = 82251;
                amount28 = 171551;
                amount33 = 372951;
                break;
            case JOINT:
                amount10 = 16701;
                amount15 = 67901;
                amount25 = 137051;
                amount28 = 208851;
                amount33 = 372951;
                break;
            case SEPARATE:
                amount10 = 8351;
                amount15 = 33951;
                amount25 = 68526;
                amount28 = 104426;
                amount33 = 186476;
                break;
            case HEAD:
                amount10 = 11951;
                amount15 = 45501;
                amount25 = 117551;
                amount28 = 190201;
                amount33 = 372951;
                break;
        }

        if (taxableIncome <= amount10)
            tax = taxableIncome * 0.10;
        else if (taxableIncome <= amount15)
            tax = amount10 * 0.10
                    + (taxableIncome - amount10) * 0.15;
        else if (taxableIncome <= amount25)
            tax = amount10 * 0.10
                    + (amount15 - amount10) * 0.15
                    + (taxableIncome - amount15) * 0.25;
        else if (taxableIncome <= amount28)
            tax = amount10 * 0.10
                    + (amount15 - amount10) * 0.15
                    + (amount25 - amount15) * 0.25
                    + (taxableIncome - amount25) * 0.28;
        else if (taxableIncome <= amount33)
            tax = amount10 * 0.10
                    + (amount15 - amount10) * 0.15
                    + (amount25 - amount15) * 0.25
                    + (amount28 - amount25) * 0.28
                    + (taxableIncome - amount28) * 0.33;
        else
            tax = amount10 * 0.10
                    + (amount15 - amount10) * 0.15
                    + (amount25 - amount15) * 0.25
                    + (amount28 - amount25) * 0.28
                    + (amount33 - amount28) * 0.33
                    + (taxableIncome - amount33) * 0.35;
        return tax;
    }
}
