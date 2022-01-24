/*
 * Exercise 5.13
 *  Find the largest n such that n3 < 12,000) Use a while loop to find the largest
 *  integer n such that n3 is less than 12,000.
 */
package chapter05.exercise.exercise05_13;

/**
 * @author emaph
 */
public class LargestN {
    public static void main(String[] args) {
        int number = 100;  // suitably large.

        while (number * number * number > 12000) {
            number--;
        }

        System.out.println("number = " + number);
    }
}
// a. number = 22