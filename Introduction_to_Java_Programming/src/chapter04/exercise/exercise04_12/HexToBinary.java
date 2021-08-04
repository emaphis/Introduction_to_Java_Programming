/*
 * Exercise 4.12
 */
package chapter04.exercise.exercise04_12;

import java.util.Scanner;

/**
 * Convert a hexadecimal number to binary
 * @author emaph
 */
public class HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String str = input.nextLine();
        str = str.toUpperCase();
        char hex = str.charAt(0);

        if ((hex >= 'A' && hex <= 'F') || (hex >='0' && hex <= '9')) {
            String value = "";
            switch (hex) {
                case '0': value = "0000"; break;
                case '1': value = "0001"; break;
                case '2': value = "0010"; break;
                case '3': value = "0011"; break;
                case '4': value = "0100"; break;
                case '5': value = "0101"; break;
                case '6': value = "0110"; break;
                case '7': value = "0111"; break;
                case '8': value = "1000"; break;
                case '9': value = "1001"; break;
                case 'A': value = "1010"; break;
                case 'B': value = "1011"; break;
                case 'C': value = "1100"; break;
                case 'D': value = "1101"; break;
                case 'F': value = "1111";
            }
            System.out.println("The binary value is " + value);
        } else {
            System.out.println("Invalid input");
        }

    }
}
