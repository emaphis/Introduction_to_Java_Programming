/*
 * Exercise 11.8
 * New Account class
 */
package chapter11.exercise.exercise11_08;

import java.util.ArrayList;
import java.util.Date;

/**
 * The Account class
 * @author emaph
 */
public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Date dateCreated;
    private ArrayList<Transaction> transactions;

    /** default constructor */
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();

    }

    /** Creates account with specified name, id and balance */
    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        this.annualInterestRate = 0;
        this.transactions = new ArrayList<>();
    }

    /** Set new name */
    public void setName(String name) {
        this.name = name;
    }

    /** Set new Id */
    public void setId(int id) {
        this.id = id;
    }

    /** Set new balance */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** Set new annual interest rate */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /** Return name of account owner */
    public String getName() {
        return name;
    }

    /** Return account id */
    public int getId() {
        return id;
    }

    /** Return account balance */
    public double getBalance() {
        return balance;
    }

    /** Return annual interest rate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**  Returns date created. */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**  Returns the monthly interest rate */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /** Calculate and return monthly interest amount */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100.0);
    }

    /** Withdraws a specified amount from the account */
    public  void withdraw(double amount) {
        double newBalance = balance - amount;
        if (newBalance >= 0) {
            balance = newBalance;
            transactions.add(new Transaction('W', amount, newBalance,
                    "Withdrawal from account"));
        }
    }

    /** Deposits a specified amount to the account.*/
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance,
                    "Deposit to account"));
    }

    /** Return transactions list*/
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name=" + name +
                ", id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                "}s";
    }
}
