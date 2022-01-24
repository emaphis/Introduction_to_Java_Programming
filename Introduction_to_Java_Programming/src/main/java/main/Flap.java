// Program to run experiments
package main;

public class Flap {

    public static void main(String[] args) {
        int[] carsCost = new int[5];
        carsCost[0] = 50;
        carsCost[1] = 455;
        carsCost[2] = 65556;
        carsCost[3] = 349;
        carsCost[4] = 3467;

        double sum = 0;
        double mean = carsCost[0];
        for (int i = 0; i < carsCost.length; i++) {
            sum += carsCost[i];
            if (i == carsCost.length - 1) {
                mean = sum / carsCost.length;
                System.out.println("The mean of the costs of the cars is : " + mean);
            }
        }
    }

}
