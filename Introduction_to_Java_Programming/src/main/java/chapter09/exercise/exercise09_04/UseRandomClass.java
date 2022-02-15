/*
 * Exercise 9.4
 *  (Use the Random class) Write a program that creates a Random object with seed
 *  1000 and displays the first 50 random integers between 0 and 100 using the
 *  nextInt(100) method.
 */
package chapter09.exercise.exercise09_04;

import java.util.Random;

/**
 * Use the Random class
 * @author emaph
 */
public class UseRandomClass {
    public static void main(String[] args) {
        final int END = 50;
        final int SEED = 1000;
        final int BOUND = 100;

        Random rand = new Random(SEED);

        for (int i = 1; i <= END; i++) {
            int num = rand.nextInt(BOUND);

            if (i % 10 == 0)
                System.out.printf("%4d\n", num);
            else
                System.out.printf("%4d", num);
        }
    }
}

/*
  87  35  76  24  92  49  41  45  64  50
  79  59  72  83  36  75  46   2  23  41
  22  71  89   2  93  42  49  42  35  76
  32   0  52  95  87  31  99  18  79   2
  91   5  55  84  71  95  58  87  77  38
*/
