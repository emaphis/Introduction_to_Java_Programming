/*
 * Exercise 6.32
 *  (Game: chance of winning at craps) Revise Programming Exercise 6.30 to run it
 *  10,000 times and display the number of winning games.
 */
package chapter06.exercise.exercise06_32;

/**
 * chance of winning at craps
 * @author emaph
 */
public class ChanceOfWinningAtCraps {
    public static void main(String[] args) {
        final int END = 10_000;
        int wonGames = 0;

        for (int i = 0; i < END; i++) {
            boolean play = true;

            while (play) {
                int roll1 = rollDice();
                int roll2 = rollDice();

                if (isCraps(roll1, roll2)) {
                    play = false;
                } else  if (isNatural(roll1, roll2)) {
                    wonGames++;
                    play = false;
                } else {
                    play = true;
                }
            }
        }

        System.out.println("Winning games " + wonGames + " out of " + END + " games");
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
