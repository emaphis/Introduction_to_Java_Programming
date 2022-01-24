
package chapter02.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint02_10 {

    // 2.10.1 How many accurate digits are stored in a float or double type variable?
    //  float have 7 to 8 significant digits.
    //  double have 15 to 17 significant digits.

    // 2.10.2 Which of the following are correct literals for floating-point numbers?
    static void literalls() {
        double d1 = 12.3;
        double d2 = 12.3e+2;
        double d3 = 23.4e-2;
        double d4 = -334.4;
        double d5 = 20.5;
        double d6 = 39F;
        double d7 = 40D;
        System.out.println(d1 + " " + d2 + " " + d3 + " "  + d4 + " " + d5 + " " + d6 + " " + d7 + "\n");
    }

    // 2.10.3 Which of the following are the same as 52.534?
    static void same() {
        double d1 = 52.534;
        double d2 = 5.2534e+1;
        double d3 = 0.52534e+2;
        double d4 = 525.34e-1;
        double d5 = 5.2534e+0;  // not the same.
        System.out.println(d1 + " " + d2 + " " + d3 + " "  + d4 + " " + d5 + "\n");
    }

    // 2.10.4 Which of the following are correct literals?
    static void correct() {
        double d1 = 5_2534e+1;
        //int i2 = _2534;  // incorrect
        int i3 = 5_2;
       // int i4 = 5_;  // incorrect
        System.out.println( d1 + " " + i3 + "\n");
    }

    public static void main(String[] args) {
        literalls();
        same();
        correct();
    }
}
