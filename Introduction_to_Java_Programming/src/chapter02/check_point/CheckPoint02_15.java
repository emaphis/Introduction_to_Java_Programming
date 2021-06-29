/*
 * Check Point 15.
 */
package chapter02.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint02_15 {

    // 2.15.1 Which of these statements are true?
    //           a. Any expression can be used as a statement.
    // fakse
    //           b. The expression x++ can be used as a statement.
    // true
    //           c. The statement x = x + 5 is also an expression.
    // true
    //           d. The statement x = y = x = 0 is illegal
    // false

    public static void main(String[] args) {
        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }

}
