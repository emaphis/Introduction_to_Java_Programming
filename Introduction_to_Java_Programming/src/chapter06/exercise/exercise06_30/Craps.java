/*
 * Exercise 6.30
 *  (Game: craps) Craps is a popular dice game played in casinos. Write a program
 *  to play a variation of the game, as follows:
 *
 *  Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respec-
 *  tively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 *  lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 *  (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 *  a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 *
 *  Your program acts as a single player.
 */
package chapter06.exercise.exercise06_30;

/**
 * Craps
 * @author emaph
 */
public class Craps {
    public static void main(String[] args) {
       boolean play = true;

        while (play) {
            int roll1 = rollDice();
            int roll2 = rollDice();
            System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + (roll1 + roll2));

            if (isCraps(roll1, roll2)) {
                System.out.println("You lose");
                play = false;
            } else  if (isNatural(roll1, roll2)) {
                System.out.println("You win");
                play = false;
            } else {
                System.out.println("point is " + (roll1 + roll2));
                play = true;
            }
        }

    }

    static int rollDice() {
        return 1 + (int) (Math.random() * 6);
    }

    static boolean isCraps(int roll1, int roll2) {  // loose
        int total = roll1 + roll2;
        return total == 2 || total == 3 || total == 12;
    }

    static boolean isNatural(int roll1, int roll2) {  // win
        int total = roll1 + roll2;
        return total == 7 || total == 11;
    }
}
