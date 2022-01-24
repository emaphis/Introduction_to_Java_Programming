/*
 * Listing 2.5  DispalyTime.java
*/
package chapter02.examples.listing02_05;

import java.util.Scanner;

/**
 *  Displays time to console
 * @author emaph
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an integer for sconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;   // Find minutes in secons
        int remainingSeconds = seconds % 60;  // find the remaining
        System.out.println(seconds + " seconds is " + minutes +
                "  minuts and " + remainingSeconds + " sseconds");
    }
}
