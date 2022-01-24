/*
 * Linear Search Approach
 */
package chapter07.example.listing07_06;

import static chapter07.example.listing07_06.LinearSearch.linearSearch;

/**
 * Test App
 * @author emaph
 */
public class TestSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};

        int i = linearSearch(list, 4);
        int j = linearSearch(list, -4);
        int k = linearSearch(list, -3);

        System.out.println(i + " " + j + " " + k);
    }
}
