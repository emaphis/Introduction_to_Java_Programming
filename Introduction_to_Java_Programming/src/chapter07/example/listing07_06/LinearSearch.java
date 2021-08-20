/*
 * Listing 7.6
 * 7.10 Searching Arrays
 */
package chapter07.example.listing07_06;

/**
 * Linear Search Approach
 * @author emaph
 */
public class LinearSearch {

    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
