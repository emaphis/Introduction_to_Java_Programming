/*
 * Exercise 11.3
 *  (Subclasses of Account) In Programming Exercise 9.7, the Account class was
 *  defined to model a bank account. An account has the properties account number,
 *  balance, annual interest rate, and date created, and methods to deposit and with￾draw funds. Create two subclasses for checking and saving accounts. A checking
 *  account has an overdraft limit, but a savings account cannot be overdrawn.
 *
 *  Draw the UML diagram for the classes and implement them. Write a test program
 *  that creates objects of Account, SavingsAccount, and CheckingAccount and
 *  invokes their toString() methods.
 */
package chapter11.exercise.exercise11_03;

import chapter09.exercise.exercise09_07.Account;

/**
 *
 * @author emaph
 */
public class Exercise11_03 {
    public static void main(String[] args) {
        Account acct = new Account(1001, 100.00);
        System.out.println("account: " + acct);

        SavingsAccount savings = new SavingsAccount(1002, 300.0);
        System.out.println("savdings: " + savings);

        CheckingAccount checking = new CheckingAccount(1003, 600.00, 10.00);
        System.out.println("checking: " + checking);
    }
}
