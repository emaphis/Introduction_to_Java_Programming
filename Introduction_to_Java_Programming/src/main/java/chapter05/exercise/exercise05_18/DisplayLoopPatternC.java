/*
 * Exercise 5.18
 *  (Display four patterns using loops) Use nested loops that display the following
 *  patterns in four separate programs:
 *
 *      Pattern A      Pattern B      Pattern C      Pattern D
 *      1              1 2 3 4 5 6              1    1 2 3 4 5 6
 *      1 2            1 2 3 4 5              2 1      1 2 3 4 5
 *      1 2 3          1 2 3 4              3 2 1        1 2 3 4
 *      1 2 3 4        1 2 3              4 3 2 1          1 2 3
 *      1 2 3 4 5      1 2              5 4 3 2 1            1 2
 *      1 2 3 4 5 6    1              6 5 4 3 2 1              1
 */
package chapter05.exercise.exercise05_18;

/**
 *
 * @author emaph
 */
public class DisplayLoopPatternC {
    public static void main(String[] args) {
        final int SIZE = 6;

        System.out.println("Pattern C");

        for (int i = 1; i <= SIZE; i++) {

            for (int j = SIZE - 1; j >= i; j--)
                System.out.print("  ");

            for (int j = i; j > 0; j--)
                    System.out.print(j + " ");

            System.out.println();
        }

        System.out.println();
    }
}
