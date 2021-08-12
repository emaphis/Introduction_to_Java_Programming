/*
 * Exercise 5.40
 *  (Simulation: heads or tails) Write a program that simulates flipping a coin one
 *  million times and displays the number of heads and tails.
 */
package chapter05.exercise.exercise05_40;

/**
 * heads or tails
 * @author emaph
 */
public class HeadsOrTails {
    public static void main(String[] args) {
        final int END = 1_000_000;
        int headsCount = 0;
        int tailsCount = 0;

        // Run simulatin an END number of times
        for (int i = 0; i < END; i++) {
            boolean flip = Math.random() < 0.5;

            if (flip)
                headsCount++;
            else
                tailsCount++;
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
        System.out.println("Diff: " + Math.abs(headsCount - tailsCount));
    }
}

// Heads: 500143, Tails: 499857
// Diff: 286
