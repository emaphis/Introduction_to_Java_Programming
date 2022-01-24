/*
 * Check Point 3.15
 * Operator Precedence and Associativity
 */
package chapter03.check_point;

/**
 * Precedence
 * v++ v--
 * + -u ++v --v
 * (type) casting
 * !not
 * *, /, %
 * +,-
 * <, <=, >, >=
 * ==, !=
 * ^
 * &&
 * ||
 * ?:
 * =, +=, -=, *=, /=, %=
 * @author emaph
 */
public class CheckPoint03_15 {
    // 3.15.1
    // List the precedence order of the Boolean operators. Evaluate the following expressions:
    // precdence: !, ^, &&, ||
    static void expression1() {
        // true || true && false  = true
        boolean b1 = true || (true && false);

        // true && true || false  = true
        boolean b2 = (true && true) || false;

        System.out.println(b1 + " " + b2);
    }

    // 3.15.2  True or false? All the binary operators except = are left associative.
    // a. true

    // 3.15.3  Evaluate the following expressions:
    static void expression3() {
        boolean b1 = 2 * 2 - 3 > 2 && 4 - 2 > 5;  // false
        boolean b2 = 2 * 2 - 3 > 2 || 4 - 2 > 5;  // false
        System.out.println(b1 + " " + b2);
    }

    // 3.15.4
    // Is (x > 0 && x < 10) the same as ((x > 0) && (x < 10))?
    //  a. yes
    // Is (x > 0 || x < 10) the same as ((x > 0) || (x < 10))?
    //  a. yes
    // Is (x > 0 || x < 10 && y < 0) the same as (x > 0 ||(x < 10 && y < 0))?
    //  a. yes


    public static void main(String args[]) {
        expression3();
    }
}
