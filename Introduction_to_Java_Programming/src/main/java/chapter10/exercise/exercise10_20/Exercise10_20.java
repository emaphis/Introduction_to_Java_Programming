/*
 * Exercise 10.20
 *  (Approximate e) Programming Exercise 5.26 approximates e using the following
 *  series:
 *
 *      e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
 *
 *  In order to get better precision, use BigDecimal with 25 digits of precision
 *  in the computation. Write a program that displays the e value for i = 100,
 *  200, . . . , and 1000.
 */

package chapter10.exercise.exercise10_20;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Compute e using BigDecimal class
 * @author emaph
 */
public class Exercise10_20 {

    public static void main(String args[]) {
        for (int i = 100; i <= 1000; i += 100) {
            System.out.println("The is is " + calcE(i) + " for i = " + i);
        }
    }

    private static BigDecimal calcE(int iterations) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal item = BigDecimal.ONE;

        for (int i = 1; i <= iterations; i++) {
            item = item.divide(BigDecimal.valueOf(i), 25, RoundingMode.UP);
            e = e.add(item);
        }
        return e;
    }
}

// From Wikipedia
//         2.71828182845904523536028747135266249775724709369995.
// Math.E: 2.718281828459045
/*
The is is 2.7182818284590452353602960 for i = 100
The is is 2.7182818284590452353603060 for i = 200
The is is 2.7182818284590452353603160 for i = 300
The is is 2.7182818284590452353603260 for i = 400
The is is 2.7182818284590452353603360 for i = 500
The is is 2.7182818284590452353603460 for i = 600
The is is 2.7182818284590452353603560 for i = 700
The is is 2.7182818284590452353603660 for i = 800
The is is 2.7182818284590452353603760 for i = 900
The is is 2.7182818284590452353603860 for i = 1000
*/
