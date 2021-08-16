/*
 * Exercise 6.12
 *  (Display characters) Write a method that prints characters using the following
 *  header:
 *
 *``    public static void printChars(char ch1, char ch2, int numberPerLine)
 *
 *  This method prints the characters between ch1 and ch2 with the specified num-
 *  bers per line. Write a test program that prints 10 characters per line from 1 to Z.
 *  Characters are separated by exactly one space.
 */
package chapter06.exercise.exercise06_12;

/**
 * Display characters
 * @author emaph
 */
public class DisplayCharacters {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }


    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 1;

        for (char chr = ch1; chr <= ch2; chr++) {
            System.out.print(chr + " ");

            if (count % 10 == 0)
                System.out.println();

            count++;
        }

        System.out.println();
    }
}
