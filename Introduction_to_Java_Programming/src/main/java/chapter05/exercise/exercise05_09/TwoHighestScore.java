/*
 * Exercise 5.9
 *  (Find the two highest scores) Write a program that prompts the user to enter the
 *  number of students and each student’s name and score, and finally displays the
 *  student with the highest score and the student with the second-highest score. Use
 *  the next() method in the Scanner class to read a name rather than using the
 *  nextLine() method. Assume that the number of students is at least 2.
 */
package chapter05.exercise.exercise05_09;


import java.util.Scanner;

/**
 * Find the two highest scores.
 * @author emaph
 */
public class TwoHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        int highestScore1 = -999;
        String highestStudent1 = "";
        int highestScore2 = -999;
        String highestStudent2 = "";

        for (int i = 1; i <= number; i++) {
            // Get Student.
            System.out.print("Enter student " + i + " name: ");
            String student = input.next();
            System.out.print("Enter student " + i + " score: ");
            int score = input.nextInt();
            System.out.println();

            if (score > highestScore1) {
                highestScore2 = highestScore1;
                highestStudent2 = highestStudent1;

                highestScore1 = score;
                highestStudent1 = student;
            } else if (score > highestScore2) {
                highestScore2 = score;
                highestStudent2 = student;
            }
        }

        // Print highest studente
        System.out.println("First highest student " + highestStudent1 + " scored " + highestScore1);
        System.out.println("Second highest student " + highestStudent2 + " scored " + highestScore2);
    }
}
