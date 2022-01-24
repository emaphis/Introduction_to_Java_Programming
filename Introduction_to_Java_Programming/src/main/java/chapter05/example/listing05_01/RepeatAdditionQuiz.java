/*
 * Listing 5.1
 * The while loop.
 */
package chapter05.example.listing05_01;

import java.util.Scanner;

/**
 * @author emaph
 */
public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random()* 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is "
                + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }

        System.out.println("You got it!");
    }
}
