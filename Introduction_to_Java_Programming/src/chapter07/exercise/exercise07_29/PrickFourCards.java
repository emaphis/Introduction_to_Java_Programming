/*
 * Exercise 7.29
 *  (
 * See Listing 7.2, Exercise 7.24
 */
package chapter07.exercise.exercise07_29;

import java.util.Arrays;


/**
 * Coupon collector’s problem
 * @author emaph
 */
public class PrickFourCards {
    static final int SIZE = 52;

    public static void main(String[] args) {
        int[] deck;
        int[] pick;
        int sum = 0;
        int count = 0;

        do {
            deck = initialize();
            pick =  Arrays.copyOf(deck, 4); // pick top four of shuffeled deck;
            sum = sumCards(pick);
            count++;

        } while (sum != 24);

        System.out.println("The cards: ");
        for (int cardNo : pick) {
            printCard(cardNo);
            System.out.println(" has a value of: " + value(cardNo));
        }
        System.out.println("Sums to " + sum + " after " + count + " picks");
    }


    public static int sumCards(int[] deck) {
        int sum = 0;
        for (int cardNo : deck) {
            sum += value(cardNo);
        }
        return sum;
    }

    public static int value(int cardNo) {
        return (cardNo % 13) + 1;
    }

    /** return a shuffled array of cards */
    public static int[] initialize() {
        int[] deck = new int[SIZE];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        shuffle(deck);
        return deck;
    }

    /** Shuffle the cards */
    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    private static String getSuit(int cardNo) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        return suits[cardNo / 13];
    }

    private static String getRank(int cardNo) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                         "Jack", "Queen", "King"};
        return ranks[cardNo % 13];
    }

    private static void printCard(int cardNo) {
        String suit = getSuit(cardNo);
        String rank = getRank(cardNo);
        System.out.printf( "Card number %2d: %-15s", cardNo, (rank + " of " + suit));
    }
}
