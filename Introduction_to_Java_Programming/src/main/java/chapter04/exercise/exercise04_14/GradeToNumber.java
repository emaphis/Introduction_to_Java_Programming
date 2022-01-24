/*
 * Exercise 4.14
 *  (Convert letter grade to number) Write a program that prompts the user to enter
 *  a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3,
 *  2, 1, or 0. For other input, display invalid grade.
 */
package chapter04.exercise.exercise04_14;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class GradeToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String line = input.nextLine();
        line = line.toUpperCase();
        char chr = line.charAt(0);

        int numberGrade = -1;
        switch (chr) {
            case 'A': numberGrade =  4; break;
            case 'B': numberGrade =  3; break;
            case 'C': numberGrade =  2; break;
            case 'D': numberGrade =  1; break;
            case 'F': numberGrade =  0;
        }

        if (numberGrade != -1) {
            System.out.println("The numeric value for grade " + chr + "  is "+ numberGrade);
        } else {
            System.out.println(chr + " is an invalid grade");
        }
    }


}
