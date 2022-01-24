/*
 *  Check Point 3.4
 */
package chapter03.check_point;

/**
 * Two-Way if-else Statements
 *
 * @author emaph
 */
public class CheckPoint03_04 {

    // 3.4.1  Write an if statement that increases pay by 3% if score is greater than 90, oth-
    //           erwise increases pay by 1%.
    static void ifStatement1() {
        int score = 90;
        double pay = 100;

        if (score > 90) {
            pay += pay * 0.03;
        } else {
            pay += pay * 0.01;
        }

        System.out.println("pay: " + pay);
    }

    // 3.4.2   What is the output of the code in (a) and (b) if number is 30? What if number is 35?
    static void ifStatement2() {
        int number = 35;

        // a
        if (number % 2 == 0) {
            System.out.println(number
                    + " is even.");
        }
        System.out.println(number
                + " is odd");

        // b
        if (number % 2 == 0) {
            System.out.println(number
                    +  " is even.");
        } else {
            System.out.println(number
                    + " is odd");
        }

    }

    public static void main(String[] args) {
        ifStatement2();
    }
}
