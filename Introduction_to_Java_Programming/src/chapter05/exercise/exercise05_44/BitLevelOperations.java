/*
 * Exercise 5.44
 *  (Computer architecture: bit-level operations) A short value is stored in 16 bits.
 *  Write a program that prompts the user to enter a short integer and displays the 16
 *  bits for the integer. Here are sample runs:
 *
 *  Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
 *  operator (&), which are covered in Appendix G, Bitwise Operations.)
 */
package chapter05.exercise.exercise05_44;

import java.util.Scanner;

/**
 * Bit-level operations
 * @author emaph
 */
public class BitLevelOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bits = "";

        // Read number to convert to binary.
        System.out.print("Enter an integer: ");
        short number = input.nextShort();

        for (int i = 0; i < 16; i++) {

            // extract last bit
            short bit = (short) (number & 0b1);

            // accumulate bits
            bits = bit + bits;

            // devide by 2 by right shifting...
            number = (short) (number >> 1);
        }

        System.out.println("The bits are " + bits);
    }
}
