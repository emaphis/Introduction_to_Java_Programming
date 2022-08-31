/*
 * Exercise 11.3
 *
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
