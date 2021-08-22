/*
 *
 * Exercise 7.21
 *  (Sum integers) Write a program that passes an unspecified number of integers from
 *  command line and displays their total.
 */
package chapter07.exercise.exercise07_21;

/**
 * Sum Integers
 * @author emaph
 */
public class SumIntegers {
    public static void main(String[] args) {
        int sum = 0;
        for (String str : args) {
            int num  = Integer.parseInt(str);
            sum += num;
        }

        System.out.println("sum of command line arguments is " + sum);
    }
}
