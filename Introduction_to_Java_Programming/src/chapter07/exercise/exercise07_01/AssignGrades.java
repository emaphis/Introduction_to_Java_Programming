/*
 * Exerccise 7.1
 *  (Assign grades) Write a program that reads student scores, gets the best score, and
 *  then assigns grades based on the following scheme:
 *
 *      Grade is A if score is >= best -10;
 *      Grade is B if score is >= best -20;
 *      Grade is C if score is >= best -30;
 *      Grade is D if score is >= best -40;
 *      Grade is F otherwise.
 *
 *  The program prompts the user to enter the total number of students, then prompts
 *  the user to enter all of the scores, and concludes by displaying the grades.
 */
package chapter07.exercise.exercise07_01;

import java.util.Scanner;

/**
 * Assign Grades
 * @author emaph
 */
public class AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        int[] scores = new int[number];
        int best = -999;

        System.out.print("Enter " + number + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            best = Math.max(best, scores[i]);
        }

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            String grade = grade(best, score);
            System.out.println("Student " + i + " score is " + score
                    + " and grade is " + grade);
        }
    }

    static String grade(int best, int score) {
        String str;

        if (score >= best - 10)
            str = "A";
        else if (score >= best - 20)
            str = "B";
        else if (score >= best - 30)
            str = "C";
        else if (score >= best - 40)
            str = "D";
        else
            str = "F";

        return str;
    }
}
