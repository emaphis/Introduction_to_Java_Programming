/*
 * Listing 12.14
 * 12.11.2 Closing Resources Automatically Using try-with-resources
 */
package chapter12.example.listing12_14;

/**
 *
 * @author emaph
 */
public class WriteDataWithAutoClose {

    public static void main(String[] args) throws Exception {
        // Create a file instance
        java.io.File file = new java.io.File("resource/txt/scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        // Write formated output to the file
        try (
            // Create file
            java.io.PrintWriter output = new java.io.PrintWriter(file)
        ) {
            // Write formated output to the file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
            // Close the file not used with try-rescource.
        }
    }
}
