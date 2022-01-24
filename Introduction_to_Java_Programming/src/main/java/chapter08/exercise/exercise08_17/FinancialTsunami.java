/*
 * Exercise 8.17.
 * See book.
 */
// TODO:  not calculating correct values.
package chapter08.exercise.exercise08_17;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tsunami
 * @author emaph
 */
public class FinancialTsunami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int bankNum = input.nextInt();
        int bankNum = 5;
        //int limit = input.nextInt();
        //double[][] borrowers = getBorrowers(bankNum, input);
        double[][] borrowers = {
           // 0   1   2   3     4   5
            {25,  2,  1, 100.5, 4, 320.5},
            {125, 2,  2,  40,   3, 85},
            {75,  2,  0, 125,   3, 75},
            {75,  1,  0, 125         },
            {181, 1,  2, 125         }
        };

        //System.out.println(Arrays.deepToString(borrowers));
        for (int i = 0; i < borrowers.length; i++) {
            System.out.println("bank info: " + i + " = " + getAssets(i, borrowers));
        }
    }

    private static double[][] getBorrowers(int num, Scanner input) {
        double[][] bankInfo = new double[num][];
        for (int i = 0; i < num; i++) {
            double balance = input.nextDouble();
            int numDeposits = input.nextInt();
            double[] info = new double[numDeposits * 2 + 1];
            info[0] = balance;
            for (int j = 1; j < info.length; j++) {
                info[j] = input.nextDouble();
            }
            bankInfo[i] = info;
        }
        return bankInfo;
    }

    // ***********************************
    private static double getAssets(int bankNo, double[][] bankInfo) {
        double sum = bankInfo[bankNo][0];// get balance.

        // add loans made to other banks
        for (int i = 2; i < bankInfo[bankNo].length; i += 2) {
            //System.out.print(" - " + bankInfo[bankNo][i + 1]);
            sum += bankInfo[bankNo][i + 1];
        }

        // subtract loans from other banks
        for (int i = 0; i < bankInfo.length; i++) {
            for (int j = 2; j < bankInfo[i].length ; j += 2) {
                int bNo = (int)bankInfo[i][j];
                if (bankNo == bNo) {
                    //System.out.print( bankNo + ", " + bankInfo[i][j + 1] + "");
                    sum -= bankInfo[i][j + 1];
                }
            }
        }
        return sum;
    }
}

