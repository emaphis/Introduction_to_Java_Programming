/*
 * Check Point 10.9
 * 10.9 The BigInteger and BigDecimal Classes
 */
package chapter10.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint10_09 {

    // 10.9.1 What is the output of the following code?
    // a.
    // x is 3
    // y is 7
    // z is 10
    static void check1() {
        java.math.BigInteger x = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = x.add(y);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("z is " + z);
    }

    public static void main(String[] args) {
        check1();
    }
}
