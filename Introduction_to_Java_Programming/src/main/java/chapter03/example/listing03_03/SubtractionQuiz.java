/*
 *  Listing 3.3 .
 */
package chapter03.example.listing03_03;

import java.util.Scanner;

/**
 * Subtraction quiz.
 * @author emaph
 */
public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // If number1 < number2, swap number1 with numbe2
        if (number1 < number2) {
            int temp = number1;
            number1= number2;
            number2 = temp;
        }

        // prompt user for answer.
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // grade answer
        if (number1 - number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("YOur answer is wrong");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
