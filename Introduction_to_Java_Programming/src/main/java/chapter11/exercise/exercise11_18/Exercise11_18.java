/*
 * Exercise 11.18
 *  (ArrayList of Character) Write a method that returns an array list of Character
 *  from a string using the following header:
 *
 *      public static ArrayList<Character> toCharacterArray(String s)
 *
 *  For example, toCharacterArray("abc") returns an array list that contains
 *  characters 'a', 'b', and 'c'.
 */
package chapter11.exercise.exercise11_18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ArrayList of Character
 * @author emaph
 */
public class Exercise11_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        ArrayList<Character> chrs = toCharacterArray(str);
        System.out.println("char array = " + chrs);

    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> chrs = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            chrs.add(s.charAt(i));
        }

        return chrs;
    }
}

/*
Enter a string: abc
char array = [a, b, c]
*/