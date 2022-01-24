/*
 * Exercise 5.10
 *  (Find numbers divisible by 5 and 6) Write a program that displays all the num-
 *  bers from 100 to 1,000 (10 per line) that are divisible by 5 and 6. Numbers are
 *  separated by exactly one space.
 */
package chapter05.exercise.exercise05_10;

/**
 *
 * @author emaph
 */
public class NumbersDivisibleBy5And6 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100; i <= 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                count++;

                if (count == 10) {
                    count = 0;
                    System.out.println();
                }
            }
        }
    }
}
