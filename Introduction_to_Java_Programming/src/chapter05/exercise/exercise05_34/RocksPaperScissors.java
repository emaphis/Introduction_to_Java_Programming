/*
 * Exercise 5.34
 *  (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
 *  plays the scissor–rock–paper game. Revise the program to let the user continu-
 *  ously play until either the user or the computer wins more than two times than its
 *  opponent.
 */
package chapter05.exercise.exercise05_34;

import java.util.Scanner;

/**
 * Game: scissor, rock, paper
 * @author emaph
 */
public class RocksPaperScissors {
    public static void main(String[] args) {
        int computerWins = 0;   // Number of games computor hwa won
        int playerWins = 0;     // Number of games player has won.
        int winsGap;            // Diffence between player wins and computer wins

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter scissors (0), rock (1), paper (2): ");
            int choice = input.nextInt();
            System.out.println();

            int computerChoice = (int) (Math.random() * 3);

            String userLabel;
            switch (choice) {
                case 0: userLabel = "scissors"; break;
                case 1: userLabel = "rock"; break;
                case 2: userLabel = "paper"; break;
                default: userLabel = "unkown";
            }

            String computerLabel;
            switch (computerChoice) {
                case 0: computerLabel = "scissors"; break;
                case 1: computerLabel = "rock"; break;
                case 2: computerLabel = "paper"; break;
                default: computerLabel = "unkown";
            }

            // Scissors 0 > Rock 1 > Paper 2 > Scisors 0

            String output = ". Ahhh. What...";
            if (choice == computerChoice) {
                output = " too. It is a draw.";
            } else {
                switch (choice) {
                    case 0:
                        if (computerChoice == 1) {
                            output = ". You lost.";
                            computerWins++;
                        } else if (computerChoice == 2) {
                            output = ". You won.";
                            playerWins++;
                        }
                        break;
                    case 1:
                        if (computerChoice == 2) {
                            output = ". You lost.";
                            computerWins++;
                        } else if (computerChoice == 0) {
                            output = ". You won.";
                            playerWins++;
                        }
                        break;
                    case 2:
                        if (computerChoice == 0) {
                            output = ". You lost.";
                            computerWins++;
                        } else if (computerChoice == 1) {
                            output = ". You won.";
                            playerWins++;
                        }
                        break;
                    default:
                        output = ". The game isa bust.";
                }
            }

            System.out.println("The computer is " + computerLabel + ". You are " + userLabel + output);
            System.out.println("Player wins: " + playerWins + ",  Computer wins: " + computerWins);

            winsGap = Math.abs(playerWins - computerWins);

        } while (winsGap < 3);  // play until three games won

        System.out.println("Game is over!");
    }
}
