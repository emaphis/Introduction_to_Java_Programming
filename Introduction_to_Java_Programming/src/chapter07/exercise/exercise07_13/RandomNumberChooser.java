/*
 * Exercise 7.13
 *  (Random number chooser) Write the following method that returns a random
 *  number between start and end, excluding the numbers.
 *
 *      public static int getRandom(int start, int end, int... numbers)
 *
 *  For example, invoking getRandom(1,100,4,8,95,93) returns a random num-
 *  ber between 1 and 100 excluding 4,8,95,and 93. Write a test program that
 *  invokes getRandom(1,100,4,8,95,93) 45 times and displays the resulting
 *  numbers 15 per line using the format %4d.
 */
package chapter07.exercise.exercise07_13;

/**
 * Random number chooser
 * @author emaph
 */
public class RandomNumberChooser {
    public static void main(String[] args) {
        final int END = 45;
        final int BREAK = 15;

        for (int i = 0; i < END; i++) {
            int rnd = getRandom(1, 100,             // range
                                  4, 8, 95, 93);    // forbidden numbers
            if ((i + 1) % BREAK == 0)
                System.out.printf("%4d\n", rnd);
            else
                System.out.printf("%4d", rnd);
        }
    }

    public static int getRandom(int start, int end, int... numbers) {
        int num = 0;

        do {
            num = start + (int) (Math.random() * (end - start));
        } while (invalid(num, numbers));

        return num;
    }

    /**
     * Check if number is on forbidden list
     * return true if number is invalid
     */
    public static boolean invalid(int num, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i])
                return true;   // number is invalid
        }
        return false;  // not found, number is valid.
    }
}
