/*
 * Listing .72
 * 7.4 Case Study: Deck of Cards
 *  he problem is to create a program that will randomly select four cards from a deck
 *  of cards
 */
package chapter07.example.listing07_02;

/**
 * Deck of Cards
 * @author emaph
 */
public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King"};

        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Dispay after shuffle
//        for (int i : deck) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
