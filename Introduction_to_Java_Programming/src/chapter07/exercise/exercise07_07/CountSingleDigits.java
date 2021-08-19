/*
 * Exercise 7.7
 *  (Count single digits) Write a program that generates 100 random integers between
 *  0 and 9 and displays the count for each number. (Hint: Use an array of 10 integers,
 *  say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */
package chapter07.exercise.exercise07_07;

/**
 * Count single digits
 * @author emaph
 */
public class CountSingleDigits {
    public static void main(String[] args) {
        final int NUM_DIGITS = 100;
        int[] digitCount = new int[10];

        for (int i = 0; i < NUM_DIGITS; i++) {
            int digit = getRandomDigit();
            digitCount[digit]++;
        }

        // print results
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + digitCount[i]);
        }
    }

    static int getRandomDigit() {
        return (int) (Math.random() * 10);
    }
}
