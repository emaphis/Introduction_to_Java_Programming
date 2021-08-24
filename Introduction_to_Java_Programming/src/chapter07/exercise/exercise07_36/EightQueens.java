/*
 * Exercise 7.36
 *  (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens on a
 *  chessboard such that no two queens can attack each other (i.e., no two queens are on
 *  the same row, same column, or same diagonal). There are many possible solutions.
 *  Write a program that displays one such solution. A sample output is shown below:
 */
package chapter07.exercise.exercise07_36;

import chapter07.exercise.exercise07_24.CouponCollectorsProblem;

/**
 * Eight Queens
 *
 * @author emaph
 */
public class EightQueens {
    final static int SIZE = 8;

    public static void main(String[] args) {
        // Assume only one Queen per column, each column int stores the
        // rown number of Queen
        int[] columns;
        boolean solved;
        int count = 0;

        do {
            columns = placeRandomQueens();
            solved = isSolved(columns);
            count++;
        } while (!solved);

        printBoard(columns);
        System.out.println("Solved in " + count + " attempts");
    }

    /**
     * for each column place a queen in a random row
     */
    public static int[] placeRandomQueens() {
        int[] columns = {0, 1, 2, 3, 4, 5, 6, 7};

        // shuffle the list of columns
        for (int i = 0; i < columns.length; i++) {
            int index = (int) (Math.random() * columns.length);
            int temp = columns[i];
            columns[i] = columns[index];
            columns[index] = temp;
        }

        return columns;
    }

    /**
     * Check to see if each row, and diagonal has only one Queen.
     */
    public static boolean isSolved(int[] columns) {

        // check fright diagonals
        for (int row = 0; row < SIZE; row++) {
            for (int col = row + 1; col < SIZE; col++) {
                if (columns[col] == (columns[row] - (col - row))) {
                    return false;
                }
            }
        }

        // check left diagonals
        for (int row = 0; row < SIZE; row++) {
            for (int col = row + 1; col < SIZE; col++) {
                if (columns[col] == (columns[row] + (col - row))) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void printBoard(int[] columns) {
        for (int row = 0; row < SIZE; row++) {
            System.out.print("|");
            for (int col = 0; col < SIZE; col++) {
                if (columns[row] == col) {
                    System.out.print("Q|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }

}
