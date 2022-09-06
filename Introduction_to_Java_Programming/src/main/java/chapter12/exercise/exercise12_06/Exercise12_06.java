/*
 * Exercise 12.6
 *  (NumberFormatException) Listing 6.8 implements the hex2Dec(String
 *  hexString) method, which converts a hex string into a decimal number.
 *  Implement the hex2Dec method to throw a NumberFormatException if the
 *  string is not a hex string. Write a test program that prompts the user to enter
 *  a hex number as a string and displays its decimal equivalent. If the method
 *  throws an exception, display “Not a hex number”.
 */
package chapter12.exercise.exercise12_06;

import java.util.Scanner;

/**
 * NumberFormatException
 * @author emaph
 */
public class Exercise12_06 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        input.close();

        try {
            int number = hexToDecimal(hex.toUpperCase());
            System.out.println("The decimal value of hex number " + hex + " is " + number);
        }
        catch (NumberFormatException ex) {
            System.out.println("Not a hex number");
        }
    }

    /** Converts an upper case hex string to a number,
     *  throws an exception if not a hex string */
    public static int hexToDecimal(String hex) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!checkRange(hexChar))
                throw new NumberFormatException();
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    private static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }

    private static boolean checkRange(char ch) {
        return (ch >= '0' && ch <= '9') ||
               (ch >= 'A' && ch <= 'F');
    }
}

/*
Enter a hex number: FFAA
The decimal value of hex number FFAA is 65450

Enter a hex number: FGAA
Not a hex number
*/
