/*
 * Check Point 6.5
 * 6.5 Passing Arguments by Values
 */
package chapter06.check_point;

/**
 * @author emaph
 */
public class CheckPoint06_05 {
    // 6.5.1 How is an argument passed to a method? Can the argument have the same name as
    //       its parameter?

    // a. Arguements are passed by value. A copy is made to the address space
    //    of the fucntion. Arguements are passed by type and order.
    //    Yes. Since parameter are passed by value.


    // 6.5.2 Identify and correct the errors in the following program:

    public static void main2() {
      nPrintln("Welcome to Java!", 5);  // parameters are in the wrong order
    }

    public static void nPrintln(String message, int n) {
        //int n2 = 1;   // n is already defined and unsued
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }


    // 6.5.3 What is pass-by-value? Show the result of the following programs.
    // a. When parameters are passed by a copy of the value.

    // (a) max_a -> 0

    // (b) max_b ->
    // 2
    //  2 4
    //  2 4 8
    //  2 4 8 16
    //  2 4 8 16 32
    //  2 4 8 16 32 64

    // (c) method1 ->
    // Before the call, variable times is 3
    // n = 3
    // Welcome to Java!
    // n = 2
    // Welcome to Java!
    // n = 1
    // Welcome to Java!
    // After the call, variable times is 3

    // (d)
    //  1
    //  2 1
    //  2 1
    //  4 2 1
    //  i is 5


    // 6.5.4 For (a) in the preceding question, show the contents of the activation records in the
    //       call stack just before the method max is invoked, just as max is entered, just before
    //       max is returned, and right after max is returned.


    // (a)
    public static void main4_a() {
        int max = 0;
        max_a(1, 2, max);
        System.out.println(max);
    }

    public static void max_a(int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
    }



    // (b)
    public static void main4_b() {
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }
    }

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }

        System.out.println();
    }


    // (c)
    public static void main4_c() {
        // Initialize times
        int times = 3;
        System.out.println("Before the call,"
            + " variable times is " + times);

        // Invoke nPrintln and display times
        nPrintln2("Welcome to Java!", times);
        System.out.println("After the call,"
            + " variable times is " + times);
    }

    // Print the message n times
    public static void nPrintln2(String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }

    // (d)
    public static void main4_d() {
        int i = 0;
        while (i <= 4) {
            method2(i);
            i++;
        }

        System.out.println("i is " + i);
    }

    public static void method2(int i) {
        do {
            if (i % 3 != 0)
                System.out.print(i + " ");
            i--;
        }
        while (i >= 1);

        System.out.println();
    }


    public static void main(String[] args) {
        main4_d();
    }
}
