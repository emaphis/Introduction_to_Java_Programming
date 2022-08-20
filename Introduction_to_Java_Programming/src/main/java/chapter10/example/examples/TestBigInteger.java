/*
 * 10.9 The BigInteger and BigDecimal Classes
 *
 */
package chapter10.example.examples;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * Exercise the BigInteger and BigDecimal Classes
 * @author emaph
 */
public class TestBigInteger {
    private static void exampleA() {
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b);
        System.out.println(c);
        // 18446744073709551614
    }

    private static void exampleB() {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("3");
        BigDecimal c = a.divide(b, 20, RoundingMode.HALF_UP);
        System.out.println(c);
    }

    public static void main(String[] args) {
        exampleA();
        exampleB();
    }
}
