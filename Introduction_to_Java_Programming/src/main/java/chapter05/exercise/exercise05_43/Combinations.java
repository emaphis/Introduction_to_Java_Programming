/*
 * Exercise 5.43
 *  Math: combinations) Write a program that displays all possible combinations
 *  for picking two numbers from integers 1 to 7. Also display the total number of
 *  all combinations.
 *
 *      1 2
 *      1 3
 *      ...
 *      ...
 *
 *
 */
package chapter05.exercise.exercise05_43;


/**
 * Combinations
 * @author emaph
 */
public class Combinations {
    public static void main(String[] args) {
        final int LIMIT = 7;
        int count = 0;

        for (int i = 1; i <= LIMIT; i++) {
            for (int j = i + 1; j <= LIMIT; j++) {
                    System.out.println(i + " " + j);
                    count++;
            }
        }

        System.out.println("\nThe total number of all combinations is " + count);
    }
}
