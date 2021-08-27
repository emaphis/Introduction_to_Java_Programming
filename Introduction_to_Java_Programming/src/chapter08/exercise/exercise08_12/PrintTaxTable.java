/*
 * Experiment.
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
package chapter08.exercise.exercise08_12;


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

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},
            // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly
            // −or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475},
            // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        // Heasder
        System.out.println("Taxable    Single     Married Joint     Married     Head of");
        System.out.println("Income                of Qualifying     Separate    House hold");
        System.out.println("                      Widow(er)                               ");

        // details
        for (double income = from; income <= to; income += 50) {
            System.out.printf("%-10d %-10.1f %-10.1f        %-10.1f  %-10.1f\n",
                    Math.round(income),
                    computeTax(income, rates, brackets[SINGLE]),
                    computeTax(income, rates, brackets[JOINT]),
                    computeTax(income, rates, brackets[SEPARATE]),
                    computeTax(income, rates, brackets[HEAD]));
        }

    }


    public static double computeTax(double taxableIncome, double[] rates, int[] bracket) {
        double tax;
        if (taxableIncome <= bracket[0]) {
            tax = taxableIncome * rates[0];
        } else if (taxableIncome <= bracket[1]) {
            tax = bracket[0] * rates[0] +
                    (taxableIncome - bracket[0]) * rates[1];
        } else if (taxableIncome <= bracket[2]) {
            tax = bracket[0] * rates[0]
                    + (bracket[1] - bracket[0]) * rates[1]
                    + (taxableIncome - bracket[1]) * rates[2];
        } else if (taxableIncome <= bracket[3]) {
            tax = bracket[0] * rates[0]
                    + (bracket[1] - bracket[0]) * rates[1]
                    + (bracket[2] - bracket[1]) * rates[2]
                    + (taxableIncome - bracket[2]) * rates[3];
        } else if (taxableIncome <= bracket[4]) {
            tax = bracket[0] * rates[0]
                    + (bracket[1] - bracket[0]) * rates[1]
                    + (bracket[2] - bracket[1]) * rates[2]
                    + (bracket[3] - bracket[2]) * rates[3]
                    + (taxableIncome - bracket[4]) * rates[4];
        } else {
            tax = bracket[0] * rates[0]
                    + (bracket[1] - bracket[0]) * rates[1]
                    + (bracket[2] - bracket[1]) * rates[2]
                    + (bracket[3] - bracket[2]) * rates[3]
                    + (bracket[4] - bracket[3]) * rates[4]
                    + (taxableIncome - bracket[4]) * rates[5];
        }

        return tax;
    }
}
