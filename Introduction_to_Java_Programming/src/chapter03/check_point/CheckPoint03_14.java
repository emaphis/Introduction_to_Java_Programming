/*
 *  Check Point 3.14
 *  Condition Operations  x ? x : x
 */
package chapter03.check_point;

import java.util.Scanner;

/**
 * @author emaph
 */
public class CheckPoint03_14 {
    // 3.14.1
    //  Suppose when you run the following program, you enter the input 2 3 6 from the
    //  console. What is the output?
    // a: 2 3 6 : sorted
    static void test() {
        Scanner input = new java.util.Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println((x < y && y < z)? "sorted": "not sorted");
    }

    // 3.14.2
    // Rewrite the following if statements using the conditional operator.
    static void statement2() {
        Scanner input = new java.util.Scanner(System.in);
        int ages = input.nextInt();

        int ticketPrice = ages >= 16 ? 20 : 10;

        System.out.println("price: " + ticketPrice);
    }

    // 3.14.3 Rewrite the following codes using if-else statements.
    static void statement3() {
        //a. score = (x > 10)? 3 * scale: 4 * scale;
        int score;
        int x = 15;
        int scale = 4;
        if (x > 10)
            score = 3 * scale;
        else
            score = 4 * scale;

        System.out.println("score: " + score);

        //b. tax = (income > 10000)? income * 0.2: income * 0.17 + 1000;
        double tax;
        double income = 10001;
        if (income > 10000)
            tax = income * 0.2;
        else
            tax = income * 0.17 + 1000;

        System.out.println("tax: " + tax);

        //c. System.out.println((number % 3 == 0)? i: j);
        int i = 4;
        int j = 5;
        int number = 3;
        if (number % 3 == 0)
            System.out.println(i);
        else
            System.out.println(j);
    }

    // 3.14.4
    // Write an expression using a conditional operator that returns randomly −1 or 1.
    static void statement4() {
        int num =  (Math.random() > 0.50) ? -1 : 1;
        //int num = (int)(Math.random() * 2) == 0 ? -1 : 1;
        System.out.println("num: " + num);
    }


    public static void main(String[] args) {
        //test();
        statement4();
    }
}
