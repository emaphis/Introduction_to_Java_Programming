/*
 * Exercise 6.14
 *  (Estimate p) p can be computed using the following summation:
 *
 *      m(i) = 4 * (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... +  pow(-1, i+1) / (2*i - 1)
 */
package chapter06.exercise.exercise06_14;


/**
 * Sum series
 * @author emaph
 */
public class EstimatePI {
    public static void main(String[] args) {
        final double END = 901.0;

        // Print header
        System.out.println("i        m(i)");

        // Print details
        for (double i = 1; i <= END; i += 100.0) {
            double mi = m(i);
            System.out.printf("%-8.0f %-7.4f\n", i, mi);
        }
    }

    static double m(double i) {
        double sum = 0;

        for (double j = 1.0; j <= i; j++) {
            sum += Math.pow(-1.0, j + 1.0) / (2.0 * j - 1.0);
        }

        return 4.0 * sum;
    }
}
