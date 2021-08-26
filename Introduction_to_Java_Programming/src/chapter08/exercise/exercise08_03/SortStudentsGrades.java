/*
 * Exercise 8.3
 *  (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
 *  students in increasing order of the number of correct answers.
 */
package chapter08.exercise.exercise08_03;

/**
 * Sort students on grades
 *
 * @author emaph
 */
public class SortStudentsGrades {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all the answers
        int[][] correctCounts = summarizeStudentData(answers, keys);

        sortStudentData(correctCounts);

        printStudentData(correctCounts);

    }

    /**  Grade all answers     */
    public static int[][] summarizeStudentData(char[][] answers, char[] keys) {
        int[][] correctCounts = new int[answers.length][2];

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {

            // Grade one student
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCounts[i][0] = i;
                    correctCounts[i][1]++;
                }
            }
        }

        return correctCounts;
    }

    private static void sortStudentData(int[][] correctCounts) {
        for (int i = 0; i < correctCounts.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int minIdx = i;

            for (int j = i + 1; j < correctCounts.length; j++) {
                if (correctCounts[minIdx][1] > correctCounts[j][1]) {
                    minIdx = j;
                }
            }

            // Swap scores[i][i] with list[minIdx] if necessary;
            if (minIdx != i) {
                int temp = correctCounts[i][0];
                correctCounts[i][0] = correctCounts[minIdx][0];
                correctCounts[minIdx][0] = temp;

                temp = correctCounts[i][1];
                correctCounts[i][1] = correctCounts[minIdx][1];
                correctCounts[minIdx][1] = temp;
            }

        }
    }

    public static void printStudentData(int[][] correctCounts) {
        for (int i = 0; i < correctCounts.length; i++) {
            System.out.println("Student " + correctCounts[i][0] +
                    "'s correct count is " + correctCounts[i][1]);
        }
        System.out.println();
    }
}

