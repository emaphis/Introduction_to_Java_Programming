/*
 * Exercise 7.24
 *  (Simulation: coupon collector’s problem) Coupon collector is a classic statistics
 *  problem with many practical applications. The problem is to repeatedly pick
 *  objects from a set of objects and find out how many picks are needed for all the
 *  objects to be picked at least once. A variation of the problem is to pick cards from
 *  a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
 *  before you see one of each suit. Assume a picked card is placed back in the deck
 *  before picking another. Write a program to simulate the number of picks needed
 *  to get four cards from each suit and display the four cards picked (it is possible a
 *  card may be picked twice).
 * See Listing 7.2
 */
package chapter07.exercise.exercise07_24;

/**
 * Coupon collector’s problem
 * @author emaph
 */
public class CouponCollectorsProblem {
    static final int SIZE = 13;

    public static void main(String[] args) {
        int[] deck = initialize(SIZE * 4);  // four suits
        shuffle(deck);
        int count = play(deck);
        System.out.println("The number of card pics is " + count);
    }


    public static int play(int[] deck) {
        boolean spades = false;
        boolean hearts = false;
        boolean diamonds = false;
        boolean clubs = false;
        String suit;
        String rank;
        int count = 0;

        while (!(spades && hearts && diamonds && clubs)) {
            int cardNo = deck[count];  // select top of shuffled deck
            suit = getSuit(cardNo);
            rank = getRank(cardNo);

            if (!spades && suit.equals("Spades")) {
                spades = true;
                printCard(cardNo);
            } else if (!hearts && suit.equals("Hearts")) {
                hearts = true;
                printCard(cardNo);
            } else if (!diamonds && suit.equals("Diamonds")) {
                diamonds = true;
                printCard(cardNo);
            } else if (!clubs && suit.equals("Clubs")) {
                clubs = true;
                printCard(cardNo);
            }
            count++;
        }

        return count;
    }

    public static int[] initialize(int size) {
        int[] deck = new int[size];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
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
        return suits[cardNo / SIZE];
    }

    private static String getRank(int cardNo) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                         "Jack", "Queen", "King"};
        return ranks[cardNo % SIZE];
    }

    private static void printCard(int cardNo) {
        String suit = getSuit(cardNo);
        String rank = getRank(cardNo);
        System.out.println( "Card number " + cardNo + " : "  + rank + " of " + suit);
    }
}
