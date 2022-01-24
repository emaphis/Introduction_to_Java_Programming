/*
 * Check Point 5.12
 * Keywords break and continue
 */
package chapter05.check_point;

/**
 * @author emaph
 */
public class CheckPoint05_12 {

    // 5.12.1 What is the keyword break for? What is the keyword continue for? Will the fol-
    //        lowing programs terminate? If so, give the output.
    // a break - ends/exits a loop
    //   continue - ends on iteneration of a loop.

    // (a)  - program ends
    // Balance is 1
    static void loop1_a() {
        int balance = 10;
        while (true) {
            if (balance < 9)
                break;
            balance = balance - 9;
        }
        System.out.println("Balance is " + balance);
    }

    // (b) - never completes
    static void loop1_b() {
        int balance = 10;
        while (true) {
            if (balance < 9)
                continue;
            balance = balance - 9;
        }

        //System.out.println("Balance is " + balance);  // this staement never runs
    }


    // 5.12.2 The for loop on the left is converted into the while loop on the right. What is
    //        wrong? Correct it.

    // (a)
    static void loop2_a() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 3 == 0) continue;
            sum += i;
        }
        //System.out.println("sum " + sum);
    }

    // (b)
    static void loop2_b() {
        int i = 0, sum = 0;
        while (i < 4) {
            if (i % 3 == 0) {
                i++;   // increment i was out of positions
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println("sum " + sum);
    }


    // 5.12.3 Rewrite the programs TestBreak and TestContinue in Listings 5.12 and 5.13
    //        without using break and continue.

    // (a) replace break;
    static void loop3_a() {
        int sum = 0;
        int number = 0;

        while (number < 20 && sum < 100) {
            number++;
            sum += number;
            //if (sum >= 100)
            //    break;
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
    // The number is 14
    // The sum is 105

    // (b) replace continue
    static void loop3_b() {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (!(number == 10 || number == 11))
                sum += number;
        }

        System.out.println("The sum is " + sum);
    }
    // he sum is 189


    // 5.12.4 After the break statement in (a) is executed in the following loop, which statement
    //        is executed? Show the output. After the continue statement in (b) is executed in
    //        the following loop, which statement is executed? Show the output.

    // (a)
    static void loop4_a() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2)
                    break;

                System.out.println(i * j);
            }

            System.out.println(i);
        }
    }
    // run:
    // 1 2 1 2 2 3

    // (b)
    static void loop4_b() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2)
                    continue;

                System.out.println(i * j);
            }

            System.out.println(i);
        }
    }
    // run:  1 2 1 2 2 3


    public static void main(String[] args) {
        loop4_b();
    }
}
