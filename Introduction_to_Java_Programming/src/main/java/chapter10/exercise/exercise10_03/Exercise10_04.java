/*
 * Exercise 10.4
 */

package chapter10.exercise.exercise10_03;

import java.util.Scanner;

/**
 * Exercis the MyInteger class
 * @author emaph
 */
public class Exercise10_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int int1 = input.nextInt();
        MyInteger n1 = new MyInteger(int1);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 i prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.println(MyInteger.parseInt(str));
        System.out.print("Enter an integer: ");
        int n2 = input.nextInt();
        System.out.println("n2 is odd? " + MyInteger.isOdd(n2));
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}
