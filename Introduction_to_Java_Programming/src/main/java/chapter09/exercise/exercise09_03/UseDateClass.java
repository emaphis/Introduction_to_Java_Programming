/*
 * Exercise 9.3
 *  (Use the Date class) Write a program that creates a Date object, sets its elapsed
 *  time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 *  10000000000, and 100000000000, and displays the date and time using the
 *  toString() method, respectively.
 */
package chapter09.exercise.exercise09_03;

import java.util.Date;

/**
 * Use the Date class
 * @author emaph
 */
public class UseDateClass {
    private static final long START = 10000L;
    private static final long END = 100000000000L;

    public static void main(String[] args) {
        Date date = new Date();
        for (long elapsed = START; elapsed <= END; elapsed *= 10) {
            date.setTime(elapsed);
            System.out.println(date.toString());
        }
    }
}
