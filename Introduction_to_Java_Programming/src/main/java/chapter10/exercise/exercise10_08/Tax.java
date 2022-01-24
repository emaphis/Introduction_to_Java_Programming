/*
 * Exercise 10.8
 */
package chapter10.exercise.exercise10_08;

/**
 * Class representing tax
 *
 * @author emaph
 */
public class Tax {

    // filing statux constants
    final int SINGLE_FILER = 0;
    final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    final int MARRIED_SEPARATELY = 2;
    final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;     // the tax brackets for each filing status.
    private double[] rates;       // the tax rates for each bracket.
    private double taxableIncome; // the taxable income.

    public Tax() {

    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double findTax() {
        double tax;
        if (taxableIncome <= brackets[filingStatus][0]) {
            tax = taxableIncome * rates[0];
        } else if (taxableIncome <= brackets[filingStatus][1]) {
            tax = brackets[filingStatus][0] * rates[0]
                    + (taxableIncome - brackets[filingStatus][0]) * rates[1];
        } else if (taxableIncome <= brackets[filingStatus][2]) {
            tax = brackets[filingStatus][0] * rates[0]
                    + (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
                    + (taxableIncome - brackets[filingStatus][1]) * rates[2];
        } else if (taxableIncome <= brackets[filingStatus][3]) {
            tax = brackets[filingStatus][0] * rates[0]
                    + (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
                    + (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
                    + (taxableIncome - brackets[filingStatus][2]) * rates[3];
        } else if (taxableIncome <= brackets[filingStatus][4]) {
            tax = brackets[filingStatus][0] * rates[0]
                    + (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
                    + (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
                    + (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3]
                    + (taxableIncome - brackets[filingStatus][3]) * rates[4];
        } else {
            tax = brackets[filingStatus][0] * rates[0]
                    + (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
                    + (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
                    + (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3]
                    + (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4]
                    + (taxableIncome - brackets[filingStatus][4]) * rates[5];
        }
        return tax;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

}
