/*
 * Listing 8.2
 *  8.5 Case Study: Grading a Multiple-Choice Test
 *  he problem is to write a program that will grade multiple-choice tests.
 */
package chapter08.example.listing08_02;

/**
 *
 * @author emaph
 */
public class GradeExam {
    /** Main method */
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

        // Grade all answers
        int highestCount = -1;
        int highestCountStudentNo = -1;
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            // check point 8.5.1
            if (correctCount > highestCount) {
                highestCount = correctCount;
                highestCountStudentNo = i;
            }

            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }

        System.out.println();
        System.out.println("Highest scoring student " + highestCountStudentNo + "'s correct count is " + highestCount);
    }
}
