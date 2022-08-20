/*
 * Listing 10.9
 * 10.9 The BigInteger and BigDecimal Classes
 */
package chapter10.example.listing10_09;

import java.util.Scanner;
import java.math.*;

/**
 * Calculate Factorial using BigIntegers
 * @author emaph
 */
public class LargeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextLong();
        System.out.println(n + "! is \n" + factorial(n));
    }

    private static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}

/*
Enter an integer: 50
50! is
30414093201713378043612608166064768844377641568960512000000000000
*/