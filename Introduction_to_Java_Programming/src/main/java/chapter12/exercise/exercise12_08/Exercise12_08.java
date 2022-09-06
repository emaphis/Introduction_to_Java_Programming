/*
 * Exercise 12.8
 *  (HexFormatException) Programming Exercise 12.6 implements the
 *  hex2Dec method to throw a NumberFormatException if the string is
 *  not a hex string. Define a custom exception called HexFormatException.
 *  Implement the hex2Dec method to throw a HexFormatException if the
 *  string is not a hex string.
 */
package chapter12.exercise.exercise12_08;

import java.util.Scanner;

/**
 * HexFormatException
 * @author emaph
 */
public class Exercise12_08 {
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
        catch (HexFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /** Converts an upper case hex string to a number,
     *  throws an exception if not a hex string */
    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (!checkRange(hexChar))
                throw new HexFormatException(hex);
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
Invalid hex string FGAA
*/
