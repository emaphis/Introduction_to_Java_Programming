/*
 * Check Point 5.9
 * Nested Loops
 */
package chapter05.check_point;

/**
 * @author emaph
 */
public class CheckPoint05_09 {

    // 5.9.1 How many times is the println statement executed?
    // a. 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
    static void loop1() {
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < i; j++)
                System.out.println(i * j);
    }



    // 5.9.2 Show the output of the following programs. (Hint: Draw a table and list the vari-
    //       ables in the columns to trace these programs.)

    // (a)
    static void loop2_a() {
        for (int i = 1; i < 5; i++) {
        int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
        }
    }
    // 0 0 1 0 1 2 0 1 2 3
    //  i  j
    // ------
    //  1  0
    //  2  0
    //  2  1
    //  3  0
    //  3  1
    //  3  2
    //  4  0
    //  4  1
    //  4  2
    //  4  3

    // (b)
    static void loop2_b() {
        int i = 0;
        while (i < 5) {
            for (int j = i; j > 1; j--)
                System.out.print(j + " ");
            System.out.println("****");
            i++;
        }
    }
    // ****
    // ****
    // 2 ****
    // 3 2 ****
    // 4 3 2 ****

    //  i  j
    // ------
    //  1  1
    //  2  2
    //  2  1
    //  3  3
    //  3  2
    //  3  1
    //  4  4
    //  4  3
    //  4  2
    //  4  1

    // (c)
    static void loop2_c() {
        int i = 5;
        while (i >= 1) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "xxx");
                num *= 2;
            }

            System.out.println();
            i--;
        }
    }
    // 1xxx2xxx4xxx8xxx16xxx
    // 1xxx2xxx4xxx8xxx
    // 1xxx2xxx4xxx
    // 1xxx2xxx
    // 1xxx

    //  i  num  j
    // ------------
    //  5   1   1
    //  5   2   2
    //  5   4   3
    //  5   8   4
    //  5  16   5
    //  4   1   1
    //  4   2   2
    //  4   4   3
    //  4   8   4
    //  3   1   1
    //  3   2   2
    //  3   4   3
    //  2   1   1
    //  2   2   2
    //  1   1   1

    // (d)
    static void loop2_d() {
        int i = 1;
        do {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                //System.out.print(num + "G");
                System.out.println(i + " " + num + " " + j);
                num += 2;
            }

                //System.out.println();
                i++;
        } while (i <= 5);
    }
    // 1G
    // 1G3G
    // 1G3G5G
    // 1G3G5G7G
    // 1G3G5G7G9G

    //  i  num  j
    // ------------
    //  1   1   1
    //  2   1   1
    //  2   3   2
    //  3   1   1
    //  3   3   2
    //  3   5   3
    //  4   1   1
    //  4   3   2
    //  4   5   3
    //  4   7   4
    //  5   1   1
    //  5   3   2
    //  5   5   3
    //  5   7   4
    //  5   9   5

    
    public static void main(String args[]) {
        //loop1();
        loop2_d();
    }
}
