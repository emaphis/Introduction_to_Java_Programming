/*
 * Exercise 5.29
 *  (Financial application: find the sales amount) You have just started a sales job
 *  in a department store. Your pay consists of a base salary and a commission. The
 *  base salary is $5,000. The scheme shown below is used to determine the commis-
 *  sion rate.
 *
 *      Sales Amount            Commission Rate
 *      =======================================
 *      $0.01–$5,000             8%
 *      $5,000.01–$10,000       10%
 *      $10,000.01 and above    12%
 *
 *  Note this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 *  $5,000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the com-
 *  mission is 5,000 * 8 + 5,000 * 10 + 15,000 * 12 = 2,700
 *  Your goal is to earn $30,000 a year. Write a program that finds out the mini-
 *  mum number of sales you have to generate in order to make $30,000.
 */
package chapter05.exercise.exercise05_39;

/**
 * find the sales amount
 * @author emaph
 */
public class FindSalesAmount {
    public static void main(String[] args) {
        final double BASE_PAY = 5000;
        final double GOAL = 30000;
        final double LOW_SALES = 5000;
        final double MED_SAES = 10000;
        final double LOW_COMM_RATE = 0.06;
        final double MED_COMM_RATE = 0.10;
        final double HIGH_COMM_RATE = 0.12;

        double commission = 0;
        double earnings = 0;
        double sales = 0;

        while (earnings <= GOAL) {
            sales += 1;

            if (sales <= LOW_SALES) {
                commission = sales * LOW_COMM_RATE;
            } else if (sales <= MED_SAES) {
                commission = sales * LOW_COMM_RATE + (sales - LOW_COMM_RATE) * MED_COMM_RATE;
            } else {
                commission = (5000 * LOW_COMM_RATE) + (5000 * MED_COMM_RATE)
                        + (sales - 10000) * HIGH_COMM_RATE;
            }

            earnings = BASE_PAY + commission;
        }

        System.out.println("Sales of " + sales + " beats goal of " + GOAL);
        System.out.println("Producing a commision of " + commission);
    }
}

// Sales of 211670.0 beats goal of 30000.0
// Producing a commision of 25000.04