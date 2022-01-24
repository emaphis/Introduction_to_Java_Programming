/*
 * Listing 3.1
 */
package chapter03.example.listing03_01;

import java.util.Scanner;

/**
 * Addition Quiz
 * @author emaph
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " +
                (number1 + number2 == answer));
    }
}
