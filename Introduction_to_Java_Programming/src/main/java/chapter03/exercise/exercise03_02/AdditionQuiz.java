/*
 * Exercise 3.2
 *  (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, gen-
 *  erates two integers and prompts the user to enter the sum of these two integers.
 *  Revise the program to generate three single-digit integers and prompt the user to
 *  enter the sum of these three integers.
 */
package chapter03.exercise.exercise03_02;

import java.util.Scanner;

/**
 * Addition Quiz
 * @author emaph
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() / 5 % 10);
        int num3 = (int) (System.currentTimeMillis() / 3 % 10);

        int correct = num1 + num2 + num3;

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");

        int answer = input.nextInt();

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " +
                (correct == answer));
    }
}
