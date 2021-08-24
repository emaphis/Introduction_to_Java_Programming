/*
 * Exercise 7.35
 *  (Game: hangman) Write a hangman game that randomly generates a word and
 *  prompts the user to guess one letter at a time, as presented in the sample run.
 *  Each letter in the word is displayed as an asterisk. When the user makes a correct
 *  guess, the actual letter is then displayed. When the user finishes a word, display
 *  the number of misses and ask the user whether to continue to play with another
 (  word. Declare an array to store words, as follows:
 */
package chapter07.exercise.exercise07_35;

import java.util.Scanner;

/**
 * Hangman
 * @author emaph
 */
public class hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Just a list of words
        String[] words = {"number", "misses", "user", "whether", "continue",
                "play", "with", "another", "guess", "actual", "letter", "then",
                "displayed", "when", "user", "finish", "word", "display" };

        boolean play = true;

        while (play) {
            String word = randomWord(words);

            int missed = playRound(word, input);

            System.out.println("The word is '" + word + "'. You missed " + missed);

            System.out.print("Do you want to guess another word?  Enter y or n> ");
            String again = input.next();

            play = again.equals("y");
        }
    }

    private static String randomWord(String[] words) {
        int idx = 1 + (int) (Math.random() * words.length);
        return words[idx];
    }

    /** return number of missed letters */
    private static int playRound(String word, Scanner input) {
        char[] chars = new char[word.length()];
        boolean[] mask = new boolean[word.length()];
        int count = 0;  // number of letters found;
        int missed = 0; // number of misses

        // test code to help test the code.
        //System.out.println("The word to 'guess':  " + word);

        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.charAt(i);
        }

        boolean guess = false;
        while (!guess) {
            System.out.print("(Guess) Enter a letter in word ");
            printChars(chars, mask);
            System.out.print(" > ");
            char ch = input.next().charAt(0);

            int found = findChar(ch, chars, mask);

            switch (found) {
                case -1:
                    System.out.println("   " + ch + " is already in the word");
                    missed++;
                    break;
                case 0:
                    missed++;
                    break;
                default:
                    count += found;
                    break;
            }

            if (count == chars.length)
                guess = true;
        }

        return missed;
    }

    private static void printChars(char[] chars, boolean[] mask) {
        for (int i = 0; i < chars.length; i++) {
            if (mask[i])
                System.out.print(chars[i]);
            else
                System.out.print("*");
        }
    }

    /** returns the number of chars found, -1 means letter is already found */
    private static int findChar(char ch, char[] chars, boolean[] mask) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (ch == chars[i]) {
                if (mask[i] == false) {
                    mask[i] = true;
                    count++;
                } else
                    return -1;
            }
        }
        return count;
    }

}
