/*
 * Exercise 3.10
 *  (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
 *  subtraction question. Revise the program to randomly generate an addition ques-
 *  tion with two integers less than 100.
 */
package chapter03.exercise.exercise03_10;

import java.util.Scanner;

/**
 * Addition quiz.
 * @author emaph
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        // two integers less than 100
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        // prompt user for answer.
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // grade answer
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("YOur answer is wrong");
            System.out.println(number1 + " + " + number2 + " should be "
                    + (number1 + number2));
        }
    }
}
