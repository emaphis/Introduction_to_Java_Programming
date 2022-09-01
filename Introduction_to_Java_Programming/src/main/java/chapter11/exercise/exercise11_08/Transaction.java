/*
 * Exercise 11.8
 * New Account class
 */
package chapter11.exercise.exercise11_08;

import java.util.Date;

/**
 * Represents Transaction that have operated on an Account
 * @author emaph
 */
public class Transaction {
    private Date date;
    /** The type of the transaction, such as "W" for withdrawal, "D" for deposit.*/
    private char type;
    private double amount;
    private double balance;
    private String description;

    /** Construct a Transaction with the specified date, type, balance, and description */
    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }
}
