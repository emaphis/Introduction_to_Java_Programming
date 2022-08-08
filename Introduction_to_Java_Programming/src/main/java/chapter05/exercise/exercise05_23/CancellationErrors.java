/*
 * Exercise 5.23
 *  Demonstrate cancellation errors) A cancellation error occurs when you are
 *  manipulating a very large number with a very small number. The large number
 *  may cancel out the smaller number. For example, the result of 100000000.0
 *  + 0.000000001 is equal to 100000000.0. To avoid cancellation errors and
 *  obtain more accurate results, carefully select the order of computation. For ex-
 *  ample, in computing the following summation, you will obtain more accurate
 *  results by computing from right to left rather than from left to right:
 *
 *      1 + 1/2 + 1/3 + ... + 1/n
 *
 *  Write a program that compares the results of the summation of the preceding
 *  eries, computing from left to right and from right to left with n = 50000.
 */
package chapter05.exercise.exercise05_23;

/**
 * Demonstrate cancellation error
 * @author emaph
 */
public class CancellationErrors {
    public static void main(String[] args) {
        final int END = 50000;
        double sumL2R = 0;
        double sumR2L = 0;

        // Sumation from large to small - left to right
        for (int i = 1; i <= END;  i++)
            sumL2R += 1.0 / i;


        // Summating from small to large - right to left
        for (int i = END; i >= 1; i--)
            sumR2L += 1.0 / i;

        System.out.println("Small to large summation: " + sumR2L);
        System.out.println("Large to small summation: " + sumL2R);
        System.out.println("The difference is: " + (sumR2L - sumL2R));
    }
}

// double
// Small to large summation: 11.397003949278519
// Large to small summation: 11.397003949278504
// The difference is: 1.4210854715202004E-14//

// float
// Large to small summation: 11.396922
// Small to large summation: 11.397017
