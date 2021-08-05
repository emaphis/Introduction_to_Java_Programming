/*
 * Check Point 5.2 - While Loops
 */
package chapter05.check_point;

/**
 * @author emaph
 */
public class CheckPoint05_02 {

    // 5.2.1 Analyze the following code. Is count < 100 always true, always false, or
    //       sometimes true or sometimes false at Point A, Point B, and Point C?
    // Point A - always true
    // Point B -  sometimes true some times false - end conditions
    // Point C - Always false
    static void loop1() {
        int count = 0;
        while (count < 100) {
            // Point A
            System.out.println("Welcome to Java!");
            count++;
            // Point B
        }
        // Point C
    }

    // 5.2.2 How many times are the following loop bodies repeated? What is the output of each
    //       loop?
    static void loop2() {
        int i;

        // (a) - never stops
        //i = 1;
        //while (i < 10)
        //    if (i % 2 == 0)
        //        System.out.println("a: " + i);

        // (b)  - never stops
        //i = 1;
        //while (i < 10)
        //    if (i % 2 == 0)
        //        System.out.println("b: " + i++);

        // (c) - 10 times
        i = 1;
        while (i < 10)
            if ((i++) % 2 == 0)
                System.out.println(i);
    }

    // 5.2.3 What is the output of the following code? Explain the reason.
    // loops until integer overflow
    static void loop3() {
        int x = 80000000;

        while (x > 0)
            x++;

        System.out.println("x is " + x);
    }


    public static void main(String[] args) {
        loop3();
    }
}
