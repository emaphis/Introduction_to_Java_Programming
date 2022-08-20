/*
 * Exercise 10.17
 *  (Square numbers) Find the first 10 square numbers that are greater than Long.
 *  MAX_VALUE. A square number is a number in the form of n2
.*  For example, 4, 9,and 16 are square numbers.
 *  Find an efficient approach to run your program fast.
 */
package chapter10.exercise.exercise10_17;

import java.math.BigInteger;

/**
 * Find the first 10 squares larger than Long.MAX_VALUE
 * @author emaph
 */
public class Exercise10_17 {
    public static void main(String[] args) {
        // Find the square root of MAX_VALUE for a starting value
        double x = Long.MAX_VALUE;
        long num =  (long) Math.sqrt(x) + 1;
        System.out.println("starting value = " + num);

        for (int i = 0; i < 10; i++) {
            BigInteger big = new BigInteger(num + "");  // convert long to big
            BigInteger sqr = big.multiply(big);
            System.out.println(sqr);
            num++;
        }
    }
}

/*
starting value = 3037000500
9223372037000250000
9223372043074251001
9223372049148252004
9223372055222253009
9223372061296254016
9223372067370255025
9223372073444256036
9223372079518257049
9223372085592258064
9223372091666259081
*/
