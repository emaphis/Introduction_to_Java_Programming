/*
 * Exercise 8.9
 *  Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 * marking an available cell in a 3 * 3 grid with their respective tokens (either X
 * or O). When one player has placed three tokens in a horizontal, vertical, or diago-
 * nal row on the grid, the game is over and that player has won. A draw (no winner)
 * occurs when all the cells on the grid have been filled with tokens and neither
 * player has achieved a win. Create a program for playing a tic-tac-toe game.
 *
 *  The program prompts two players to alternately enter an X token and O token.
 *  Whenever a token is entered, the program redisplays the board on the console and
 *  determines the status of the game (win, draw, or continue). Here is a sample run:
 */
package chapter08.exercise.exercise08_09;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class TicTacToe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char[][] board = createBoard();

        play(board, input);
    }

    private static void play(char[][] board, Scanner input) {
        char player = 'X';
        boolean gameWon = false;

        while (!gameWon) {
            displayBoard(board);

            int[] move = getMove(player, input);
            System.out.println();

            if (move[0] > 3) break;

            board[move[0]][move[1]] = player;
            gameWon = checkWin(player, board);
            if (gameWon) {
                System.out.println(player + " player won!");
            }
            player = switchPlayer(player);

        }
    }

    private static int[] getMove(char player, Scanner input) {
        int[] move = new int[2];
        System.out.print("Enter row (0, 1, or 2) for player " + player + ": ");
        move[0] = input.nextInt();
        System.out.print("Enter column (0, 1, or 2) for player " + player + ": ");
        move[1] = input.nextInt();
        return move;
    }


    private static char switchPlayer(char player) {
        if (player == 'X')
            return 'O';
        else
            return 'X';
    }

    // Should be a better way to do this.
    private static boolean checkWin(char player, char[][] board) {
        return
            // Check horizontals
            (board[0][0] == player && board[0][1] == player && board[0][2] == player) ||
            (board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
            (board[2][0] == player && board[2][1] == player && board[2][2] == player) ||
            // Check verticals
            (board[0][0] == player && board[1][0] == player && board[2][0] == player) ||
            (board[0][1] == player && board[1][1] == player && board[2][1] == player) ||
            (board[0][2] == player && board[1][2] == player && board[2][2] == player) ||
            // Check diagonals
            (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }


    private static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " |");
            }
            System.out.println("\n-------------");
        }
    }

    private static char[][] createBoard() {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        return board;
    }


}
