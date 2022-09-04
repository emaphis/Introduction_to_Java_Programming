/*
 * Exercise 11.16
 *  (Addition quiz) Rewrite Listing 5.1, RepeatAdditionQuiz.java, to alert the user
 *  if an answer is entered again. (Hint: use an array list to store answers.) Here is a
 *  sample run of the program:
 */
package chapter11.exercise.exercise11_16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author emaph
 */
public class Exercise11_16 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        ArrayList<Integer> answers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        answers.add(answer);

        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is "
                + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            if (answers.contains(answer)) {
                System.out.println("You already answered " + answer);
            } else
                answers.add(answer);
        }

        System.out.println("You got it!");
    }
}

/*
What is 1 + 8? 13
Wrong answer. Try again. What is 1 + 8? 11
Wrong answer. Try again. What is 1 + 8? 13
You already answered 13
Wrong answer. Try again. What is 1 + 8? 13
You already answered 13
Wrong answer. Try again. What is 1 + 8? 9
You got it!
*/
