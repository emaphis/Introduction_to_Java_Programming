/*
 * Exercise 9.4
 *  (Use the Random class) Write a program that creates a Random object with seed
 *  1000 and displays the first 50 random integers between 0 and 100 using the
 *  nextInt(100) method.
 */
package chapter09.exercise.exercise09_04;

import java.util.Random;

/**
 * Use the Random class
 * @author emaph
 */
public class UseRandomClass {
    public static void main(String[] args) {
        final int END = 50;
        final int SEED = 1000;
        final int BOUND = 100;

        Random rand = new Random(SEED);

        for (int i = 1; i <= END; i++) {
            int num = rand.nextInt(BOUND);

            if (i % 10 == 0)
                System.out.printf("%4d\n", num);
            else
                System.out.printf("%4d", num);
        }
    }
}
