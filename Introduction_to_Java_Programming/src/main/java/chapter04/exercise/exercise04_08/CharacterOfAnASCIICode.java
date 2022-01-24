/*
 * Exercise 4.8
 *  (Find the  character of an ASCII code) Write a program that receives an ASCII code
 *  (an integer between 0 and 127) and displays its character.
 *
 * Test Run:
 *  Enter an ASCII code: 69
 *  The character for ASCII code 69 is E
 */
package chapter04.exercise.exercise04_08;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CharacterOfAnASCIICode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        byte code = input.nextByte();
        char chr = (char) code;

        System.out.println("The character for ASCII code " + code + " is " + chr);
    }
}
