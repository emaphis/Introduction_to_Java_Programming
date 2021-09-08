/*
 * Exercise 8.36
 *  (Latin square) A Latin square is an n-by-n array filled with n different Latin let-
 *  ters, each occurring exactly once in each row and once in each column. Write a
 *  program that prompts the user to enter the number n and the array of characters,
 *  as shown in the sample output, and checks if the input array is a Latin square.
 *  The characters are the first n characters starting from A.
 */
package chapter08.exercise.exercise08_36;

import java.util.Scanner;

/**
 * Latin square
 * @author emaph
 */
public class LatinSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number n: ");
        final int num = input.nextInt();
        System.out.println("Enter" + num + " rows of letters separted by spaces: ");
        char[][] matrix = getSquare(num, input);
        if (matrix != null && isLatinSquare(matrix)) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("The input array is not a Latin square");
        }
    }


    public static boolean isLatinSquare(char[][] square) {
        return isDistinctRows(square) && isDistinctColumns(square);
    }

    /** check that each row contains distinct symbols*/
    public static boolean isDistinctRows(char[][] s) {
            for (int i = 0; i < s.length; i++) {
                    // Symbol counts, should only be one each
                    int[] symbols = new int[s.length];
                    for (int j = 0; j < s[i].length; j++) {
                            int idx = s[i][j] - 'A';
                            symbols[idx]++;
                            if (symbols[idx] > 1)
                                    return false;
                    }
            }
            return true;
    }

    /** Check that each column contains distinct symbols */
    public static boolean isDistinctColumns(char[][] s) {
            for (int i = 0; i < s.length; i++) {
                    // Symbol counts, should only be one each
                    int[] symbols = new int[s[0].length];
                    for (int j = 0; j < s[i].length; j++) {
                            int idx = s[j][i] - 'A';
                            symbols[idx]++;
                            if (symbols[idx] > 1)
                                    return false;
                    }
            }
            return true;
    }

    private static char[][] getSquare(int size, Scanner input) {
        char[][] square = new char[size][size];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                char ch = Character.toUpperCase(input.next().charAt(0));
                if (!inRange(ch, size)) {
                    System.out.printf("Wrong input: the letter must be from A to %c\n",
                            (char)('A' + size));
                    return null;
                }
                square[i][j] = ch;
            }
        }
        return square;
    }

    private static boolean inRange(char ch, int end) {
        return ch >= 'A' && ch <= (char) ('A' + end);
    }
}
