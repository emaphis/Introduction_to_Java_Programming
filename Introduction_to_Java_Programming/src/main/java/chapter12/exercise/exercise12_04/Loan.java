/*
 * Exercise 12.4
 * IllegalArgumentException
 */
package chapter12.exercise.exercise12_04;

import java.util.Date;

/**
 * Loan class
 * if Loan Amount or Interest Rate or Number of Years is 0 or less generate ab
 *  IllegalArgumentException
 * @author emaph
 */
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    /** Default constructor */
    public Loan() {
        this(2.5, 1, 1000);
    }

    /** Construct a loan with specified annual interest rate,
        number of years, and loan amount
      */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException {
        if (annualInterestRate <= 0.0 || numberOfYears <= 0.0 || loanAmount <= 0.0)
            throw new IllegalArgumentException("Interest rate, Number of years or loan amount must be greater than zero");

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
        if (annualInterestRate <= 0.0)
            throw new IllegalArgumentException("Annual interest rate must be greater than zero");
        this.annualInterestRate = annualInterestRate;
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }


    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if (numberOfYears <= 0.0)
            throw new IllegalArgumentException("Number of years must be greater than zero");
        this.numberOfYears = numberOfYears;
    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Set a new loanAmount */
    public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
        if (loanAmount <= 0.0)
            throw new IllegalArgumentException("Loan amount must be greater than zero");
        this.loanAmount = loanAmount;
    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /** Return loan date */
    public Date getLoanDate() {
        return loanDate;
    }
}
