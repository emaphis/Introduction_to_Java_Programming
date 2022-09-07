/*
 * Listing 12.15
 * 12.11.3 Reading Data Using Scanner
 */
package chapter12.example.listing12_15;

import java.util.Scanner;

/**
 * Reading Data Using Scanner
 * @author emaph
 */
public class ReadData {
    public static void main(String[] args) throws Exception {
        // Create a file instance
        java.io.File file = new java.io.File("resource/txt/scores.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }

        // Close the file
        input.close();
    }
}

/*
John T Smith 90
Eric K Jones 85
*/
