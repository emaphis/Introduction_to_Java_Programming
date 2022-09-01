/*
 * Exercise 11.9
 *  (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 *  into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 *  most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 *  the most 1s.) Here is a sample run of the program:
 */
package chapter11.exercise.exercise11_09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Largest rows and columns
 * @author emaph
 */
public class Exercise11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size n: ");
        int n = input.nextInt();

        int[][] matrix = getRandomMatrix(n);
        dispMatrix(matrix);

        ArrayList<Integer> rows = sumRows(matrix);
        //System.out.println("sum row " + rows);
        dispList("The largest row indexes:", maxIndices(rows));

        ArrayList<Integer> cols = sumCols(matrix);
        //System.out.println("sum col " + cols);
        dispList("The largest column index:", maxIndices(cols));
    }

    private static int[][] getRandomMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        return matrix;
    }

    private static void dispMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }

    private static ArrayList<Integer> sumRows(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            list.add(sum);
            sum = 0;
        }
        return list;
    }

     private static ArrayList<Integer> sumCols(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            list.add(sum);
            sum = 0;
        }
        return list;
    }

    private static ArrayList<Integer> maxIndices(ArrayList<Integer> list) {
        ArrayList<Integer> index = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num > max) {
                max = num;
                index.clear();
                index.add(i);
            } else if (num == max) {
                index.add(i);
            }
        }
        return index;
    }

    private static void dispList(String caption, ArrayList<Integer> list) {
        System.out.print(caption + " ");
        for (Integer number : list) {
            System.out.print(number  + " ");
        }
        System.out.println();
    }

}