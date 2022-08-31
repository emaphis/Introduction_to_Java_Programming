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
public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            super.withdraw(amount);
        }
    }

     @Override
    public String toString() {
        return "SavingsAccount{" +
                "id=" + getId() +
                ", balance=" + getBalance() +
                ", dateCreated=" + getDateCreated() +
                '}';
    }
}
