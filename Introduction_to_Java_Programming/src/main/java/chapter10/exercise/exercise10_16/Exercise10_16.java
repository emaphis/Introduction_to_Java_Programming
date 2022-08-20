/*
 * Exercise 10.16
 *  (Divisible by 2 or 3) Find the first 10 numbers with 50 decimal digits that are
 *  divisible by 2 or 3.
 */
package chapter10.exercise.exercise10_16;

import java.math.BigInteger;

/**
 * Divisible by 2 or 3
 * @author emaph
 */
public class Exercise10_16 {
    /** The main method */
    public static void main(String[] args) {
        final String str = "10000000000000000000000000000000000000000000000000";
        //System.out.println("length = " + str.length());
        BigInteger number = new BigInteger(str);

        int count = 0;
        BigInteger ZERO = new BigInteger("0");
        BigInteger ONE = new BigInteger("1");
        BigInteger TWO = new BigInteger("2");
        BigInteger THREE = new BigInteger("3");

        while (count < 10) {
            if (number.remainder(TWO).equals(ZERO) ||
                number.remainder(THREE).equals(ZERO)) {
                System.out.println(number);
                count++;
            }

            number = number.add(ONE);
        }
    }
}

// "10000000000000000000000000000000000000000000000000"

/*
10000000000000000000000000000000000000000000000000
10000000000000000000000000000000000000000000000002
10000000000000000000000000000000000000000000000004
10000000000000000000000000000000000000000000000005
10000000000000000000000000000000000000000000000006
10000000000000000000000000000000000000000000000008
10000000000000000000000000000000000000000000000010
10000000000000000000000000000000000000000000000011
10000000000000000000000000000000000000000000000012
10000000000000000000000000000000000000000000000014
*/
