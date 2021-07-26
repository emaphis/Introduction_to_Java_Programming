/*
 * Exercise 3.17
 *  Game: scissor, rock, paper) Write a program that plays the popular scissor–
 *  rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
 *  a paper can wrap a rock.) The program randomly generates a number 0, 1, or
 *  2 representing scissor, rock, and paper. The program prompts the user to enter
 *  a number 0, 1, or 2 and displays a message indicating whether the user or the
 *  computer wins, loses, or draws.
 */
package chapter03.exercise.exercise03_17;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class RocksPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scissors (0), rock (1), paper (2): ");
        int choice = input.nextInt();

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
                    } else if (computerChoice == 2) {
                        output = ". You won.";
                    }
                    break;
                case 1:
                    if (computerChoice == 2) {
                        output = ". You lost.";
                    } else if (computerChoice == 0) {
                        output = ". You won.";
                    }
                    break;
                case 2:
                    if (computerChoice == 0) {
                        output = ". You lost.";
                    } else if (computerChoice == 1) {
                        output = ". You won.";
                    }
                    break;
                default:
                    output = ". The game isa bust.";
            }
        }

        System.out.println("The computer is " + computerLabel + ". You are " + userLabel + output);
    }
}
