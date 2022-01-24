/*
 * Listing 5.7
 * 5.9 Nested Loops
 */
package chapter05.example.listing05_07;

/**
 * Print out a multiplication table
 * @author emaph
 */
public class MultiplicationTable {

    /**
     * Main method
     */
    public static void main(String args[]) {
        // Display the table heading
        System.out.println(" Multiplication Table");

        // Display hte number title
        System.out.print("    ");
        for (int j = 1; j <= 9; j++)
            System.out.print("   " + j);
        System.out.println("\n — — — — — — — — — — — — — — — — — — — —");

        // Display table body.
        for (int i = 1; i <= 9; i++) {
           System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
