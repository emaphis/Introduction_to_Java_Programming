/*
 * Exercise 3.24
 *  Game: pick a card) Write a program that simulates picking a card from a deck
 *  of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 *  Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.s
 */
package chapter03.exercise.exercise03_24;

/**
 * Pick a card program.
 * @author emaph
 */
public class PickACard {
    public static void main(String[] args) {

        // calculate rank.
        int rankNo = (int) (Math.random() * 13) + 1;

        String rank = "";
        switch (rankNo) {
            case 1: rank = "Ace"; break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:  rank = "" + rankNo; break;
            case 10: rank = "Jack"; break;
            case 11: rank = "Queen"; break;
            case 12: rank = "King";
        }

        // calculate suite
        int suitNo = (int) (Math.random() * 4);

        String suit = "";
        switch (suitNo) {
            case 0: suit = "Clubs"; break;
            case 1: suit = "Diamonds"; break;
            case 2: suit = "Hearts"; break;
            case 3: suit = "Spades";
        }

        System.out.println("The card you picked is " + rank + " of " + suit);
    }
}
