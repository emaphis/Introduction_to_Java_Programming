/*
 * Listing 6.8
 * 6.7 Case Study: Converting Hexadecimals to Decimals
 */
package chapter06.example.listing06_08;

import java.util.Scanner;

/**
 * Converting Hexadecimals to Decimals
 * @author emaph
 */
public class Hex2Dec {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value of hex number " + hex + " is "
                    + hexToDecimal(hex.toUpperCase()));
    }


    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
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

}
