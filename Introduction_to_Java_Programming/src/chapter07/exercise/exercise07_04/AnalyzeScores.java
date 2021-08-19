/*
 * Exercise 7.4
 *  (Analyze scores) Write a program that reads an unspecified number of scores and
 *  determines how many scores are above or equal to the average, and how many
 *  scores are below the average. Enter a negative number to signify the end of the
 *  input. Assume the maximum number of scores is 100.
 *  Similar to Listing 7.1
 */
package chapter07.exercise.exercise07_04;

import java.util.Scanner;

/**
 * Analyze scores
 * @author emaph
 */
public class AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUM = 100; // maximum numbe of scores is 100.

        int[] scores = new int[NUM];
        double sum =  0;
        int count = 0;
        int score;

        System.out.print("Enter the numbers: ");
        for( ; count < NUM; count++) {
            score = input.nextInt();
            //System.out.print(inpt + " ");
            if (score < 0) break;
            scores[count] = score;
            sum += score;
        }

        double average = sum / count;

        // The numbers above average
        int cntAbove = 0;
        int cntBelow = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] > average)
                cntAbove++;
            if (scores[i] < average)
                cntBelow++;
        }

        System.out.println("Count is " + count);
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + cntAbove);
        System.out.println("Number of elements below the average is " + cntBelow);
    }
}
