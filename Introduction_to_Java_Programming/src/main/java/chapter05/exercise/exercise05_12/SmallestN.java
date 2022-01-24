/*
 * Exercise 5.12
 *  (Find the smallest n such that n^n > 12,000) Use a while loop to find the small-
 *  est integer n such that n2 is greater than 12,000.
 */
package chapter05.exercise.exercise05_12;

/**
 * @author emaph
 */
public class SmallestN {
    public static void main(String[] args) {
        int number = 1;

        while (number * number < 12000) {
            number++;
        }

        System.out.println("number = " + number);
    }
}
// a.  110