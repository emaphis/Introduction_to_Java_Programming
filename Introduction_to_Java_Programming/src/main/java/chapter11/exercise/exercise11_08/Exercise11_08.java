/*
 * Exercise 11.6
 *  (New Account class) An Account class was specified in Programming Exercise 9.7.
 *  Design a new Account class as follows:
 *
 *  ■ Add a new data field name of the String type to store the name of the
 *    customer.
 *  ■ Add a new constructor that constructs an account with the specified name, id,
 *    and balance.
 *  ■ Add a new data field named transactions whose type is ArrayList that
 *    stores the transaction for the accounts. Each transaction is an instance of the
 *    Transaction class, which is defined as shown in Transaction.java.
 *
 *  ■ Modify the withdraw and deposit methods to add a transaction to the
 *    transactions array list.
 *  ■ All other properties and methods are the same as in Programming E
 *
 *  Write a test program that creates an Account with annual interest rate 1.5%,
 *  balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
 *  account and withdraw $5, $4, and $2 from the account. Print an account summary
 *  that shows the account holder name, interest rate, balance, and all transactions
 */
package chapter11.exercise.exercise11_08;

import java.util.ArrayList;

/**
 * Exercise account class.
 * @author emaph
 */
public class Exercise11_08 {
    public static void main(String[] args) {
        Account acct1 = new Account("George", 1122, 1_000);
        acct1.setAnnualInterestRate(5.5);

        // Deposits
        acct1.deposit(30);
        acct1.deposit(40);
        acct1.deposit(50);

        // Withdrawals.
        acct1.withdraw(5);
        acct1.withdraw(4);
        acct1.withdraw(2);

        System.out.println("Name: " + acct1.getName());
        System.out.printf("Annual interest rate: %.1f \n", acct1.getAnnualInterestRate());
        System.out.printf("Balance: %.2f \n", acct1.getBalance());

        printTransactions(acct1.getTransactions());
    }

    static void printTransactions(ArrayList<Transaction> transactions) {
        System.out.println("Date                               Type           Amount         Balance ");
        for (Transaction trans : transactions) {
            System.out.printf("%28s%8c%18.1f%17.1f\n",
                    trans.getDate().toString(), trans.getType(), trans.getAmount(),
                    trans.getBalance());
        }
    }
}

/*
Name: George
Annual interest rate: 5.5
Balance: 1109.00
Date                               Type           Amount         Balance
Wed Aug 31 20:55:23 EDT 2022       D              30.0           1030.0
Wed Aug 31 20:55:23 EDT 2022       D              40.0           1070.0
Wed Aug 31 20:55:23 EDT 2022       D              50.0           1120.0
Wed Aug 31 20:55:23 EDT 2022       W               5.0           1115.0
Wed Aug 31 20:55:23 EDT 2022       W               4.0           1111.0
Wed Aug 31 20:55:23 EDT 2022       W               2.0           1109.0
*/
