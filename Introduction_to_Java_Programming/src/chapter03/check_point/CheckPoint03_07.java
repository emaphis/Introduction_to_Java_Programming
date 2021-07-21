/*
 *  Check Point 3.7.
 */
package chapter03.check_point;

/**
 * Generating Random Numbers
 * @author emaph
 */
public class CheckPoint03_07 {
    // Which of the following is a possible output from invoking Math.random()?
    // 323.4, 0.5, 34, 1.0, 0.0, 0.234
    // a. 0.5 0.0 0.234

    // 3.7.2
    static void generate() {
        // a. How do you generate a random integer i such that 0 … i 6 20?
        int a = (int) (Math.random() * 20);

        // b. How do you generate a random integer i such that 10 … i 6 20?
        int b = (int)(Math.random() * 10) + 10;

        // c. How do you generate a random integer i such that 10 … i … 50?
        int c = (int)(Math.random() * 41) + 10;

        // d. Write an expression that returns 0 or 1 random
        int d = (int) (Math.random() * 2);

        System.out.println(a + " " + b + " " + c  + " " + d);
    }

    public static void main(String[] args) {
        generate();
    }
}
