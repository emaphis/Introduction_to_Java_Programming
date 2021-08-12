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
        double commision;
        final double STARTING_VALUE = 25000;

        double temp = STARTING_VALUE;
        while (true) {
            double sales = temp;
            commision = 0;

            if (sales > .01) {
                if (sales > 5000) {
                    sales -= 5000;
                    commision += 5000 * 0.08;
                } else {
                    commision += sales * 0.08;
                }
            }

            if (sales > .01) {
                if (sales > 5000) {
                    sales -= 5000;
                    commision += 5000 * 0.10;
                } else {
                    commision += sales * 0.10;
                }
            }

            if (sales > 0.01) {
                commision += sales * 0.12;
            }

            //System.out.println("commision " + commision);

            if (BASE_PAY + commision > GOAL) {
                System.out.println("Sales of " + temp + " beats goal of " + GOAL);
                System.out.println("Producing a commision of " + commision);
               break;
            }

            temp += 10;
        }
    }
}

// Sales of 210840.0 beats goal of 30000.0
// Producing a commision of 25000.8