/*
 * Listing 12.16 ReplaceText.java
 * 12.11.5 Case Study: Replacing Text
 */
package chapter12.example.listing12_16;

import java.io.*;
import java.util.*;

/**
 * Replacing Text
 * @author emaph
 */
public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {
        // Check command line parameter usage
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if source file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exist");
            System.exit(3);
        }

        try (
            // Create input files and output files
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
        )   {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }
        }
    }
}
