/*
 * Exercise 11.19
 *  (Bin packing using first fit) The bin packing problem is to pack the objects of var￾ious weights into containers. Assume each container can hold a maximum of 10
 *  pounds. The program uses an algorithm that places an object into the first bin in
 *  which it would fit. Your program should prompt the user to enter the total number
 *  of objects and the weight of each object. The program displays the total number
 *  of containers needed to pack the objects and the contents of each container.
 *
 *  Does this program produce an optimal solution, that is, finding the minimum
 *  number of containers to pack the objects?
 * a- It would be better to sort the object by weight befor binning them.
 *    Larger bin sizes work best.
 */
package chapter11.exercise.exercise11_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Bin packing using first fit
 *
 * @author emaph
 */
public class Exercise11_19 {

    public static void main(String[] args) {
        // constants for my experiments, SORT=false is first fit.
        final int BINSIZE = 10;
        final boolean SORT = false;

        ArrayList<Integer> objects = getObjects(SORT);
        ArrayList<ArrayList<Integer>> bins = binObjects(objects, BINSIZE);
        printBinTotals(bins);
    }

    /**
     * Query user for objects
     * Sort objects by weight if 'sort' is true.
     */
    private static ArrayList<Integer> getObjects(boolean sort) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int numObjects = input.nextInt();

        System.out.print("Enter the weights of the objects: ");
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i < numObjects; i++) {
            objects.add(input.nextInt());
        }
        input.close();

        if (sort)
            Collections.sort(objects); // Try sorting...
        return objects;
    }

    /**
     * Bin objects in a list of bins
     *
     * NOTE: Uhg!! getting an "java.util.ConcurrentModificationException"
     * looping through code. So created a hundred bins right off the bat.
     * Why not? Memory is cheap.
     */
    private static ArrayList<ArrayList<Integer>> binObjects(ArrayList<Integer> objects, int binSize) {
        ArrayList<ArrayList<Integer>> bins = new ArrayList<>();
        // add 100 empty bins, lol
        for (int i = 0; i < 100; i++) {
            bins.add(new ArrayList<>());
        }

        for (Integer weight : objects) {
            int index = 0;
            ArrayList<Integer> bin = bins.get(index);

            while (getBinWeight(bin) + weight > binSize) {
                index++;
                bin = bins.get(index);
            }
            bin.add(weight);
        }

        return bins;
    }

    /**
     * total current bin weight
     */
    private static int getBinWeight(ArrayList<Integer> bin) {
        int sum = 0;
        for (Integer wieght : bin) {
            sum += wieght;
        }
        return sum;
    }

    private static void printBinTotals(ArrayList<ArrayList<Integer>> bins) {
        int count = 1;
        for (ArrayList<Integer> bin : bins) {
            if (!bin.isEmpty()) {  // skip empty bins
                System.out.print("Container " + count + " contains objects with weight ");
                for (Integer weight : bin) {
                    System.out.print(weight + " ");
                }
                System.out.println();
                count++;
            }
        }
    }

}

/*
/// BINSIZE = 10, SORT = false
Enter the number of objects: 6
Enter the weights of the objects: 7 5 2 3 5 8
Container 1 contains objects with weight 7 2
Container 2 contains objects with weight 5 3
Container 3 contains objects with weight 5
Container 4 contains objects with weight 8

/// BINSIZE = 11, SORT = false
Enter the number of objects: 6
Enter the weights of the objects: 7 5 2 3 5 8
Container 1 contains objects with weight 7 2
Container 2 contains objects with weight 5 3
Container 3 contains objects with weight 5
Container 4 contains objects with weight 8

/// BINSIZE 11, SORT = true
Enter the number of objects: 6
Enter the weights of the objects:  7 5 2 3 5 8
Container 1 contains objects with weight 2 3 5
Container 2 contains objects with weight 5
Container 3 contains objects with weight 7
Container 4 contains objects with weight 8

/// BINSIZE 12, SORT = false
Enter the number of objects: 6
Enter the weights of the objects:  7 5 2 3 5 8
Container 1 contains objects with weight 7 5
Container 2 contains objects with weight 2 3 5
Container 3 contains objects with weight 8


/// BINSIZE 12, SORT = true
Enter the number of objects: 6
Enter the weights of the objects:  7 5 2 3 5 8
Container 1 contains objects with weight 2 3 5
Container 2 contains objects with weight 5 7
Container 3 contains objects with weight 8
*/
