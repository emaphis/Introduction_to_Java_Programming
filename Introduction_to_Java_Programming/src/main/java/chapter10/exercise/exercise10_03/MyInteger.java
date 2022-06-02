/*
 * Exercise 10.3
 * MyIntger class
 */
package chapter10.exercise.exercise10_03;


/**
 *
 * A class to represent integers
 * @author emaph
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    /** Return value */
    public int getValue() {
        return value;
    }

    /** Return true if this value is even */
    public boolean isEven() {
        return isEven(this.value);
    }

    /** return true if this value is odd, */
    public boolean isOdd() {
        return isOdd(this.value);
    }

    /** return true if this value is prime, */
    public boolean isPrime() {
        return isPrime(this.value);
    }

    /** return true if the specified value is even, */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /** return true if the specified value is odd, */
    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    // See Listing 5.15
    /** return true if the specified value is prime, */
    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) {    // If true, number is not prime
                return false;
            }
        }

        return true;   // Number is prime
    }

    /** Return true if MyValue is even */
    public static boolean isEven(MyInteger value) {
        return value.isEven();
    }

    /** Return true if MyValue is odd */
    public static boolean isOdd(MyInteger value) {
        return value.isOdd();
    }

    /** Return true if MyValue is prime */
    public static boolean isPrime(MyInteger value) {
        return value.isPrime();
    }

    /** return true if the value in this object is equal to the specified value.*/
    public boolean equals(int value) {
        return this.value == value;
    }

    /** return true if the value in this object is equal to the specified value.*/
    public  boolean equals(MyInteger value) {
        return this.value == value.getValue();
    }

    /** converts an array of numeric characters to an int value.*/
    static int parseInt(String value) {
        return Integer.parseInt(value);
    }

    /** converts an String to an int value.*/
    static int parseInt(char[] value) {
        String out = "";
        for (int i = 0; i < value.length; i++) {
            out += value[i];
        }
        return Integer.parseInt(out);
    }

}