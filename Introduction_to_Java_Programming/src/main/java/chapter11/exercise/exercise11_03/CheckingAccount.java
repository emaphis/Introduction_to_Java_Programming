/*
 * Exercise 11.3
 *
 */
package chapter11.exercise.exercise11_03;

import chapter09.exercise.exercise09_07.Account;

/**
 * CheckingAccount class
 * @author emaph
 */
public class CheckingAccount extends Account {
    private double overDraftLimit;

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double deduction = getBalance() - amount;
        if (deduction > overDraftLimit)
            super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "id=" + getId() +
                ", balance=" + getBalance() +
                ", overdraftLimit=" + overDraftLimit +
                ", dateCreated=" + getDateCreated() +
                '}';
    }



}
