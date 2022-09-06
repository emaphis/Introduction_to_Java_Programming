/*
 * Execise 12.1
 *  (NumberFormatException) Listing 7.9, Calculator.java, is a simple
 *  command-line calculator. Note the program terminates if any operand is
 *  nonnumeric. Write a program with an exception handler that deals with
 *  nonnumeric operands; then write another program without using an exception
 *  handler to achieve the same objective. Your program should display a message
 *  that informs the user of the wrong operand type before exiting
 */
package chapter12.exercise.exercise12_01;

/**
 * Calculator with exception
 * @author emaph
 */
public class Exercise12_01 {

    public static void main(String[] args) {
        // Check the number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        // The result of the operaion
        int result = 0;

        // Try parsing
        try {
            // Determine the operator
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
            }

            // Display result
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

        } catch (NumberFormatException ex) {
            System.out.println("Wrong " + ex.getMessage());
        }
    }
}
