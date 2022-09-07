/*
 * Listing 12.13
 * 12.11.1 Writing Data Using PrintWriter
 */
package chapter12.example.listing12_13;

/**
 * Create and populate resource/txt/scores.txt file
 * @author emaph
 */
public class WriteData {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("resource/txt/scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // Create file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formated output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        // Close the file
        output.close();
    }
}
