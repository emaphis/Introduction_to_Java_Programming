/*
 * Exercise 3.14
 *  (Game: heads or tails) Write a program that lets the user guess whether the flip
 *  of a coin results in heads or tails. The program randomly generates an integer
 *  0 or 1, which represents head or tail. The program prompts the user to enter a
 *  guess, and reports whether the guess is correct or incorrect.
 */
package chapter03.exercise.exercise03_14;

import java.util.Scanner;

/**
 * Guess a coin flip.
 * @author emaph
 */
public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess heads or tails,");
        System.out.print("enter 0 for heads, 1 for tails: ");
        int guess = input.nextInt();

        // flip
        int flip = (int) (Math.random() * 2);

        if (guess == flip) {
            System.out.print("Correct guess");
        }
        else {
            System.out.print("Sorry");
        }

        if (flip == 0) {
            System.out.println(", the flip was heads");
        } else {
            System.out.println(", the flip was tails");
        }
    }
}
