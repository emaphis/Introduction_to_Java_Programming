/*
 * Exercise 12.11
 *  (Remove text) Write a program that removes all the occurrences of a specified
 *  string from a text file. For example, invoking
 *  java Exercise12_11 John filename
 *  removes the string John from the specified file. Your program should get the
 *  arguments from the command line.
 */
package chapter12.exercise.exercise12_11;

import java.io.*;
import java.util.*;

/**
 * Replacing Text
 * @author emaph
 */
public class Exercise12_11 {
    public static void main(String[] args) throws FileNotFoundException {
        // Check command line parameter usage
        if (args.length != 2) {
            System.out.println("Usage: java Exercise12_11 string filename");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(2);
        }

        ArrayList<String> fileBuffer = getFile(sourceFile);
        System.out.println("got here size: " + fileBuffer.size());
        ArrayList<String> newFile = editFile(fileBuffer, args[0]);
        System.out.println("lenght: " + newFile.size());
        writeFile(newFile);

    }


        static ArrayList<String> getFile(File file) {
            ArrayList<String> buffer = new ArrayList<>();
            try (Scanner input = new Scanner(file)) {
                while (input.hasNext()) {
                    String line = input.nextLine();
                    buffer.add(line);
                }
            }
            catch (FileNotFoundException ex) {
                System.out.println("File not found: " + ex.getMessage());
                System.exit(0);
            }
            return buffer;
        }

        static ArrayList<String> editFile(ArrayList<String> fileBuffer, String token) {
            ArrayList<String> newBuffer = new ArrayList<>();
            System.out.println("token: " + token);
            for (String line : fileBuffer) {
                char[] array = line.toCharArray();
                StringBuilder builder = new StringBuilder();
                int i = 0;
                while (i < array.length) {
                    char chr = array[i];
                    if (chr == token.charAt(0)) {
                        System.out.print( chr + " ");
                       if (checkToken(i, array, token)) {
                           // then skip length of token to edit out token
                           System.out.print(" eee ");
                           i += token.length();
                        }
                    } else {
                        builder.append(chr);
                        i++;
                    }
                }
                newBuffer.add(builder.toString());
            }
            return newBuffer;
        }

        static boolean checkToken(int indx, char[] array, String token) {
            if (array.length - indx > token.length()) {
                for (int i = indx; i < token.length(); i++) {
                    if (array[i] != token.charAt(i))
                        return false;
                }
                return true;
            }
            else {
                return false;  // not long enought
            }
        }

        static void writeFile(ArrayList<String> fileBuffer) {
            for (String line : fileBuffer) {
                System.out.print("ok: ");
                System.out.println(line);
            }
        }
}
