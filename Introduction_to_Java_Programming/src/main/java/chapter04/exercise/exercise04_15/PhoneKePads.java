/*
 * Exercise 4.15
 *  Phone key pads) The international standard letter/number mapping found on the
 *  telephone is shown below:
 *
 *      1 (_ _ _)    2 (a b c)   3 (d e f)
 *      4 (g h i)    5 (j k l)   6 (m n o)
 *      7 (p q r s)  8 (t u v)   9 (w x y z)
 *
 *  Write a program that prompts the user to enter a lowercase or uppercase let-
 *  ter and displays its corresponding number. For a nonletter input, display invalid
 *  input.
 */
package chapter04.exercise.exercise04_15;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class PhoneKePads {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String line = input.nextLine();
        line = line.toLowerCase();
        char chr = line.charAt(0);

        if (chr >= 'a' && chr <= 'z') {
            int num = 0;
            if (chr <= 'c') {
                num = 2;
            } else if (chr <= 'f') {
                num = 3;
            } else if (chr <= 'i') {
                num = 4;
            } else if (chr <= 'l') {
                num = 5;
            } else if (chr <= 'o') {
                num = 6;
            } else if (chr <= 's') {
                num = 7;
            } else if (chr <= 'v') {
                num = 8;
            } else if (chr <= 'z') {
                num = 9;
            }

            System.out.println("The corresponidng number is " + num);
        } else {
            System.out.println(chr + " is an invalid input");
        }
    }
}
