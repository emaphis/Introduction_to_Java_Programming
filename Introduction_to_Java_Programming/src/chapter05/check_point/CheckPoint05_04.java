/*
 * Check Point 5.4
 *  based on  Listing 5.4
 * 5.4 Loop Design Strategies
 */
package chapter05.check_point;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CheckPoint05_04 {

    // 5.4.1 Revise the code using the System.nanoTime() to measure the time in nano seconds.
    // orig program:  Test time is 50 seconds
    // nono program:  Test time (nano) is 30873668 seconds

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0;   // Count the number of quesionts
        long startTime = System.nanoTime();
        String output = " ";  // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit integers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // 2. If number1 < number2, swap number1 with numbe2
            if (number1 < number2) {
                int temp = number1;
                number1= number2;
                number2 = temp;
            }

            // 3. prompt user for answer.
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            }
            else {
                System.out.println("YOur answer is wrong.\n" + number1
                    + " - " + number2 + " should be " + (number1 - number2));
            }

            // Increase the question count
            count++;

            output += "\n" + number1 + "–" + number2 + "=" + answer +
                ((number1 - number2 == answer) ? " correct": " wrong");
        }

        long endTime = System.nanoTime();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
            "\nTest time (nano) is " + testTime / 1000 + " seconds\n" + output);
    }
}
