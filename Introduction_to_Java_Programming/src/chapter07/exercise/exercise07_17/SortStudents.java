/*
 * Exercise 7.17
 *  (Sort students) Write a program that prompts the user to enter the number of stu-
 *  dents, the students’ names, and their scores and prints student names in decreasing
 *  order of their scores. Assume the name is a string without spaces, use the Scan­
 *  ner’s next() method to read a name.
 */
package chapter07.exercise.exercise07_17;

import java.util.Scanner;

/**
 * Sort students
 * @author emaph
 */
public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of sturents names and scores: ");
        int num = input.nextInt();

        String[] names = new String[num];
        int[] scores = new int[num];

        System.out.print("Enter student names and scores: ");
        for (int i = 0; i < num; i++) {
            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        // Sort by score
        selectionSort(names, scores);

        // Print students sorted by socre
        System.out.println();
        System.out.println("Students sorted by score");
        for (int i = 0; i < num; i++) {
            System.out.printf("%-8s %3d\n", names[i], scores[i]);
        }

    }

    // 5
    //  Jwnny 80 Charley 95 Fred 75  Bert 91 Joan 98

    // From Listing 7.8
    /** The method for sorting the numbers */
    public static void selectionSort(String[] names, int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int max = scores[i];
            int maxIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > max) {
                    max = scores[j];
                    maxIndex = j;
                }
            }

            // Swap scores[i] with scores[maxIndex] if necessary;
            // and swap correstponding names
            if (maxIndex != i) {
                scores[maxIndex] = scores[i];
                scores[i] = max;

                String temp = names[i];
                names[i] = names[maxIndex];
                names[maxIndex] = temp;
            }
        }
    }

}

// sample run

// Enter number of sturents names and scores: 5
// Enter student names and scores: Jenny 80 Charley 95 Fred 75  Bert 91 Joan 98
//
// Students sorted by score
// Joan      98
// Charley   95
// Bert      91
// Jenny     80
// Fred      75
