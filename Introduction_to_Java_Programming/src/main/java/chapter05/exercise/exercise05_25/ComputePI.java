/*
 * Exercise 5.25
 *  Compute p) You can approximate p by using the following summation:
 *
 *  PI = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 + .... +  )
 */
package chapter05.exercise.exercise05_25;

/**
 * Compute PI
 * @author emaph
 */
public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1, j = 1; i <= 100000; i++, j += 2) {
            if (i % 2 == 0)
                sum -= 1.0 / j;
            else
                sum += 1.0 / j;

            if (i == 1000 || i == 10000 || i == 20000 || i == 100000)
                System.out.println("PI = " + 4.0 * sum + " at " + i + " iterations");
        }
    }
}

// PI = 3.140592653839794 at 1000 iterations
// PI = 3.1414926535900345 at 10000 iterations
// PI = 3.1415426535898248 at 20000 iterations
// PI = 3.1415826535897198 at 100000 iterations