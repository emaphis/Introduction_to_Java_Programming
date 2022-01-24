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
        // Heasder
        System.out.println("Taxable    Single     Married Joint     Married     Head of");
        System.out.println("Income                of Qualifying     Separate    House hold");
        System.out.println("                      Widow(er)                               ");

        // details
        for (double income = from; income <= to; income += 50) {
            System.out.printf("%-10d %-10d %-10d        %-10d  %-10d\n",
                    Math.round(income),
                    Math.round(computeTax(SINGLE, income)),
                    Math.round(computeTax(JOINT, income)),
                    Math.round(computeTax(SEPARATE, income)),
                    Math.round(computeTax(HEAD, income)));
        }

    }

    public static double computeTax(int status, double taxableIncome) {
        double tax;

        switch (status) {
            case SINGLE:    // Compute tax for single filers
                if (taxableIncome <= 8350) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 33950) {
                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                } else if (taxableIncome <= 82250) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (taxableIncome - 33950) * 0.25;
                } else if (taxableIncome <= 171550) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                            + (taxableIncome - 171550) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                            + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
                }

                break;

            case JOINT:    // Compute tax for married file joint
                if (taxableIncome <= 16700) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 67900) {
                    tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
                } else if (taxableIncome <= 137050) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (taxableIncome - 67900) * 0.25;
                } else if (taxableIncome <= 208850) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                            + (taxableIncome - 208850) * 0.33;
                } else {
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                            + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
                            + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
                }

                break;

            case SEPARATE:   // Compute tax for married separately
                if (taxableIncome <= 8350) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 33950) {
                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
                } else if (taxableIncome <= 68525) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (taxableIncome - 33950) * 0.25;
                } else if (taxableIncome <= 104425) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
                } else if (taxableIncome <= 186475) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                            + (taxableIncome - 104425) * 0.33;
                } else {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                            + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
                            + (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
                }

                break;

            case HEAD:     // Compute tax for head of household
                if (taxableIncome <= 11950) {
                    tax = taxableIncome * 0.10;
                } else if (taxableIncome <= 45500) {
                    tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
                } else if (taxableIncome <= 117450) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (taxableIncome - 45500) * 0.25;
                } else if (taxableIncome <= 190200) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
                } else if (taxableIncome <= 372950) {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                            + (taxableIncome - 190200) * 0.33;
                } else {
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                            + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
                            + (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
                }

                break;

            default:
                System.out.println("Error: invalid status");
                tax = -9999;
        }

        return tax;
    }
}
