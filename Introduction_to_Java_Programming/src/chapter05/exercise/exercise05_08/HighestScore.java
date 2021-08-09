/*
 * Exercise 5.8
 *  Find the highest score) Write a program that prompts the user to enter the num-
 *  ber of students and each student’s name and score, and finally displays the name
 *  of the student with the highest score. Use the next() method in the Scanner
 *  class to read a name, rather than using the nextLine() method. Assume that the
 *  number of students is at least 1.
 */
package chapter05.exercise.exercise05_08;

import java.util.Scanner;

/**
 * Find the highest score.
 * @author emaph
 */
public class HighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int highestScore = -999;
        String highestStudent = "";

        for (int i = 1; i <= number; i++) {
            // Get Student.
            System.out.print("Enter student " + i + " name: ");
            String student = input.next();
            System.out.print("Enter student " + i + " score: ");
            int score = input.nextInt();
            System.out.println();

            if (score > highestScore) {
                highestScore = score;
                highestStudent = student;
            }
        }

        // Print highest student
        System.out.println("Highest student " + highestStudent + " scored " + highestScore);
    }
}
