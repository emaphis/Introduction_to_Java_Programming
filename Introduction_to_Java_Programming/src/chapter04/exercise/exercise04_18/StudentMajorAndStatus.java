/*
 * Exercise 4.18
 *  Student major and status) Write a program that prompts the user to enter two
 *  characters and displays the major and status represented in the characters. The
 *  first character indicates the major and the second is a number character 1, 2, 3, or
 *  4 which indicates whether a student is a freshman, sophomore, junior, or senior.
 *  Suppose that the following characters are used to denote the majors:
 *
 *  M: Mathematics
 *  C: Computer Science
 *  I: Information Technology
 */
package chapter04.exercise.exercise04_18;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String line = input.nextLine();

        char subjectCode = line.charAt(0);
        char studentCode = line.charAt(1);

        boolean valid = true;
        String subject = "";
        String student = "";

        switch (subjectCode) {
            case 'M': subject = "Mathematics"; break;
            case 'C': subject = "Computer Science"; break;
            case 'I': subject = "Information Technology"; break;
            default: valid = false;
        }

        switch (studentCode) {
            case '1': student = "Freshman"; break;
            case '2': student = "Sophmore"; break;
            case '3': student = "Junior"; break;
            case '4': student = "Senior"; break;
            default: valid = false;
        }

        if (valid) {
            System.out.println(subject + " " + student);
        } else {
            System.out.println("Invalid inputS");
        }
    }
}
