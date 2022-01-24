/*
 * Exercise 7.37
 *  (Game: bean machine) The bean machine, also known as a quincunx or the Gal-
 *  ton box, is a device for statistics experiments named after English scientist Sir
 *  Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
 *  in a triangular form
 *
 *  Balls are dropped from the opening of the board. Every time a ball hits a nail, it
 *  has a 50% chance of falling to the left or to the right. The piles of balls are accu-
 *  mulated in the slots at the bottom of the boar
 *
 *  Write a program that simulates the bean machine. Your program should prompt the
 *  user to enter the number of the balls and the number of the slots in the machine.
 *  Simulate the falling of each ball by printing its path. For example, the path for
 *  the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
 *  RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here
 *  is a sample run of the program:
 *
 *
 */
package chapter07.exercise.exercise07_37;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class BeanMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int numBalls = input.nextInt();
        System.out.print("Enter the number of slots in the machine: ");
        int numSlots = input.nextInt();
        int[] slots = new int[numSlots+1];
        System.out.println();

        for (int i = 0; i < numBalls; i++) {
            int slot = 0;
            for (int j = 0; j < numSlots; j++) {
                int run = bounce();
                System.out.printf( "%1s", (run == 1 ? "R" : "L"));
                slot += run;
            }
            slots[slot]++;
            System.out.println();
        }
        System.out.println(Arrays.toString(slots));
        printBeans(slots);
    }

   private static int bounce() {
       if (Math.random() > 0.5)
           return 1;
       else
           return 0;
   }

    private static void printBeans(int[] slots) {
        // find max
        int max = 0;
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] > max)
                max = slots[i];
        }

        for (int i = max + 1; i >= 1; i--) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] >= i)
                    System.out.print("O");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < slots.length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
