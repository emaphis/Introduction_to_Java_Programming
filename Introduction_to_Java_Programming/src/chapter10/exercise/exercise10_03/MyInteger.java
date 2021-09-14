/*
 * Exercise 10.3
 * MyIntger class
 */
package chapter10.exercise.exercise10_03;


/**
 *
 * @author emaph
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return MyInteger.isEven(this.value);
    }

    public boolean isOdd() {
        return MyInteger.isOdd(this.value);
    }

    public boolean isPrime() {
        return MyInteger.isPrime(this.value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    // See Listing 5.15
    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0) {    // If true, number is not prime
                return false;
            }
        }

        return true;   // Number is prime
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public  boolean equals(MyInteger value) {
        return this.value == value.getValue();
    }

    static int parseInt(String value) {
        return Integer.parseInt(value);
    }

    static int parseInt(char[] value) {
        String out = "";
        for (int i = 0; i < value.length; i++) {
            out += value[i];
        }
        return Integer.parseInt(out);
    }

}