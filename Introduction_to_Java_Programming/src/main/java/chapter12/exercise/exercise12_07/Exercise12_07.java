/*
 * Exercise 12.7
 *  (NumberFormatException) Write the bin2Dec(String binaryString)
 *  method to convert a binary string into a decimal number. Implement the
 *  bin2Dec method to throw a NumberFormatException if the string is not a
 *  binary string. Write a test program that prompts the user to enter a binary
 *  number as a string and displays its decimal equivalent. If the method throws
 *  an exception, display “Not a binary number”.
 */
package chapter12.exercise.exercise12_07;

import java.util.Scanner;

/**
 * NumberFormatException 2
 * @author emaph
 */
public class Exercise12_07 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a binary number: ");
        String bin = input.nextLine();
        input.close();

        try {
            int number = bin2Dec(bin.toUpperCase());
            System.out.println("The decimal value of binary number " + bin + " is " + number);
        }
        catch (NumberFormatException ex) {
            System.out.println("Not a binary number");
        }
    }

    /** Converts a binary string to a number,
     *  throws an exception if not a binary string */
    public static int bin2Dec(String bin) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < bin.length(); i++) {
            char binChar = bin.charAt(i);
            decimalValue = decimalValue * 2 + binCharToDecimal(binChar);
        }

        return decimalValue;
    }

    private static int binCharToDecimal(char ch) {
        switch (ch) {
            case '0':
                return 0;
            case '1':
                return 1;
            default:
                throw new NumberFormatException();
        }
    }

}

/*
Enter a binary number: 101
The decimal value of binary number 101 is 5

Enter a binary number: 5
Not a binary number
*/
