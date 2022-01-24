/*
 * Check Point 7.4
 * 7.4 Case Study: Deck of Cards
 */
package chapter07.check_point;

/**
 * Deck of Cards
 * @author emaph
 */
public class CheckPoint07_04 {

    // .4.1 Will the program pick four random cards if you replace lines 22–27 in Listing 7.2,
    //      DeckOfCards.java, with the following code?
    // a. No. The same random number may be picked

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King"};

        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // 3updated code
        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            int cardNumber = (int)(Math.random() * deck.length);
            String suit = suits[cardNumber / 13];
            String rank = ranks[cardNumber % 13];
            System.out.println("Card number " + cardNumber + ": " + rank + " of " + suit);
        }
    }
}
