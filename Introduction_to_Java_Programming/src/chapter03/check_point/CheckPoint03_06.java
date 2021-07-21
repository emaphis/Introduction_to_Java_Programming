/*
 *  Check Point 3.6
 */
package chapter03.check_point;

/**
 * Common Errors and Pitfalls
 * @author emaph
 */
public class CheckPoint03_06 {
    // 3.6.1 Which of the following statements are equivalent? Which ones are correctly indented?
    // a, c, d are the same logic
    // b, c are indented right.
    static int i = 1;
    static int j = 1;
    static int k = 1;
    static int x = 2;
    static int y = 2;
    static int z = 2;

    static void a() {
        if (i > 0) if
        (j > 0)
        x = 0; else
        if (k > 0) y = 0;
        else z = 0;
    }

    static void b() {
        if (i > 0) {
            if (j > 0)
                x = 0;
            else if (k > 0)
                y = 0;
        }
        else
            z = 0;
    }

    static void c() {
        if (i > 0)
            if (j > 0)
              x = 0;
            else if (k > 0)
              y = 0;
            else
              z = 0;
    }

    static void d() {
        if (i > 0)
            if (j > 0)
              x = 0;
            else if (k > 0)
              y = 0;
          else
            z = 0;
    }

    static void print() {
        //System.out.println("i:" + i + ", j:" + j + ", k:" + k);
        System.out.println("x:" + x + ", y:" + y + ", z:" + z);
        System.out.println();
    }

    static void test_3_6_1() {
        a();
        print();
        b();
        print();
        c();
        print();
        d();
        print();
    }


    // 3.6.2
    //  Rewrite the following statement using a Boolean expression:
    //if (count % 10 == 0)
    //  newLine = true;
    //else
    //  newLine = false;
    static void expression2() {
        int count = 5;
        boolean newline =  count % 10 == 0;
        System.out.println("newline: " + newline);
    }

    // Are the following statements correct? Which one is better?
    //  a. both are correct.  (a) is less complicated.
    static void expression3() {
        int age = 25;

        // (a)
        if (age < 16)
          System.out.println
            ("Cannot get a driver's license");
        if (age >= 16)
          System.out.println
            ("Can get a driver's license");

        // (b)
        if (age < 16)
          System.out.println
            ("Cannot get a driver's license");
        else
          System.out.println
            ("Can get a driver's license");
    }


    // 3.6.4
    // What is the output of the following code if number is 14, 15, or 30?
    // 14:
    //   14 is even
    //   14 is even

    // 15:
    //   15 is multiple of 5
    //   15 is multiple of 5

    // 30:
    //   30 is even
    //   30 is multiple of 5
    //   30 is even

    // (a) is more accureate

    static void expression4() {
        int number = 30;

    // (a)
        if (number % 2 == 0)
          System.out.println
            (number + " is even");
        if (number % 5 == 0)
          System.out.println
            (number + " is multiple of 5");

        System.out.println();
    // (b)
        if (number % 2 == 0)
          System.out.println
            (number + " is even");
        else if (number % 5 == 0)
          System.out.println
            (number + " is multiple of 5");
    }

    
    public static void main(String[] args) {
        //test_3_6_1();
        //expression2();
        expression4();
    }
}
