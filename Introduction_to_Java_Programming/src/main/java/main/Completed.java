/*
 * Exercises completed
 */
package main;

/**
 *
 * @author emaph
 */
public class Completed {
    static int[] exercises = {
        13, // ch 01
        23, // ch 02
        34, // ch 03
        26, // ch 04
        51, // ch 05
        39, // ch 06
        37, // ch 07
        36, // ch 08
        13, // ch 09
        28, // ch 10
        19  // ch 11
    };

    public static void main(String[] args) {
        int sum = 0;
        for (int num : exercises) {
            sum += num;
        }
        System.out.println("I have finished " + exercises.length + " chapters with " +
                sum + " exercises completed. ");
    }

}
