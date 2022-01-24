/*
 * Exercise 8.20
 *  (Game: connect four) Connect four is a two-player board game in which the
 *  players alternately drop colored disks into a seven-column, six-row vertically
 *  suspended grid,
 *
 *  (Game: connect four) Connect four is a two-player board game in which the
 *  players alternately drop colored disks into a seven-column, six-row vertically
 *  suspended grid,
 */
// TODO: Not quite done!
package chapter08.exercise.exercise08_20;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class ConnectFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] board = init(6, 7);
        play(board, input);
        printBoard(board);
    }

    private static void play (String[][] board, Scanner input) {
        String piece = "Red";
        boolean win = false;

        do {
            printBoard(board);
            System.out.print("Drop a " + piece + " disk at column (0–6): ");
            int i = input.nextInt();
            int j = drop(i, board, piece);
            System.out.println(i + " " + j);
            win = checkWin(i, j, board);
            piece = swap(piece);
            System.out.println("win = " + win);
        } while (win);
        System.out.println("Stop!!");
    }

    private static int drop(int num, String[][] board, String piece) {
        int i = 0;
        for ( ; i < board.length; i++) {
            if (!board[i][num].equals(" "))
                break;
        }
        board[i - 1][num] = piece.substring(0, 1);
        return i - 1;
    }


    public static boolean checkWin(int ii, int jj, String[][] board) {
        boolean consecutive = false;
        for (int i = ii; i < board.length; i++) {
            for (int j = jj; j < board[i].length; j++) {
                consecutive = checkRow(i, j, board) ||
                              checkColumn(i, j, board) ||
                              checkDiagonal(i, j, board) ||
                              checkMinDiagonal(i, j, board);
                if (consecutive) return true;
            }
        }
        return consecutive;
    }

    private static boolean checkRow(int i, int j, String[][] board) {
        if (j > board[i].length - 4)
            return false;
        boolean consecutive = true;
        String piece = board[i][j];
        return piece.equals(board[i][j + 1])
                && piece.equals(board[i][j + 2])
                && piece.equals(board[i][j + 3]);
    }

    private static boolean checkColumn(int i, int j, String[][] board) {
        if (i > board.length - 4)
            return false;
        boolean consecutive = true;
        String piece = board[i][j];
        return piece.equals(board[i + 1][j])
                && piece.equals(board[i + 2][j])
                && piece.equals(board[i + 3][j]);
    }

    private static boolean checkDiagonal(int i, int j, String[][] board) {
        if (i > board.length - 4 || j > board[i].length - 4)
                return false;
        boolean consecutive = true;
        String piece = board[i][j];
        return piece.equals(board[i + 1][j + 1])
                && piece.equals(board[i + 2][j + 2])
                && piece.equals(board[i + 3][j + 3]);
    }

    private static boolean checkMinDiagonal(int i, int j, String[][] board) {
        if (i > board.length - 4 || j < 4)
                return false;
        boolean consecutive = true;
        String piece = board[i][j];
        return piece.equals(board[i + 1][j - 1]) && piece.equals(board[i + 2][j - 2])
                && piece.equals(board[i + 3][j - 3]);
    }


    private static String swap(String piece) {
        return piece.equals("Red") ? "Yellow" : "Red";
    }


    private static String[][] init(int iSize, int jSize) {
        String[][] board = new String[iSize][jSize];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
        return board;
    }

    private static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }
}
