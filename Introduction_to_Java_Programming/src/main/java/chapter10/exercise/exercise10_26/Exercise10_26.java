/*
 * Exercise 10.26
 *  (Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as a
 *  string in which the operands and operator are separated by zero or more spaces.
 *  For example, 3+4 and 3 + 4 are acceptable expressions.
 *  Here is a sample run:
 *
 *  > java Exercise10_26 "3+4"
 *  3 + 4 = 7
 *  > java Exercise10_26 "3 + 4"
 *  3 + 4 = 7
 *  > java Exercise10_26 "3 +     4"
 *  3 + 4 = 7
 */
package chapter10.exercise.exercise10_26;


/**
 * Revised Calculator
 * @author emaph
 */
public class Exercise10_26 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Calculator \"operand1 operator operand2\"");
            System.exit(1);
        }

        String expr = normalizeExpression(args[0]);
        String[] tokens = expr.split(" ");

        int num1 = Integer.parseInt(tokens[0]);
        String opr = tokens[1];
        int num2 = Integer.parseInt(tokens[2]);

        // The result of the operaion
        int result = 0;

        // Determine the operator
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }

        // Display result
        System.out.println(num1 + " " + opr + " " + num2 + " = " + result);
    }

    /** Remove excess blanks from expression string */
    private static String normalizeExpression(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chr == '+' || chr == '-' || chr == '*' || chr == '/') {
                result.append(' ');
                result.append(chr);
                result.append(' ');
            }
            else if (Character.isDigit(chr)) {
                result.append(chr);
            }
            // else skip
        }
        return result.toString();
    }
}
