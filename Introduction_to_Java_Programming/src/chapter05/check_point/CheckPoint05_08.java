/*
 * Check Point 5.8
 * Which loop tp use
 */
package chapter05.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint05_08 {

    // 5.8.1 Can you convert a for loop to a while loop? List the advantages of using for
    //       loops.
    // a. You can covert a for loop to a while loop.
    //  for loops have all of thier control steaments in on locations, for loops
    // are best fo loops wiht a knowm number of iterations

    // 5.8.2 Can you always convert a while loop into a for loop? Convert the following
    //       while loop into a for loop:
    static void loop2() {
        int i = 1;
        int sum = 0;
        while (sum < 10000) {
            sum = sum + i;
            i++;
        }

        System.out.println("sum: " + sum);

        // for loop
        sum = 0;
        for (int j = 1; sum < 10000; j++) {
            sum = sum + j;
        }

        System.out.println("sum: " + sum);
        // sum: 10011
    }

    // 5.8.3 Identify and fix the errors in the following code:
    static void test() {
        int sum = 0;                  // add declaratin
        for (int i = 0; i < 10; i++)  // remove ;
            sum += i;

        int i = 1, j = 2;             // add declarations
        if (i < j)                    // remove ;
            System.out.println(i);    // add ;
        else
            System.out.println(j);

        j = 0;                        // add initialization
        while (j < 10)                // remove ;
        {
            j++;
        }

        j = 0;                        // add initialization
        do {
            j++;
        } while (j < 10);             // add ;
    }

    // 5.8.4 What is wrong with the following programs?
    static void main1() {
        int i = 0;
        do {
            System.out.println(i + 4);
            i++;

        } while (i < 10);   // misplaced }, missing ;
    }

    static void main2() {
        for (int i = 0; i < 10; i++)    // remove ;
            System.out.println(i + 4);
    }


    public static void main(String args[]) {
        //loop2();
        main2();
    }
}
