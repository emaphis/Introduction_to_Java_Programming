/*
 * Exercise 12.9
 *  (BinaryFormatException) Exercise 12.7 implements the bin2Dec method
 *  to throw a BinaryFormatException if the string is not a binary string. Define
 *  a custom exception called BinaryFormatException. Implement the bin2Dec
 *  method to throw a BinaryFormatException if the string is not a binary string
 */
package chapter12.exercise.exercise12_09;

import java.util.Scanner;

/**
 * BinaryFormatException 2
 * @author emaph
 */
public class Exercise12_09 {
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
        catch (BinaryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /** Converts a binary string to a number,
     *  throws an exception if not a binary string */
    public static int bin2Dec(String bin) throws BinaryFormatException {
        int decimalValue = 0;
        for (int i = 0; i < bin.length(); i++) {
            int dec = binCharToDecimal(bin.charAt(i));
            if (dec == 9)
                throw new BinaryFormatException(bin);
            decimalValue = decimalValue * 2 + dec;
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
                return 9;
        }
    }

}

/*
Enter a binary number: 101
The decimal value of binary number 101 is 5

Enter a binary number: 105
Invalid binary string 105
*/
