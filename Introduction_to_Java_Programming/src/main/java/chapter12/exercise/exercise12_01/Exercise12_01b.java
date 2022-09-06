/*
 * Exercise 12.1 B
 * Doesn't use exceptions.
 */
package chapter12.exercise.exercise12_01;

/**
 *
 * @author emaph
 */
public class Exercise12_01b {
public static void main(String[] args) {
        // Check the number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        // The result of the operaion
        int result = 0;

        if (!isNumeric(args[0])) {
            System.out.println("Wrong Input: " + args[0]);
            System.exit(0);
        }


        if (!isNumeric(args[2])) {
            System.out.println("Wrong Input: " + args[2]);
            System.exit(0);
        }

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
    }

    /**
     * Determine if input is an integer using regex
     * See Check Point 12.6
     */
    public static boolean isNumeric(String token) {
        return token.matches("[0-9]+[\\.]?[0-9]*");
    }
}
