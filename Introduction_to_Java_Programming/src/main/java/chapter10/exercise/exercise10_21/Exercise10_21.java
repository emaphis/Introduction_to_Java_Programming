/*
 * Exervise 10.21
 *   (Divisible by 5 or 6) Find the first 10 numbers greater than Long.MAX_VALUE
 *   that are divisible by 5 or 6.
 */
package chapter10.exercise.exercise10_21;

import java.math.BigInteger;

/**
 * Divisible by 5 or 6
 * @author emaph
 */
public class Exercise10_21 {
    /** Main method */
    public static void main(String[] args) {
        final BigInteger ZERO = BigInteger.ZERO;
        final BigInteger ONE = BigInteger.ONE;
        final BigInteger FIVE = new BigInteger("5");
        final BigInteger SIX = new BigInteger("6");

        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(ONE);
        int count = 0;
        while (count < 10) {
            if (number.remainder(FIVE).equals(ZERO) ||
                    number.remainder(SIX).equals(ZERO)) {
                count++;
                System.out.println(number);
            }
            number = number.add(ONE);
        }
    }
}

/*
9223372036854775810
9223372036854775812
9223372036854775815
9223372036854775818
9223372036854775820
9223372036854775824
9223372036854775825
9223372036854775830
9223372036854775835
9223372036854775836
*/