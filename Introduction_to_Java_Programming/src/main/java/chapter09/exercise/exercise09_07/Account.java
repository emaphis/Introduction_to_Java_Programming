/*
 * Exercise 9.7
 */
package chapter09.exercise.exercise09_07;

import java.util.Date;

/**
 *
 * @author emaph
 */
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    final private Date dateCreated;

    /** default constructor */
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    /** Creates account with specified id and balance */
    public Account(int newid, double newBalance) {
        id = newid;
        balance = newBalance;
        dateCreated = new Date();
        annualInterestRate = 0;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /** Calculate and return interest amount */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100.0);
    }

    public  void withdraw(double amount) {
        balance -= amount;
    }


    public void deposit(double amount) {
        balance += amount;
    }

}
